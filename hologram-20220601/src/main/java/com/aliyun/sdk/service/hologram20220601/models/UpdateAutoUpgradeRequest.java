// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link UpdateAutoUpgradeRequest} extends {@link RequestModel}
 *
 * <p>UpdateAutoUpgradeRequest</p>
 */
public class UpdateAutoUpgradeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoUpgrade")
    private String autoUpgrade;

    private UpdateAutoUpgradeRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.autoUpgrade = builder.autoUpgrade;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAutoUpgradeRequest create() {
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
     * @return autoUpgrade
     */
    public String getAutoUpgrade() {
        return this.autoUpgrade;
    }

    public static final class Builder extends Request.Builder<UpdateAutoUpgradeRequest, Builder> {
        private String instanceId; 
        private String autoUpgrade; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAutoUpgradeRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.autoUpgrade = request.autoUpgrade;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * autoUpgrade.
         */
        public Builder autoUpgrade(String autoUpgrade) {
            this.putBodyParameter("autoUpgrade", autoUpgrade);
            this.autoUpgrade = autoUpgrade;
            return this;
        }

        @Override
        public UpdateAutoUpgradeRequest build() {
            return new UpdateAutoUpgradeRequest(this);
        } 

    } 

}
