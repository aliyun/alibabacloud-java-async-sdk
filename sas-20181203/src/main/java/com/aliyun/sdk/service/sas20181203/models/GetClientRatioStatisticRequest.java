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
 * {@link GetClientRatioStatisticRequest} extends {@link RequestModel}
 *
 * <p>GetClientRatioStatisticRequest</p>
 */
public class GetClientRatioStatisticRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatisticTypes")
    private java.util.List<String> statisticTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeEnd")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long timeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeStart")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long timeStart;

    private GetClientRatioStatisticRequest(Builder builder) {
        super(builder);
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.statisticTypes = builder.statisticTypes;
        this.timeEnd = builder.timeEnd;
        this.timeStart = builder.timeStart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClientRatioStatisticRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return statisticTypes
     */
    public java.util.List<String> getStatisticTypes() {
        return this.statisticTypes;
    }

    /**
     * @return timeEnd
     */
    public Long getTimeEnd() {
        return this.timeEnd;
    }

    /**
     * @return timeStart
     */
    public Long getTimeStart() {
        return this.timeStart;
    }

    public static final class Builder extends Request.Builder<GetClientRatioStatisticRequest, Builder> {
        private Long resourceDirectoryAccountId; 
        private java.util.List<String> statisticTypes; 
        private Long timeEnd; 
        private Long timeStart; 

        private Builder() {
            super();
        } 

        private Builder(GetClientRatioStatisticRequest request) {
            super(request);
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.statisticTypes = request.statisticTypes;
            this.timeEnd = request.timeEnd;
            this.timeStart = request.timeStart;
        } 

        /**
         * <p>The ID of the primary account of the Resource Directory member account.</p>
         * <blockquote>
         * <p>call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> interface to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>127608589417****</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>An array that consists of the details of a statistical type.</p>
         */
        public Builder statisticTypes(java.util.List<String> statisticTypes) {
            this.putQueryParameter("StatisticTypes", statisticTypes);
            this.statisticTypes = statisticTypes;
            return this;
        }

        /**
         * <p>The timestamp that specifies the end of the time range to collect statistics. Unit: milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1686412799999</p>
         */
        public Builder timeEnd(Long timeEnd) {
            this.putQueryParameter("TimeEnd", timeEnd);
            this.timeEnd = timeEnd;
            return this;
        }

        /**
         * <p>The timestamp that specifies the beginning of the time range to collect statistics. Unit: milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1671382800000</p>
         */
        public Builder timeStart(Long timeStart) {
            this.putQueryParameter("TimeStart", timeStart);
            this.timeStart = timeStart;
            return this;
        }

        @Override
        public GetClientRatioStatisticRequest build() {
            return new GetClientRatioStatisticRequest(this);
        } 

    } 

}
