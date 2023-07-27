// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApsResourceGroupsRequest} extends {@link RequestModel}
 *
 * <p>DescribeApsResourceGroupsRequest</p>
 */
public class DescribeApsResourceGroupsRequest extends Request {
    @Body
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    private DescribeApsResourceGroupsRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApsResourceGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public static final class Builder extends Request.Builder<DescribeApsResourceGroupsRequest, Builder> {
        private String DBClusterId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApsResourceGroupsRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
        } 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        @Override
        public DescribeApsResourceGroupsRequest build() {
            return new DescribeApsResourceGroupsRequest(this);
        } 

    } 

}
