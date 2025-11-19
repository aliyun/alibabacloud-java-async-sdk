// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link DescribeSecurityIPGroupRequest} extends {@link RequestModel}
 *
 * <p>DescribeSecurityIPGroupRequest</p>
 */
public class DescribeSecurityIPGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionName;

    private DescribeSecurityIPGroupRequest(Builder builder) {
        super(builder);
        this.regionName = builder.regionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityIPGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionName
     */
    public String getRegionName() {
        return this.regionName;
    }

    public static final class Builder extends Request.Builder<DescribeSecurityIPGroupRequest, Builder> {
        private String regionName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSecurityIPGroupRequest request) {
            super(request);
            this.regionName = request.regionName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionName(String regionName) {
            this.putQueryParameter("RegionName", regionName);
            this.regionName = regionName;
            return this;
        }

        @Override
        public DescribeSecurityIPGroupRequest build() {
            return new DescribeSecurityIPGroupRequest(this);
        } 

    } 

}
