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
 * {@link DescribeAvailableModelsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAvailableModelsRequest</p>
 */
public class DescribeAvailableModelsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KubeType")
    private String kubeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DescribeAvailableModelsRequest(Builder builder) {
        super(builder);
        this.kubeType = builder.kubeType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableModelsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return kubeType
     */
    public String getKubeType() {
        return this.kubeType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeAvailableModelsRequest, Builder> {
        private String kubeType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAvailableModelsRequest request) {
            super(request);
            this.kubeType = request.kubeType;
            this.regionId = request.regionId;
        } 

        /**
         * <p>aideploy</p>
         * 
         * <strong>example:</strong>
         * <p>aideploy</p>
         */
        public Builder kubeType(String kubeType) {
            this.putQueryParameter("KubeType", kubeType);
            this.kubeType = kubeType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeAvailableModelsRequest build() {
            return new DescribeAvailableModelsRequest(this);
        } 

    } 

}
