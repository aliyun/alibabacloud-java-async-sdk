// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEditingProjectsRequest} extends {@link RequestModel}
 *
 * <p>DeleteEditingProjectsRequest</p>
 */
public class DeleteEditingProjectsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectIds")
    private String projectIds;

    private DeleteEditingProjectsRequest(Builder builder) {
        super(builder);
        this.projectIds = builder.projectIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEditingProjectsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectIds
     */
    public String getProjectIds() {
        return this.projectIds;
    }

    public static final class Builder extends Request.Builder<DeleteEditingProjectsRequest, Builder> {
        private String projectIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEditingProjectsRequest request) {
            super(request);
            this.projectIds = request.projectIds;
        } 

        /**
         * ProjectIds.
         */
        public Builder projectIds(String projectIds) {
            this.putQueryParameter("ProjectIds", projectIds);
            this.projectIds = projectIds;
            return this;
        }

        @Override
        public DeleteEditingProjectsRequest build() {
            return new DeleteEditingProjectsRequest(this);
        } 

    } 

}
