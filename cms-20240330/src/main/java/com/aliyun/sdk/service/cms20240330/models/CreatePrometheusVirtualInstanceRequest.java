// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link CreatePrometheusVirtualInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreatePrometheusVirtualInstanceRequest</p>
 */
public class CreatePrometheusVirtualInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    private CreatePrometheusVirtualInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePrometheusVirtualInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    public static final class Builder extends Request.Builder<CreatePrometheusVirtualInstanceRequest, Builder> {
        private String regionId; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(CreatePrometheusVirtualInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.namespace = request.namespace;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Each cloud product can only create one virtual instance in each region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cms_prometheus</p>
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        @Override
        public CreatePrometheusVirtualInstanceRequest build() {
            return new CreatePrometheusVirtualInstanceRequest(this);
        } 

    } 

}
