// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBaselineResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBaselineResponseBody</p>
 */
public class CreateBaselineResponseBody extends TeaModel {
    @NameInMap("Data")
    private Long data;

    @NameInMap("DynamicErrorCode")
    private String dynamicErrorCode;

    @NameInMap("DynamicErrorMessage")
    private String dynamicErrorMessage;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CreateBaselineResponseBody(Builder builder) {
        this.data = builder.data;
        this.dynamicErrorCode = builder.dynamicErrorCode;
        this.dynamicErrorMessage = builder.dynamicErrorMessage;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBaselineResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Long getData() {
        return this.data;
    }

    /**
     * @return dynamicErrorCode
     */
    public String getDynamicErrorCode() {
        return this.dynamicErrorCode;
    }

    /**
     * @return dynamicErrorMessage
     */
    public String getDynamicErrorMessage() {
        return this.dynamicErrorMessage;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long data; 
        private String dynamicErrorCode; 
        private String dynamicErrorMessage; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Long data) {
            this.data = data;
            return this;
        }

        /**
         * DynamicErrorCode.
         */
        public Builder dynamicErrorCode(String dynamicErrorCode) {
            this.dynamicErrorCode = dynamicErrorCode;
            return this;
        }

        /**
         * DynamicErrorMessage.
         */
        public Builder dynamicErrorMessage(String dynamicErrorMessage) {
            this.dynamicErrorMessage = dynamicErrorMessage;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateBaselineResponseBody build() {
            return new CreateBaselineResponseBody(this);
        } 

    } 

}
