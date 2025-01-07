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
 * {@link DescribeChartDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeChartDataRequest</p>
 */
public class DescribeChartDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CharId")
    private String charId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChartId")
    private String chartId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportId")
    private Long reportId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeEnd")
    private Long timeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeStart")
    private Long timeStart;

    private DescribeChartDataRequest(Builder builder) {
        super(builder);
        this.charId = builder.charId;
        this.chartId = builder.chartId;
        this.lang = builder.lang;
        this.reportId = builder.reportId;
        this.timeEnd = builder.timeEnd;
        this.timeStart = builder.timeStart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeChartDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return charId
     */
    public String getCharId() {
        return this.charId;
    }

    /**
     * @return chartId
     */
    public String getChartId() {
        return this.chartId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return reportId
     */
    public Long getReportId() {
        return this.reportId;
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

    public static final class Builder extends Request.Builder<DescribeChartDataRequest, Builder> {
        private String charId; 
        private String chartId; 
        private String lang; 
        private Long reportId; 
        private Long timeEnd; 
        private Long timeStart; 

        private Builder() {
            super();
        } 

        private Builder(DescribeChartDataRequest request) {
            super(request);
            this.charId = request.charId;
            this.chartId = request.chartId;
            this.lang = request.lang;
            this.reportId = request.reportId;
            this.timeEnd = request.timeEnd;
            this.timeStart = request.timeStart;
        } 

        /**
         * <p>The ID of the chart.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeChartList~~">DescribeChartList</a> operation to query the ID. This parameter is required if the report version is 1.0.0.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CID_ASSET_RISK_TREND</p>
         */
        public Builder charId(String charId) {
            this.putQueryParameter("CharId", charId);
            this.charId = charId;
            return this;
        }

        /**
         * <p>The ID of the chart.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeChartList~~">DescribeChartList</a> operation to query the ID. This parameter is required if the report version is 2.0.0.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CID_VUL_SUMMARY</p>
         */
        public Builder chartId(String chartId) {
            this.putQueryParameter("ChartId", chartId);
            this.chartId = chartId;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
         * <p>The ID of the security report.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeCustomizeReportList~~">DescribeCustomizeReportList</a> operation to query the ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>721734</p>
         */
        public Builder reportId(Long reportId) {
            this.putQueryParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        /**
         * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1683862286000</p>
         */
        public Builder timeEnd(Long timeEnd) {
            this.putQueryParameter("TimeEnd", timeEnd);
            this.timeEnd = timeEnd;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1683603086000</p>
         */
        public Builder timeStart(Long timeStart) {
            this.putQueryParameter("TimeStart", timeStart);
            this.timeStart = timeStart;
            return this;
        }

        @Override
        public DescribeChartDataRequest build() {
            return new DescribeChartDataRequest(this);
        } 

    } 

}
