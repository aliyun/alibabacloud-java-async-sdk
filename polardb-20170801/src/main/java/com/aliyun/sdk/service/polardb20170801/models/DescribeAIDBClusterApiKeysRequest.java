// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeAIDBClusterApiKeysRequest} extends {@link RequestModel}
 *
 * <p>DescribeAIDBClusterApiKeysRequest</p>
 */
public class DescribeAIDBClusterApiKeysRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelSpaceName")
    private String modelSpaceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DescribeAIDBClusterApiKeysRequest(Builder builder) {
        super(builder);
        this.modelSpaceName = builder.modelSpaceName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAIDBClusterApiKeysRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelSpaceName
     */
    public String getModelSpaceName() {
        return this.modelSpaceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeAIDBClusterApiKeysRequest, Builder> {
        private String modelSpaceName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAIDBClusterApiKeysRequest request) {
            super(request);
            this.modelSpaceName = request.modelSpaceName;
            this.regionId = request.regionId;
        } 

        /**
         * ModelSpaceName.
         */
        public Builder modelSpaceName(String modelSpaceName) {
            this.putQueryParameter("ModelSpaceName", modelSpaceName);
            this.modelSpaceName = modelSpaceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeAIDBClusterApiKeysRequest build() {
            return new DescribeAIDBClusterApiKeysRequest(this);
        } 

    } 

}
