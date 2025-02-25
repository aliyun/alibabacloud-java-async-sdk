// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The end of the time range to query. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-10T02:43:34Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The access language. Valid values:</p>
         * <ul>
         * <li><strong>en-US</strong> (default): English.</li>
         * <li><strong>zh-CN</strong>: Chinese.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>en_US</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-19T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The ID of the trace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>800e749616838513398137319e</p>
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
