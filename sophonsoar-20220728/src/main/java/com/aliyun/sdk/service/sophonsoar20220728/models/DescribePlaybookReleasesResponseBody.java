// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribePlaybookReleasesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePlaybookReleasesResponseBody</p>
 */
public class DescribePlaybookReleasesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Page")
    private Page page;

    @com.aliyun.core.annotation.NameInMap("Records")
    private java.util.List < Records> records;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePlaybookReleasesResponseBody(Builder builder) {
        this.page = builder.page;
        this.records = builder.records;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePlaybookReleasesResponseBody create() {
        return builder().build();
    }

    /**
     * @return page
     */
    public Page getPage() {
        return this.page;
    }

    /**
     * @return records
     */
    public java.util.List < Records> getRecords() {
        return this.records;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Page page; 
        private java.util.List < Records> records; 
        private String requestId; 

        /**
         * <p>The pagination information.</p>
         */
        public Builder page(Page page) {
            this.page = page;
            return this;
        }

        /**
         * <p>The information about the playbook version.</p>
         */
        public Builder records(java.util.List < Records> records) {
            this.records = records;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3DFBE11C-6EB6-5166-92D6-3397796AFE1E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePlaybookReleasesResponseBody build() {
            return new DescribePlaybookReleasesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePlaybookReleasesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePlaybookReleasesResponseBody</p>
     */
    public static class Page extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Page(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Page create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Page build() {
                return new Page(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePlaybookReleasesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePlaybookReleasesResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("TaskflowMd5")
        private String taskflowMd5;

        private Records(Builder builder) {
            this.creator = builder.creator;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.taskflowMd5 = builder.taskflowMd5;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return taskflowMd5
         */
        public String getTaskflowMd5() {
            return this.taskflowMd5;
        }

        public static final class Builder {
            private String creator; 
            private String description; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Integer id; 
            private String taskflowMd5; 

            /**
             * <p>The ID of the Alibaba Cloud account that is used to publish the version.</p>
             * 
             * <strong>example:</strong>
             * <p>145xxxx985</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The description of the layer version.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a new version</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the version was created. The value is a 13-digit timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1655277397000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the version was modified. The value is a 13-digit timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1691460804000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The record ID.</p>
             * 
             * <strong>example:</strong>
             * <p>80xxx</p>
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The MD5 value configured for the published version of the playbook.</p>
             * 
             * <strong>example:</strong>
             * <p>be0a4ef084dd174abe47xxxxx</p>
             */
            public Builder taskflowMd5(String taskflowMd5) {
                this.taskflowMd5 = taskflowMd5;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
}
