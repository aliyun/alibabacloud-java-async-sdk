// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMetricRuleTargetsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMetricRuleTargetsResponseBody</p>
 */
public class DescribeMetricRuleTargetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Targets")
    private Targets targets;

    private DescribeMetricRuleTargetsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.targets = builder.targets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetricRuleTargetsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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

    /**
     * @return targets
     */
    public Targets getTargets() {
        return this.targets;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private Targets targets; 

        /**
         * <p>The HTTP status code.</p>
         * <blockquote>
         * <p> The status code 200 indicates that the call was successful.</p>
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
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>User not authorized to operate on the specified resource.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>786E92D2-AC66-4250-B76F-F1E2FCDDBA1C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li>true: The call was successful.</li>
         * <li>false: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The information about the resource for which alerts are triggered.</p>
         */
        public Builder targets(Targets targets) {
            this.targets = targets;
            return this;
        }

        public DescribeMetricRuleTargetsResponseBody build() {
            return new DescribeMetricRuleTargetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMetricRuleTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricRuleTargetsResponseBody</p>
     */
    public static class Target extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arn")
        private String arn;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("JsonParams")
        private String jsonParams;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        private Target(Builder builder) {
            this.arn = builder.arn;
            this.id = builder.id;
            this.jsonParams = builder.jsonParams;
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
         * @return jsonParams
         */
        public String getJsonParams() {
            return this.jsonParams;
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
            private String jsonParams; 
            private String level; 

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the resource. Format: <code>acs:{Service name abbreviation}:{regionId}:{userId}:/{Resource type}/{Resource name}/message</code>. Example: <code>acs:mns:cn-hangzhou:120886317861****:/queues/test123/message</code>. Fields:</p>
             * <ul>
             * <li>{Service name abbreviation}: the abbreviation of the service name. Valid value: mns.</li>
             * <li>{userId}: the ID of the Alibaba Cloud account.</li>
             * <li>{regionId}: the region ID of the message queue or topic.</li>
             * <li>{Resource type}<code>: the type of the resource for which alerts are triggered. Valid values: - **queues** - **topics** {Resource name}: the name of the resource. - If the resource type is set to **queues**, the resource name is the name of the message queue. - If the resource type is set to **topics**, the resource name is the name of the topic.</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>acs:mns:cn-hangzhou:120886317861****:/queues/test/message</p>
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
             * <p>The parameters of the alert callback. The parameters are in the JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;customField1&quot;:&quot;value1&quot;,&quot;customField2&quot;:&quot;$.name&quot;}</p>
             */
            public Builder jsonParams(String jsonParams) {
                this.jsonParams = jsonParams;
                return this;
            }

            /**
             * <p>The level of the alert. Valid values:</p>
             * <ul>
             * <li>INFO: information</li>
             * <li>WARN: warning</li>
             * <li>CRITICAL: critical</li>
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
     * {@link DescribeMetricRuleTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricRuleTargetsResponseBody</p>
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
}
