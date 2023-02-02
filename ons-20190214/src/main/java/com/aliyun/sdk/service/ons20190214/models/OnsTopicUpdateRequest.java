// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsTopicUpdateRequest} extends {@link RequestModel}
 *
 * <p>OnsTopicUpdateRequest</p>
 */
public class OnsTopicUpdateRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Perm")
    @Validation(required = true)
    private Integer perm;

    @Query
    @NameInMap("Topic")
    @Validation(required = true)
    private String topic;

    private OnsTopicUpdateRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.perm = builder.perm;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsTopicUpdateRequest create() {
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
     * @return perm
     */
    public Integer getPerm() {
        return this.perm;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    public static final class Builder extends Request.Builder<OnsTopicUpdateRequest, Builder> {
        private String instanceId; 
        private Integer perm; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(OnsTopicUpdateRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.perm = request.perm;
            this.topic = request.topic;
        } 

        /**
         * The ID of the instance to which the topic belongs.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The read/write mode that you want to configure for the topic. Valid values:
         * <p>
         * 
         * *   **6:** Both read and write operations are allowed.
         * *   **4:** Write operations are forbidden.
         * *   **2:** Read operations are forbidden.
         */
        public Builder perm(Integer perm) {
            this.putQueryParameter("Perm", perm);
            this.perm = perm;
            return this;
        }

        /**
         * The name of the topic that you want to manage.
         */
        public Builder topic(String topic) {
            this.putQueryParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        @Override
        public OnsTopicUpdateRequest build() {
            return new OnsTopicUpdateRequest(this);
        } 

    } 

}
