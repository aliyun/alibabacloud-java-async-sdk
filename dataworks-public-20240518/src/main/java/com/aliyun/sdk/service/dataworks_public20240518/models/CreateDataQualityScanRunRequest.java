// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link CreateDataQualityScanRunRequest} extends {@link RequestModel}
 *
 * <p>CreateDataQualityScanRunRequest</p>
 */
public class CreateDataQualityScanRunRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataQualityScanId")
    private Long dataQualityScanId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.List<Parameters> parameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuntimeResource")
    private RuntimeResource runtimeResource;

    private CreateDataQualityScanRunRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dataQualityScanId = builder.dataQualityScanId;
        this.parameters = builder.parameters;
        this.projectId = builder.projectId;
        this.runtimeResource = builder.runtimeResource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataQualityScanRunRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return dataQualityScanId
     */
    public Long getDataQualityScanId() {
        return this.dataQualityScanId;
    }

    /**
     * @return parameters
     */
    public java.util.List<Parameters> getParameters() {
        return this.parameters;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return runtimeResource
     */
    public RuntimeResource getRuntimeResource() {
        return this.runtimeResource;
    }

    public static final class Builder extends Request.Builder<CreateDataQualityScanRunRequest, Builder> {
        private String regionId; 
        private Long dataQualityScanId; 
        private java.util.List<Parameters> parameters; 
        private Long projectId; 
        private RuntimeResource runtimeResource; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataQualityScanRunRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dataQualityScanId = request.dataQualityScanId;
            this.parameters = request.parameters;
            this.projectId = request.projectId;
            this.runtimeResource = request.runtimeResource;
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
         * DataQualityScanId.
         */
        public Builder dataQualityScanId(Long dataQualityScanId) {
            this.putBodyParameter("DataQualityScanId", dataQualityScanId);
            this.dataQualityScanId = dataQualityScanId;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(java.util.List<Parameters> parameters) {
            String parametersShrink = shrink(parameters, "Parameters", "json");
            this.putBodyParameter("Parameters", parametersShrink);
            this.parameters = parameters;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RuntimeResource.
         */
        public Builder runtimeResource(RuntimeResource runtimeResource) {
            String runtimeResourceShrink = shrink(runtimeResource, "RuntimeResource", "json");
            this.putBodyParameter("RuntimeResource", runtimeResourceShrink);
            this.runtimeResource = runtimeResource;
            return this;
        }

        @Override
        public CreateDataQualityScanRunRequest build() {
            return new CreateDataQualityScanRunRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDataQualityScanRunRequest} extends {@link TeaModel}
     *
     * <p>CreateDataQualityScanRunRequest</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Parameters(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDataQualityScanRunRequest} extends {@link TeaModel}
     *
     * <p>CreateDataQualityScanRunRequest</p>
     */
    public static class RuntimeResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cu")
        private Float cu;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        private RuntimeResource(Builder builder) {
            this.cu = builder.cu;
            this.id = builder.id;
            this.image = builder.image;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuntimeResource create() {
            return builder().build();
        }

        /**
         * @return cu
         */
        public Float getCu() {
            return this.cu;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        public static final class Builder {
            private Float cu; 
            private String id; 
            private String image; 

            private Builder() {
            } 

            private Builder(RuntimeResource model) {
                this.cu = model.cu;
                this.id = model.id;
                this.image = model.image;
            } 

            /**
             * Cu.
             */
            public Builder cu(Float cu) {
                this.cu = cu;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Image.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            public RuntimeResource build() {
                return new RuntimeResource(this);
            } 

        } 

    }
}
