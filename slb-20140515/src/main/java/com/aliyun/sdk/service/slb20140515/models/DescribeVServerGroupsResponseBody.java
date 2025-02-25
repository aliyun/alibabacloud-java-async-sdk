// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVServerGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVServerGroupsResponseBody</p>
 */
public class DescribeVServerGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VServerGroups")
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9DEC9C28-AB05-4DDF-9A78-6B08EC9CE18C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The backend servers.</p>
         */
        public Builder vServerGroups(VServerGroups vServerGroups) {
            this.vServerGroups = vServerGroups;
            return this;
        }

        public DescribeVServerGroupsResponseBody build() {
            return new DescribeVServerGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVServerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVServerGroupsResponseBody</p>
     */
    public static class Listener extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
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
             * <p>The listener port.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The listener protocol. Valid values: <strong>tcp</strong>, <strong>udp</strong>, <strong>http</strong>, and <strong>https</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>tcp</p>
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
    /**
     * 
     * {@link DescribeVServerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVServerGroupsResponseBody</p>
     */
    public static class Listeners extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Listener")
        private java.util.List<Listener> listener;

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
        public java.util.List<Listener> getListener() {
            return this.listener;
        }

        public static final class Builder {
            private java.util.List<Listener> listener; 

            /**
             * Listener.
             */
            public Builder listener(java.util.List<Listener> listener) {
                this.listener = listener;
                return this;
            }

            public Listeners build() {
                return new Listeners(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVServerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVServerGroupsResponseBody</p>
     */
    public static class Rule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Url")
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
             * <p>The requested domain name.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The ID of the forwarding rule.</p>
             * 
             * <strong>example:</strong>
             * <p>rule-a3x3pg1yohq3lq****</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the forwarding rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The request URL.</p>
             * 
             * <strong>example:</strong>
             * <p>/example</p>
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
    /**
     * 
     * {@link DescribeVServerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVServerGroupsResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Rule")
        private java.util.List<Rule> rule;

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
        public java.util.List<Rule> getRule() {
            return this.rule;
        }

        public static final class Builder {
            private java.util.List<Rule> rule; 

            /**
             * Rule.
             */
            public Builder rule(java.util.List<Rule> rule) {
                this.rule = rule;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVServerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVServerGroupsResponseBody</p>
     */
    public static class AssociatedObjects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Listeners")
        private Listeners listeners;

        @com.aliyun.core.annotation.NameInMap("Rules")
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
             * <p>The listeners.</p>
             */
            public Builder listeners(Listeners listeners) {
                this.listeners = listeners;
                return this;
            }

            /**
             * <p>The forwarding rules.</p>
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
    /**
     * 
     * {@link DescribeVServerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVServerGroupsResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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
    /**
     * 
     * {@link DescribeVServerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVServerGroupsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

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
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVServerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVServerGroupsResponseBody</p>
     */
    public static class VServerGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociatedObjects")
        private AssociatedObjects associatedObjects;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ServerCount")
        private Long serverCount;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("VServerGroupId")
        private String vServerGroupId;

        @com.aliyun.core.annotation.NameInMap("VServerGroupName")
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
             * <p>The associated resources.</p>
             */
            public Builder associatedObjects(AssociatedObjects associatedObjects) {
                this.associatedObjects = associatedObjects;
                return this;
            }

            /**
             * <p>The time when the CLB instance was created. The time follows the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-31T02:49:05Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The number of servers.</p>
             * <p>This parameter is unavailable by default. To use this parameter, submit a ticket or contact your account manager.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder serverCount(Long serverCount) {
                this.serverCount = serverCount;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The server group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rsp-0bfuc*****</p>
             */
            public Builder vServerGroupId(String vServerGroupId) {
                this.vServerGroupId = vServerGroupId;
                return this;
            }

            /**
             * <p>The server group name.</p>
             * 
             * <strong>example:</strong>
             * <p>Group3</p>
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
    /**
     * 
     * {@link DescribeVServerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVServerGroupsResponseBody</p>
     */
    public static class VServerGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VServerGroup")
        private java.util.List<VServerGroup> vServerGroup;

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
        public java.util.List<VServerGroup> getVServerGroup() {
            return this.vServerGroup;
        }

        public static final class Builder {
            private java.util.List<VServerGroup> vServerGroup; 

            /**
             * VServerGroup.
             */
            public Builder vServerGroup(java.util.List<VServerGroup> vServerGroup) {
                this.vServerGroup = vServerGroup;
                return this;
            }

            public VServerGroups build() {
                return new VServerGroups(this);
            } 

        } 

    }
}
