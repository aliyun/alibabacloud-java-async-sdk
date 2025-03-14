// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * <p>Specifies whether to enable automatic upgrade. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes</li>
         * <li><strong>0</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
