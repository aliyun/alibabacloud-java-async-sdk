// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeployGraphResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeployGraphResponseBody</p>
 */
public class GetDeployGraphResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
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
         * The result returned
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
        @NameInMap("domainName")
        private String domainName;

        @NameInMap("name")
        private String name;

        @NameInMap("tableDeployId")
        private Long tableDeployId;

        @NameInMap("tableName")
        private String tableName;

        @NameInMap("tag")
        private String tag;

        @NameInMap("zoneName")
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
             * domainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * tableDeployId.
             */
            public Builder tableDeployId(Long tableDeployId) {
                this.tableDeployId = tableDeployId;
                return this;
            }

            /**
             * tableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * zoneName.
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
        @NameInMap("domainName")
        private String domainName;

        @NameInMap("hippoId")
        private String hippoId;

        @NameInMap("id")
        private Long id;

        @NameInMap("name")
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
             * domainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * hippoId.
             */
            public Builder hippoId(String hippoId) {
                this.hippoId = hippoId;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * name.
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
        @NameInMap("buildDeployId")
        private Long buildDeployId;

        @NameInMap("domainName")
        private String domainName;

        @NameInMap("name")
        private String name;

        @NameInMap("tableDeployId")
        private Long tableDeployId;

        @NameInMap("tag")
        private String tag;

        @NameInMap("type")
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
             * buildDeployId.
             */
            public Builder buildDeployId(Long buildDeployId) {
                this.buildDeployId = buildDeployId;
                return this;
            }

            /**
             * domainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * tableDeployId.
             */
            public Builder tableDeployId(Long tableDeployId) {
                this.tableDeployId = tableDeployId;
                return this;
            }

            /**
             * tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * type.
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
        @NameInMap("domainInfo")
        private String domainInfo;

        @NameInMap("name")
        private String name;

        @NameInMap("suezAdminName")
        private String suezAdminName;

        @NameInMap("tag")
        private String tag;

        @NameInMap("type")
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
             * domainInfo.
             */
            public Builder domainInfo(String domainInfo) {
                this.domainInfo = domainInfo;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * suezAdminName.
             */
            public Builder suezAdminName(String suezAdminName) {
                this.suezAdminName = suezAdminName;
                return this;
            }

            /**
             * tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * type.
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
        @NameInMap("indexMetas")
        private java.util.List < IndexMetas> indexMetas;

        @NameInMap("onlineMaster")
        private java.util.List < OnlineMaster> onlineMaster;

        @NameInMap("tableIndexRelation")
        private java.util.Map < String, java.util.List<String>> tableIndexRelation;

        @NameInMap("tableMetas")
        private java.util.List < TableMetas> tableMetas;

        @NameInMap("zoneIndexRelation")
        private java.util.Map < String, java.util.List<String>> zoneIndexRelation;

        @NameInMap("zoneMetas")
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
             * 索引元信息
             */
            public Builder indexMetas(java.util.List < IndexMetas> indexMetas) {
                this.indexMetas = indexMetas;
                return this;
            }

            /**
             * 在线集群元信息
             */
            public Builder onlineMaster(java.util.List < OnlineMaster> onlineMaster) {
                this.onlineMaster = onlineMaster;
                return this;
            }

            /**
             * 数据源和索引关联关系
             */
            public Builder tableIndexRelation(java.util.Map < String, java.util.List<String>> tableIndexRelation) {
                this.tableIndexRelation = tableIndexRelation;
                return this;
            }

            /**
             * 数据源元信息
             */
            public Builder tableMetas(java.util.List < TableMetas> tableMetas) {
                this.tableMetas = tableMetas;
                return this;
            }

            /**
             * zone和索引关联关系
             */
            public Builder zoneIndexRelation(java.util.Map < String, java.util.List<String>> zoneIndexRelation) {
                this.zoneIndexRelation = zoneIndexRelation;
                return this;
            }

            /**
             * zone元信息
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
        @NameInMap("graph")
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
             * graph.
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
