// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safconsole20250521.models;

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
 * {@link CompleteModelingProjectRequest} extends {@link RequestModel}
 *
 * <p>CompleteModelingProjectRequest</p>
 */
public class CompleteModelingProjectRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    private CompleteModelingProjectRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompleteModelingProjectRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<CompleteModelingProjectRequest, Builder> {
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(CompleteModelingProjectRequest request) {
            super(request);
            this.projectId = request.projectId;
        } 

        /**
         * <p>Project ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>01</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public CompleteModelingProjectRequest build() {
            return new CompleteModelingProjectRequest(this);
        } 

    } 

}
