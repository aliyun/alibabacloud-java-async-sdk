// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link CreateAccessKeyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAccessKeyResponseBody</p>
 */
public class CreateAccessKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessKey")
    private AccessKey accessKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateAccessKeyResponseBody model) {
            this.accessKey = model.accessKey;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the AccessKey pair.</p>
         */
        public Builder accessKey(AccessKey accessKey) {
            this.accessKey = accessKey;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>19DDD9F7-AFCC-4D72-8CBA-CCE5A142E7AB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAccessKeyResponseBody build() {
            return new CreateAccessKeyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateAccessKeyResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAccessKeyResponseBody</p>
     */
    public static class AccessKey extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKeyId")
        private String accessKeyId;

        @com.aliyun.core.annotation.NameInMap("AccessKeySecret")
        private String accessKeySecret;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(AccessKey model) {
                this.accessKeyId = model.accessKeyId;
                this.accessKeySecret = model.accessKeySecret;
                this.createDate = model.createDate;
                this.status = model.status;
            } 

            /**
             * <p>The AccessKey ID.</p>
             * 
             * <strong>example:</strong>
             * <p>yourAccessKeyID</p>
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * <p>The AccessKey secret.</p>
             * 
             * <strong>example:</strong>
             * <p>yourAccessKeySecret</p>
             */
            public Builder accessKeySecret(String accessKeySecret) {
                this.accessKeySecret = accessKeySecret;
                return this;
            }

            /**
             * <p>The time when the AccessKey pair was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-15T08:08:54Z</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The status of the AccessKey pair. Valid values:</p>
             * <ul>
             * <li>Active</li>
             * <li>Inactive</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
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
