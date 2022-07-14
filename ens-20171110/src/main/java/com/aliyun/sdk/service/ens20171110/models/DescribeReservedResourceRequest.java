// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeReservedResourceRequest} extends {@link RequestModel}
 *
 * <p>DescribeReservedResourceRequest</p>
 */
public class DescribeReservedResourceRequest extends Request {
    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private DescribeReservedResourceRequest(Builder builder) {
        super(builder);
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeReservedResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<DescribeReservedResourceRequest, Builder> {
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(DescribeReservedResourceRequest request) {
            super(request);
            this.version = request.version;
        } 

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public DescribeReservedResourceRequest build() {
            return new DescribeReservedResourceRequest(this);
        } 

    } 

}
