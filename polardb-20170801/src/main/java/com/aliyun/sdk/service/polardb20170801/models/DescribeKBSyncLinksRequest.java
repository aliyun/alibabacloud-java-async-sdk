// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeKBSyncLinksRequest} extends {@link RequestModel}
 *
 * <p>DescribeKBSyncLinksRequest</p>
 */
public class DescribeKBSyncLinksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImPlatform")
    private String imPlatform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DescribeKBSyncLinksRequest(Builder builder) {
        super(builder);
        this.imPlatform = builder.imPlatform;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKBSyncLinksRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imPlatform
     */
    public String getImPlatform() {
        return this.imPlatform;
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeKBSyncLinksRequest, Builder> {
        private String imPlatform; 
        private String knowledgeBaseId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeKBSyncLinksRequest request) {
            super(request);
            this.imPlatform = request.imPlatform;
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.regionId = request.regionId;
        } 

        /**
         * ImPlatform.
         */
        public Builder imPlatform(String imPlatform) {
            this.putQueryParameter("ImPlatform", imPlatform);
            this.imPlatform = imPlatform;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pkb-xxxxx</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putQueryParameter("KnowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeKBSyncLinksRequest build() {
            return new DescribeKBSyncLinksRequest(this);
        } 

    } 

}
