// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMetricRequest} extends {@link RequestModel}
 *
 * <p>CreateMetricRequest</p>
 */
public class CreateMetricRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Definition")
    @com.aliyun.core.annotation.Validation(required = true)
    private String definition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MetricGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceTableMetaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceTableMetaId;

    private CreateMetricRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.definition = builder.definition;
        this.description = builder.description;
        this.metricGroupId = builder.metricGroupId;
        this.name = builder.name;
        this.sourceTableMetaId = builder.sourceTableMetaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMetricRequest create() {
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
     * @return definition
     */
    public String getDefinition() {
        return this.definition;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return metricGroupId
     */
    public String getMetricGroupId() {
        return this.metricGroupId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return sourceTableMetaId
     */
    public String getSourceTableMetaId() {
        return this.sourceTableMetaId;
    }

    public static final class Builder extends Request.Builder<CreateMetricRequest, Builder> {
        private String regionId; 
        private String definition; 
        private String description; 
        private String metricGroupId; 
        private String name; 
        private String sourceTableMetaId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMetricRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.definition = request.definition;
            this.description = request.description;
            this.metricGroupId = request.metricGroupId;
            this.name = request.name;
            this.sourceTableMetaId = request.sourceTableMetaId;
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
         * Definition.
         */
        public Builder definition(String definition) {
            this.putBodyParameter("Definition", definition);
            this.definition = definition;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * MetricGroupId.
         */
        public Builder metricGroupId(String metricGroupId) {
            this.putBodyParameter("MetricGroupId", metricGroupId);
            this.metricGroupId = metricGroupId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * SourceTableMetaId.
         */
        public Builder sourceTableMetaId(String sourceTableMetaId) {
            this.putBodyParameter("SourceTableMetaId", sourceTableMetaId);
            this.sourceTableMetaId = sourceTableMetaId;
            return this;
        }

        @Override
        public CreateMetricRequest build() {
            return new CreateMetricRequest(this);
        } 

    } 

}
