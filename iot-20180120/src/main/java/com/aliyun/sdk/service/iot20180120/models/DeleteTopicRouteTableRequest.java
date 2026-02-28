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
 * {@link DeleteTopicRouteTableRequest} extends {@link RequestModel}
 *
 * <p>DeleteTopicRouteTableRequest</p>
 */
public class DeleteTopicRouteTableRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstTopic")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> dstTopic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcTopic")
    @com.aliyun.core.annotation.Validation(required = true)
    private String srcTopic;

    private DeleteTopicRouteTableRequest(Builder builder) {
        super(builder);
        this.dstTopic = builder.dstTopic;
        this.iotInstanceId = builder.iotInstanceId;
        this.srcTopic = builder.srcTopic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTopicRouteTableRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dstTopic
     */
    public java.util.List<String> getDstTopic() {
        return this.dstTopic;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return srcTopic
     */
    public String getSrcTopic() {
        return this.srcTopic;
    }

    public static final class Builder extends Request.Builder<DeleteTopicRouteTableRequest, Builder> {
        private java.util.List<String> dstTopic; 
        private String iotInstanceId; 
        private String srcTopic; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTopicRouteTableRequest request) {
            super(request);
            this.dstTopic = request.dstTopic;
            this.iotInstanceId = request.iotInstanceId;
            this.srcTopic = request.srcTopic;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder dstTopic(java.util.List<String> dstTopic) {
            this.putQueryParameter("DstTopic", dstTopic);
            this.dstTopic = dstTopic;
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
         * <p>This parameter is required.</p>
         */
        public Builder srcTopic(String srcTopic) {
            this.putQueryParameter("SrcTopic", srcTopic);
            this.srcTopic = srcTopic;
            return this;
        }

        @Override
        public DeleteTopicRouteTableRequest build() {
            return new DeleteTopicRouteTableRequest(this);
        } 

    } 

}
