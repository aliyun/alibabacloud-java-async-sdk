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
 * {@link DescribeOrgByLayerRequest} extends {@link RequestModel}
 *
 * <p>DescribeOrgByLayerRequest</p>
 */
public class DescribeOrgByLayerRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrgName")
    private String orgName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ParentOrgId")
    private String parentOrgId;

    private DescribeOrgByLayerRequest(Builder builder) {
        super(builder);
        this.orgName = builder.orgName;
        this.parentOrgId = builder.parentOrgId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOrgByLayerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orgName
     */
    public String getOrgName() {
        return this.orgName;
    }

    /**
     * @return parentOrgId
     */
    public String getParentOrgId() {
        return this.parentOrgId;
    }

    public static final class Builder extends Request.Builder<DescribeOrgByLayerRequest, Builder> {
        private String orgName; 
        private String parentOrgId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOrgByLayerRequest request) {
            super(request);
            this.orgName = request.orgName;
            this.parentOrgId = request.parentOrgId;
        } 

        /**
         * OrgName.
         */
        public Builder orgName(String orgName) {
            this.putBodyParameter("OrgName", orgName);
            this.orgName = orgName;
            return this;
        }

        /**
         * ParentOrgId.
         */
        public Builder parentOrgId(String parentOrgId) {
            this.putBodyParameter("ParentOrgId", parentOrgId);
            this.parentOrgId = parentOrgId;
            return this;
        }

        @Override
        public DescribeOrgByLayerRequest build() {
            return new DescribeOrgByLayerRequest(this);
        } 

    } 

}
