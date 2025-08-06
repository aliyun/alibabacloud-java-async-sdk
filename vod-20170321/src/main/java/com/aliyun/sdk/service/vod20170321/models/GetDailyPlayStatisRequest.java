// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetDailyPlayStatisRequest} extends {@link RequestModel}
 *
 * <p>GetDailyPlayStatisRequest</p>
 */
public class GetDailyPlayStatisRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mediaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaRegion")
    private String mediaRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startDate;

    private GetDailyPlayStatisRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.endDate = builder.endDate;
        this.mediaId = builder.mediaId;
        this.mediaRegion = builder.mediaRegion;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDailyPlayStatisRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return mediaRegion
     */
    public String getMediaRegion() {
        return this.mediaRegion;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<GetDailyPlayStatisRequest, Builder> {
        private String appId; 
        private String endDate; 
        private String mediaId; 
        private String mediaRegion; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(GetDailyPlayStatisRequest request) {
            super(request);
            this.appId = request.appId;
            this.endDate = request.endDate;
            this.mediaId = request.mediaId;
            this.mediaRegion = request.mediaRegion;
            this.startDate = request.startDate;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * MediaRegion.
         */
        public Builder mediaRegion(String mediaRegion) {
            this.putQueryParameter("MediaRegion", mediaRegion);
            this.mediaRegion = mediaRegion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public GetDailyPlayStatisRequest build() {
            return new GetDailyPlayStatisRequest(this);
        } 

    } 

}
