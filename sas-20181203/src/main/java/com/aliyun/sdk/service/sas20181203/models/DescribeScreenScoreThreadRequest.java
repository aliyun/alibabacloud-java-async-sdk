// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeScreenScoreThreadRequest} extends {@link RequestModel}
 *
 * <p>DescribeScreenScoreThreadRequest</p>
 */
public class DescribeScreenScoreThreadRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private Integer source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private DescribeScreenScoreThreadRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.source = builder.source;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScreenScoreThreadRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return source
     */
    public Integer getSource() {
        return this.source;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeScreenScoreThreadRequest, Builder> {
        private Long endTime; 
        private Integer source; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeScreenScoreThreadRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.source = request.source;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The end of the time range to query. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1668064495000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Source of security score, default is Cloud Security Center if left empty. Enum values: </p>
         * <ul>
         * <li>0:Cloud Security Center. </li>
         * <li>1:Yaochi Console.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder source(Integer source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1651290987000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeScreenScoreThreadRequest build() {
            return new DescribeScreenScoreThreadRequest(this);
        } 

    } 

}
