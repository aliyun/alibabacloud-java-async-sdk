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
 * {@link CancelComponentUpgradeRequest} extends {@link RequestModel}
 *
 * <p>CancelComponentUpgradeRequest</p>
 */
public class CancelComponentUpgradeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("clusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("componentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String componentId;

    private CancelComponentUpgradeRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.componentId = builder.componentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelComponentUpgradeRequest create() {
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
     * @return componentId
     */
    public String getComponentId() {
        return this.componentId;
    }

    public static final class Builder extends Request.Builder<CancelComponentUpgradeRequest, Builder> {
        private String clusterId; 
        private String componentId; 

        private Builder() {
            super();
        } 

        private Builder(CancelComponentUpgradeRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.componentId = request.componentId;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c82e6987e2961451182edacd74faf****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("clusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The component ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>metric-server</p>
         */
        public Builder componentId(String componentId) {
            this.putPathParameter("componentId", componentId);
            this.componentId = componentId;
            return this;
        }

        @Override
        public CancelComponentUpgradeRequest build() {
            return new CancelComponentUpgradeRequest(this);
        } 

    } 

}
