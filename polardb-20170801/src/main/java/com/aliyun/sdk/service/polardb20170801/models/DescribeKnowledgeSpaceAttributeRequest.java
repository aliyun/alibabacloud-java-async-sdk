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
 * {@link DescribeKnowledgeSpaceAttributeRequest} extends {@link RequestModel}
 *
 * <p>DescribeKnowledgeSpaceAttributeRequest</p>
 */
public class DescribeKnowledgeSpaceAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KnowledgeSpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DescribeKnowledgeSpaceAttributeRequest(Builder builder) {
        super(builder);
        this.knowledgeSpaceId = builder.knowledgeSpaceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKnowledgeSpaceAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return knowledgeSpaceId
     */
    public String getKnowledgeSpaceId() {
        return this.knowledgeSpaceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeKnowledgeSpaceAttributeRequest, Builder> {
        private String knowledgeSpaceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeKnowledgeSpaceAttributeRequest request) {
            super(request);
            this.knowledgeSpaceId = request.knowledgeSpaceId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pks-xxxx</p>
         */
        public Builder knowledgeSpaceId(String knowledgeSpaceId) {
            this.putQueryParameter("KnowledgeSpaceId", knowledgeSpaceId);
            this.knowledgeSpaceId = knowledgeSpaceId;
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
        public DescribeKnowledgeSpaceAttributeRequest build() {
            return new DescribeKnowledgeSpaceAttributeRequest(this);
        } 

    } 

}
