// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectsRequest} extends {@link RequestModel}
 *
 * <p>ListProjectsRequest</p>
 */
public class ListProjectsRequest extends Request {
    @Query
    @NameInMap("marker")
    private String marker;

    @Query
    @NameInMap("maxItem")
    private Integer maxItem;

    @Query
    @NameInMap("prefix")
    private String prefix;

    @Query
    @NameInMap("quotaName")
    private String quotaName;

    @Query
    @NameInMap("quotaNickName")
    private String quotaNickName;

    @Query
    @NameInMap("region")
    private String region;

    @Query
    @NameInMap("saleTags")
    private String saleTags;

    @Query
    @NameInMap("tenantId")
    private String tenantId;

    @Query
    @NameInMap("type")
    private String type;

    private ListProjectsRequest(Builder builder) {
        super(builder);
        this.marker = builder.marker;
        this.maxItem = builder.maxItem;
        this.prefix = builder.prefix;
        this.quotaName = builder.quotaName;
        this.quotaNickName = builder.quotaNickName;
        this.region = builder.region;
        this.saleTags = builder.saleTags;
        this.tenantId = builder.tenantId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return maxItem
     */
    public Integer getMaxItem() {
        return this.maxItem;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * @return quotaName
     */
    public String getQuotaName() {
        return this.quotaName;
    }

    /**
     * @return quotaNickName
     */
    public String getQuotaNickName() {
        return this.quotaNickName;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return saleTags
     */
    public String getSaleTags() {
        return this.saleTags;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListProjectsRequest, Builder> {
        private String marker; 
        private Integer maxItem; 
        private String prefix; 
        private String quotaName; 
        private String quotaNickName; 
        private String region; 
        private String saleTags; 
        private String tenantId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListProjectsRequest request) {
            super(request);
            this.marker = request.marker;
            this.maxItem = request.maxItem;
            this.prefix = request.prefix;
            this.quotaName = request.quotaName;
            this.quotaNickName = request.quotaNickName;
            this.region = request.region;
            this.saleTags = request.saleTags;
            this.tenantId = request.tenantId;
            this.type = request.type;
        } 

        /**
         * marker.
         */
        public Builder marker(String marker) {
            this.putQueryParameter("marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * maxItem.
         */
        public Builder maxItem(Integer maxItem) {
            this.putQueryParameter("maxItem", maxItem);
            this.maxItem = maxItem;
            return this;
        }

        /**
         * prefix.
         */
        public Builder prefix(String prefix) {
            this.putQueryParameter("prefix", prefix);
            this.prefix = prefix;
            return this;
        }

        /**
         * quotaName.
         */
        public Builder quotaName(String quotaName) {
            this.putQueryParameter("quotaName", quotaName);
            this.quotaName = quotaName;
            return this;
        }

        /**
         * quotaNickName.
         */
        public Builder quotaNickName(String quotaNickName) {
            this.putQueryParameter("quotaNickName", quotaNickName);
            this.quotaNickName = quotaNickName;
            return this;
        }

        /**
         * region.
         */
        public Builder region(String region) {
            this.putQueryParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * saleTags.
         */
        public Builder saleTags(String saleTags) {
            this.putQueryParameter("saleTags", saleTags);
            this.saleTags = saleTags;
            return this;
        }

        /**
         * tenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListProjectsRequest build() {
            return new ListProjectsRequest(this);
        } 

    } 

}
