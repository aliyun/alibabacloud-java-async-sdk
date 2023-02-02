// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsConsumerAccumulateRequest} extends {@link RequestModel}
 *
 * <p>OnsConsumerAccumulateRequest</p>
 */
public class OnsConsumerAccumulateRequest extends Request {
    @Query
    @NameInMap("Detail")
    private Boolean detail;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    private OnsConsumerAccumulateRequest(Builder builder) {
        super(builder);
        this.detail = builder.detail;
        this.groupId = builder.groupId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsConsumerAccumulateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return detail
     */
    public Boolean getDetail() {
        return this.detail;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<OnsConsumerAccumulateRequest, Builder> {
        private Boolean detail; 
        private String groupId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(OnsConsumerAccumulateRequest request) {
            super(request);
            this.detail = request.detail;
            this.groupId = request.groupId;
            this.instanceId = request.instanceId;
        } 

        /**
         * Specifies whether to query the details of each topic to which the consumer group subscribes. Valid values:
         * <p>
         * 
         * *   **true**: The details of each topic are queried. You can obtain the details from the **DetailInTopicList** response parameter.
         * *   **false**: The details of each topic are not queried. This is the default value. If you use this value, the value of the **DetailInTopicList** response parameter is empty.
         */
        public Builder detail(Boolean detail) {
            this.putQueryParameter("Detail", detail);
            this.detail = detail;
            return this;
        }

        /**
         * The ID of the consumer group whose message accumulation you want to query.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public OnsConsumerAccumulateRequest build() {
            return new OnsConsumerAccumulateRequest(this);
        } 

    } 

}
