package com.cisco.la.model;

public class RoleModel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.la_role.rl_name
     *
     * @mbg.generated Tue Jan 09 17:12:26 CST 2018
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.la_role.rl_bu
     *
     * @mbg.generated Tue Jan 09 17:12:26 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.la_role.rl_title
     *
     * @mbg.generated Tue Jan 09 17:12:26 CST 2018
     */
    private String budget;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.la_role.rl_grade
     *
     * @mbg.generated Tue Jan 09 17:12:26 CST 2018
     */
    private String balance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.la_role.rl_active
     *
     * @mbg.generated Tue Jan 09 17:12:26 CST 2018
     */
    private Boolean bu;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.la_role.rl_name
     *
     * @return the value of public.la_role.rl_name
     *
     * @mbg.generated Tue Jan 09 17:12:26 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.la_role.rl_name
     *
     * @param id the value for public.la_role.rl_name
     *
     * @mbg.generated Tue Jan 09 17:12:26 CST 2018
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.la_role.rl_bu
     *
     * @return the value of public.la_role.rl_bu
     *
     * @mbg.generated Tue Jan 09 17:12:26 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.la_role.rl_bu
     *
     * @param name the value for public.la_role.rl_bu
     *
     * @mbg.generated Tue Jan 09 17:12:26 CST 2018
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.la_role.rl_title
     *
     * @return the value of public.la_role.rl_title
     *
     * @mbg.generated Tue Jan 09 17:12:26 CST 2018
     */
    public String getBudget() {
        return budget;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.la_role.rl_title
     *
     * @param budget the value for public.la_role.rl_title
     *
     * @mbg.generated Tue Jan 09 17:12:26 CST 2018
     */
    public void setBudget(String budget) {
        this.budget = budget;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.la_role.rl_grade
     *
     * @return the value of public.la_role.rl_grade
     *
     * @mbg.generated Tue Jan 09 17:12:26 CST 2018
     */
    public String getBalance() {
        return balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.la_role.rl_grade
     *
     * @param balance the value for public.la_role.rl_grade
     *
     * @mbg.generated Tue Jan 09 17:12:26 CST 2018
     */
    public void setBalance(String balance) {
        this.balance = balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.la_role.rl_active
     *
     * @return the value of public.la_role.rl_active
     *
     * @mbg.generated Tue Jan 09 17:12:26 CST 2018
     */
    public Boolean getBu() {
        return bu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.la_role.rl_active
     *
     * @param bu the value for public.la_role.rl_active
     *
     * @mbg.generated Tue Jan 09 17:12:26 CST 2018
     */
    public void setBu(Boolean bu) {
        this.bu = bu;
    }
}