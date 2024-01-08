// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PictureSearchPictureRequest} extends {@link RequestModel}
 *
 * <p>PictureSearchPictureRequest</p>
 */
public class PictureSearchPictureRequest extends Request {
    @Query
    @NameInMap("AppInstanceId")
    @Validation(required = true)
    private String appInstanceId;

    @Query
    @NameInMap("ContainPicUrl")
    @Validation(required = true)
    private Boolean containPicUrl;

    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true, minimum = 1)
    private Integer currentPage;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 20)
    private Integer pageSize;

    @Query
    @NameInMap("PictureSearchType")
    @Validation(maximum = 10)
    private Integer pictureSearchType;

    @Query
    @NameInMap("SearchPicUrl")
    @Validation(required = true)
    private String searchPicUrl;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    @Query
    @NameInMap("Threshold")
    @Validation(required = true)
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
         * AppInstanceId.
         */
        public Builder appInstanceId(String appInstanceId) {
            this.putQueryParameter("AppInstanceId", appInstanceId);
            this.appInstanceId = appInstanceId;
            return this;
        }

        /**
         * ContainPicUrl.
         */
        public Builder containPicUrl(Boolean containPicUrl) {
            this.putQueryParameter("ContainPicUrl", containPicUrl);
            this.containPicUrl = containPicUrl;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PictureSearchType.
         */
        public Builder pictureSearchType(Integer pictureSearchType) {
            this.putQueryParameter("PictureSearchType", pictureSearchType);
            this.pictureSearchType = pictureSearchType;
            return this;
        }

        /**
         * SearchPicUrl.
         */
        public Builder searchPicUrl(String searchPicUrl) {
            this.putQueryParameter("SearchPicUrl", searchPicUrl);
            this.searchPicUrl = searchPicUrl;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Threshold.
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
