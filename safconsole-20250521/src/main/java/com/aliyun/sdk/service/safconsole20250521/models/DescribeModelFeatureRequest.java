// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safconsole20250521.models;

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
 * {@link DescribeModelFeatureRequest} extends {@link RequestModel}
 *
 * <p>DescribeModelFeatureRequest</p>
 */
public class DescribeModelFeatureRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerModuleId")
    private Integer customerModuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeatureTemplate")
    private String featureTemplate;

    private DescribeModelFeatureRequest(Builder builder) {
        super(builder);
        this.customerModuleId = builder.customerModuleId;
        this.featureTemplate = builder.featureTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeModelFeatureRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customerModuleId
     */
    public Integer getCustomerModuleId() {
        return this.customerModuleId;
    }

    /**
     * @return featureTemplate
     */
    public String getFeatureTemplate() {
        return this.featureTemplate;
    }

    public static final class Builder extends Request.Builder<DescribeModelFeatureRequest, Builder> {
        private Integer customerModuleId; 
        private String featureTemplate; 

        private Builder() {
            super();
        } 

        private Builder(DescribeModelFeatureRequest request) {
            super(request);
            this.customerModuleId = request.customerModuleId;
            this.featureTemplate = request.featureTemplate;
        } 

        /**
         * CustomerModuleId.
         */
        public Builder customerModuleId(Integer customerModuleId) {
            this.putQueryParameter("CustomerModuleId", customerModuleId);
            this.customerModuleId = customerModuleId;
            return this;
        }

        /**
         * FeatureTemplate.
         */
        public Builder featureTemplate(String featureTemplate) {
            this.putQueryParameter("FeatureTemplate", featureTemplate);
            this.featureTemplate = featureTemplate;
            return this;
        }

        @Override
        public DescribeModelFeatureRequest build() {
            return new DescribeModelFeatureRequest(this);
        } 

    } 

}
