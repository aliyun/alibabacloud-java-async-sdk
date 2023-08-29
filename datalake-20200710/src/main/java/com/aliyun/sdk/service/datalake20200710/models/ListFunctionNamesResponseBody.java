// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFunctionNamesResponseBody} extends {@link TeaModel}
 *
 * <p>ListFunctionNamesResponseBody</p>
 */
public class ListFunctionNamesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("FunctionNames")
    private java.util.List < String > functionNames;

    @NameInMap("Message")
    private String message;

    @NameInMap("NextPageToken")
    private String nextPageToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListFunctionNamesResponseBody(Builder builder) {
        this.code = builder.code;
        this.functionNames = builder.functionNames;
        this.message = builder.message;
        this.nextPageToken = builder.nextPageToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFunctionNamesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return functionNames
     */
    public java.util.List < String > getFunctionNames() {
        return this.functionNames;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
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
        private java.util.List < String > functionNames; 
        private String message; 
        private String nextPageToken; 
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
         * FunctionNames.
         */
        public Builder functionNames(java.util.List < String > functionNames) {
            this.functionNames = functionNames;
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
         * NextPageToken.
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
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

        public ListFunctionNamesResponseBody build() {
            return new ListFunctionNamesResponseBody(this);
        } 

    } 

}
