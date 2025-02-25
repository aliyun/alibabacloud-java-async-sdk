// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ReDeployLhDagVersionResponseBody} extends {@link TeaModel}
 *
 * <p>ReDeployLhDagVersionResponseBody</p>
 */
public class ReDeployLhDagVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeployId")
    private Long deployId;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The ID of the deployment record.</p>
         * 
         * <strong>example:</strong>
         * <p>15990</p>
         */
        public Builder deployId(Long deployId) {
            this.deployId = deployId;
            return this;
        }

        /**
         * <p>The error code returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>403</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>035C92E0-2EAD-50E5-A6DD-550F5F73D7CE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request is successful.</li>
         * <li><strong>false</strong>: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
