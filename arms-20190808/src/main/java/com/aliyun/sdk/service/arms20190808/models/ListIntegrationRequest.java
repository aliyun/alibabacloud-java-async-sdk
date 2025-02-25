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
 * {@link ListIntegrationRequest} extends {@link RequestModel}
 *
 * <p>ListIntegrationRequest</p>
 */
public class ListIntegrationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntegrationName")
    private String integrationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntegrationProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String integrationProductType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsDetail")
    private Boolean isDetail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Size")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long size;

    private ListIntegrationRequest(Builder builder) {
        super(builder);
        this.integrationName = builder.integrationName;
        this.integrationProductType = builder.integrationProductType;
        this.isDetail = builder.isDetail;
        this.page = builder.page;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIntegrationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return integrationName
     */
    public String getIntegrationName() {
        return this.integrationName;
    }

    /**
     * @return integrationProductType
     */
    public String getIntegrationProductType() {
        return this.integrationProductType;
    }

    /**
     * @return isDetail
     */
    public Boolean getIsDetail() {
        return this.isDetail;
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

    public static final class Builder extends Request.Builder<ListIntegrationRequest, Builder> {
        private String integrationName; 
        private String integrationProductType; 
        private Boolean isDetail; 
        private Long page; 
        private Long size; 

        private Builder() {
            super();
        } 

        private Builder(ListIntegrationRequest request) {
            super(request);
            this.integrationName = request.integrationName;
            this.integrationProductType = request.integrationProductType;
            this.isDetail = request.isDetail;
            this.page = request.page;
            this.size = request.size;
        } 

        /**
         * <p>The name of the alert integration.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudMonitor integration</p>
         */
        public Builder integrationName(String integrationName) {
            this.putQueryParameter("IntegrationName", integrationName);
            this.integrationName = integrationName;
            return this;
        }

        /**
         * <p>The type of the alert integration. Valid values:</p>
         * <ul>
         * <li>CLOUD_MONITOR: CloudMonitor</li>
         * <li>LOG_SERVICE: Log Service</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CLOUD_MONITOR</p>
         */
        public Builder integrationProductType(String integrationProductType) {
            this.putQueryParameter("IntegrationProductType", integrationProductType);
            this.integrationProductType = integrationProductType;
            return this;
        }

        /**
         * <p>Specifies whether to display the details of each alert integration:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isDetail(Boolean isDetail) {
            this.putQueryParameter("IsDetail", isDetail);
            this.isDetail = isDetail;
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
         * <p>The number of alert integrations to return on each page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder size(Long size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListIntegrationRequest build() {
            return new ListIntegrationRequest(this);
        } 

    } 

}
