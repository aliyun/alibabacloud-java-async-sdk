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
 * {@link DeleteETLRequest} extends {@link RequestModel}
 *
 * <p>DeleteETLRequest</p>
 */
public class DeleteETLRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("etlName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String etlName;

    private DeleteETLRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.etlName = builder.etlName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteETLRequest create() {
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
     * @return etlName
     */
    public String getEtlName() {
        return this.etlName;
    }

    public static final class Builder extends Request.Builder<DeleteETLRequest, Builder> {
        private String project; 
        private String etlName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteETLRequest request) {
            super(request);
            this.project = request.project;
            this.etlName = request.etlName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-project</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>etl-123456</p>
         */
        public Builder etlName(String etlName) {
            this.putPathParameter("etlName", etlName);
            this.etlName = etlName;
            return this;
        }

        @Override
        public DeleteETLRequest build() {
            return new DeleteETLRequest(this);
        } 

    } 

}
