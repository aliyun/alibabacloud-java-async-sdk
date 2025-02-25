// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAuditContentItemResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAuditContentItemResponseBody</p>
 */
public class DescribeAuditContentItemResponseBody extends TeaModel {
    @NameInMap("AuditContentItemList")
    private java.util.List < AuditContentItemList> auditContentItemList;

    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAuditContentItemResponseBody(Builder builder) {
        this.auditContentItemList = builder.auditContentItemList;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAuditContentItemResponseBody create() {
        return builder().build();
    }

    /**
     * @return auditContentItemList
     */
    public java.util.List < AuditContentItemList> getAuditContentItemList() {
        return this.auditContentItemList;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < AuditContentItemList> auditContentItemList; 
        private Integer currentPage; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * AuditContentItemList.
         */
        public Builder auditContentItemList(java.util.List < AuditContentItemList> auditContentItemList) {
            this.auditContentItemList = auditContentItemList;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAuditContentItemResponseBody build() {
            return new DescribeAuditContentItemResponseBody(this);
        } 

    } 

    public static class AuditContentItemList extends TeaModel {
        @NameInMap("Audit")
        private Integer audit;

        @NameInMap("AuditIllegalReasons")
        private java.util.List < String > auditIllegalReasons;

        @NameInMap("AuditResult")
        private String auditResult;

        @NameInMap("Content")
        private String content;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("Id")
        private Long id;

        @NameInMap("ParentTaskId")
        private String parentTaskId;

        @NameInMap("Sn")
        private Integer sn;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Suggestion")
        private String suggestion;

        private AuditContentItemList(Builder builder) {
            this.audit = builder.audit;
            this.auditIllegalReasons = builder.auditIllegalReasons;
            this.auditResult = builder.auditResult;
            this.content = builder.content;
            this.endTime = builder.endTime;
            this.id = builder.id;
            this.parentTaskId = builder.parentTaskId;
            this.sn = builder.sn;
            this.startTime = builder.startTime;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuditContentItemList create() {
            return builder().build();
        }

        /**
         * @return audit
         */
        public Integer getAudit() {
            return this.audit;
        }

        /**
         * @return auditIllegalReasons
         */
        public java.util.List < String > getAuditIllegalReasons() {
            return this.auditIllegalReasons;
        }

        /**
         * @return auditResult
         */
        public String getAuditResult() {
            return this.auditResult;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return parentTaskId
         */
        public String getParentTaskId() {
            return this.parentTaskId;
        }

        /**
         * @return sn
         */
        public Integer getSn() {
            return this.sn;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        public static final class Builder {
            private Integer audit; 
            private java.util.List < String > auditIllegalReasons; 
            private String auditResult; 
            private String content; 
            private String endTime; 
            private Long id; 
            private String parentTaskId; 
            private Integer sn; 
            private String startTime; 
            private String suggestion; 

            /**
             * Audit.
             */
            public Builder audit(Integer audit) {
                this.audit = audit;
                return this;
            }

            /**
             * AuditIllegalReasons.
             */
            public Builder auditIllegalReasons(java.util.List < String > auditIllegalReasons) {
                this.auditIllegalReasons = auditIllegalReasons;
                return this;
            }

            /**
             * AuditResult.
             */
            public Builder auditResult(String auditResult) {
                this.auditResult = auditResult;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * ParentTaskId.
             */
            public Builder parentTaskId(String parentTaskId) {
                this.parentTaskId = parentTaskId;
                return this;
            }

            /**
             * Sn.
             */
            public Builder sn(Integer sn) {
                this.sn = sn;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Suggestion.
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public AuditContentItemList build() {
                return new AuditContentItemList(this);
            } 

        } 

    }
}
