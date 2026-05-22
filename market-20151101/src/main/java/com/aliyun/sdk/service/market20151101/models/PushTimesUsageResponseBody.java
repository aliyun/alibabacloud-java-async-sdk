// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

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
 * {@link PushTimesUsageResponseBody} extends {@link TeaModel}
 *
 * <p>PushTimesUsageResponseBody</p>
 */
public class PushTimesUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ForceFatal")
    private Boolean forceFatal;

    @com.aliyun.core.annotation.NameInMap("HttpStateCode")
    private String httpStateCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Boolean result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private PushTimesUsageResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.forceFatal = builder.forceFatal;
        this.httpStateCode = builder.httpStateCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushTimesUsageResponseBody create() {
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
     * @return forceFatal
     */
    public Boolean getForceFatal() {
        return this.forceFatal;
    }

    /**
     * @return httpStateCode
     */
    public String getHttpStateCode() {
        return this.httpStateCode;
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
     * @return result
     */
    public Boolean getResult() {
        return this.result;
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
        private Boolean forceFatal; 
        private String httpStateCode; 
        private String message; 
        private String requestId; 
        private Boolean result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(PushTimesUsageResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.forceFatal = model.forceFatal;
            this.httpStateCode = model.httpStateCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
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
         * ForceFatal.
         */
        public Builder forceFatal(Boolean forceFatal) {
            this.forceFatal = forceFatal;
            return this;
        }

        /**
         * HttpStateCode.
         */
        public Builder httpStateCode(String httpStateCode) {
            this.httpStateCode = httpStateCode;
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
         * Result.
         */
        public Builder result(Boolean result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public PushTimesUsageResponseBody build() {
            return new PushTimesUsageResponseBody(this);
        } 

    } 

}
