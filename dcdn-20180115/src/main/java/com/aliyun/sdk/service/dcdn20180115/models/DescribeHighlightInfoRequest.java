// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHighlightInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeHighlightInfoRequest</p>
 */
public class DescribeHighlightInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    @com.aliyun.core.annotation.Validation(required = true)
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TraceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String traceId;

    private DescribeHighlightInfoRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.lang = builder.lang;
        this.startTime = builder.startTime;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHighlightInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder extends Request.Builder<DescribeHighlightInfoRequest, Builder> {
        private String endTime; 
        private String lang; 
        private String startTime; 
        private String traceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHighlightInfoRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.lang = request.lang;
            this.startTime = request.startTime;
            this.traceId = request.traceId;
        } 

        /**
         * The end of the time range to query. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The access language. Valid values:
         * <p>
         * 
         * *   **en-US** (default): English.
         * *   **zh-CN**: Chinese.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The ID of the trace.
         */
        public Builder traceId(String traceId) {
            this.putQueryParameter("TraceId", traceId);
            this.traceId = traceId;
            return this;
        }

        @Override
        public DescribeHighlightInfoRequest build() {
            return new DescribeHighlightInfoRequest(this);
        } 

    } 

}
