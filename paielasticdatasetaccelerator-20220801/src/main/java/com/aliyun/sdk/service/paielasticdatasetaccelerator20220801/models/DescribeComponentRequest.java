// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

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
 * {@link DescribeComponentRequest} extends {@link RequestModel}
 *
 * <p>DescribeComponentRequest</p>
 */
public class DescribeComponentRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ComponentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String componentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderTemplate")
    private Boolean renderTemplate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Values")
    private java.util.Map<String, ?> values;

    private DescribeComponentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.componentId = builder.componentId;
        this.renderTemplate = builder.renderTemplate;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeComponentRequest create() {
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
     * @return componentId
     */
    public String getComponentId() {
        return this.componentId;
    }

    /**
     * @return renderTemplate
     */
    public Boolean getRenderTemplate() {
        return this.renderTemplate;
    }

    /**
     * @return values
     */
    public java.util.Map<String, ?> getValues() {
        return this.values;
    }

    public static final class Builder extends Request.Builder<DescribeComponentRequest, Builder> {
        private String regionId; 
        private String componentId; 
        private Boolean renderTemplate; 
        private java.util.Map<String, ?> values; 

        private Builder() {
            super();
        } 

        private Builder(DescribeComponentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.componentId = request.componentId;
            this.renderTemplate = request.renderTemplate;
            this.values = request.values;
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
         * <p>cmpt-my1tk3jggooi5uwks5</p>
         */
        public Builder componentId(String componentId) {
            this.putPathParameter("ComponentId", componentId);
            this.componentId = componentId;
            return this;
        }

        /**
         * RenderTemplate.
         */
        public Builder renderTemplate(Boolean renderTemplate) {
            this.putQueryParameter("RenderTemplate", renderTemplate);
            this.renderTemplate = renderTemplate;
            return this;
        }

        /**
         * Values.
         */
        public Builder values(java.util.Map<String, ?> values) {
            String valuesShrink = shrink(values, "Values", "json");
            this.putQueryParameter("Values", valuesShrink);
            this.values = values;
            return this;
        }

        @Override
        public DescribeComponentRequest build() {
            return new DescribeComponentRequest(this);
        } 

    } 

}
