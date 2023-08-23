// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectUsersRequest} extends {@link RequestModel}
 *
 * <p>ListProjectUsersRequest</p>
 */
public class ListProjectUsersRequest extends Request {
    @Path
    @NameInMap("projectName")
    @Validation(required = true)
    private String projectName;

    private ListProjectUsersRequest(Builder builder) {
        super(builder);
        this.projectName = builder.projectName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectUsersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    public static final class Builder extends Request.Builder<ListProjectUsersRequest, Builder> {
        private String projectName; 

        private Builder() {
            super();
        } 

        private Builder(ListProjectUsersRequest request) {
            super(request);
            this.projectName = request.projectName;
        } 

        /**
         * The name of the MaxCompute project.
         */
        public Builder projectName(String projectName) {
            this.putPathParameter("projectName", projectName);
            this.projectName = projectName;
            return this;
        }

        @Override
        public ListProjectUsersRequest build() {
            return new ListProjectUsersRequest(this);
        } 

    } 

}
