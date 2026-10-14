// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aideepsign20260511.models;

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
 * {@link CreateC2paBucketSignTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateC2paBucketSignTaskRequest</p>
 */
public class CreateC2paBucketSignTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BucketName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bucketName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BucketRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bucketRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SoftwareAgent")
    private String softwareAgent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourcePrefix")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourcePrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    private CreateC2paBucketSignTaskRequest(Builder builder) {
        super(builder);
        this.bucketName = builder.bucketName;
        this.bucketRegionId = builder.bucketRegionId;
        this.softwareAgent = builder.softwareAgent;
        this.sourcePrefix = builder.sourcePrefix;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateC2paBucketSignTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucketName
     */
    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * @return bucketRegionId
     */
    public String getBucketRegionId() {
        return this.bucketRegionId;
    }

    /**
     * @return softwareAgent
     */
    public String getSoftwareAgent() {
        return this.softwareAgent;
    }

    /**
     * @return sourcePrefix
     */
    public String getSourcePrefix() {
        return this.sourcePrefix;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<CreateC2paBucketSignTaskRequest, Builder> {
        private String bucketName; 
        private String bucketRegionId; 
        private String softwareAgent; 
        private String sourcePrefix; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(CreateC2paBucketSignTaskRequest request) {
            super(request);
            this.bucketName = request.bucketName;
            this.bucketRegionId = request.bucketRegionId;
            this.softwareAgent = request.softwareAgent;
            this.sourcePrefix = request.sourcePrefix;
            this.sourceType = request.sourceType;
        } 

        /**
         * <p>The name of the user OSS bucket. You must authorize the service-linked role AliyunServiceRoleForAIDeepSign to access the bucket in advance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example-bucket</p>
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("BucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        /**
         * <p>The region of the user OSS bucket. It must be consistent with the actual region of the bucket.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder bucketRegionId(String bucketRegionId) {
            this.putQueryParameter("BucketRegionId", bucketRegionId);
            this.bucketRegionId = bucketRegionId;
            return this;
        }

        /**
         * <p>The optional name of the software that generated the content. This parameter is not supported in the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>Adobe Photoshop 25.0</p>
         */
        public Builder softwareAgent(String softwareAgent) {
            this.putQueryParameter("SoftwareAgent", softwareAgent);
            this.softwareAgent = softwareAgent;
            return this;
        }

        /**
         * <p>The source object prefix. It must be <code>ai-deepsign/</code> or its subdirectory. The service recursively processes objects under this prefix.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ai-deepsign/images/</p>
         */
        public Builder sourcePrefix(String sourcePrefix) {
            this.putQueryParameter("SourcePrefix", sourcePrefix);
            this.sourcePrefix = sourcePrefix;
            return this;
        }

        /**
         * <p>The optional content source type. This parameter is not supported in the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>digitalCapture</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public CreateC2paBucketSignTaskRequest build() {
            return new CreateC2paBucketSignTaskRequest(this);
        } 

    } 

}
