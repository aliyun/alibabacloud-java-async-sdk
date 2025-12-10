// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202.models;

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
 * {@link GetAlgorithmDefsRequest} extends {@link RequestModel}
 *
 * <p>GetAlgorithmDefsRequest</p>
 */
public class GetAlgorithmDefsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LatestTimestamp")
    private String latestTimestamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RangeEnd")
    private Integer rangeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RangeStart")
    private Integer rangeStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timestamp")
    private String timestamp;

    private GetAlgorithmDefsRequest(Builder builder) {
        super(builder);
        this.latestTimestamp = builder.latestTimestamp;
        this.rangeEnd = builder.rangeEnd;
        this.rangeStart = builder.rangeStart;
        this.timestamp = builder.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlgorithmDefsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return latestTimestamp
     */
    public String getLatestTimestamp() {
        return this.latestTimestamp;
    }

    /**
     * @return rangeEnd
     */
    public Integer getRangeEnd() {
        return this.rangeEnd;
    }

    /**
     * @return rangeStart
     */
    public Integer getRangeStart() {
        return this.rangeStart;
    }

    /**
     * @return timestamp
     */
    public String getTimestamp() {
        return this.timestamp;
    }

    public static final class Builder extends Request.Builder<GetAlgorithmDefsRequest, Builder> {
        private String latestTimestamp; 
        private Integer rangeEnd; 
        private Integer rangeStart; 
        private String timestamp; 

        private Builder() {
            super();
        } 

        private Builder(GetAlgorithmDefsRequest request) {
            super(request);
            this.latestTimestamp = request.latestTimestamp;
            this.rangeEnd = request.rangeEnd;
            this.rangeStart = request.rangeStart;
            this.timestamp = request.timestamp;
        } 

        /**
         * LatestTimestamp.
         */
        public Builder latestTimestamp(String latestTimestamp) {
            this.putQueryParameter("LatestTimestamp", latestTimestamp);
            this.latestTimestamp = latestTimestamp;
            return this;
        }

        /**
         * RangeEnd.
         */
        public Builder rangeEnd(Integer rangeEnd) {
            this.putQueryParameter("RangeEnd", rangeEnd);
            this.rangeEnd = rangeEnd;
            return this;
        }

        /**
         * RangeStart.
         */
        public Builder rangeStart(Integer rangeStart) {
            this.putQueryParameter("RangeStart", rangeStart);
            this.rangeStart = rangeStart;
            return this;
        }

        /**
         * Timestamp.
         */
        public Builder timestamp(String timestamp) {
            this.putQueryParameter("Timestamp", timestamp);
            this.timestamp = timestamp;
            return this;
        }

        @Override
        public GetAlgorithmDefsRequest build() {
            return new GetAlgorithmDefsRequest(this);
        } 

    } 

}
