// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetKnowledgeObjectRequest} extends {@link RequestModel}
 *
 * <p>GetKnowledgeObjectRequest</p>
 */
public class GetKnowledgeObjectRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KnowledgeObjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeObjectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VersionNo")
    private Long versionNo;

    private GetKnowledgeObjectRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.knowledgeObjectId = builder.knowledgeObjectId;
        this.versionNo = builder.versionNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKnowledgeObjectRequest create() {
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
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return knowledgeObjectId
     */
    public String getKnowledgeObjectId() {
        return this.knowledgeObjectId;
    }

    /**
     * @return versionNo
     */
    public Long getVersionNo() {
        return this.versionNo;
    }

    public static final class Builder extends Request.Builder<GetKnowledgeObjectRequest, Builder> {
        private String regionId; 
        private String knowledgeBaseId; 
        private String knowledgeObjectId; 
        private Long versionNo; 

        private Builder() {
            super();
        } 

        private Builder(GetKnowledgeObjectRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.knowledgeObjectId = request.knowledgeObjectId;
            this.versionNo = request.versionNo;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the knowledge base.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putBodyParameter("KnowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>The ID of the long-term business object.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>obj-001</p>
         */
        public Builder knowledgeObjectId(String knowledgeObjectId) {
            this.putBodyParameter("KnowledgeObjectId", knowledgeObjectId);
            this.knowledgeObjectId = knowledgeObjectId;
            return this;
        }

        /**
         * <p>Applies only to semantic models. Specifies the version to read. If omitted, the operation returns the published version if available, or the latest version otherwise.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder versionNo(Long versionNo) {
            this.putBodyParameter("VersionNo", versionNo);
            this.versionNo = versionNo;
            return this;
        }

        @Override
        public GetKnowledgeObjectRequest build() {
            return new GetKnowledgeObjectRequest(this);
        } 

    } 

}
