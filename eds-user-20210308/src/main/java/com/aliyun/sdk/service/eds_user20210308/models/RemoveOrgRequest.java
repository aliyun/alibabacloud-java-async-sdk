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
 * {@link RemoveOrgRequest} extends {@link RequestModel}
 *
 * <p>RemoveOrgRequest</p>
 */
public class RemoveOrgRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BusinessChannel")
    private String businessChannel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrgId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orgId;

    private RemoveOrgRequest(Builder builder) {
        super(builder);
        this.businessChannel = builder.businessChannel;
        this.orgId = builder.orgId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveOrgRequest create() {
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
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    public static final class Builder extends Request.Builder<RemoveOrgRequest, Builder> {
        private String businessChannel; 
        private String orgId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveOrgRequest request) {
            super(request);
            this.businessChannel = request.businessChannel;
            this.orgId = request.orgId;
        } 

        /**
         * BusinessChannel.
         */
        public Builder businessChannel(String businessChannel) {
            this.putBodyParameter("BusinessChannel", businessChannel);
            this.businessChannel = businessChannel;
            return this;
        }

        /**
         * <p>The organization ID.</p>
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
        public RemoveOrgRequest build() {
            return new RemoveOrgRequest(this);
        } 

    } 

}
