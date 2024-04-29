// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindAegisRequest} extends {@link RequestModel}
 *
 * <p>UnbindAegisRequest</p>
 */
public class UnbindAegisRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uuids;

    private UnbindAegisRequest(Builder builder) {
        super(builder);
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindAegisRequest create() {
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

    public static final class Builder extends Request.Builder<UnbindAegisRequest, Builder> {
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(UnbindAegisRequest request) {
            super(request);
            this.uuids = request.uuids;
        } 

        /**
         * The UUID of the server that you want to unbind. Separate multiple UUIDs with commas (,).
         * <p>
         * 
         * > You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public UnbindAegisRequest build() {
            return new UnbindAegisRequest(this);
        } 

    } 

}
