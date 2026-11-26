// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link DescribeQualityOverallDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeQualityOverallDataRequest</p>
 */
public class DescribeQualityOverallDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Types")
    @com.aliyun.core.annotation.Validation(required = true)
    private String types;

    private DescribeQualityOverallDataRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.endDate = builder.endDate;
        this.startDate = builder.startDate;
        this.types = builder.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeQualityOverallDataRequest create() {
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
    public Long getEndDate() {
        return this.endDate;
    }

    /**
     * @return startDate
     */
    public Long getStartDate() {
        return this.startDate;
    }

    /**
     * @return types
     */
    public String getTypes() {
        return this.types;
    }

    public static final class Builder extends Request.Builder<DescribeQualityOverallDataRequest, Builder> {
        private String appId; 
        private Long endDate; 
        private Long startDate; 
        private String types; 

        private Builder() {
            super();
        } 

        private Builder(DescribeQualityOverallDataRequest request) {
            super(request);
            this.appId = request.appId;
            this.endDate = request.endDate;
            this.startDate = request.startDate;
            this.types = request.types;
        } 

        /**
         * <p>APP ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0rbd****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The End Time of the query, represented as a UNIX timestamp in seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1615910399</p>
         */
        public Builder endDate(Long endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The Start Time of the query, represented as a UNIX timestamp in seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1615824000</p>
         */
        public Builder startDate(Long startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * <p>The Metric Types to query, separated by commas (,). Valid values:</p>
         * <ul>
         * <li><strong>JOIN_CHANNEL_SUC_RATE</strong>: Channel Join Success Rate.</li>
         * <li><strong>JOIN_CHANNEL_SUC_FIVE_SEC_RATE</strong>: Five-second Channel Join Success Rate.</li>
         * <li><strong>VIDEO_FIRST_PIC_DUR</strong>: Time to First Video Frame.</li>
         * <li><strong>AUDIO_STUCK_RATE</strong>: Audio Lag Rate.</li>
         * <li><strong>VIDEO_STUCK_RATE</strong>: Video Lag Rate.</li>
         * <li><strong>AUDIO_DELAY</strong>: Audio Delay.</li>
         * <li><strong>VIDEO_DELAY</strong>: Video Delay.</li>
         * <li><strong>AUDIO_HIGH_QUALITY_TRANSMISSION_RATE</strong>: Audio High-quality Transmission Rate.</li>
         * <li><strong>VIDEO_HIGH_QUALITY_TRANSMISSION_RATE</strong>: Video High-quality Transmission Rate.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>JOIN_CHANNEL_SUC_RATE</p>
         */
        public Builder types(String types) {
            this.putQueryParameter("Types", types);
            this.types = types;
            return this;
        }

        @Override
        public DescribeQualityOverallDataRequest build() {
            return new DescribeQualityOverallDataRequest(this);
        } 

    } 

}
