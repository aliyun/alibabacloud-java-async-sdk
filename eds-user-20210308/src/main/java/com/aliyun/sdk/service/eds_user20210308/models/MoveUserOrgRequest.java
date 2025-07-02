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
 * {@link MoveUserOrgRequest} extends {@link RequestModel}
 *
 * <p>MoveUserOrgRequest</p>
 */
public class MoveUserOrgRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndUserIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> endUserIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrgId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orgId;

    private MoveUserOrgRequest(Builder builder) {
        super(builder);
        this.endUserIds = builder.endUserIds;
        this.orgId = builder.orgId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MoveUserOrgRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endUserIds
     */
    public java.util.List<String> getEndUserIds() {
        return this.endUserIds;
    }

    /**
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    public static final class Builder extends Request.Builder<MoveUserOrgRequest, Builder> {
        private java.util.List<String> endUserIds; 
        private String orgId; 

        private Builder() {
            super();
        } 

        private Builder(MoveUserOrgRequest request) {
            super(request);
            this.endUserIds = request.endUserIds;
            this.orgId = request.orgId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder endUserIds(java.util.List<String> endUserIds) {
            this.putBodyParameter("EndUserIds", endUserIds);
            this.endUserIds = endUserIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>org-4mdgc1cocc59z****</p>
         */
        public Builder orgId(String orgId) {
            this.putBodyParameter("OrgId", orgId);
            this.orgId = orgId;
            return this;
        }

        @Override
        public MoveUserOrgRequest build() {
            return new MoveUserOrgRequest(this);
        } 

    } 

}
