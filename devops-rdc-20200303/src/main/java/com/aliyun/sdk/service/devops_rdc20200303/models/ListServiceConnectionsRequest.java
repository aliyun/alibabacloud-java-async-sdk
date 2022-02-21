// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceConnectionsRequest} extends {@link RequestModel}
 *
 * <p>ListServiceConnectionsRequest</p>
 */
public class ListServiceConnectionsRequest extends Request {
    @Body
    @NameInMap("OrgId")
    @Validation(required = true)
    private String orgId;

    @Body
    @NameInMap("ScType")
    @Validation(required = true)
    private String scType;

    @Body
    @NameInMap("UserPk")
    private String userPk;

    private ListServiceConnectionsRequest(Builder builder) {
        super(builder);
        this.orgId = builder.orgId;
        this.scType = builder.scType;
        this.userPk = builder.userPk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceConnectionsRequest create() {
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
     * @return scType
     */
    public String getScType() {
        return this.scType;
    }

    /**
     * @return userPk
     */
    public String getUserPk() {
        return this.userPk;
    }

    public static final class Builder extends Request.Builder<ListServiceConnectionsRequest, Builder> {
        private String orgId; 
        private String scType; 
        private String userPk; 

        private Builder() {
            super();
        } 

        private Builder(ListServiceConnectionsRequest response) {
            super(response);
            this.orgId = response.orgId;
            this.scType = response.scType;
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
         * ScType.
         */
        public Builder scType(String scType) {
            this.putBodyParameter("ScType", scType);
            this.scType = scType;
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
        public ListServiceConnectionsRequest build() {
            return new ListServiceConnectionsRequest(this);
        } 

    } 

}
