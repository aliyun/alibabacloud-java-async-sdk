// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBusinessCategoryListResponseBody} extends {@link TeaModel}
 *
 * <p>GetBusinessCategoryListResponseBody</p>
 */
public class GetBusinessCategoryListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetBusinessCategoryListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBusinessCategoryListResponseBody create() {
        return builder().build();
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public GetBusinessCategoryListResponseBody build() {
            return new GetBusinessCategoryListResponseBody(this);
        } 

    } 

    public static class BusinessCategoryBasicInfo extends TeaModel {
        @NameInMap("Bid")
        private Integer bid;

        @NameInMap("BusinessName")
        private String businessName;

        @NameInMap("ServiceType")
        private Integer serviceType;

        private BusinessCategoryBasicInfo(Builder builder) {
            this.bid = builder.bid;
            this.businessName = builder.businessName;
            this.serviceType = builder.serviceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BusinessCategoryBasicInfo create() {
            return builder().build();
        }

        /**
         * @return bid
         */
        public Integer getBid() {
            return this.bid;
        }

        /**
         * @return businessName
         */
        public String getBusinessName() {
            return this.businessName;
        }

        /**
         * @return serviceType
         */
        public Integer getServiceType() {
            return this.serviceType;
        }

        public static final class Builder {
            private Integer bid; 
            private String businessName; 
            private Integer serviceType; 

            /**
             * Bid.
             */
            public Builder bid(Integer bid) {
                this.bid = bid;
                return this;
            }

            /**
             * BusinessName.
             */
            public Builder businessName(String businessName) {
                this.businessName = businessName;
                return this;
            }

            /**
             * ServiceType.
             */
            public Builder serviceType(Integer serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            public BusinessCategoryBasicInfo build() {
                return new BusinessCategoryBasicInfo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("BusinessCategoryBasicInfo")
        private java.util.List < BusinessCategoryBasicInfo> businessCategoryBasicInfo;

        private Data(Builder builder) {
            this.businessCategoryBasicInfo = builder.businessCategoryBasicInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return businessCategoryBasicInfo
         */
        public java.util.List < BusinessCategoryBasicInfo> getBusinessCategoryBasicInfo() {
            return this.businessCategoryBasicInfo;
        }

        public static final class Builder {
            private java.util.List < BusinessCategoryBasicInfo> businessCategoryBasicInfo; 

            /**
             * BusinessCategoryBasicInfo.
             */
            public Builder businessCategoryBasicInfo(java.util.List < BusinessCategoryBasicInfo> businessCategoryBasicInfo) {
                this.businessCategoryBasicInfo = businessCategoryBasicInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
