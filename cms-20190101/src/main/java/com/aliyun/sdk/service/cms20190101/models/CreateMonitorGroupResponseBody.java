// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMonitorGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMonitorGroupResponseBody</p>
 */
public class CreateMonitorGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("GroupId")
    private Long groupId;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CreateMonitorGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.groupId = builder.groupId;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMonitorGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
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
        private Integer code; 
        private Long groupId; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The response code.
         * <p>
         * 
         * >  The value 200 indicates that the call was successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The ID of the application group.
         */
        public Builder groupId(Long groupId) {
            this.groupId = groupId;
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
         * Indicates whether the call was successful. Valid values:
         * <p>
         * 
         * *   true: The call was successful.
         * *   false: The call failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateMonitorGroupResponseBody build() {
            return new CreateMonitorGroupResponseBody(this);
        } 

    } 

}
