// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLastWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>GetLastWorkspaceRequest</p>
 */
public class GetLastWorkspaceRequest extends Request {
    @Body
    @NameInMap("OrgId")
    private String orgId;

    @Body
    @NameInMap("RealPk")
    private String realPk;

    private GetLastWorkspaceRequest(Builder builder) {
        super(builder);
        this.orgId = builder.orgId;
        this.realPk = builder.realPk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLastWorkspaceRequest create() {
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
     * @return realPk
     */
    public String getRealPk() {
        return this.realPk;
    }

    public static final class Builder extends Request.Builder<GetLastWorkspaceRequest, Builder> {
        private String orgId; 
        private String realPk; 

        private Builder() {
            super();
        } 

        private Builder(GetLastWorkspaceRequest response) {
            super(response);
            this.orgId = response.orgId;
            this.realPk = response.realPk;
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
        public GetLastWorkspaceRequest build() {
            return new GetLastWorkspaceRequest(this);
        } 

    } 

}
