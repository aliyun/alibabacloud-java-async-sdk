// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link QueryAvatarProjectRequest} extends {@link RequestModel}
 *
 * <p>QueryAvatarProjectRequest</p>
 */
public class QueryAvatarProjectRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("projectId")
    private String projectId;

    private QueryAvatarProjectRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAvatarProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<QueryAvatarProjectRequest, Builder> {
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(QueryAvatarProjectRequest request) {
            super(request);
            this.projectId = request.projectId;
        } 

        /**
         * projectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("projectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public QueryAvatarProjectRequest build() {
            return new QueryAvatarProjectRequest(this);
        } 

    } 

}
