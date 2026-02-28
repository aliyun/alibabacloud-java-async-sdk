// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryTopicReverseRouteTableRequest} extends {@link RequestModel}
 *
 * <p>QueryTopicReverseRouteTableRequest</p>
 */
public class QueryTopicReverseRouteTableRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Topic")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topic;

    private QueryTopicReverseRouteTableRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.regionId = builder.regionId;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTopicReverseRouteTableRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
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

    public static final class Builder extends Request.Builder<QueryTopicReverseRouteTableRequest, Builder> {
        private String iotInstanceId; 
        private String regionId; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(QueryTopicReverseRouteTableRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.regionId = request.regionId;
            this.topic = request.topic;
        } 

        /**
         * <p>The region where your devices reside. The region you specify must match the region that is specified in the console. Example: cn-shanghai.</p>
         * <blockquote>
         * <p> This parameter is no longer used as an operation-specific request parameter. It is included in common request parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>iot-cn-0pp1n8t****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The destination topic that receives messages.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * <p>This parameter is required.</p>
         */
        public Builder topic(String topic) {
            this.putQueryParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        @Override
        public QueryTopicReverseRouteTableRequest build() {
            return new QueryTopicReverseRouteTableRequest(this);
        } 

    } 

}
