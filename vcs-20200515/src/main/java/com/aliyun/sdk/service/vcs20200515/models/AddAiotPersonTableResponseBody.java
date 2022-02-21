// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddAiotPersonTableResponseBody} extends {@link TeaModel}
 *
 * <p>AddAiotPersonTableResponseBody</p>
 */
public class AddAiotPersonTableResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PersonTableId")
    private String personTableId;

    @NameInMap("RequestId")
    private String requestId;

    private AddAiotPersonTableResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.personTableId = builder.personTableId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAiotPersonTableResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return personTableId
     */
    public String getPersonTableId() {
        return this.personTableId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String personTableId; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * PersonTableId.
         */
        public Builder personTableId(String personTableId) {
            this.personTableId = personTableId;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddAiotPersonTableResponseBody build() {
            return new AddAiotPersonTableResponseBody(this);
        } 

    } 

}
