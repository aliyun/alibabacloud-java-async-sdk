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
 * {@link StartSwitchDatabaseRequest} extends {@link RequestModel}
 *
 * <p>StartSwitchDatabaseRequest</p>
 */
public class StartSwitchDatabaseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstMainConnectString")
    private String dstMainConnectString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstMainPort")
    private String dstMainPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsModifyEndpoint")
    private String isModifyEndpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlinkTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String slinkTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcMainConnectString")
    private String srcMainConnectString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcMainPort")
    private String srcMainPort;

    private StartSwitchDatabaseRequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.dstMainConnectString = builder.dstMainConnectString;
        this.dstMainPort = builder.dstMainPort;
        this.isModifyEndpoint = builder.isModifyEndpoint;
        this.regionId = builder.regionId;
        this.slinkTaskId = builder.slinkTaskId;
        this.srcMainConnectString = builder.srcMainConnectString;
        this.srcMainPort = builder.srcMainPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartSwitchDatabaseRequest create() {
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
     * @return dstMainConnectString
     */
    public String getDstMainConnectString() {
        return this.dstMainConnectString;
    }

    /**
     * @return dstMainPort
     */
    public String getDstMainPort() {
        return this.dstMainPort;
    }

    /**
     * @return isModifyEndpoint
     */
    public String getIsModifyEndpoint() {
        return this.isModifyEndpoint;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return slinkTaskId
     */
    public String getSlinkTaskId() {
        return this.slinkTaskId;
    }

    /**
     * @return srcMainConnectString
     */
    public String getSrcMainConnectString() {
        return this.srcMainConnectString;
    }

    /**
     * @return srcMainPort
     */
    public String getSrcMainPort() {
        return this.srcMainPort;
    }

    public static final class Builder extends Request.Builder<StartSwitchDatabaseRequest, Builder> {
        private String DBInstanceName; 
        private String dstMainConnectString; 
        private String dstMainPort; 
        private String isModifyEndpoint; 
        private String regionId; 
        private String slinkTaskId; 
        private String srcMainConnectString; 
        private String srcMainPort; 

        private Builder() {
            super();
        } 

        private Builder(StartSwitchDatabaseRequest request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.dstMainConnectString = request.dstMainConnectString;
            this.dstMainPort = request.dstMainPort;
            this.isModifyEndpoint = request.isModifyEndpoint;
            this.regionId = request.regionId;
            this.slinkTaskId = request.slinkTaskId;
            this.srcMainConnectString = request.srcMainConnectString;
            this.srcMainPort = request.srcMainPort;
        } 

        /**
         * DBInstanceName.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * DstMainConnectString.
         */
        public Builder dstMainConnectString(String dstMainConnectString) {
            this.putQueryParameter("DstMainConnectString", dstMainConnectString);
            this.dstMainConnectString = dstMainConnectString;
            return this;
        }

        /**
         * DstMainPort.
         */
        public Builder dstMainPort(String dstMainPort) {
            this.putQueryParameter("DstMainPort", dstMainPort);
            this.dstMainPort = dstMainPort;
            return this;
        }

        /**
         * IsModifyEndpoint.
         */
        public Builder isModifyEndpoint(String isModifyEndpoint) {
            this.putQueryParameter("IsModifyEndpoint", isModifyEndpoint);
            this.isModifyEndpoint = isModifyEndpoint;
            return this;
        }

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>etx-szr2rr6i*****</p>
         */
        public Builder slinkTaskId(String slinkTaskId) {
            this.putQueryParameter("SlinkTaskId", slinkTaskId);
            this.slinkTaskId = slinkTaskId;
            return this;
        }

        /**
         * SrcMainConnectString.
         */
        public Builder srcMainConnectString(String srcMainConnectString) {
            this.putQueryParameter("SrcMainConnectString", srcMainConnectString);
            this.srcMainConnectString = srcMainConnectString;
            return this;
        }

        /**
         * SrcMainPort.
         */
        public Builder srcMainPort(String srcMainPort) {
            this.putQueryParameter("SrcMainPort", srcMainPort);
            this.srcMainPort = srcMainPort;
            return this;
        }

        @Override
        public StartSwitchDatabaseRequest build() {
            return new StartSwitchDatabaseRequest(this);
        } 

    } 

}
