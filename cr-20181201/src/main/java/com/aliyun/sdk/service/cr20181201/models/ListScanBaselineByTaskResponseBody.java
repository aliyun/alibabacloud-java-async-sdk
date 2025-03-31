// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link ListScanBaselineByTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ListScanBaselineByTaskResponseBody</p>
 */
public class ListScanBaselineByTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScanBaselines")
    private java.util.List<ScanBaselines> scanBaselines;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListScanBaselineByTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.scanBaselines = builder.scanBaselines;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScanBaselineByTaskResponseBody create() {
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
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
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
     * @return scanBaselines
     */
    public java.util.List<ScanBaselines> getScanBaselines() {
        return this.scanBaselines;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer code; 
        private Boolean isSuccess; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<ScanBaselines> scanBaselines; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListScanBaselineByTaskResponseBody model) {
            this.code = model.code;
            this.isSuccess = model.isSuccess;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.scanBaselines = model.scanBaselines;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The return value.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Indicates whether the API request is successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: successful</li>
         * <li><code>false</code>: failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>5259118F-79E2-57E9-9AEA-551586F4FAED</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The queried baseline risks.</p>
         */
        public Builder scanBaselines(java.util.List<ScanBaselines> scanBaselines) {
            this.scanBaselines = scanBaselines;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListScanBaselineByTaskResponseBody build() {
            return new ListScanBaselineByTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListScanBaselineByTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ListScanBaselineByTaskResponseBody</p>
     */
    public static class ScanBaselines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaselineClassAlias")
        private String baselineClassAlias;

        @com.aliyun.core.annotation.NameInMap("BaselineDetailAdvice")
        private String baselineDetailAdvice;

        @com.aliyun.core.annotation.NameInMap("BaselineDetailDescription")
        private String baselineDetailDescription;

        @com.aliyun.core.annotation.NameInMap("BaselineDetailPrompt")
        private String baselineDetailPrompt;

        @com.aliyun.core.annotation.NameInMap("BaselineItemCount")
        private Integer baselineItemCount;

        @com.aliyun.core.annotation.NameInMap("BaselineNameAlias")
        private String baselineNameAlias;

        @com.aliyun.core.annotation.NameInMap("BaselineNameKey")
        private String baselineNameKey;

        @com.aliyun.core.annotation.NameInMap("BaselineNameLevel")
        private String baselineNameLevel;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("FirstScanTime")
        private Long firstScanTime;

        @com.aliyun.core.annotation.NameInMap("HighRiskItemCount")
        private Integer highRiskItemCount;

        @com.aliyun.core.annotation.NameInMap("LowRiskItemCount")
        private Integer lowRiskItemCount;

        @com.aliyun.core.annotation.NameInMap("MiddleRiskItemCount")
        private Integer middleRiskItemCount;

        @com.aliyun.core.annotation.NameInMap("ScanTaskId")
        private String scanTaskId;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private ScanBaselines(Builder builder) {
            this.baselineClassAlias = builder.baselineClassAlias;
            this.baselineDetailAdvice = builder.baselineDetailAdvice;
            this.baselineDetailDescription = builder.baselineDetailDescription;
            this.baselineDetailPrompt = builder.baselineDetailPrompt;
            this.baselineItemCount = builder.baselineItemCount;
            this.baselineNameAlias = builder.baselineNameAlias;
            this.baselineNameKey = builder.baselineNameKey;
            this.baselineNameLevel = builder.baselineNameLevel;
            this.createTime = builder.createTime;
            this.firstScanTime = builder.firstScanTime;
            this.highRiskItemCount = builder.highRiskItemCount;
            this.lowRiskItemCount = builder.lowRiskItemCount;
            this.middleRiskItemCount = builder.middleRiskItemCount;
            this.scanTaskId = builder.scanTaskId;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScanBaselines create() {
            return builder().build();
        }

        /**
         * @return baselineClassAlias
         */
        public String getBaselineClassAlias() {
            return this.baselineClassAlias;
        }

        /**
         * @return baselineDetailAdvice
         */
        public String getBaselineDetailAdvice() {
            return this.baselineDetailAdvice;
        }

        /**
         * @return baselineDetailDescription
         */
        public String getBaselineDetailDescription() {
            return this.baselineDetailDescription;
        }

        /**
         * @return baselineDetailPrompt
         */
        public String getBaselineDetailPrompt() {
            return this.baselineDetailPrompt;
        }

        /**
         * @return baselineItemCount
         */
        public Integer getBaselineItemCount() {
            return this.baselineItemCount;
        }

        /**
         * @return baselineNameAlias
         */
        public String getBaselineNameAlias() {
            return this.baselineNameAlias;
        }

        /**
         * @return baselineNameKey
         */
        public String getBaselineNameKey() {
            return this.baselineNameKey;
        }

        /**
         * @return baselineNameLevel
         */
        public String getBaselineNameLevel() {
            return this.baselineNameLevel;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return firstScanTime
         */
        public Long getFirstScanTime() {
            return this.firstScanTime;
        }

        /**
         * @return highRiskItemCount
         */
        public Integer getHighRiskItemCount() {
            return this.highRiskItemCount;
        }

        /**
         * @return lowRiskItemCount
         */
        public Integer getLowRiskItemCount() {
            return this.lowRiskItemCount;
        }

        /**
         * @return middleRiskItemCount
         */
        public Integer getMiddleRiskItemCount() {
            return this.middleRiskItemCount;
        }

        /**
         * @return scanTaskId
         */
        public String getScanTaskId() {
            return this.scanTaskId;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String baselineClassAlias; 
            private String baselineDetailAdvice; 
            private String baselineDetailDescription; 
            private String baselineDetailPrompt; 
            private Integer baselineItemCount; 
            private String baselineNameAlias; 
            private String baselineNameKey; 
            private String baselineNameLevel; 
            private Long createTime; 
            private Long firstScanTime; 
            private Integer highRiskItemCount; 
            private Integer lowRiskItemCount; 
            private Integer middleRiskItemCount; 
            private String scanTaskId; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(ScanBaselines model) {
                this.baselineClassAlias = model.baselineClassAlias;
                this.baselineDetailAdvice = model.baselineDetailAdvice;
                this.baselineDetailDescription = model.baselineDetailDescription;
                this.baselineDetailPrompt = model.baselineDetailPrompt;
                this.baselineItemCount = model.baselineItemCount;
                this.baselineNameAlias = model.baselineNameAlias;
                this.baselineNameKey = model.baselineNameKey;
                this.baselineNameLevel = model.baselineNameLevel;
                this.createTime = model.createTime;
                this.firstScanTime = model.firstScanTime;
                this.highRiskItemCount = model.highRiskItemCount;
                this.lowRiskItemCount = model.lowRiskItemCount;
                this.middleRiskItemCount = model.middleRiskItemCount;
                this.scanTaskId = model.scanTaskId;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The category of the baseline risk.</p>
             */
            public Builder baselineClassAlias(String baselineClassAlias) {
                this.baselineClassAlias = baselineClassAlias;
                return this;
            }

            /**
             * <p>The suggestion on handling the baseline risk.</p>
             */
            public Builder baselineDetailAdvice(String baselineDetailAdvice) {
                this.baselineDetailAdvice = baselineDetailAdvice;
                return this;
            }

            /**
             * <p>The description of the baseline risk.</p>
             */
            public Builder baselineDetailDescription(String baselineDetailDescription) {
                this.baselineDetailDescription = baselineDetailDescription;
                return this;
            }

            /**
             * <p>The path and content of the baseline risk.</p>
             * 
             * <strong>example:</strong>
             * <p>usr/local/www/project/environments/dev/common/config/paramsxxx</p>
             */
            public Builder baselineDetailPrompt(String baselineDetailPrompt) {
                this.baselineDetailPrompt = baselineDetailPrompt;
                return this;
            }

            /**
             * <p>The number of baseline risks.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder baselineItemCount(Integer baselineItemCount) {
                this.baselineItemCount = baselineItemCount;
                return this;
            }

            /**
             * <p>The name of the baseline risk.</p>
             */
            public Builder baselineNameAlias(String baselineNameAlias) {
                this.baselineNameAlias = baselineNameAlias;
                return this;
            }

            /**
             * <p>The name of the baseline risk.</p>
             * 
             * <strong>example:</strong>
             * <p>ak_leak</p>
             */
            public Builder baselineNameKey(String baselineNameKey) {
                this.baselineNameKey = baselineNameKey;
                return this;
            }

            /**
             * <p>The severity of the baseline risk.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder baselineNameLevel(String baselineNameLevel) {
                this.baselineNameLevel = baselineNameLevel;
                return this;
            }

            /**
             * <p>The time when the image was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1695090008000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the image was first scanned.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-04-10 15:33:26</p>
             */
            public Builder firstScanTime(Long firstScanTime) {
                this.firstScanTime = firstScanTime;
                return this;
            }

            /**
             * <p>The quantity of baseline risks whose severity is high.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder highRiskItemCount(Integer highRiskItemCount) {
                this.highRiskItemCount = highRiskItemCount;
                return this;
            }

            /**
             * <p>The quantity of baseline risks whose severity is low.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder lowRiskItemCount(Integer lowRiskItemCount) {
                this.lowRiskItemCount = lowRiskItemCount;
                return this;
            }

            /**
             * <p>The quantity of baseline risks whose severity is medium.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder middleRiskItemCount(Integer middleRiskItemCount) {
                this.middleRiskItemCount = middleRiskItemCount;
                return this;
            }

            /**
             * <p>The ID of the image scan task.</p>
             * 
             * <strong>example:</strong>
             * <p>2328fcaa-f28a-405d-a357-asdvfrew23</p>
             */
            public Builder scanTaskId(String scanTaskId) {
                this.scanTaskId = scanTaskId;
                return this;
            }

            /**
             * <p>The time when the image was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1684220824226</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public ScanBaselines build() {
                return new ScanBaselines(this);
            } 

        } 

    }
}
