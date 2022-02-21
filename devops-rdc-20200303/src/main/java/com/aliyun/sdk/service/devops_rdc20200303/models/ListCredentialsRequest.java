// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCredentialsRequest} extends {@link RequestModel}
 *
 * <p>ListCredentialsRequest</p>
 */
public class ListCredentialsRequest extends Request {
    @Body
    @NameInMap("OrgId")
    @Validation(required = true)
    private String orgId;

    @Body
    @NameInMap("UserPk")
    private String userPk;

    private ListCredentialsRequest(Builder builder) {
        super(builder);
        this.orgId = builder.orgId;
        this.userPk = builder.userPk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCredentialsRequest create() {
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
     * @return userPk
     */
    public String getUserPk() {
        return this.userPk;
    }

    public static final class Builder extends Request.Builder<ListCredentialsRequest, Builder> {
        private String orgId; 
        private String userPk; 

        private Builder() {
            super();
        } 

        private Builder(ListCredentialsRequest response) {
            super(response);
            this.orgId = response.orgId;
            this.userPk = response.userPk;
        } 

        /**
         * OrgId.
         */
        public Builder orgId(String orgId) {
            this.putBodyParameter("OrgId", orgId);
            this.orgId = orgId;
            return this;
        }

        /**
         * UserPk.
         */
        public Builder userPk(String userPk) {
            this.putBodyParameter("UserPk", userPk);
            this.userPk = userPk;
            return this;
        }

        @Override
        public ListCredentialsRequest build() {
            return new ListCredentialsRequest(this);
        } 

    } 

}
