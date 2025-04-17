// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link ContextualAnswerRequest} extends {@link RequestModel}
 *
 * <p>ContextualAnswerRequest</p>
 */
public class ContextualAnswerRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Files")
    private java.util.List<ContextualFile> files;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Messages")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ContextualMessage> messages;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    private ContextualAnswerRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.files = builder.files;
        this.messages = builder.messages;
        this.projectName = builder.projectName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ContextualAnswerRequest create() {
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
     * @return files
     */
    public java.util.List<ContextualFile> getFiles() {
        return this.files;
    }

    /**
     * @return messages
     */
    public java.util.List<ContextualMessage> getMessages() {
        return this.messages;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    public static final class Builder extends Request.Builder<ContextualAnswerRequest, Builder> {
        private String regionId; 
        private java.util.List<ContextualFile> files; 
        private java.util.List<ContextualMessage> messages; 
        private String projectName; 

        private Builder() {
            super();
        } 

        private Builder(ContextualAnswerRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.files = request.files;
            this.messages = request.messages;
            this.projectName = request.projectName;
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
         * Files.
         */
        public Builder files(java.util.List<ContextualFile> files) {
            String filesShrink = shrink(files, "Files", "json");
            this.putBodyParameter("Files", filesShrink);
            this.files = files;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder messages(java.util.List<ContextualMessage> messages) {
            String messagesShrink = shrink(messages, "Messages", "json");
            this.putBodyParameter("Messages", messagesShrink);
            this.messages = messages;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        @Override
        public ContextualAnswerRequest build() {
            return new ContextualAnswerRequest(this);
        } 

    } 

}
