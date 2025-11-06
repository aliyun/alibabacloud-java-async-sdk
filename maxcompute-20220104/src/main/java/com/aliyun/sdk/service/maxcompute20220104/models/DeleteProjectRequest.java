// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link DeleteProjectRequest} extends {@link RequestModel}
 *
 * <p>DeleteProjectRequest</p>
 */
public class DeleteProjectRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("isLogical")
    private Boolean isLogical;

    private DeleteProjectRequest(Builder builder) {
        super(builder);
        this.projectName = builder.projectName;
        this.isLogical = builder.isLogical;
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
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return isLogical
     */
    public Boolean getIsLogical() {
        return this.isLogical;
    }

    public static final class Builder extends Request.Builder<DeleteProjectRequest, Builder> {
        private String projectName; 
        private Boolean isLogical; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProjectRequest request) {
            super(request);
            this.projectName = request.projectName;
            this.isLogical = request.isLogical;
        } 

        /**
         * <p>The name of the MaxCompute project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>odps_project</p>
         */
        public Builder projectName(String projectName) {
            this.putPathParameter("projectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>Specifies whether to logically delete the project. Valid values: true and false. Default value: true. The value false indicates that the project is physically deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isLogical(Boolean isLogical) {
            this.putQueryParameter("isLogical", isLogical);
            this.isLogical = isLogical;
            return this;
        }

        @Override
        public DeleteProjectRequest build() {
            return new DeleteProjectRequest(this);
        } 

    } 

}
