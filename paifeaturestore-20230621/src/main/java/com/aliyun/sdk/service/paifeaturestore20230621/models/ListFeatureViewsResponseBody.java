// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

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
 * {@link ListFeatureViewsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFeatureViewsResponseBody</p>
 */
public class ListFeatureViewsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FeatureViews")
    private java.util.List<FeatureViews> featureViews;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListFeatureViewsResponseBody(Builder builder) {
        this.featureViews = builder.featureViews;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFeatureViewsResponseBody create() {
        return builder().build();
    }

    /**
     * @return featureViews
     */
    public java.util.List<FeatureViews> getFeatureViews() {
        return this.featureViews;
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
        private java.util.List<FeatureViews> featureViews; 
        private String requestId; 
        private Long totalCount; 

        /**
         * FeatureViews.
         */
        public Builder featureViews(java.util.List<FeatureViews> featureViews) {
            this.featureViews = featureViews;
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

        public ListFeatureViewsResponseBody build() {
            return new ListFeatureViewsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFeatureViewsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFeatureViewsResponseBody</p>
     */
    public static class FeatureViews extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FeatureEntityName")
        private String featureEntityName;

        @com.aliyun.core.annotation.NameInMap("FeatureViewId")
        private String featureViewId;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("RegisterDatasourceId")
        private String registerDatasourceId;

        @com.aliyun.core.annotation.NameInMap("RegisterDatasourceName")
        private String registerDatasourceName;

        @com.aliyun.core.annotation.NameInMap("RegisterTable")
        private String registerTable;

        @com.aliyun.core.annotation.NameInMap("TTL")
        private Integer TTL;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("WriteToFeatureDB")
        private Boolean writeToFeatureDB;

        private FeatureViews(Builder builder) {
            this.featureEntityName = builder.featureEntityName;
            this.featureViewId = builder.featureViewId;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.name = builder.name;
            this.owner = builder.owner;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.registerDatasourceId = builder.registerDatasourceId;
            this.registerDatasourceName = builder.registerDatasourceName;
            this.registerTable = builder.registerTable;
            this.TTL = builder.TTL;
            this.type = builder.type;
            this.writeToFeatureDB = builder.writeToFeatureDB;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FeatureViews create() {
            return builder().build();
        }

        /**
         * @return featureEntityName
         */
        public String getFeatureEntityName() {
            return this.featureEntityName;
        }

        /**
         * @return featureViewId
         */
        public String getFeatureViewId() {
            return this.featureViewId;
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

        /**
         * @return registerDatasourceId
         */
        public String getRegisterDatasourceId() {
            return this.registerDatasourceId;
        }

        /**
         * @return registerDatasourceName
         */
        public String getRegisterDatasourceName() {
            return this.registerDatasourceName;
        }

        /**
         * @return registerTable
         */
        public String getRegisterTable() {
            return this.registerTable;
        }

        /**
         * @return TTL
         */
        public Integer getTTL() {
            return this.TTL;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return writeToFeatureDB
         */
        public Boolean getWriteToFeatureDB() {
            return this.writeToFeatureDB;
        }

        public static final class Builder {
            private String featureEntityName; 
            private String featureViewId; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String name; 
            private String owner; 
            private String projectId; 
            private String projectName; 
            private String registerDatasourceId; 
            private String registerDatasourceName; 
            private String registerTable; 
            private Integer TTL; 
            private String type; 
            private Boolean writeToFeatureDB; 

            /**
             * FeatureEntityName.
             */
            public Builder featureEntityName(String featureEntityName) {
                this.featureEntityName = featureEntityName;
                return this;
            }

            /**
             * FeatureViewId.
             */
            public Builder featureViewId(String featureViewId) {
                this.featureViewId = featureViewId;
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

            /**
             * RegisterDatasourceId.
             */
            public Builder registerDatasourceId(String registerDatasourceId) {
                this.registerDatasourceId = registerDatasourceId;
                return this;
            }

            /**
             * RegisterDatasourceName.
             */
            public Builder registerDatasourceName(String registerDatasourceName) {
                this.registerDatasourceName = registerDatasourceName;
                return this;
            }

            /**
             * RegisterTable.
             */
            public Builder registerTable(String registerTable) {
                this.registerTable = registerTable;
                return this;
            }

            /**
             * TTL.
             */
            public Builder TTL(Integer TTL) {
                this.TTL = TTL;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * WriteToFeatureDB.
             */
            public Builder writeToFeatureDB(Boolean writeToFeatureDB) {
                this.writeToFeatureDB = writeToFeatureDB;
                return this;
            }

            public FeatureViews build() {
                return new FeatureViews(this);
            } 

        } 

    }
}
