// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAppMetadataRequest} extends {@link RequestModel}
 *
 * <p>QueryAppMetadataRequest</p>
 */
public class QueryAppMetadataRequest extends Request {
    @Query
    @NameInMap("MetaIds")
    private String metaIds;

    @Query
    @NameInMap("MetaType")
    private String metaType;

    @Query
    @NameInMap("Pid")
    private String pid;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private QueryAppMetadataRequest(Builder builder) {
        super(builder);
        this.metaIds = builder.metaIds;
        this.metaType = builder.metaType;
        this.pid = builder.pid;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAppMetadataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metaIds
     */
    public String getMetaIds() {
        return this.metaIds;
    }

    /**
     * @return metaType
     */
    public String getMetaType() {
        return this.metaType;
    }

    /**
     * @return pid
     */
    public String getPid() {
        return this.pid;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<QueryAppMetadataRequest, Builder> {
        private String metaIds; 
        private String metaType; 
        private String pid; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(QueryAppMetadataRequest request) {
            super(request);
            this.metaIds = request.metaIds;
            this.metaType = request.metaType;
            this.pid = request.pid;
            this.regionId = request.regionId;
        } 

        /**
         * MetaIds.
         */
        public Builder metaIds(String metaIds) {
            this.putQueryParameter("MetaIds", metaIds);
            this.metaIds = metaIds;
            return this;
        }

        /**
         * MetaType.
         */
        public Builder metaType(String metaType) {
            this.putQueryParameter("MetaType", metaType);
            this.metaType = metaType;
            return this;
        }

        /**
         * Pid.
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
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
        public QueryAppMetadataRequest build() {
            return new QueryAppMetadataRequest(this);
        } 

    } 

}
