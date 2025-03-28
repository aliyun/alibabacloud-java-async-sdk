// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link DescribeSubscriptionMetaRequest} extends {@link RequestModel}
 *
 * <p>DescribeSubscriptionMetaRequest</p>
 */
public class DescribeSubscriptionMetaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsInstanceId")
    private String dtsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubMigrationJobIds")
    private java.util.Map<String, ?> subMigrationJobIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Topics")
    private java.util.Map<String, ?> topics;

    private DescribeSubscriptionMetaRequest(Builder builder) {
        super(builder);
        this.dtsInstanceId = builder.dtsInstanceId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.sid = builder.sid;
        this.subMigrationJobIds = builder.subMigrationJobIds;
        this.topics = builder.topics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSubscriptionMetaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dtsInstanceId
     */
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return sid
     */
    public String getSid() {
        return this.sid;
    }

    /**
     * @return subMigrationJobIds
     */
    public java.util.Map<String, ?> getSubMigrationJobIds() {
        return this.subMigrationJobIds;
    }

    /**
     * @return topics
     */
    public java.util.Map<String, ?> getTopics() {
        return this.topics;
    }

    public static final class Builder extends Request.Builder<DescribeSubscriptionMetaRequest, Builder> {
        private String dtsInstanceId; 
        private String regionId; 
        private String resourceGroupId; 
        private String sid; 
        private java.util.Map<String, ?> subMigrationJobIds; 
        private java.util.Map<String, ?> topics; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSubscriptionMetaRequest request) {
            super(request);
            this.dtsInstanceId = request.dtsInstanceId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.sid = request.sid;
            this.subMigrationJobIds = request.subMigrationJobIds;
            this.topics = request.topics;
        } 

        /**
         * <p>The ID of the distributed change tracking instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dtsbr4m9luv2******</p>
         */
        public Builder dtsInstanceId(String dtsInstanceId) {
            this.putQueryParameter("DtsInstanceId", dtsInstanceId);
            this.dtsInstanceId = dtsInstanceId;
            return this;
        }

        /**
         * <p>The ID of the region in which the change tracking instance resides.</p>
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
         * <p>Resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the consumer group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>z38m91gg2******</p>
         */
        public Builder sid(String sid) {
            this.putQueryParameter("Sid", sid);
            this.sid = sid;
            return this;
        }

        /**
         * <p>The IDs of all subtasks in the distributed change tracking task. Separate multiple subtask IDs with commas (,).</p>
         * <blockquote>
         * <p> You must specify at least one of the SubMigrationJobIds and <strong>Topics</strong> parameters. We recommend that you specify the SubMigrationJobIds parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>z38m91gg2******</p>
         */
        public Builder subMigrationJobIds(java.util.Map<String, ?> subMigrationJobIds) {
            String subMigrationJobIdsShrink = shrink(subMigrationJobIds, "SubMigrationJobIds", "json");
            this.putQueryParameter("SubMigrationJobIds", subMigrationJobIdsShrink);
            this.subMigrationJobIds = subMigrationJobIds;
            return this;
        }

        /**
         * <p>The topics of all subtasks in the distributed change tracking task. Separate multiple topics with commas (,).</p>
         * <blockquote>
         * <p> You must specify at least one of the <strong>SubMigrationJobIds</strong> and Topics parameters. We recommend that you specify the <strong>SubMigrationJobIds</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn_hangzhou_rm_bp1n0x0x5tz******_dtstestdata_version2</p>
         */
        public Builder topics(java.util.Map<String, ?> topics) {
            String topicsShrink = shrink(topics, "Topics", "json");
            this.putQueryParameter("Topics", topicsShrink);
            this.topics = topics;
            return this;
        }

        @Override
        public DescribeSubscriptionMetaRequest build() {
            return new DescribeSubscriptionMetaRequest(this);
        } 

    } 

}
