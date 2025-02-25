// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListScanMaliciousFileByTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ListScanMaliciousFileByTaskResponseBody</p>
 */
public class ListScanMaliciousFileByTaskResponseBody extends TeaModel {
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

    @NameInMap("ScanMaliciousFiles")
    private java.util.List < ScanMaliciousFiles> scanMaliciousFiles;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListScanMaliciousFileByTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.scanMaliciousFiles = builder.scanMaliciousFiles;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScanMaliciousFileByTaskResponseBody create() {
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
     * @return scanMaliciousFiles
     */
    public java.util.List < ScanMaliciousFiles> getScanMaliciousFiles() {
        return this.scanMaliciousFiles;
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
        private java.util.List < ScanMaliciousFiles> scanMaliciousFiles; 
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ScanMaliciousFiles.
         */
        public Builder scanMaliciousFiles(java.util.List < ScanMaliciousFiles> scanMaliciousFiles) {
            this.scanMaliciousFiles = scanMaliciousFiles;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListScanMaliciousFileByTaskResponseBody build() {
            return new ListScanMaliciousFileByTaskResponseBody(this);
        } 

    } 

    public static class ScanMaliciousFiles extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("FilePath")
        private String filePath;

        @NameInMap("FirstScanTime")
        private Long firstScanTime;

        @NameInMap("Level")
        private String level;

        @NameInMap("MaliciousMd5")
        private String maliciousMd5;

        @NameInMap("MaliciousName")
        private String maliciousName;

        @NameInMap("ScanTaskId")
        private String scanTaskId;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private ScanMaliciousFiles(Builder builder) {
            this.createTime = builder.createTime;
            this.filePath = builder.filePath;
            this.firstScanTime = builder.firstScanTime;
            this.level = builder.level;
            this.maliciousMd5 = builder.maliciousMd5;
            this.maliciousName = builder.maliciousName;
            this.scanTaskId = builder.scanTaskId;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScanMaliciousFiles create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return filePath
         */
        public String getFilePath() {
            return this.filePath;
        }

        /**
         * @return firstScanTime
         */
        public Long getFirstScanTime() {
            return this.firstScanTime;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return maliciousMd5
         */
        public String getMaliciousMd5() {
            return this.maliciousMd5;
        }

        /**
         * @return maliciousName
         */
        public String getMaliciousName() {
            return this.maliciousName;
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
            private Long createTime; 
            private String filePath; 
            private Long firstScanTime; 
            private String level; 
            private String maliciousMd5; 
            private String maliciousName; 
            private String scanTaskId; 
            private Long updateTime; 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * FilePath.
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
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
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * MaliciousMd5.
             */
            public Builder maliciousMd5(String maliciousMd5) {
                this.maliciousMd5 = maliciousMd5;
                return this;
            }

            /**
             * MaliciousName.
             */
            public Builder maliciousName(String maliciousName) {
                this.maliciousName = maliciousName;
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

            public ScanMaliciousFiles build() {
                return new ScanMaliciousFiles(this);
            } 

        } 

    }
}
