// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link CheckUserProjectNameRequest} extends {@link RequestModel}
 *
 * <p>CheckUserProjectNameRequest</p>
 */
public class CheckUserProjectNameRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    private CheckUserProjectNameRequest(Builder builder) {
        super(builder);
        this.projectName = builder.projectName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckUserProjectNameRequest create() {
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

    public static final class Builder extends Request.Builder<CheckUserProjectNameRequest, Builder> {
        private String projectName; 

        private Builder() {
            super();
        } 

        private Builder(CheckUserProjectNameRequest request) {
            super(request);
            this.projectName = request.projectName;
        } 

        /**
         * <p>The name of the real-time log delivery task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-dcdn-log-56</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        @Override
        public CheckUserProjectNameRequest build() {
            return new CheckUserProjectNameRequest(this);
        } 

    } 

}
