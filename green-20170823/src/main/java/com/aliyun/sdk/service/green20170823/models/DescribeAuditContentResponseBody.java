// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAuditContentResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAuditContentResponseBody</p>
 */
public class DescribeAuditContentResponseBody extends TeaModel {
    @NameInMap("AuditContentList")
    private java.util.List < AuditContentList> auditContentList;

    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAuditContentResponseBody(Builder builder) {
        this.auditContentList = builder.auditContentList;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAuditContentResponseBody create() {
        return builder().build();
    }

    /**
     * @return auditContentList
     */
    public java.util.List < AuditContentList> getAuditContentList() {
        return this.auditContentList;
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
        private java.util.List < AuditContentList> auditContentList; 
        private Integer currentPage; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * AuditContentList.
         */
        public Builder auditContentList(java.util.List < AuditContentList> auditContentList) {
            this.auditContentList = auditContentList;
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

        public DescribeAuditContentResponseBody build() {
            return new DescribeAuditContentResponseBody(this);
        } 

    } 

    public static class FrameResults extends TeaModel {
        @NameInMap("Label")
        private String label;

        @NameInMap("Offset")
        private Integer offset;

        @NameInMap("Url")
        private String url;

        private FrameResults(Builder builder) {
            this.label = builder.label;
            this.offset = builder.offset;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FrameResults create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return offset
         */
        public Integer getOffset() {
            return this.offset;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String label; 
            private Integer offset; 
            private String url; 

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Offset.
             */
            public Builder offset(Integer offset) {
                this.offset = offset;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public FrameResults build() {
                return new FrameResults(this);
            } 

        } 

    }
    public static class Results extends TeaModel {
        @NameInMap("Label")
        private String label;

        @NameInMap("Scene")
        private String scene;

        @NameInMap("Suggestion")
        private String suggestion;

        private Results(Builder builder) {
            this.label = builder.label;
            this.scene = builder.scene;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        public static final class Builder {
            private String label; 
            private String scene; 
            private String suggestion; 

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Scene.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * Suggestion.
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    public static class AuditContentList extends TeaModel {
        @NameInMap("Audit")
        private Integer audit;

        @NameInMap("AuditIllegalReasons")
        private java.util.List < String > auditIllegalReasons;

        @NameInMap("AuditResult")
        private String auditResult;

        @NameInMap("BizType")
        private String bizType;

        @NameInMap("Content")
        private String content;

        @NameInMap("DataId")
        private String dataId;

        @NameInMap("FrameResults")
        private java.util.List < FrameResults> frameResults;

        @NameInMap("Id")
        private Long id;

        @NameInMap("NewUrl")
        private String newUrl;

        @NameInMap("RequestTime")
        private String requestTime;

        @NameInMap("Results")
        private java.util.List < Results> results;

        @NameInMap("ScanFinishedTime")
        private String scanFinishedTime;

        @NameInMap("Suggestion")
        private String suggestion;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("Thumbnail")
        private String thumbnail;

        @NameInMap("Url")
        private String url;

        private AuditContentList(Builder builder) {
            this.audit = builder.audit;
            this.auditIllegalReasons = builder.auditIllegalReasons;
            this.auditResult = builder.auditResult;
            this.bizType = builder.bizType;
            this.content = builder.content;
            this.dataId = builder.dataId;
            this.frameResults = builder.frameResults;
            this.id = builder.id;
            this.newUrl = builder.newUrl;
            this.requestTime = builder.requestTime;
            this.results = builder.results;
            this.scanFinishedTime = builder.scanFinishedTime;
            this.suggestion = builder.suggestion;
            this.taskId = builder.taskId;
            this.thumbnail = builder.thumbnail;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuditContentList create() {
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
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
        }

        /**
         * @return frameResults
         */
        public java.util.List < FrameResults> getFrameResults() {
            return this.frameResults;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return newUrl
         */
        public String getNewUrl() {
            return this.newUrl;
        }

        /**
         * @return requestTime
         */
        public String getRequestTime() {
            return this.requestTime;
        }

        /**
         * @return results
         */
        public java.util.List < Results> getResults() {
            return this.results;
        }

        /**
         * @return scanFinishedTime
         */
        public String getScanFinishedTime() {
            return this.scanFinishedTime;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return thumbnail
         */
        public String getThumbnail() {
            return this.thumbnail;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Integer audit; 
            private java.util.List < String > auditIllegalReasons; 
            private String auditResult; 
            private String bizType; 
            private String content; 
            private String dataId; 
            private java.util.List < FrameResults> frameResults; 
            private Long id; 
            private String newUrl; 
            private String requestTime; 
            private java.util.List < Results> results; 
            private String scanFinishedTime; 
            private String suggestion; 
            private String taskId; 
            private String thumbnail; 
            private String url; 

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
             * BizType.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
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
             * DataId.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * FrameResults.
             */
            public Builder frameResults(java.util.List < FrameResults> frameResults) {
                this.frameResults = frameResults;
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
             * NewUrl.
             */
            public Builder newUrl(String newUrl) {
                this.newUrl = newUrl;
                return this;
            }

            /**
             * RequestTime.
             */
            public Builder requestTime(String requestTime) {
                this.requestTime = requestTime;
                return this;
            }

            /**
             * Results.
             */
            public Builder results(java.util.List < Results> results) {
                this.results = results;
                return this;
            }

            /**
             * ScanFinishedTime.
             */
            public Builder scanFinishedTime(String scanFinishedTime) {
                this.scanFinishedTime = scanFinishedTime;
                return this;
            }

            /**
             * Suggestion.
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * Thumbnail.
             */
            public Builder thumbnail(String thumbnail) {
                this.thumbnail = thumbnail;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public AuditContentList build() {
                return new AuditContentList(this);
            } 

        } 

    }
}
