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
 * {@link GetDataTrendRequest} extends {@link RequestModel}
 *
 * <p>GetDataTrendRequest</p>
 */
public class GetDataTrendRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizTypes")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTimestamp")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTimestamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1000)
    private Integer interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTimestamp")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTimestamp;

    private GetDataTrendRequest(Builder builder) {
        super(builder);
        this.bizTypes = builder.bizTypes;
        this.endTimestamp = builder.endTimestamp;
        this.interval = builder.interval;
        this.startTimestamp = builder.startTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataTrendRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizTypes
     */
    public String getBizTypes() {
        return this.bizTypes;
    }

    /**
     * @return endTimestamp
     */
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    /**
     * @return interval
     */
    public Integer getInterval() {
        return this.interval;
    }

    /**
     * @return startTimestamp
     */
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    public static final class Builder extends Request.Builder<GetDataTrendRequest, Builder> {
        private String bizTypes; 
        private Long endTimestamp; 
        private Integer interval; 
        private Long startTimestamp; 

        private Builder() {
            super();
        } 

        private Builder(GetDataTrendRequest request) {
            super(request);
            this.bizTypes = request.bizTypes;
            this.endTimestamp = request.endTimestamp;
            this.interval = request.interval;
            this.startTimestamp = request.startTimestamp;
        } 

        /**
         * <p>The type of the security data that you want to query. Valid values:</p>
         * <ul>
         * <li><strong>HC_NEW</strong>: the number of new baseline risks.</li>
         * <li><strong>HC_OPERATE</strong>: the number of handled baseline risks.</li>
         * <li><strong>VUL_NEW</strong>: the number of new vulnerabilities.</li>
         * <li><strong>VUL_OPERATE</strong>: the number of handled vulnerabilities.</li>
         * <li><strong>SUSP_NEW</strong>: the number of new alerts.</li>
         * <li><strong>SUSP_OPERATE</strong>: the number of handled alerts.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HC_NEW,HC_OPERATE</p>
         */
        public Builder bizTypes(String bizTypes) {
            this.putQueryParameter("BizTypes", bizTypes);
            this.bizTypes = bizTypes;
            return this;
        }

        /**
         * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1721923200000</p>
         */
        public Builder endTimestamp(Long endTimestamp) {
            this.putQueryParameter("EndTimestamp", endTimestamp);
            this.endTimestamp = endTimestamp;
            return this;
        }

        /**
         * <p>The interval of the data that you want to query. Unit: milliseconds.</p>
         * <blockquote>
         * <p> The minimum value is 1000.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>86400000</p>
         */
        public Builder interval(Integer interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1687334501000</p>
         */
        public Builder startTimestamp(Long startTimestamp) {
            this.putQueryParameter("StartTimestamp", startTimestamp);
            this.startTimestamp = startTimestamp;
            return this;
        }

        @Override
        public GetDataTrendRequest build() {
            return new GetDataTrendRequest(this);
        } 

    } 

}
