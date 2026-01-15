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
 * {@link DescribeServiceAndSceneRequest} extends {@link RequestModel}
 *
 * <p>DescribeServiceAndSceneRequest</p>
 */
public class DescribeServiceAndSceneRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthType")
    private String authType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerModuleId")
    private Integer customerModuleId;

    private DescribeServiceAndSceneRequest(Builder builder) {
        super(builder);
        this.authType = builder.authType;
        this.customerModuleId = builder.customerModuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceAndSceneRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeServiceAndSceneRequest, Builder> {
        private String authType; 
        private Integer customerModuleId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeServiceAndSceneRequest request) {
            super(request);
            this.authType = request.authType;
            this.customerModuleId = request.customerModuleId;
        } 

        /**
         * AuthType.
         */
        public Builder authType(String authType) {
            this.putQueryParameter("AuthType", authType);
            this.authType = authType;
            return this;
        }

        /**
         * CustomerModuleId.
         */
        public Builder customerModuleId(Integer customerModuleId) {
            this.putQueryParameter("CustomerModuleId", customerModuleId);
            this.customerModuleId = customerModuleId;
            return this;
        }

        @Override
        public DescribeServiceAndSceneRequest build() {
            return new DescribeServiceAndSceneRequest(this);
        } 

    } 

}
