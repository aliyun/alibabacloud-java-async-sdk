// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCloudDriveServiceMountTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GetCloudDriveServiceMountTokenResponseBody</p>
 */
public class GetCloudDriveServiceMountTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Token")
    private Token token;

    private GetCloudDriveServiceMountTokenResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCloudDriveServiceMountTokenResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return token
     */
    public Token getToken() {
        return this.token;
    }

    public static final class Builder {
        private String requestId; 
        private Token token; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Token.
         */
        public Builder token(Token token) {
            this.token = token;
            return this;
        }

        public GetCloudDriveServiceMountTokenResponseBody build() {
            return new GetCloudDriveServiceMountTokenResponseBody(this);
        } 

    } 

    public static class Token extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainId")
        private String domainId;

        @com.aliyun.core.annotation.NameInMap("ExpiredAfter")
        private String expiredAfter;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Token")
        private String token;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Long totalSize;

        @com.aliyun.core.annotation.NameInMap("UsedSize")
        private Long usedSize;

        private Token(Builder builder) {
            this.domainId = builder.domainId;
            this.expiredAfter = builder.expiredAfter;
            this.status = builder.status;
            this.token = builder.token;
            this.totalSize = builder.totalSize;
            this.usedSize = builder.usedSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Token create() {
            return builder().build();
        }

        /**
         * @return domainId
         */
        public String getDomainId() {
            return this.domainId;
        }

        /**
         * @return expiredAfter
         */
        public String getExpiredAfter() {
            return this.expiredAfter;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        /**
         * @return totalSize
         */
        public Long getTotalSize() {
            return this.totalSize;
        }

        /**
         * @return usedSize
         */
        public Long getUsedSize() {
            return this.usedSize;
        }

        public static final class Builder {
            private String domainId; 
            private String expiredAfter; 
            private String status; 
            private String token; 
            private Long totalSize; 
            private Long usedSize; 

            /**
             * DomainId.
             */
            public Builder domainId(String domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * ExpiredAfter.
             */
            public Builder expiredAfter(String expiredAfter) {
                this.expiredAfter = expiredAfter;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Token.
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            /**
             * TotalSize.
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            /**
             * UsedSize.
             */
            public Builder usedSize(Long usedSize) {
                this.usedSize = usedSize;
                return this;
            }

            public Token build() {
                return new Token(this);
            } 

        } 

    }
}
