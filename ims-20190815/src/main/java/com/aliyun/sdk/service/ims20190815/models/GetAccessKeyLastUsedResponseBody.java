// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccessKeyLastUsedResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccessKeyLastUsedResponseBody</p>
 */
public class GetAccessKeyLastUsedResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessKeyLastUsed")
    private AccessKeyLastUsed accessKeyLastUsed;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAccessKeyLastUsedResponseBody(Builder builder) {
        this.accessKeyLastUsed = builder.accessKeyLastUsed;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccessKeyLastUsedResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessKeyLastUsed
     */
    public AccessKeyLastUsed getAccessKeyLastUsed() {
        return this.accessKeyLastUsed;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AccessKeyLastUsed accessKeyLastUsed; 
        private String requestId; 

        /**
         * The details of the time when the AccessKey pair was used for the last time.
         */
        public Builder accessKeyLastUsed(AccessKeyLastUsed accessKeyLastUsed) {
            this.accessKeyLastUsed = accessKeyLastUsed;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAccessKeyLastUsedResponseBody build() {
            return new GetAccessKeyLastUsedResponseBody(this);
        } 

    } 

    public static class AccessKeyLastUsed extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LastUsedDate")
        private String lastUsedDate;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        private AccessKeyLastUsed(Builder builder) {
            this.lastUsedDate = builder.lastUsedDate;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessKeyLastUsed create() {
            return builder().build();
        }

        /**
         * @return lastUsedDate
         */
        public String getLastUsedDate() {
            return this.lastUsedDate;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private String lastUsedDate; 
            private String serviceName; 

            /**
             * The time when the AccessKey pair was used for the last time.
             */
            public Builder lastUsedDate(String lastUsedDate) {
                this.lastUsedDate = lastUsedDate;
                return this;
            }

            /**
             * The Alibaba Cloud service that was last accessed by using the AccessKey pair.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public AccessKeyLastUsed build() {
                return new AccessKeyLastUsed(this);
            } 

        } 

    }
}
