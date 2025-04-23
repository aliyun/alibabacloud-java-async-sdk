// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link ListRamPolicyExportTaskVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRamPolicyExportTaskVersionsResponseBody</p>
 */
public class ListRamPolicyExportTaskVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("ramPolicyExportTaskVersions")
    private java.util.List<RamPolicyExportTaskVersions> ramPolicyExportTaskVersions;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListRamPolicyExportTaskVersionsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.ramPolicyExportTaskVersions = builder.ramPolicyExportTaskVersions;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRamPolicyExportTaskVersionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return ramPolicyExportTaskVersions
     */
    public java.util.List<RamPolicyExportTaskVersions> getRamPolicyExportTaskVersions() {
        return this.ramPolicyExportTaskVersions;
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
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<RamPolicyExportTaskVersions> ramPolicyExportTaskVersions; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListRamPolicyExportTaskVersionsResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.ramPolicyExportTaskVersions = model.ramPolicyExportTaskVersions;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ramPolicyExportTaskVersions.
         */
        public Builder ramPolicyExportTaskVersions(java.util.List<RamPolicyExportTaskVersions> ramPolicyExportTaskVersions) {
            this.ramPolicyExportTaskVersions = ramPolicyExportTaskVersions;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRamPolicyExportTaskVersionsResponseBody build() {
            return new ListRamPolicyExportTaskVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRamPolicyExportTaskVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRamPolicyExportTaskVersionsResponseBody</p>
     */
    public static class RamPolicyExportTaskVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("elapsedTime")
        private Long elapsedTime;

        @com.aliyun.core.annotation.NameInMap("exportVersion")
        private String exportVersion;

        @com.aliyun.core.annotation.NameInMap("moduleId")
        private String moduleId;

        @com.aliyun.core.annotation.NameInMap("moduleVersion")
        private String moduleVersion;

        @com.aliyun.core.annotation.NameInMap("ramPolicyExportTaskId")
        private String ramPolicyExportTaskId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private RamPolicyExportTaskVersions(Builder builder) {
            this.createTime = builder.createTime;
            this.elapsedTime = builder.elapsedTime;
            this.exportVersion = builder.exportVersion;
            this.moduleId = builder.moduleId;
            this.moduleVersion = builder.moduleVersion;
            this.ramPolicyExportTaskId = builder.ramPolicyExportTaskId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RamPolicyExportTaskVersions create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return elapsedTime
         */
        public Long getElapsedTime() {
            return this.elapsedTime;
        }

        /**
         * @return exportVersion
         */
        public String getExportVersion() {
            return this.exportVersion;
        }

        /**
         * @return moduleId
         */
        public String getModuleId() {
            return this.moduleId;
        }

        /**
         * @return moduleVersion
         */
        public String getModuleVersion() {
            return this.moduleVersion;
        }

        /**
         * @return ramPolicyExportTaskId
         */
        public String getRamPolicyExportTaskId() {
            return this.ramPolicyExportTaskId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String createTime; 
            private Long elapsedTime; 
            private String exportVersion; 
            private String moduleId; 
            private String moduleVersion; 
            private String ramPolicyExportTaskId; 
            private String status; 

            private Builder() {
            } 

            private Builder(RamPolicyExportTaskVersions model) {
                this.createTime = model.createTime;
                this.elapsedTime = model.elapsedTime;
                this.exportVersion = model.exportVersion;
                this.moduleId = model.moduleId;
                this.moduleVersion = model.moduleVersion;
                this.ramPolicyExportTaskId = model.ramPolicyExportTaskId;
                this.status = model.status;
            } 

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * elapsedTime.
             */
            public Builder elapsedTime(Long elapsedTime) {
                this.elapsedTime = elapsedTime;
                return this;
            }

            /**
             * exportVersion.
             */
            public Builder exportVersion(String exportVersion) {
                this.exportVersion = exportVersion;
                return this;
            }

            /**
             * moduleId.
             */
            public Builder moduleId(String moduleId) {
                this.moduleId = moduleId;
                return this;
            }

            /**
             * moduleVersion.
             */
            public Builder moduleVersion(String moduleVersion) {
                this.moduleVersion = moduleVersion;
                return this;
            }

            /**
             * ramPolicyExportTaskId.
             */
            public Builder ramPolicyExportTaskId(String ramPolicyExportTaskId) {
                this.ramPolicyExportTaskId = ramPolicyExportTaskId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public RamPolicyExportTaskVersions build() {
                return new RamPolicyExportTaskVersions(this);
            } 

        } 

    }
}
