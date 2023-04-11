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
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("IgnoreTable")
    private Boolean ignoreTable;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Tid")
    private Long tid;

    private SyncInstanceMetaRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.ignoreTable = builder.ignoreTable;
        this.instanceId = builder.instanceId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<SyncInstanceMetaRequest, Builder> {
        private String regionId; 
        private Boolean ignoreTable; 
        private String instanceId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(SyncInstanceMetaRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.ignoreTable = request.ignoreTable;
            this.instanceId = request.instanceId;
            this.tid = request.tid;
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
         * Specifies whether to skip synchronization for the metadata of table dictionaries. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder ignoreTable(Boolean ignoreTable) {
            this.putQueryParameter("IgnoreTable", ignoreTable);
            this.ignoreTable = ignoreTable;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the tenant.
         * <p>
         * 
         * > To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the [View information about the current tenant](~~181330~~) section of the Manage DMS tenants topic.
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
