// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link DescribeFeatureTrialInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeFeatureTrialInfoRequest</p>
 */
public class DescribeFeatureTrialInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeatureType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String featureType;

    private DescribeFeatureTrialInfoRequest(Builder builder) {
        super(builder);
        this.featureType = builder.featureType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFeatureTrialInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return featureType
     */
    public String getFeatureType() {
        return this.featureType;
    }

    public static final class Builder extends Request.Builder<DescribeFeatureTrialInfoRequest, Builder> {
        private String featureType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFeatureTrialInfoRequest request) {
            super(request);
            this.featureType = request.featureType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OTS_BACKUP</p>
         */
        public Builder featureType(String featureType) {
            this.putQueryParameter("FeatureType", featureType);
            this.featureType = featureType;
            return this;
        }

        @Override
        public DescribeFeatureTrialInfoRequest build() {
            return new DescribeFeatureTrialInfoRequest(this);
        } 

    } 

}
