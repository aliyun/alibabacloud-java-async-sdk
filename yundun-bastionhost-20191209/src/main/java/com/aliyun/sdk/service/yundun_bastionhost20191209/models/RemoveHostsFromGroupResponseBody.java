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
         * All Alibaba Cloud API operations must include common request parameters. For more information about common request parameters, see [Common parameters](~~315526~~).
         * <p>
         * 
         * For more information about sample requests, see the "Examples" section of this topic.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Removes one or more hosts from a host group.
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
             * RemoveHostsFromGroup
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * RemoveHostsFromGroup
             */
            public Builder hostGroupId(String hostGroupId) {
                this.hostGroupId = hostGroupId;
                return this;
            }

            /**
             * HostId.
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * WB662865
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
