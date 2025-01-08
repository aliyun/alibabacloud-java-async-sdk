// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link CreateSqlInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateSqlInstanceRequest</p>
 */
public class CreateSqlInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cu")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer cu;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("useAsDefault")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean useAsDefault;

    private CreateSqlInstanceRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.cu = builder.cu;
        this.useAsDefault = builder.useAsDefault;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSqlInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return cu
     */
    public Integer getCu() {
        return this.cu;
    }

    /**
     * @return useAsDefault
     */
    public Boolean getUseAsDefault() {
        return this.useAsDefault;
    }

    public static final class Builder extends Request.Builder<CreateSqlInstanceRequest, Builder> {
        private String project; 
        private Integer cu; 
        private Boolean useAsDefault; 

        private Builder() {
            super();
        } 

        private Builder(CreateSqlInstanceRequest request) {
            super(request);
            this.project = request.project;
            this.cu = request.cu;
            this.useAsDefault = request.useAsDefault;
        } 

        /**
         * <p>The name of the project for which you want to enable the Dedicated SQL feature.</p>
         * <p>This parameter is required.</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The number of compute units (CUs). When you use the Dedicated SQL feature, CUs are used in parallel.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder cu(Integer cu) {
            this.putBodyParameter("cu", cu);
            this.cu = cu;
            return this;
        }

        /**
         * <p>Specifies whether to enable the Dedicated SQL feature for the project. If you set this parameter to true, the Dedicated SQL feature is enabled for the specified project and takes effect for all query statements that you execute in the project, including the query statements for alerts and dashboards.</p>
         * <p>This parameter is required.</p>
         */
        public Builder useAsDefault(Boolean useAsDefault) {
            this.putBodyParameter("useAsDefault", useAsDefault);
            this.useAsDefault = useAsDefault;
            return this;
        }

        @Override
        public CreateSqlInstanceRequest build() {
            return new CreateSqlInstanceRequest(this);
        } 

    } 

}
