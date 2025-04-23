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
 * {@link MoveOrgRequest} extends {@link RequestModel}
 *
 * <p>MoveOrgRequest</p>
 */
public class MoveOrgRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NewParentOrgId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newParentOrgId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrgId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orgId;

    private MoveOrgRequest(Builder builder) {
        super(builder);
        this.newParentOrgId = builder.newParentOrgId;
        this.orgId = builder.orgId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MoveOrgRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return newParentOrgId
     */
    public String getNewParentOrgId() {
        return this.newParentOrgId;
    }

    /**
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    public static final class Builder extends Request.Builder<MoveOrgRequest, Builder> {
        private String newParentOrgId; 
        private String orgId; 

        private Builder() {
            super();
        } 

        private Builder(MoveOrgRequest request) {
            super(request);
            this.newParentOrgId = request.newParentOrgId;
            this.orgId = request.orgId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>org-5yy5icj981xe5****</p>
         */
        public Builder newParentOrgId(String newParentOrgId) {
            this.putBodyParameter("NewParentOrgId", newParentOrgId);
            this.newParentOrgId = newParentOrgId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>org-5yy5icj981xe5****</p>
         */
        public Builder orgId(String orgId) {
            this.putBodyParameter("OrgId", orgId);
            this.orgId = orgId;
            return this;
        }

        @Override
        public MoveOrgRequest build() {
            return new MoveOrgRequest(this);
        } 

    } 

}
