// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRegionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeRegionsRequest</p>
 */
public class DescribeRegionsRequest extends Request {
    @Query
    @NameInMap("NeedVaultCount")
    private Boolean needVaultCount;

    private DescribeRegionsRequest(Builder builder) {
        super(builder);
        this.needVaultCount = builder.needVaultCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRegionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return needVaultCount
     */
    public Boolean getNeedVaultCount() {
        return this.needVaultCount;
    }

    public static final class Builder extends Request.Builder<DescribeRegionsRequest, Builder> {
        private Boolean needVaultCount; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRegionsRequest request) {
            super(request);
            this.needVaultCount = request.needVaultCount;
        } 

        /**
         * Specifies whether to return detailed information. Default value: false.
         */
        public Builder needVaultCount(Boolean needVaultCount) {
            this.putQueryParameter("NeedVaultCount", needVaultCount);
            this.needVaultCount = needVaultCount;
            return this;
        }

        @Override
        public DescribeRegionsRequest build() {
            return new DescribeRegionsRequest(this);
        } 

    } 

}
