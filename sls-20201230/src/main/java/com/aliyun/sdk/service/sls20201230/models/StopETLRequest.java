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
 * {@link StopETLRequest} extends {@link RequestModel}
 *
 * <p>StopETLRequest</p>
 */
public class StopETLRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("etlName")
    private String etlName;

    private StopETLRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.etlName = builder.etlName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopETLRequest create() {
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

    public static final class Builder extends Request.Builder<StopETLRequest, Builder> {
        private String project; 
        private String etlName; 

        private Builder() {
            super();
        } 

        private Builder(StopETLRequest request) {
            super(request);
            this.project = request.project;
            this.etlName = request.etlName;
        } 

        /**
         * project.
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * etlName.
         */
        public Builder etlName(String etlName) {
            this.putPathParameter("etlName", etlName);
            this.etlName = etlName;
            return this;
        }

        @Override
        public StopETLRequest build() {
            return new StopETLRequest(this);
        } 

    } 

}
