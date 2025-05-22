// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link UpdateServiceInstanceAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceInstanceAttributeRequest</p>
 */
public class UpdateServiceInstanceAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LicenseData")
    private LicenseData licenseData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceInstanceId;

    private UpdateServiceInstanceAttributeRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.licenseData = builder.licenseData;
        this.reason = builder.reason;
        this.regionId = builder.regionId;
        this.serviceInstanceId = builder.serviceInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServiceInstanceAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return licenseData
     */
    public LicenseData getLicenseData() {
        return this.licenseData;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serviceInstanceId
     */
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public static final class Builder extends Request.Builder<UpdateServiceInstanceAttributeRequest, Builder> {
        private String endTime; 
        private LicenseData licenseData; 
        private String reason; 
        private String regionId; 
        private String serviceInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServiceInstanceAttributeRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.licenseData = request.licenseData;
            this.reason = request.reason;
            this.regionId = request.regionId;
            this.serviceInstanceId = request.serviceInstanceId;
        } 

        /**
         * <p>The time when the service instance expires.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-25T02:28:40Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The License Data</p>
         */
        public Builder licenseData(LicenseData licenseData) {
            String licenseDataShrink = shrink(licenseData, "LicenseData", "json");
            this.putQueryParameter("LicenseData", licenseDataShrink);
            this.licenseData = licenseData;
            return this;
        }

        /**
         * <p>Application reason, currently used for trial application extension.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The service instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>si-3df88e962cdexxxxxxxx</p>
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.putQueryParameter("ServiceInstanceId", serviceInstanceId);
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }

        @Override
        public UpdateServiceInstanceAttributeRequest build() {
            return new UpdateServiceInstanceAttributeRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateServiceInstanceAttributeRequest} extends {@link TeaModel}
     *
     * <p>UpdateServiceInstanceAttributeRequest</p>
     */
    public static class ResponseInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("UpdateResponse")
        private Boolean updateResponse;

        private ResponseInfo(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.updateResponse = builder.updateResponse;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResponseInfo create() {
            return builder().build();
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
         * @return updateResponse
         */
        public Boolean getUpdateResponse() {
            return this.updateResponse;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private Boolean updateResponse; 

            private Builder() {
            } 

            private Builder(ResponseInfo model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.updateResponse = model.updateResponse;
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
             * UpdateResponse.
             */
            public Builder updateResponse(Boolean updateResponse) {
                this.updateResponse = updateResponse;
                return this;
            }

            public ResponseInfo build() {
                return new ResponseInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateServiceInstanceAttributeRequest} extends {@link TeaModel}
     *
     * <p>UpdateServiceInstanceAttributeRequest</p>
     */
    public static class LicenseData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomData")
        private String customData;

        @com.aliyun.core.annotation.NameInMap("ResponseInfo")
        private ResponseInfo responseInfo;

        private LicenseData(Builder builder) {
            this.customData = builder.customData;
            this.responseInfo = builder.responseInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LicenseData create() {
            return builder().build();
        }

        /**
         * @return customData
         */
        public String getCustomData() {
            return this.customData;
        }

        /**
         * @return responseInfo
         */
        public ResponseInfo getResponseInfo() {
            return this.responseInfo;
        }

        public static final class Builder {
            private String customData; 
            private ResponseInfo responseInfo; 

            private Builder() {
            } 

            private Builder(LicenseData model) {
                this.customData = model.customData;
                this.responseInfo = model.responseInfo;
            } 

            /**
             * <p>The Custom Data</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Test&quot;}</p>
             */
            public Builder customData(String customData) {
                this.customData = customData;
                return this;
            }

            /**
             * ResponseInfo.
             */
            public Builder responseInfo(ResponseInfo responseInfo) {
                this.responseInfo = responseInfo;
                return this;
            }

            public LicenseData build() {
                return new LicenseData(this);
            } 

        } 

    }
}
