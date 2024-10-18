// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ExecDeploymentStageResponseBody} extends {@link TeaModel}
 *
 * <p>ExecDeploymentStageResponseBody</p>
 */
public class ExecDeploymentStageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ExecDeploymentStageResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecDeploymentStageResponseBody create() {
        return builder().build();
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
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AFBB799F-8578-51C5-A766-E922EDB8XXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * </li>
         * <li><p>false</p>
         * <p>**</p>
         * <p><strong>Note:</strong> The value of this parameter indicates only whether the stage is triggered but does not indicate whether the execution of the stage is successful.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ExecDeploymentStageResponseBody build() {
            return new ExecDeploymentStageResponseBody(this);
        } 

    } 

}
