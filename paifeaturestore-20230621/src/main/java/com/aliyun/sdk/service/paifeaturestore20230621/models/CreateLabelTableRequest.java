// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

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
 * {@link CreateLabelTableRequest} extends {@link RequestModel}
 *
 * <p>CreateLabelTableRequest</p>
 */
public class CreateLabelTableRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Fields")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Fields> fields;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    private CreateLabelTableRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.datasourceId = builder.datasourceId;
        this.fields = builder.fields;
        this.name = builder.name;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLabelTableRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return datasourceId
     */
    public String getDatasourceId() {
        return this.datasourceId;
    }

    /**
     * @return fields
     */
    public java.util.List<Fields> getFields() {
        return this.fields;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<CreateLabelTableRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private String datasourceId; 
        private java.util.List<Fields> fields; 
        private String name; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(CreateLabelTableRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.datasourceId = request.datasourceId;
            this.fields = request.fields;
            this.name = request.name;
            this.projectId = request.projectId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>featurestore-test1</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder datasourceId(String datasourceId) {
            this.putBodyParameter("DatasourceId", datasourceId);
            this.datasourceId = datasourceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder fields(java.util.List<Fields> fields) {
            this.putBodyParameter("Fields", fields);
            this.fields = fields;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rec_test</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public CreateLabelTableRequest build() {
            return new CreateLabelTableRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateLabelTableRequest} extends {@link TeaModel}
     *
     * <p>CreateLabelTableRequest</p>
     */
    public static class Fields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attributes")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> attributes;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Fields(Builder builder) {
            this.attributes = builder.attributes;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Fields create() {
            return builder().build();
        }

        /**
         * @return attributes
         */
        public java.util.List<String> getAttributes() {
            return this.attributes;
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
            private java.util.List<String> attributes; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(Fields model) {
                this.attributes = model.attributes;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder attributes(java.util.List<String> attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>lat</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>INT32</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Fields build() {
                return new Fields(this);
            } 

        } 

    }
}
