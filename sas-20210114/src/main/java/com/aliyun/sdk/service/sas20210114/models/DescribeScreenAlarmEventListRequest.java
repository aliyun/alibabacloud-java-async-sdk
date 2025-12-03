// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20210114.models;

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
 * {@link DescribeScreenAlarmEventListRequest} extends {@link RequestModel}
 *
 * <p>DescribeScreenAlarmEventListRequest</p>
 */
public class DescribeScreenAlarmEventListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlarmEventName")
    private String alarmEventName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlarmEventType")
    private String alarmEventType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dealed")
    private String dealed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    @com.aliyun.core.annotation.Validation(required = true)
    private String from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Levels")
    private String levels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeEnd")
    private String timeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeStart")
    private String timeStart;

    private DescribeScreenAlarmEventListRequest(Builder builder) {
        super(builder);
        this.alarmEventName = builder.alarmEventName;
        this.alarmEventType = builder.alarmEventType;
        this.currentPage = builder.currentPage;
        this.dealed = builder.dealed;
        this.from = builder.from;
        this.lang = builder.lang;
        this.levels = builder.levels;
        this.pageSize = builder.pageSize;
        this.remark = builder.remark;
        this.timeEnd = builder.timeEnd;
        this.timeStart = builder.timeStart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScreenAlarmEventListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmEventName
     */
    public String getAlarmEventName() {
        return this.alarmEventName;
    }

    /**
     * @return alarmEventType
     */
    public String getAlarmEventType() {
        return this.alarmEventType;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return dealed
     */
    public String getDealed() {
        return this.dealed;
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return levels
     */
    public String getLevels() {
        return this.levels;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return timeEnd
     */
    public String getTimeEnd() {
        return this.timeEnd;
    }

    /**
     * @return timeStart
     */
    public String getTimeStart() {
        return this.timeStart;
    }

    public static final class Builder extends Request.Builder<DescribeScreenAlarmEventListRequest, Builder> {
        private String alarmEventName; 
        private String alarmEventType; 
        private Integer currentPage; 
        private String dealed; 
        private String from; 
        private String lang; 
        private String levels; 
        private String pageSize; 
        private String remark; 
        private String timeEnd; 
        private String timeStart; 

        private Builder() {
            super();
        } 

        private Builder(DescribeScreenAlarmEventListRequest request) {
            super(request);
            this.alarmEventName = request.alarmEventName;
            this.alarmEventType = request.alarmEventType;
            this.currentPage = request.currentPage;
            this.dealed = request.dealed;
            this.from = request.from;
            this.lang = request.lang;
            this.levels = request.levels;
            this.pageSize = request.pageSize;
            this.remark = request.remark;
            this.timeEnd = request.timeEnd;
            this.timeStart = request.timeStart;
        } 

        /**
         * AlarmEventName.
         */
        public Builder alarmEventName(String alarmEventName) {
            this.putQueryParameter("AlarmEventName", alarmEventName);
            this.alarmEventName = alarmEventName;
            return this;
        }

        /**
         * AlarmEventType.
         */
        public Builder alarmEventType(String alarmEventType) {
            this.putQueryParameter("AlarmEventType", alarmEventType);
            this.alarmEventType = alarmEventType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Dealed.
         */
        public Builder dealed(String dealed) {
            this.putQueryParameter("Dealed", dealed);
            this.dealed = dealed;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * Levels.
         */
        public Builder levels(String levels) {
            this.putQueryParameter("Levels", levels);
            this.levels = levels;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * TimeEnd.
         */
        public Builder timeEnd(String timeEnd) {
            this.putQueryParameter("TimeEnd", timeEnd);
            this.timeEnd = timeEnd;
            return this;
        }

        /**
         * TimeStart.
         */
        public Builder timeStart(String timeStart) {
            this.putQueryParameter("TimeStart", timeStart);
            this.timeStart = timeStart;
            return this;
        }

        @Override
        public DescribeScreenAlarmEventListRequest build() {
            return new DescribeScreenAlarmEventListRequest(this);
        } 

    } 

}
