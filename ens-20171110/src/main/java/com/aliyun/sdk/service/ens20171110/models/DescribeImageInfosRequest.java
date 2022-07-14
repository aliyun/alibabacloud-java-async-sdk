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

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private DescribeImageInfosRequest(Builder builder) {
        super(builder);
        this.osType = builder.osType;
        this.version = builder.version;
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

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<DescribeImageInfosRequest, Builder> {
        private String osType; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageInfosRequest request) {
            super(request);
            this.osType = request.osType;
            this.version = request.version;
        } 

        /**
         * OsType.
         */
        public Builder osType(String osType) {
            this.putQueryParameter("OsType", osType);
            this.osType = osType;
            return this;
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
        public DescribeImageInfosRequest build() {
            return new DescribeImageInfosRequest(this);
        } 

    } 

}
