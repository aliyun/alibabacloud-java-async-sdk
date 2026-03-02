// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link DeleteMqTopicRequest} extends {@link RequestModel}
 *
 * <p>DeleteMqTopicRequest</p>
 */
public class DeleteMqTopicRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("topicId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long topicId;

    private DeleteMqTopicRequest(Builder builder) {
        super(builder);
        this.topicId = builder.topicId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMqTopicRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return topicId
     */
    public Long getTopicId() {
        return this.topicId;
    }

    public static final class Builder extends Request.Builder<DeleteMqTopicRequest, Builder> {
        private Long topicId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMqTopicRequest request) {
            super(request);
            this.topicId = request.topicId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder topicId(Long topicId) {
            this.putPathParameter("topicId", topicId);
            this.topicId = topicId;
            return this;
        }

        @Override
        public DeleteMqTopicRequest build() {
            return new DeleteMqTopicRequest(this);
        } 

    } 

}
