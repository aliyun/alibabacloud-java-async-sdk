// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datahub20240620.models;

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
 * {@link PutRecordsRequest} extends {@link RequestModel}
 *
 * <p>PutRecordsRequest</p>
 */
public class PutRecordsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Records")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Records> records;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShardId")
    private String shardId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopicName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topicName;

    private PutRecordsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.projectName = builder.projectName;
        this.records = builder.records;
        this.shardId = builder.shardId;
        this.topicName = builder.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutRecordsRequest create() {
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
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return records
     */
    public java.util.List<Records> getRecords() {
        return this.records;
    }

    /**
     * @return shardId
     */
    public String getShardId() {
        return this.shardId;
    }

    /**
     * @return topicName
     */
    public String getTopicName() {
        return this.topicName;
    }

    public static final class Builder extends Request.Builder<PutRecordsRequest, Builder> {
        private String regionId; 
        private String projectName; 
        private java.util.List<Records> records; 
        private String shardId; 
        private String topicName; 

        private Builder() {
            super();
        } 

        private Builder(PutRecordsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.projectName = request.projectName;
            this.records = request.records;
            this.shardId = request.shardId;
            this.topicName = request.topicName;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_project</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder records(java.util.List<Records> records) {
            String recordsShrink = shrink(records, "Records", "json");
            this.putQueryParameter("Records", recordsShrink);
            this.records = records;
            return this;
        }

        /**
         * ShardId.
         */
        public Builder shardId(String shardId) {
            this.putQueryParameter("ShardId", shardId);
            this.shardId = shardId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_topic</p>
         */
        public Builder topicName(String topicName) {
            this.putQueryParameter("TopicName", topicName);
            this.topicName = topicName;
            return this;
        }

        @Override
        public PutRecordsRequest build() {
            return new PutRecordsRequest(this);
        } 

    } 

    /**
     * 
     * {@link PutRecordsRequest} extends {@link TeaModel}
     *
     * <p>PutRecordsRequest</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attributes")
        private java.util.Map<String, String> attributes;

        @com.aliyun.core.annotation.NameInMap("Data")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> data;

        private Records(Builder builder) {
            this.attributes = builder.attributes;
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return attributes
         */
        public java.util.Map<String, String> getAttributes() {
            return this.attributes;
        }

        /**
         * @return data
         */
        public java.util.List<String> getData() {
            return this.data;
        }

        public static final class Builder {
            private java.util.Map<String, String> attributes; 
            private java.util.List<String> data; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.attributes = model.attributes;
                this.data = model.data;
            } 

            /**
             * Attributes.
             */
            public Builder attributes(java.util.Map<String, String> attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;aa&quot;, &quot;bb&quot;, &quot;12&quot;, &quot;12.34&quot;]</p>
             */
            public Builder data(java.util.List<String> data) {
                this.data = data;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
}
