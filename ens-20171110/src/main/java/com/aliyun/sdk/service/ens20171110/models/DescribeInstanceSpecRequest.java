// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceSpecRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceSpecRequest</p>
 */
public class DescribeInstanceSpecRequest extends Request {
    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private DescribeInstanceSpecRequest(Builder builder) {
        super(builder);
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceSpecRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeInstanceSpecRequest, Builder> {
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceSpecRequest request) {
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
        public DescribeInstanceSpecRequest build() {
            return new DescribeInstanceSpecRequest(this);
        } 

    } 

}
