// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOsVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListOsVersionsResponseBody</p>
 */
public class ListOsVersionsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Long maxResults;

    @NameInMap("NextToken")
    private Integer nextToken;

    @NameInMap("OsVersion")
    private java.util.List < OsVersion> osVersion;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListOsVersionsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.osVersion = builder.osVersion;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOsVersionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public Integer getNextToken() {
        return this.nextToken;
    }

    /**
     * @return osVersion
     */
    public java.util.List < OsVersion> getOsVersion() {
        return this.osVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long maxResults; 
        private Integer nextToken; 
        private java.util.List < OsVersion> osVersion; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(Integer nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * OsVersion.
         */
        public Builder osVersion(java.util.List < OsVersion> osVersion) {
            this.osVersion = osVersion;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListOsVersionsResponseBody build() {
            return new ListOsVersionsResponseBody(this);
        } 

    } 

    public static class OsVersion extends TeaModel {
        @NameInMap("BootPatch")
        private String bootPatch;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("FeaturePatch")
        private String featurePatch;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("FilePath")
        private String filePath;

        @NameInMap("Model")
        private String model;

        @NameInMap("OsVersion")
        private String osVersion;

        @NameInMap("OsVersionId")
        private String osVersionId;

        @NameInMap("Status")
        private String status;

        @NameInMap("SystemPatch")
        private String systemPatch;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("Vendor")
        private String vendor;

        private OsVersion(Builder builder) {
            this.bootPatch = builder.bootPatch;
            this.createTime = builder.createTime;
            this.featurePatch = builder.featurePatch;
            this.fileName = builder.fileName;
            this.filePath = builder.filePath;
            this.model = builder.model;
            this.osVersion = builder.osVersion;
            this.osVersionId = builder.osVersionId;
            this.status = builder.status;
            this.systemPatch = builder.systemPatch;
            this.updateTime = builder.updateTime;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OsVersion create() {
            return builder().build();
        }

        /**
         * @return bootPatch
         */
        public String getBootPatch() {
            return this.bootPatch;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return featurePatch
         */
        public String getFeaturePatch() {
            return this.featurePatch;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return filePath
         */
        public String getFilePath() {
            return this.filePath;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return osVersion
         */
        public String getOsVersion() {
            return this.osVersion;
        }

        /**
         * @return osVersionId
         */
        public String getOsVersionId() {
            return this.osVersionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return systemPatch
         */
        public String getSystemPatch() {
            return this.systemPatch;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String bootPatch; 
            private String createTime; 
            private String featurePatch; 
            private String fileName; 
            private String filePath; 
            private String model; 
            private String osVersion; 
            private String osVersionId; 
            private String status; 
            private String systemPatch; 
            private String updateTime; 
            private String vendor; 

            /**
             * BootPatch.
             */
            public Builder bootPatch(String bootPatch) {
                this.bootPatch = bootPatch;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * FeaturePatch.
             */
            public Builder featurePatch(String featurePatch) {
                this.featurePatch = featurePatch;
                return this;
            }

            /**
             * 文件名
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * 文件路径
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * 型号
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * 系统版本
             */
            public Builder osVersion(String osVersion) {
                this.osVersion = osVersion;
                return this;
            }

            /**
             * OsVersionId.
             */
            public Builder osVersionId(String osVersionId) {
                this.osVersionId = osVersionId;
                return this;
            }

            /**
             * 状态
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SystemPatch.
             */
            public Builder systemPatch(String systemPatch) {
                this.systemPatch = systemPatch;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * 厂商
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            public OsVersion build() {
                return new OsVersion(this);
            } 

        } 

    }
}
