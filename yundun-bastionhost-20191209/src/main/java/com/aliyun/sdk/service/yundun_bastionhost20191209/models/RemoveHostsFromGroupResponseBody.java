// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveHostsFromGroupResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveHostsFromGroupResponseBody</p>
 */
public class RemoveHostsFromGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Results")
    private java.util.List < Results> results;

    private RemoveHostsFromGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.results = builder.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveHostsFromGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return results
     */
    public java.util.List < Results> getResults() {
        return this.results;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Results> results; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The result of the call.
         */
        public Builder results(java.util.List < Results> results) {
            this.results = results;
            return this;
        }

        public RemoveHostsFromGroupResponseBody build() {
            return new RemoveHostsFromGroupResponseBody(this);
        } 

    } 

    public static class Results extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("HostGroupId")
        private String hostGroupId;

        @NameInMap("HostId")
        private String hostId;

        @NameInMap("Message")
        private String message;

        private Results(Builder builder) {
            this.code = builder.code;
            this.hostGroupId = builder.hostGroupId;
            this.hostId = builder.hostId;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return hostGroupId
         */
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        /**
         * @return hostId
         */
        public String getHostId() {
            return this.hostId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String code; 
            private String hostGroupId; 
            private String hostId; 
            private String message; 

            /**
             * The return code that indicates whether the call was successful. Valid values:
             * <p>
             * 
             * *   **OK**: The call was successful.
             * *   **UNEXPECTED**: An unknown error occurred.
             * *   **INVALID_ARGUMENT**: A request parameter is invalid.
             * *   **OBJECT_NOT_FOUND**: The specified object on which you want to perform the operation does not exist.
             * *   **OBJECT_AlREADY_EXISTS**: The specified object on which you want to perform the operation already exists.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The ID of the host group.
             */
            public Builder hostGroupId(String hostGroupId) {
                this.hostGroupId = hostGroupId;
                return this;
            }

            /**
             * The ID of the host.
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * This parameter is deprecated.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
