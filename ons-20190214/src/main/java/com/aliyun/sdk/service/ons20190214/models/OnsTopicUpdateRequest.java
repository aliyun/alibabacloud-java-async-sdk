// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

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
 * {@link OnsTopicUpdateRequest} extends {@link RequestModel}
 *
 * <p>OnsTopicUpdateRequest</p>
 */
public class OnsTopicUpdateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Perm")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer perm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Topic")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the instance to which the topic belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>MQ_INST_111111111111_DOxxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The read/write mode that you want to configure for the topic. Valid values:</p>
         * <ul>
         * <li><strong>6</strong>: Both read and write operations are allowed.</li>
         * <li><strong>4</strong>: Write operations are forbidden.</li>
         * <li><strong>2</strong>: Read operations are forbidden.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder perm(Integer perm) {
            this.putQueryParameter("Perm", perm);
            this.perm = perm;
            return this;
        }

        /**
         * <p>The name of the topic that you want to manage.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
