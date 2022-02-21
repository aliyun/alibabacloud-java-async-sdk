// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFlowTagGroupRequest} extends {@link RequestModel}
 *
 * <p>GetFlowTagGroupRequest</p>
 */
public class GetFlowTagGroupRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Path
    @NameInMap("id")
    @Validation(required = true)
    private String id;

    private GetFlowTagGroupRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFlowTagGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<GetFlowTagGroupRequest, Builder> {
        private String organizationId; 
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(GetFlowTagGroupRequest response) {
            super(response);
            this.organizationId = response.organizationId;
            this.id = response.id;
        } 

        /**
         * 企业标识，也称企业id，字符串形式，可在云效访问链接中获取，如https://devops.aliyun.com/organization/【OrganizationId】
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.putPathParameter("id", id);
            this.id = id;
            return this;
        }

        @Override
        public GetFlowTagGroupRequest build() {
            return new GetFlowTagGroupRequest(this);
        } 

    } 

}
