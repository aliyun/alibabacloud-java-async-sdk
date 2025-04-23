// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link GetProjectBuildContextRequest} extends {@link RequestModel}
 *
 * <p>GetProjectBuildContextRequest</p>
 */
public class GetProjectBuildContextRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectBuildId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectBuildId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("isPassAssertCheck")
    private Boolean isPassAssertCheck;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private GetProjectBuildContextRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.projectBuildId = builder.projectBuildId;
        this.isPassAssertCheck = builder.isPassAssertCheck;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectBuildContextRequest create() {
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

    /**
     * @return isPassAssertCheck
     */
    public Boolean getIsPassAssertCheck() {
        return this.isPassAssertCheck;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<GetProjectBuildContextRequest, Builder> {
        private String projectId; 
        private String projectBuildId; 
        private Boolean isPassAssertCheck; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(GetProjectBuildContextRequest request) {
            super(request);
            this.projectId = request.projectId;
            this.projectBuildId = request.projectBuildId;
            this.isPassAssertCheck = request.isPassAssertCheck;
            this.status = request.status;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>p-5fd38c9b92d541a6521a86432e0</p>
         */
        public Builder projectId(String projectId) {
            this.putPathParameter("projectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pb-433aead75605718f20ba0375f99</p>
         */
        public Builder projectBuildId(String projectBuildId) {
            this.putPathParameter("projectBuildId", projectBuildId);
            this.projectBuildId = projectBuildId;
            return this;
        }

        /**
         * isPassAssertCheck.
         */
        public Builder isPassAssertCheck(Boolean isPassAssertCheck) {
            this.putQueryParameter("isPassAssertCheck", isPassAssertCheck);
            this.isPassAssertCheck = isPassAssertCheck;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public GetProjectBuildContextRequest build() {
            return new GetProjectBuildContextRequest(this);
        } 

    } 

}
