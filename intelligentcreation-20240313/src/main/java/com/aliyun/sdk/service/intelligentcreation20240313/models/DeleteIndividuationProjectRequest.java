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
 * {@link DeleteIndividuationProjectRequest} extends {@link RequestModel}
 *
 * <p>DeleteIndividuationProjectRequest</p>
 */
public class DeleteIndividuationProjectRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("projectId")
    private String projectId;

    private DeleteIndividuationProjectRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIndividuationProjectRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteIndividuationProjectRequest, Builder> {
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteIndividuationProjectRequest request) {
            super(request);
            this.projectId = request.projectId;
        } 

        /**
         * projectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("projectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public DeleteIndividuationProjectRequest build() {
            return new DeleteIndividuationProjectRequest(this);
        } 

    } 

}
