// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDtsEtlJobVersionInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDtsEtlJobVersionInfoResponseBody</p>
 */
public class DescribeDtsEtlJobVersionInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DtsEtlJobVersionInfos")
    private java.util.List < DtsEtlJobVersionInfos> dtsEtlJobVersionInfos;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeDtsEtlJobVersionInfoResponseBody(Builder builder) {
        this.dtsEtlJobVersionInfos = builder.dtsEtlJobVersionInfos;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDtsEtlJobVersionInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return dtsEtlJobVersionInfos
     */
    public java.util.List < DtsEtlJobVersionInfos> getDtsEtlJobVersionInfos() {
        return this.dtsEtlJobVersionInfos;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
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
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List < DtsEtlJobVersionInfos> dtsEtlJobVersionInfos; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private String errCode; 
        private String errMessage; 
        private String httpStatusCode; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Boolean success; 
        private Integer totalRecordCount; 

        /**
         * The details of ETL tasks.
         */
        public Builder dtsEtlJobVersionInfos(java.util.List < DtsEtlJobVersionInfos> dtsEtlJobVersionInfos) {
            this.dtsEtlJobVersionInfos = dtsEtlJobVersionInfos;
            return this;
        }

        /**
         * The dynamic error code.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * The dynamic part in the error message.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * The error code. This example indicates that the specified ETL task ID is invalid.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * The error message. This example indicates that the specified ETL task ID does not exist. In this case, the ETL task may have been deleted.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The page number of the returned page. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of records returned on the current page.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * Indicates whether the call was successful. If the call failed, false is returned.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of records.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeDtsEtlJobVersionInfoResponseBody build() {
            return new DescribeDtsEtlJobVersionInfoResponseBody(this);
        } 

    } 

    public static class DtsEtlJobVersionInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("CreatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("DtsInstanceId")
        private String dtsInstanceId;

        @com.aliyun.core.annotation.NameInMap("DtsJobId")
        private String dtsJobId;

        @com.aliyun.core.annotation.NameInMap("DtsJobName")
        private String dtsJobName;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("SafeCheckpoint")
        private String safeCheckpoint;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        private DtsEtlJobVersionInfos(Builder builder) {
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.creatorName = builder.creatorName;
            this.dtsInstanceId = builder.dtsInstanceId;
            this.dtsJobId = builder.dtsJobId;
            this.dtsJobName = builder.dtsJobName;
            this.modifyTime = builder.modifyTime;
            this.safeCheckpoint = builder.safeCheckpoint;
            this.status = builder.status;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DtsEtlJobVersionInfos create() {
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
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return dtsInstanceId
         */
        public String getDtsInstanceId() {
            return this.dtsInstanceId;
        }

        /**
         * @return dtsJobId
         */
        public String getDtsJobId() {
            return this.dtsJobId;
        }

        /**
         * @return dtsJobName
         */
        public String getDtsJobName() {
            return this.dtsJobName;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return safeCheckpoint
         */
        public String getSafeCheckpoint() {
            return this.safeCheckpoint;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String createTime; 
            private String creator; 
            private String creatorName; 
            private String dtsInstanceId; 
            private String dtsJobId; 
            private String dtsJobName; 
            private String modifyTime; 
            private String safeCheckpoint; 
            private String status; 
            private Integer version; 

            /**
             * The time when the ETL task was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * The username of the creator.
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * The ID of the DTS instance.
             */
            public Builder dtsInstanceId(String dtsInstanceId) {
                this.dtsInstanceId = dtsInstanceId;
                return this;
            }

            /**
             * The ID of the ETL task.
             */
            public Builder dtsJobId(String dtsJobId) {
                this.dtsJobId = dtsJobId;
                return this;
            }

            /**
             * The name of the ETL task.
             */
            public Builder dtsJobName(String dtsJobName) {
                this.dtsJobName = dtsJobName;
                return this;
            }

            /**
             * The time when the ETL task was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * The safe checkpoint of the ETL task.
             */
            public Builder safeCheckpoint(String safeCheckpoint) {
                this.safeCheckpoint = safeCheckpoint;
                return this;
            }

            /**
             * The log level. Valid values: ERROR, WARN, INFO, and DEBUG.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The version number of the ETL task.
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public DtsEtlJobVersionInfos build() {
                return new DtsEtlJobVersionInfos(this);
            } 

        } 

    }
}
