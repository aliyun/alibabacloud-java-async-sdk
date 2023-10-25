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
    private VServerGroups vServerGroups;

    private DescribeVServerGroupsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vServerGroups = builder.vServerGroups;
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
     * @return vServerGroups
     */
    public VServerGroups getVServerGroups() {
        return this.vServerGroups;
    }

    public static final class Builder {
        private String requestId; 
        private VServerGroups vServerGroups; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The list of backend servers.
         */
        public Builder vServerGroups(VServerGroups vServerGroups) {
            this.vServerGroups = vServerGroups;
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
             * The listening port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The listening protocol. Valid values: **tcp**, **udp**, **http**, and **https**.
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
             * The requested domain name.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The ID of the forwarding rule.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * The name of the forwarding rule.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * The request path.
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
             * The list of listeners.
             */
            public Builder listeners(Listeners listeners) {
                this.listeners = listeners;
                return this;
            }

            /**
             * The list of forwarding rules.
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
    public static class Tag extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * The tag keys of the resource.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class VServerGroup extends TeaModel {
        @NameInMap("AssociatedObjects")
        private AssociatedObjects associatedObjects;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ServerCount")
        private Long serverCount;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("VServerGroupId")
        private String vServerGroupId;

        @NameInMap("VServerGroupName")
        private String vServerGroupName;

        private VServerGroup(Builder builder) {
            this.associatedObjects = builder.associatedObjects;
            this.createTime = builder.createTime;
            this.serverCount = builder.serverCount;
            this.tags = builder.tags;
            this.vServerGroupId = builder.vServerGroupId;
            this.vServerGroupName = builder.vServerGroupName;
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return serverCount
         */
        public Long getServerCount() {
            return this.serverCount;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return vServerGroupId
         */
        public String getVServerGroupId() {
            return this.vServerGroupId;
        }

        /**
         * @return vServerGroupName
         */
        public String getVServerGroupName() {
            return this.vServerGroupName;
        }

        public static final class Builder {
            private AssociatedObjects associatedObjects; 
            private String createTime; 
            private Long serverCount; 
            private Tags tags; 
            private String vServerGroupId; 
            private String vServerGroupName; 

            /**
             * The items associated with the server groups.
             */
            public Builder associatedObjects(AssociatedObjects associatedObjects) {
                this.associatedObjects = associatedObjects;
                return this;
            }

            /**
             * The time when the CLB instance was created. The time follows the `YYYY-MM-DDThh:mm:ssZ` format.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The number of servers. 
             * <p>
             * 
             * >  The feature corresponding to this parameter is not available by default. If you want to use this feature, [submit a ticket](https://ticket-intl.console.aliyun.com/#/ticket/createIndex).
             */
            public Builder serverCount(Long serverCount) {
                this.serverCount = serverCount;
                return this;
            }

            /**
             * The tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The ID of the server group.
             */
            public Builder vServerGroupId(String vServerGroupId) {
                this.vServerGroupId = vServerGroupId;
                return this;
            }

            /**
             * The name of the server group.
             */
            public Builder vServerGroupName(String vServerGroupName) {
                this.vServerGroupName = vServerGroupName;
                return this;
            }

            public VServerGroup build() {
                return new VServerGroup(this);
            } 

        } 

    }
    public static class VServerGroups extends TeaModel {
        @NameInMap("VServerGroup")
        private java.util.List < VServerGroup> vServerGroup;

        private VServerGroups(Builder builder) {
            this.vServerGroup = builder.vServerGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VServerGroups create() {
            return builder().build();
        }

        /**
         * @return vServerGroup
         */
        public java.util.List < VServerGroup> getVServerGroup() {
            return this.vServerGroup;
        }

        public static final class Builder {
            private java.util.List < VServerGroup> vServerGroup; 

            /**
             * VServerGroup.
             */
            public Builder vServerGroup(java.util.List < VServerGroup> vServerGroup) {
                this.vServerGroup = vServerGroup;
                return this;
            }

            public VServerGroups build() {
                return new VServerGroups(this);
            } 

        } 

    }
}
