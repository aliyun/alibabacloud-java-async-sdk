// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMetricRequest} extends {@link RequestModel}
 *
 * <p>UpdateMetricRequest</p>
 */
public class UpdateMetricRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("MetricId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricId;

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
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceTableMetaId")
    private String sourceTableMetaId;

    private UpdateMetricRequest(Builder builder) {
        super(builder);
        this.metricId = builder.metricId;
        this.regionId = builder.regionId;
        this.definition = builder.definition;
        this.description = builder.description;
        this.name = builder.name;
        this.sourceTableMetaId = builder.sourceTableMetaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMetricRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metricId
     */
    public String getMetricId() {
        return this.metricId;
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

    public static final class Builder extends Request.Builder<UpdateMetricRequest, Builder> {
        private String metricId; 
        private String regionId; 
        private String definition; 
        private String description; 
        private String name; 
        private String sourceTableMetaId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMetricRequest request) {
            super(request);
            this.metricId = request.metricId;
            this.regionId = request.regionId;
            this.definition = request.definition;
            this.description = request.description;
            this.name = request.name;
            this.sourceTableMetaId = request.sourceTableMetaId;
        } 

        /**
         * MetricId.
         */
        public Builder metricId(String metricId) {
            this.putPathParameter("MetricId", metricId);
            this.metricId = metricId;
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
        public UpdateMetricRequest build() {
            return new UpdateMetricRequest(this);
        } 

    } 

}
