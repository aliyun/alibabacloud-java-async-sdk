// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribePrepayBillTotalRequest} extends {@link RequestModel}
 *
 * <p>DescribePrepayBillTotalRequest</p>
 */
public class DescribePrepayBillTotalRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BillType")
    private String billType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private DescribePrepayBillTotalRequest(Builder builder) {
        super(builder);
        this.billType = builder.billType;
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePrepayBillTotalRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billType
     */
    public String getBillType() {
        return this.billType;
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
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
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribePrepayBillTotalRequest, Builder> {
        private String billType; 
        private Long currentPage; 
        private String endTime; 
        private String lang; 
        private Long pageSize; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribePrepayBillTotalRequest request) {
            super(request);
            this.billType = request.billType;
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The bill type of the user. This parameter is required in practice. An error is returned if this parameter is not specified. Valid values:</p>
         * <ul>
         * <li>elastic_traffic: elastic traffic</li>
         * <li>sdl: sensitive data leak detection traffic</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sdl</p>
         */
        public Builder billType(String billType) {
            this.putQueryParameter("BillType", billType);
            this.billType = billType;
            return this;
        }

        /**
         * <p>The page number in a paged query. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The end time. Specify a UNIX timestamp in seconds.</p>
         * <blockquote>
         * <p>Because billing data is aggregated at the daily granularity, the timestamp must correspond to 00:00:00 of the day in CST (UTC+8). If the timestamp is not aligned to the start of the day, no data may be returned.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1646063922</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The language. Enumerated value.
         * Default value: zh.
         * Valid value: en.</p>
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
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The start time of the query. Specify a UNIX timestamp in seconds.</p>
         * <blockquote>
         * <p>Because billing data is aggregated at the daily granularity, the timestamp must correspond to 00:00:00 of the day in CST (UTC+8). If the timestamp is not aligned to the start of the day, no data may be returned.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1656750960</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribePrepayBillTotalRequest build() {
            return new DescribePrepayBillTotalRequest(this);
        } 

    } 

}
