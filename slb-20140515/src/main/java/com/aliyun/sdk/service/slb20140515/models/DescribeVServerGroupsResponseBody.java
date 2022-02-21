// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVServerGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVServerGroupsResponseBody</p>
 */
public class DescribeVServerGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VServerGroups")
    private VServerGroups VServerGroups;

    private DescribeVServerGroupsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.VServerGroups = builder.VServerGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVServerGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return VServerGroups
     */
    public VServerGroups getVServerGroups() {
        return this.VServerGroups;
    }

    public static final class Builder {
        private String requestId; 
        private VServerGroups VServerGroups; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VServerGroups.
         */
        public Builder VServerGroups(VServerGroups VServerGroups) {
            this.VServerGroups = VServerGroups;
            return this;
        }

        public DescribeVServerGroupsResponseBody build() {
            return new DescribeVServerGroupsResponseBody(this);
        } 

    } 

    public static class Listener extends TeaModel {
        @NameInMap("Port")
        private Integer port;

        @NameInMap("Protocol")
        private String protocol;

        private Listener(Builder builder) {
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Listener create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private Integer port; 
            private String protocol; 

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public Listener build() {
                return new Listener(this);
            } 

        } 

    }
    public static class Listeners extends TeaModel {
        @NameInMap("Listener")
        private java.util.List < Listener> listener;

        private Listeners(Builder builder) {
            this.listener = builder.listener;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Listeners create() {
            return builder().build();
        }

        /**
         * @return listener
         */
        public java.util.List < Listener> getListener() {
            return this.listener;
        }

        public static final class Builder {
            private java.util.List < Listener> listener; 

            /**
             * Listener.
             */
            public Builder listener(java.util.List < Listener> listener) {
                this.listener = listener;
                return this;
            }

            public Listeners build() {
                return new Listeners(this);
            } 

        } 

    }
    public static class Rule extends TeaModel {
        @NameInMap("Domain")
        private String domain;

        @NameInMap("RuleId")
        private String ruleId;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("Url")
        private String url;

        private Rule(Builder builder) {
            this.domain = builder.domain;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rule create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
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
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String domain; 
            private String ruleId; 
            private String ruleName; 
            private String url; 

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
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
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Rule build() {
                return new Rule(this);
            } 

        } 

    }
    public static class Rules extends TeaModel {
        @NameInMap("Rule")
        private java.util.List < Rule> rule;

        private Rules(Builder builder) {
            this.rule = builder.rule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return rule
         */
        public java.util.List < Rule> getRule() {
            return this.rule;
        }

        public static final class Builder {
            private java.util.List < Rule> rule; 

            /**
             * Rule.
             */
            public Builder rule(java.util.List < Rule> rule) {
                this.rule = rule;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    public static class AssociatedObjects extends TeaModel {
        @NameInMap("Listeners")
        private Listeners listeners;

        @NameInMap("Rules")
        private Rules rules;

        private AssociatedObjects(Builder builder) {
            this.listeners = builder.listeners;
            this.rules = builder.rules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssociatedObjects create() {
            return builder().build();
        }

        /**
         * @return listeners
         */
        public Listeners getListeners() {
            return this.listeners;
        }

        /**
         * @return rules
         */
        public Rules getRules() {
            return this.rules;
        }

        public static final class Builder {
            private Listeners listeners; 
            private Rules rules; 

            /**
             * Listeners.
             */
            public Builder listeners(Listeners listeners) {
                this.listeners = listeners;
                return this;
            }

            /**
             * Rules.
             */
            public Builder rules(Rules rules) {
                this.rules = rules;
                return this;
            }

            public AssociatedObjects build() {
                return new AssociatedObjects(this);
            } 

        } 

    }
    public static class VServerGroup extends TeaModel {
        @NameInMap("AssociatedObjects")
        private AssociatedObjects associatedObjects;

        @NameInMap("ServerCount")
        private Long serverCount;

        @NameInMap("VServerGroupId")
        private String VServerGroupId;

        @NameInMap("VServerGroupName")
        private String VServerGroupName;

        private VServerGroup(Builder builder) {
            this.associatedObjects = builder.associatedObjects;
            this.serverCount = builder.serverCount;
            this.VServerGroupId = builder.VServerGroupId;
            this.VServerGroupName = builder.VServerGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VServerGroup create() {
            return builder().build();
        }

        /**
         * @return associatedObjects
         */
        public AssociatedObjects getAssociatedObjects() {
            return this.associatedObjects;
        }

        /**
         * @return serverCount
         */
        public Long getServerCount() {
            return this.serverCount;
        }

        /**
         * @return VServerGroupId
         */
        public String getVServerGroupId() {
            return this.VServerGroupId;
        }

        /**
         * @return VServerGroupName
         */
        public String getVServerGroupName() {
            return this.VServerGroupName;
        }

        public static final class Builder {
            private AssociatedObjects associatedObjects; 
            private Long serverCount; 
            private String VServerGroupId; 
            private String VServerGroupName; 

            /**
             * AssociatedObjects.
             */
            public Builder associatedObjects(AssociatedObjects associatedObjects) {
                this.associatedObjects = associatedObjects;
                return this;
            }

            /**
             * ServerCount.
             */
            public Builder serverCount(Long serverCount) {
                this.serverCount = serverCount;
                return this;
            }

            /**
             * VServerGroupId.
             */
            public Builder VServerGroupId(String VServerGroupId) {
                this.VServerGroupId = VServerGroupId;
                return this;
            }

            /**
             * VServerGroupName.
             */
            public Builder VServerGroupName(String VServerGroupName) {
                this.VServerGroupName = VServerGroupName;
                return this;
            }

            public VServerGroup build() {
                return new VServerGroup(this);
            } 

        } 

    }
    public static class VServerGroups extends TeaModel {
        @NameInMap("VServerGroup")
        private java.util.List < VServerGroup> VServerGroup;

        private VServerGroups(Builder builder) {
            this.VServerGroup = builder.VServerGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VServerGroups create() {
            return builder().build();
        }

        /**
         * @return VServerGroup
         */
        public java.util.List < VServerGroup> getVServerGroup() {
            return this.VServerGroup;
        }

        public static final class Builder {
            private java.util.List < VServerGroup> VServerGroup; 

            /**
             * VServerGroup.
             */
            public Builder VServerGroup(java.util.List < VServerGroup> VServerGroup) {
                this.VServerGroup = VServerGroup;
                return this;
            }

            public VServerGroups build() {
                return new VServerGroups(this);
            } 

        } 

    }
}
