// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutMetricRuleTargetsResponseBody} extends {@link TeaModel}
 *
 * <p>PutMetricRuleTargetsResponseBody</p>
 */
public class PutMetricRuleTargetsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("FailData")
    private FailData failData;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private PutMetricRuleTargetsResponseBody(Builder builder) {
        this.code = builder.code;
        this.failData = builder.failData;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutMetricRuleTargetsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return failData
     */
    public FailData getFailData() {
        return this.failData;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private FailData failData; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The list of resources that failed to be created or modified.
         */
        public Builder failData(FailData failData) {
            this.failData = failData;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call was successful. Valid values:
         * <p>
         * 
         * *   true: The call was successful.
         * *   false: The call failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public PutMetricRuleTargetsResponseBody build() {
            return new PutMetricRuleTargetsResponseBody(this);
        } 

    } 

    public static class Target extends TeaModel {
        @NameInMap("Arn")
        private String arn;

        @NameInMap("Id")
        private String id;

        @NameInMap("Level")
        private String level;

        private Target(Builder builder) {
            this.arn = builder.arn;
            this.id = builder.id;
            this.level = builder.level;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Target create() {
            return builder().build();
        }

        /**
         * @return arn
         */
        public String getArn() {
            return this.arn;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        public static final class Builder {
            private String arn; 
            private String id; 
            private String level; 

            /**
             * The ARN of the resource.
             * <p>
             * 
             * Format: `acs:{Service name abbreviation}:{regionId}:{userId}:/{Resource type}/{Resource name}/message`. Example: `acs:mns:cn-hangzhou:120886317861****:/queues/test123/message`. Fields:
             * 
             * *   {Service name abbreviation}: the abbreviation of the service name. Valid value: mns.
             * *   {userId}: the ID of the Alibaba Cloud account.
             * *   {regionId}: the region ID of the message queue or topic.
             * *   {Resource type}`: the type of the resource for which alerts are triggered. Valid values: - **queues** - **topics** {Resource name}: the name of the resource. - If the resource type is set to **queues**, the resource name is the name of the message queue. - If the resource type is set to **topics**, the resource name is the name of the topic.`
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * The ID of the resource for which alerts are triggered.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The level of the alert. Valid values:
             * <p>
             * 
             * *   INFO: information
             * *   WARN: warning
             * *   CRITICAL: critical
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            public Target build() {
                return new Target(this);
            } 

        } 

    }
    public static class Targets extends TeaModel {
        @NameInMap("Target")
        private java.util.List < Target> target;

        private Targets(Builder builder) {
            this.target = builder.target;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Targets create() {
            return builder().build();
        }

        /**
         * @return target
         */
        public java.util.List < Target> getTarget() {
            return this.target;
        }

        public static final class Builder {
            private java.util.List < Target> target; 

            /**
             * Target.
             */
            public Builder target(java.util.List < Target> target) {
                this.target = target;
                return this;
            }

            public Targets build() {
                return new Targets(this);
            } 

        } 

    }
    public static class FailData extends TeaModel {
        @NameInMap("Targets")
        private Targets targets;

        private FailData(Builder builder) {
            this.targets = builder.targets;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailData create() {
            return builder().build();
        }

        /**
         * @return targets
         */
        public Targets getTargets() {
            return this.targets;
        }

        public static final class Builder {
            private Targets targets; 

            /**
             * The information about the resource for which alerts are triggered.
             */
            public Builder targets(Targets targets) {
                this.targets = targets;
                return this;
            }

            public FailData build() {
                return new FailData(this);
            } 

        } 

    }
}
