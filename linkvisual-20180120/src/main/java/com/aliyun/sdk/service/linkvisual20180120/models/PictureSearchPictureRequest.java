// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link PictureSearchPictureRequest} extends {@link RequestModel}
 *
 * <p>PictureSearchPictureRequest</p>
 */
public class PictureSearchPictureRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainPicUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean containPicUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 20)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PictureSearchType")
    @com.aliyun.core.annotation.Validation(maximum = 10)
    private Integer pictureSearchType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchPicUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String searchPicUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Threshold")
    @com.aliyun.core.annotation.Validation(required = true)
    private Float threshold;

    private PictureSearchPictureRequest(Builder builder) {
        super(builder);
        this.appInstanceId = builder.appInstanceId;
        this.containPicUrl = builder.containPicUrl;
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.pageSize = builder.pageSize;
        this.pictureSearchType = builder.pictureSearchType;
        this.searchPicUrl = builder.searchPicUrl;
        this.startTime = builder.startTime;
        this.threshold = builder.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PictureSearchPictureRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstanceId
     */
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    /**
     * @return containPicUrl
     */
    public Boolean getContainPicUrl() {
        return this.containPicUrl;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pictureSearchType
     */
    public Integer getPictureSearchType() {
        return this.pictureSearchType;
    }

    /**
     * @return searchPicUrl
     */
    public String getSearchPicUrl() {
        return this.searchPicUrl;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return threshold
     */
    public Float getThreshold() {
        return this.threshold;
    }

    public static final class Builder extends Request.Builder<PictureSearchPictureRequest, Builder> {
        private String appInstanceId; 
        private Boolean containPicUrl; 
        private Integer currentPage; 
        private Long endTime; 
        private Integer pageSize; 
        private Integer pictureSearchType; 
        private String searchPicUrl; 
        private Long startTime; 
        private Float threshold; 

        private Builder() {
            super();
        } 

        private Builder(PictureSearchPictureRequest request) {
            super(request);
            this.appInstanceId = request.appInstanceId;
            this.containPicUrl = request.containPicUrl;
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.pageSize = request.pageSize;
            this.pictureSearchType = request.pictureSearchType;
            this.searchPicUrl = request.searchPicUrl;
            this.startTime = request.startTime;
            this.threshold = request.threshold;
        } 

        /**
         * <p>Instance ID of the image search application instance. You can call the <a href="https://help.aliyun.com/document_detail/206608.html">QueryPictureSearchApps</a> operation to query instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5a502d3fbab8410e8fd4be9037c7****</p>
         */
        public Builder appInstanceId(String appInstanceId) {
            this.putQueryParameter("AppInstanceId", appInstanceId);
            this.appInstanceId = appInstanceId;
            return this;
        }

        /**
         * <p>Specifies whether the response includes the image URL.</p>
         * <blockquote>
         * <p>Currently, the response is returned regardless of whether this parameter is set to true or false.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder containPicUrl(Boolean containPicUrl) {
            this.putQueryParameter("ContainPicUrl", containPicUrl);
            this.containPicUrl = containPicUrl;
            return this;
        }

        /**
         * <p>The page number of the page to return. Pages start from page 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The end time of the search range. The time is a 13-digit timestamp in milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1614850651299</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Maximum value: 10.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The search type. Valid values:</p>
         * <ul>
         * <li><strong>1</strong> (default): face</li>
         * <li><strong>0</strong>: human body</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pictureSearchType(Integer pictureSearchType) {
            this.putQueryParameter("PictureSearchType", pictureSearchType);
            this.pictureSearchType = pictureSearchType;
            return this;
        }

        /**
         * <p>The URL of the image to search for.</p>
         * <p>This parameter is required.</p>
         */
        public Builder searchPicUrl(String searchPicUrl) {
            this.putQueryParameter("SearchPicUrl", searchPicUrl);
            this.searchPicUrl = searchPicUrl;
            return this;
        }

        /**
         * <p>The start time of the search range. The time is a 13-digit timestamp in milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1614297000000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The search threshold. Valid values: 0 to 1.</p>
         * <blockquote>
         * <p>Set the search threshold to a value greater than or equal to 0.3 to ensure a match with the detected object.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        public Builder threshold(Float threshold) {
            this.putQueryParameter("Threshold", threshold);
            this.threshold = threshold;
            return this;
        }

        @Override
        public PictureSearchPictureRequest build() {
            return new PictureSearchPictureRequest(this);
        } 

    } 

}
