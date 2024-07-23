// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEngineVersionMetadataResponseBody} extends {@link TeaModel}
 *
 * <p>ListEngineVersionMetadataResponseBody</p>
 */
public class ListEngineVersionMetadataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private EngineVersionMetadataIndex data;

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

    private ListEngineVersionMetadataResponseBody(Builder builder) {
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

    public static ListEngineVersionMetadataResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public EngineVersionMetadataIndex getData() {
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
        private EngineVersionMetadataIndex data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * *   If the value of success was true, the engine versions that are supported by Realtime Compute for Apache Flink were returned.
         * <p>
         * *   If the value of success was false, a null value was returned.
         */
        public Builder data(EngineVersionMetadataIndex data) {
            this.data = data;
            return this;
        }

        /**
         * *   If the value of success was false, an error code was returned.
         * <p>
         * *   If the value of success was true, a null value was returned.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * *   If the value of success was false, an error message was returned.
         * <p>
         * *   If the value of success was true, a null value was returned.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The value was fixed to 200.
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListEngineVersionMetadataResponseBody build() {
            return new ListEngineVersionMetadataResponseBody(this);
        } 

    } 

}
