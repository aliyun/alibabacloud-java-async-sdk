// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
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
         * <p>The operating system type. Only a single type can be specified. If this parameter is not specified, all types are queried.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>Linux</p>
         * </li>
         * <li><p>windows</p>
         * </li>
         * </ul>
         * <p>In practice, passing linux or Linux may return an empty list, whereas omitting this parameter can return images with an OSType of linux. Verify the actual results before relying on this filter.</p>
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
