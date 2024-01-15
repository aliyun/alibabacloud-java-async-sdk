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
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

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

    private UpdateOssExternalStoreRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.externalStoreName = builder.externalStoreName;
        this.parameter = builder.parameter;
        this.storeType = builder.storeType;
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

    public static final class Builder extends Request.Builder<UpdateOssExternalStoreRequest, Builder> {
        private String project; 
        private String externalStoreName; 
        private Parameter parameter; 
        private String storeType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOssExternalStoreRequest request) {
            super(request);
            this.project = request.project;
            this.externalStoreName = request.externalStoreName;
            this.parameter = request.parameter;
            this.storeType = request.storeType;
        } 

        /**
         * The name of the project.
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * The name of the external store.
         */
        public Builder externalStoreName(String externalStoreName) {
            this.putPathParameter("externalStoreName", externalStoreName);
            this.putBodyParameter("externalStoreName", externalStoreName);
            this.externalStoreName = externalStoreName;
            return this;
        }

        /**
         * The parameters that are configured for the external store.
         */
        public Builder parameter(Parameter parameter) {
            this.putBodyParameter("parameter", parameter);
            this.parameter = parameter;
            return this;
        }

        /**
         * The type of the external store. Set the value to oss.
         */
        public Builder storeType(String storeType) {
            this.putBodyParameter("storeType", storeType);
            this.storeType = storeType;
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
             * The name of the field.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The type of the field.
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
             * The AccessKey ID of your account.
             */
            public Builder accessid(String accessid) {
                this.accessid = accessid;
                return this;
            }

            /**
             * The AccessKey secret of your account.
             */
            public Builder accesskey(String accesskey) {
                this.accesskey = accesskey;
                return this;
            }

            /**
             * The name of the OSS bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * The fields that are associated to the external store.
             */
            public Builder columns(java.util.List < Columns> columns) {
                this.columns = columns;
                return this;
            }

            /**
             * The Object Storage Service (OSS) endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * The names of the OSS objects that are associated to the external store.
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
