// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListRoutineRelatedRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRoutineRelatedRecordsResponseBody</p>
 */
public class ListRoutineRelatedRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RelatedRecords")
    private java.util.List<RelatedRecords> relatedRecords;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListRoutineRelatedRecordsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.relatedRecords = builder.relatedRecords;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRoutineRelatedRecordsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return relatedRecords
     */
    public java.util.List<RelatedRecords> getRelatedRecords() {
        return this.relatedRecords;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long pageNumber; 
        private Long pageSize; 
        private java.util.List<RelatedRecords> relatedRecords; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListRoutineRelatedRecordsResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.relatedRecords = model.relatedRecords;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The list of records associated with the edge function.</p>
         */
        public Builder relatedRecords(java.util.List<RelatedRecords> relatedRecords) {
            this.relatedRecords = relatedRecords;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRoutineRelatedRecordsResponseBody build() {
            return new ListRoutineRelatedRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRoutineRelatedRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRoutineRelatedRecordsResponseBody</p>
     */
    public static class RelatedRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RecordId")
        private Long recordId;

        @com.aliyun.core.annotation.NameInMap("RecordName")
        private String recordName;

        @com.aliyun.core.annotation.NameInMap("SiteId")
        private Long siteId;

        @com.aliyun.core.annotation.NameInMap("SiteName")
        private String siteName;

        private RelatedRecords(Builder builder) {
            this.recordId = builder.recordId;
            this.recordName = builder.recordName;
            this.siteId = builder.siteId;
            this.siteName = builder.siteName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedRecords create() {
            return builder().build();
        }

        /**
         * @return recordId
         */
        public Long getRecordId() {
            return this.recordId;
        }

        /**
         * @return recordName
         */
        public String getRecordName() {
            return this.recordName;
        }

        /**
         * @return siteId
         */
        public Long getSiteId() {
            return this.siteId;
        }

        /**
         * @return siteName
         */
        public String getSiteName() {
            return this.siteName;
        }

        public static final class Builder {
            private Long recordId; 
            private String recordName; 
            private Long siteId; 
            private String siteName; 

            private Builder() {
            } 

            private Builder(RelatedRecords model) {
                this.recordId = model.recordId;
                this.recordName = model.recordName;
                this.siteId = model.siteId;
                this.siteName = model.siteName;
            } 

            /**
             * <p>The record ID of the domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>509348423011904</p>
             */
            public Builder recordId(Long recordId) {
                this.recordId = recordId;
                return this;
            }

            /**
             * <p>The name of the record.</p>
             * 
             * <strong>example:</strong>
             * <p>test-record-1.example.com</p>
             */
            public Builder recordName(String recordName) {
                this.recordName = recordName;
                return this;
            }

            /**
             * <p>The website ID.</p>
             * 
             * <strong>example:</strong>
             * <p>54362329990032</p>
             */
            public Builder siteId(Long siteId) {
                this.siteId = siteId;
                return this;
            }

            /**
             * <p>The website name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder siteName(String siteName) {
                this.siteName = siteName;
                return this;
            }

            public RelatedRecords build() {
                return new RelatedRecords(this);
            } 

        } 

    }
}
