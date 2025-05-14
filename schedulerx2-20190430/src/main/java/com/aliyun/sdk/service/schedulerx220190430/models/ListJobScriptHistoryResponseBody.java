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
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
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
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * ScriptContent.
             */
            public Builder scriptContent(String scriptContent) {
                this.scriptContent = scriptContent;
                return this;
            }

            /**
             * VersionesDescription.
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
             * <ul>
             * <li></li>
             * </ul>
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
