// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveStreamPreloadTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamPreloadTasksResponseBody</p>
 */
public class DescribeLiveStreamPreloadTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PreloadTasks")
    private PreloadTasks preloadTasks;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Integer totalNum;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    private DescribeLiveStreamPreloadTasksResponseBody(Builder builder) {
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.preloadTasks = builder.preloadTasks;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamPreloadTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return preloadTasks
     */
    public PreloadTasks getPreloadTasks() {
        return this.preloadTasks;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalNum
     */
    public Integer getTotalNum() {
        return this.totalNum;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private Integer pageNum; 
        private Integer pageSize; 
        private PreloadTasks preloadTasks; 
        private String requestId; 
        private Integer totalNum; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(DescribeLiveStreamPreloadTasksResponseBody model) {
            this.pageNum = model.pageNum;
            this.pageSize = model.pageSize;
            this.preloadTasks = model.preloadTasks;
            this.requestId = model.requestId;
            this.totalNum = model.totalNum;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The details of the prefetch task.</p>
         */
        public Builder preloadTasks(PreloadTasks preloadTasks) {
            this.preloadTasks = preloadTasks;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E1564CBC-DCFE-5E1B-8B78-8DED9A39F334</p>
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
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeLiveStreamPreloadTasksResponseBody build() {
            return new DescribeLiveStreamPreloadTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveStreamPreloadTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamPreloadTasksResponseBody</p>
     */
    public static class PreloadTask extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Area")
        private String area;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("PlayUrl")
        private String playUrl;

        @com.aliyun.core.annotation.NameInMap("PreloadedEndTime")
        private String preloadedEndTime;

        @com.aliyun.core.annotation.NameInMap("PreloadedStartTime")
        private String preloadedStartTime;

        @com.aliyun.core.annotation.NameInMap("Process")
        private String process;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private PreloadTask(Builder builder) {
            this.area = builder.area;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.domainName = builder.domainName;
            this.playUrl = builder.playUrl;
            this.preloadedEndTime = builder.preloadedEndTime;
            this.preloadedStartTime = builder.preloadedStartTime;
            this.process = builder.process;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreloadTask create() {
            return builder().build();
        }

        /**
         * @return area
         */
        public String getArea() {
            return this.area;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return playUrl
         */
        public String getPlayUrl() {
            return this.playUrl;
        }

        /**
         * @return preloadedEndTime
         */
        public String getPreloadedEndTime() {
            return this.preloadedEndTime;
        }

        /**
         * @return preloadedStartTime
         */
        public String getPreloadedStartTime() {
            return this.preloadedStartTime;
        }

        /**
         * @return process
         */
        public String getProcess() {
            return this.process;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String area; 
            private String createTime; 
            private String description; 
            private String domainName; 
            private String playUrl; 
            private String preloadedEndTime; 
            private String preloadedStartTime; 
            private String process; 
            private String status; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(PreloadTask model) {
                this.area = model.area;
                this.createTime = model.createTime;
                this.description = model.description;
                this.domainName = model.domainName;
                this.playUrl = model.playUrl;
                this.preloadedEndTime = model.preloadedEndTime;
                this.preloadedStartTime = model.preloadedStartTime;
                this.process = model.process;
                this.status = model.status;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The acceleration region where the live content is prefetched. Valid values:</p>
             * <ul>
             * <li>domestic: regions in the Chinese mainland.</li>
             * <li>overseas: regions outside the Chinese mainland.</li>
             * <li>global: regions in and outside the Chinese mainland.</li>
             * </ul>
             * <blockquote>
             * <p> If this parameter is left empty, the acceleration region configured for the domain name is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>domestic</p>
             */
            public Builder area(String area) {
                this.area = area;
                return this;
            }

            /**
             * <p>The time when the prefetch task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-06-29T19:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Indicates whether the prefetch task is successful. Valid values:</p>
             * <ul>
             * <li>Successfully</li>
             * <li>InternalError</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Successfully</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The streaming domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The streaming URL.</p>
             */
            public Builder playUrl(String playUrl) {
                this.playUrl = playUrl;
                return this;
            }

            /**
             * <p>The time when the prefetch task ended.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-06-30T19:00:00Z</p>
             */
            public Builder preloadedEndTime(String preloadedEndTime) {
                this.preloadedEndTime = preloadedEndTime;
                return this;
            }

            /**
             * <p>The time when the prefetch task started.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-06-29T19:00:00Z</p>
             */
            public Builder preloadedStartTime(String preloadedStartTime) {
                this.preloadedStartTime = preloadedStartTime;
                return this;
            }

            /**
             * <p>The progress of the prefetch task.</p>
             * 
             * <strong>example:</strong>
             * <p>100%</p>
             */
            public Builder process(String process) {
                this.process = process;
                return this;
            }

            /**
             * <p>The status of the prefetch task. Valid values:</p>
             * <ul>
             * <li>Success</li>
             * <li>Failed</li>
             * </ul>
             * <blockquote>
             * <p> Success is returned only if the prefetch task is configured for all streaming URLs.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the prefetch task.</p>
             * 
             * <strong>example:</strong>
             * <p>yourTaskId</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public PreloadTask build() {
                return new PreloadTask(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveStreamPreloadTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamPreloadTasksResponseBody</p>
     */
    public static class PreloadTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PreloadTask")
        private java.util.List<PreloadTask> preloadTask;

        private PreloadTasks(Builder builder) {
            this.preloadTask = builder.preloadTask;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreloadTasks create() {
            return builder().build();
        }

        /**
         * @return preloadTask
         */
        public java.util.List<PreloadTask> getPreloadTask() {
            return this.preloadTask;
        }

        public static final class Builder {
            private java.util.List<PreloadTask> preloadTask; 

            private Builder() {
            } 

            private Builder(PreloadTasks model) {
                this.preloadTask = model.preloadTask;
            } 

            /**
             * PreloadTask.
             */
            public Builder preloadTask(java.util.List<PreloadTask> preloadTask) {
                this.preloadTask = preloadTask;
                return this;
            }

            public PreloadTasks build() {
                return new PreloadTasks(this);
            } 

        } 

    }
}
