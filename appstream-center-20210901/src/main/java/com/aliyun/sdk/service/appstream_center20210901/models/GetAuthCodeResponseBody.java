// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link GetAuthCodeResponseBody} extends {@link TeaModel}
 *
 * <p>GetAuthCodeResponseBody</p>
 */
public class GetAuthCodeResponseBody extends TeaModel {
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

    private GetAuthCodeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuthCodeResponseBody create() {
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

        private Builder() {
        } 

        private Builder(GetAuthCodeResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code. This field is returned when the request fails. A successful response may not contain this field.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The business data returned by the operation.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error or result message. This field describes the cause when the request fails. A successful response may not contain this field.</p>
         * 
         * <strong>example:</strong>
         * <p>Internal error.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique identifier of the request. You can provide this value for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>01A1A962-5503-107B-AC8F-EBA85DF905AC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was processed successfully. A value of true indicates that the request was processed successfully. To check whether an asynchronous task is completed, you must query the task status separately.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAuthCodeResponseBody build() {
            return new GetAuthCodeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAuthCodeResponseBody} extends {@link TeaModel}
     *
     * <p>GetAuthCodeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessType")
        private String accessType;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
        private String appInstanceGroupId;

        @com.aliyun.core.annotation.NameInMap("AppVersionId")
        private String appVersionId;

        @com.aliyun.core.annotation.NameInMap("AuthCode")
        private String authCode;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Data(Builder builder) {
            this.accessType = builder.accessType;
            this.appId = builder.appId;
            this.appInstanceGroupId = builder.appInstanceGroupId;
            this.appVersionId = builder.appVersionId;
            this.authCode = builder.authCode;
            this.productType = builder.productType;
            this.regionId = builder.regionId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accessType
         */
        public String getAccessType() {
            return this.accessType;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appInstanceGroupId
         */
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        /**
         * @return appVersionId
         */
        public String getAppVersionId() {
            return this.appVersionId;
        }

        /**
         * @return authCode
         */
        public String getAuthCode() {
            return this.authCode;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String accessType; 
            private String appId; 
            private String appInstanceGroupId; 
            private String appVersionId; 
            private String authCode; 
            private String productType; 
            private String regionId; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accessType = model.accessType;
                this.appId = model.appId;
                this.appInstanceGroupId = model.appInstanceGroupId;
                this.appVersionId = model.appVersionId;
                this.authCode = model.authCode;
                this.productType = model.productType;
                this.regionId = model.regionId;
                this.userId = model.userId;
            } 

            /**
             * <p>The network access type supported by the connection resource.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><strong>INTERNET</strong>: Supports Internet access.</li>
             * <li><strong>VPC</strong>: Supports virtual private cloud (VPC) access.</li>
             * <li><strong>ANY</strong>: Supports both Internet and VPC access.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>INTERNET</p>
             */
            public Builder accessType(String accessType) {
                this.accessType = accessType;
                return this;
            }

            /**
             * <p>The application ID, which is used for subsequent application queries or unbinding the image.</p>
             * 
             * <strong>example:</strong>
             * <p>app-bp1example****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The delivery group ID of the building or validation resource. This ID is used together with the user and application information in the current response during connection.</p>
             * 
             * <strong>example:</strong>
             * <p>aig-bp1example****</p>
             */
            public Builder appInstanceGroupId(String appInstanceGroupId) {
                this.appInstanceGroupId = appInstanceGroupId;
                return this;
            }

            /**
             * <p>The application version ID, which is used to locate a specific version of the application. This field is not the image version ID.</p>
             * 
             * <strong>example:</strong>
             * <p>apv-bp1example****</p>
             */
            public Builder appVersionId(String appVersionId) {
                this.appVersionId = appVersionId;
                return this;
            }

            /**
             * <p>The authorization code used to connect to the current building or validation resource. <strong>The validity period is 180 seconds (3 minutes) from the time of issuance. Use it promptly after obtaining it.</strong> Use this code together with the user, delivery group, and application information in the same response, and keep it confidential as a connection credential.</p>
             * <p>Do not reuse the authorization code after it is successfully redeemed. If the code has been used or has expired, call this operation again to obtain a new one.</p>
             * 
             * <strong>example:</strong>
             * <p>e4e169bea1cc48e8afac53**********</p>
             */
            public Builder authCode(String authCode) {
                this.authCode = authCode;
                return this;
            }

            /**
             * <p>The usage type of the connection resource.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><strong>ImageBuilder</strong>: image or application building resource</li>
             * <li><strong>ImageValidate</strong>: image or application validation resource</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ImageBuilder</p>
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * <p>The region ID in the current response.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The user ID used when connecting to the building or validation environment. Use the value returned in the current response.</p>
             * 
             * <strong>example:</strong>
             * <p><strong>vhd_builder</strong></p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
