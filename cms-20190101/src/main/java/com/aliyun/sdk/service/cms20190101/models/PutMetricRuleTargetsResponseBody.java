// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PutMetricRuleTargetsResponseBody} extends {@link TeaModel}
 *
 * <p>PutMetricRuleTargetsResponseBody</p>
 */
public class PutMetricRuleTargetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("FailData")
    private FailData failData;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The HTTP status code.</p>
         * <blockquote>
         * <p> The status code 200 indicates that the request was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The failed data.</p>
         */
        public Builder failData(FailData failData) {
            this.failData = failData;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The request processing has failed due to some unknown error.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6A569B0D-9055-58AF-9E82-BAEAF95C0FD5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public PutMetricRuleTargetsResponseBody build() {
            return new PutMetricRuleTargetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PutMetricRuleTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>PutMetricRuleTargetsResponseBody</p>
     */
    public static class Target extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arn")
        private String arn;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Level")
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
             * <p>The ARN of the resource. Format: <code>acs:{Service name abbreviation}:{regionId}:{userId}:/{Resource type}/{Resource name}/message</code>. MNS, Auto Scaling, Simple Log Service, and Function Compute are supported. Example: <code>acs:mns:cn-hangzhou:120886317861****:/queues/test123/message</code>. The following part describes the ARN of MNS and the parameters in the ARN:</p>
             * <ul>
             * <li><p>{Service name abbreviation}: mns.</p>
             * </li>
             * <li><p>{userId}: the ID of the Alibaba Cloud account.</p>
             * </li>
             * <li><p>{regionId}: the region ID of the message queue or topic.</p>
             * </li>
             * <li><p>{Resource type}: the type of the resource for which alerts are triggered. Valid values:</p>
             * <ul>
             * <li><strong>queues</strong></li>
             * <li><strong>topics</strong></li>
             * </ul>
             * </li>
             * <li><p>{Resource name}: the resource name.</p>
             * <ul>
             * <li>If the resource type is <strong>queues</strong>, the resource name is the queue name.</li>
             * <li>If the resource type is <strong>topics</strong>, the resource name is the topic name.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>acs:mns:cn-hangzhou:111:/queues/test/message</p>
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * <p>The ID of the resource for which alerts are triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The alert level. Valid values:</p>
             * <ul>
             * <li>INFO</li>
             * <li>WARN</li>
             * <li>CRITICAL</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[&quot;INFO&quot;, &quot;WARN&quot;, &quot;CRITICAL&quot;]</p>
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
    /**
     * 
     * {@link PutMetricRuleTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>PutMetricRuleTargetsResponseBody</p>
     */
    public static class Targets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Target")
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
    /**
     * 
     * {@link PutMetricRuleTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>PutMetricRuleTargetsResponseBody</p>
     */
    public static class FailData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Targets")
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
             * <p>The information about the resources for which alerts are triggered.</p>
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
