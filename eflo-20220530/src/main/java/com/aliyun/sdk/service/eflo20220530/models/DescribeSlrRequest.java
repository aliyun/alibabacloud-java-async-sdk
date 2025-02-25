// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link DescribeSlrRequest} extends {@link RequestModel}
 *
 * <p>DescribeSlrRequest</p>
 */
public class DescribeSlrRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private DescribeSlrRequest(Builder builder) {
        super(builder);
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlrRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<DescribeSlrRequest, Builder> {
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSlrRequest request) {
            super(request);
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>The ID of the resource group to which the RAM instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aeky5f3qx6ceapq</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public DescribeSlrRequest build() {
            return new DescribeSlrRequest(this);
        } 

    } 

}
