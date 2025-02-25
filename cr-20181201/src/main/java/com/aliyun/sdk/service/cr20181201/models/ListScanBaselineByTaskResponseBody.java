// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListScanBaselineByTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ListScanBaselineByTaskResponseBody</p>
 */
public class ListScanBaselineByTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("PageNo")
    private Integer pageNo;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScanBaselines")
    private java.util.List < ScanBaselines> scanBaselines;

    @NameInMap("TotalCount")
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
    public java.util.List < ScanBaselines> getScanBaselines() {
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
        private java.util.List < ScanBaselines> scanBaselines; 
        private Integer totalCount; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * IsSuccess.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ScanBaselines.
         */
        public Builder scanBaselines(java.util.List < ScanBaselines> scanBaselines) {
            this.scanBaselines = scanBaselines;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListScanBaselineByTaskResponseBody build() {
            return new ListScanBaselineByTaskResponseBody(this);
        } 

    } 

    public static class ScanBaselines extends TeaModel {
        @NameInMap("BaselineClassAlias")
        private String baselineClassAlias;

        @NameInMap("BaselineDetailAdvice")
        private String baselineDetailAdvice;

        @NameInMap("BaselineDetailDescription")
        private String baselineDetailDescription;

        @NameInMap("BaselineDetailPrompt")
        private String baselineDetailPrompt;

        @NameInMap("BaselineItemCount")
        private Integer baselineItemCount;

        @NameInMap("BaselineNameAlias")
        private String baselineNameAlias;

        @NameInMap("BaselineNameKey")
        private String baselineNameKey;

        @NameInMap("BaselineNameLevel")
        private String baselineNameLevel;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("FirstScanTime")
        private Long firstScanTime;

        @NameInMap("HighRiskItemCount")
        private Integer highRiskItemCount;

        @NameInMap("LowRiskItemCount")
        private Integer lowRiskItemCount;

        @NameInMap("MiddleRiskItemCount")
        private Integer middleRiskItemCount;

        @NameInMap("ScanTaskId")
        private String scanTaskId;

        @NameInMap("UpdateTime")
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

            /**
             * BaselineClassAlias.
             */
            public Builder baselineClassAlias(String baselineClassAlias) {
                this.baselineClassAlias = baselineClassAlias;
                return this;
            }

            /**
             * BaselineDetailAdvice.
             */
            public Builder baselineDetailAdvice(String baselineDetailAdvice) {
                this.baselineDetailAdvice = baselineDetailAdvice;
                return this;
            }

            /**
             * BaselineDetailDescription.
             */
            public Builder baselineDetailDescription(String baselineDetailDescription) {
                this.baselineDetailDescription = baselineDetailDescription;
                return this;
            }

            /**
             * BaselineDetailPrompt.
             */
            public Builder baselineDetailPrompt(String baselineDetailPrompt) {
                this.baselineDetailPrompt = baselineDetailPrompt;
                return this;
            }

            /**
             * BaselineItemCount.
             */
            public Builder baselineItemCount(Integer baselineItemCount) {
                this.baselineItemCount = baselineItemCount;
                return this;
            }

            /**
             * BaselineNameAlias.
             */
            public Builder baselineNameAlias(String baselineNameAlias) {
                this.baselineNameAlias = baselineNameAlias;
                return this;
            }

            /**
             * BaselineNameKey.
             */
            public Builder baselineNameKey(String baselineNameKey) {
                this.baselineNameKey = baselineNameKey;
                return this;
            }

            /**
             * BaselineNameLevel.
             */
            public Builder baselineNameLevel(String baselineNameLevel) {
                this.baselineNameLevel = baselineNameLevel;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * FirstScanTime.
             */
            public Builder firstScanTime(Long firstScanTime) {
                this.firstScanTime = firstScanTime;
                return this;
            }

            /**
             * HighRiskItemCount.
             */
            public Builder highRiskItemCount(Integer highRiskItemCount) {
                this.highRiskItemCount = highRiskItemCount;
                return this;
            }

            /**
             * LowRiskItemCount.
             */
            public Builder lowRiskItemCount(Integer lowRiskItemCount) {
                this.lowRiskItemCount = lowRiskItemCount;
                return this;
            }

            /**
             * MiddleRiskItemCount.
             */
            public Builder middleRiskItemCount(Integer middleRiskItemCount) {
                this.middleRiskItemCount = middleRiskItemCount;
                return this;
            }

            /**
             * ScanTaskId.
             */
            public Builder scanTaskId(String scanTaskId) {
                this.scanTaskId = scanTaskId;
                return this;
            }

            /**
             * UpdateTime.
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
