// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishAndDeployTaskFlowResponseBody} extends {@link TeaModel}
 *
 * <p>PublishAndDeployTaskFlowResponseBody</p>
 */
public class PublishAndDeployTaskFlowResponseBody extends TeaModel {
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

    private PublishAndDeployTaskFlowResponseBody(Builder builder) {
        this.deployId = builder.deployId;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishAndDeployTaskFlowResponseBody create() {
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
         * <PublishAndDeployTaskFlowResponse>
         * <p>
         *     <RequestId>64E26249-B61F-51C6-B6DF-47EFF50128CC</RequestId>
         *     <ErrorCode>UnknownError</ErrorCode>
         *     <ErrorMessage>Unknown server error</ErrorMessage>
         *     <Success>true</Success>
         * </PublishAndDeployTaskFlowResponse>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * Publishes and deploys a task flow.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * 12**
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WB01220210
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public PublishAndDeployTaskFlowResponseBody build() {
            return new PublishAndDeployTaskFlowResponseBody(this);
        } 

    } 

}
