// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpgradeApplicationApmServiceRequest} extends {@link RequestModel}
 *
 * <p>UpgradeApplicationApmServiceRequest</p>
 */
public class UpgradeApplicationApmServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    private UpgradeApplicationApmServiceRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeApplicationApmServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    public static final class Builder extends Request.Builder<UpgradeApplicationApmServiceRequest, Builder> {
        private String appId; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeApplicationApmServiceRequest request) {
            super(request);
            this.appId = request.appId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>017f39b8-dfa4-4e16-a84b-1dcee4b1****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        @Override
        public UpgradeApplicationApmServiceRequest build() {
            return new UpgradeApplicationApmServiceRequest(this);
        } 

    } 

}
