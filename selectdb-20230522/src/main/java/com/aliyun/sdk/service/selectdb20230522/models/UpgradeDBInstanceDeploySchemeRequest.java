// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

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
 * {@link UpgradeDBInstanceDeploySchemeRequest} extends {@link RequestModel}
 *
 * <p>UpgradeDBInstanceDeploySchemeRequest</p>
 */
public class UpgradeDBInstanceDeploySchemeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MultiZone")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<MultiZone> multiZone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private UpgradeDBInstanceDeploySchemeRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.multiZone = builder.multiZone;
        this.regionId = builder.regionId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeDBInstanceDeploySchemeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return multiZone
     */
    public java.util.List<MultiZone> getMultiZone() {
        return this.multiZone;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<UpgradeDBInstanceDeploySchemeRequest, Builder> {
        private String DBInstanceId; 
        private java.util.List<MultiZone> multiZone; 
        private String regionId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeDBInstanceDeploySchemeRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.multiZone = request.multiZone;
            this.regionId = request.regionId;
            this.securityToken = request.securityToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-7213cjv****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder multiZone(java.util.List<MultiZone> multiZone) {
            String multiZoneShrink = shrink(multiZone, "MultiZone", "json");
            this.putQueryParameter("MultiZone", multiZoneShrink);
            this.multiZone = multiZone;
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public UpgradeDBInstanceDeploySchemeRequest build() {
            return new UpgradeDBInstanceDeploySchemeRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpgradeDBInstanceDeploySchemeRequest} extends {@link TeaModel}
     *
     * <p>UpgradeDBInstanceDeploySchemeRequest</p>
     */
    public static class MultiZone extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String zoneId;

        private MultiZone(Builder builder) {
            this.vSwitchIds = builder.vSwitchIds;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultiZone create() {
            return builder().build();
        }

        /**
         * @return vSwitchIds
         */
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private java.util.List<String> vSwitchIds; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(MultiZone model) {
                this.vSwitchIds = model.vSwitchIds;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing-k</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public MultiZone build() {
                return new MultiZone(this);
            } 

        } 

    }
}
