// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccessKeyLastUsedResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccessKeyLastUsedResponseBody</p>
 */
public class GetAccessKeyLastUsedResponseBody extends TeaModel {
    @NameInMap("AccessKeyLastUsed")
    private AccessKeyLastUsed accessKeyLastUsed;

    @NameInMap("RequestId")
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
         * AccessKeyLastUsed.
         */
        public Builder accessKeyLastUsed(AccessKeyLastUsed accessKeyLastUsed) {
            this.accessKeyLastUsed = accessKeyLastUsed;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("LastUsedDate")
        private String lastUsedDate;

        @NameInMap("ServiceName")
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
             * LastUsedDate.
             */
            public Builder lastUsedDate(String lastUsedDate) {
                this.lastUsedDate = lastUsedDate;
                return this;
            }

            /**
             * ServiceName.
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
