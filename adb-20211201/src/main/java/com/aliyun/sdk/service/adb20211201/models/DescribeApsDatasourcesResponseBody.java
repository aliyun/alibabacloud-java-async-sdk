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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeApsDatasourcesResponseBody model) {
            this.apsDatasources = model.apsDatasources;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The queried APS data sources.</p>
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
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>-5213-</strong></strong></strong>-B608-******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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

            private Builder() {
            } 

            private Builder(ApsDatasources model) {
                this.createTime = model.createTime;
                this.datasourceDescription = model.datasourceDescription;
                this.datasourceId = model.datasourceId;
                this.datasourceName = model.datasourceName;
                this.datasourceType = model.datasourceType;
                this.hasJob = model.hasJob;
            } 

            /**
             * <p>The time when the data source was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-10 14:44:33</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder datasourceDescription(String datasourceDescription) {
                this.datasourceDescription = datasourceDescription;
                return this;
            }

            /**
             * <p>The data source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder datasourceId(Long datasourceId) {
                this.datasourceId = datasourceId;
                return this;
            }

            /**
             * <p>The name of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder datasourceName(String datasourceName) {
                this.datasourceName = datasourceName;
                return this;
            }

            /**
             * <p>The type of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>SLS</p>
             */
            public Builder datasourceType(String datasourceType) {
                this.datasourceType = datasourceType;
                return this;
            }

            /**
             * <p>Indicates whether a job is using the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
