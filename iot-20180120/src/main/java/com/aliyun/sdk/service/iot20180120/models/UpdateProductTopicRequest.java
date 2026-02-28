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
 * {@link UpdateProductTopicRequest} extends {@link RequestModel}
 *
 * <p>UpdateProductTopicRequest</p>
 */
public class UpdateProductTopicRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Codec")
    private String codec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Desc")
    private String desc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableProxySubscribe")
    private Boolean enableProxySubscribe;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operation")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopicId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topicId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopicShortName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topicShortName;

    private UpdateProductTopicRequest(Builder builder) {
        super(builder);
        this.codec = builder.codec;
        this.desc = builder.desc;
        this.enableProxySubscribe = builder.enableProxySubscribe;
        this.iotInstanceId = builder.iotInstanceId;
        this.operation = builder.operation;
        this.topicId = builder.topicId;
        this.topicShortName = builder.topicShortName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProductTopicRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codec
     */
    public String getCodec() {
        return this.codec;
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @return enableProxySubscribe
     */
    public Boolean getEnableProxySubscribe() {
        return this.enableProxySubscribe;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * @return topicId
     */
    public String getTopicId() {
        return this.topicId;
    }

    /**
     * @return topicShortName
     */
    public String getTopicShortName() {
        return this.topicShortName;
    }

    public static final class Builder extends Request.Builder<UpdateProductTopicRequest, Builder> {
        private String codec; 
        private String desc; 
        private Boolean enableProxySubscribe; 
        private String iotInstanceId; 
        private String operation; 
        private String topicId; 
        private String topicShortName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProductTopicRequest request) {
            super(request);
            this.codec = request.codec;
            this.desc = request.desc;
            this.enableProxySubscribe = request.enableProxySubscribe;
            this.iotInstanceId = request.iotInstanceId;
            this.operation = request.operation;
            this.topicId = request.topicId;
            this.topicShortName = request.topicShortName;
        } 

        /**
         * Codec.
         */
        public Builder codec(String codec) {
            this.putQueryParameter("Codec", codec);
            this.codec = codec;
            return this;
        }

        /**
         * <p>The description of the topic category. The description must be 1 to 100 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>resubmit a test topic</p>
         */
        public Builder desc(String desc) {
            this.putQueryParameter("Desc", desc);
            this.desc = desc;
            return this;
        }

        /**
         * EnableProxySubscribe.
         */
        public Builder enableProxySubscribe(Boolean enableProxySubscribe) {
            this.putQueryParameter("EnableProxySubscribe", enableProxySubscribe);
            this.enableProxySubscribe = enableProxySubscribe;
            return this;
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
         * <p>iot_instc_pu****_c*-v64********</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The operation permissions of the device on the topic category. Valid values:</p>
         * <ul>
         * <li><strong>SUB</strong>: Subscribe.</li>
         * <li><strong>PUB</strong>: Publish.</li>
         * <li><strong>ALL</strong>: Publish and Subscribe.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PUB</p>
         */
        public Builder operation(String operation) {
            this.putQueryParameter("Operation", operation);
            this.operation = operation;
            return this;
        }

        /**
         * <p>The ID of the topic category that you want to modify.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>821****</p>
         */
        public Builder topicId(String topicId) {
            this.putQueryParameter("TopicId", topicId);
            this.topicId = topicId;
            return this;
        }

        /**
         * <p>The name of the user-defined category level that you want to set. By default, a topic category includes the following levels: <em>productkey</em> and <em>devicename</em>. Separate the two levels with slashes (/). Format of a topic category: <code>productKey/deviceName/topicShortName</code>.</p>
         * <blockquote>
         * <p> Each level can contain letters, digits, and underscores (_), and cannot be empty.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>resubmit</p>
         */
        public Builder topicShortName(String topicShortName) {
            this.putQueryParameter("TopicShortName", topicShortName);
            this.topicShortName = topicShortName;
            return this;
        }

        @Override
        public UpdateProductTopicRequest build() {
            return new UpdateProductTopicRequest(this);
        } 

    } 

}
