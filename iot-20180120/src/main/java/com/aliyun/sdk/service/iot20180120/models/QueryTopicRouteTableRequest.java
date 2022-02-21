// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTopicRouteTableRequest} extends {@link RequestModel}
 *
 * <p>QueryTopicRouteTableRequest</p>
 */
public class QueryTopicRouteTableRequest extends Request {
    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("Topic")
    @Validation(required = true)
    private String topic;

    private QueryTopicRouteTableRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTopicRouteTableRequest create() {
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
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    public static final class Builder extends Request.Builder<QueryTopicRouteTableRequest, Builder> {
        private String iotInstanceId; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(QueryTopicRouteTableRequest response) {
            super(response);
            this.iotInstanceId = response.iotInstanceId;
            this.topic = response.topic;
        } 

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * Topic.
         */
        public Builder topic(String topic) {
            this.putQueryParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        @Override
        public QueryTopicRouteTableRequest build() {
            return new QueryTopicRouteTableRequest(this);
        } 

    } 

}
