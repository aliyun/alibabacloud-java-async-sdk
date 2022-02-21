// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsNetLevelRequest} extends {@link RequestModel}
 *
 * <p>DescribeEnsNetLevelRequest</p>
 */
public class DescribeEnsNetLevelRequest extends Request {
    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private DescribeEnsNetLevelRequest(Builder builder) {
        super(builder);
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnsNetLevelRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeEnsNetLevelRequest, Builder> {
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEnsNetLevelRequest response) {
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
        public DescribeEnsNetLevelRequest build() {
            return new DescribeEnsNetLevelRequest(this);
        } 

    } 

}
