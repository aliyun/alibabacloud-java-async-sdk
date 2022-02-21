// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteProjectRequest} extends {@link RequestModel}
 *
 * <p>DeleteProjectRequest</p>
 */
public class DeleteProjectRequest extends Request {
    @Query
    @NameInMap("ProjectIds")
    @Validation(required = true)
    private String projectIds;

    private DeleteProjectRequest(Builder builder) {
        super(builder);
        this.projectIds = builder.projectIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProjectRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteProjectRequest, Builder> {
        private String projectIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProjectRequest response) {
            super(response);
            this.projectIds = response.projectIds;
        } 

        /**
         * 项目id,多个以”,“隔开
         */
        public Builder projectIds(String projectIds) {
            this.putQueryParameter("ProjectIds", projectIds);
            this.projectIds = projectIds;
            return this;
        }

        @Override
        public DeleteProjectRequest build() {
            return new DeleteProjectRequest(this);
        } 

    } 

}
