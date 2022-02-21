// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlarmEventListRequest} extends {@link RequestModel}
 *
 * <p>DescribeAlarmEventListRequest</p>
 */
public class DescribeAlarmEventListRequest extends Request {
    @Query
    @NameInMap("AlarmEventName")
    private String alarmEventName;

    @Query
    @NameInMap("AlarmEventType")
    private String alarmEventType;

    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true)
    private Integer currentPage;

    @Query
    @NameInMap("Dealed")
    private String dealed;

    @Query
    @NameInMap("From")
    @Validation(required = true)
    private String from;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Levels")
    private String levels;

    @Query
    @NameInMap("OperateErrorCodeList")
    private java.util.List < String > operateErrorCodeList;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private String pageSize;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private DescribeAlarmEventListRequest(Builder builder) {
        super(builder);
        this.alarmEventName = builder.alarmEventName;
        this.alarmEventType = builder.alarmEventType;
        this.currentPage = builder.currentPage;
        this.dealed = builder.dealed;
        this.from = builder.from;
        this.groupId = builder.groupId;
        this.lang = builder.lang;
        this.levels = builder.levels;
        this.operateErrorCodeList = builder.operateErrorCodeList;
        this.pageSize = builder.pageSize;
        this.remark = builder.remark;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlarmEventListRequest create() {
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
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
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
     * @return operateErrorCodeList
     */
    public java.util.List < String > getOperateErrorCodeList() {
        return this.operateErrorCodeList;
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
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeAlarmEventListRequest, Builder> {
        private String alarmEventName; 
        private String alarmEventType; 
        private Integer currentPage; 
        private String dealed; 
        private String from; 
        private String groupId; 
        private String lang; 
        private String levels; 
        private java.util.List < String > operateErrorCodeList; 
        private String pageSize; 
        private String remark; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAlarmEventListRequest response) {
            super(response);
            this.alarmEventName = response.alarmEventName;
            this.alarmEventType = response.alarmEventType;
            this.currentPage = response.currentPage;
            this.dealed = response.dealed;
            this.from = response.from;
            this.groupId = response.groupId;
            this.lang = response.lang;
            this.levels = response.levels;
            this.operateErrorCodeList = response.operateErrorCodeList;
            this.pageSize = response.pageSize;
            this.remark = response.remark;
            this.sourceIp = response.sourceIp;
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
         * CurrentPage.
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
         * From.
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
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
         * OperateErrorCodeList.
         */
        public Builder operateErrorCodeList(java.util.List < String > operateErrorCodeList) {
            this.putQueryParameter("OperateErrorCodeList", operateErrorCodeList);
            this.operateErrorCodeList = operateErrorCodeList;
            return this;
        }

        /**
         * PageSize.
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
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeAlarmEventListRequest build() {
            return new DescribeAlarmEventListRequest(this);
        } 

    } 

}
