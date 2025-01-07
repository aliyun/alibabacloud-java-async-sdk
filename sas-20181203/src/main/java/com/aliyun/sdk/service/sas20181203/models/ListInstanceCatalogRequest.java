// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListInstanceCatalogRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceCatalogRequest</p>
 */
public class ListInstanceCatalogRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequirementIds")
    private java.util.List<Long> requirementIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StandardIds")
    private java.util.List<Long> standardIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Types")
    private java.util.List<String> types;

    private ListInstanceCatalogRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.regionId = builder.regionId;
        this.requirementIds = builder.requirementIds;
        this.standardIds = builder.standardIds;
        this.types = builder.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceCatalogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requirementIds
     */
    public java.util.List<Long> getRequirementIds() {
        return this.requirementIds;
    }

    /**
     * @return standardIds
     */
    public java.util.List<Long> getStandardIds() {
        return this.standardIds;
    }

    /**
     * @return types
     */
    public java.util.List<String> getTypes() {
        return this.types;
    }

    public static final class Builder extends Request.Builder<ListInstanceCatalogRequest, Builder> {
        private String lang; 
        private String regionId; 
        private java.util.List<Long> requirementIds; 
        private java.util.List<Long> standardIds; 
        private java.util.List<String> types; 

        private Builder() {
            super();
        } 

        private Builder(ListInstanceCatalogRequest request) {
            super(request);
            this.lang = request.lang;
            this.regionId = request.regionId;
            this.requirementIds = request.requirementIds;
            this.standardIds = request.standardIds;
            this.types = request.types;
        } 

        /**
         * <p>The language of the content within the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The ID of the region in which the asset resides. Valid values:</p>
         * <ul>
         * <li><strong>cn-hangzhou</strong>: International</li>
         * <li><strong>ap-southeast-1</strong>: Singapore</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The IDs of requirement items.</p>
         */
        public Builder requirementIds(java.util.List<Long> requirementIds) {
            this.putQueryParameter("RequirementIds", requirementIds);
            this.requirementIds = requirementIds;
            return this;
        }

        /**
         * <p>The IDs of standards.</p>
         */
        public Builder standardIds(java.util.List<Long> standardIds) {
            this.putQueryParameter("StandardIds", standardIds);
            this.standardIds = standardIds;
            return this;
        }

        /**
         * <p>The types of check standards.</p>
         */
        public Builder types(java.util.List<String> types) {
            this.putQueryParameter("Types", types);
            this.types = types;
            return this;
        }

        @Override
        public ListInstanceCatalogRequest build() {
            return new ListInstanceCatalogRequest(this);
        } 

    } 

}
