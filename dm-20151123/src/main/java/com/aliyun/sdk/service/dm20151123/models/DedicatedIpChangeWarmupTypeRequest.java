// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link DedicatedIpChangeWarmupTypeRequest} extends {@link RequestModel}
 *
 * <p>DedicatedIpChangeWarmupTypeRequest</p>
 */
public class DedicatedIpChangeWarmupTypeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WarmupType")
    private String warmupType;

    private DedicatedIpChangeWarmupTypeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.id = builder.id;
        this.warmupType = builder.warmupType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DedicatedIpChangeWarmupTypeRequest create() {
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
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return warmupType
     */
    public String getWarmupType() {
        return this.warmupType;
    }

    public static final class Builder extends Request.Builder<DedicatedIpChangeWarmupTypeRequest, Builder> {
        private String regionId; 
        private String id; 
        private String warmupType; 

        private Builder() {
            super();
        } 

        private Builder(DedicatedIpChangeWarmupTypeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.id = request.id;
            this.warmupType = request.warmupType;
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
         * <p>Dedicated IP ID</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>Warmup method</p>
         * 
         * <strong>example:</strong>
         * <p>sysCusStream</p>
         */
        public Builder warmupType(String warmupType) {
            this.putQueryParameter("WarmupType", warmupType);
            this.warmupType = warmupType;
            return this;
        }

        @Override
        public DedicatedIpChangeWarmupTypeRequest build() {
            return new DedicatedIpChangeWarmupTypeRequest(this);
        } 

    } 

}
