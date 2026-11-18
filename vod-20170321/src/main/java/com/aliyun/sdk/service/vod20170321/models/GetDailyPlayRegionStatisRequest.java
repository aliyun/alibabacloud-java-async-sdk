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
 * {@link GetDailyPlayRegionStatisRequest} extends {@link RequestModel}
 *
 * <p>GetDailyPlayRegionStatisRequest</p>
 */
public class GetDailyPlayRegionStatisRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Date")
    @com.aliyun.core.annotation.Validation(required = true)
    private String date;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaRegion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mediaRegion;

    private GetDailyPlayRegionStatisRequest(Builder builder) {
        super(builder);
        this.date = builder.date;
        this.mediaRegion = builder.mediaRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDailyPlayRegionStatisRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return date
     */
    public String getDate() {
        return this.date;
    }

    /**
     * @return mediaRegion
     */
    public String getMediaRegion() {
        return this.mediaRegion;
    }

    public static final class Builder extends Request.Builder<GetDailyPlayRegionStatisRequest, Builder> {
        private String date; 
        private String mediaRegion; 

        private Builder() {
            super();
        } 

        private Builder(GetDailyPlayRegionStatisRequest request) {
            super(request);
            this.date = request.date;
            this.mediaRegion = request.mediaRegion;
        } 

        /**
         * <p>The playback date, in days. Format: yyyy-MM-dd.</p>
         * <blockquote>
         * <ul>
         * <li>Only daily queries are supported.</li>
         * <li>Only data within the past year can be queried.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-20</p>
         */
        public Builder date(String date) {
            this.putQueryParameter("Date", date);
            this.date = date;
            return this;
        }

        /**
         * <p>The media asset region ID. Specify this parameter to perform a filtered query for the playback data of all audio and video files in a specified service region. Valid values:</p>
         * <ul>
         * <li>cn-beijing: China (Beijing)</li>
         * <li>cn-shanghai: China (Shanghai)</li>
         * <li>cn-shenzhen: China (Shenzhen)</li>
         * <li>ap-northeast-1: Japan (Tokyo)</li>
         * <li>ap-southeast-1: Singapore</li>
         * <li>ap-southeast-5: Indonesia (Jakarta)</li>
         * <li>eu-central-1: Germany (Frankfurt)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder mediaRegion(String mediaRegion) {
            this.putQueryParameter("MediaRegion", mediaRegion);
            this.mediaRegion = mediaRegion;
            return this;
        }

        @Override
        public GetDailyPlayRegionStatisRequest build() {
            return new GetDailyPlayRegionStatisRequest(this);
        } 

    } 

}
