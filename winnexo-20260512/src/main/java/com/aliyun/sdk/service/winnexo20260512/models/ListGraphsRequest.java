// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link ListGraphsRequest} extends {@link RequestModel}
 *
 * <p>ListGraphsRequest</p>
 */
public class ListGraphsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    private ListGraphsRequest(Builder builder) {
        super(builder);
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGraphsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ListGraphsRequest, Builder> {
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListGraphsRequest request) {
            super(request);
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>21577</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public ListGraphsRequest build() {
            return new ListGraphsRequest(this);
        } 

    } 

}
