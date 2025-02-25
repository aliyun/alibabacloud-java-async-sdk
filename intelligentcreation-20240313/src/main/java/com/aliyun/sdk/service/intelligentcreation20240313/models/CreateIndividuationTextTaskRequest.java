// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link CreateIndividuationTextTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateIndividuationTextTaskRequest</p>
 */
public class CreateIndividuationTextTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("crowdPack")
    private java.util.List<java.util.List<String>> crowdPack;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("projectId")
    private String projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskName")
    private String taskName;

    private CreateIndividuationTextTaskRequest(Builder builder) {
        super(builder);
        this.crowdPack = builder.crowdPack;
        this.projectId = builder.projectId;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIndividuationTextTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return crowdPack
     */
    public java.util.List<java.util.List<String>> getCrowdPack() {
        return this.crowdPack;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<CreateIndividuationTextTaskRequest, Builder> {
        private java.util.List<java.util.List<String>> crowdPack; 
        private String projectId; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(CreateIndividuationTextTaskRequest request) {
            super(request);
            this.crowdPack = request.crowdPack;
            this.projectId = request.projectId;
            this.taskName = request.taskName;
        } 

        /**
         * crowdPack.
         */
        public Builder crowdPack(java.util.List<java.util.List<String>> crowdPack) {
            this.putBodyParameter("crowdPack", crowdPack);
            this.crowdPack = crowdPack;
            return this;
        }

        /**
         * projectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("projectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * taskName.
         */
        public Builder taskName(String taskName) {
            this.putBodyParameter("taskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public CreateIndividuationTextTaskRequest build() {
            return new CreateIndividuationTextTaskRequest(this);
        } 

    } 

}
