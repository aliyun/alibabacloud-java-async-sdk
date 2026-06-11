// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airegistry20260317.models;

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
 * {@link UploadSkillViaOssRequest} extends {@link RequestModel}
 *
 * <p>UploadSkillViaOssRequest</p>
 */
public class UploadSkillViaOssRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommitMsg")
    private String commitMsg;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssObjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ossObjectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Overwrite")
    private Boolean overwrite;

    private UploadSkillViaOssRequest(Builder builder) {
        super(builder);
        this.commitMsg = builder.commitMsg;
        this.namespaceId = builder.namespaceId;
        this.ossObjectName = builder.ossObjectName;
        this.overwrite = builder.overwrite;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadSkillViaOssRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commitMsg
     */
    public String getCommitMsg() {
        return this.commitMsg;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return ossObjectName
     */
    public String getOssObjectName() {
        return this.ossObjectName;
    }

    /**
     * @return overwrite
     */
    public Boolean getOverwrite() {
        return this.overwrite;
    }

    public static final class Builder extends Request.Builder<UploadSkillViaOssRequest, Builder> {
        private String commitMsg; 
        private String namespaceId; 
        private String ossObjectName; 
        private Boolean overwrite; 

        private Builder() {
            super();
        } 

        private Builder(UploadSkillViaOssRequest request) {
            super(request);
            this.commitMsg = request.commitMsg;
            this.namespaceId = request.namespaceId;
            this.ossObjectName = request.ossObjectName;
            this.overwrite = request.overwrite;
        } 

        /**
         * CommitMsg.
         */
        public Builder commitMsg(String commitMsg) {
            this.putQueryParameter("CommitMsg", commitMsg);
            this.commitMsg = commitMsg;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>upload/skill/022b20c3-fc6c-460e-9364-8e508d75a724.zip</p>
         */
        public Builder ossObjectName(String ossObjectName) {
            this.putQueryParameter("OssObjectName", ossObjectName);
            this.ossObjectName = ossObjectName;
            return this;
        }

        /**
         * Overwrite.
         */
        public Builder overwrite(Boolean overwrite) {
            this.putQueryParameter("Overwrite", overwrite);
            this.overwrite = overwrite;
            return this;
        }

        @Override
        public UploadSkillViaOssRequest build() {
            return new UploadSkillViaOssRequest(this);
        } 

    } 

}
