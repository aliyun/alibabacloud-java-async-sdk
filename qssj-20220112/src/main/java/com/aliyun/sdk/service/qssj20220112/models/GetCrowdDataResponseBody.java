// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCrowdDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetCrowdDataResponseBody</p>
 */
public class GetCrowdDataResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SuccessResponse")
    private String successResponse;

    private GetCrowdDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.successResponse = builder.successResponse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCrowdDataResponseBody create() {
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
    public java.util.List < Data> getData() {
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
     * @return successResponse
     */
    public String getSuccessResponse() {
        return this.successResponse;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private String successResponse; 

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
        public Builder data(java.util.List < Data> data) {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SuccessResponse.
         */
        public Builder successResponse(String successResponse) {
            this.successResponse = successResponse;
            return this;
        }

        public GetCrowdDataResponseBody build() {
            return new GetCrowdDataResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Age")
        private Integer age;

        @NameInMap("BuyerId")
        private Long buyerId;

        @NameInMap("CateId")
        private Long cateId;

        @NameInMap("CateName")
        private String cateName;

        @NameInMap("Classification")
        private String classification;

        @NameInMap("ClassificationNew")
        private String classificationNew;

        @NameInMap("Gender")
        private String gender;

        @NameInMap("OnlineDate")
        private String onlineDate;

        @NameInMap("OrderAmount")
        private Double orderAmount;

        @NameInMap("OrderQuantity")
        private Long orderQuantity;

        @NameInMap("Province")
        private String province;

        @NameInMap("SearchVolume")
        private Long searchVolume;

        @NameInMap("TrendLevel")
        private String trendLevel;

        private Data(Builder builder) {
            this.age = builder.age;
            this.buyerId = builder.buyerId;
            this.cateId = builder.cateId;
            this.cateName = builder.cateName;
            this.classification = builder.classification;
            this.classificationNew = builder.classificationNew;
            this.gender = builder.gender;
            this.onlineDate = builder.onlineDate;
            this.orderAmount = builder.orderAmount;
            this.orderQuantity = builder.orderQuantity;
            this.province = builder.province;
            this.searchVolume = builder.searchVolume;
            this.trendLevel = builder.trendLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return age
         */
        public Integer getAge() {
            return this.age;
        }

        /**
         * @return buyerId
         */
        public Long getBuyerId() {
            return this.buyerId;
        }

        /**
         * @return cateId
         */
        public Long getCateId() {
            return this.cateId;
        }

        /**
         * @return cateName
         */
        public String getCateName() {
            return this.cateName;
        }

        /**
         * @return classification
         */
        public String getClassification() {
            return this.classification;
        }

        /**
         * @return classificationNew
         */
        public String getClassificationNew() {
            return this.classificationNew;
        }

        /**
         * @return gender
         */
        public String getGender() {
            return this.gender;
        }

        /**
         * @return onlineDate
         */
        public String getOnlineDate() {
            return this.onlineDate;
        }

        /**
         * @return orderAmount
         */
        public Double getOrderAmount() {
            return this.orderAmount;
        }

        /**
         * @return orderQuantity
         */
        public Long getOrderQuantity() {
            return this.orderQuantity;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        /**
         * @return searchVolume
         */
        public Long getSearchVolume() {
            return this.searchVolume;
        }

        /**
         * @return trendLevel
         */
        public String getTrendLevel() {
            return this.trendLevel;
        }

        public static final class Builder {
            private Integer age; 
            private Long buyerId; 
            private Long cateId; 
            private String cateName; 
            private String classification; 
            private String classificationNew; 
            private String gender; 
            private String onlineDate; 
            private Double orderAmount; 
            private Long orderQuantity; 
            private String province; 
            private Long searchVolume; 
            private String trendLevel; 

            /**
             * Age.
             */
            public Builder age(Integer age) {
                this.age = age;
                return this;
            }

            /**
             * BuyerId.
             */
            public Builder buyerId(Long buyerId) {
                this.buyerId = buyerId;
                return this;
            }

            /**
             * CateId.
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * CateName.
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * Classification.
             */
            public Builder classification(String classification) {
                this.classification = classification;
                return this;
            }

            /**
             * ClassificationNew.
             */
            public Builder classificationNew(String classificationNew) {
                this.classificationNew = classificationNew;
                return this;
            }

            /**
             * Gender.
             */
            public Builder gender(String gender) {
                this.gender = gender;
                return this;
            }

            /**
             * OnlineDate.
             */
            public Builder onlineDate(String onlineDate) {
                this.onlineDate = onlineDate;
                return this;
            }

            /**
             * OrderAmount.
             */
            public Builder orderAmount(Double orderAmount) {
                this.orderAmount = orderAmount;
                return this;
            }

            /**
             * OrderQuantity.
             */
            public Builder orderQuantity(Long orderQuantity) {
                this.orderQuantity = orderQuantity;
                return this;
            }

            /**
             * Province.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * SearchVolume.
             */
            public Builder searchVolume(Long searchVolume) {
                this.searchVolume = searchVolume;
                return this;
            }

            /**
             * TrendLevel.
             */
            public Builder trendLevel(String trendLevel) {
                this.trendLevel = trendLevel;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
