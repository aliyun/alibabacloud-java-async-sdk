// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetDeployGraphResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>E7B7D598-B080-5C8E-AA35-D43EC0D5F886</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The results returned.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetDeployGraphResponseBody build() {
            return new GetDeployGraphResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDeployGraphResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeployGraphResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(IndexMetas model) {
                this.domainName = model.domainName;
                this.name = model.name;
                this.tableDeployId = model.tableDeployId;
                this.tableName = model.tableName;
                this.tag = model.tag;
                this.zoneName = model.zoneName;
            } 

            /**
             * <p>The name of the data center.</p>
             * 
             * <strong>example:</strong>
             * <p>hz_pre_vpc_domain_1</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The index name.</p>
             * 
             * <strong>example:</strong>
             * <p>test_api</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The deployment ID of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>2409</p>
             */
            public Builder tableDeployId(Long tableDeployId) {
                this.tableDeployId = tableDeployId;
                return this;
            }

            /**
             * <p>The name of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>ha-cn-pl32rf0****_test_api</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The tag.</p>
             * 
             * <strong>example:</strong>
             * <p>test_api_hz_pre_vpc_domain_1</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The name of the QRS worker.</p>
             * 
             * <strong>example:</strong>
             * <p>ha-cn-pl32rf0****_qrs</p>
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
    /**
     * 
     * {@link GetDeployGraphResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeployGraphResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(OnlineMaster model) {
                this.domainName = model.domainName;
                this.hippoId = model.hippoId;
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * <p>The name of the data center.</p>
             * 
             * <strong>example:</strong>
             * <p>hz_pre_vpc_domain_1</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>5377</p>
             */
            public Builder hippoId(String hippoId) {
                this.hippoId = hippoId;
                return this;
            }

            /**
             * <p>The ID of the data center.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the online cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>ha-cn-pl32rf0****_hz_pre_vpc_domain_1</p>
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
    /**
     * 
     * {@link GetDeployGraphResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeployGraphResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(TableMetas model) {
                this.buildDeployId = model.buildDeployId;
                this.domainName = model.domainName;
                this.name = model.name;
                this.tableDeployId = model.tableDeployId;
                this.tag = model.tag;
                this.type = model.type;
            } 

            /**
             * <p>The ID of the offline deployment.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder buildDeployId(Long buildDeployId) {
                this.buildDeployId = buildDeployId;
                return this;
            }

            /**
             * <p>The name of the data center.</p>
             * 
             * <strong>example:</strong>
             * <p>hz_pre_vpc_domain_1</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The name of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>ha-cn-pl32rf0****_test_api</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The deployment ID of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>2177</p>
             */
            public Builder tableDeployId(Long tableDeployId) {
                this.tableDeployId = tableDeployId;
                return this;
            }

            /**
             * <p>The tag.</p>
             * 
             * <strong>example:</strong>
             * <p>ha-cn-pl32rf0****_test_api_hz_pre_vpc_domain_1</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The type of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>odps</p>
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
    /**
     * 
     * {@link GetDeployGraphResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeployGraphResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ZoneMetas model) {
                this.domainInfo = model.domainInfo;
                this.name = model.name;
                this.suezAdminName = model.suezAdminName;
                this.tag = model.tag;
                this.type = model.type;
            } 

            /**
             * <p>The name of the data center.</p>
             * 
             * <strong>example:</strong>
             * <p>hz_pre_vpc_domain_1</p>
             */
            public Builder domainInfo(String domainInfo) {
                this.domainInfo = domainInfo;
                return this;
            }

            /**
             * <p>The name of the Query Result Searcher (QRS) worker.</p>
             * 
             * <strong>example:</strong>
             * <p>ha-cn-pl32rf0****_qrs</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The name of the service that is used to manage the relationships between online clusters and indexes.</p>
             * 
             * <strong>example:</strong>
             * <p>ha-cn-pl32rf0****_hz_pre_vpc_domain_1</p>
             */
            public Builder suezAdminName(String suezAdminName) {
                this.suezAdminName = suezAdminName;
                return this;
            }

            /**
             * <p>The tag.</p>
             * 
             * <strong>example:</strong>
             * <p>ha-cn-pl32rf0****_qrs_hz_pre_vpc_domain_1</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The node type.</p>
             * 
             * <strong>example:</strong>
             * <p>qrs</p>
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
    /**
     * 
     * {@link GetDeployGraphResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeployGraphResponseBody</p>
     */
    public static class Graph extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("indexMetas")
        private java.util.List<IndexMetas> indexMetas;

        @com.aliyun.core.annotation.NameInMap("onlineMaster")
        private java.util.List<OnlineMaster> onlineMaster;

        @com.aliyun.core.annotation.NameInMap("tableIndexRelation")
        private java.util.Map<String, java.util.List<String>> tableIndexRelation;

        @com.aliyun.core.annotation.NameInMap("tableMetas")
        private java.util.List<TableMetas> tableMetas;

        @com.aliyun.core.annotation.NameInMap("zoneIndexRelation")
        private java.util.Map<String, java.util.List<String>> zoneIndexRelation;

        @com.aliyun.core.annotation.NameInMap("zoneMetas")
        private java.util.List<ZoneMetas> zoneMetas;

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
        public java.util.List<IndexMetas> getIndexMetas() {
            return this.indexMetas;
        }

        /**
         * @return onlineMaster
         */
        public java.util.List<OnlineMaster> getOnlineMaster() {
            return this.onlineMaster;
        }

        /**
         * @return tableIndexRelation
         */
        public java.util.Map<String, java.util.List<String>> getTableIndexRelation() {
            return this.tableIndexRelation;
        }

        /**
         * @return tableMetas
         */
        public java.util.List<TableMetas> getTableMetas() {
            return this.tableMetas;
        }

        /**
         * @return zoneIndexRelation
         */
        public java.util.Map<String, java.util.List<String>> getZoneIndexRelation() {
            return this.zoneIndexRelation;
        }

        /**
         * @return zoneMetas
         */
        public java.util.List<ZoneMetas> getZoneMetas() {
            return this.zoneMetas;
        }

        public static final class Builder {
            private java.util.List<IndexMetas> indexMetas; 
            private java.util.List<OnlineMaster> onlineMaster; 
            private java.util.Map<String, java.util.List<String>> tableIndexRelation; 
            private java.util.List<TableMetas> tableMetas; 
            private java.util.Map<String, java.util.List<String>> zoneIndexRelation; 
            private java.util.List<ZoneMetas> zoneMetas; 

            private Builder() {
            } 

            private Builder(Graph model) {
                this.indexMetas = model.indexMetas;
                this.onlineMaster = model.onlineMaster;
                this.tableIndexRelation = model.tableIndexRelation;
                this.tableMetas = model.tableMetas;
                this.zoneIndexRelation = model.zoneIndexRelation;
                this.zoneMetas = model.zoneMetas;
            } 

            /**
             * <p>The index metadata.</p>
             */
            public Builder indexMetas(java.util.List<IndexMetas> indexMetas) {
                this.indexMetas = indexMetas;
                return this;
            }

            /**
             * <p>The metadata of online clusters.</p>
             */
            public Builder onlineMaster(java.util.List<OnlineMaster> onlineMaster) {
                this.onlineMaster = onlineMaster;
                return this;
            }

            /**
             * <p>The association relationships between data sources and indexes.</p>
             */
            public Builder tableIndexRelation(java.util.Map<String, java.util.List<String>> tableIndexRelation) {
                this.tableIndexRelation = tableIndexRelation;
                return this;
            }

            /**
             * <p>The metadata of data sources.</p>
             */
            public Builder tableMetas(java.util.List<TableMetas> tableMetas) {
                this.tableMetas = tableMetas;
                return this;
            }

            /**
             * <p>The association relationships between zones and indexes.</p>
             */
            public Builder zoneIndexRelation(java.util.Map<String, java.util.List<String>> zoneIndexRelation) {
                this.zoneIndexRelation = zoneIndexRelation;
                return this;
            }

            /**
             * <p>The zone metadata.</p>
             */
            public Builder zoneMetas(java.util.List<ZoneMetas> zoneMetas) {
                this.zoneMetas = zoneMetas;
                return this;
            }

            public Graph build() {
                return new Graph(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDeployGraphResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeployGraphResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.graph = model.graph;
            } 

            /**
             * <p>The deployment information.</p>
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
