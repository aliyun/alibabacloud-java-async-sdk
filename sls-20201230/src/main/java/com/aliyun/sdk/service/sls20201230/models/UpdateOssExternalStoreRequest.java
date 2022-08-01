// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link UpdateOssExternalStoreRequest} extends {@link RequestModel}
 *
 * <p>UpdateOssExternalStoreRequest</p>
 */
public class UpdateOssExternalStoreRequest extends Request {
    @Path
    @Body
    @NameInMap("externalStoreName")
    @Validation(required = true)
    private String externalStoreName;

    @Body
    @NameInMap("parameter")
    @Validation(required = true)
    private Parameter parameter;

    @Body
    @NameInMap("storeType")
    @Validation(required = true)
    private String storeType;

    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    private UpdateOssExternalStoreRequest(Builder builder) {
        super(builder);
        this.externalStoreName = builder.externalStoreName;
        this.parameter = builder.parameter;
        this.storeType = builder.storeType;
        this.project = builder.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOssExternalStoreRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    public static final class Builder extends Request.Builder<UpdateOssExternalStoreRequest, Builder> {
        private String externalStoreName; 
        private Parameter parameter; 
        private String storeType; 
        private String project; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOssExternalStoreRequest request) {
            super(request);
            this.externalStoreName = request.externalStoreName;
            this.parameter = request.parameter;
            this.storeType = request.storeType;
            this.project = request.project;
        } 

        /**
         * 外部存储的名称。
         */
        public Builder externalStoreName(String externalStoreName) {
            this.putPathParameter("externalStoreName", externalStoreName);
            this.putBodyParameter("externalStoreName", externalStoreName);
            this.externalStoreName = externalStoreName;
            return this;
        }

        /**
         * 外部存储的参数。
         */
        public Builder parameter(Parameter parameter) {
            this.putBodyParameter("parameter", parameter);
            this.parameter = parameter;
            return this;
        }

        /**
         * 外部存储的类型。这里固定为 oss
         */
        public Builder storeType(String storeType) {
            this.putBodyParameter("storeType", storeType);
            this.storeType = storeType;
            return this;
        }

        /**
         * project 名称。
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        @Override
        public UpdateOssExternalStoreRequest build() {
            return new UpdateOssExternalStoreRequest(this);
        } 

    } 

    public static class Columns extends TeaModel {
        @NameInMap("name")
        @Validation(required = true)
        private String name;

        @NameInMap("type")
        @Validation(required = true)
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
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * type.
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
    public static class Parameter extends TeaModel {
        @NameInMap("accessid")
        @Validation(required = true)
        private String accessid;

        @NameInMap("accesskey")
        @Validation(required = true)
        private String accesskey;

        @NameInMap("bucket")
        @Validation(required = true)
        private String bucket;

        @NameInMap("columns")
        @Validation(required = true)
        private java.util.List < Columns> columns;

        @NameInMap("endpoint")
        @Validation(required = true)
        private String endpoint;

        @NameInMap("objects")
        @Validation(required = true)
        private java.util.List < String > objects;

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
        public java.util.List < Columns> getColumns() {
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
        public java.util.List < String > getObjects() {
            return this.objects;
        }

        public static final class Builder {
            private String accessid; 
            private String accesskey; 
            private String bucket; 
            private java.util.List < Columns> columns; 
            private String endpoint; 
            private java.util.List < String > objects; 

            /**
             * 您的AccessKey ID。
             */
            public Builder accessid(String accessid) {
                this.accessid = accessid;
                return this;
            }

            /**
             * 您的AccessKey Secret。
             */
            public Builder accesskey(String accesskey) {
                this.accesskey = accesskey;
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
             * columns.
             */
            public Builder columns(java.util.List < Columns> columns) {
                this.columns = columns;
                return this;
            }

            /**
             * oss 的 endpoint 访问网址。
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * objects.
             */
            public Builder objects(java.util.List < String > objects) {
                this.objects = objects;
                return this;
            }

            public Parameter build() {
                return new Parameter(this);
            } 

        } 

    }
}
