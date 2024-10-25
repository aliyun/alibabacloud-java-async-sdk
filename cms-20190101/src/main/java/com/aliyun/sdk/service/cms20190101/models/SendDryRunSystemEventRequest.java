// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The content of the system event.</p>
         * <blockquote>
         * <p> The value of this parameter is a JSON object. We recommend that you include the <code>product</code>, <code>resourceId</code>, and <code>regionId</code> fields in the JSON object.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;product&quot;:&quot;CloudMonitor&quot;,&quot;resourceId&quot;:&quot;acs:ecs:cn-hongkong:173651113438****:instance/{instanceId}&quot;,&quot;level&quot;:&quot;CRITICAL&quot;,&quot;instanceName&quot;:&quot;instanceName&quot;,&quot;regionId&quot;:&quot;cn-hangzhou&quot;,&quot;name&quot;:&quot;Agent_Status_Stopped&quot;,&quot;content&quot;:{&quot;ipGroup&quot;:&quot;0.0.0.0,0.0.0.1&quot;,&quot;tianjimonVersion&quot;:&quot;1.2.11&quot;},&quot;status&quot;:&quot;stopped&quot;}</p>
         */
        public Builder eventContent(String eventContent) {
            this.putQueryParameter("EventContent", eventContent);
            this.eventContent = eventContent;
            return this;
        }

        /**
         * <p>The name of the system event.</p>
         * <blockquote>
         * <p> For more information, see <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Agent_Status_Stopped</p>
         */
        public Builder eventName(String eventName) {
            this.putQueryParameter("EventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * <p>The ID of the application group.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The name of the cloud service.</p>
         * <blockquote>
         * <p> For information about the system events supported by Cloud Monitor for Alibaba Cloud services, see <a href="https://help.aliyun.com/document_detail/167388.html">System events</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
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
