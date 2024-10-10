// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeServiceLinkedRoleStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeServiceLinkedRoleStatusRequest</p>
 */
public class DescribeServiceLinkedRoleStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceLinkedRole")
    private String serviceLinkedRole;

    private DescribeServiceLinkedRoleStatusRequest(Builder builder) {
        super(builder);
        this.serviceLinkedRole = builder.serviceLinkedRole;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceLinkedRoleStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serviceLinkedRole
     */
    public String getServiceLinkedRole() {
        return this.serviceLinkedRole;
    }

    public static final class Builder extends Request.Builder<DescribeServiceLinkedRoleStatusRequest, Builder> {
        private String serviceLinkedRole; 

        private Builder() {
            super();
        } 

        private Builder(DescribeServiceLinkedRoleStatusRequest request) {
            super(request);
            this.serviceLinkedRole = request.serviceLinkedRole;
        } 

        /**
         * <p>The service-linked role. Default value: <strong>AliyunServiceRoleForSas</strong>. Valid values:</p>
         * <ul>
         * <li><strong>AliyunServiceRoleForSas</strong>: the service-linked role of Security Center. Security Center assumes this role to access the resources of other cloud services within your account.</li>
         * <li><strong>AliyunServiceRoleForSasCspm</strong>: the service-linked role of Security Center-CSPM. Security Center-CSPM assumes this role to access the resources of other cloud services within your account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AliyunServiceRoleForSas</p>
         */
        public Builder serviceLinkedRole(String serviceLinkedRole) {
            this.putQueryParameter("ServiceLinkedRole", serviceLinkedRole);
            this.serviceLinkedRole = serviceLinkedRole;
            return this;
        }

        @Override
        public DescribeServiceLinkedRoleStatusRequest build() {
            return new DescribeServiceLinkedRoleStatusRequest(this);
        } 

    } 

}
