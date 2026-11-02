// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link QueryDNAJobListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDNAJobListResponseBody</p>
 */
public class QueryDNAJobListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobList")
    private java.util.List<JobList> jobList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryDNAJobListResponseBody(Builder builder) {
        this.jobList = builder.jobList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDNAJobListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobList
     */
    public java.util.List<JobList> getJobList() {
        return this.jobList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<JobList> jobList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryDNAJobListResponseBody model) {
            this.jobList = model.jobList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The DNA job information.</p>
         */
        public Builder jobList(java.util.List<JobList> jobList) {
            this.jobList = jobList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4A13-BEF6-D7393642CA58</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryDNAJobListResponseBody build() {
            return new QueryDNAJobListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDNAJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDNAJobListResponseBody</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Media")
        private String media;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Input(Builder builder) {
            this.media = builder.media;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return media
         */
        public String getMedia() {
            return this.media;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String media; 
            private String type; 

            private Builder() {
            } 

            private Builder(Input model) {
                this.media = model.media;
                this.type = model.type;
            } 

            /**
             * <p>The information about the input file. Both OSS URLs and media asset IDs are supported.
             * An OSS URL must be in one of the following formats:</p>
             * <ul>
             * <li>oss://bucket/object</li>
             * <li>http(s)://bucket.oss-[regionId].aliyuncs.com/object</li>
             * </ul>
             * <p>In the formats, bucket is the name of the OSS bucket that resides in the same region as the current project, and object is the file path.</p>
             * 
             * <strong>example:</strong>
             * <p>1b1b9cd148034739af413150fded****</p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>The type of the input file. Valid values:</p>
             * <ul>
             * <li>OSS: the URL of an OSS object.</li>
             * <li>Media: the ID of a media asset.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Media</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDNAJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDNAJobListResponseBody</p>
     */
    public static class JobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DBId")
        private String DBId;

        @com.aliyun.core.annotation.NameInMap("DNAResult")
        private String DNAResult;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Input")
        private Input input;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("PrimaryKey")
        private String primaryKey;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private JobList(Builder builder) {
            this.code = builder.code;
            this.config = builder.config;
            this.creationTime = builder.creationTime;
            this.DBId = builder.DBId;
            this.DNAResult = builder.DNAResult;
            this.finishTime = builder.finishTime;
            this.id = builder.id;
            this.input = builder.input;
            this.message = builder.message;
            this.primaryKey = builder.primaryKey;
            this.status = builder.status;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return DBId
         */
        public String getDBId() {
            return this.DBId;
        }

        /**
         * @return DNAResult
         */
        public String getDNAResult() {
            return this.DNAResult;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return input
         */
        public Input getInput() {
            return this.input;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return primaryKey
         */
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private String code; 
            private String config; 
            private String creationTime; 
            private String DBId; 
            private String DNAResult; 
            private String finishTime; 
            private String id; 
            private Input input; 
            private String message; 
            private String primaryKey; 
            private String status; 
            private String userData; 

            private Builder() {
            } 

            private Builder(JobList model) {
                this.code = model.code;
                this.config = model.config;
                this.creationTime = model.creationTime;
                this.DBId = model.DBId;
                this.DNAResult = model.DNAResult;
                this.finishTime = model.finishTime;
                this.id = model.id;
                this.input = model.input;
                this.message = model.message;
                this.primaryKey = model.primaryKey;
                this.status = model.status;
                this.userData = model.userData;
            } 

            /**
             * <p>The error code returned for the job execution.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;InvalidParameter.ResourceNotFound&quot;</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The DNA configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;SaveType&quot;: &quot;save&quot;,&quot;MediaType&quot;&quot;:&quot;video&quot;}</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The time when the job was created. The time follows the ISO 8601 standard and is displayed in UTC (ending with Z).</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-28T03:21:37Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The ID of the DNA library.</p>
             * 
             * <strong>example:</strong>
             * <p>2288c6ca184c0e47098a5b665e2a12****</p>
             */
            public Builder DBId(String DBId) {
                this.DBId = DBId;
                return this;
            }

            /**
             * <p>The URL of the DNA result.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://test_bucket.oss-cn-shanghai.aliyuncs.com/fingerprint/video/search_result/5/5.txt">http://test_bucket.oss-cn-shanghai.aliyuncs.com/fingerprint/video/search_result/5/5.txt</a></p>
             */
            public Builder DNAResult(String DNAResult) {
                this.DNAResult = DNAResult;
                return this;
            }

            /**
             * <p>The time when the job was completed. The time follows the ISO 8601 standard and is displayed in UTC (ending with Z).</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-28T03:21:44Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>88c6ca184c0e47098a5b665e2a12****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The input file.</p>
             */
            public Builder input(Input input) {
                this.input = input;
                return this;
            }

            /**
             * <p>The error message returned for the job execution.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;The resource operated \&quot;a887d0b***d805ef6f7f6786302\&quot; cannot be found&quot;</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The unique primary key of the video. You must ensure the uniqueness of the primary key.</p>
             * 
             * <strong>example:</strong>
             * <p>3ca84a39a9024f19853b21be9cf9****</p>
             */
            public Builder primaryKey(String primaryKey) {
                this.primaryKey = primaryKey;
                return this;
            }

            /**
             * <p>The status of the job. Valid values:</p>
             * <ul>
             * <li><strong>Queuing</strong>: The job is queued.</li>
             * <li><strong>Analysing</strong>: The job is being analyzed.</li>
             * <li><strong>Success</strong>: The job succeeded.</li>
             * <li><strong>Fail</strong>: The job failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Queuing</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The custom user data.</p>
             * 
             * <strong>example:</strong>
             * <p>testdna</p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public JobList build() {
                return new JobList(this);
            } 

        } 

    }
}
