// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetRuleResponseBody</p>
 */
public class GetRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rule")
    private Rule rule;

    private GetRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.rule = builder.rule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rule
     */
    public Rule getRule() {
        return this.rule;
    }

    public static final class Builder {
        private String requestId; 
        private Rule rule; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned information about the authorization rule.</p>
         */
        public Builder rule(Rule rule) {
            this.rule = rule;
            return this;
        }

        public GetRuleResponseBody build() {
            return new GetRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleResponseBody</p>
     */
    public static class DatabaseAccounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseAccountId")
        private String databaseAccountId;

        private DatabaseAccounts(Builder builder) {
            this.databaseAccountId = builder.databaseAccountId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabaseAccounts create() {
            return builder().build();
        }

        /**
         * @return databaseAccountId
         */
        public String getDatabaseAccountId() {
            return this.databaseAccountId;
        }

        public static final class Builder {
            private String databaseAccountId; 

            /**
             * <p>The ID of the database account that the policy authorizes users to manage.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder databaseAccountId(String databaseAccountId) {
                this.databaseAccountId = databaseAccountId;
                return this;
            }

            public DatabaseAccounts build() {
                return new DatabaseAccounts(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleResponseBody</p>
     */
    public static class Databases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseAccounts")
        private java.util.List < DatabaseAccounts> databaseAccounts;

        @com.aliyun.core.annotation.NameInMap("DatabaseId")
        private String databaseId;

        private Databases(Builder builder) {
            this.databaseAccounts = builder.databaseAccounts;
            this.databaseId = builder.databaseId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Databases create() {
            return builder().build();
        }

        /**
         * @return databaseAccounts
         */
        public java.util.List < DatabaseAccounts> getDatabaseAccounts() {
            return this.databaseAccounts;
        }

        /**
         * @return databaseId
         */
        public String getDatabaseId() {
            return this.databaseId;
        }

        public static final class Builder {
            private java.util.List < DatabaseAccounts> databaseAccounts; 
            private String databaseId; 

            /**
             * <p>The database accounts on which permissions are granted by using the authorization rule.</p>
             */
            public Builder databaseAccounts(java.util.List < DatabaseAccounts> databaseAccounts) {
                this.databaseAccounts = databaseAccounts;
                return this;
            }

            /**
             * <p>The ID of the database that the policy authorizes users to manage.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder databaseId(String databaseId) {
                this.databaseId = databaseId;
                return this;
            }

            public Databases build() {
                return new Databases(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleResponseBody</p>
     */
    public static class HostGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HostAccountNames")
        private java.util.List < String > hostAccountNames;

        @com.aliyun.core.annotation.NameInMap("HostGroupId")
        private String hostGroupId;

        private HostGroups(Builder builder) {
            this.hostAccountNames = builder.hostAccountNames;
            this.hostGroupId = builder.hostGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostGroups create() {
            return builder().build();
        }

        /**
         * @return hostAccountNames
         */
        public java.util.List < String > getHostAccountNames() {
            return this.hostAccountNames;
        }

        /**
         * @return hostGroupId
         */
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        public static final class Builder {
            private java.util.List < String > hostAccountNames; 
            private String hostGroupId; 

            /**
             * <p>The asset accounts on which permissions are granted by using the authorization rule.</p>
             */
            public Builder hostAccountNames(java.util.List < String > hostAccountNames) {
                this.hostAccountNames = hostAccountNames;
                return this;
            }

            /**
             * <p>The ID of the asset group that the policy authorizes users to manage.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder hostGroupId(String hostGroupId) {
                this.hostGroupId = hostGroupId;
                return this;
            }

            public HostGroups build() {
                return new HostGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleResponseBody</p>
     */
    public static class HostAccounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HostAccountId")
        private String hostAccountId;

        private HostAccounts(Builder builder) {
            this.hostAccountId = builder.hostAccountId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostAccounts create() {
            return builder().build();
        }

        /**
         * @return hostAccountId
         */
        public String getHostAccountId() {
            return this.hostAccountId;
        }

        public static final class Builder {
            private String hostAccountId; 

            /**
             * <p>The ID of the host account that the policy authorizes users to manage.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder hostAccountId(String hostAccountId) {
                this.hostAccountId = hostAccountId;
                return this;
            }

            public HostAccounts build() {
                return new HostAccounts(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleResponseBody</p>
     */
    public static class Hosts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HostAccounts")
        private java.util.List < HostAccounts> hostAccounts;

        @com.aliyun.core.annotation.NameInMap("HostId")
        private String hostId;

        private Hosts(Builder builder) {
            this.hostAccounts = builder.hostAccounts;
            this.hostId = builder.hostId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hosts create() {
            return builder().build();
        }

        /**
         * @return hostAccounts
         */
        public java.util.List < HostAccounts> getHostAccounts() {
            return this.hostAccounts;
        }

        /**
         * @return hostId
         */
        public String getHostId() {
            return this.hostId;
        }

        public static final class Builder {
            private java.util.List < HostAccounts> hostAccounts; 
            private String hostId; 

            /**
             * <p>The host accounts that the policy authorizes users to manage.</p>
             */
            public Builder hostAccounts(java.util.List < HostAccounts> hostAccounts) {
                this.hostAccounts = hostAccounts;
                return this;
            }

            /**
             * <p>The ID of the host that the policy authorizes users to manage.</p>
             * 
             * <strong>example:</strong>
             * <p>52</p>
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            public Hosts build() {
                return new Hosts(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleResponseBody</p>
     */
    public static class UserGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserGroupId")
        private String userGroupId;

        private UserGroups(Builder builder) {
            this.userGroupId = builder.userGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserGroups create() {
            return builder().build();
        }

        /**
         * @return userGroupId
         */
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public static final class Builder {
            private String userGroupId; 

            /**
             * <p>The ID of the authorized user group.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder userGroupId(String userGroupId) {
                this.userGroupId = userGroupId;
                return this;
            }

            public UserGroups build() {
                return new UserGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleResponseBody</p>
     */
    public static class Users extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Users(Builder builder) {
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String userId; 

            /**
             * <p>The ID of the authorized user.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleResponseBody</p>
     */
    public static class Rule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("Databases")
        private java.util.List < Databases> databases;

        @com.aliyun.core.annotation.NameInMap("EffectiveEndTime")
        private String effectiveEndTime;

        @com.aliyun.core.annotation.NameInMap("EffectiveStartTime")
        private String effectiveStartTime;

        @com.aliyun.core.annotation.NameInMap("HostGroups")
        private java.util.List < HostGroups> hostGroups;

        @com.aliyun.core.annotation.NameInMap("Hosts")
        private java.util.List < Hosts> hosts;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("UserGroups")
        private java.util.List < UserGroups> userGroups;

        @com.aliyun.core.annotation.NameInMap("Users")
        private java.util.List < Users> users;

        private Rule(Builder builder) {
            this.comment = builder.comment;
            this.databases = builder.databases;
            this.effectiveEndTime = builder.effectiveEndTime;
            this.effectiveStartTime = builder.effectiveStartTime;
            this.hostGroups = builder.hostGroups;
            this.hosts = builder.hosts;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.userGroups = builder.userGroups;
            this.users = builder.users;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rule create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return databases
         */
        public java.util.List < Databases> getDatabases() {
            return this.databases;
        }

        /**
         * @return effectiveEndTime
         */
        public String getEffectiveEndTime() {
            return this.effectiveEndTime;
        }

        /**
         * @return effectiveStartTime
         */
        public String getEffectiveStartTime() {
            return this.effectiveStartTime;
        }

        /**
         * @return hostGroups
         */
        public java.util.List < HostGroups> getHostGroups() {
            return this.hostGroups;
        }

        /**
         * @return hosts
         */
        public java.util.List < Hosts> getHosts() {
            return this.hosts;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return userGroups
         */
        public java.util.List < UserGroups> getUserGroups() {
            return this.userGroups;
        }

        /**
         * @return users
         */
        public java.util.List < Users> getUsers() {
            return this.users;
        }

        public static final class Builder {
            private String comment; 
            private java.util.List < Databases> databases; 
            private String effectiveEndTime; 
            private String effectiveStartTime; 
            private java.util.List < HostGroups> hostGroups; 
            private java.util.List < Hosts> hosts; 
            private String ruleId; 
            private String ruleName; 
            private java.util.List < UserGroups> userGroups; 
            private java.util.List < Users> users; 

            /**
             * <p>The remarks of the authorization rule.</p>
             * 
             * <strong>example:</strong>
             * <p>comment</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The databases on which permissions are granted by using the authorization rule.</p>
             */
            public Builder databases(java.util.List < Databases> databases) {
                this.databases = databases;
                return this;
            }

            /**
             * <p>The end time of the validity period of the authorization rule. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1698720972</p>
             */
            public Builder effectiveEndTime(String effectiveEndTime) {
                this.effectiveEndTime = effectiveEndTime;
                return this;
            }

            /**
             * <p>The start time of the validity period of the authorization rule. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1687140883</p>
             */
            public Builder effectiveStartTime(String effectiveStartTime) {
                this.effectiveStartTime = effectiveStartTime;
                return this;
            }

            /**
             * <p>The asset groups on which permissions are granted by using the authorization rule.</p>
             */
            public Builder hostGroups(java.util.List < HostGroups> hostGroups) {
                this.hostGroups = hostGroups;
                return this;
            }

            /**
             * <p>The information about the hosts that the policy authorizes users to manage.</p>
             */
            public Builder hosts(java.util.List < Hosts> hosts) {
                this.hosts = hosts;
                return this;
            }

            /**
             * <p>The ID of the authorization rule.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the authorization rule.</p>
             * 
             * <strong>example:</strong>
             * <p>rule</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The authorized user groups.</p>
             */
            public Builder userGroups(java.util.List < UserGroups> userGroups) {
                this.userGroups = userGroups;
                return this;
            }

            /**
             * <p>The authorized users.</p>
             */
            public Builder users(java.util.List < Users> users) {
                this.users = users;
                return this;
            }

            public Rule build() {
                return new Rule(this);
            } 

        } 

    }
}
