// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGroupMonitoringAgentProcessResponseBody} extends {@link TeaModel}
 *
 * <p>CreateGroupMonitoringAgentProcessResponseBody</p>
 */
public class CreateGroupMonitoringAgentProcessResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Resource")
    private Resource resource;

    @NameInMap("Success")
    private Boolean success;

    private CreateGroupMonitoringAgentProcessResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resource = builder.resource;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGroupMonitoringAgentProcessResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resource
     */
    public Resource getResource() {
        return this.resource;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Resource resource; 
        private Boolean success; 

        /**
         * The status code.
         * <p>
         * 
         * > The status code 200 indicates that the call is successful.
         */
        public Builder code(String code) {
            this.code = code;
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The group process information.
         */
        public Builder resource(Resource resource) {
            this.resource = resource;
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

        public CreateGroupMonitoringAgentProcessResponseBody build() {
            return new CreateGroupMonitoringAgentProcessResponseBody(this);
        } 

    } 

    public static class Resource extends TeaModel {
        @NameInMap("GroupProcessId")
        private String groupProcessId;

        private Resource(Builder builder) {
            this.groupProcessId = builder.groupProcessId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return groupProcessId
         */
        public String getGroupProcessId() {
            return this.groupProcessId;
        }

        public static final class Builder {
            private String groupProcessId; 

            /**
             * The ID of the group process.
             */
            public Builder groupProcessId(String groupProcessId) {
                this.groupProcessId = groupProcessId;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
}
