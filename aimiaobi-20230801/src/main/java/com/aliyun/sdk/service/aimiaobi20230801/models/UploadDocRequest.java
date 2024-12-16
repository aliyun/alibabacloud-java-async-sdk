// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UploadDocRequest} extends {@link RequestModel}
 *
 * <p>UploadDocRequest</p>
 */
public class UploadDocRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    private String categoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Docs")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Docs> docs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private UploadDocRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.categoryId = builder.categoryId;
        this.docs = builder.docs;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadDocRequest create() {
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
     * @return categoryId
     */
    public String getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return docs
     */
    public java.util.List < Docs> getDocs() {
        return this.docs;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UploadDocRequest, Builder> {
        private String regionId; 
        private String categoryId; 
        private java.util.List < Docs> docs; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UploadDocRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.categoryId = request.categoryId;
            this.docs = request.docs;
            this.workspaceId = request.workspaceId;
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
         * CategoryId.
         */
        public Builder categoryId(String categoryId) {
            this.putBodyParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder docs(java.util.List < Docs> docs) {
            String docsShrink = shrink(docs, "Docs", "json");
            this.putBodyParameter("Docs", docsShrink);
            this.docs = docs;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-yigtrrjl377rcbab</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UploadDocRequest build() {
            return new UploadDocRequest(this);
        } 

    } 

    /**
     * 
     * {@link UploadDocRequest} extends {@link TeaModel}
     *
     * <p>UploadDocRequest</p>
     */
    public static class Docs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DocName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String docName;

        @com.aliyun.core.annotation.NameInMap("FileUrl")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fileUrl;

        private Docs(Builder builder) {
            this.docName = builder.docName;
            this.fileUrl = builder.fileUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Docs create() {
            return builder().build();
        }

        /**
         * @return docName
         */
        public String getDocName() {
            return this.docName;
        }

        /**
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        public static final class Builder {
            private String docName; 
            private String fileUrl; 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder docName(String docName) {
                this.docName = docName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxx/ccc.pdf">http://xxx/ccc.pdf</a></p>
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            public Docs build() {
                return new Docs(this);
            } 

        } 

    }
}
