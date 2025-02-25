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
 * {@link GetFlowTagGroupRequest} extends {@link RequestModel}
 *
 * <p>GetFlowTagGroupRequest</p>
 */
public class GetFlowTagGroupRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(GetFlowTagGroupRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.id = request.id;
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
         * 
         * <strong>example:</strong>
         * <p>11</p>
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
