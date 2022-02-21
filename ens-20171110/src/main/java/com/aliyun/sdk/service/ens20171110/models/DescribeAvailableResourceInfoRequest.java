// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableResourceInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeAvailableResourceInfoRequest</p>
 */
public class DescribeAvailableResourceInfoRequest extends Request {
    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private DescribeAvailableResourceInfoRequest(Builder builder) {
        super(builder);
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableResourceInfoRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeAvailableResourceInfoRequest, Builder> {
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAvailableResourceInfoRequest response) {
            super(response);
            this.version = response.version;
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
        public DescribeAvailableResourceInfoRequest build() {
            return new DescribeAvailableResourceInfoRequest(this);
        } 

    } 

}
