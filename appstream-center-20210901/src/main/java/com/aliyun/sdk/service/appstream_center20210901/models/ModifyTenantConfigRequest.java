// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ModifyTenantConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyTenantConfigRequest</p>
 */
public class ModifyTenantConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupExpireRemind")
    private Boolean appInstanceGroupExpireRemind;

    private ModifyTenantConfigRequest(Builder builder) {
        super(builder);
        this.appInstanceGroupExpireRemind = builder.appInstanceGroupExpireRemind;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTenantConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstanceGroupExpireRemind
     */
    public Boolean getAppInstanceGroupExpireRemind() {
        return this.appInstanceGroupExpireRemind;
    }

    public static final class Builder extends Request.Builder<ModifyTenantConfigRequest, Builder> {
        private Boolean appInstanceGroupExpireRemind; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTenantConfigRequest request) {
            super(request);
            this.appInstanceGroupExpireRemind = request.appInstanceGroupExpireRemind;
        } 

        /**
         * <p>Specifies whether to enable the resource expiration reminder feature.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder appInstanceGroupExpireRemind(Boolean appInstanceGroupExpireRemind) {
            this.putBodyParameter("AppInstanceGroupExpireRemind", appInstanceGroupExpireRemind);
            this.appInstanceGroupExpireRemind = appInstanceGroupExpireRemind;
            return this;
        }

        @Override
        public ModifyTenantConfigRequest build() {
            return new ModifyTenantConfigRequest(this);
        } 

    } 

}
