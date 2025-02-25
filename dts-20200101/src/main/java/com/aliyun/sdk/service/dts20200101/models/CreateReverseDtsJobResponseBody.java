// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link CreateReverseDtsJobResponseBody} extends {@link TeaModel}
 *
 * <p>CreateReverseDtsJobResponseBody</p>
 */
public class CreateReverseDtsJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DtsInstanceId")
    private String dtsInstanceId;

    @com.aliyun.core.annotation.NameInMap("DtsJobId")
    private String dtsJobId;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private CreateReverseDtsJobResponseBody(Builder builder) {
        this.dtsInstanceId = builder.dtsInstanceId;
        this.dtsJobId = builder.dtsJobId;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateReverseDtsJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return dtsInstanceId
     */
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String dtsInstanceId; 
        private String dtsJobId; 
        private String errCode; 
        private String errMessage; 
        private String httpStatusCode; 
        private String requestId; 
        private String success; 

        /**
         * <p>The ID of the instance corresponding to the generated reverse task.</p>
         * 
         * <strong>example:</strong>
         * <p>dtsor1f9kr822l****</p>
         */
        public Builder dtsInstanceId(String dtsInstanceId) {
            this.dtsInstanceId = dtsInstanceId;
            return this;
        }

        /**
         * <p>The ID of the generated reverse synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>n99m9jx822k****</p>
         */
        public Builder dtsJobId(String dtsJobId) {
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * <p>Error code returned when the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>Error message returned when the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>The Value of Input Parameter %s is not valid.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>Status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>621BB4F8-3016-4FAA-8D5A-5D3163CC****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public CreateReverseDtsJobResponseBody build() {
            return new CreateReverseDtsJobResponseBody(this);
        } 

    } 

}
