// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link CreateRCSnapshotRequest} extends {@link RequestModel}
 *
 * <p>CreateRCSnapshotRequest</p>
 */
public class CreateRCSnapshotRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskId")
    private String diskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstantAccess")
    private Boolean instantAccess;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstantAccessRetentionDays")
    private Integer instantAccessRetentionDays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetentionDays")
    private Integer retentionDays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CreateRCSnapshotRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.diskId = builder.diskId;
        this.instantAccess = builder.instantAccess;
        this.instantAccessRetentionDays = builder.instantAccessRetentionDays;
        this.regionId = builder.regionId;
        this.retentionDays = builder.retentionDays;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRCSnapshotRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
    }

    /**
     * @return instantAccess
     */
    public Boolean getInstantAccess() {
        return this.instantAccess;
    }

    /**
     * @return instantAccessRetentionDays
     */
    public Integer getInstantAccessRetentionDays() {
        return this.instantAccessRetentionDays;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return retentionDays
     */
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateRCSnapshotRequest, Builder> {
        private String description; 
        private String diskId; 
        private Boolean instantAccess; 
        private Integer instantAccessRetentionDays; 
        private String regionId; 
        private Integer retentionDays; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRCSnapshotRequest request) {
            super(request);
            this.description = request.description;
            this.diskId = request.diskId;
            this.instantAccess = request.instantAccess;
            this.instantAccessRetentionDays = request.instantAccessRetentionDays;
            this.regionId = request.regionId;
            this.retentionDays = request.retentionDays;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The snapshot description. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * <p>By default, this parameter is left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The cloud disk ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rcd-wz9f3peueu5npsl****</p>
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        public Builder instantAccess(Boolean instantAccess) {
            this.putQueryParameter("InstantAccess", instantAccess);
            this.instantAccess = instantAccess;
            return this;
        }

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        public Builder instantAccessRetentionDays(Integer instantAccessRetentionDays) {
            this.putQueryParameter("InstantAccessRetentionDays", instantAccessRetentionDays);
            this.instantAccessRetentionDays = instantAccessRetentionDays;
            return this;
        }

        /**
         * <p>The region ID.</p>
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

        /**
         * <p>The retention period of the snapshot. Valid values: 1 to 65536. Unit: days. The snapshot is automatically released when its retention period expires.</p>
         * <p>By default, this parameter is left empty, which specifies that the snapshot is not automatically released.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder retentionDays(Integer retentionDays) {
            this.putQueryParameter("RetentionDays", retentionDays);
            this.retentionDays = retentionDays;
            return this;
        }

        /**
         * <p>This parameter has been deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateRCSnapshotRequest build() {
            return new CreateRCSnapshotRequest(this);
        } 

    } 

}
