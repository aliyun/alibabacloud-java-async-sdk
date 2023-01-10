// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

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
         * The token used to obtain more results. If this parameter is left empty, all the results are returned.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The information about triggers.
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

        @NameInMap("urlInternet")
        private String urlInternet;

        @NameInMap("urlIntranet")
        private String urlIntranet;

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
            this.urlInternet = builder.urlInternet;
            this.urlIntranet = builder.urlIntranet;
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

        /**
         * @return urlInternet
         */
        public String getUrlInternet() {
            return this.urlInternet;
        }

        /**
         * @return urlIntranet
         */
        public String getUrlIntranet() {
            return this.urlIntranet;
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
            private String urlInternet; 
            private String urlIntranet; 

            /**
             * The time when the trigger was created.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The description of the trigger.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The domain name used to invoke the function by using HTTP. You can add this domain name as the prefix to the endpoint of Function Compute. This way, you can invoke the function that corresponds to the trigger by using HTTP. For example, `{domainName}.cn-shanghai.fc.aliyuncs.com`.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * The ARN of the RAM role that is used by the event source to invoke the function.
             */
            public Builder invocationRole(String invocationRole) {
                this.invocationRole = invocationRole;
                return this;
            }

            /**
             * The time when the trigger was last modified.
             */
            public Builder lastModifiedTime(String lastModifiedTime) {
                this.lastModifiedTime = lastModifiedTime;
                return this;
            }

            /**
             * The version or alias of the service.
             */
            public Builder qualifier(String qualifier) {
                this.qualifier = qualifier;
                return this;
            }

            /**
             * The ARN of the event source.
             */
            public Builder sourceArn(String sourceArn) {
                this.sourceArn = sourceArn;
                return this;
            }

            /**
             * The configurations of the trigger. The configurations vary based on the trigger type. For more information about the format, see the following topics:
             * <p>
             * 
             * *   OSS trigger: [OSSTriggerConfig](javascript:void\(0\)).
             * *   Log Service trigger: [LogTriggerConfig](javascript:void\(0\)).
             * *   Time trigger: [TimeTriggerConfig](javascript:void\(0\)).
             * *   HTTP trigger: [HTTPTriggerConfig](javascript:void\(0\)).
             * *   Tablestore trigger: Specify the **SourceArn** parameter and leave this parameter empty.
             * *   Alibaba Cloud CDN event trigger: [CDNEventsTriggerConfig](javascript:void\(0\)).
             * *   MNS topic trigger: [MnsTopicTriggerConfig](javascript:void\(0\)).
             */
            public Builder triggerConfig(String triggerConfig) {
                this.triggerConfig = triggerConfig;
                return this;
            }

            /**
             * The unique ID of the trigger.
             */
            public Builder triggerId(String triggerId) {
                this.triggerId = triggerId;
                return this;
            }

            /**
             * The name of the trigger.
             */
            public Builder triggerName(String triggerName) {
                this.triggerName = triggerName;
                return this;
            }

            /**
             * The trigger type, such as **oss**, **log**, **tablestore**, **timer**, **http**, **cdn_events**, and **mns_topic**.
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            /**
             * The public domain address. You can access HTTP triggers over the Internet by using HTTP or HTTPS.
             */
            public Builder urlInternet(String urlInternet) {
                this.urlInternet = urlInternet;
                return this;
            }

            /**
             * The private endpoint. In a VPC, you can access HTTP triggers by using HTTP or HTTPS.
             */
            public Builder urlIntranet(String urlIntranet) {
                this.urlIntranet = urlIntranet;
                return this;
            }

            public Triggers build() {
                return new Triggers(this);
            } 

        } 

    }
}
