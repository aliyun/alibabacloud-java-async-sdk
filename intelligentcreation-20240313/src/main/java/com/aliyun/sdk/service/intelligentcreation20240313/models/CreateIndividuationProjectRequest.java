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
 * {@link CreateIndividuationProjectRequest} extends {@link RequestModel}
 *
 * <p>CreateIndividuationProjectRequest</p>
 */
public class CreateIndividuationProjectRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("projectInfo")
    private String projectInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("projectName")
    private String projectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("purpose")
    private String purpose;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sceneId")
    private String sceneId;

    private CreateIndividuationProjectRequest(Builder builder) {
        super(builder);
        this.projectInfo = builder.projectInfo;
        this.projectName = builder.projectName;
        this.purpose = builder.purpose;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIndividuationProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectInfo
     */
    public String getProjectInfo() {
        return this.projectInfo;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return purpose
     */
    public String getPurpose() {
        return this.purpose;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    public static final class Builder extends Request.Builder<CreateIndividuationProjectRequest, Builder> {
        private String projectInfo; 
        private String projectName; 
        private String purpose; 
        private String sceneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateIndividuationProjectRequest request) {
            super(request);
            this.projectInfo = request.projectInfo;
            this.projectName = request.projectName;
            this.purpose = request.purpose;
            this.sceneId = request.sceneId;
        } 

        /**
         * projectInfo.
         */
        public Builder projectInfo(String projectInfo) {
            this.putBodyParameter("projectInfo", projectInfo);
            this.projectInfo = projectInfo;
            return this;
        }

        /**
         * projectName.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("projectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * purpose.
         */
        public Builder purpose(String purpose) {
            this.putBodyParameter("purpose", purpose);
            this.purpose = purpose;
            return this;
        }

        /**
         * sceneId.
         */
        public Builder sceneId(String sceneId) {
            this.putBodyParameter("sceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public CreateIndividuationProjectRequest build() {
            return new CreateIndividuationProjectRequest(this);
        } 

    } 

}
