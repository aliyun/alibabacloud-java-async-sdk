// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelProjectBuildRequest} extends {@link RequestModel}
 *
 * <p>CancelProjectBuildRequest</p>
 */
public class CancelProjectBuildRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectBuildId")
    private String projectBuildId;

    private CancelProjectBuildRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.projectBuildId = builder.projectBuildId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelProjectBuildRequest create() {
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

    /**
     * @return projectBuildId
     */
    public String getProjectBuildId() {
        return this.projectBuildId;
    }

    public static final class Builder extends Request.Builder<CancelProjectBuildRequest, Builder> {
        private String projectId; 
        private String projectBuildId; 

        private Builder() {
            super();
        } 

        private Builder(CancelProjectBuildRequest request) {
            super(request);
            this.projectId = request.projectId;
            this.projectBuildId = request.projectBuildId;
        } 

        /**
         * projectId.
         */
        public Builder projectId(String projectId) {
            this.putPathParameter("projectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * projectBuildId.
         */
        public Builder projectBuildId(String projectBuildId) {
            this.putPathParameter("projectBuildId", projectBuildId);
            this.projectBuildId = projectBuildId;
            return this;
        }

        @Override
        public CancelProjectBuildRequest build() {
            return new CancelProjectBuildRequest(this);
        } 

    } 

}
