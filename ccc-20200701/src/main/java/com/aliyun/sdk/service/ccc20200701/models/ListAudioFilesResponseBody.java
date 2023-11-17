// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAudioFilesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAudioFilesResponseBody</p>
 */
public class ListAudioFilesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
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

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public ListAudioFilesResponseBody build() {
            return new ListAudioFilesResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("AudioFileName")
        private String audioFileName;

        @NameInMap("AudioResourceId")
        private String audioResourceId;

        @NameInMap("AuditResult")
        private String auditResult;

        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Name")
        private String name;

        @NameInMap("OssFileKey")
        private String ossFileKey;

        @NameInMap("Status")
        private String status;

        @NameInMap("UpdatedTime")
        private String updatedTime;

        @NameInMap("Usage")
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

            /**
             * AudioFileName.
             */
            public Builder audioFileName(String audioFileName) {
                this.audioFileName = audioFileName;
                return this;
            }

            /**
             * AudioResourceId.
             */
            public Builder audioResourceId(String audioResourceId) {
                this.audioResourceId = audioResourceId;
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
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OssFileKey.
             */
            public Builder ossFileKey(String ossFileKey) {
                this.ossFileKey = ossFileKey;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UpdatedTime.
             */
            public Builder updatedTime(String updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            /**
             * Usage.
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
    public static class Data extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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
        public java.util.List < List> getList() {
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
            private java.util.List < List> list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
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
             * TotalCount.
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
