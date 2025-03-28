// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link DescribeDtsEtlJobVersionInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDtsEtlJobVersionInfoResponseBody</p>
 */
public class DescribeDtsEtlJobVersionInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DtsEtlJobVersionInfos")
    private java.util.List<DtsEtlJobVersionInfos> dtsEtlJobVersionInfos;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dtsEtlJobVersionInfos
     */
    public java.util.List<DtsEtlJobVersionInfos> getDtsEtlJobVersionInfos() {
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
        private java.util.List<DtsEtlJobVersionInfos> dtsEtlJobVersionInfos; 
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

        private Builder() {
        } 

        private Builder(DescribeDtsEtlJobVersionInfoResponseBody model) {
            this.dtsEtlJobVersionInfos = model.dtsEtlJobVersionInfos;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The details of ETL tasks.</p>
         */
        public Builder dtsEtlJobVersionInfos(java.util.List<DtsEtlJobVersionInfos> dtsEtlJobVersionInfos) {
            this.dtsEtlJobVersionInfos = dtsEtlJobVersionInfos;
            return this;
        }

        /**
         * <p>The dynamic error code.</p>
         * 
         * <strong>example:</strong>
         * <p>403</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic part in the error message.</p>
         * 
         * <strong>example:</strong>
         * <p>present environment is not support,so skip</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The error code. This example indicates that the specified ETL task ID is invalid.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidJobId</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message. This example indicates that the specified ETL task ID does not exist. In this case, the ETL task may have been deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified dts job id %s is not exists.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The page number of the returned page. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of records returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>224DB9F7-3100-4899-AB9C-C938BCCB43E7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. If the call failed, false is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeDtsEtlJobVersionInfoResponseBody build() {
            return new DescribeDtsEtlJobVersionInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDtsEtlJobVersionInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsEtlJobVersionInfoResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(DtsEtlJobVersionInfos model) {
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.creatorName = model.creatorName;
                this.dtsInstanceId = model.dtsInstanceId;
                this.dtsJobId = model.dtsJobId;
                this.dtsJobName = model.dtsJobName;
                this.modifyTime = model.modifyTime;
                this.safeCheckpoint = model.safeCheckpoint;
                this.status = model.status;
                this.version = model.version;
            } 

            /**
             * <p>The time when the ETL task was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1637229315000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>10000000</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The username of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p><em><strong>@</strong></em>*.com</p>
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * <p>The ID of the DTS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtsg******gd</p>
             */
            public Builder dtsInstanceId(String dtsInstanceId) {
                this.dtsInstanceId = dtsInstanceId;
                return this;
            }

            /**
             * <p>The ID of the ETL task.</p>
             * 
             * <strong>example:</strong>
             * <p>l5512es7w15****</p>
             */
            public Builder dtsJobId(String dtsJobId) {
                this.dtsJobId = dtsJobId;
                return this;
            }

            /**
             * <p>The name of the ETL task.</p>
             * 
             * <strong>example:</strong>
             * <p>test_sql</p>
             */
            public Builder dtsJobName(String dtsJobName) {
                this.dtsJobName = dtsJobName;
                return this;
            }

            /**
             * <p>The time when the ETL task was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1637230117000</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The safe checkpoint of the ETL task.</p>
             * 
             * <strong>example:</strong>
             * <p>1637230117000</p>
             */
            public Builder safeCheckpoint(String safeCheckpoint) {
                this.safeCheckpoint = safeCheckpoint;
                return this;
            }

            /**
             * <p>The log level. Valid values: ERROR, WARN, INFO, and DEBUG.</p>
             * 
             * <strong>example:</strong>
             * <p>INFO</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The version number of the ETL task.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
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
