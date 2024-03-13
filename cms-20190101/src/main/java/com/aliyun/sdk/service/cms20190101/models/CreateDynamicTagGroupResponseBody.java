// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDynamicTagGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDynamicTagGroupResponseBody</p>
 */
public class CreateDynamicTagGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Id")
    private String id;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CreateDynamicTagGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.id = builder.id;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDynamicTagGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
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
        private String id; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call is successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The ID of the tag matching rule.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call is successful. Valid values:
         * <p>
         * 
         * *   true: The call is successful.
         * *   false: The call fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateDynamicTagGroupResponseBody build() {
            return new CreateDynamicTagGroupResponseBody(this);
        } 

    } 

}
