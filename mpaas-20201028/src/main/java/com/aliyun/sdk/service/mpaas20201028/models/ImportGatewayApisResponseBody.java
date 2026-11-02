// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

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
 * {@link ImportGatewayApisResponseBody} extends {@link TeaModel}
 *
 * <p>ImportGatewayApisResponseBody</p>
 */
public class ImportGatewayApisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("ApiCount")
    private Integer apiCount;

    @com.aliyun.core.annotation.NameInMap("DownloadUrl")
    private String downloadUrl;

    @com.aliyun.core.annotation.NameInMap("ErrorField")
    private String errorField;

    @com.aliyun.core.annotation.NameInMap("GroupCount")
    private Integer groupCount;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ImportGatewayApisResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.apiCount = builder.apiCount;
        this.downloadUrl = builder.downloadUrl;
        this.errorField = builder.errorField;
        this.groupCount = builder.groupCount;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportGatewayApisResponseBody create() {
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
     * @return apiCount
     */
    public Integer getApiCount() {
        return this.apiCount;
    }

    /**
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * @return errorField
     */
    public String getErrorField() {
        return this.errorField;
    }

    /**
     * @return groupCount
     */
    public Integer getGroupCount() {
        return this.groupCount;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultMessage
     */
    public String getResultMessage() {
        return this.resultMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Integer apiCount; 
        private String downloadUrl; 
        private String errorField; 
        private Integer groupCount; 
        private Integer httpStatusCode; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ImportGatewayApisResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.apiCount = model.apiCount;
            this.downloadUrl = model.downloadUrl;
            this.errorField = model.errorField;
            this.groupCount = model.groupCount;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.resultCode = model.resultCode;
            this.resultMessage = model.resultMessage;
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
         * ApiCount.
         */
        public Builder apiCount(Integer apiCount) {
            this.apiCount = apiCount;
            return this;
        }

        /**
         * DownloadUrl.
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * ErrorField.
         */
        public Builder errorField(String errorField) {
            this.errorField = errorField;
            return this;
        }

        /**
         * GroupCount.
         */
        public Builder groupCount(Integer groupCount) {
            this.groupCount = groupCount;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultCode.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * ResultMessage.
         */
        public Builder resultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ImportGatewayApisResponseBody build() {
            return new ImportGatewayApisResponseBody(this);
        } 

    } 

}
