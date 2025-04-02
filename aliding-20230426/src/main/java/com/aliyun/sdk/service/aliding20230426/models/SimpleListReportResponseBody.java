// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link SimpleListReportResponseBody} extends {@link TeaModel}
 *
 * <p>SimpleListReportResponseBody</p>
 */
public class SimpleListReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("dataList")
    private java.util.List<DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("hasMore")
    private Boolean hasMore;

    @com.aliyun.core.annotation.NameInMap("nextCursor")
    private Long nextCursor;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("size")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataList
     */
    public java.util.List<DataList> getDataList() {
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
        private java.util.List<DataList> dataList; 
        private Boolean hasMore; 
        private Long nextCursor; 
        private String requestId; 
        private Long size; 

        private Builder() {
        } 

        private Builder(SimpleListReportResponseBody model) {
            this.dataList = model.dataList;
            this.hasMore = model.hasMore;
            this.nextCursor = model.nextCursor;
            this.requestId = model.requestId;
            this.size = model.size;
        } 

        /**
         * dataList.
         */
        public Builder dataList(java.util.List<DataList> dataList) {
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
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
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

    /**
     * 
     * {@link SimpleListReportResponseBody} extends {@link TeaModel}
     *
     * <p>SimpleListReportResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("CreatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("DeptName")
        private String deptName;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("ReportId")
        private String reportId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
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

            private Builder() {
            } 

            private Builder(DataList model) {
                this.createTime = model.createTime;
                this.creatorId = model.creatorId;
                this.creatorName = model.creatorName;
                this.deptName = model.deptName;
                this.remark = model.remark;
                this.reportId = model.reportId;
                this.templateName = model.templateName;
            } 

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
