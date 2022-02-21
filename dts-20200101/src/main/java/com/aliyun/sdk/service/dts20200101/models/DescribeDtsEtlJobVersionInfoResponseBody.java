// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDtsEtlJobVersionInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDtsEtlJobVersionInfoResponseBody</p>
 */
public class DescribeDtsEtlJobVersionInfoResponseBody extends TeaModel {
    @NameInMap("DtsEtlJobVersionInfos")
    private java.util.List < DtsEtlJobVersionInfos> dtsEtlJobVersionInfos;

    @NameInMap("DynamicCode")
    private String dynamicCode;

    @NameInMap("DynamicMessage")
    private String dynamicMessage;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalRecordCount")
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
         * DtsEtlJobVersionInfos.
         */
        public Builder dtsEtlJobVersionInfos(java.util.List < DtsEtlJobVersionInfos> dtsEtlJobVersionInfos) {
            this.dtsEtlJobVersionInfos = dtsEtlJobVersionInfos;
            return this;
        }

        /**
         * DynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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

        /**
         * TotalRecordCount.
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
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Creator")
        private String creator;

        @NameInMap("CreatorName")
        private String creatorName;

        @NameInMap("DtsInstanceId")
        private String dtsInstanceId;

        @NameInMap("DtsJobId")
        private String dtsJobId;

        @NameInMap("DtsJobName")
        private String dtsJobName;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("SafeCheckpoint")
        private String safeCheckpoint;

        @NameInMap("Status")
        private String status;

        @NameInMap("Version")
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
             * CreatorName.
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * DtsInstanceId.
             */
            public Builder dtsInstanceId(String dtsInstanceId) {
                this.dtsInstanceId = dtsInstanceId;
                return this;
            }

            /**
             * DtsJobId.
             */
            public Builder dtsJobId(String dtsJobId) {
                this.dtsJobId = dtsJobId;
                return this;
            }

            /**
             * DtsJobName.
             */
            public Builder dtsJobName(String dtsJobName) {
                this.dtsJobName = dtsJobName;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * SafeCheckpoint.
             */
            public Builder safeCheckpoint(String safeCheckpoint) {
                this.safeCheckpoint = safeCheckpoint;
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
             * Version.
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
