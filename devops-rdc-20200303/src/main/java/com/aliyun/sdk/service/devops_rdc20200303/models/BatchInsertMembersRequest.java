// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchInsertMembersRequest} extends {@link RequestModel}
 *
 * <p>BatchInsertMembersRequest</p>
 */
public class BatchInsertMembersRequest extends Request {
    @Body
    @NameInMap("Members")
    private String members;

    @Body
    @NameInMap("OrgId")
    private String orgId;

    @Body
    @NameInMap("RealPk")
    private String realPk;

    private BatchInsertMembersRequest(Builder builder) {
        super(builder);
        this.members = builder.members;
        this.orgId = builder.orgId;
        this.realPk = builder.realPk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchInsertMembersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return members
     */
    public String getMembers() {
        return this.members;
    }

    /**
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    /**
     * @return realPk
     */
    public String getRealPk() {
        return this.realPk;
    }

    public static final class Builder extends Request.Builder<BatchInsertMembersRequest, Builder> {
        private String members; 
        private String orgId; 
        private String realPk; 

        private Builder() {
            super();
        } 

        private Builder(BatchInsertMembersRequest response) {
            super(response);
            this.members = response.members;
            this.orgId = response.orgId;
            this.realPk = response.realPk;
        } 

        /**
         * Members.
         */
        public Builder members(String members) {
            this.putBodyParameter("Members", members);
            this.members = members;
            return this;
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
         * RealPk.
         */
        public Builder realPk(String realPk) {
            this.putBodyParameter("RealPk", realPk);
            this.realPk = realPk;
            return this;
        }

        @Override
        public BatchInsertMembersRequest build() {
            return new BatchInsertMembersRequest(this);
        } 

    } 

}
