// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20191211.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchSendMessagesRequest} extends {@link RequestModel}
 *
 * <p>BatchSendMessagesRequest</p>
 */
public class BatchSendMessagesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Messages")
    @Validation(required = true)
    private java.util.List < Messages> messages;

    private BatchSendMessagesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.messages = builder.messages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchSendMessagesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return messages
     */
    public java.util.List < Messages> getMessages() {
        return this.messages;
    }

    public static final class Builder extends Request.Builder<BatchSendMessagesRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private java.util.List < Messages> messages; 

        private Builder() {
            super();
        } 

        private Builder(BatchSendMessagesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.messages = request.messages;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Messages.
         */
        public Builder messages(java.util.List < Messages> messages) {
            this.putQueryParameter("Messages", messages);
            this.messages = messages;
            return this;
        }

        @Override
        public BatchSendMessagesRequest build() {
            return new BatchSendMessagesRequest(this);
        } 

    } 

    public static class Messages extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        private Integer id;

        @NameInMap("Payload")
        @Validation(required = true)
        private String payload;

        @NameInMap("ReceiptId")
        private String receiptId;

        @NameInMap("Topics")
        @Validation(required = true)
        private java.util.List < String > topics;

        private Messages(Builder builder) {
            this.id = builder.id;
            this.payload = builder.payload;
            this.receiptId = builder.receiptId;
            this.topics = builder.topics;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return payload
         */
        public String getPayload() {
            return this.payload;
        }

        /**
         * @return receiptId
         */
        public String getReceiptId() {
            return this.receiptId;
        }

        /**
         * @return topics
         */
        public java.util.List < String > getTopics() {
            return this.topics;
        }

        public static final class Builder {
            private Integer id; 
            private String payload; 
            private String receiptId; 
            private java.util.List < String > topics; 

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * Payload.
             */
            public Builder payload(String payload) {
                this.payload = payload;
                return this;
            }

            /**
             * ReceiptId.
             */
            public Builder receiptId(String receiptId) {
                this.receiptId = receiptId;
                return this;
            }

            /**
             * Topics.
             */
            public Builder topics(java.util.List < String > topics) {
                this.topics = topics;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
}
