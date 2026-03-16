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
 * {@link SwitchGdnMemberRoleRequest} extends {@link RequestModel}
 *
 * <p>SwitchGdnMemberRoleRequest</p>
 */
public class SwitchGdnMemberRoleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.NameInMap("SrcMainConnectString")
    private String srcMainConnectString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcMainPort")
    private String srcMainPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String switchMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskTimeout")
    private Long taskTimeout;

    private SwitchGdnMemberRoleRequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.dstMainConnectString = builder.dstMainConnectString;
        this.dstMainPort = builder.dstMainPort;
        this.isModifyEndpoint = builder.isModifyEndpoint;
        this.regionId = builder.regionId;
        this.srcMainConnectString = builder.srcMainConnectString;
        this.srcMainPort = builder.srcMainPort;
        this.switchMode = builder.switchMode;
        this.taskTimeout = builder.taskTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SwitchGdnMemberRoleRequest create() {
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

    /**
     * @return switchMode
     */
    public String getSwitchMode() {
        return this.switchMode;
    }

    /**
     * @return taskTimeout
     */
    public Long getTaskTimeout() {
        return this.taskTimeout;
    }

    public static final class Builder extends Request.Builder<SwitchGdnMemberRoleRequest, Builder> {
        private String DBInstanceName; 
        private String dstMainConnectString; 
        private String dstMainPort; 
        private String isModifyEndpoint; 
        private String regionId; 
        private String srcMainConnectString; 
        private String srcMainPort; 
        private String switchMode; 
        private Long taskTimeout; 

        private Builder() {
            super();
        } 

        private Builder(SwitchGdnMemberRoleRequest request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.dstMainConnectString = request.dstMainConnectString;
            this.dstMainPort = request.dstMainPort;
            this.isModifyEndpoint = request.isModifyEndpoint;
            this.regionId = request.regionId;
            this.srcMainConnectString = request.srcMainConnectString;
            this.srcMainPort = request.srcMainPort;
            this.switchMode = request.switchMode;
            this.taskTimeout = request.taskTimeout;
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

        /**
         * <p>This parameter is required.</p>
         */
        public Builder switchMode(String switchMode) {
            this.putQueryParameter("SwitchMode", switchMode);
            this.switchMode = switchMode;
            return this;
        }

        /**
         * TaskTimeout.
         */
        public Builder taskTimeout(Long taskTimeout) {
            this.putQueryParameter("TaskTimeout", taskTimeout);
            this.taskTimeout = taskTimeout;
            return this;
        }

        @Override
        public SwitchGdnMemberRoleRequest build() {
            return new SwitchGdnMemberRoleRequest(this);
        } 

    } 

}
