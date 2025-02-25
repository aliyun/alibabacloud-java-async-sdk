// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ListPublicMediaBasicInfosRequest} extends {@link RequestModel}
 *
 * <p>ListPublicMediaBasicInfosRequest</p>
 */
public class ListPublicMediaBasicInfosRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    private String businessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeFileBasicInfo")
    private Boolean includeFileBasicInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaTagId")
    private String mediaTagId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647, minimum = 1)
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    private ListPublicMediaBasicInfosRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.businessType = builder.businessType;
        this.includeFileBasicInfo = builder.includeFileBasicInfo;
        this.maxResults = builder.maxResults;
        this.mediaTagId = builder.mediaTagId;
        this.nextToken = builder.nextToken;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPublicMediaBasicInfosRequest create() {
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
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return includeFileBasicInfo
     */
    public Boolean getIncludeFileBasicInfo() {
        return this.includeFileBasicInfo;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return mediaTagId
     */
    public String getMediaTagId() {
        return this.mediaTagId;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListPublicMediaBasicInfosRequest, Builder> {
        private String regionId; 
        private String businessType; 
        private Boolean includeFileBasicInfo; 
        private Integer maxResults; 
        private String mediaTagId; 
        private String nextToken; 
        private Integer pageNo; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListPublicMediaBasicInfosRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.businessType = request.businessType;
            this.includeFileBasicInfo = request.includeFileBasicInfo;
            this.maxResults = request.maxResults;
            this.mediaTagId = request.mediaTagId;
            this.nextToken = request.nextToken;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
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
         * <p>The business type of the media asset. Valid values:</p>
         * <ul>
         * <li>sticker</li>
         * <li>bgm</li>
         * <li>bgi</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sticker</p>
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * <p>Specifies whether to return the basic information of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includeFileBasicInfo(Boolean includeFileBasicInfo) {
            this.putQueryParameter("IncludeFileBasicInfo", includeFileBasicInfo);
            this.includeFileBasicInfo = includeFileBasicInfo;
            return this;
        }

        /**
         * <p>The maximum number of entries to return.</p>
         * <p>Maximum value: 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The media tag. All media assets that contain the specified media tag are returned. Valid values:</p>
         * <ul>
         * <li><p>Sticker tags:</p>
         * <ul>
         * <li>sticker-atmosphere</li>
         * <li>sticker-bubble</li>
         * <li>sticker-cute</li>
         * <li>sticker-daily</li>
         * <li>sticker-expression</li>
         * <li>sticker-gif</li>
         * </ul>
         * </li>
         * <li><p>Background music (BGM) tags:</p>
         * <ul>
         * <li>bgm-romantic</li>
         * <li>bgm-cuisine</li>
         * <li>bgm-chinese-style</li>
         * <li>bgm-upbeat</li>
         * <li>bgm-dynamic</li>
         * <li>bgm-relaxing</li>
         * <li>bgm-quirky</li>
         * <li>bgm-beauty</li>
         * </ul>
         * </li>
         * <li><p>Background image (BGI) tags:</p>
         * <ul>
         * <li>bgi-grad</li>
         * <li>bgi-solid</li>
         * <li>bgi-pic</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ticker-atmosphere</p>
         */
        public Builder mediaTagId(String mediaTagId) {
            this.putQueryParameter("MediaTagId", mediaTagId);
            this.mediaTagId = mediaTagId;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
         * 
         * <strong>example:</strong>
         * <p>pSa1SQ0wCe5pzVrQ6mWZEw==</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number. Default value: 1</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListPublicMediaBasicInfosRequest build() {
            return new ListPublicMediaBasicInfosRequest(this);
        } 

    } 

}
