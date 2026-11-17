// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link UpdateFirewallFeatureRequest} extends {@link RequestModel}
 *
 * <p>UpdateFirewallFeatureRequest</p>
 */
public class UpdateFirewallFeatureRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeatureName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String featureName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    private UpdateFirewallFeatureRequest(Builder builder) {
        super(builder);
        this.featureName = builder.featureName;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFirewallFeatureRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return featureName
     */
    public String getFeatureName() {
        return this.featureName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateFirewallFeatureRequest, Builder> {
        private String featureName; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFirewallFeatureRequest request) {
            super(request);
            this.featureName = request.featureName;
            this.status = request.status;
        } 

        /**
         * <p>The name of the feature to enable. Valid values:</p>
         * <ul>
         * <li><strong>ApplicationControl</strong>: application control</li>
         * <li><strong>WebFilter</strong>: web filtering</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ApplicationControl</p>
         */
        public Builder featureName(String featureName) {
            this.putQueryParameter("FeatureName", featureName);
            this.featureName = featureName;
            return this;
        }

        /**
         * <p>The status of the feature. Only <strong>Enable</strong> is supported, which enables the feature. Specifying Disable or other values returns an error. This operation is idempotent if the feature is already enabled.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateFirewallFeatureRequest build() {
            return new UpdateFirewallFeatureRequest(this);
        } 

    } 

}
