// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMetricRuleTargetsResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteMetricRuleTargetsResponseBody</p>
 */
public class DeleteMetricRuleTargetsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("FailIds")
    private FailIds failIds;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * The returned message.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The ID of the message resource that failed to be deleted.
         */
        public Builder failIds(FailIds failIds) {
            this.failIds = failIds;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Indicates whether the call was successful. Valid values:
         * <p>
         * 
         * *   true: The call was successful.
         * *   false: The call failed.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The message resources that failed to be deleted.
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
        @NameInMap("TargetId")
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
        @NameInMap("TargetIds")
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
             * Deletes the message resources of an alert rule. This operation supports only Message Service (MNS) resources.
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
