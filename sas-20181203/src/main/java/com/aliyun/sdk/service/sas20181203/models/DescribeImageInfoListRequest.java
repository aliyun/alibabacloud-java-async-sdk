// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageInfoListRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageInfoListRequest</p>
 */
public class DescribeImageInfoListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uuids;

    private DescribeImageInfoListRequest(Builder builder) {
        super(builder);
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageInfoListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<DescribeImageInfoListRequest, Builder> {
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageInfoListRequest request) {
            super(request);
            this.uuids = request.uuids;
        } 

        /**
         * The UUID of the server. Separate multiple UUIDs with commas (,).
         * <p>
         * 
         * > You can call the [DescribeCloudCenterInstances](~~141932~~) operation to query the UUIDs of servers.
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public DescribeImageInfoListRequest build() {
            return new DescribeImageInfoListRequest(this);
        } 

    } 

}
