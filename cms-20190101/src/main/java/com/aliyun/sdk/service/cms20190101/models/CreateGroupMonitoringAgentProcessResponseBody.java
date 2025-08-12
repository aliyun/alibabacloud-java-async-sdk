// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateGroupMonitoringAgentProcessResponseBody} extends {@link TeaModel}
 *
 * <p>CreateGroupMonitoringAgentProcessResponseBody</p>
 */
public class CreateGroupMonitoringAgentProcessResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resource")
    private Resource resource;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateGroupMonitoringAgentProcessResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resource = model.resource;
            this.success = model.success;
        } 

        /**
         * <p>The status code.</p>
         * <blockquote>
         * <p>The status code 200 indicates that the call is successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The Request is not authorization.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3F6150F9-45C7-43F9-9578-A58B2E726C90</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The group process information.</p>
         */
        public Builder resource(Resource resource) {
            this.resource = resource;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. Valid values:</p>
         * <ul>
         * <li>true: The call is successful.</li>
         * <li>false: The call fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateGroupMonitoringAgentProcessResponseBody build() {
            return new CreateGroupMonitoringAgentProcessResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateGroupMonitoringAgentProcessResponseBody} extends {@link TeaModel}
     *
     * <p>CreateGroupMonitoringAgentProcessResponseBody</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupProcessId")
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

            private Builder() {
            } 

            private Builder(Resource model) {
                this.groupProcessId = model.groupProcessId;
            } 

            /**
             * <p>The ID of the group process.</p>
             * 
             * <strong>example:</strong>
             * <p>7F2B0024-4F21-48B9-A764-211CEC48****</p>
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
