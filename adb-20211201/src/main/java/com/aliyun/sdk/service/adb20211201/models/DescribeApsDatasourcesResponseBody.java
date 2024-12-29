// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeApsDatasourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApsDatasourcesResponseBody</p>
 */
public class DescribeApsDatasourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApsDatasources")
    private java.util.List<ApsDatasources> apsDatasources;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeApsDatasourcesResponseBody(Builder builder) {
        this.apsDatasources = builder.apsDatasources;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApsDatasourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return apsDatasources
     */
    public java.util.List<ApsDatasources> getApsDatasources() {
        return this.apsDatasources;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
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
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<ApsDatasources> apsDatasources; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private String totalCount; 

        /**
         * <ul>
         * <li></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder apsDatasources(java.util.List<ApsDatasources> apsDatasources) {
            this.apsDatasources = apsDatasources;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
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
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeApsDatasourcesResponseBody build() {
            return new DescribeApsDatasourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApsDatasourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApsDatasourcesResponseBody</p>
     */
    public static class ApsDatasources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DatasourceDescription")
        private String datasourceDescription;

        @com.aliyun.core.annotation.NameInMap("DatasourceId")
        private Long datasourceId;

        @com.aliyun.core.annotation.NameInMap("DatasourceName")
        private String datasourceName;

        @com.aliyun.core.annotation.NameInMap("DatasourceType")
        private String datasourceType;

        @com.aliyun.core.annotation.NameInMap("HasJob")
        private Boolean hasJob;

        private ApsDatasources(Builder builder) {
            this.createTime = builder.createTime;
            this.datasourceDescription = builder.datasourceDescription;
            this.datasourceId = builder.datasourceId;
            this.datasourceName = builder.datasourceName;
            this.datasourceType = builder.datasourceType;
            this.hasJob = builder.hasJob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApsDatasources create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return datasourceDescription
         */
        public String getDatasourceDescription() {
            return this.datasourceDescription;
        }

        /**
         * @return datasourceId
         */
        public Long getDatasourceId() {
            return this.datasourceId;
        }

        /**
         * @return datasourceName
         */
        public String getDatasourceName() {
            return this.datasourceName;
        }

        /**
         * @return datasourceType
         */
        public String getDatasourceType() {
            return this.datasourceType;
        }

        /**
         * @return hasJob
         */
        public Boolean getHasJob() {
            return this.hasJob;
        }

        public static final class Builder {
            private String createTime; 
            private String datasourceDescription; 
            private Long datasourceId; 
            private String datasourceName; 
            private String datasourceType; 
            private Boolean hasJob; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DatasourceDescription.
             */
            public Builder datasourceDescription(String datasourceDescription) {
                this.datasourceDescription = datasourceDescription;
                return this;
            }

            /**
             * DatasourceId.
             */
            public Builder datasourceId(Long datasourceId) {
                this.datasourceId = datasourceId;
                return this;
            }

            /**
             * DatasourceName.
             */
            public Builder datasourceName(String datasourceName) {
                this.datasourceName = datasourceName;
                return this;
            }

            /**
             * DatasourceType.
             */
            public Builder datasourceType(String datasourceType) {
                this.datasourceType = datasourceType;
                return this;
            }

            /**
             * HasJob.
             */
            public Builder hasJob(Boolean hasJob) {
                this.hasJob = hasJob;
                return this;
            }

            public ApsDatasources build() {
                return new ApsDatasources(this);
            } 

        } 

    }
}
