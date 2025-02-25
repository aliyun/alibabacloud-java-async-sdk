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
 * {@link ListReportResponseBody} extends {@link TeaModel}
 *
 * <p>ListReportResponseBody</p>
 */
public class ListReportResponseBody extends TeaModel {
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

    private ListReportResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.hasMore = builder.hasMore;
        this.nextCursor = builder.nextCursor;
        this.requestId = builder.requestId;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListReportResponseBody create() {
        return builder().build();
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

        public ListReportResponseBody build() {
            return new ListReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListReportResponseBody</p>
     */
    public static class Contents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Sort")
        private String sort;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Contents(Builder builder) {
            this.key = builder.key;
            this.sort = builder.sort;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contents create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return sort
         */
        public String getSort() {
            return this.sort;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String sort; 
            private String type; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Sort.
             */
            public Builder sort(String sort) {
                this.sort = sort;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Contents build() {
                return new Contents(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListReportResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Contents")
        private java.util.List<Contents> contents;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("CreatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("DeptName")
        private String deptName;

        @com.aliyun.core.annotation.NameInMap("Images")
        private java.util.List<String> images;

        @com.aliyun.core.annotation.NameInMap("Latitude")
        private String latitude;

        @com.aliyun.core.annotation.NameInMap("Longitude")
        private String longitude;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private Long modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("ReportId")
        private String reportId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        private DataList(Builder builder) {
            this.contents = builder.contents;
            this.createTime = builder.createTime;
            this.creatorId = builder.creatorId;
            this.creatorName = builder.creatorName;
            this.deptName = builder.deptName;
            this.images = builder.images;
            this.latitude = builder.latitude;
            this.longitude = builder.longitude;
            this.modifiedTime = builder.modifiedTime;
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
         * @return contents
         */
        public java.util.List<Contents> getContents() {
            return this.contents;
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
         * @return images
         */
        public java.util.List<String> getImages() {
            return this.images;
        }

        /**
         * @return latitude
         */
        public String getLatitude() {
            return this.latitude;
        }

        /**
         * @return longitude
         */
        public String getLongitude() {
            return this.longitude;
        }

        /**
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
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
            private java.util.List<Contents> contents; 
            private Long createTime; 
            private String creatorId; 
            private String creatorName; 
            private String deptName; 
            private java.util.List<String> images; 
            private String latitude; 
            private String longitude; 
            private Long modifiedTime; 
            private String remark; 
            private String reportId; 
            private String templateName; 

            /**
             * Contents.
             */
            public Builder contents(java.util.List<Contents> contents) {
                this.contents = contents;
                return this;
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
             * Images.
             */
            public Builder images(java.util.List<String> images) {
                this.images = images;
                return this;
            }

            /**
             * Latitude.
             */
            public Builder latitude(String latitude) {
                this.latitude = latitude;
                return this;
            }

            /**
             * Longitude.
             */
            public Builder longitude(String longitude) {
                this.longitude = longitude;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
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
