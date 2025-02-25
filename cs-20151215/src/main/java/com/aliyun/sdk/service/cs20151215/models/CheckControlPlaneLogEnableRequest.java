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
 * {@link CheckControlPlaneLogEnableRequest} extends {@link RequestModel}
 *
 * <p>CheckControlPlaneLogEnableRequest</p>
 */
public class CheckControlPlaneLogEnableRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    private CheckControlPlaneLogEnableRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckControlPlaneLogEnableRequest create() {
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

    public static final class Builder extends Request.Builder<CheckControlPlaneLogEnableRequest, Builder> {
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(CheckControlPlaneLogEnableRequest request) {
            super(request);
            this.clusterId = request.clusterId;
        } 

        /**
         * <p>The cluster ID.</p>
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

        @Override
        public CheckControlPlaneLogEnableRequest build() {
            return new CheckControlPlaneLogEnableRequest(this);
        } 

    } 

}
