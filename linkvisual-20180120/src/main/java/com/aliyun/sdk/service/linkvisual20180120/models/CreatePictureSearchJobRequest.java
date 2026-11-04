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
 * {@link CreatePictureSearchJobRequest} extends {@link RequestModel}
 *
 * <p>CreatePictureSearchJobRequest</p>
 */
public class CreatePictureSearchJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BodyThreshold")
    @com.aliyun.core.annotation.Validation(maximum = 1)
    private Float bodyThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 9999999999999D)
    private Long endTime;

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
    @com.aliyun.core.annotation.Validation(required = true, maximum = 9999999999999D)
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Threshold")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(CreatePictureSearchJobRequest request) {
            super(request);
            this.appInstanceId = request.appInstanceId;
            this.bodyThreshold = request.bodyThreshold;
            this.endTime = request.endTime;
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
         * <p>3e429560124b44b685095df81a27****</p>
         */
        public Builder appInstanceId(String appInstanceId) {
            this.putQueryParameter("AppInstanceId", appInstanceId);
            this.appInstanceId = appInstanceId;
            return this;
        }

        /**
         * <p>The threshold for human body search. Valid values: 0 to 1.</p>
         * <p>To ensure the accuracy of search results, set this parameter to a value greater than or equal to 0.8. If this parameter is not specified, the value of the Threshold parameter is used.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        public Builder bodyThreshold(Float bodyThreshold) {
            this.putQueryParameter("BodyThreshold", bodyThreshold);
            this.bodyThreshold = bodyThreshold;
            return this;
        }

        /**
         * <p>The end time of the search range. The time is a 13-digit timestamp in milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1614327915000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The search type. Valid values:</p>
         * <ul>
         * <li>1: face</li>
         * <li>0: human body</li>
         * </ul>
         * <p>Default value: 1.</p>
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
         * <p>The URL of the image to be searched.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxx.xxx/1.jpg">http://xxx.xxx/1.jpg</a></p>
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
         * <p>1614227915000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The threshold for face search. Valid values: 0 to 1.</p>
         * <p>To ensure the accuracy of search results, set this parameter to a value between 0.3 and 0.6.</p>
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
        public CreatePictureSearchJobRequest build() {
            return new CreatePictureSearchJobRequest(this);
        } 

    } 

}
