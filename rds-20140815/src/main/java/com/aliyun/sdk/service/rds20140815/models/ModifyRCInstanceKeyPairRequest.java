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
 * {@link ModifyRCInstanceKeyPairRequest} extends {@link RequestModel}
 *
 * <p>ModifyRCInstanceKeyPairRequest</p>
 */
public class ModifyRCInstanceKeyPairRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    private String keyPairName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reboot")
    private Boolean reboot;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ModifyRCInstanceKeyPairRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.keyPairName = builder.keyPairName;
        this.reboot = builder.reboot;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRCInstanceKeyPairRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return reboot
     */
    public Boolean getReboot() {
        return this.reboot;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyRCInstanceKeyPairRequest, Builder> {
        private String instanceId; 
        private String keyPairName; 
        private Boolean reboot; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyRCInstanceKeyPairRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.keyPairName = request.keyPairName;
            this.reboot = request.reboot;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rc-m5sc1271fv344a1r****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the key pair.</p>
         * 
         * <strong>example:</strong>
         * <p>customer_keypairs</p>
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * <p>Specifies whether to restart the instance.</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ture</p>
         */
        public Builder reboot(Boolean reboot) {
            this.putQueryParameter("Reboot", reboot);
            this.reboot = reboot;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
        public ModifyRCInstanceKeyPairRequest build() {
            return new ModifyRCInstanceKeyPairRequest(this);
        } 

    } 

}
