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
 * {@link ListAutoRepairPoliciesRequest} extends {@link RequestModel}
 *
 * <p>ListAutoRepairPoliciesRequest</p>
 */
public class ListAutoRepairPoliciesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    private String clusterId;

    private ListAutoRepairPoliciesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAutoRepairPoliciesRequest create() {
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

    public static final class Builder extends Request.Builder<ListAutoRepairPoliciesRequest, Builder> {
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(ListAutoRepairPoliciesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
        } 

        /**
         * cluster_id.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public ListAutoRepairPoliciesRequest build() {
            return new ListAutoRepairPoliciesRequest(this);
        } 

    } 

}
