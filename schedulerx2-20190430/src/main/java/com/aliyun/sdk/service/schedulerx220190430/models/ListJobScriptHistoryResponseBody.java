// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

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
 * {@link ListJobScriptHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListJobScriptHistoryResponseBody</p>
 */
public class ListJobScriptHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListJobScriptHistoryResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobScriptHistoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListJobScriptHistoryResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The information about the jobs.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The additional information returned only if an error occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>job is not existed, jobId=302</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4F68ABED-AC31-4412-9297-D9A8F0401108</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <p>true</p>
         * <p>false</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListJobScriptHistoryResponseBody build() {
            return new ListJobScriptHistoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListJobScriptHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobScriptHistoryResponseBody</p>
     */
    public static class JobScriptHistoryInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("ScriptContent")
        private String scriptContent;

        @com.aliyun.core.annotation.NameInMap("VersionesDescription")
        private String versionesDescription;

        private JobScriptHistoryInfos(Builder builder) {
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.scriptContent = builder.scriptContent;
            this.versionesDescription = builder.versionesDescription;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobScriptHistoryInfos create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return scriptContent
         */
        public String getScriptContent() {
            return this.scriptContent;
        }

        /**
         * @return versionesDescription
         */
        public String getVersionesDescription() {
            return this.versionesDescription;
        }

        public static final class Builder {
            private String createTime; 
            private String creator; 
            private String scriptContent; 
            private String versionesDescription; 

            private Builder() {
            } 

            private Builder(JobScriptHistoryInfos model) {
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.scriptContent = model.scriptContent;
                this.versionesDescription = model.versionesDescription;
            } 

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-12 14:52:42</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The creator.</p>
             * 
             * <strong>example:</strong>
             * <p>1272118248844842</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The script content.</p>
             * 
             * <strong>example:</strong>
             * <p>#!/bin/bash</p>
             * <h1>The following are predefined variables provided by the system. You can use them to obtain information about the job run.</h1>
             * <p>echo &quot;Job parameters: #{schedulerx.jobParameters}&quot;
             * echo &quot;Shard index: #{schedulerx.shardingId}&quot;
             * echo &quot;Shard parameters: #{schedulerx.shardingParameters}&quot;
             * echo &quot;Total number of shards: #{schedulerx.shardingNum}&quot;
             * echo &quot;Current retry count: #{schedulerx.attempt}&quot;
             * echo &quot;Trigger type: #{schedulerx.triggerType}&quot;
             * echo &quot;Scheduled timestamp: #{schedulerx.scheduleTime}&quot;
             * echo &quot;Data timestamp: #{schedulerx.dataTime}&quot;</p>
             * <h1>The output of the last line will be returned as the result</h1>
             * <p>echo &quot;hello world&quot;</p>
             * <h1>exit 1 indicates failure</h1>
             * <p>exit 0</p>
             */
            public Builder scriptContent(String scriptContent) {
                this.scriptContent = scriptContent;
                return this;
            }

            /**
             * <p>The description of the script version.</p>
             * 
             * <strong>example:</strong>
             * <p>init version</p>
             */
            public Builder versionesDescription(String versionesDescription) {
                this.versionesDescription = versionesDescription;
                return this;
            }

            public JobScriptHistoryInfos build() {
                return new JobScriptHistoryInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListJobScriptHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobScriptHistoryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobScriptHistoryInfos")
        private java.util.List<JobScriptHistoryInfos> jobScriptHistoryInfos;

        private Data(Builder builder) {
            this.jobScriptHistoryInfos = builder.jobScriptHistoryInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return jobScriptHistoryInfos
         */
        public java.util.List<JobScriptHistoryInfos> getJobScriptHistoryInfos() {
            return this.jobScriptHistoryInfos;
        }

        public static final class Builder {
            private java.util.List<JobScriptHistoryInfos> jobScriptHistoryInfos; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.jobScriptHistoryInfos = model.jobScriptHistoryInfos;
            } 

            /**
             * <p>The information about the job&quot;s historical scripts.</p>
             */
            public Builder jobScriptHistoryInfos(java.util.List<JobScriptHistoryInfos> jobScriptHistoryInfos) {
                this.jobScriptHistoryInfos = jobScriptHistoryInfos;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
