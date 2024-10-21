// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SubmitDomainSpecialBizCredentialsResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitDomainSpecialBizCredentialsResponseBody</p>
 */
public class SubmitDomainSpecialBizCredentialsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AllowRetry")
    private Boolean allowRetry;

    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorArgs")
    private java.util.List < ? > errorArgs;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Module")
    private Object module;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Synchro")
    private Boolean synchro;

    private SubmitDomainSpecialBizCredentialsResponseBody(Builder builder) {
        this.allowRetry = builder.allowRetry;
        this.appName = builder.appName;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorArgs = builder.errorArgs;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.httpStatusCode = builder.httpStatusCode;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.synchro = builder.synchro;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitDomainSpecialBizCredentialsResponseBody create() {
        return builder().build();
    }

    /**
     * @return allowRetry
     */
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errorArgs
     */
    public java.util.List < ? > getErrorArgs() {
        return this.errorArgs;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return module
     */
    public Object getModule() {
        return this.module;
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

    /**
     * @return synchro
     */
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static final class Builder {
        private Boolean allowRetry; 
        private String appName; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private java.util.List < ? > errorArgs; 
        private String errorCode; 
        private String errorMsg; 
        private Integer httpStatusCode; 
        private Object module; 
        private String requestId; 
        private Boolean success; 
        private Boolean synchro; 

        /**
         * <p>Indicates whether retries are allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder allowRetry(Boolean allowRetry) {
            this.allowRetry = allowRetry;
            return this;
        }

        /**
         * <p>The name of the application for which the error code is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>test-com</p>
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * <p>The dynamic error code.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic error message.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The array of error parameters that are returned.</p>
         */
        public Builder errorArgs(java.util.List < ? > errorArgs) {
            this.errorArgs = errorArgs;
            return this;
        }

        /**
         * <p>The error code.</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>110001</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>The HTTP status code that is directly returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder module(Object module) {
            this.module = module;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A83E1D74-E46B-505C-947A-8C6B7E41C011</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>Indicates whether to perform synchronous processing.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder synchro(Boolean synchro) {
            this.synchro = synchro;
            return this;
        }

        public SubmitDomainSpecialBizCredentialsResponseBody build() {
            return new SubmitDomainSpecialBizCredentialsResponseBody(this);
        } 

    } 

}
