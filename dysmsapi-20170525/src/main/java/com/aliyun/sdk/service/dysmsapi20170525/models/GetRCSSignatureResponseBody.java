// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
 * {@link GetRCSSignatureResponseBody} extends {@link TeaModel}
 *
 * <p>GetRCSSignatureResponseBody</p>
 */
public class GetRCSSignatureResponseBody extends TeaModel {
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

    private GetRCSSignatureResponseBody(Builder builder) {
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

    public static GetRCSSignatureResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetRCSSignatureResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

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

        public GetRCSSignatureResponseBody build() {
            return new GetRCSSignatureResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRCSSignatureResponseBody} extends {@link TeaModel}
     *
     * <p>GetRCSSignatureResponseBody</p>
     */
    public static class RegisterStatusReasons extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReasonCode")
        private String reasonCode;

        @com.aliyun.core.annotation.NameInMap("ReasonDescList")
        private java.util.List<String> reasonDescList;

        private RegisterStatusReasons(Builder builder) {
            this.reasonCode = builder.reasonCode;
            this.reasonDescList = builder.reasonDescList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegisterStatusReasons create() {
            return builder().build();
        }

        /**
         * @return reasonCode
         */
        public String getReasonCode() {
            return this.reasonCode;
        }

        /**
         * @return reasonDescList
         */
        public java.util.List<String> getReasonDescList() {
            return this.reasonDescList;
        }

        public static final class Builder {
            private String reasonCode; 
            private java.util.List<String> reasonDescList; 

            private Builder() {
            } 

            private Builder(RegisterStatusReasons model) {
                this.reasonCode = model.reasonCode;
                this.reasonDescList = model.reasonDescList;
            } 

            /**
             * ReasonCode.
             */
            public Builder reasonCode(String reasonCode) {
                this.reasonCode = reasonCode;
                return this;
            }

            /**
             * ReasonDescList.
             */
            public Builder reasonDescList(java.util.List<String> reasonDescList) {
                this.reasonDescList = reasonDescList;
                return this;
            }

            public RegisterStatusReasons build() {
                return new RegisterStatusReasons(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRCSSignatureResponseBody} extends {@link TeaModel}
     *
     * <p>GetRCSSignatureResponseBody</p>
     */
    public static class RegisterResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OperatorCode")
        private String operatorCode;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private Long productType;

        @com.aliyun.core.annotation.NameInMap("RegisterCompleteTime")
        private String registerCompleteTime;

        @com.aliyun.core.annotation.NameInMap("RegisterStatus")
        private Long registerStatus;

        @com.aliyun.core.annotation.NameInMap("RegisterStatusReasons")
        private java.util.List<RegisterStatusReasons> registerStatusReasons;

        private RegisterResultList(Builder builder) {
            this.operatorCode = builder.operatorCode;
            this.productType = builder.productType;
            this.registerCompleteTime = builder.registerCompleteTime;
            this.registerStatus = builder.registerStatus;
            this.registerStatusReasons = builder.registerStatusReasons;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegisterResultList create() {
            return builder().build();
        }

        /**
         * @return operatorCode
         */
        public String getOperatorCode() {
            return this.operatorCode;
        }

        /**
         * @return productType
         */
        public Long getProductType() {
            return this.productType;
        }

        /**
         * @return registerCompleteTime
         */
        public String getRegisterCompleteTime() {
            return this.registerCompleteTime;
        }

        /**
         * @return registerStatus
         */
        public Long getRegisterStatus() {
            return this.registerStatus;
        }

        /**
         * @return registerStatusReasons
         */
        public java.util.List<RegisterStatusReasons> getRegisterStatusReasons() {
            return this.registerStatusReasons;
        }

        public static final class Builder {
            private String operatorCode; 
            private Long productType; 
            private String registerCompleteTime; 
            private Long registerStatus; 
            private java.util.List<RegisterStatusReasons> registerStatusReasons; 

            private Builder() {
            } 

            private Builder(RegisterResultList model) {
                this.operatorCode = model.operatorCode;
                this.productType = model.productType;
                this.registerCompleteTime = model.registerCompleteTime;
                this.registerStatus = model.registerStatus;
                this.registerStatusReasons = model.registerStatusReasons;
            } 

            /**
             * OperatorCode.
             */
            public Builder operatorCode(String operatorCode) {
                this.operatorCode = operatorCode;
                return this;
            }

            /**
             * ProductType.
             */
            public Builder productType(Long productType) {
                this.productType = productType;
                return this;
            }

            /**
             * RegisterCompleteTime.
             */
            public Builder registerCompleteTime(String registerCompleteTime) {
                this.registerCompleteTime = registerCompleteTime;
                return this;
            }

            /**
             * RegisterStatus.
             */
            public Builder registerStatus(Long registerStatus) {
                this.registerStatus = registerStatus;
                return this;
            }

            /**
             * RegisterStatusReasons.
             */
            public Builder registerStatusReasons(java.util.List<RegisterStatusReasons> registerStatusReasons) {
                this.registerStatusReasons = registerStatusReasons;
                return this;
            }

            public RegisterResultList build() {
                return new RegisterResultList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRCSSignatureResponseBody} extends {@link TeaModel}
     *
     * <p>GetRCSSignatureResponseBody</p>
     */
    public static class ShelfStatusReasons extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReasonCode")
        private String reasonCode;

        @com.aliyun.core.annotation.NameInMap("ReasonDescList")
        private java.util.List<String> reasonDescList;

        private ShelfStatusReasons(Builder builder) {
            this.reasonCode = builder.reasonCode;
            this.reasonDescList = builder.reasonDescList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShelfStatusReasons create() {
            return builder().build();
        }

        /**
         * @return reasonCode
         */
        public String getReasonCode() {
            return this.reasonCode;
        }

        /**
         * @return reasonDescList
         */
        public java.util.List<String> getReasonDescList() {
            return this.reasonDescList;
        }

        public static final class Builder {
            private String reasonCode; 
            private java.util.List<String> reasonDescList; 

            private Builder() {
            } 

            private Builder(ShelfStatusReasons model) {
                this.reasonCode = model.reasonCode;
                this.reasonDescList = model.reasonDescList;
            } 

            /**
             * ReasonCode.
             */
            public Builder reasonCode(String reasonCode) {
                this.reasonCode = reasonCode;
                return this;
            }

            /**
             * ReasonDescList.
             */
            public Builder reasonDescList(java.util.List<String> reasonDescList) {
                this.reasonDescList = reasonDescList;
                return this;
            }

            public ShelfStatusReasons build() {
                return new ShelfStatusReasons(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRCSSignatureResponseBody} extends {@link TeaModel}
     *
     * <p>GetRCSSignatureResponseBody</p>
     */
    public static class ShelfResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OperatorCode")
        private String operatorCode;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private Long productType;

        @com.aliyun.core.annotation.NameInMap("ShelfStatus")
        private Long shelfStatus;

        @com.aliyun.core.annotation.NameInMap("ShelfStatusReasons")
        private java.util.List<ShelfStatusReasons> shelfStatusReasons;

        private ShelfResultList(Builder builder) {
            this.operatorCode = builder.operatorCode;
            this.productType = builder.productType;
            this.shelfStatus = builder.shelfStatus;
            this.shelfStatusReasons = builder.shelfStatusReasons;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShelfResultList create() {
            return builder().build();
        }

        /**
         * @return operatorCode
         */
        public String getOperatorCode() {
            return this.operatorCode;
        }

        /**
         * @return productType
         */
        public Long getProductType() {
            return this.productType;
        }

        /**
         * @return shelfStatus
         */
        public Long getShelfStatus() {
            return this.shelfStatus;
        }

        /**
         * @return shelfStatusReasons
         */
        public java.util.List<ShelfStatusReasons> getShelfStatusReasons() {
            return this.shelfStatusReasons;
        }

        public static final class Builder {
            private String operatorCode; 
            private Long productType; 
            private Long shelfStatus; 
            private java.util.List<ShelfStatusReasons> shelfStatusReasons; 

            private Builder() {
            } 

            private Builder(ShelfResultList model) {
                this.operatorCode = model.operatorCode;
                this.productType = model.productType;
                this.shelfStatus = model.shelfStatus;
                this.shelfStatusReasons = model.shelfStatusReasons;
            } 

            /**
             * OperatorCode.
             */
            public Builder operatorCode(String operatorCode) {
                this.operatorCode = operatorCode;
                return this;
            }

            /**
             * ProductType.
             */
            public Builder productType(Long productType) {
                this.productType = productType;
                return this;
            }

            /**
             * ShelfStatus.
             */
            public Builder shelfStatus(Long shelfStatus) {
                this.shelfStatus = shelfStatus;
                return this;
            }

            /**
             * ShelfStatusReasons.
             */
            public Builder shelfStatusReasons(java.util.List<ShelfStatusReasons> shelfStatusReasons) {
                this.shelfStatusReasons = shelfStatusReasons;
                return this;
            }

            public ShelfResultList build() {
                return new ShelfResultList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRCSSignatureResponseBody} extends {@link TeaModel}
     *
     * <p>GetRCSSignatureResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackgroundImage")
        private String backgroundImage;

        @com.aliyun.core.annotation.NameInMap("BubbleColor")
        private String bubbleColor;

        @com.aliyun.core.annotation.NameInMap("Category")
        private Long category;

        @com.aliyun.core.annotation.NameInMap("ChatbotCode")
        private String chatbotCode;

        @com.aliyun.core.annotation.NameInMap("ChatbotName")
        private String chatbotName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Latitude")
        private String latitude;

        @com.aliyun.core.annotation.NameInMap("Logo")
        private String logo;

        @com.aliyun.core.annotation.NameInMap("Longitude")
        private String longitude;

        @com.aliyun.core.annotation.NameInMap("OfficeAddress")
        private String officeAddress;

        @com.aliyun.core.annotation.NameInMap("RegisterResultList")
        private java.util.List<RegisterResultList> registerResultList;

        @com.aliyun.core.annotation.NameInMap("ServiceEmail")
        private String serviceEmail;

        @com.aliyun.core.annotation.NameInMap("ServicePhone")
        private String servicePhone;

        @com.aliyun.core.annotation.NameInMap("ServiceTerms")
        private String serviceTerms;

        @com.aliyun.core.annotation.NameInMap("ServiceWebsite")
        private String serviceWebsite;

        @com.aliyun.core.annotation.NameInMap("ShelfResultList")
        private java.util.List<ShelfResultList> shelfResultList;

        @com.aliyun.core.annotation.NameInMap("SignId")
        private Long signId;

        @com.aliyun.core.annotation.NameInMap("SignName")
        private String signName;

        private Data(Builder builder) {
            this.backgroundImage = builder.backgroundImage;
            this.bubbleColor = builder.bubbleColor;
            this.category = builder.category;
            this.chatbotCode = builder.chatbotCode;
            this.chatbotName = builder.chatbotName;
            this.description = builder.description;
            this.latitude = builder.latitude;
            this.logo = builder.logo;
            this.longitude = builder.longitude;
            this.officeAddress = builder.officeAddress;
            this.registerResultList = builder.registerResultList;
            this.serviceEmail = builder.serviceEmail;
            this.servicePhone = builder.servicePhone;
            this.serviceTerms = builder.serviceTerms;
            this.serviceWebsite = builder.serviceWebsite;
            this.shelfResultList = builder.shelfResultList;
            this.signId = builder.signId;
            this.signName = builder.signName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return backgroundImage
         */
        public String getBackgroundImage() {
            return this.backgroundImage;
        }

        /**
         * @return bubbleColor
         */
        public String getBubbleColor() {
            return this.bubbleColor;
        }

        /**
         * @return category
         */
        public Long getCategory() {
            return this.category;
        }

        /**
         * @return chatbotCode
         */
        public String getChatbotCode() {
            return this.chatbotCode;
        }

        /**
         * @return chatbotName
         */
        public String getChatbotName() {
            return this.chatbotName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return latitude
         */
        public String getLatitude() {
            return this.latitude;
        }

        /**
         * @return logo
         */
        public String getLogo() {
            return this.logo;
        }

        /**
         * @return longitude
         */
        public String getLongitude() {
            return this.longitude;
        }

        /**
         * @return officeAddress
         */
        public String getOfficeAddress() {
            return this.officeAddress;
        }

        /**
         * @return registerResultList
         */
        public java.util.List<RegisterResultList> getRegisterResultList() {
            return this.registerResultList;
        }

        /**
         * @return serviceEmail
         */
        public String getServiceEmail() {
            return this.serviceEmail;
        }

        /**
         * @return servicePhone
         */
        public String getServicePhone() {
            return this.servicePhone;
        }

        /**
         * @return serviceTerms
         */
        public String getServiceTerms() {
            return this.serviceTerms;
        }

        /**
         * @return serviceWebsite
         */
        public String getServiceWebsite() {
            return this.serviceWebsite;
        }

        /**
         * @return shelfResultList
         */
        public java.util.List<ShelfResultList> getShelfResultList() {
            return this.shelfResultList;
        }

        /**
         * @return signId
         */
        public Long getSignId() {
            return this.signId;
        }

        /**
         * @return signName
         */
        public String getSignName() {
            return this.signName;
        }

        public static final class Builder {
            private String backgroundImage; 
            private String bubbleColor; 
            private Long category; 
            private String chatbotCode; 
            private String chatbotName; 
            private String description; 
            private String latitude; 
            private String logo; 
            private String longitude; 
            private String officeAddress; 
            private java.util.List<RegisterResultList> registerResultList; 
            private String serviceEmail; 
            private String servicePhone; 
            private String serviceTerms; 
            private String serviceWebsite; 
            private java.util.List<ShelfResultList> shelfResultList; 
            private Long signId; 
            private String signName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.backgroundImage = model.backgroundImage;
                this.bubbleColor = model.bubbleColor;
                this.category = model.category;
                this.chatbotCode = model.chatbotCode;
                this.chatbotName = model.chatbotName;
                this.description = model.description;
                this.latitude = model.latitude;
                this.logo = model.logo;
                this.longitude = model.longitude;
                this.officeAddress = model.officeAddress;
                this.registerResultList = model.registerResultList;
                this.serviceEmail = model.serviceEmail;
                this.servicePhone = model.servicePhone;
                this.serviceTerms = model.serviceTerms;
                this.serviceWebsite = model.serviceWebsite;
                this.shelfResultList = model.shelfResultList;
                this.signId = model.signId;
                this.signName = model.signName;
            } 

            /**
             * BackgroundImage.
             */
            public Builder backgroundImage(String backgroundImage) {
                this.backgroundImage = backgroundImage;
                return this;
            }

            /**
             * BubbleColor.
             */
            public Builder bubbleColor(String bubbleColor) {
                this.bubbleColor = bubbleColor;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(Long category) {
                this.category = category;
                return this;
            }

            /**
             * ChatbotCode.
             */
            public Builder chatbotCode(String chatbotCode) {
                this.chatbotCode = chatbotCode;
                return this;
            }

            /**
             * ChatbotName.
             */
            public Builder chatbotName(String chatbotName) {
                this.chatbotName = chatbotName;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Latitude.
             */
            public Builder latitude(String latitude) {
                this.latitude = latitude;
                return this;
            }

            /**
             * Logo.
             */
            public Builder logo(String logo) {
                this.logo = logo;
                return this;
            }

            /**
             * Longitude.
             */
            public Builder longitude(String longitude) {
                this.longitude = longitude;
                return this;
            }

            /**
             * OfficeAddress.
             */
            public Builder officeAddress(String officeAddress) {
                this.officeAddress = officeAddress;
                return this;
            }

            /**
             * RegisterResultList.
             */
            public Builder registerResultList(java.util.List<RegisterResultList> registerResultList) {
                this.registerResultList = registerResultList;
                return this;
            }

            /**
             * ServiceEmail.
             */
            public Builder serviceEmail(String serviceEmail) {
                this.serviceEmail = serviceEmail;
                return this;
            }

            /**
             * ServicePhone.
             */
            public Builder servicePhone(String servicePhone) {
                this.servicePhone = servicePhone;
                return this;
            }

            /**
             * ServiceTerms.
             */
            public Builder serviceTerms(String serviceTerms) {
                this.serviceTerms = serviceTerms;
                return this;
            }

            /**
             * ServiceWebsite.
             */
            public Builder serviceWebsite(String serviceWebsite) {
                this.serviceWebsite = serviceWebsite;
                return this;
            }

            /**
             * ShelfResultList.
             */
            public Builder shelfResultList(java.util.List<ShelfResultList> shelfResultList) {
                this.shelfResultList = shelfResultList;
                return this;
            }

            /**
             * SignId.
             */
            public Builder signId(Long signId) {
                this.signId = signId;
                return this;
            }

            /**
             * SignName.
             */
            public Builder signName(String signName) {
                this.signName = signName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
