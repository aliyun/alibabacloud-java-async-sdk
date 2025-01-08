// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link CreateOssExternalStoreRequest} extends {@link RequestModel}
 *
 * <p>CreateOssExternalStoreRequest</p>
 */
public class CreateOssExternalStoreRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("externalStoreName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String externalStoreName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parameter")
    @com.aliyun.core.annotation.Validation(required = true)
    private Parameter parameter;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("storeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storeType;

    private CreateOssExternalStoreRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.externalStoreName = builder.externalStoreName;
        this.parameter = builder.parameter;
        this.storeType = builder.storeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOssExternalStoreRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
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

    public static final class Builder extends Request.Builder<CreateOssExternalStoreRequest, Builder> {
        private String project; 
        private String externalStoreName; 
        private Parameter parameter; 
        private String storeType; 

        private Builder() {
            super();
        } 

        private Builder(CreateOssExternalStoreRequest request) {
            super(request);
            this.project = request.project;
            this.externalStoreName = request.externalStoreName;
            this.parameter = request.parameter;
            this.storeType = request.storeType;
        } 

        /**
         * <p>A short description of struct</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-project</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The name of the external store.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_oss_store</p>
         */
        public Builder externalStoreName(String externalStoreName) {
            this.putBodyParameter("externalStoreName", externalStoreName);
            this.externalStoreName = externalStoreName;
            return this;
        }

        /**
         * <p>The parameters of the external store.</p>
         * <p>This parameter is required.</p>
         */
        public Builder parameter(Parameter parameter) {
            this.putBodyParameter("parameter", parameter);
            this.parameter = parameter;
            return this;
        }

        /**
         * <p>The type of the external store. Set the value to oss.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        public Builder storeType(String storeType) {
            this.putBodyParameter("storeType", storeType);
            this.storeType = storeType;
            return this;
        }

        @Override
        public CreateOssExternalStoreRequest build() {
            return new CreateOssExternalStoreRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateOssExternalStoreRequest} extends {@link TeaModel}
     *
     * <p>CreateOssExternalStoreRequest</p>
     */
    public static class Columns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Columns(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Columns create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private String type; 

            /**
             * <p>The name of the field.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>auto-test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The data type of the field.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>sls</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Columns build() {
                return new Columns(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateOssExternalStoreRequest} extends {@link TeaModel}
     *
     * <p>CreateOssExternalStoreRequest</p>
     */
    public static class Parameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessid")
        @com.aliyun.core.annotation.Validation(required = true)
        private String accessid;

        @com.aliyun.core.annotation.NameInMap("accesskey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String accesskey;

        @com.aliyun.core.annotation.NameInMap("bucket")
        @com.aliyun.core.annotation.Validation(required = true)
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("columns")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Columns> columns;

        @com.aliyun.core.annotation.NameInMap("endpoint")
        @com.aliyun.core.annotation.Validation(required = true)
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("objects")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> objects;

        private Parameter(Builder builder) {
            this.accessid = builder.accessid;
            this.accesskey = builder.accesskey;
            this.bucket = builder.bucket;
            this.columns = builder.columns;
            this.endpoint = builder.endpoint;
            this.objects = builder.objects;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameter create() {
            return builder().build();
        }

        /**
         * @return accessid
         */
        public String getAccessid() {
            return this.accessid;
        }

        /**
         * @return accesskey
         */
        public String getAccesskey() {
            return this.accesskey;
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return columns
         */
        public java.util.List<Columns> getColumns() {
            return this.columns;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return objects
         */
        public java.util.List<String> getObjects() {
            return this.objects;
        }

        public static final class Builder {
            private String accessid; 
            private String accesskey; 
            private String bucket; 
            private java.util.List<Columns> columns; 
            private String endpoint; 
            private java.util.List<String> objects; 

            /**
             * <p>The AccessKey ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>LTAI5tFsHGGeYry*****1Sz</p>
             */
            public Builder accessid(String accessid) {
                this.accessid = accessid;
                return this;
            }

            /**
             * <p>The AccessKey secret.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>GyviCLDVHkHrOztdkxuE6******Rp6</p>
             */
            public Builder accesskey(String accesskey) {
                this.accesskey = accesskey;
                return this;
            }

            /**
             * <p>The name of the OSS bucket.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>my-bucket</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The associated fields.</p>
             * <p>This parameter is required.</p>
             */
            public Builder columns(java.util.List<Columns> columns) {
                this.columns = columns;
                return this;
            }

            /**
             * <p>The OSS endpoint. For more information, see <a href="https://help.aliyun.com/document_detail/31837.html">Regions and endpoints</a>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-hangzhou.aliyuncs.com</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The associated OSS objects. Valid values of n: 1 to 100.</p>
             * <p>This parameter is required.</p>
             */
            public Builder objects(java.util.List<String> objects) {
                this.objects = objects;
                return this;
            }

            public Parameter build() {
                return new Parameter(this);
            } 

        } 

    }
}
