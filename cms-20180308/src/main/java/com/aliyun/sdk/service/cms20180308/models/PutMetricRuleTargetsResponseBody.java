// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(PutMetricRuleTargetsResponseBody model) {
            this.code = model.code;
            this.failData = model.failData;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * FailData.
         */
        public Builder failData(FailData failData) {
            this.failData = failData;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
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

            private Builder() {
            } 

            private Builder(Target model) {
                this.arn = model.arn;
                this.id = model.id;
                this.level = model.level;
            } 

            /**
             * Arn.
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Level.
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
        private java.util.List<Target> target;

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
        public java.util.List<Target> getTarget() {
            return this.target;
        }

        public static final class Builder {
            private java.util.List<Target> target; 

            private Builder() {
            } 

            private Builder(Targets model) {
                this.target = model.target;
            } 

            /**
             * Target.
             */
            public Builder target(java.util.List<Target> target) {
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

            private Builder() {
            } 

            private Builder(FailData model) {
                this.targets = model.targets;
            } 

            /**
             * Targets.
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
