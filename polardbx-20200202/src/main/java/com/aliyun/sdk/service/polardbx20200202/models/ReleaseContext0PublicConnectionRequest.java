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
 * {@link ReleaseContext0PublicConnectionRequest} extends {@link RequestModel}
 *
 * <p>ReleaseContext0PublicConnectionRequest</p>
 */
public class ReleaseContext0PublicConnectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentConnectionString")
    private String currentConnectionString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeType")
    private String nodeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ReleaseContext0PublicConnectionRequest(Builder builder) {
        super(builder);
        this.currentConnectionString = builder.currentConnectionString;
        this.DBInstanceName = builder.DBInstanceName;
        this.nodeType = builder.nodeType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseContext0PublicConnectionRequest create() {
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
     * @return nodeType
     */
    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ReleaseContext0PublicConnectionRequest, Builder> {
        private String currentConnectionString; 
        private String DBInstanceName; 
        private String nodeType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ReleaseContext0PublicConnectionRequest request) {
            super(request);
            this.currentConnectionString = request.currentConnectionString;
            this.DBInstanceName = request.DBInstanceName;
            this.nodeType = request.nodeType;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The public network connection string to release. If this parameter is not specified, the Mem0 public address is subject to automatic release.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-hzjasdyuoo.polarx.rds.aliyuncs.com</p>
         */
        public Builder currentConnectionString(String currentConnectionString) {
            this.putQueryParameter("CurrentConnectionString", currentConnectionString);
            this.currentConnectionString = currentConnectionString;
            return this;
        }

        /**
         * <p>The instance ID.</p>
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
         * <p>The target node type. Valid values:</p>
         * <ul>
         * <li>service</li>
         * <li>dashboard</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dn</p>
         */
        public Builder nodeType(String nodeType) {
            this.putQueryParameter("NodeType", nodeType);
            this.nodeType = nodeType;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
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

        @Override
        public ReleaseContext0PublicConnectionRequest build() {
            return new ReleaseContext0PublicConnectionRequest(this);
        } 

    } 

}
