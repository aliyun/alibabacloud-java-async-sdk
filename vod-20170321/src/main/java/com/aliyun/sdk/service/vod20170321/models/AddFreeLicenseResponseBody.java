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
 * {@link AddFreeLicenseResponseBody} extends {@link TeaModel}
 *
 * <p>AddFreeLicenseResponseBody</p>
 */
public class AddFreeLicenseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("LicenseList")
    private java.util.List<LicenseList> licenseList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private AddFreeLicenseResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.licenseList = builder.licenseList;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddFreeLicenseResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return licenseList
     */
    public java.util.List<LicenseList> getLicenseList() {
        return this.licenseList;
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
        private Integer httpStatusCode; 
        private java.util.List<LicenseList> licenseList; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(AddFreeLicenseResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.licenseList = model.licenseList;
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * LicenseList.
         */
        public Builder licenseList(java.util.List<LicenseList> licenseList) {
            this.licenseList = licenseList;
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

        public AddFreeLicenseResponseBody build() {
            return new AddFreeLicenseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddFreeLicenseResponseBody} extends {@link TeaModel}
     *
     * <p>AddFreeLicenseResponseBody</p>
     */
    public static class LicenseList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppItemId")
        private String appItemId;

        @com.aliyun.core.annotation.NameInMap("BusinessType")
        private String businessType;

        @com.aliyun.core.annotation.NameInMap("LicenseId")
        private Long licenseId;

        @com.aliyun.core.annotation.NameInMap("LicenseItemId")
        private String licenseItemId;

        @com.aliyun.core.annotation.NameInMap("SdkType")
        private String sdkType;

        private LicenseList(Builder builder) {
            this.appItemId = builder.appItemId;
            this.businessType = builder.businessType;
            this.licenseId = builder.licenseId;
            this.licenseItemId = builder.licenseItemId;
            this.sdkType = builder.sdkType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LicenseList create() {
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
         * @return licenseId
         */
        public Long getLicenseId() {
            return this.licenseId;
        }

        /**
         * @return licenseItemId
         */
        public String getLicenseItemId() {
            return this.licenseItemId;
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
            private Long licenseId; 
            private String licenseItemId; 
            private String sdkType; 

            private Builder() {
            } 

            private Builder(LicenseList model) {
                this.appItemId = model.appItemId;
                this.businessType = model.businessType;
                this.licenseId = model.licenseId;
                this.licenseItemId = model.licenseItemId;
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
             * LicenseId.
             */
            public Builder licenseId(Long licenseId) {
                this.licenseId = licenseId;
                return this;
            }

            /**
             * LicenseItemId.
             */
            public Builder licenseItemId(String licenseItemId) {
                this.licenseItemId = licenseItemId;
                return this;
            }

            /**
             * SdkType.
             */
            public Builder sdkType(String sdkType) {
                this.sdkType = sdkType;
                return this;
            }

            public LicenseList build() {
                return new LicenseList(this);
            } 

        } 

    }
}
