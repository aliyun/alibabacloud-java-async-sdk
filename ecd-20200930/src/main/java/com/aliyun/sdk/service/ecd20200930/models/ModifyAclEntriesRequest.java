// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link ModifyAclEntriesRequest} extends {@link RequestModel}
 *
 * <p>ModifyAclEntriesRequest</p>
 */
public class ModifyAclEntriesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Policy")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> sourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceType;

    private ModifyAclEntriesRequest(Builder builder) {
        super(builder);
        this.policy = builder.policy;
        this.regionId = builder.regionId;
        this.sourceId = builder.sourceId;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAclEntriesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sourceId
     */
    public java.util.List<String> getSourceId() {
        return this.sourceId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<ModifyAclEntriesRequest, Builder> {
        private String policy; 
        private String regionId; 
        private java.util.List<String> sourceId; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAclEntriesRequest request) {
            super(request);
            this.policy = request.policy;
            this.regionId = request.regionId;
            this.sourceId = request.sourceId;
            this.sourceType = request.sourceType;
        } 

        /**
         * <p>The Internet access control policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>allow: allows access to the Internet.</p>
         * </li>
         * <li><p>disable: forbids access to the Internet.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>allow</p>
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The instance IDs (office network IDs or cloud computer IDs) to which the Internet access control policy is applicable.</p>
         * <p>This parameter is required.</p>
         */
        public Builder sourceId(java.util.List<String> sourceId) {
            this.putQueryParameter("SourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>The granularity to which the Internet access control policy is applicable.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>desktop: cloud computer granularity.</p>
         * </li>
         * <li><p>vpc: office network granularity.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>desktop</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public ModifyAclEntriesRequest build() {
            return new ModifyAclEntriesRequest(this);
        } 

    } 

}
