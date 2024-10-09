// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateDeploymentResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateDeploymentResponseBody</p>
 */
public class UpdateDeploymentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Deployment data;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private UpdateDeploymentResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDeploymentResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Deployment getData() {
        return this.data;
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
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
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
        private Deployment data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * <ul>
         * <li>If the value of success was true, the information about the deployment after the update was returned.</li>
         * <li>If the value of success was false, a null value was returned.</li>
         * </ul>
         */
        public Builder data(Deployment data) {
            this.data = data;
            return this;
        }

        /**
         * <ul>
         * <li>If the value of success was false, an error code was returned.</li>
         * <li>If the value of success was true, a null value was returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <ul>
         * <li>If the value of success was false, an error message was returned.</li>
         * <li>If the value of success was true, a null value was returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The value was fixed to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CBC799F0-AS7S-1D30-8A4F-882ED4DD****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateDeploymentResponseBody build() {
            return new UpdateDeploymentResponseBody(this);
        } 

    } 

}
