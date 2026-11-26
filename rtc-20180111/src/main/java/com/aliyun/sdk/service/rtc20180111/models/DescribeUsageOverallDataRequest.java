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
 * {@link DescribeUsageOverallDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeUsageOverallDataRequest</p>
 */
public class DescribeUsageOverallDataRequest extends Request {
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

    private DescribeUsageOverallDataRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.endDate = builder.endDate;
        this.startDate = builder.startDate;
        this.types = builder.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUsageOverallDataRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeUsageOverallDataRequest, Builder> {
        private String appId; 
        private Long endDate; 
        private Long startDate; 
        private String types; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUsageOverallDataRequest request) {
            super(request);
            this.appId = request.appId;
            this.endDate = request.endDate;
            this.startDate = request.startDate;
            this.types = request.types;
        } 

        /**
         * <p>The app ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a2hz****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The end time of the query. The value is a UNIX timestamp in seconds.</p>
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
         * <p>The start time of the query. The value is a UNIX timestamp in seconds.</p>
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
         * <p>The metric types to query. Separate multiple values with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>TOTAL_CALL_DURATION</strong>: total duration.</li>
         * <li><strong>VIDEO_CALL_DURATION</strong>: video communication duration.</li>
         * <li><strong>AUDIO_CALL_DURATION</strong>: audio communication duration.</li>
         * <li><strong>CALL_CHANNEL_COUNT</strong>: communication channel count.</li>
         * <li><strong>HIGHLY_CONCURRENT_CHANNEL_COUNT</strong>: highly concurrent communication channel count.</li>
         * <li><strong>CHANNEL_CONCURRENT_PEAK</strong>: peak concurrent channel count.</li>
         * <li><strong>ONLINE_USER_PEAK</strong>: peak online user count.</li>
         * <li><strong>TOTAL_CALL_USER</strong>: total call users.</li>
         * <li><strong>TOTAL_INOUT_NUM</strong>: total inbound and outbound visits.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ONLINE_USER_PEAK</p>
         */
        public Builder types(String types) {
            this.putQueryParameter("Types", types);
            this.types = types;
            return this;
        }

        @Override
        public DescribeUsageOverallDataRequest build() {
            return new DescribeUsageOverallDataRequest(this);
        } 

    } 

}
