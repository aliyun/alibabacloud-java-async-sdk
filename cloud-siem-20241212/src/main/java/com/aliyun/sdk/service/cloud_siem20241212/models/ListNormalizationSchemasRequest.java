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
 * {@link ListNormalizationSchemasRequest} extends {@link RequestModel}
 *
 * <p>ListNormalizationSchemasRequest</p>
 */
public class ListNormalizationSchemasRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("NormalizationCategoryId")
    private String normalizationCategoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationFieldSource")
    private String normalizationFieldSource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationSchemaType")
    private String normalizationSchemaType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationSecurityDomainId")
    private String normalizationSecurityDomainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    private ListNormalizationSchemasRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.normalizationCategoryId = builder.normalizationCategoryId;
        this.normalizationFieldSource = builder.normalizationFieldSource;
        this.normalizationSchemaType = builder.normalizationSchemaType;
        this.normalizationSecurityDomainId = builder.normalizationSecurityDomainId;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNormalizationSchemasRequest create() {
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
     * @return normalizationCategoryId
     */
    public String getNormalizationCategoryId() {
        return this.normalizationCategoryId;
    }

    /**
     * @return normalizationFieldSource
     */
    public String getNormalizationFieldSource() {
        return this.normalizationFieldSource;
    }

    /**
     * @return normalizationSchemaType
     */
    public String getNormalizationSchemaType() {
        return this.normalizationSchemaType;
    }

    /**
     * @return normalizationSecurityDomainId
     */
    public String getNormalizationSecurityDomainId() {
        return this.normalizationSecurityDomainId;
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

    public static final class Builder extends Request.Builder<ListNormalizationSchemasRequest, Builder> {
        private String lang; 
        private Integer maxResults; 
        private String nextToken; 
        private String normalizationCategoryId; 
        private String normalizationFieldSource; 
        private String normalizationSchemaType; 
        private String normalizationSecurityDomainId; 
        private String regionId; 
        private Long roleFor; 

        private Builder() {
            super();
        } 

        private Builder(ListNormalizationSchemasRequest request) {
            super(request);
            this.lang = request.lang;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.normalizationCategoryId = request.normalizationCategoryId;
            this.normalizationFieldSource = request.normalizationFieldSource;
            this.normalizationSchemaType = request.normalizationSchemaType;
            this.normalizationSecurityDomainId = request.normalizationSecurityDomainId;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
        } 

        /**
         * <p>The language type for the request and response messages. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * <p>Note: This parameter is required in actual calls. If this parameter is not specified, the service returns a 400 error &quot;The specified Lang can not be empty.&quot; Explicitly pass in the language code.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
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
         * <p>The pagination token for the next query. You do not need to specify this parameter for the first query or if no more results exist. If more results exist, set this parameter to the NextToken value returned by the previous API call.</p>
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
         * <p>The normalization rule category ID.</p>
         * 
         * <strong>example:</strong>
         * <p>NETWORK_CATEGORY</p>
         */
        public Builder normalizationCategoryId(String normalizationCategoryId) {
            this.putBodyParameter("NormalizationCategoryId", normalizationCategoryId);
            this.normalizationCategoryId = normalizationCategoryId;
            return this;
        }

        /**
         * <p>The field source filter. Valid values: normalized / native.</p>
         * 
         * <strong>example:</strong>
         * <p>normalized</p>
         */
        public Builder normalizationFieldSource(String normalizationFieldSource) {
            this.putBodyParameter("NormalizationFieldSource", normalizationFieldSource);
            this.normalizationFieldSource = normalizationFieldSource;
            return this;
        }

        /**
         * <p>The normalization schema type. Valid values:</p>
         * <ul>
         * <li>log: log.</li>
         * <li>entity: entity.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>entity</p>
         */
        public Builder normalizationSchemaType(String normalizationSchemaType) {
            this.putBodyParameter("NormalizationSchemaType", normalizationSchemaType);
            this.normalizationSchemaType = normalizationSchemaType;
            return this;
        }

        /**
         * <p>The security domain ID.</p>
         * 
         * <strong>example:</strong>
         * <p>NETWORK_AND_WEB_SECURITY</p>
         */
        public Builder normalizationSecurityDomainId(String normalizationSecurityDomainId) {
            this.putBodyParameter("NormalizationSecurityDomainId", normalizationSecurityDomainId);
            this.normalizationSecurityDomainId = normalizationSecurityDomainId;
            return this;
        }

        /**
         * <p>The region where the threat analysis data management center is located. Specify the management center based on the region of your assets. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: The assets are located in the Chinese mainland.</li>
         * <li>ap-southeast-1: The assets are located outside China.</li>
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
         * <p>The user ID used when an administrator switches to the perspective of another member.</p>
         * 
         * <strong>example:</strong>
         * <p>173326*******</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        @Override
        public ListNormalizationSchemasRequest build() {
            return new ListNormalizationSchemasRequest(this);
        } 

    } 

}
