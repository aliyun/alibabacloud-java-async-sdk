// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTopicRouteTableRequest} extends {@link RequestModel}
 *
 * <p>DeleteTopicRouteTableRequest</p>
 */
public class DeleteTopicRouteTableRequest extends Request {
    @Query
    @NameInMap("DstTopic")
    @Validation(required = true)
    private java.util.List < String > dstTopic;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("SrcTopic")
    @Validation(required = true)
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
    public java.util.List < String > getDstTopic() {
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
        private java.util.List < String > dstTopic; 
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
         * DstTopic.
         */
        public Builder dstTopic(java.util.List < String > dstTopic) {
            this.putQueryParameter("DstTopic", dstTopic);
            this.dstTopic = dstTopic;
            return this;
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
         * SrcTopic.
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
