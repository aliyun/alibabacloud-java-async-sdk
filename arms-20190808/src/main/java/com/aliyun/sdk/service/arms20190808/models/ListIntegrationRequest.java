// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIntegrationRequest} extends {@link RequestModel}
 *
 * <p>ListIntegrationRequest</p>
 */
public class ListIntegrationRequest extends Request {
    @Query
    @NameInMap("IntegrationName")
    private String integrationName;

    @Query
    @NameInMap("IntegrationProductType")
    @Validation(required = true)
    private String integrationProductType;

    @Query
    @NameInMap("IsDetail")
    private Boolean isDetail;

    @Query
    @NameInMap("Page")
    @Validation(required = true)
    private Long page;

    @Query
    @NameInMap("Size")
    @Validation(required = true)
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
         * IntegrationName.
         */
        public Builder integrationName(String integrationName) {
            this.putQueryParameter("IntegrationName", integrationName);
            this.integrationName = integrationName;
            return this;
        }

        /**
         * IntegrationProductType.
         */
        public Builder integrationProductType(String integrationProductType) {
            this.putQueryParameter("IntegrationProductType", integrationProductType);
            this.integrationProductType = integrationProductType;
            return this;
        }

        /**
         * IsDetail.
         */
        public Builder isDetail(Boolean isDetail) {
            this.putQueryParameter("IsDetail", isDetail);
            this.isDetail = isDetail;
            return this;
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

        @Override
        public ListIntegrationRequest build() {
            return new ListIntegrationRequest(this);
        } 

    } 

}
