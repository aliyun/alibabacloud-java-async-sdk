// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The details of the time when the AccessKey pair was used for the last time.</p>
         */
        public Builder accessKeyLastUsed(AccessKeyLastUsed accessKeyLastUsed) {
            this.accessKeyLastUsed = accessKeyLastUsed;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B29C79F6-354B-4297-A994-1338CC22A2EC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAccessKeyLastUsedResponseBody build() {
            return new GetAccessKeyLastUsedResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAccessKeyLastUsedResponseBody} extends {@link TeaModel}
     *
     * <p>GetAccessKeyLastUsedResponseBody</p>
     */
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
             * <p>The time when the AccessKey pair was used for the last time.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-16T01:37:37Z</p>
             */
            public Builder lastUsedDate(String lastUsedDate) {
                this.lastUsedDate = lastUsedDate;
                return this;
            }

            /**
             * <p>The Alibaba Cloud service that was last accessed by using the AccessKey pair.</p>
             * 
             * <strong>example:</strong>
             * <p>Ram</p>
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
