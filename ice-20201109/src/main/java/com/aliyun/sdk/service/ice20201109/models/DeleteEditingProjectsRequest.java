// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
         * <p>The ID of the online editing project. You can specify multiple IDs separated with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>fb2101bf24bf41cb318787dc</strong></strong>,<strong><strong>87dcfb2101bf24bf41cb3187</strong></strong></p>
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
