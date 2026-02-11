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
 * {@link CreateModelingProjectRequest} extends {@link RequestModel}
 *
 * <p>CreateModelingProjectRequest</p>
 */
public class CreateModelingProjectRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceSpec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    private CreateModelingProjectRequest(Builder builder) {
        super(builder);
        this.instanceSpec = builder.instanceSpec;
        this.projectName = builder.projectName;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelingProjectRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceSpec
     */
    public String getInstanceSpec() {
        return this.instanceSpec;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<CreateModelingProjectRequest, Builder> {
        private String instanceSpec; 
        private String projectName; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(CreateModelingProjectRequest request) {
            super(request);
            this.instanceSpec = request.instanceSpec;
            this.projectName = request.projectName;
            this.remark = request.remark;
        } 

        /**
         * <p>Instance specification.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SECURE_ENV_LITE</p>
         */
        public Builder instanceSpec(String instanceSpec) {
            this.putQueryParameter("InstanceSpec", instanceSpec);
            this.instanceSpec = instanceSpec;
            return this;
        }

        /**
         * <p>Project name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>Remark.</p>
         * 
         * <strong>example:</strong>
         * <p>remark</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public CreateModelingProjectRequest build() {
            return new CreateModelingProjectRequest(this);
        } 

    } 

}
