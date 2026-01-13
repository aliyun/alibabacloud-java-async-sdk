// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safconsole20250521.models;

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
 * {@link DescribeCustomerModuleBasicInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeCustomerModuleBasicInfoRequest</p>
 */
public class DescribeCustomerModuleBasicInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthType")
    private String authType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerModuleId")
    private Integer customerModuleId;

    private DescribeCustomerModuleBasicInfoRequest(Builder builder) {
        super(builder);
        this.authType = builder.authType;
        this.customerModuleId = builder.customerModuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomerModuleBasicInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
    }

    /**
     * @return customerModuleId
     */
    public Integer getCustomerModuleId() {
        return this.customerModuleId;
    }

    public static final class Builder extends Request.Builder<DescribeCustomerModuleBasicInfoRequest, Builder> {
        private String authType; 
        private Integer customerModuleId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCustomerModuleBasicInfoRequest request) {
            super(request);
            this.authType = request.authType;
            this.customerModuleId = request.customerModuleId;
        } 

        /**
         * <p>Authorization type.</p>
         * 
         * <strong>example:</strong>
         * <p>READ</p>
         */
        public Builder authType(String authType) {
            this.putQueryParameter("AuthType", authType);
            this.authType = authType;
            return this;
        }

        /**
         * <p>Customer model ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder customerModuleId(Integer customerModuleId) {
            this.putQueryParameter("CustomerModuleId", customerModuleId);
            this.customerModuleId = customerModuleId;
            return this;
        }

        @Override
        public DescribeCustomerModuleBasicInfoRequest build() {
            return new DescribeCustomerModuleBasicInfoRequest(this);
        } 

    } 

}
