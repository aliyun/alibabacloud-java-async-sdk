// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAssetDetailByUuidsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAssetDetailByUuidsRequest</p>
 */
public class DescribeAssetDetailByUuidsRequest extends Request {
    @Query
    @NameInMap("Uuids")
    private String uuids;

    private DescribeAssetDetailByUuidsRequest(Builder builder) {
        super(builder);
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAssetDetailByUuidsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeAssetDetailByUuidsRequest, Builder> {
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAssetDetailByUuidsRequest response) {
            super(response);
            this.uuids = response.uuids;
        } 

        /**
         * Uuids.
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public DescribeAssetDetailByUuidsRequest build() {
            return new DescribeAssetDetailByUuidsRequest(this);
        } 

    } 

}
