// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLiveRecordTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListLiveRecordTemplatesResponseBody</p>
 */
public class ListLiveRecordTemplatesResponseBody extends TeaModel {
    @NameInMap("PageNo")
    private Long pageNo;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RecordTemplateList")
    private java.util.List < RecordTemplateList> recordTemplateList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SortBy")
    private String sortBy;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListLiveRecordTemplatesResponseBody(Builder builder) {
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.recordTemplateList = builder.recordTemplateList;
        this.requestId = builder.requestId;
        this.sortBy = builder.sortBy;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLiveRecordTemplatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return recordTemplateList
     */
    public java.util.List < RecordTemplateList> getRecordTemplateList() {
        return this.recordTemplateList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long pageNo; 
        private Long pageSize; 
        private java.util.List < RecordTemplateList> recordTemplateList; 
        private String requestId; 
        private String sortBy; 
        private Long totalCount; 

        /**
         * PageNo.
         */
        public Builder pageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RecordTemplateList.
         */
        public Builder recordTemplateList(java.util.List < RecordTemplateList> recordTemplateList) {
            this.recordTemplateList = recordTemplateList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListLiveRecordTemplatesResponseBody build() {
            return new ListLiveRecordTemplatesResponseBody(this);
        } 

    } 

    public static class RecordFormatList extends TeaModel {
        @NameInMap("CycleDuration")
        private Integer cycleDuration;

        @NameInMap("Format")
        private String format;

        @NameInMap("OssObjectPrefix")
        private String ossObjectPrefix;

        @NameInMap("SliceDuration")
        private Integer sliceDuration;

        @NameInMap("SliceOssObjectPrefix")
        private String sliceOssObjectPrefix;

        private RecordFormatList(Builder builder) {
            this.cycleDuration = builder.cycleDuration;
            this.format = builder.format;
            this.ossObjectPrefix = builder.ossObjectPrefix;
            this.sliceDuration = builder.sliceDuration;
            this.sliceOssObjectPrefix = builder.sliceOssObjectPrefix;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordFormatList create() {
            return builder().build();
        }

        /**
         * @return cycleDuration
         */
        public Integer getCycleDuration() {
            return this.cycleDuration;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return ossObjectPrefix
         */
        public String getOssObjectPrefix() {
            return this.ossObjectPrefix;
        }

        /**
         * @return sliceDuration
         */
        public Integer getSliceDuration() {
            return this.sliceDuration;
        }

        /**
         * @return sliceOssObjectPrefix
         */
        public String getSliceOssObjectPrefix() {
            return this.sliceOssObjectPrefix;
        }

        public static final class Builder {
            private Integer cycleDuration; 
            private String format; 
            private String ossObjectPrefix; 
            private Integer sliceDuration; 
            private String sliceOssObjectPrefix; 

            /**
             * CycleDuration.
             */
            public Builder cycleDuration(Integer cycleDuration) {
                this.cycleDuration = cycleDuration;
                return this;
            }

            /**
             * 格式
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * Oss对象名，不包含后缀
             */
            public Builder ossObjectPrefix(String ossObjectPrefix) {
                this.ossObjectPrefix = ossObjectPrefix;
                return this;
            }

            /**
             * 切片时长
             */
            public Builder sliceDuration(Integer sliceDuration) {
                this.sliceDuration = sliceDuration;
                return this;
            }

            /**
             * 切片Oss对象名，不包含后缀
             */
            public Builder sliceOssObjectPrefix(String sliceOssObjectPrefix) {
                this.sliceOssObjectPrefix = sliceOssObjectPrefix;
                return this;
            }

            public RecordFormatList build() {
                return new RecordFormatList(this);
            } 

        } 

    }
    public static class RecordTemplateList extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("LastModified")
        private String lastModified;

        @NameInMap("Name")
        private String name;

        @NameInMap("RecordFormatList")
        private java.util.List < RecordFormatList> recordFormatList;

        @NameInMap("TemplateId")
        private String templateId;

        @NameInMap("Type")
        private String type;

        private RecordTemplateList(Builder builder) {
            this.createTime = builder.createTime;
            this.lastModified = builder.lastModified;
            this.name = builder.name;
            this.recordFormatList = builder.recordFormatList;
            this.templateId = builder.templateId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordTemplateList create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return lastModified
         */
        public String getLastModified() {
            return this.lastModified;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return recordFormatList
         */
        public java.util.List < RecordFormatList> getRecordFormatList() {
            return this.recordFormatList;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String createTime; 
            private String lastModified; 
            private String name; 
            private java.util.List < RecordFormatList> recordFormatList; 
            private String templateId; 
            private String type; 

            /**
             * 代表创建时间的资源属性字段
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 最后修改时间
             */
            public Builder lastModified(String lastModified) {
                this.lastModified = lastModified;
                return this;
            }

            /**
             * 代表资源名称的资源属性字段
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 录制格式
             */
            public Builder recordFormatList(java.util.List < RecordFormatList> recordFormatList) {
                this.recordFormatList = recordFormatList;
                return this;
            }

            /**
             * 代表资源一级ID的资源属性字段
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * 代表资源名称的资源属性字段
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RecordTemplateList build() {
                return new RecordTemplateList(this);
            } 

        } 

    }
}
