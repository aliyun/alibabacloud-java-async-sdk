// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link DeleteEtlJobRequest} extends {@link RequestModel}
 *
 * <p>DeleteEtlJobRequest</p>
 */
public class DeleteEtlJobRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Path
    @NameInMap("etlJobName")
    @Validation(required = true)
    private String etlJobName;

    private DeleteEtlJobRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.etlJobName = builder.etlJobName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEtlJobRequest create() {
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
     * @return etlJobName
     */
    public String getEtlJobName() {
        return this.etlJobName;
    }

    public static final class Builder extends Request.Builder<DeleteEtlJobRequest, Builder> {
        private String project; 
        private String etlJobName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEtlJobRequest request) {
            super(request);
            this.project = request.project;
            this.etlJobName = request.etlJobName;
        } 

        /**
         * A short description of struct
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * etlJobName.
         */
        public Builder etlJobName(String etlJobName) {
            this.putPathParameter("etlJobName", etlJobName);
            this.etlJobName = etlJobName;
            return this;
        }

        @Override
        public DeleteEtlJobRequest build() {
            return new DeleteEtlJobRequest(this);
        } 

    } 

}
