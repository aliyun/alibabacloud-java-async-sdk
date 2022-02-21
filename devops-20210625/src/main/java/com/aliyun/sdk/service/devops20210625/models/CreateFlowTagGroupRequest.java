// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFlowTagGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateFlowTagGroupRequest</p>
 */
public class CreateFlowTagGroupRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Query
    @NameInMap("name")
    @Validation(required = true, maxLength = 20)
    private String name;

    private CreateFlowTagGroupRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFlowTagGroupRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<CreateFlowTagGroupRequest, Builder> {
        private String organizationId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreateFlowTagGroupRequest response) {
            super(response);
            this.organizationId = response.organizationId;
            this.name = response.name;
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
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public CreateFlowTagGroupRequest build() {
            return new CreateFlowTagGroupRequest(this);
        } 

    } 

}
