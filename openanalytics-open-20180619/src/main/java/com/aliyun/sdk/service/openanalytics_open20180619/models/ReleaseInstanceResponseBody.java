// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ReleaseInstanceResponseBody</p>
 */
public class ReleaseInstanceResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorInfo")
    private String errorInfo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private String result;

    @NameInMap("Success")
    private Boolean success;

    private ReleaseInstanceResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorInfo = builder.errorInfo;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorInfo
     */
    public String getErrorInfo() {
        return this.errorInfo;
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
    public String getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorInfo; 
        private String requestId; 
        private String result; 
        private Boolean success; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorInfo.
         */
        public Builder errorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
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
        public Builder result(String result) {
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

        public ReleaseInstanceResponseBody build() {
            return new ReleaseInstanceResponseBody(this);
        } 

    } 

}
