// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDbfsAttachedEcsInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListDbfsAttachedEcsInstancesRequest</p>
 */
public class ListDbfsAttachedEcsInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ListDbfsAttachedEcsInstancesRequest(Builder builder) {
        super(builder);
        this.fsId = builder.fsId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDbfsAttachedEcsInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fsId
     */
    public String getFsId() {
        return this.fsId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListDbfsAttachedEcsInstancesRequest, Builder> {
        private String fsId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListDbfsAttachedEcsInstancesRequest request) {
            super(request);
            this.fsId = request.fsId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dbfs-nUy1tb********BQ4X8Gpw</p>
         */
        public Builder fsId(String fsId) {
            this.putQueryParameter("FsId", fsId);
            this.fsId = fsId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListDbfsAttachedEcsInstancesRequest build() {
            return new ListDbfsAttachedEcsInstancesRequest(this);
        } 

    } 

}
