// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceRebootStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceRebootStatusRequest</p>
 */
public class DescribeInstanceRebootStatusRequest extends Request {
    @Query
    @NameInMap("Uuids")
    @Validation(required = true)
    private String uuids;

    private DescribeInstanceRebootStatusRequest(Builder builder) {
        super(builder);
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceRebootStatusRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeInstanceRebootStatusRequest, Builder> {
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceRebootStatusRequest request) {
            super(request);
            this.uuids = request.uuids;
        } 

        /**
         * Queries the status of the servers that you restart.
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public DescribeInstanceRebootStatusRequest build() {
            return new DescribeInstanceRebootStatusRequest(this);
        } 

    } 

}
