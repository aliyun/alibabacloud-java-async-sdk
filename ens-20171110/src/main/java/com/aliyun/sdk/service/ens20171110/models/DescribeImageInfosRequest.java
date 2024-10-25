// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeImageInfosRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageInfosRequest</p>
 */
public class DescribeImageInfosRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OsType")
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
         * <p>The operating system (OS). You can specify only one OS in a request. If you do not specify a value for this parameter, images for all supported OSs are queried. Valid values:</p>
         * <ul>
         * <li>linux</li>
         * <li>windows</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
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
