// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowTagGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListFlowTagGroupsRequest</p>
 */
public class ListFlowTagGroupsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    private ListFlowTagGroupsRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowTagGroupsRequest create() {
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

    public static final class Builder extends Request.Builder<ListFlowTagGroupsRequest, Builder> {
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(ListFlowTagGroupsRequest request) {
            super(request);
            this.organizationId = request.organizationId;
        } 

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public ListFlowTagGroupsRequest build() {
            return new ListFlowTagGroupsRequest(this);
        } 

    } 

}
