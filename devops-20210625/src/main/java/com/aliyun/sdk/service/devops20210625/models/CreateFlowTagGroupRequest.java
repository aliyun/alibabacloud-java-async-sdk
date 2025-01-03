// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link CreateFlowTagGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateFlowTagGroupRequest</p>
 */
public class CreateFlowTagGroupRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 20)
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

        private Builder(CreateFlowTagGroupRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.name = request.name;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5ebbc0228123212b59xxxxx</p>
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
