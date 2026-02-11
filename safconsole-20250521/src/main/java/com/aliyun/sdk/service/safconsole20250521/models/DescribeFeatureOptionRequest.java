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
 * {@link DescribeFeatureOptionRequest} extends {@link RequestModel}
 *
 * <p>DescribeFeatureOptionRequest</p>
 */
public class DescribeFeatureOptionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeatureTemplate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String featureTemplate;

    private DescribeFeatureOptionRequest(Builder builder) {
        super(builder);
        this.featureTemplate = builder.featureTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFeatureOptionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return featureTemplate
     */
    public String getFeatureTemplate() {
        return this.featureTemplate;
    }

    public static final class Builder extends Request.Builder<DescribeFeatureOptionRequest, Builder> {
        private String featureTemplate; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFeatureOptionRequest request) {
            super(request);
            this.featureTemplate = request.featureTemplate;
        } 

        /**
         * <p>Feature template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FINANCE_51</p>
         */
        public Builder featureTemplate(String featureTemplate) {
            this.putQueryParameter("FeatureTemplate", featureTemplate);
            this.featureTemplate = featureTemplate;
            return this;
        }

        @Override
        public DescribeFeatureOptionRequest build() {
            return new DescribeFeatureOptionRequest(this);
        } 

    } 

}
