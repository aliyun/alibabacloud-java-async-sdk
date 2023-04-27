// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReDeployLhDagVersionResponseBody} extends {@link TeaModel}
 *
 * <p>ReDeployLhDagVersionResponseBody</p>
 */
public class ReDeployLhDagVersionResponseBody extends TeaModel {
    @NameInMap("DeployId")
    private Long deployId;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ReDeployLhDagVersionResponseBody(Builder builder) {
        this.deployId = builder.deployId;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReDeployLhDagVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return deployId
     */
    public Long getDeployId() {
        return this.deployId;
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
        private Long deployId; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * DeployId.
         */
        public Builder deployId(Long deployId) {
            this.deployId = deployId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **ReDeployLhDagVersion**.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The error code returned if the request fails.
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

        public ReDeployLhDagVersionResponseBody build() {
            return new ReDeployLhDagVersionResponseBody(this);
        } 

    } 

}
