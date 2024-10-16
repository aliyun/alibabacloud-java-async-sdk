// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The details of the media workflows.</p>
         */
        public Builder mediaWorkflowList(MediaWorkflowList mediaWorkflowList) {
            this.mediaWorkflowList = mediaWorkflowList;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>16CD0CDD-457E-420D-9755-8385075A1234</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public SearchMediaWorkflowResponseBody build() {
            return new SearchMediaWorkflowResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchMediaWorkflowResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaWorkflowResponseBody</p>
     */
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
             * <p>The time when the media workflow was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-04-01T05:38:41Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The ID of the media workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>88c6ca184c0e4578645b665e2a12****</p>
             */
            public Builder mediaWorkflowId(String mediaWorkflowId) {
                this.mediaWorkflowId = mediaWorkflowId;
                return this;
            }

            /**
             * <p>The name of the media workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>example-mediaworkflow-****</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The status of the media workflow. Valid values:</p>
             * <ul>
             * <li><strong>Inactive</strong>: The media workflow is deactivated.</li>
             * <li><strong>Active</strong>: The media workflow is activated.</li>
             * <li><strong>Deleted</strong>: The media workflow is deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The topology of the media workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;MediaWorkflowList&quot;:{&quot;MediaWorkflow&quot;:[{&quot;CreationTime&quot;:&quot;2016-04-01T05:29:38Z&quot;,&quot;Name&quot;:&quot;example-mediaworkflow-<strong><strong>&quot;,&quot;State&quot;:&quot;Active&quot;,&quot;Topology&quot;:&quot;{&quot;Activities&quot;:{&quot;Act-Start&quot;:{&quot;Parameters&quot;:{&quot;PipelineId&quot;:&quot;130266f58161436a80bf07cb12c8</strong></strong>&quot;,&quot;InputFile&quot;:&quot;{\&quot;Bucket\&quot;: \&quot;example-bucket-<strong><strong>\&quot;,\&quot;Location\&quot;: \&quot;example-location\&quot;}&quot;},&quot;Type&quot;:&quot;Start&quot;},&quot;Act-Report&quot;:{&quot;Parameters&quot;:{},&quot;Type&quot;:&quot;Report&quot;},&quot;Act-Transcode-M3U8&quot;:{&quot;Parameters&quot;:{&quot;Outputs&quot;:&quot;[{\&quot;Object\&quot;:\&quot;transcode/{ObjectPrefix}{FileName}\&quot;,\&quot;TemplateId\&quot;: \&quot;957d1719ee85ed6527b90cf62726</strong></strong>\&quot;}]&quot;,&quot;OutputBucket&quot;:&quot;example-bucket-<strong><strong>&quot;,&quot;OutputLocation&quot;:&quot;example-location&quot;},&quot;Type&quot;:&quot;Transcode&quot;}},&quot;Dependencies&quot;:{&quot;Act-Start&quot;:[&quot;Act-Transcode-M3U8&quot;],&quot;Act-Report&quot;:[],&quot;Act-Transcode-M3U8&quot;:[&quot;Act-Report&quot;]}}&quot;,&quot;MediaWorkflowId&quot;:&quot;93ab850b4f6f44eab54b6e91d24d</strong></strong>&quot;}]},&quot;RequestId&quot;:&quot;16CD0CDD-457E-420D-9755-8385075A1234&quot;}</p>
             */
            public Builder topology(String topology) {
                this.topology = topology;
                return this;
            }

            /**
             * <p>The trigger mode of the media workflow. Valid values:</p>
             * <ul>
             * <li><strong>OssAutoTrigger</strong>: The media workflow is automatically triggered.</li>
             * <li><strong>NotInAuto</strong>: The media workflow is not automatically triggered.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OssAutoTrigger</p>
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
    /**
     * 
     * {@link SearchMediaWorkflowResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaWorkflowResponseBody</p>
     */
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
