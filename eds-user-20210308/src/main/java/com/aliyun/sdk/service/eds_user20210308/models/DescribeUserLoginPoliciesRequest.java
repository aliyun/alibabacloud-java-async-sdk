// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link DescribeUserLoginPoliciesRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserLoginPoliciesRequest</p>
 */
public class DescribeUserLoginPoliciesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessChannel")
    private String businessChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyIds")
    private java.util.List<String> policyIds;

    private DescribeUserLoginPoliciesRequest(Builder builder) {
        super(builder);
        this.businessChannel = builder.businessChannel;
        this.name = builder.name;
        this.policyIds = builder.policyIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserLoginPoliciesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessChannel
     */
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return policyIds
     */
    public java.util.List<String> getPolicyIds() {
        return this.policyIds;
    }

    public static final class Builder extends Request.Builder<DescribeUserLoginPoliciesRequest, Builder> {
        private String businessChannel; 
        private String name; 
        private java.util.List<String> policyIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserLoginPoliciesRequest request) {
            super(request);
            this.businessChannel = request.businessChannel;
            this.name = request.name;
            this.policyIds = request.policyIds;
        } 

        /**
         * <p>The channel.</p>
         * 
         * <strong>example:</strong>
         * <p>ENTERPRISE</p>
         */
        public Builder businessChannel(String businessChannel) {
            this.putQueryParameter("BusinessChannel", businessChannel);
            this.businessChannel = businessChannel;
            return this;
        }

        /**
         * <p>The policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>Security audit</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The list of policy IDs. This is a filter condition for the query.</p>
         */
        public Builder policyIds(java.util.List<String> policyIds) {
            this.putQueryParameter("PolicyIds", policyIds);
            this.policyIds = policyIds;
            return this;
        }

        @Override
        public DescribeUserLoginPoliciesRequest build() {
            return new DescribeUserLoginPoliciesRequest(this);
        } 

    } 

}
