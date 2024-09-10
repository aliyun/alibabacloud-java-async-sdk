// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendDryRunSystemEventRequest} extends {@link RequestModel}
 *
 * <p>SendDryRunSystemEventRequest</p>
 */
public class SendDryRunSystemEventRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventContent")
    private String eventContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Product")
    @com.aliyun.core.annotation.Validation(required = true)
    private String product;

    private SendDryRunSystemEventRequest(Builder builder) {
        super(builder);
        this.eventContent = builder.eventContent;
        this.eventName = builder.eventName;
        this.groupId = builder.groupId;
        this.product = builder.product;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendDryRunSystemEventRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventContent
     */
    public String getEventContent() {
        return this.eventContent;
    }

    /**
     * @return eventName
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    public static final class Builder extends Request.Builder<SendDryRunSystemEventRequest, Builder> {
        private String eventContent; 
        private String eventName; 
        private String groupId; 
        private String product; 

        private Builder() {
            super();
        } 

        private Builder(SendDryRunSystemEventRequest request) {
            super(request);
            this.eventContent = request.eventContent;
            this.eventName = request.eventName;
            this.groupId = request.groupId;
            this.product = request.product;
        } 

        /**
         * The content of the system event.
         * <p>
         * 
         * >  The value of this parameter is a JSON object. We recommend that you include the `product`, `resourceId`, and `regionId` fields in the JSON object.
         */
        public Builder eventContent(String eventContent) {
            this.putQueryParameter("EventContent", eventContent);
            this.eventContent = eventContent;
            return this;
        }

        /**
         * The name of the system event.
         * <p>
         * 
         * >  For more information, see [DescribeSystemEventMetaList](~~114972~~).
         */
        public Builder eventName(String eventName) {
            this.putQueryParameter("EventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * The ID of the application group.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The name of the cloud service.
         * <p>
         * 
         * >  For information about the system events supported by Cloud Monitor for Alibaba Cloud services, see [System events](~~167388~~).
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        @Override
        public SendDryRunSystemEventRequest build() {
            return new SendDryRunSystemEventRequest(this);
        } 

    } 

}
