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
 * {@link ListUserVpcRequest} extends {@link RequestModel}
 *
 * <p>ListUserVpcRequest</p>
 */
public class ListUserVpcRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("K8sRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String k8sRegionId;

    private ListUserVpcRequest(Builder builder) {
        super(builder);
        this.k8sRegionId = builder.k8sRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserVpcRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return k8sRegionId
     */
    public String getK8sRegionId() {
        return this.k8sRegionId;
    }

    public static final class Builder extends Request.Builder<ListUserVpcRequest, Builder> {
        private String k8sRegionId; 

        private Builder() {
            super();
        } 

        private Builder(ListUserVpcRequest request) {
            super(request);
            this.k8sRegionId = request.k8sRegionId;
        } 

        /**
         * <p>Region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder k8sRegionId(String k8sRegionId) {
            this.putQueryParameter("K8sRegionId", k8sRegionId);
            this.k8sRegionId = k8sRegionId;
            return this;
        }

        @Override
        public ListUserVpcRequest build() {
            return new ListUserVpcRequest(this);
        } 

    } 

}
