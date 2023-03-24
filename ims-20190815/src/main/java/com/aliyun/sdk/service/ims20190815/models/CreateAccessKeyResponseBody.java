// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAccessKeyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAccessKeyResponseBody</p>
 */
public class CreateAccessKeyResponseBody extends TeaModel {
    @NameInMap("AccessKey")
    private AccessKey accessKey;

    @NameInMap("RequestId")
    private String requestId;

    private CreateAccessKeyResponseBody(Builder builder) {
        this.accessKey = builder.accessKey;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAccessKeyResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessKey
     */
    public AccessKey getAccessKey() {
        return this.accessKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AccessKey accessKey; 
        private String requestId; 

        /**
         * The information of the AccessKey pair.
         */
        public Builder accessKey(AccessKey accessKey) {
            this.accessKey = accessKey;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAccessKeyResponseBody build() {
            return new CreateAccessKeyResponseBody(this);
        } 

    } 

    public static class AccessKey extends TeaModel {
        @NameInMap("AccessKeyId")
        private String accessKeyId;

        @NameInMap("AccessKeySecret")
        private String accessKeySecret;

        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("Status")
        private String status;

        private AccessKey(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.accessKeySecret = builder.accessKeySecret;
            this.createDate = builder.createDate;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessKey create() {
            return builder().build();
        }

        /**
         * @return accessKeyId
         */
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        /**
         * @return accessKeySecret
         */
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String accessKeyId; 
            private String accessKeySecret; 
            private String createDate; 
            private String status; 

            /**
             * The AccessKey ID provided to you by Alibaba Cloud.
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * The AccessKey secret provided to you by Alibaba Cloud.
             */
            public Builder accessKeySecret(String accessKeySecret) {
                this.accessKeySecret = accessKeySecret;
                return this;
            }

            /**
             * The time when the AccessKey pair was created.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * The status of the AccessKey pair. Valid values:
             * <p>
             * 
             * *   Active
             * *   Inactive
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public AccessKey build() {
                return new AccessKey(this);
            } 

        } 

    }
}
