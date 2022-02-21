// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataSourceResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataSourceResponseBody</p>
 */
public class ListDataSourceResponseBody extends TeaModel {
    @NameInMap("DataSourceList")
    private DataSourceList dataSourceList;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Integer total;

    private ListDataSourceResponseBody(Builder builder) {
        this.dataSourceList = builder.dataSourceList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataSourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataSourceList
     */
    public DataSourceList getDataSourceList() {
        return this.dataSourceList;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private DataSourceList dataSourceList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer total; 

        /**
         * DataSourceList.
         */
        public Builder dataSourceList(DataSourceList dataSourceList) {
            this.dataSourceList = dataSourceList;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListDataSourceResponseBody build() {
            return new ListDataSourceResponseBody(this);
        } 

    } 

    public static class DataSource extends TeaModel {
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("Conf")
        private String conf;

        @NameInMap("CreateFrom")
        private String createFrom;

        @NameInMap("Creator")
        private String creator;

        @NameInMap("Description")
        private String description;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("Id")
        private String id;

        @NameInMap("Modifier")
        private String modifier;

        @NameInMap("Name")
        private String name;

        @NameInMap("SourceType")
        private String sourceType;

        @NameInMap("Status")
        private String status;

        private DataSource(Builder builder) {
            this.clusterId = builder.clusterId;
            this.conf = builder.conf;
            this.createFrom = builder.createFrom;
            this.creator = builder.creator;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.modifier = builder.modifier;
            this.name = builder.name;
            this.sourceType = builder.sourceType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSource create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return conf
         */
        public String getConf() {
            return this.conf;
        }

        /**
         * @return createFrom
         */
        public String getCreateFrom() {
            return this.createFrom;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String clusterId; 
            private String conf; 
            private String createFrom; 
            private String creator; 
            private String description; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String id; 
            private String modifier; 
            private String name; 
            private String sourceType; 
            private String status; 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * Conf.
             */
            public Builder conf(String conf) {
                this.conf = conf;
                return this;
            }

            /**
             * CreateFrom.
             */
            public Builder createFrom(String createFrom) {
                this.createFrom = createFrom;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Modifier.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
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
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DataSource build() {
                return new DataSource(this);
            } 

        } 

    }
    public static class DataSourceList extends TeaModel {
        @NameInMap("DataSource")
        private java.util.List < DataSource> dataSource;

        private DataSourceList(Builder builder) {
            this.dataSource = builder.dataSource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSourceList create() {
            return builder().build();
        }

        /**
         * @return dataSource
         */
        public java.util.List < DataSource> getDataSource() {
            return this.dataSource;
        }

        public static final class Builder {
            private java.util.List < DataSource> dataSource; 

            /**
             * DataSource.
             */
            public Builder dataSource(java.util.List < DataSource> dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            public DataSourceList build() {
                return new DataSourceList(this);
            } 

        } 

    }
}
