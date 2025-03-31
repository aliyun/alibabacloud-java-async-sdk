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
 * {@link ListScanMaliciousFileByTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ListScanMaliciousFileByTaskResponseBody</p>
 */
public class ListScanMaliciousFileByTaskResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("ScanMaliciousFiles")
    private java.util.List<ScanMaliciousFiles> scanMaliciousFiles;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
     * @return scanMaliciousFiles
     */
    public java.util.List<ScanMaliciousFiles> getScanMaliciousFiles() {
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
        private java.util.List<ScanMaliciousFiles> scanMaliciousFiles; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListScanMaliciousFileByTaskResponseBody model) {
            this.code = model.code;
            this.isSuccess = model.isSuccess;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.scanMaliciousFiles = model.scanMaliciousFiles;
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
         * <p>The page number. Default value: 1.</p>
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>52AE49C8-B91A-5C1A-821F-C34324B42F7C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The queried malicious files.</p>
         */
        public Builder scanMaliciousFiles(java.util.List<ScanMaliciousFiles> scanMaliciousFiles) {
            this.scanMaliciousFiles = scanMaliciousFiles;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListScanMaliciousFileByTaskResponseBody build() {
            return new ListScanMaliciousFileByTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListScanMaliciousFileByTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ListScanMaliciousFileByTaskResponseBody</p>
     */
    public static class ScanMaliciousFiles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("FilePath")
        private String filePath;

        @com.aliyun.core.annotation.NameInMap("FirstScanTime")
        private Long firstScanTime;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("MaliciousMd5")
        private String maliciousMd5;

        @com.aliyun.core.annotation.NameInMap("MaliciousName")
        private String maliciousName;

        @com.aliyun.core.annotation.NameInMap("ScanTaskId")
        private String scanTaskId;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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

            private Builder() {
            } 

            private Builder(ScanMaliciousFiles model) {
                this.createTime = model.createTime;
                this.filePath = model.filePath;
                this.firstScanTime = model.firstScanTime;
                this.level = model.level;
                this.maliciousMd5 = model.maliciousMd5;
                this.maliciousName = model.maliciousName;
                this.scanTaskId = model.scanTaskId;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The time when the image was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-10 11:42:06</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The path of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>tenant/0000000000000000/</p>
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * <p>The time when the image was first scanned.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-10 11:42:06</p>
             */
            public Builder firstScanTime(Long firstScanTime) {
                this.firstScanTime = firstScanTime;
                return this;
            }

            /**
             * <p>The severity of the malicious file.</p>
             * 
             * <strong>example:</strong>
             * <p>remind</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The MD5 hash value of the malicious file.</p>
             * 
             * <strong>example:</strong>
             * <p>e76c9759783cbbc9be0ff91ca3xxxxxx</p>
             */
            public Builder maliciousMd5(String maliciousMd5) {
                this.maliciousMd5 = maliciousMd5;
                return this;
            }

            /**
             * <p>The type of the malicious file.</p>
             * 
             * <strong>example:</strong>
             * <p>Suspected to contain Webshell code</p>
             */
            public Builder maliciousName(String maliciousName) {
                this.maliciousName = maliciousName;
                return this;
            }

            /**
             * <p>The ID of the image scan task.</p>
             * 
             * <strong>example:</strong>
             * <p>fe2d8980-de45-4f55-b57d-e438e6d2e972</p>
             */
            public Builder scanTaskId(String scanTaskId) {
                this.scanTaskId = scanTaskId;
                return this;
            }

            /**
             * <p>The time when the image was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-10 11:42:06</p>
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
