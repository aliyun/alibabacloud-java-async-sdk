// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeSDGsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSDGsRequest</p>
 */
public class DescribeSDGsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SDGIds")
    private java.util.List<String> SDGIds;

    private DescribeSDGsRequest(Builder builder) {
        super(builder);
        this.instanceIds = builder.instanceIds;
        this.SDGIds = builder.SDGIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSDGsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return SDGIds
     */
    public java.util.List<String> getSDGIds() {
        return this.SDGIds;
    }

    public static final class Builder extends Request.Builder<DescribeSDGsRequest, Builder> {
        private java.util.List<String> instanceIds; 
        private java.util.List<String> SDGIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSDGsRequest request) {
            super(request);
            this.instanceIds = request.instanceIds;
            this.SDGIds = request.SDGIds;
        } 

        /**
         * <p>The AIC instance ID to be queried.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            String instanceIdsShrink = shrink(instanceIds, "InstanceIds", "json");
            this.putQueryParameter("InstanceIds", instanceIdsShrink);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The IDs of SDGs that you want to query. By default, all SDGs are queried.</p>
         */
        public Builder SDGIds(java.util.List<String> SDGIds) {
            String SDGIdsShrink = shrink(SDGIds, "SDGIds", "json");
            this.putQueryParameter("SDGIds", SDGIdsShrink);
            this.SDGIds = SDGIds;
            return this;
        }

        @Override
        public DescribeSDGsRequest build() {
            return new DescribeSDGsRequest(this);
        } 

    } 

}
