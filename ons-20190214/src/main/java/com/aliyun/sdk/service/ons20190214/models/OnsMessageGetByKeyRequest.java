// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsMessageGetByKeyRequest} extends {@link RequestModel}
 *
 * <p>OnsMessageGetByKeyRequest</p>
 */
public class OnsMessageGetByKeyRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Key")
    @Validation(required = true)
    private String key;

    @Query
    @NameInMap("Topic")
    @Validation(required = true)
    private String topic;

    private OnsMessageGetByKeyRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.key = builder.key;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsMessageGetByKeyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    public static final class Builder extends Request.Builder<OnsMessageGetByKeyRequest, Builder> {
        private String instanceId; 
        private String key; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(OnsMessageGetByKeyRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.key = request.key;
            this.topic = request.topic;
        } 

        /**
         * The ID of the instance where the message that you want to query resides.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The key of the message that you want to query.
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * The topic that contains the message that you want to query.
         */
        public Builder topic(String topic) {
            this.putQueryParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        @Override
        public OnsMessageGetByKeyRequest build() {
            return new OnsMessageGetByKeyRequest(this);
        } 

    } 

}
