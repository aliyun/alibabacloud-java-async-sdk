// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageInfosRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageInfosRequest</p>
 */
public class DescribeImageInfosRequest extends Request {
    @Query
    @NameInMap("OsType")
    private String osType;

    private DescribeImageInfosRequest(Builder builder) {
        super(builder);
        this.osType = builder.osType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageInfosRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return osType
     */
    public String getOsType() {
        return this.osType;
    }

    public static final class Builder extends Request.Builder<DescribeImageInfosRequest, Builder> {
        private String osType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageInfosRequest request) {
            super(request);
            this.osType = request.osType;
        } 

        /**
         * OsType.
         */
        public Builder osType(String osType) {
            this.putQueryParameter("OsType", osType);
            this.osType = osType;
            return this;
        }

        @Override
        public DescribeImageInfosRequest build() {
            return new DescribeImageInfosRequest(this);
        } 

    } 

}
