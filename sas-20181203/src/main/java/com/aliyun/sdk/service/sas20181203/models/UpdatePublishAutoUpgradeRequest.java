// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePublishAutoUpgradeRequest} extends {@link RequestModel}
 *
 * <p>UpdatePublishAutoUpgradeRequest</p>
 */
public class UpdatePublishAutoUpgradeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoUpgrade")
    private Integer autoUpgrade;

    private UpdatePublishAutoUpgradeRequest(Builder builder) {
        super(builder);
        this.autoUpgrade = builder.autoUpgrade;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePublishAutoUpgradeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoUpgrade
     */
    public Integer getAutoUpgrade() {
        return this.autoUpgrade;
    }

    public static final class Builder extends Request.Builder<UpdatePublishAutoUpgradeRequest, Builder> {
        private Integer autoUpgrade; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePublishAutoUpgradeRequest request) {
            super(request);
            this.autoUpgrade = request.autoUpgrade;
        } 

        /**
         * AutoUpgrade.
         */
        public Builder autoUpgrade(Integer autoUpgrade) {
            this.putQueryParameter("AutoUpgrade", autoUpgrade);
            this.autoUpgrade = autoUpgrade;
            return this;
        }

        @Override
        public UpdatePublishAutoUpgradeRequest build() {
            return new UpdatePublishAutoUpgradeRequest(this);
        } 

    } 

}
