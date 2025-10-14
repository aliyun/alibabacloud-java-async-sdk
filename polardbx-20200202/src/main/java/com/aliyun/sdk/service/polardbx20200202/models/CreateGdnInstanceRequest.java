// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link CreateGdnInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateGdnInstanceRequest</p>
 */
public class CreateGdnInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GdnMode")
    private String gdnMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RplConflictStrategy")
    private String rplConflictStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RplDmlStrategy")
    private String rplDmlStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RplSyncDdl")
    private Boolean rplSyncDdl;

    private CreateGdnInstanceRequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.description = builder.description;
        this.gdnMode = builder.gdnMode;
        this.regionId = builder.regionId;
        this.rplConflictStrategy = builder.rplConflictStrategy;
        this.rplDmlStrategy = builder.rplDmlStrategy;
        this.rplSyncDdl = builder.rplSyncDdl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGdnInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return gdnMode
     */
    public String getGdnMode() {
        return this.gdnMode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return rplConflictStrategy
     */
    public String getRplConflictStrategy() {
        return this.rplConflictStrategy;
    }

    /**
     * @return rplDmlStrategy
     */
    public String getRplDmlStrategy() {
        return this.rplDmlStrategy;
    }

    /**
     * @return rplSyncDdl
     */
    public Boolean getRplSyncDdl() {
        return this.rplSyncDdl;
    }

    public static final class Builder extends Request.Builder<CreateGdnInstanceRequest, Builder> {
        private String DBInstanceName; 
        private String description; 
        private String gdnMode; 
        private String regionId; 
        private String rplConflictStrategy; 
        private String rplDmlStrategy; 
        private Boolean rplSyncDdl; 

        private Builder() {
            super();
        } 

        private Builder(CreateGdnInstanceRequest request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.description = request.description;
            this.gdnMode = request.gdnMode;
            this.regionId = request.regionId;
            this.rplConflictStrategy = request.rplConflictStrategy;
            this.rplDmlStrategy = request.rplDmlStrategy;
            this.rplSyncDdl = request.rplSyncDdl;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-********</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * GdnMode.
         */
        public Builder gdnMode(String gdnMode) {
            this.putQueryParameter("GdnMode", gdnMode);
            this.gdnMode = gdnMode;
            return this;
        }

        /**
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
         * RplConflictStrategy.
         */
        public Builder rplConflictStrategy(String rplConflictStrategy) {
            this.putQueryParameter("RplConflictStrategy", rplConflictStrategy);
            this.rplConflictStrategy = rplConflictStrategy;
            return this;
        }

        /**
         * RplDmlStrategy.
         */
        public Builder rplDmlStrategy(String rplDmlStrategy) {
            this.putQueryParameter("RplDmlStrategy", rplDmlStrategy);
            this.rplDmlStrategy = rplDmlStrategy;
            return this;
        }

        /**
         * RplSyncDdl.
         */
        public Builder rplSyncDdl(Boolean rplSyncDdl) {
            this.putQueryParameter("RplSyncDdl", rplSyncDdl);
            this.rplSyncDdl = rplSyncDdl;
            return this;
        }

        @Override
        public CreateGdnInstanceRequest build() {
            return new CreateGdnInstanceRequest(this);
        } 

    } 

}
