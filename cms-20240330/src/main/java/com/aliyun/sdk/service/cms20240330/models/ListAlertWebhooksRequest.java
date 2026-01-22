// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListAlertWebhooksRequest} extends {@link RequestModel}
 *
 * <p>ListAlertWebhooksRequest</p>
 */
public class ListAlertWebhooksRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("webhookIds")
    private java.util.List<String> webhookIds;

    private ListAlertWebhooksRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.webhookIds = builder.webhookIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlertWebhooksRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return webhookIds
     */
    public java.util.List<String> getWebhookIds() {
        return this.webhookIds;
    }

    public static final class Builder extends Request.Builder<ListAlertWebhooksRequest, Builder> {
        private String regionId; 
        private String name; 
        private Long pageNumber; 
        private Long pageSize; 
        private java.util.List<String> webhookIds; 

        private Builder() {
            super();
        } 

        private Builder(ListAlertWebhooksRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.webhookIds = request.webhookIds;
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
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * webhookIds.
         */
        public Builder webhookIds(java.util.List<String> webhookIds) {
            String webhookIdsShrink = shrink(webhookIds, "webhookIds", "json");
            this.putQueryParameter("webhookIds", webhookIdsShrink);
            this.webhookIds = webhookIds;
            return this;
        }

        @Override
        public ListAlertWebhooksRequest build() {
            return new ListAlertWebhooksRequest(this);
        } 

    } 

}
