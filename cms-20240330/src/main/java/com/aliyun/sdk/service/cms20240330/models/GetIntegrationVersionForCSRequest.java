// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetIntegrationVersionForCSRequest} extends {@link RequestModel}
 *
 * <p>GetIntegrationVersionForCSRequest</p>
 */
public class GetIntegrationVersionForCSRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clusterType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterType;

    private GetIntegrationVersionForCSRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clusterId = builder.clusterId;
        this.clusterType = builder.clusterType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIntegrationVersionForCSRequest create() {
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
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    public static final class Builder extends Request.Builder<GetIntegrationVersionForCSRequest, Builder> {
        private String regionId; 
        private String clusterId; 
        private String clusterType; 

        private Builder() {
            super();
        } 

        private Builder(GetIntegrationVersionForCSRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clusterId = request.clusterId;
            this.clusterType = request.clusterType;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c502646fd0d1249baaf792b3a1b589e1b</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("clusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs.ack.cluster</p>
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("clusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        @Override
        public GetIntegrationVersionForCSRequest build() {
            return new GetIntegrationVersionForCSRequest(this);
        } 

    } 

}
