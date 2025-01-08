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
 * {@link DeleteScheduledSQLRequest} extends {@link RequestModel}
 *
 * <p>DeleteScheduledSQLRequest</p>
 */
public class DeleteScheduledSQLRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("scheduledSQLName")
    private String scheduledSQLName;

    private DeleteScheduledSQLRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.scheduledSQLName = builder.scheduledSQLName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteScheduledSQLRequest create() {
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
     * @return scheduledSQLName
     */
    public String getScheduledSQLName() {
        return this.scheduledSQLName;
    }

    public static final class Builder extends Request.Builder<DeleteScheduledSQLRequest, Builder> {
        private String project; 
        private String scheduledSQLName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteScheduledSQLRequest request) {
            super(request);
            this.project = request.project;
            this.scheduledSQLName = request.scheduledSQLName;
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
         * scheduledSQLName.
         */
        public Builder scheduledSQLName(String scheduledSQLName) {
            this.putPathParameter("scheduledSQLName", scheduledSQLName);
            this.scheduledSQLName = scheduledSQLName;
            return this;
        }

        @Override
        public DeleteScheduledSQLRequest build() {
            return new DeleteScheduledSQLRequest(this);
        } 

    } 

}
