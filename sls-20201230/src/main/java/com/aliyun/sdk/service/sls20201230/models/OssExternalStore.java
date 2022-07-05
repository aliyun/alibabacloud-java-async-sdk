// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link OssExternalStore} extends {@link TeaModel}
 *
 * <p>OssExternalStore</p>
 */
public class OssExternalStore extends TeaModel {
    @NameInMap("externalStoreName")
    @Validation(required = true)
    private String externalStoreName;

    @NameInMap("parameter")
    @Validation(required = true)
    private Parameter parameter;

    @NameInMap("storeType")
    @Validation(required = true)
    private String storeType;

    private OssExternalStore(Builder builder) {
        this.externalStoreName = builder.externalStoreName;
        this.parameter = builder.parameter;
        this.storeType = builder.storeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OssExternalStore create() {
        return builder().build();
    }

    /**
     * @return externalStoreName
     */
    public String getExternalStoreName() {
        return this.externalStoreName;
    }

    /**
     * @return parameter
     */
    public Parameter getParameter() {
        return this.parameter;
    }

    /**
     * @return storeType
     */
    public String getStoreType() {
        return this.storeType;
    }

    public static final class Builder {
        private String externalStoreName; 
        private Parameter parameter; 
        private String storeType; 

        /**
         * 名称
         */
        public Builder externalStoreName(String externalStoreName) {
            this.externalStoreName = externalStoreName;
            return this;
        }

        /**
         * 参数
         */
        public Builder parameter(Parameter parameter) {
            this.parameter = parameter;
            return this;
        }

        /**
         * 类型。这里固定为 oss
         */
        public Builder storeType(String storeType) {
            this.storeType = storeType;
            return this;
        }

        public OssExternalStore build() {
            return new OssExternalStore(this);
        } 

    } 

    public static class Parameter extends TeaModel {
        @NameInMap("accessKey")
        @Validation(required = true)
        private String accessKey;

        @NameInMap("accessid")
        @Validation(required = true)
        private String accessid;

        @NameInMap("bucket")
        @Validation(required = true)
        private String bucket;

        @NameInMap("endpoint")
        @Validation(required = true)
        private String endpoint;

        private Parameter(Builder builder) {
            this.accessKey = builder.accessKey;
            this.accessid = builder.accessid;
            this.bucket = builder.bucket;
            this.endpoint = builder.endpoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameter create() {
            return builder().build();
        }

        /**
         * @return accessKey
         */
        public String getAccessKey() {
            return this.accessKey;
        }

        /**
         * @return accessid
         */
        public String getAccessid() {
            return this.accessid;
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        public static final class Builder {
            private String accessKey; 
            private String accessid; 
            private String bucket; 
            private String endpoint; 

            /**
             * 您的AccessKey Secret。
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * 您的AccessKey ID。
             */
            public Builder accessid(String accessid) {
                this.accessid = accessid;
                return this;
            }

            /**
             * oss 桶名称。
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * oss 的 endpoint 访问网址。
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            public Parameter build() {
                return new Parameter(this);
            } 

        } 

    }
}
