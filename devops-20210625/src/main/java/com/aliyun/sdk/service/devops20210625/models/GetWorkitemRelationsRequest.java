// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWorkitemRelationsRequest} extends {@link RequestModel}
 *
 * <p>GetWorkitemRelationsRequest</p>
 */
public class GetWorkitemRelationsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workitemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workitemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("relationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String relationType;

    private GetWorkitemRelationsRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.workitemId = builder.workitemId;
        this.relationType = builder.relationType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkitemRelationsRequest create() {
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
     * @return workitemId
     */
    public String getWorkitemId() {
        return this.workitemId;
    }

    /**
     * @return relationType
     */
    public String getRelationType() {
        return this.relationType;
    }

    public static final class Builder extends Request.Builder<GetWorkitemRelationsRequest, Builder> {
        private String organizationId; 
        private String workitemId; 
        private String relationType; 

        private Builder() {
            super();
        } 

        private Builder(GetWorkitemRelationsRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.workitemId = request.workitemId;
            this.relationType = request.relationType;
        } 

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * workitemId.
         */
        public Builder workitemId(String workitemId) {
            this.putPathParameter("workitemId", workitemId);
            this.workitemId = workitemId;
            return this;
        }

        /**
         * relationType.
         */
        public Builder relationType(String relationType) {
            this.putQueryParameter("relationType", relationType);
            this.relationType = relationType;
            return this;
        }

        @Override
        public GetWorkitemRelationsRequest build() {
            return new GetWorkitemRelationsRequest(this);
        } 

    } 

}
