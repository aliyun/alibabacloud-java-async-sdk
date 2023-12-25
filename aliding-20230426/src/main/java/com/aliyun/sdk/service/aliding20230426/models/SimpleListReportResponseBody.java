// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SimpleListReportResponseBody} extends {@link TeaModel}
 *
 * <p>SimpleListReportResponseBody</p>
 */
public class SimpleListReportResponseBody extends TeaModel {
    @NameInMap("dataList")
    private java.util.List < DataList> dataList;

    @NameInMap("hasMore")
    private Boolean hasMore;

    @NameInMap("nextCursor")
    private Long nextCursor;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("size")
    private Long size;

    private SimpleListReportResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.hasMore = builder.hasMore;
        this.nextCursor = builder.nextCursor;
        this.requestId = builder.requestId;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SimpleListReportResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataList
     */
    public java.util.List < DataList> getDataList() {
        return this.dataList;
    }

    /**
     * @return hasMore
     */
    public Boolean getHasMore() {
        return this.hasMore;
    }

    /**
     * @return nextCursor
     */
    public Long getNextCursor() {
        return this.nextCursor;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    public static final class Builder {
        private java.util.List < DataList> dataList; 
        private Boolean hasMore; 
        private Long nextCursor; 
        private String requestId; 
        private Long size; 

        /**
         * dataList.
         */
        public Builder dataList(java.util.List < DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * hasMore.
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * nextCursor.
         */
        public Builder nextCursor(Long nextCursor) {
            this.nextCursor = nextCursor;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Long size) {
            this.size = size;
            return this;
        }

        public SimpleListReportResponseBody build() {
            return new SimpleListReportResponseBody(this);
        } 

    } 

    public static class DataList extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("CreatorId")
        private String creatorId;

        @NameInMap("CreatorName")
        private String creatorName;

        @NameInMap("DeptName")
        private String deptName;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("ReportId")
        private String reportId;

        @NameInMap("TemplateName")
        private String templateName;

        private DataList(Builder builder) {
            this.createTime = builder.createTime;
            this.creatorId = builder.creatorId;
            this.creatorName = builder.creatorName;
            this.deptName = builder.deptName;
            this.remark = builder.remark;
            this.reportId = builder.reportId;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return deptName
         */
        public String getDeptName() {
            return this.deptName;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return reportId
         */
        public String getReportId() {
            return this.reportId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private Long createTime; 
            private String creatorId; 
            private String creatorName; 
            private String deptName; 
            private String remark; 
            private String reportId; 
            private String templateName; 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreatorId.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * CreatorName.
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * DeptName.
             */
            public Builder deptName(String deptName) {
                this.deptName = deptName;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * ReportId.
             */
            public Builder reportId(String reportId) {
                this.reportId = reportId;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}
