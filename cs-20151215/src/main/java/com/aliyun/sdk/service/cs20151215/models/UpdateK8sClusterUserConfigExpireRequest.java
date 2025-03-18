// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link UpdateK8sClusterUserConfigExpireRequest} extends {@link RequestModel}
 *
 * <p>UpdateK8sClusterUserConfigExpireRequest</p>
 */
public class UpdateK8sClusterUserConfigExpireRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("expire_hour")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 876000)
    private Long expireHour;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user")
    @com.aliyun.core.annotation.Validation(required = true)
    private String user;

    private UpdateK8sClusterUserConfigExpireRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.expireHour = builder.expireHour;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateK8sClusterUserConfigExpireRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return expireHour
     */
    public Long getExpireHour() {
        return this.expireHour;
    }

    /**
     * @return user
     */
    public String getUser() {
        return this.user;
    }

    public static final class Builder extends Request.Builder<UpdateK8sClusterUserConfigExpireRequest, Builder> {
        private String clusterId; 
        private Long expireHour; 
        private String user; 

        private Builder() {
            super();
        } 

        private Builder(UpdateK8sClusterUserConfigExpireRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.expireHour = request.expireHour;
            this.user = request.user;
        } 

        /**
         * <p>The ID of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c5b5e80b0b64a4bf6939d2d8fbbc5****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The validity period of the kubeconfig file. Unit: hours.</p>
         * <blockquote>
         * <p>The value of expire_hour must be greater than 0 and equal to or smaller than 876000 (100 years).</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
        public Builder expireHour(Long expireHour) {
            this.putBodyParameter("expire_hour", expireHour);
            this.expireHour = expireHour;
            return this;
        }

        /**
         * <p>The user ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>The ID of the Resource Access Management (RAM) user that you use.</p>
         */
        public Builder user(String user) {
            this.putBodyParameter("user", user);
            this.user = user;
            return this;
        }

        @Override
        public UpdateK8sClusterUserConfigExpireRequest build() {
            return new UpdateK8sClusterUserConfigExpireRequest(this);
        } 

    } 

}
