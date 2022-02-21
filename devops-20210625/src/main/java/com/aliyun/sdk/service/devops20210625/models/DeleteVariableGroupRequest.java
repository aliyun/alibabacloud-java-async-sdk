// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVariableGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteVariableGroupRequest</p>
 */
public class DeleteVariableGroupRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Path
    @NameInMap("id")
    @Validation(required = true)
    private Long id;

    private DeleteVariableGroupRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVariableGroupRequest create() {
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
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DeleteVariableGroupRequest, Builder> {
        private String organizationId; 
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVariableGroupRequest response) {
            super(response);
            this.organizationId = response.organizationId;
            this.id = response.id;
        } 

        /**
         * 企业标识，也称企业id，字符串形式，可在云效访问链接中获取，如  https:// devops.aliyun.com/organization/【OrgId】
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * 变量组id
         */
        public Builder id(Long id) {
            this.putPathParameter("id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteVariableGroupRequest build() {
            return new DeleteVariableGroupRequest(this);
        } 

    } 

}
