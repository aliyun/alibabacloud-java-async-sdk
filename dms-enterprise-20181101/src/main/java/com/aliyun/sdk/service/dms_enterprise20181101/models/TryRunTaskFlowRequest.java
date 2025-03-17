// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link TryRunTaskFlowRequest} extends {@link RequestModel}
 *
 * <p>TryRunTaskFlowRequest</p>
 */
public class TryRunTaskFlowRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DagId")
    private Long dagId;

    private TryRunTaskFlowRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dagId = builder.dagId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TryRunTaskFlowRequest create() {
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
     * @return dagId
     */
    public Long getDagId() {
        return this.dagId;
    }

    public static final class Builder extends Request.Builder<TryRunTaskFlowRequest, Builder> {
        private String regionId; 
        private Long dagId; 

        private Builder() {
            super();
        } 

        private Builder(TryRunTaskFlowRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dagId = request.dagId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * DagId.
         */
        public Builder dagId(Long dagId) {
            this.putQueryParameter("DagId", dagId);
            this.dagId = dagId;
            return this;
        }

        @Override
        public TryRunTaskFlowRequest build() {
            return new TryRunTaskFlowRequest(this);
        } 

    } 

}
