// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryWabaBusinessInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryWabaBusinessInfoResponseBody</p>
 */
public class QueryWabaBusinessInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryWabaBusinessInfoResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryWabaBusinessInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * The HTTP status code returned.
         * <p>
         * 
         * *   A value of OK indicates that the call is successful.
         * *   Other values indicate that the call fails. For more information, see [Error codes](~~196974~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The business information about the WABA.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error message returned.
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryWabaBusinessInfoResponseBody build() {
            return new QueryWabaBusinessInfoResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessId")
        private String businessId;

        @com.aliyun.core.annotation.NameInMap("BusinessName")
        private String businessName;

        @com.aliyun.core.annotation.NameInMap("VerificationStatus")
        private String verificationStatus;

        @com.aliyun.core.annotation.NameInMap("Vertical")
        private String vertical;

        private Data(Builder builder) {
            this.businessId = builder.businessId;
            this.businessName = builder.businessName;
            this.verificationStatus = builder.verificationStatus;
            this.vertical = builder.vertical;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return businessId
         */
        public String getBusinessId() {
            return this.businessId;
        }

        /**
         * @return businessName
         */
        public String getBusinessName() {
            return this.businessName;
        }

        /**
         * @return verificationStatus
         */
        public String getVerificationStatus() {
            return this.verificationStatus;
        }

        /**
         * @return vertical
         */
        public String getVertical() {
            return this.vertical;
        }

        public static final class Builder {
            private String businessId; 
            private String businessName; 
            private String verificationStatus; 
            private String vertical; 

            /**
             * The ID of the business platform.
             */
            public Builder businessId(String businessId) {
                this.businessId = businessId;
                return this;
            }

            /**
             * The name of the business platform.
             */
            public Builder businessName(String businessName) {
                this.businessName = businessName;
                return this;
            }

            /**
             * The verification status.
             */
            public Builder verificationStatus(String verificationStatus) {
                this.verificationStatus = verificationStatus;
                return this;
            }

            /**
             * The industry.
             */
            public Builder vertical(String vertical) {
                this.vertical = vertical;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
