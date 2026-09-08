// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ListAudioFilesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAudioFilesResponseBody</p>
 */
public class ListAudioFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAudioFilesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAudioFilesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAudioFilesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>53223330-EBF1-586B-A2CB-93C3B711FDA0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAudioFilesResponseBody build() {
            return new ListAudioFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAudioFilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAudioFilesResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioFileName")
        private String audioFileName;

        @com.aliyun.core.annotation.NameInMap("AudioResourceId")
        private String audioResourceId;

        @com.aliyun.core.annotation.NameInMap("AuditResult")
        private String auditResult;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OssFileKey")
        private String ossFileKey;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private String updatedTime;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private String usage;

        private List(Builder builder) {
            this.audioFileName = builder.audioFileName;
            this.audioResourceId = builder.audioResourceId;
            this.auditResult = builder.auditResult;
            this.createdTime = builder.createdTime;
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.ossFileKey = builder.ossFileKey;
            this.status = builder.status;
            this.updatedTime = builder.updatedTime;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return audioFileName
         */
        public String getAudioFileName() {
            return this.audioFileName;
        }

        /**
         * @return audioResourceId
         */
        public String getAudioResourceId() {
            return this.audioResourceId;
        }

        /**
         * @return auditResult
         */
        public String getAuditResult() {
            return this.auditResult;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ossFileKey
         */
        public String getOssFileKey() {
            return this.ossFileKey;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updatedTime
         */
        public String getUpdatedTime() {
            return this.updatedTime;
        }

        /**
         * @return usage
         */
        public String getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private String audioFileName; 
            private String audioResourceId; 
            private String auditResult; 
            private String createdTime; 
            private String instanceId; 
            private String name; 
            private String ossFileKey; 
            private String status; 
            private String updatedTime; 
            private String usage; 

            private Builder() {
            } 

            private Builder(List model) {
                this.audioFileName = model.audioFileName;
                this.audioResourceId = model.audioResourceId;
                this.auditResult = model.auditResult;
                this.createdTime = model.createdTime;
                this.instanceId = model.instanceId;
                this.name = model.name;
                this.ossFileKey = model.ossFileKey;
                this.status = model.status;
                this.updatedTime = model.updatedTime;
                this.usage = model.usage;
            } 

            /**
             * <p>Audio file name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-file.wav</p>
             */
            public Builder audioFileName(String audioFileName) {
                this.audioFileName = audioFileName;
                return this;
            }

            /**
             * <p>Audio resource ID, which is the UUID of the audio file.</p>
             * 
             * <strong>example:</strong>
             * <p>d5cd7a94-3b6a-47d2-b7fd-0b1cd839bf77</p>
             */
            public Builder audioResourceId(String audioResourceId) {
                this.audioResourceId = audioResourceId;
                return this;
            }

            /**
             * <p>Audio content threat review result.</p>
             * 
             * <strong>example:</strong>
             * <p>无</p>
             */
            public Builder auditResult(String auditResult) {
                this.auditResult = auditResult;
                return this;
            }

            /**
             * <p>The creation time of the audio resource.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-05 17:35:45.0</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>Instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ccc-test</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Display name of the audio resource.</p>
             * 
             * <strong>example:</strong>
             * <p>欢迎语</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The key of the audio resource file in OSS.</p>
             * 
             * <strong>example:</strong>
             * <p>ccc-test/test-file.wav</p>
             */
            public Builder ossFileKey(String ossFileKey) {
                this.ossFileKey = ossFileKey;
                return this;
            }

            /**
             * <p>The status of the audio file.</p>
             * 
             * <strong>example:</strong>
             * <p>Completed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Last modified time of the audio resource.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-08 15:34:49.0</p>
             */
            public Builder updatedTime(String updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            /**
             * <p>The usage of the audio file. The default value is General (used in scenarios such as IVR). Other optional values include HoldMusic (hold music during call waiting).</p>
             * 
             * <strong>example:</strong>
             * <p>General</p>
             */
            public Builder usage(String usage) {
                this.usage = usage;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAudioFilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAudioFilesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
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
            private java.util.List<List> list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of audio files.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The page number, ranging from 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The paging size, ranging from 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total count.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
