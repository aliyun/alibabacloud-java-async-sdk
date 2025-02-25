// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
 * {@link DescribeEndpointsRequest} extends {@link RequestModel}
 *
 * <p>DescribeEndpointsRequest</p>
 */
public class DescribeEndpointsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    private DescribeEndpointsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEndpointsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeEndpointsRequest, Builder> {
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEndpointsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ld-bp150tns0sjxs****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public DescribeEndpointsRequest build() {
            return new DescribeEndpointsRequest(this);
        } 

    } 

}
