// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckDcdnProjectExistRequest} extends {@link RequestModel}
 *
 * <p>CheckDcdnProjectExistRequest</p>
 */
public class CheckDcdnProjectExistRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    private CheckDcdnProjectExistRequest(Builder builder) {
        super(builder);
        this.projectName = builder.projectName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDcdnProjectExistRequest create() {
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

    public static final class Builder extends Request.Builder<CheckDcdnProjectExistRequest, Builder> {
        private String projectName; 

        private Builder() {
            super();
        } 

        private Builder(CheckDcdnProjectExistRequest request) {
            super(request);
            this.projectName = request.projectName;
        } 

        /**
         * The name of a real-time log delivery project.
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        @Override
        public CheckDcdnProjectExistRequest build() {
            return new CheckDcdnProjectExistRequest(this);
        } 

    } 

}
