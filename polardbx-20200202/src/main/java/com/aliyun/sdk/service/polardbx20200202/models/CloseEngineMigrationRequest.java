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
 * {@link CloseEngineMigrationRequest} extends {@link RequestModel}
 *
 * <p>CloseEngineMigrationRequest</p>
 */
public class CloseEngineMigrationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContinueEnableBinlog")
    private String continueEnableBinlog;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private CloseEngineMigrationRequest(Builder builder) {
        super(builder);
        this.continueEnableBinlog = builder.continueEnableBinlog;
        this.DBInstanceName = builder.DBInstanceName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloseEngineMigrationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return continueEnableBinlog
     */
    public String getContinueEnableBinlog() {
        return this.continueEnableBinlog;
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CloseEngineMigrationRequest, Builder> {
        private String continueEnableBinlog; 
        private String DBInstanceName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CloseEngineMigrationRequest request) {
            super(request);
            this.continueEnableBinlog = request.continueEnableBinlog;
            this.DBInstanceName = request.DBInstanceName;
            this.regionId = request.regionId;
        } 

        /**
         * ContinueEnableBinlog.
         */
        public Builder continueEnableBinlog(String continueEnableBinlog) {
            this.putQueryParameter("ContinueEnableBinlog", continueEnableBinlog);
            this.continueEnableBinlog = continueEnableBinlog;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-htri0****r4k9p</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
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
        public CloseEngineMigrationRequest build() {
            return new CloseEngineMigrationRequest(this);
        } 

    } 

}
