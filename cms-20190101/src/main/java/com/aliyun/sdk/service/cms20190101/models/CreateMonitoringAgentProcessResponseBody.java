// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMonitoringAgentProcessResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMonitoringAgentProcessResponseBody</p>
 */
public class CreateMonitoringAgentProcessResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Id")
    private Long id;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CreateMonitoringAgentProcessResponseBody(Builder builder) {
        this.code = builder.code;
        this.id = builder.id;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMonitoringAgentProcessResponseBody create() {
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
    public Long getId() {
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
        private Long id; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The error message.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Indicates whether the call was successful. Valid values:
         * <p>
         * 
         * *   true: The call was successful.
         * *   false: The call failed.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the process.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateMonitoringAgentProcessResponseBody build() {
            return new CreateMonitoringAgentProcessResponseBody(this);
        } 

    } 

}
