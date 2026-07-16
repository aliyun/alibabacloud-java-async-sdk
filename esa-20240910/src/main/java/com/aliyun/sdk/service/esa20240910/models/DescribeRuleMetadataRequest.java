// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DescribeRuleMetadataRequest} extends {@link RequestModel}
 *
 * <p>DescribeRuleMetadataRequest</p>
 */
public class DescribeRuleMetadataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetaName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metaName;

    private DescribeRuleMetadataRequest(Builder builder) {
        super(builder);
        this.metaName = builder.metaName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRuleMetadataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metaName
     */
    public String getMetaName() {
        return this.metaName;
    }

    public static final class Builder extends Request.Builder<DescribeRuleMetadataRequest, Builder> {
        private String metaName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRuleMetadataRequest request) {
            super(request);
            this.metaName = request.metaName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>esa_condition_region_config_en</p>
         */
        public Builder metaName(String metaName) {
            this.putQueryParameter("MetaName", metaName);
            this.metaName = metaName;
            return this;
        }

        @Override
        public DescribeRuleMetadataRequest build() {
            return new DescribeRuleMetadataRequest(this);
        } 

    } 

}
