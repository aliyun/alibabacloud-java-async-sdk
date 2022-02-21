// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebhookContactsRequest} extends {@link RequestModel}
 *
 * <p>DescribeWebhookContactsRequest</p>
 */
public class DescribeWebhookContactsRequest extends Request {
    @Query
    @NameInMap("Page")
    @Validation(required = true)
    private Long page;

    @Query
    @NameInMap("Size")
    @Validation(required = true)
    private Long size;

    @Query
    @NameInMap("WebhookName")
    private String webhookName;

    private DescribeWebhookContactsRequest(Builder builder) {
        super(builder);
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
        private Long page; 
        private Long size; 
        private String webhookName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWebhookContactsRequest response) {
            super(response);
            this.page = response.page;
            this.size = response.size;
            this.webhookName = response.webhookName;
        } 

        /**
         * Page.
         */
        public Builder page(Long page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Long size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * 告警webhook名称
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
