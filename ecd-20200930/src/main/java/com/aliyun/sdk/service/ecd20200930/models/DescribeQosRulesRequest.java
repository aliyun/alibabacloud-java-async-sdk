// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeQosRulesRequest} extends {@link RequestModel}
 *
 * <p>DescribeQosRulesRequest</p>
 */
public class DescribeQosRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkPackageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkPackageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QosRuleName")
    private String qosRuleName;

    private DescribeQosRulesRequest(Builder builder) {
        super(builder);
        this.networkPackageId = builder.networkPackageId;
        this.qosRuleName = builder.qosRuleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeQosRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkPackageId
     */
    public String getNetworkPackageId() {
        return this.networkPackageId;
    }

    /**
     * @return qosRuleName
     */
    public String getQosRuleName() {
        return this.qosRuleName;
    }

    public static final class Builder extends Request.Builder<DescribeQosRulesRequest, Builder> {
        private String networkPackageId; 
        private String qosRuleName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeQosRulesRequest request) {
            super(request);
            this.networkPackageId = request.networkPackageId;
            this.qosRuleName = request.qosRuleName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>np-cxj99qb8d34vo****</p>
         */
        public Builder networkPackageId(String networkPackageId) {
            this.putQueryParameter("NetworkPackageId", networkPackageId);
            this.networkPackageId = networkPackageId;
            return this;
        }

        /**
         * QosRuleName.
         */
        public Builder qosRuleName(String qosRuleName) {
            this.putQueryParameter("QosRuleName", qosRuleName);
            this.qosRuleName = qosRuleName;
            return this;
        }

        @Override
        public DescribeQosRulesRequest build() {
            return new DescribeQosRulesRequest(this);
        } 

    } 

}
