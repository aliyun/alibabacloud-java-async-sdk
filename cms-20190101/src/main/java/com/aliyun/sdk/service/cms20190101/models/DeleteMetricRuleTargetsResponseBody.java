// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMetricRuleTargetsResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteMetricRuleTargetsResponseBody</p>
 */
public class DeleteMetricRuleTargetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("FailIds")
    private FailIds failIds;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DeleteMetricRuleTargetsResponseBody(Builder builder) {
        this.code = builder.code;
        this.failIds = builder.failIds;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMetricRuleTargetsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return failIds
     */
    public FailIds getFailIds() {
        return this.failIds;
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
        private FailIds failIds; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code.
         * <p>
         * 
         * **
         * 
         * **Description** The status code 200 indicates that the request was successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The IDs of the resources that failed to be deleted.
         */
        public Builder failIds(FailIds failIds) {
            this.failIds = failIds;
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeleteMetricRuleTargetsResponseBody build() {
            return new DeleteMetricRuleTargetsResponseBody(this);
        } 

    } 

    public static class TargetIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TargetId")
        private java.util.List < String > targetId;

        private TargetIds(Builder builder) {
            this.targetId = builder.targetId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetIds create() {
            return builder().build();
        }

        /**
         * @return targetId
         */
        public java.util.List < String > getTargetId() {
            return this.targetId;
        }

        public static final class Builder {
            private java.util.List < String > targetId; 

            /**
             * TargetId.
             */
            public Builder targetId(java.util.List < String > targetId) {
                this.targetId = targetId;
                return this;
            }

            public TargetIds build() {
                return new TargetIds(this);
            } 

        } 

    }
    public static class FailIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TargetIds")
        private TargetIds targetIds;

        private FailIds(Builder builder) {
            this.targetIds = builder.targetIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailIds create() {
            return builder().build();
        }

        /**
         * @return targetIds
         */
        public TargetIds getTargetIds() {
            return this.targetIds;
        }

        public static final class Builder {
            private TargetIds targetIds; 

            /**
             * The IDs of the resources that failed to be deleted.
             */
            public Builder targetIds(TargetIds targetIds) {
                this.targetIds = targetIds;
                return this;
            }

            public FailIds build() {
                return new FailIds(this);
            } 

        } 

    }
}
