// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryMessageRequest} extends {@link RequestModel}
 *
 * <p>QueryMessageRequest</p>
 */
public class QueryMessageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTime")
    private Long beginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Offset")
    private String offset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Partition")
    private String partition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Topic")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topic;

    private QueryMessageRequest(Builder builder) {
        super(builder);
        this.beginTime = builder.beginTime;
        this.instanceId = builder.instanceId;
        this.offset = builder.offset;
        this.partition = builder.partition;
        this.queryType = builder.queryType;
        this.regionId = builder.regionId;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMessageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return offset
     */
    public String getOffset() {
        return this.offset;
    }

    /**
     * @return partition
     */
    public String getPartition() {
        return this.partition;
    }

    /**
     * @return queryType
     */
    public String getQueryType() {
        return this.queryType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    public static final class Builder extends Request.Builder<QueryMessageRequest, Builder> {
        private Long beginTime; 
        private String instanceId; 
        private String offset; 
        private String partition; 
        private String queryType; 
        private String regionId; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(QueryMessageRequest request) {
            super(request);
            this.beginTime = request.beginTime;
            this.instanceId = request.instanceId;
            this.offset = request.offset;
            this.partition = request.partition;
            this.queryType = request.queryType;
            this.regionId = request.regionId;
            this.topic = request.topic;
        } 

        /**
         * <p>The beginning of the time range to query. The value of this parameter is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1672410180000</p>
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alikafka_pre-cn-mp919o4v****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The consumer offset of the partition.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder offset(String offset) {
            this.putQueryParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * <p>The partition ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder partition(String partition) {
            this.putQueryParameter("Partition", partition);
            this.partition = partition;
            return this;
        }

        /**
         * <p>The query type. Valid values:</p>
         * <ul>
         * <li>byOffset: queries messages by offset. If you select this value, you must configure Partition and Offset.</li>
         * <li>byTimestamp: queries messages by time. If you select this value, you must configure BeginTime.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>byTimestamp</p>
         */
        public Builder queryType(String queryType) {
            this.putQueryParameter("QueryType", queryType);
            this.queryType = queryType;
            return this;
        }

        /**
         * <p>The ID of the region where the resource resides.</p>
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
         * <p>The topic name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testkafka</p>
         */
        public Builder topic(String topic) {
            this.putQueryParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        @Override
        public QueryMessageRequest build() {
            return new QueryMessageRequest(this);
        } 

    } 

}
