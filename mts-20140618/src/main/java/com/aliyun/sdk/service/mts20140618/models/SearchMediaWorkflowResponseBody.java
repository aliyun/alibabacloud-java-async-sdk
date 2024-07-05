// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchMediaWorkflowResponseBody} extends {@link TeaModel}
 *
 * <p>SearchMediaWorkflowResponseBody</p>
 */
public class SearchMediaWorkflowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MediaWorkflowList")
    private MediaWorkflowList mediaWorkflowList;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private SearchMediaWorkflowResponseBody(Builder builder) {
        this.mediaWorkflowList = builder.mediaWorkflowList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchMediaWorkflowResponseBody create() {
        return builder().build();
    }

    /**
     * @return mediaWorkflowList
     */
    public MediaWorkflowList getMediaWorkflowList() {
        return this.mediaWorkflowList;
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
        private MediaWorkflowList mediaWorkflowList; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * The details of the media workflows.
         */
        public Builder mediaWorkflowList(MediaWorkflowList mediaWorkflowList) {
            this.mediaWorkflowList = mediaWorkflowList;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned on each page.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public SearchMediaWorkflowResponseBody build() {
            return new SearchMediaWorkflowResponseBody(this);
        } 

    } 

    public static class MediaWorkflow extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("MediaWorkflowId")
        private String mediaWorkflowId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Topology")
        private String topology;

        @com.aliyun.core.annotation.NameInMap("TriggerMode")
        private String triggerMode;

        private MediaWorkflow(Builder builder) {
            this.creationTime = builder.creationTime;
            this.mediaWorkflowId = builder.mediaWorkflowId;
            this.name = builder.name;
            this.state = builder.state;
            this.topology = builder.topology;
            this.triggerMode = builder.triggerMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaWorkflow create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return mediaWorkflowId
         */
        public String getMediaWorkflowId() {
            return this.mediaWorkflowId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return topology
         */
        public String getTopology() {
            return this.topology;
        }

        /**
         * @return triggerMode
         */
        public String getTriggerMode() {
            return this.triggerMode;
        }

        public static final class Builder {
            private String creationTime; 
            private String mediaWorkflowId; 
            private String name; 
            private String state; 
            private String topology; 
            private String triggerMode; 

            /**
             * The time when the media workflow was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The ID of the media workflow.
             */
            public Builder mediaWorkflowId(String mediaWorkflowId) {
                this.mediaWorkflowId = mediaWorkflowId;
                return this;
            }

            /**
             * The name of the media workflow.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The status of the media workflow. Valid values:
             * <p>
             * 
             * *   **Inactive**: The media workflow is deactivated.
             * *   **Active**: The media workflow is activated.
             * *   **Deleted**: The media workflow is deleted.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The topology of the media workflow.
             */
            public Builder topology(String topology) {
                this.topology = topology;
                return this;
            }

            /**
             * The trigger mode of the media workflow. Valid values:
             * <p>
             * 
             * *   **OssAutoTrigger**: The media workflow is automatically triggered.
             * *   **NotInAuto**: The media workflow is not automatically triggered.
             */
            public Builder triggerMode(String triggerMode) {
                this.triggerMode = triggerMode;
                return this;
            }

            public MediaWorkflow build() {
                return new MediaWorkflow(this);
            } 

        } 

    }
    public static class MediaWorkflowList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MediaWorkflow")
        private java.util.List < MediaWorkflow> mediaWorkflow;

        private MediaWorkflowList(Builder builder) {
            this.mediaWorkflow = builder.mediaWorkflow;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaWorkflowList create() {
            return builder().build();
        }

        /**
         * @return mediaWorkflow
         */
        public java.util.List < MediaWorkflow> getMediaWorkflow() {
            return this.mediaWorkflow;
        }

        public static final class Builder {
            private java.util.List < MediaWorkflow> mediaWorkflow; 

            /**
             * MediaWorkflow.
             */
            public Builder mediaWorkflow(java.util.List < MediaWorkflow> mediaWorkflow) {
                this.mediaWorkflow = mediaWorkflow;
                return this;
            }

            public MediaWorkflowList build() {
                return new MediaWorkflowList(this);
            } 

        } 

    }
}
