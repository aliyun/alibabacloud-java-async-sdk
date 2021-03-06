// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncInstanceMetaRequest} extends {@link RequestModel}
 *
 * <p>SyncInstanceMetaRequest</p>
 */
public class SyncInstanceMetaRequest extends Request {
    @Query
    @NameInMap("IgnoreTable")
    private Boolean ignoreTable;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Tid")
    private Long tid;

    private SyncInstanceMetaRequest(Builder builder) {
        super(builder);
        this.ignoreTable = builder.ignoreTable;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncInstanceMetaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ignoreTable
     */
    public Boolean getIgnoreTable() {
        return this.ignoreTable;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<SyncInstanceMetaRequest, Builder> {
        private Boolean ignoreTable; 
        private String instanceId; 
        private String regionId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(SyncInstanceMetaRequest response) {
            super(response);
            this.ignoreTable = response.ignoreTable;
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
            this.tid = response.tid;
        } 

        /**
         * IgnoreTable.
         */
        public Builder ignoreTable(Boolean ignoreTable) {
            this.putQueryParameter("IgnoreTable", ignoreTable);
            this.ignoreTable = ignoreTable;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
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
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public SyncInstanceMetaRequest build() {
            return new SyncInstanceMetaRequest(this);
        } 

    } 

}
