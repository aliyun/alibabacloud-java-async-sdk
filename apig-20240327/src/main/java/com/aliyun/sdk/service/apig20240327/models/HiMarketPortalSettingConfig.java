// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link HiMarketPortalSettingConfig} extends {@link TeaModel}
 *
 * <p>HiMarketPortalSettingConfig</p>
 */
public class HiMarketPortalSettingConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("autoApproveDevelopers")
    private Boolean autoApproveDevelopers;

    @com.aliyun.core.annotation.NameInMap("autoApproveSubscriptions")
    private Boolean autoApproveSubscriptions;

    @com.aliyun.core.annotation.NameInMap("builtinAuthEnabled")
    private Boolean builtinAuthEnabled;

    private HiMarketPortalSettingConfig(Builder builder) {
        this.autoApproveDevelopers = builder.autoApproveDevelopers;
        this.autoApproveSubscriptions = builder.autoApproveSubscriptions;
        this.builtinAuthEnabled = builder.builtinAuthEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HiMarketPortalSettingConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoApproveDevelopers
     */
    public Boolean getAutoApproveDevelopers() {
        return this.autoApproveDevelopers;
    }

    /**
     * @return autoApproveSubscriptions
     */
    public Boolean getAutoApproveSubscriptions() {
        return this.autoApproveSubscriptions;
    }

    /**
     * @return builtinAuthEnabled
     */
    public Boolean getBuiltinAuthEnabled() {
        return this.builtinAuthEnabled;
    }

    public static final class Builder {
        private Boolean autoApproveDevelopers; 
        private Boolean autoApproveSubscriptions; 
        private Boolean builtinAuthEnabled; 

        private Builder() {
        } 

        private Builder(HiMarketPortalSettingConfig model) {
            this.autoApproveDevelopers = model.autoApproveDevelopers;
            this.autoApproveSubscriptions = model.autoApproveSubscriptions;
            this.builtinAuthEnabled = model.builtinAuthEnabled;
        } 

        /**
         * autoApproveDevelopers.
         */
        public Builder autoApproveDevelopers(Boolean autoApproveDevelopers) {
            this.autoApproveDevelopers = autoApproveDevelopers;
            return this;
        }

        /**
         * autoApproveSubscriptions.
         */
        public Builder autoApproveSubscriptions(Boolean autoApproveSubscriptions) {
            this.autoApproveSubscriptions = autoApproveSubscriptions;
            return this;
        }

        /**
         * builtinAuthEnabled.
         */
        public Builder builtinAuthEnabled(Boolean builtinAuthEnabled) {
            this.builtinAuthEnabled = builtinAuthEnabled;
            return this;
        }

        public HiMarketPortalSettingConfig build() {
            return new HiMarketPortalSettingConfig(this);
        } 

    } 

}
