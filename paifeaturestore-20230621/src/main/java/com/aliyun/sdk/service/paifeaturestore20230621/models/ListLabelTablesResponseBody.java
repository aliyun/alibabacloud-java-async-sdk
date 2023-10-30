// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLabelTablesResponseBody} extends {@link TeaModel}
 *
 * <p>ListLabelTablesResponseBody</p>
 */
public class ListLabelTablesResponseBody extends TeaModel {
    @NameInMap("LabelTables")
    private java.util.List < LabelTables> labelTables;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListLabelTablesResponseBody(Builder builder) {
        this.labelTables = builder.labelTables;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLabelTablesResponseBody create() {
        return builder().build();
    }

    /**
     * @return labelTables
     */
    public java.util.List < LabelTables> getLabelTables() {
        return this.labelTables;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < LabelTables> labelTables; 
        private String requestId; 
        private Long totalCount; 

        /**
         * LabelTables.
         */
        public Builder labelTables(java.util.List < LabelTables> labelTables) {
            this.labelTables = labelTables;
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
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListLabelTablesResponseBody build() {
            return new ListLabelTablesResponseBody(this);
        } 

    } 

    public static class LabelTables extends TeaModel {
        @NameInMap("DatasourceId")
        private String datasourceId;

        @NameInMap("DatasourceName")
        private String datasourceName;

        @NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @NameInMap("LabelTableId")
        private String labelTableId;

        @NameInMap("Name")
        private String name;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("ProjectName")
        private String projectName;

        private LabelTables(Builder builder) {
            this.datasourceId = builder.datasourceId;
            this.datasourceName = builder.datasourceName;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.labelTableId = builder.labelTableId;
            this.name = builder.name;
            this.owner = builder.owner;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LabelTables create() {
            return builder().build();
        }

        /**
         * @return datasourceId
         */
        public String getDatasourceId() {
            return this.datasourceId;
        }

        /**
         * @return datasourceName
         */
        public String getDatasourceName() {
            return this.datasourceName;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return labelTableId
         */
        public String getLabelTableId() {
            return this.labelTableId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        public static final class Builder {
            private String datasourceId; 
            private String datasourceName; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String labelTableId; 
            private String name; 
            private String owner; 
            private String projectId; 
            private String projectName; 

            /**
             * DatasourceId.
             */
            public Builder datasourceId(String datasourceId) {
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
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * GmtModifiedTime.
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * LabelTableId.
             */
            public Builder labelTableId(String labelTableId) {
                this.labelTableId = labelTableId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            public LabelTables build() {
                return new LabelTables(this);
            } 

        } 

    }
}
