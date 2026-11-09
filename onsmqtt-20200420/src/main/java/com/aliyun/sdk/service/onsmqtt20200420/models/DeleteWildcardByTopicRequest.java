// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

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
 * {@link DeleteWildcardByTopicRequest} extends {@link RequestModel}
 *
 * <p>DeleteWildcardByTopicRequest</p>
 */
public class DeleteWildcardByTopicRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirstTopic")
    @com.aliyun.core.annotation.Validation(required = true)
    private String firstTopic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Wildcards")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wildcards;

    private DeleteWildcardByTopicRequest(Builder builder) {
        super(builder);
        this.firstTopic = builder.firstTopic;
        this.instanceId = builder.instanceId;
        this.wildcards = builder.wildcards;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWildcardByTopicRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return firstTopic
     */
    public String getFirstTopic() {
        return this.firstTopic;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return wildcards
     */
    public String getWildcards() {
        return this.wildcards;
    }

    public static final class Builder extends Request.Builder<DeleteWildcardByTopicRequest, Builder> {
        private String firstTopic; 
        private String instanceId; 
        private String wildcards; 

        private Builder() {
            super();
        } 

        private Builder(DeleteWildcardByTopicRequest request) {
            super(request);
            this.firstTopic = request.firstTopic;
            this.instanceId = request.instanceId;
            this.wildcards = request.wildcards;
        } 

        /**
         * <p>The first-level topic.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder firstTopic(String firstTopic) {
            this.putQueryParameter("FirstTopic", firstTopic);
            this.firstTopic = firstTopic;
            return this;
        }

        /**
         * <p>The ID of the instance to which the group ID that you want to delete belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mqtt-cn-0pp1ldu****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The wildcard subscriptions to delete.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test/#</p>
         */
        public Builder wildcards(String wildcards) {
            this.putQueryParameter("Wildcards", wildcards);
            this.wildcards = wildcards;
            return this;
        }

        @Override
        public DeleteWildcardByTopicRequest build() {
            return new DeleteWildcardByTopicRequest(this);
        } 

    } 

}
