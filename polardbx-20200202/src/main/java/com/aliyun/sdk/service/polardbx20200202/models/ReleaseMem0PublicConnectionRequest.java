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
 * {@link ReleaseMem0PublicConnectionRequest} extends {@link RequestModel}
 *
 * <p>ReleaseMem0PublicConnectionRequest</p>
 */
public class ReleaseMem0PublicConnectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentConnectionString")
    private String currentConnectionString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ReleaseMem0PublicConnectionRequest(Builder builder) {
        super(builder);
        this.currentConnectionString = builder.currentConnectionString;
        this.DBInstanceName = builder.DBInstanceName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseMem0PublicConnectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentConnectionString
     */
    public String getCurrentConnectionString() {
        return this.currentConnectionString;
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

    public static final class Builder extends Request.Builder<ReleaseMem0PublicConnectionRequest, Builder> {
        private String currentConnectionString; 
        private String DBInstanceName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ReleaseMem0PublicConnectionRequest request) {
            super(request);
            this.currentConnectionString = request.currentConnectionString;
            this.DBInstanceName = request.DBInstanceName;
            this.regionId = request.regionId;
        } 

        /**
         * CurrentConnectionString.
         */
        public Builder currentConnectionString(String currentConnectionString) {
            this.putQueryParameter("CurrentConnectionString", currentConnectionString);
            this.currentConnectionString = currentConnectionString;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ReleaseMem0PublicConnectionRequest build() {
            return new ReleaseMem0PublicConnectionRequest(this);
        } 

    } 

}
