// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mindlive20210301.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RequestServiceInfoResponseBody} extends {@link TeaModel}
 *
 * <p>RequestServiceInfoResponseBody</p>
 */
public class RequestServiceInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private RequestServiceInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RequestServiceInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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

        public RequestServiceInfoResponseBody build() {
            return new RequestServiceInfoResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ServiceEffectAt")
        private Long serviceEffectAt;

        @NameInMap("ServiceExpireAt")
        private Long serviceExpireAt;

        @NameInMap("ServicePackName")
        private String servicePackName;

        private Data(Builder builder) {
            this.serviceEffectAt = builder.serviceEffectAt;
            this.serviceExpireAt = builder.serviceExpireAt;
            this.servicePackName = builder.servicePackName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return serviceEffectAt
         */
        public Long getServiceEffectAt() {
            return this.serviceEffectAt;
        }

        /**
         * @return serviceExpireAt
         */
        public Long getServiceExpireAt() {
            return this.serviceExpireAt;
        }

        /**
         * @return servicePackName
         */
        public String getServicePackName() {
            return this.servicePackName;
        }

        public static final class Builder {
            private Long serviceEffectAt; 
            private Long serviceExpireAt; 
            private String servicePackName; 

            /**
             * ServiceEffectAt.
             */
            public Builder serviceEffectAt(Long serviceEffectAt) {
                this.serviceEffectAt = serviceEffectAt;
                return this;
            }

            /**
             * ServiceExpireAt.
             */
            public Builder serviceExpireAt(Long serviceExpireAt) {
                this.serviceExpireAt = serviceExpireAt;
                return this;
            }

            /**
             * ServicePackName.
             */
            public Builder servicePackName(String servicePackName) {
                this.servicePackName = servicePackName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
