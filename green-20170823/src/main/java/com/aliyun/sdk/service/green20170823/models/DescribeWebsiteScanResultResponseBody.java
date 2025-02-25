// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebsiteScanResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebsiteScanResultResponseBody</p>
 */
public class DescribeWebsiteScanResultResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("WebsiteScanResultList")
    private java.util.List < WebsiteScanResultList> websiteScanResultList;

    private DescribeWebsiteScanResultResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.websiteScanResultList = builder.websiteScanResultList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebsiteScanResultResponseBody create() {
        return builder().build();
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

    /**
     * @return websiteScanResultList
     */
    public java.util.List < WebsiteScanResultList> getWebsiteScanResultList() {
        return this.websiteScanResultList;
    }

    public static final class Builder {
        private Integer currentPage; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < WebsiteScanResultList> websiteScanResultList; 

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

        /**
         * WebsiteScanResultList.
         */
        public Builder websiteScanResultList(java.util.List < WebsiteScanResultList> websiteScanResultList) {
            this.websiteScanResultList = websiteScanResultList;
            return this;
        }

        public DescribeWebsiteScanResultResponseBody build() {
            return new DescribeWebsiteScanResultResponseBody(this);
        } 

    } 

    public static class WebsiteScanResultList extends TeaModel {
        @NameInMap("Domain")
        private String domain;

        @NameInMap("HandleStatus")
        private Integer handleStatus;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("ImageRiskCount")
        private Integer imageRiskCount;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Labels")
        private java.util.List < String > labels;

        @NameInMap("ScanTime")
        private String scanTime;

        @NameInMap("SourceRiskCount")
        private Integer sourceRiskCount;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TextRiskCount")
        private Integer textRiskCount;

        @NameInMap("Url")
        private String url;

        private WebsiteScanResultList(Builder builder) {
            this.domain = builder.domain;
            this.handleStatus = builder.handleStatus;
            this.id = builder.id;
            this.imageRiskCount = builder.imageRiskCount;
            this.instanceId = builder.instanceId;
            this.labels = builder.labels;
            this.scanTime = builder.scanTime;
            this.sourceRiskCount = builder.sourceRiskCount;
            this.taskId = builder.taskId;
            this.textRiskCount = builder.textRiskCount;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WebsiteScanResultList create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return handleStatus
         */
        public Integer getHandleStatus() {
            return this.handleStatus;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return imageRiskCount
         */
        public Integer getImageRiskCount() {
            return this.imageRiskCount;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return labels
         */
        public java.util.List < String > getLabels() {
            return this.labels;
        }

        /**
         * @return scanTime
         */
        public String getScanTime() {
            return this.scanTime;
        }

        /**
         * @return sourceRiskCount
         */
        public Integer getSourceRiskCount() {
            return this.sourceRiskCount;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return textRiskCount
         */
        public Integer getTextRiskCount() {
            return this.textRiskCount;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String domain; 
            private Integer handleStatus; 
            private Integer id; 
            private Integer imageRiskCount; 
            private String instanceId; 
            private java.util.List < String > labels; 
            private String scanTime; 
            private Integer sourceRiskCount; 
            private String taskId; 
            private Integer textRiskCount; 
            private String url; 

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * HandleStatus.
             */
            public Builder handleStatus(Integer handleStatus) {
                this.handleStatus = handleStatus;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * ImageRiskCount.
             */
            public Builder imageRiskCount(Integer imageRiskCount) {
                this.imageRiskCount = imageRiskCount;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(java.util.List < String > labels) {
                this.labels = labels;
                return this;
            }

            /**
             * ScanTime.
             */
            public Builder scanTime(String scanTime) {
                this.scanTime = scanTime;
                return this;
            }

            /**
             * SourceRiskCount.
             */
            public Builder sourceRiskCount(Integer sourceRiskCount) {
                this.sourceRiskCount = sourceRiskCount;
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
             * TextRiskCount.
             */
            public Builder textRiskCount(Integer textRiskCount) {
                this.textRiskCount = textRiskCount;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public WebsiteScanResultList build() {
                return new WebsiteScanResultList(this);
            } 

        } 

    }
}
