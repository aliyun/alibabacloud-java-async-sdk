// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

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
 * {@link DescribeDiskReplicaPairProgressRequest} extends {@link RequestModel}
 *
 * <p>DescribeDiskReplicaPairProgressRequest</p>
 */
public class DescribeDiskReplicaPairProgressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReplicaPairId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String replicaPairId;

    private DescribeDiskReplicaPairProgressRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.replicaPairId = builder.replicaPairId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiskReplicaPairProgressRequest create() {
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
     * @return replicaPairId
     */
    public String getReplicaPairId() {
        return this.replicaPairId;
    }

    public static final class Builder extends Request.Builder<DescribeDiskReplicaPairProgressRequest, Builder> {
        private String regionId; 
        private String replicaPairId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDiskReplicaPairProgressRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.replicaPairId = request.replicaPairId;
        } 

        /**
         * <p>The region ID of the replication pair.</p>
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

        /**
         * <p>The ID of the replication pair. You can call the <a href="https://help.aliyun.com/document_detail/354206.html">DescribeDiskReplicaPairs</a>operation to query the IDs of existing replication pairs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pair-cn-tl32ribst0z</p>
         */
        public Builder replicaPairId(String replicaPairId) {
            this.putQueryParameter("ReplicaPairId", replicaPairId);
            this.replicaPairId = replicaPairId;
            return this;
        }

        @Override
        public DescribeDiskReplicaPairProgressRequest build() {
            return new DescribeDiskReplicaPairProgressRequest(this);
        } 

    } 

}
