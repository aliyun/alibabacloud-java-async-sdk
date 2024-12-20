// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link DeleteAppListRequest} extends {@link RequestModel}
 *
 * <p>DeleteAppListRequest</p>
 */
public class DeleteAppListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pids")
    private java.util.List<String> pids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteAppListRequest(Builder builder) {
        super(builder);
        this.pids = builder.pids;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAppListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pids
     */
    public java.util.List<String> getPids() {
        return this.pids;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteAppListRequest, Builder> {
        private java.util.List<String> pids; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAppListRequest request) {
            super(request);
            this.pids = request.pids;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The PIDs of the applications monitored by ARMS Application Monitoring.</p>
         */
        public Builder pids(java.util.List<String> pids) {
            this.putQueryParameter("Pids", pids);
            this.pids = pids;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
        public DeleteAppListRequest build() {
            return new DeleteAppListRequest(this);
        } 

    } 

}
