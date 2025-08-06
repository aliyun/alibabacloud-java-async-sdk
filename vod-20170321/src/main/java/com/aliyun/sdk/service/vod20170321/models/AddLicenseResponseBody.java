// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link AddLicenseResponseBody} extends {@link TeaModel}
 *
 * <p>AddLicenseResponseBody</p>
 */
public class AddLicenseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private AddLicenseResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddLicenseResponseBody create() {
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
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(AddLicenseResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
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
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public AddLicenseResponseBody build() {
            return new AddLicenseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddLicenseResponseBody} extends {@link TeaModel}
     *
     * <p>AddLicenseResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppItemId")
        private String appItemId;

        @com.aliyun.core.annotation.NameInMap("BusinessType")
        private String businessType;

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private String itemId;

        @com.aliyun.core.annotation.NameInMap("LicenseId")
        private Long licenseId;

        @com.aliyun.core.annotation.NameInMap("SdkType")
        private String sdkType;

        private Data(Builder builder) {
            this.appItemId = builder.appItemId;
            this.businessType = builder.businessType;
            this.itemId = builder.itemId;
            this.licenseId = builder.licenseId;
            this.sdkType = builder.sdkType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appItemId
         */
        public String getAppItemId() {
            return this.appItemId;
        }

        /**
         * @return businessType
         */
        public String getBusinessType() {
            return this.businessType;
        }

        /**
         * @return itemId
         */
        public String getItemId() {
            return this.itemId;
        }

        /**
         * @return licenseId
         */
        public Long getLicenseId() {
            return this.licenseId;
        }

        /**
         * @return sdkType
         */
        public String getSdkType() {
            return this.sdkType;
        }

        public static final class Builder {
            private String appItemId; 
            private String businessType; 
            private String itemId; 
            private Long licenseId; 
            private String sdkType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appItemId = model.appItemId;
                this.businessType = model.businessType;
                this.itemId = model.itemId;
                this.licenseId = model.licenseId;
                this.sdkType = model.sdkType;
            } 

            /**
             * AppItemId.
             */
            public Builder appItemId(String appItemId) {
                this.appItemId = appItemId;
                return this;
            }

            /**
             * BusinessType.
             */
            public Builder businessType(String businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * ItemId.
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * LicenseId.
             */
            public Builder licenseId(Long licenseId) {
                this.licenseId = licenseId;
                return this;
            }

            /**
             * SdkType.
             */
            public Builder sdkType(String sdkType) {
                this.sdkType = sdkType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
