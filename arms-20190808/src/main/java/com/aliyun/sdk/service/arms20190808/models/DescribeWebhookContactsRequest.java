// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link DescribeWebhookContactsRequest} extends {@link RequestModel}
 *
 * <p>DescribeWebhookContactsRequest</p>
 */
public class DescribeWebhookContactsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactIds")
    private String contactIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Size")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WebhookName")
    private String webhookName;

    private DescribeWebhookContactsRequest(Builder builder) {
        super(builder);
        this.contactIds = builder.contactIds;
        this.page = builder.page;
        this.size = builder.size;
        this.webhookName = builder.webhookName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebhookContactsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactIds
     */
    public String getContactIds() {
        return this.contactIds;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * @return webhookName
     */
    public String getWebhookName() {
        return this.webhookName;
    }

    public static final class Builder extends Request.Builder<DescribeWebhookContactsRequest, Builder> {
        private String contactIds; 
        private Long page; 
        private Long size; 
        private String webhookName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWebhookContactsRequest request) {
            super(request);
            this.contactIds = request.contactIds;
            this.page = request.page;
            this.size = request.size;
            this.webhookName = request.webhookName;
        } 

        /**
         * <p>The ID of the alert contact.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder contactIds(String contactIds) {
            this.putQueryParameter("ContactIds", contactIds);
            this.contactIds = contactIds;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Long page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The number of alert contacts displayed on each page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder size(Long size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * <p>The name of the webhook alert contact.</p>
         * 
         * <strong>example:</strong>
         * <p>Webhook name</p>
         */
        public Builder webhookName(String webhookName) {
            this.putQueryParameter("WebhookName", webhookName);
            this.webhookName = webhookName;
            return this;
        }

        @Override
        public DescribeWebhookContactsRequest build() {
            return new DescribeWebhookContactsRequest(this);
        } 

    } 

}
