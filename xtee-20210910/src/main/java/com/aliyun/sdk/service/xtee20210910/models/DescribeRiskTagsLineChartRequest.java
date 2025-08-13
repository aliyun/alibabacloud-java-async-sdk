// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link DescribeRiskTagsLineChartRequest} extends {@link RequestModel}
 *
 * <p>DescribeRiskTagsLineChartRequest</p>
 */
public class DescribeRiskTagsLineChartRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long beginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventCodes")
    private String eventCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegId")
    private String regId;

    private DescribeRiskTagsLineChartRequest(Builder builder) {
        super(builder);
        this.beginTime = builder.beginTime;
        this.endTime = builder.endTime;
        this.eventCodes = builder.eventCodes;
        this.lang = builder.lang;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRiskTagsLineChartRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return eventCodes
     */
    public String getEventCodes() {
        return this.eventCodes;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<DescribeRiskTagsLineChartRequest, Builder> {
        private Long beginTime; 
        private Long endTime; 
        private String eventCodes; 
        private String lang; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRiskTagsLineChartRequest request) {
            super(request);
            this.beginTime = request.beginTime;
            this.endTime = request.endTime;
            this.eventCodes = request.eventCodes;
            this.lang = request.lang;
            this.regId = request.regId;
        } 

        /**
         * <p>Start time of the query, in milliseconds (ms).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1729563800605</p>
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * <p>End time, accurate to milliseconds (ms).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1729563800605</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Event code</p>
         * 
         * <strong>example:</strong>
         * <p>de_afghcf6411</p>
         */
        public Builder eventCodes(String eventCodes) {
            this.putQueryParameter("EventCodes", eventCodes);
            this.eventCodes = eventCodes;
            return this;
        }

        /**
         * <p>Sets the language type for the request and response messages. Default value is <strong>zh</strong>. Values: </p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Region code</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("RegId", regId);
            this.regId = regId;
            return this;
        }

        @Override
        public DescribeRiskTagsLineChartRequest build() {
            return new DescribeRiskTagsLineChartRequest(this);
        } 

    } 

}
