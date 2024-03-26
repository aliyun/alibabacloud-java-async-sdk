// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resellertrade20191227.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveActivityResponseBody} extends {@link TeaModel}
 *
 * <p>SaveActivityResponseBody</p>
 */
public class SaveActivityResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ContextMap")
    private java.util.Map < String, ? > contextMap;

    @NameInMap("Data")
    private java.util.List < Long > data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private SaveActivityResponseBody(Builder builder) {
        this.code = builder.code;
        this.contextMap = builder.contextMap;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveActivityResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return contextMap
     */
    public java.util.Map < String, ? > getContextMap() {
        return this.contextMap;
    }

    /**
     * @return data
     */
    public java.util.List < Long > getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private java.util.Map < String, ? > contextMap; 
        private java.util.List < Long > data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ContextMap.
         */
        public Builder contextMap(java.util.Map < String, ? > contextMap) {
            this.contextMap = contextMap;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Long > data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public SaveActivityResponseBody build() {
            return new SaveActivityResponseBody(this);
        } 

    } 

}
