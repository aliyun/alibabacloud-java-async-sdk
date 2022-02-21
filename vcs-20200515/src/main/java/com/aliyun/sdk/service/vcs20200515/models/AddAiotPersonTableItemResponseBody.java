// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddAiotPersonTableItemResponseBody} extends {@link TeaModel}
 *
 * <p>AddAiotPersonTableItemResponseBody</p>
 */
public class AddAiotPersonTableItemResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PersonTableItemId")
    private String personTableItemId;

    @NameInMap("RequestId")
    private String requestId;

    private AddAiotPersonTableItemResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.personTableItemId = builder.personTableItemId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAiotPersonTableItemResponseBody create() {
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
     * @return personTableItemId
     */
    public String getPersonTableItemId() {
        return this.personTableItemId;
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
        private String personTableItemId; 
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
         * PersonTableItemId.
         */
        public Builder personTableItemId(String personTableItemId) {
            this.personTableItemId = personTableItemId;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddAiotPersonTableItemResponseBody build() {
            return new AddAiotPersonTableItemResponseBody(this);
        } 

    } 

}
