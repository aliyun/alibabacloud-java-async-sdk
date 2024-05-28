// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkitemEstimateRequest} extends {@link RequestModel}
 *
 * <p>ListWorkitemEstimateRequest</p>
 */
public class ListWorkitemEstimateRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workitemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workitemId;

    private ListWorkitemEstimateRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.workitemId = builder.workitemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkitemEstimateRequest create() {
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

    public static final class Builder extends Request.Builder<ListWorkitemEstimateRequest, Builder> {
        private String organizationId; 
        private String workitemId; 

        private Builder() {
            super();
        } 

        private Builder(ListWorkitemEstimateRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.workitemId = request.workitemId;
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

        @Override
        public ListWorkitemEstimateRequest build() {
            return new ListWorkitemEstimateRequest(this);
        } 

    } 

}
