// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String uuids; 

        /**
         * <p>Uuids.</p>
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        public DescribeAssetDetailByUuidsRequest build() {
            return new DescribeAssetDetailByUuidsRequest(this);
        } 

    } 

}
