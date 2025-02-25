// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link GrantPromotionToUserResponseBody} extends {@link TeaModel}
 *
 * <p>GrantPromotionToUserResponseBody</p>
 */
public class GrantPromotionToUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GrantPromotionToUserResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantPromotionToUserResponseBody create() {
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
     * @return model
     */
    public Model getModel() {
        return this.model;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Model model; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GrantPromotionToUserResponseBody build() {
            return new GrantPromotionToUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GrantPromotionToUserResponseBody} extends {@link TeaModel}
     *
     * <p>GrantPromotionToUserResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EffectiveEndTime")
        private Long effectiveEndTime;

        @com.aliyun.core.annotation.NameInMap("EffectiveStartTime")
        private Long effectiveStartTime;

        @com.aliyun.core.annotation.NameInMap("PromotionInstanceId")
        private String promotionInstanceId;

        @com.aliyun.core.annotation.NameInMap("SubBizCode")
        private String subBizCode;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private Model(Builder builder) {
            this.effectiveEndTime = builder.effectiveEndTime;
            this.effectiveStartTime = builder.effectiveStartTime;
            this.promotionInstanceId = builder.promotionInstanceId;
            this.subBizCode = builder.subBizCode;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return effectiveEndTime
         */
        public Long getEffectiveEndTime() {
            return this.effectiveEndTime;
        }

        /**
         * @return effectiveStartTime
         */
        public Long getEffectiveStartTime() {
            return this.effectiveStartTime;
        }

        /**
         * @return promotionInstanceId
         */
        public String getPromotionInstanceId() {
            return this.promotionInstanceId;
        }

        /**
         * @return subBizCode
         */
        public String getSubBizCode() {
            return this.subBizCode;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private Long effectiveEndTime; 
            private Long effectiveStartTime; 
            private String promotionInstanceId; 
            private String subBizCode; 
            private Boolean success; 

            /**
             * EffectiveEndTime.
             */
            public Builder effectiveEndTime(Long effectiveEndTime) {
                this.effectiveEndTime = effectiveEndTime;
                return this;
            }

            /**
             * EffectiveStartTime.
             */
            public Builder effectiveStartTime(Long effectiveStartTime) {
                this.effectiveStartTime = effectiveStartTime;
                return this;
            }

            /**
             * PromotionInstanceId.
             */
            public Builder promotionInstanceId(String promotionInstanceId) {
                this.promotionInstanceId = promotionInstanceId;
                return this;
            }

            /**
             * SubBizCode.
             */
            public Builder subBizCode(String subBizCode) {
                this.subBizCode = subBizCode;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
