// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link ListDataIngestionsRequest} extends {@link RequestModel}
 *
 * <p>ListDataIngestionsRequest</p>
 */
public class ListDataIngestionsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataIngestionIds")
    private java.util.List<String> dataIngestionIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataIngestionStatus")
    private String dataIngestionStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataIngestionTemplateIds")
    private java.util.List<String> dataIngestionTemplateIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductId")
    private String productId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    private ListDataIngestionsRequest(Builder builder) {
        super(builder);
        this.dataIngestionIds = builder.dataIngestionIds;
        this.dataIngestionStatus = builder.dataIngestionStatus;
        this.dataIngestionTemplateIds = builder.dataIngestionTemplateIds;
        this.lang = builder.lang;
        this.productId = builder.productId;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataIngestionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataIngestionIds
     */
    public java.util.List<String> getDataIngestionIds() {
        return this.dataIngestionIds;
    }

    /**
     * @return dataIngestionStatus
     */
    public String getDataIngestionStatus() {
        return this.dataIngestionStatus;
    }

    /**
     * @return dataIngestionTemplateIds
     */
    public java.util.List<String> getDataIngestionTemplateIds() {
        return this.dataIngestionTemplateIds;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    public static final class Builder extends Request.Builder<ListDataIngestionsRequest, Builder> {
        private java.util.List<String> dataIngestionIds; 
        private String dataIngestionStatus; 
        private java.util.List<String> dataIngestionTemplateIds; 
        private String lang; 
        private String productId; 
        private String regionId; 
        private Long roleFor; 

        private Builder() {
            super();
        } 

        private Builder(ListDataIngestionsRequest request) {
            super(request);
            this.dataIngestionIds = request.dataIngestionIds;
            this.dataIngestionStatus = request.dataIngestionStatus;
            this.dataIngestionTemplateIds = request.dataIngestionTemplateIds;
            this.lang = request.lang;
            this.productId = request.productId;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
        } 

        /**
         * DataIngestionIds.
         */
        public Builder dataIngestionIds(java.util.List<String> dataIngestionIds) {
            String dataIngestionIdsShrink = shrink(dataIngestionIds, "DataIngestionIds", "simple");
            this.putBodyParameter("DataIngestionIds", dataIngestionIdsShrink);
            this.dataIngestionIds = dataIngestionIds;
            return this;
        }

        /**
         * DataIngestionStatus.
         */
        public Builder dataIngestionStatus(String dataIngestionStatus) {
            this.putBodyParameter("DataIngestionStatus", dataIngestionStatus);
            this.dataIngestionStatus = dataIngestionStatus;
            return this;
        }

        /**
         * DataIngestionTemplateIds.
         */
        public Builder dataIngestionTemplateIds(java.util.List<String> dataIngestionTemplateIds) {
            String dataIngestionTemplateIdsShrink = shrink(dataIngestionTemplateIds, "DataIngestionTemplateIds", "simple");
            this.putBodyParameter("DataIngestionTemplateIds", dataIngestionTemplateIdsShrink);
            this.dataIngestionTemplateIds = dataIngestionTemplateIds;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * ProductId.
         */
        public Builder productId(String productId) {
            this.putBodyParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RoleFor.
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        @Override
        public ListDataIngestionsRequest build() {
            return new ListDataIngestionsRequest(this);
        } 

    } 

}
