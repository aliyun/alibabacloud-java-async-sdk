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
 * {@link CreateOrgRequest} extends {@link RequestModel}
 *
 * <p>CreateOrgRequest</p>
 */
public class CreateOrgRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrgName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orgName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentOrgId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parentOrgId;

    private CreateOrgRequest(Builder builder) {
        super(builder);
        this.orgName = builder.orgName;
        this.parentOrgId = builder.parentOrgId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrgRequest create() {
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

    public static final class Builder extends Request.Builder<CreateOrgRequest, Builder> {
        private String orgName; 
        private String parentOrgId; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrgRequest request) {
            super(request);
            this.orgName = request.orgName;
            this.parentOrgId = request.parentOrgId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder orgName(String orgName) {
            this.putQueryParameter("OrgName", orgName);
            this.orgName = orgName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>org-evk12ozjvmlxl****</p>
         */
        public Builder parentOrgId(String parentOrgId) {
            this.putQueryParameter("ParentOrgId", parentOrgId);
            this.parentOrgId = parentOrgId;
            return this;
        }

        @Override
        public CreateOrgRequest build() {
            return new CreateOrgRequest(this);
        } 

    } 

}
