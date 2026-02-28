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
 * {@link DeleteProductTopicRequest} extends {@link RequestModel}
 *
 * <p>DeleteProductTopicRequest</p>
 */
public class DeleteProductTopicRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopicId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topicId;

    private DeleteProductTopicRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.topicId = builder.topicId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProductTopicRequest create() {
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
     * @return topicId
     */
    public String getTopicId() {
        return this.topicId;
    }

    public static final class Builder extends Request.Builder<DeleteProductTopicRequest, Builder> {
        private String iotInstanceId; 
        private String topicId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProductTopicRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.topicId = request.topicId;
        } 

        /**
         * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
         * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
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
         * <p>The ID of the topic category that you want to delete.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>798****</p>
         */
        public Builder topicId(String topicId) {
            this.putQueryParameter("TopicId", topicId);
            this.topicId = topicId;
            return this;
        }

        @Override
        public DeleteProductTopicRequest build() {
            return new DeleteProductTopicRequest(this);
        } 

    } 

}
