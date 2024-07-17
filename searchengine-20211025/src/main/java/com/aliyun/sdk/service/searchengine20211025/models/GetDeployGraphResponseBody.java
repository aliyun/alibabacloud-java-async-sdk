// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeployGraphResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeployGraphResponseBody</p>
 */
public class GetDeployGraphResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private GetDeployGraphResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeployGraphResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The results returned.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetDeployGraphResponseBody build() {
            return new GetDeployGraphResponseBody(this);
        } 

    } 

    public static class IndexMetas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("domainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("tableDeployId")
        private Long tableDeployId;

        @com.aliyun.core.annotation.NameInMap("tableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("zoneName")
        private String zoneName;

        private IndexMetas(Builder builder) {
            this.domainName = builder.domainName;
            this.name = builder.name;
            this.tableDeployId = builder.tableDeployId;
            this.tableName = builder.tableName;
            this.tag = builder.tag;
            this.zoneName = builder.zoneName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IndexMetas create() {
            return builder().build();
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return tableDeployId
         */
        public Long getTableDeployId() {
            return this.tableDeployId;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return zoneName
         */
        public String getZoneName() {
            return this.zoneName;
        }

        public static final class Builder {
            private String domainName; 
            private String name; 
            private Long tableDeployId; 
            private String tableName; 
            private String tag; 
            private String zoneName; 

            /**
             * The name of the data center.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * The index name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The deployment ID of the table.
             */
            public Builder tableDeployId(Long tableDeployId) {
                this.tableDeployId = tableDeployId;
                return this;
            }

            /**
             * The name of the data source.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * The tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * The name of the QRS worker.
             */
            public Builder zoneName(String zoneName) {
                this.zoneName = zoneName;
                return this;
            }

            public IndexMetas build() {
                return new IndexMetas(this);
            } 

        } 

    }
    public static class OnlineMaster extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("domainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("hippoId")
        private String hippoId;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private OnlineMaster(Builder builder) {
            this.domainName = builder.domainName;
            this.hippoId = builder.hippoId;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OnlineMaster create() {
            return builder().build();
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return hippoId
         */
        public String getHippoId() {
            return this.hippoId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String domainName; 
            private String hippoId; 
            private Long id; 
            private String name; 

            /**
             * The name of the data center.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * The resource ID.
             */
            public Builder hippoId(String hippoId) {
                this.hippoId = hippoId;
                return this;
            }

            /**
             * The ID of the data center.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the online cluster.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public OnlineMaster build() {
                return new OnlineMaster(this);
            } 

        } 

    }
    public static class TableMetas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("buildDeployId")
        private Long buildDeployId;

        @com.aliyun.core.annotation.NameInMap("domainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("tableDeployId")
        private Long tableDeployId;

        @com.aliyun.core.annotation.NameInMap("tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private TableMetas(Builder builder) {
            this.buildDeployId = builder.buildDeployId;
            this.domainName = builder.domainName;
            this.name = builder.name;
            this.tableDeployId = builder.tableDeployId;
            this.tag = builder.tag;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableMetas create() {
            return builder().build();
        }

        /**
         * @return buildDeployId
         */
        public Long getBuildDeployId() {
            return this.buildDeployId;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return tableDeployId
         */
        public Long getTableDeployId() {
            return this.tableDeployId;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long buildDeployId; 
            private String domainName; 
            private String name; 
            private Long tableDeployId; 
            private String tag; 
            private String type; 

            /**
             * The ID of the offline deployment.
             */
            public Builder buildDeployId(Long buildDeployId) {
                this.buildDeployId = buildDeployId;
                return this;
            }

            /**
             * The name of the data center.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * The name of the data source.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The deployment ID of the table.
             */
            public Builder tableDeployId(Long tableDeployId) {
                this.tableDeployId = tableDeployId;
                return this;
            }

            /**
             * The tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * The type of the data source.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public TableMetas build() {
                return new TableMetas(this);
            } 

        } 

    }
    public static class ZoneMetas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("domainInfo")
        private String domainInfo;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("suezAdminName")
        private String suezAdminName;

        @com.aliyun.core.annotation.NameInMap("tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private ZoneMetas(Builder builder) {
            this.domainInfo = builder.domainInfo;
            this.name = builder.name;
            this.suezAdminName = builder.suezAdminName;
            this.tag = builder.tag;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneMetas create() {
            return builder().build();
        }

        /**
         * @return domainInfo
         */
        public String getDomainInfo() {
            return this.domainInfo;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return suezAdminName
         */
        public String getSuezAdminName() {
            return this.suezAdminName;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String domainInfo; 
            private String name; 
            private String suezAdminName; 
            private String tag; 
            private String type; 

            /**
             * The name of the data center.
             */
            public Builder domainInfo(String domainInfo) {
                this.domainInfo = domainInfo;
                return this;
            }

            /**
             * The name of the Query Result Searcher (QRS) worker.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The name of the service that is used to manage the relationships between online clusters and indexes.
             */
            public Builder suezAdminName(String suezAdminName) {
                this.suezAdminName = suezAdminName;
                return this;
            }

            /**
             * The tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * The node type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ZoneMetas build() {
                return new ZoneMetas(this);
            } 

        } 

    }
    public static class Graph extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("indexMetas")
        private java.util.List < IndexMetas> indexMetas;

        @com.aliyun.core.annotation.NameInMap("onlineMaster")
        private java.util.List < OnlineMaster> onlineMaster;

        @com.aliyun.core.annotation.NameInMap("tableIndexRelation")
        private java.util.Map < String, java.util.List<String>> tableIndexRelation;

        @com.aliyun.core.annotation.NameInMap("tableMetas")
        private java.util.List < TableMetas> tableMetas;

        @com.aliyun.core.annotation.NameInMap("zoneIndexRelation")
        private java.util.Map < String, java.util.List<String>> zoneIndexRelation;

        @com.aliyun.core.annotation.NameInMap("zoneMetas")
        private java.util.List < ZoneMetas> zoneMetas;

        private Graph(Builder builder) {
            this.indexMetas = builder.indexMetas;
            this.onlineMaster = builder.onlineMaster;
            this.tableIndexRelation = builder.tableIndexRelation;
            this.tableMetas = builder.tableMetas;
            this.zoneIndexRelation = builder.zoneIndexRelation;
            this.zoneMetas = builder.zoneMetas;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Graph create() {
            return builder().build();
        }

        /**
         * @return indexMetas
         */
        public java.util.List < IndexMetas> getIndexMetas() {
            return this.indexMetas;
        }

        /**
         * @return onlineMaster
         */
        public java.util.List < OnlineMaster> getOnlineMaster() {
            return this.onlineMaster;
        }

        /**
         * @return tableIndexRelation
         */
        public java.util.Map < String, java.util.List<String>> getTableIndexRelation() {
            return this.tableIndexRelation;
        }

        /**
         * @return tableMetas
         */
        public java.util.List < TableMetas> getTableMetas() {
            return this.tableMetas;
        }

        /**
         * @return zoneIndexRelation
         */
        public java.util.Map < String, java.util.List<String>> getZoneIndexRelation() {
            return this.zoneIndexRelation;
        }

        /**
         * @return zoneMetas
         */
        public java.util.List < ZoneMetas> getZoneMetas() {
            return this.zoneMetas;
        }

        public static final class Builder {
            private java.util.List < IndexMetas> indexMetas; 
            private java.util.List < OnlineMaster> onlineMaster; 
            private java.util.Map < String, java.util.List<String>> tableIndexRelation; 
            private java.util.List < TableMetas> tableMetas; 
            private java.util.Map < String, java.util.List<String>> zoneIndexRelation; 
            private java.util.List < ZoneMetas> zoneMetas; 

            /**
             * The index metadata.
             */
            public Builder indexMetas(java.util.List < IndexMetas> indexMetas) {
                this.indexMetas = indexMetas;
                return this;
            }

            /**
             * The metadata of online clusters.
             */
            public Builder onlineMaster(java.util.List < OnlineMaster> onlineMaster) {
                this.onlineMaster = onlineMaster;
                return this;
            }

            /**
             * The association relationships between data sources and indexes.
             */
            public Builder tableIndexRelation(java.util.Map < String, java.util.List<String>> tableIndexRelation) {
                this.tableIndexRelation = tableIndexRelation;
                return this;
            }

            /**
             * The metadata of data sources.
             */
            public Builder tableMetas(java.util.List < TableMetas> tableMetas) {
                this.tableMetas = tableMetas;
                return this;
            }

            /**
             * The association relationships between zones and indexes.
             */
            public Builder zoneIndexRelation(java.util.Map < String, java.util.List<String>> zoneIndexRelation) {
                this.zoneIndexRelation = zoneIndexRelation;
                return this;
            }

            /**
             * The zone metadata.
             */
            public Builder zoneMetas(java.util.List < ZoneMetas> zoneMetas) {
                this.zoneMetas = zoneMetas;
                return this;
            }

            public Graph build() {
                return new Graph(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("graph")
        private Graph graph;

        private Result(Builder builder) {
            this.graph = builder.graph;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return graph
         */
        public Graph getGraph() {
            return this.graph;
        }

        public static final class Builder {
            private Graph graph; 

            /**
             * The deployment information.
             */
            public Builder graph(Graph graph) {
                this.graph = graph;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
