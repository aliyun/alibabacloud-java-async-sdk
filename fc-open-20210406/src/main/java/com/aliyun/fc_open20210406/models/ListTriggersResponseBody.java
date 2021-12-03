// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListTriggersResponseBody} extends {@link TeaModel}
 *
 * <p>ListTriggersResponseBody</p>
 */
public class ListTriggersResponseBody extends TeaModel {
    @NameInMap("nextToken")
    private String nextToken;

    @NameInMap("triggers")
    private java.util.List < Triggers> triggers;


    private ListTriggersResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.triggers = builder.triggers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTriggersResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return triggers
     */
    public java.util.List < Triggers> getTriggers() {
        return this.triggers;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List < Triggers> triggers; 

        /**
         * <p>用来返回更多的查询结果。如果这个值没有返回，则说明没有更多结果</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Trigger列表</p>
         */
        public Builder triggers(java.util.List < Triggers> triggers) {
            this.triggers = triggers;
            return this;
        }

        public ListTriggersResponseBody build() {
            return new ListTriggersResponseBody(this);
        } 

    } 

    public static class Triggers extends TeaModel {
        @NameInMap("createdTime")
        private String createdTime;

        @NameInMap("description")
        private String description;

        @NameInMap("domainName")
        private String domainName;

        @NameInMap("invocationRole")
        private String invocationRole;

        @NameInMap("lastModifiedTime")
        private String lastModifiedTime;

        @NameInMap("qualifier")
        private String qualifier;

        @NameInMap("sourceArn")
        private String sourceArn;

        @NameInMap("triggerConfig")
        private String triggerConfig;

        @NameInMap("triggerId")
        private String triggerId;

        @NameInMap("triggerName")
        private String triggerName;

        @NameInMap("triggerType")
        private String triggerType;


        private Triggers(Builder builder) {
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.domainName = builder.domainName;
            this.invocationRole = builder.invocationRole;
            this.lastModifiedTime = builder.lastModifiedTime;
            this.qualifier = builder.qualifier;
            this.sourceArn = builder.sourceArn;
            this.triggerConfig = builder.triggerConfig;
            this.triggerId = builder.triggerId;
            this.triggerName = builder.triggerName;
            this.triggerType = builder.triggerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Triggers create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return invocationRole
         */
        public String getInvocationRole() {
            return this.invocationRole;
        }

        /**
         * @return lastModifiedTime
         */
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        /**
         * @return qualifier
         */
        public String getQualifier() {
            return this.qualifier;
        }

        /**
         * @return sourceArn
         */
        public String getSourceArn() {
            return this.sourceArn;
        }

        /**
         * @return triggerConfig
         */
        public String getTriggerConfig() {
            return this.triggerConfig;
        }

        /**
         * @return triggerId
         */
        public String getTriggerId() {
            return this.triggerId;
        }

        /**
         * @return triggerName
         */
        public String getTriggerName() {
            return this.triggerName;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        public static final class Builder {
            private String createdTime; 
            private String description; 
            private String domainName; 
            private String invocationRole; 
            private String lastModifiedTime; 
            private String qualifier; 
            private String sourceArn; 
            private String triggerConfig; 
            private String triggerId; 
            private String triggerName; 
            private String triggerType; 

            /**
             * <p>创建时间</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>域名名称，使用域名名称拼接上函数计算域名，可以采用HTTP协议调用到触发器对应版本的函数。例如{domainName}.cn-shanghai.fc.aliyuncs.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>调用函数使用的RAM角色的ARN</p>
             */
            public Builder invocationRole(String invocationRole) {
                this.invocationRole = invocationRole;
                return this;
            }

            /**
             * <p>上次修改时间</p>
             */
            public Builder lastModifiedTime(String lastModifiedTime) {
                this.lastModifiedTime = lastModifiedTime;
                return this;
            }

            /**
             * <p>service版本</p>
             */
            public Builder qualifier(String qualifier) {
                this.qualifier = qualifier;
                return this;
            }

            /**
             * <p>event source的Aliyun Resource Name（ARN</p>
             */
            public Builder sourceArn(String sourceArn) {
                this.sourceArn = sourceArn;
                return this;
            }

            /**
             * <p>trigger配置对象</p>
             */
            public Builder triggerConfig(String triggerConfig) {
                this.triggerConfig = triggerConfig;
                return this;
            }

            /**
             * <p>triggerId.</p>
             */
            public Builder triggerId(String triggerId) {
                this.triggerId = triggerId;
                return this;
            }

            /**
             * <p>trigger名称</p>
             */
            public Builder triggerName(String triggerName) {
                this.triggerName = triggerName;
                return this;
            }

            /**
             * <p>trigger类型，如 oss, log, tablestore, timer, http, cdn_events, mns_topic</p>
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            public Triggers build() {
                return new Triggers(this);
            } 

        } 

    }
}
