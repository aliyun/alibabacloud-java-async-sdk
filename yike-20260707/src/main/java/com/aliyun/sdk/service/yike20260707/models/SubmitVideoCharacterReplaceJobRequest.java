// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link SubmitVideoCharacterReplaceJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitVideoCharacterReplaceJobRequest</p>
 */
public class SubmitVideoCharacterReplaceJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppParams")
    private String appParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FolderId")
    private String folderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    private SubmitVideoCharacterReplaceJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.appParams = builder.appParams;
        this.folderId = builder.folderId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitVideoCharacterReplaceJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appParams
     */
    public String getAppParams() {
        return this.appParams;
    }

    /**
     * @return folderId
     */
    public String getFolderId() {
        return this.folderId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<SubmitVideoCharacterReplaceJobRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String appParams; 
        private String folderId; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitVideoCharacterReplaceJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.appParams = request.appParams;
            this.folderId = request.folderId;
            this.projectId = request.projectId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the video character replacement application. Use a configured application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app-****</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The input parameters of the application, serialized as a JSON string. The field names and material requirements are subject to the input definition of the corresponding AppId.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;LoadImage.1.TargetImage&quot;:&quot;1a7852b032c371f0b64fe6f6c74b****&quot;}</p>
         */
        public Builder appParams(String appParams) {
            this.putBodyParameter("AppParams", appParams);
            this.appParams = appParams;
            return this;
        }

        /**
         * <p>The folder ID.</p>
         * 
         * <strong>example:</strong>
         * <p>folder-u3ilwhoc36ux9a****</p>
         */
        public Builder folderId(String folderId) {
            this.putBodyParameter("FolderId", folderId);
            this.folderId = folderId;
            return this;
        }

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pd_061716****</p>
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public SubmitVideoCharacterReplaceJobRequest build() {
            return new SubmitVideoCharacterReplaceJobRequest(this);
        } 

    } 

}
