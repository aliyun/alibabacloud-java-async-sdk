// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetRuleResponseBody</p>
 */
public class GetRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Rule")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Rule.
         */
        public Builder rule(Rule rule) {
            this.rule = rule;
            return this;
        }

        public GetRuleResponseBody build() {
            return new GetRuleResponseBody(this);
        } 

    } 

    public static class DatabaseAccounts extends TeaModel {
        @NameInMap("DatabaseAccountId")
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
             * DatabaseAccountId.
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
    public static class Databases extends TeaModel {
        @NameInMap("DatabaseAccounts")
        private java.util.List < DatabaseAccounts> databaseAccounts;

        @NameInMap("DatabaseId")
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
             * DatabaseAccounts.
             */
            public Builder databaseAccounts(java.util.List < DatabaseAccounts> databaseAccounts) {
                this.databaseAccounts = databaseAccounts;
                return this;
            }

            /**
             * DatabaseId.
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
    public static class HostGroups extends TeaModel {
        @NameInMap("HostAccountNames")
        private java.util.List < String > hostAccountNames;

        @NameInMap("HostGroupId")
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
             * HostAccountNames.
             */
            public Builder hostAccountNames(java.util.List < String > hostAccountNames) {
                this.hostAccountNames = hostAccountNames;
                return this;
            }

            /**
             * HostGroupId.
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
    public static class HostAccounts extends TeaModel {
        @NameInMap("HostAccountId")
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
             * HostAccountId.
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
    public static class Hosts extends TeaModel {
        @NameInMap("HostAccounts")
        private java.util.List < HostAccounts> hostAccounts;

        @NameInMap("HostId")
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
             * HostAccounts.
             */
            public Builder hostAccounts(java.util.List < HostAccounts> hostAccounts) {
                this.hostAccounts = hostAccounts;
                return this;
            }

            /**
             * HostId.
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
    public static class UserGroups extends TeaModel {
        @NameInMap("UserGroupId")
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
             * UserGroupId.
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
    public static class Users extends TeaModel {
        @NameInMap("UserId")
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
             * UserId.
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
    public static class Rule extends TeaModel {
        @NameInMap("Comment")
        private String comment;

        @NameInMap("Databases")
        private java.util.List < Databases> databases;

        @NameInMap("EffectiveEndTime")
        private String effectiveEndTime;

        @NameInMap("EffectiveStartTime")
        private String effectiveStartTime;

        @NameInMap("HostGroups")
        private java.util.List < HostGroups> hostGroups;

        @NameInMap("Hosts")
        private java.util.List < Hosts> hosts;

        @NameInMap("RuleId")
        private String ruleId;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("UserGroups")
        private java.util.List < UserGroups> userGroups;

        @NameInMap("Users")
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
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * Databases.
             */
            public Builder databases(java.util.List < Databases> databases) {
                this.databases = databases;
                return this;
            }

            /**
             * EffectiveEndTime.
             */
            public Builder effectiveEndTime(String effectiveEndTime) {
                this.effectiveEndTime = effectiveEndTime;
                return this;
            }

            /**
             * EffectiveStartTime.
             */
            public Builder effectiveStartTime(String effectiveStartTime) {
                this.effectiveStartTime = effectiveStartTime;
                return this;
            }

            /**
             * HostGroups.
             */
            public Builder hostGroups(java.util.List < HostGroups> hostGroups) {
                this.hostGroups = hostGroups;
                return this;
            }

            /**
             * Hosts.
             */
            public Builder hosts(java.util.List < Hosts> hosts) {
                this.hosts = hosts;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * UserGroups.
             */
            public Builder userGroups(java.util.List < UserGroups> userGroups) {
                this.userGroups = userGroups;
                return this;
            }

            /**
             * Users.
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
