// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeApsJobsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApsJobsResponseBody</p>
 */
public class DescribeApsJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("APSJobs")
    private java.util.List<APSJobs> APSJobs;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeApsJobsResponseBody(Builder builder) {
        this.APSJobs = builder.APSJobs;
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApsJobsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return APSJobs
     */
    public java.util.List<APSJobs> getAPSJobs() {
        return this.APSJobs;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
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

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<APSJobs> APSJobs; 
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private Boolean success; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(DescribeApsJobsResponseBody model) {
            this.APSJobs = model.APSJobs;
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The queried APS jobs.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder APSJobs(java.util.List<APSJobs> APSJobs) {
            this.APSJobs = APSJobs;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The status code. A value of 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The returned message. Valid values:</p>
         * <ul>
         * <li>If the request was successful, a success message is returned.****</li>
         * <li>If the request failed, an error message is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>-7F9D-5DBD-993E-</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeApsJobsResponseBody build() {
            return new DescribeApsJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApsJobsResponseBody</p>
     */
    public static class APSJobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApsJobId")
        private String apsJobId;

        @com.aliyun.core.annotation.NameInMap("ApsJobName")
        private String apsJobName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Delay")
        private Long delay;

        @com.aliyun.core.annotation.NameInMap("DestinationInstanceID")
        private String destinationInstanceID;

        @com.aliyun.core.annotation.NameInMap("ErrMessage")
        private String errMessage;

        @com.aliyun.core.annotation.NameInMap("Projress")
        private String projress;

        @com.aliyun.core.annotation.NameInMap("SourceInstanceID")
        private String sourceInstanceID;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubStatus")
        private String subStatus;

        private APSJobs(Builder builder) {
            this.apsJobId = builder.apsJobId;
            this.apsJobName = builder.apsJobName;
            this.createTime = builder.createTime;
            this.delay = builder.delay;
            this.destinationInstanceID = builder.destinationInstanceID;
            this.errMessage = builder.errMessage;
            this.projress = builder.projress;
            this.sourceInstanceID = builder.sourceInstanceID;
            this.status = builder.status;
            this.subStatus = builder.subStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static APSJobs create() {
            return builder().build();
        }

        /**
         * @return apsJobId
         */
        public String getApsJobId() {
            return this.apsJobId;
        }

        /**
         * @return apsJobName
         */
        public String getApsJobName() {
            return this.apsJobName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return delay
         */
        public Long getDelay() {
            return this.delay;
        }

        /**
         * @return destinationInstanceID
         */
        public String getDestinationInstanceID() {
            return this.destinationInstanceID;
        }

        /**
         * @return errMessage
         */
        public String getErrMessage() {
            return this.errMessage;
        }

        /**
         * @return projress
         */
        public String getProjress() {
            return this.projress;
        }

        /**
         * @return sourceInstanceID
         */
        public String getSourceInstanceID() {
            return this.sourceInstanceID;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subStatus
         */
        public String getSubStatus() {
            return this.subStatus;
        }

        public static final class Builder {
            private String apsJobId; 
            private String apsJobName; 
            private String createTime; 
            private Long delay; 
            private String destinationInstanceID; 
            private String errMessage; 
            private String projress; 
            private String sourceInstanceID; 
            private String status; 
            private String subStatus; 

            private Builder() {
            } 

            private Builder(APSJobs model) {
                this.apsJobId = model.apsJobId;
                this.apsJobName = model.apsJobName;
                this.createTime = model.createTime;
                this.delay = model.delay;
                this.destinationInstanceID = model.destinationInstanceID;
                this.errMessage = model.errMessage;
                this.projress = model.projress;
                this.sourceInstanceID = model.sourceInstanceID;
                this.status = model.status;
                this.subStatus = model.subStatus;
            } 

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>aps-******</p>
             */
            public Builder apsJobId(String apsJobId) {
                this.apsJobId = apsJobId;
                return this;
            }

            /**
             * <p>The name of the APS job.</p>
             * 
             * <strong>example:</strong>
             * <p>data-sync-******</p>
             */
            public Builder apsJobName(String apsJobName) {
                this.apsJobName = apsJobName;
                return this;
            }

            /**
             * <p>The time when the APS job was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-06-28 15:00:04</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The synchronization latency.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder delay(Long delay) {
                this.delay = delay;
                return this;
            }

            /**
             * <p>The destination cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>amv-*******</p>
             */
            public Builder destinationInstanceID(String destinationInstanceID) {
                this.destinationInstanceID = destinationInstanceID;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder errMessage(String errMessage) {
                this.errMessage = errMessage;
                return this;
            }

            /**
             * <p>The progress.</p>
             */
            public Builder projress(String projress) {
                this.projress = projress;
                return this;
            }

            /**
             * <p>The ID of the source instance or cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-******</p>
             */
            public Builder sourceInstanceID(String sourceInstanceID) {
                this.sourceInstanceID = sourceInstanceID;
                return this;
            }

            /**
             * <p>The status of the APS job.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The status of the task.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder subStatus(String subStatus) {
                this.subStatus = subStatus;
                return this;
            }

            public APSJobs build() {
                return new APSJobs(this);
            } 

        } 

    }
}
