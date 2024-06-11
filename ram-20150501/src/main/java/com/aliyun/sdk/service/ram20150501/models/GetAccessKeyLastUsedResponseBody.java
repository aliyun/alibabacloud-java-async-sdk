// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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
        @com.aliyun.core.annotation.NameInMap("LastUsedDate")
        private String lastUsedDate;

        private AccessKeyLastUsed(Builder builder) {
            this.lastUsedDate = builder.lastUsedDate;
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

        public static final class Builder {
            private String lastUsedDate; 

            /**
             * LastUsedDate.
             */
            public Builder lastUsedDate(String lastUsedDate) {
                this.lastUsedDate = lastUsedDate;
                return this;
            }

            public AccessKeyLastUsed build() {
                return new AccessKeyLastUsed(this);
            } 

        } 

    }
}
