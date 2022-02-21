// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePictureSearchJobRequest} extends {@link RequestModel}
 *
 * <p>CreatePictureSearchJobRequest</p>
 */
public class CreatePictureSearchJobRequest extends Request {
    @Query
    @NameInMap("AppInstanceId")
    @Validation(required = true)
    private String appInstanceId;

    @Query
    @NameInMap("BodyThreshold")
    @Validation(maximum = 1)
    private Float bodyThreshold;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true, maximum = 9999999999999D)
    private Long endTime;

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
    @Validation(required = true, maximum = 9999999999999D)
    private Long startTime;

    @Query
    @NameInMap("Threshold")
    @Validation(required = true)
    private Float threshold;

    private CreatePictureSearchJobRequest(Builder builder) {
        super(builder);
        this.appInstanceId = builder.appInstanceId;
        this.bodyThreshold = builder.bodyThreshold;
        this.endTime = builder.endTime;
        this.pictureSearchType = builder.pictureSearchType;
        this.searchPicUrl = builder.searchPicUrl;
        this.startTime = builder.startTime;
        this.threshold = builder.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePictureSearchJobRequest create() {
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
     * @return bodyThreshold
     */
    public Float getBodyThreshold() {
        return this.bodyThreshold;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
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

    public static final class Builder extends Request.Builder<CreatePictureSearchJobRequest, Builder> {
        private String appInstanceId; 
        private Float bodyThreshold; 
        private Long endTime; 
        private Integer pictureSearchType; 
        private String searchPicUrl; 
        private Long startTime; 
        private Float threshold; 

        private Builder() {
            super();
        } 

        private Builder(CreatePictureSearchJobRequest response) {
            super(response);
            this.appInstanceId = response.appInstanceId;
            this.bodyThreshold = response.bodyThreshold;
            this.endTime = response.endTime;
            this.pictureSearchType = response.pictureSearchType;
            this.searchPicUrl = response.searchPicUrl;
            this.startTime = response.startTime;
            this.threshold = response.threshold;
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
         * BodyThreshold.
         */
        public Builder bodyThreshold(Float bodyThreshold) {
            this.putQueryParameter("BodyThreshold", bodyThreshold);
            this.bodyThreshold = bodyThreshold;
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
        public CreatePictureSearchJobRequest build() {
            return new CreatePictureSearchJobRequest(this);
        } 

    } 

}
