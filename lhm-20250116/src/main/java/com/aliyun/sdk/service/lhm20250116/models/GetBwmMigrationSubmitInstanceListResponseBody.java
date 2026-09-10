// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link GetBwmMigrationSubmitInstanceListResponseBody} extends {@link TeaModel}
 *
 * <p>GetBwmMigrationSubmitInstanceListResponseBody</p>
 */
public class GetBwmMigrationSubmitInstanceListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("empty")
    private Boolean empty;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("notEmpty")
    private Boolean notEmpty;

    @com.aliyun.core.annotation.NameInMap("pageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("totalPages")
    private Integer totalPages;

    private GetBwmMigrationSubmitInstanceListResponseBody(Builder builder) {
        this.data = builder.data;
        this.empty = builder.empty;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.notEmpty = builder.notEmpty;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBwmMigrationSubmitInstanceListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return empty
     */
    public Boolean getEmpty() {
        return this.empty;
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
     * @return notEmpty
     */
    public Boolean getNotEmpty() {
        return this.notEmpty;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return totalPages
     */
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private Boolean empty; 
        private String errCode; 
        private String errMessage; 
        private Boolean notEmpty; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 
        private Integer totalPages; 

        private Builder() {
        } 

        private Builder(GetBwmMigrationSubmitInstanceListResponseBody model) {
            this.data = model.data;
            this.empty = model.empty;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.notEmpty = model.notEmpty;
            this.pageIndex = model.pageIndex;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
            this.totalPages = model.totalPages;
        } 

        /**
         * <p>The response data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Indicates whether the result is empty.</p>
         */
        public Builder empty(Boolean empty) {
            this.empty = empty;
            return this;
        }

        /**
         * <p>The error code. An empty string is returned if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message. An empty string is returned if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>Indicates whether the result is not empty.</p>
         */
        public Builder notEmpty(Boolean notEmpty) {
            this.notEmpty = notEmpty;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. A value of true indicates success. A value of false indicates failure. If the call fails, use errCode and errMessage to troubleshoot the issue.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public GetBwmMigrationSubmitInstanceListResponseBody build() {
            return new GetBwmMigrationSubmitInstanceListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetBwmMigrationSubmitInstanceListResponseBody} extends {@link TeaModel}
     *
     * <p>GetBwmMigrationSubmitInstanceListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("gmtConvert")
        private String gmtConvert;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("instanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("srcMetaGmtUpdate")
        private String srcMetaGmtUpdate;

        @com.aliyun.core.annotation.NameInMap("srcMetaInfo")
        private String srcMetaInfo;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Data(Builder builder) {
            this.detail = builder.detail;
            this.gmtConvert = builder.gmtConvert;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.srcMetaGmtUpdate = builder.srcMetaGmtUpdate;
            this.srcMetaInfo = builder.srcMetaInfo;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return gmtConvert
         */
        public String getGmtConvert() {
            return this.gmtConvert;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return srcMetaGmtUpdate
         */
        public String getSrcMetaGmtUpdate() {
            return this.srcMetaGmtUpdate;
        }

        /**
         * @return srcMetaInfo
         */
        public String getSrcMetaInfo() {
            return this.srcMetaInfo;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String detail; 
            private String gmtConvert; 
            private String instanceId; 
            private String instanceName; 
            private String srcMetaGmtUpdate; 
            private String srcMetaInfo; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.detail = model.detail;
                this.gmtConvert = model.gmtConvert;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.srcMetaGmtUpdate = model.srcMetaGmtUpdate;
                this.srcMetaInfo = model.srcMetaInfo;
                this.status = model.status;
            } 

            /**
             * <p>The reason for the conversion failure.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The conversion execution time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-01 00:00:00</p>
             */
            public Builder gmtConvert(String gmtConvert) {
                this.gmtConvert = gmtConvert;
                return this;
            }

            /**
             * <p>The UUID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>instance-1</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The time when the source metadata was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-01 00:00:00</p>
             */
            public Builder srcMetaGmtUpdate(String srcMetaGmtUpdate) {
                this.srcMetaGmtUpdate = srcMetaGmtUpdate;
                return this;
            }

            /**
             * <p>The scheduling information of the source.</p>
             * 
             * <strong>example:</strong>
             * <p>source-info</p>
             */
            public Builder srcMetaInfo(String srcMetaInfo) {
                this.srcMetaInfo = srcMetaInfo;
                return this;
            }

            /**
             * <p>The execution status of the instance. Valid values:</p>
             * <ul>
             * <li>NOT_START: Not started.</li>
             * <li>READY: Pending execution.</li>
             * <li>RUNNING: Running.</li>
             * <li>ALL_SUCCESS: All succeeded.</li>
             * <li>PARTIAL_SUCCESS: Partially succeeded.</li>
             * <li>FAILURE: Failed.</li>
             * <li>MANUAL: Manually uploaded.</li>
             * </ul>
             * <p>If the status code cannot be recognized, the value defaults to NOT_START.</p>
             * 
             * <strong>example:</strong>
             * <p>NOT_START</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
