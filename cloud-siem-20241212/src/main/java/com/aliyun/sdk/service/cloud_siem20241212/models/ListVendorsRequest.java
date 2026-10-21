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
 * {@link ListVendorsRequest} extends {@link RequestModel}
 *
 * <p>ListVendorsRequest</p>
 */
public class ListVendorsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VendorIds")
    private java.util.List<String> vendorIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VendorName")
    private String vendorName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VendorType")
    private String vendorType;

    private ListVendorsRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.vendorIds = builder.vendorIds;
        this.vendorName = builder.vendorName;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVendorsRequest create() {
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
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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

    /**
     * @return vendorIds
     */
    public java.util.List<String> getVendorIds() {
        return this.vendorIds;
    }

    /**
     * @return vendorName
     */
    public String getVendorName() {
        return this.vendorName;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder extends Request.Builder<ListVendorsRequest, Builder> {
        private String lang; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private Long roleFor; 
        private java.util.List<String> vendorIds; 
        private String vendorName; 
        private String vendorType; 

        private Builder() {
            super();
        } 

        private Builder(ListVendorsRequest request) {
            super(request);
            this.lang = request.lang;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.vendorIds = request.vendorIds;
            this.vendorName = request.vendorName;
            this.vendorType = request.vendorType;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.
         * Note: Although the schema marks this parameter as optional, it is required when you call this operation. If you do not specify this parameter, the API returns a 400 error.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The maximum number of entries to return in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next query. You do not need to specify this parameter for the first request or if no more results exist. If more results exist, set this parameter to the NextToken value returned by the previous API call.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The region where the threat analysis data management center resides. Specify the management center region based on the region of your assets. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: The assets reside in the Chinese mainland.</li>
         * <li>ap-southeast-1: The assets reside outside China.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The user ID that the administrator uses to switch to the perspective of another member.</p>
         * 
         * <strong>example:</strong>
         * <p>173326*******</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * <p>The list of vendors.</p>
         */
        public Builder vendorIds(java.util.List<String> vendorIds) {
            String vendorIdsShrink = shrink(vendorIds, "VendorIds", "simple");
            this.putBodyParameter("VendorIds", vendorIdsShrink);
            this.vendorIds = vendorIds;
            return this;
        }

        /**
         * <p>The vendor name.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        public Builder vendorName(String vendorName) {
            this.putBodyParameter("VendorName", vendorName);
            this.vendorName = vendorName;
            return this;
        }

        /**
         * <p>The vendor type. Valid values:</p>
         * <ul>
         * <li>preset</li>
         * <li>custom</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>preset</p>
         */
        public Builder vendorType(String vendorType) {
            this.putBodyParameter("VendorType", vendorType);
            this.vendorType = vendorType;
            return this;
        }

        @Override
        public ListVendorsRequest build() {
            return new ListVendorsRequest(this);
        } 

    } 

}
