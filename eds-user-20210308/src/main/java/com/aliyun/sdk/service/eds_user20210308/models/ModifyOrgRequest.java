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
 * {@link ModifyOrgRequest} extends {@link RequestModel}
 *
 * <p>ModifyOrgRequest</p>
 */
public class ModifyOrgRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrgId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orgId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrgName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orgName;

    private ModifyOrgRequest(Builder builder) {
        super(builder);
        this.orgId = builder.orgId;
        this.orgName = builder.orgName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyOrgRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    /**
     * @return orgName
     */
    public String getOrgName() {
        return this.orgName;
    }

    public static final class Builder extends Request.Builder<ModifyOrgRequest, Builder> {
        private String orgId; 
        private String orgName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyOrgRequest request) {
            super(request);
            this.orgId = request.orgId;
            this.orgName = request.orgName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>org-76joc57khvnhdh***</p>
         */
        public Builder orgId(String orgId) {
            this.putQueryParameter("OrgId", orgId);
            this.orgId = orgId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder orgName(String orgName) {
            this.putQueryParameter("OrgName", orgName);
            this.orgName = orgName;
            return this;
        }

        @Override
        public ModifyOrgRequest build() {
            return new ModifyOrgRequest(this);
        } 

    } 

}
