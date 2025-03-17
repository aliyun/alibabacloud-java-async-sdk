// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link QueryDataServiceListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDataServiceListResponseBody</p>
 */
public class QueryDataServiceListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryDataServiceListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDataServiceListResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryDataServiceListResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>78C1AA2D-9201-599E-A0BA-6FC462E57A95</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return result.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Value range:</p>
         * <ul>
         * <li>true: The request was successful </li>
         * <li>false: The request failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryDataServiceListResponseBody build() {
            return new QueryDataServiceListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDataServiceListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDataServiceListResponseBody</p>
     */
    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Filters")
        private java.util.List<java.util.Map<String, ?>> filters;

        @com.aliyun.core.annotation.NameInMap("LogicalOperator")
        private String logicalOperator;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Filter(Builder builder) {
            this.filters = builder.filters;
            this.logicalOperator = builder.logicalOperator;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
            return builder().build();
        }

        /**
         * @return filters
         */
        public java.util.List<java.util.Map<String, ?>> getFilters() {
            return this.filters;
        }

        /**
         * @return logicalOperator
         */
        public String getLogicalOperator() {
            return this.logicalOperator;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<java.util.Map<String, ?>> filters; 
            private String logicalOperator; 
            private String type; 

            private Builder() {
            } 

            private Builder(Filter model) {
                this.filters = model.filters;
                this.logicalOperator = model.logicalOperator;
                this.type = model.type;
            } 

            /**
             * <p>Combined conditions.</p>
             */
            public Builder filters(java.util.List<java.util.Map<String, ?>> filters) {
                this.filters = filters;
                return this;
            }

            /**
             * <p>Logical relationship between multiple SQL text keywords.</p>
             * <ul>
             * <li><strong>or</strong>: or</li>
             * <li><strong>and</strong>: and</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>and</p>
             */
            public Builder logicalOperator(String logicalOperator) {
                this.logicalOperator = logicalOperator;
                return this;
            }

            /**
             * <p>Type.</p>
             * <ul>
             * <li>basic: basic</li>
             * <li>combined: complex</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>basic</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDataServiceListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDataServiceListResponseBody</p>
     */
    public static class Field extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Caption")
        private String caption;

        @com.aliyun.core.annotation.NameInMap("Column")
        private String column;

        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("Fid")
        private String fid;

        @com.aliyun.core.annotation.NameInMap("Granularity")
        private String granularity;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Field(Builder builder) {
            this.caption = builder.caption;
            this.column = builder.column;
            this.dataType = builder.dataType;
            this.fid = builder.fid;
            this.granularity = builder.granularity;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Field create() {
            return builder().build();
        }

        /**
         * @return caption
         */
        public String getCaption() {
            return this.caption;
        }

        /**
         * @return column
         */
        public String getColumn() {
            return this.column;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return fid
         */
        public String getFid() {
            return this.fid;
        }

        /**
         * @return granularity
         */
        public String getGranularity() {
            return this.granularity;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String caption; 
            private String column; 
            private String dataType; 
            private String fid; 
            private String granularity; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(Field model) {
                this.caption = model.caption;
                this.column = model.column;
                this.dataType = model.dataType;
                this.fid = model.fid;
                this.granularity = model.granularity;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>Display name in the cube model (can be in Chinese or English).</p>
             * 
             * <strong>example:</strong>
             * <p>date(year)</p>
             */
            public Builder caption(String caption) {
                this.caption = caption;
                return this;
            }

            /**
             * <p>The corresponding physical field name.</p>
             * 
             * <strong>example:</strong>
             * <p>shid_star</p>
             */
            public Builder column(String column) {
                this.column = column;
                return this;
            }

            /**
             * <p>Data type.</p>
             * <ul>
             * <li>number: numeric</li>
             * <li>string: string</li>
             * <li>date: date</li>
             * <li>datetime: datetime</li>
             * <li>time: time</li>
             * <li>geographic: geographic</li>
             * <li>boolean: boolean</li>
             * <li>url: URL</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>datetime</p>
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * <p>Unique identifier for the original field.</p>
             * 
             * <strong>example:</strong>
             * <p>1c1f88cb7d</p>
             */
            public Builder fid(String fid) {
                this.fid = fid;
                return this;
            }

            /**
             * <p>This attribute is included for date and geographic dimensions, indicating the supported granularity.</p>
             * 
             * <strong>example:</strong>
             * <p>yearRegion</p>
             */
            public Builder granularity(String granularity) {
                this.granularity = granularity;
                return this;
            }

            /**
             * <p>Unique name of the cube field, mainly used for unique positioning in the returned result.</p>
             * 
             * <strong>example:</strong>
             * <p>sss</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Type.</p>
             * <ul>
             * <li>Dimension: Dimension</li>
             * <li>Measure: Measure</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>dimension</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Field build() {
                return new Field(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDataServiceListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDataServiceListResponseBody</p>
     */
    public static class ReturnFields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Aggregator")
        private String aggregator;

        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("Field")
        private Field field;

        @com.aliyun.core.annotation.NameInMap("Orderby")
        private String orderby;

        private ReturnFields(Builder builder) {
            this.aggregator = builder.aggregator;
            this.alias = builder.alias;
            this.desc = builder.desc;
            this.field = builder.field;
            this.orderby = builder.orderby;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReturnFields create() {
            return builder().build();
        }

        /**
         * @return aggregator
         */
        public String getAggregator() {
            return this.aggregator;
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return field
         */
        public Field getField() {
            return this.field;
        }

        /**
         * @return orderby
         */
        public String getOrderby() {
            return this.orderby;
        }

        public static final class Builder {
            private String aggregator; 
            private String alias; 
            private String desc; 
            private Field field; 
            private String orderby; 

            private Builder() {
            } 

            private Builder(ReturnFields model) {
                this.aggregator = model.aggregator;
                this.alias = model.alias;
                this.desc = model.desc;
                this.field = model.field;
                this.orderby = model.orderby;
            } 

            /**
             * <p>Aggregation operator. For example, SUM, AVG, and MAX.</p>
             * 
             * <strong>example:</strong>
             * <p>SUM</p>
             */
            public Builder aggregator(String aggregator) {
                this.aggregator = aggregator;
                return this;
            }

            /**
             * <p>Field parameter name.</p>
             * 
             * <strong>example:</strong>
             * <p>s_number</p>
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>Remark for the returned field.</p>
             * 
             * <strong>example:</strong>
             * <p>Theme Configuration already exists</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>Corresponding cube field information.</p>
             */
            public Builder field(Field field) {
                this.field = field;
                return this;
            }

            /**
             * <p>Sorting.</p>
             * <ul>
             * <li>asc: Ascending</li>
             * <li>desc: Descending</li>
             * <li>no: No sorting</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>no</p>
             */
            public Builder orderby(String orderby) {
                this.orderby = orderby;
                return this;
            }

            public ReturnFields build() {
                return new ReturnFields(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDataServiceListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDataServiceListResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CubeId")
        private String cubeId;

        @com.aliyun.core.annotation.NameInMap("CubeName")
        private String cubeName;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private Boolean detail;

        @com.aliyun.core.annotation.NameInMap("Filter")
        private Filter filter;

        @com.aliyun.core.annotation.NameInMap("ReturnFields")
        private java.util.List<ReturnFields> returnFields;

        private Content(Builder builder) {
            this.cubeId = builder.cubeId;
            this.cubeName = builder.cubeName;
            this.detail = builder.detail;
            this.filter = builder.filter;
            this.returnFields = builder.returnFields;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return cubeId
         */
        public String getCubeId() {
            return this.cubeId;
        }

        /**
         * @return cubeName
         */
        public String getCubeName() {
            return this.cubeName;
        }

        /**
         * @return detail
         */
        public Boolean getDetail() {
            return this.detail;
        }

        /**
         * @return filter
         */
        public Filter getFilter() {
            return this.filter;
        }

        /**
         * @return returnFields
         */
        public java.util.List<ReturnFields> getReturnFields() {
            return this.returnFields;
        }

        public static final class Builder {
            private String cubeId; 
            private String cubeName; 
            private Boolean detail; 
            private Filter filter; 
            private java.util.List<ReturnFields> returnFields; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.cubeId = model.cubeId;
                this.cubeName = model.cubeName;
                this.detail = model.detail;
                this.filter = model.filter;
                this.returnFields = model.returnFields;
            } 

            /**
             * <p>Cube identifier ID.</p>
             * 
             * <strong>example:</strong>
             * <p>56f9f34a-bdba-496a-91a3-a18b1ff73a80</p>
             */
            public Builder cubeId(String cubeId) {
                this.cubeId = cubeId;
                return this;
            }

            /**
             * <p>Dataset name.</p>
             * 
             * <strong>example:</strong>
             * <p>test data source</p>
             */
            public Builder cubeName(String cubeName) {
                this.cubeName = cubeName;
                return this;
            }

            /**
             * <p>Detail or Summary</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder detail(Boolean detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>Request parameter information.</p>
             */
            public Builder filter(Filter filter) {
                this.filter = filter;
                return this;
            }

            /**
             * <p>Return information.</p>
             */
            public Builder returnFields(java.util.List<ReturnFields> returnFields) {
                this.returnFields = returnFields;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDataServiceListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDataServiceListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private Content content;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("CreatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("CubeId")
        private String cubeId;

        @com.aliyun.core.annotation.NameInMap("CubeName")
        private String cubeName;

        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("ModifierId")
        private String modifierId;

        @com.aliyun.core.annotation.NameInMap("ModifierName")
        private String modifierName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("OwnerName")
        private String ownerName;

        @com.aliyun.core.annotation.NameInMap("Sid")
        private String sid;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        @com.aliyun.core.annotation.NameInMap("WorkspaceName")
        private String workspaceName;

        private Data(Builder builder) {
            this.content = builder.content;
            this.creatorId = builder.creatorId;
            this.creatorName = builder.creatorName;
            this.cubeId = builder.cubeId;
            this.cubeName = builder.cubeName;
            this.desc = builder.desc;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.modifierId = builder.modifierId;
            this.modifierName = builder.modifierName;
            this.name = builder.name;
            this.ownerId = builder.ownerId;
            this.ownerName = builder.ownerName;
            this.sid = builder.sid;
            this.workspaceId = builder.workspaceId;
            this.workspaceName = builder.workspaceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public Content getContent() {
            return this.content;
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return cubeId
         */
        public String getCubeId() {
            return this.cubeId;
        }

        /**
         * @return cubeName
         */
        public String getCubeName() {
            return this.cubeName;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return modifierId
         */
        public String getModifierId() {
            return this.modifierId;
        }

        /**
         * @return modifierName
         */
        public String getModifierName() {
            return this.modifierName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return sid
         */
        public String getSid() {
            return this.sid;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        /**
         * @return workspaceName
         */
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        public static final class Builder {
            private Content content; 
            private String creatorId; 
            private String creatorName; 
            private String cubeId; 
            private String cubeName; 
            private String desc; 
            private String gmtCreate; 
            private String gmtModified; 
            private String modifierId; 
            private String modifierName; 
            private String name; 
            private String ownerId; 
            private String ownerName; 
            private String sid; 
            private String workspaceId; 
            private String workspaceName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.content = model.content;
                this.creatorId = model.creatorId;
                this.creatorName = model.creatorName;
                this.cubeId = model.cubeId;
                this.cubeName = model.cubeName;
                this.desc = model.desc;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.modifierId = model.modifierId;
                this.modifierName = model.modifierName;
                this.name = model.name;
                this.ownerId = model.ownerId;
                this.ownerName = model.ownerName;
                this.sid = model.sid;
                this.workspaceId = model.workspaceId;
                this.workspaceName = model.workspaceName;
            } 

            /**
             * <p>The model of the data service in JSON format.</p>
             */
            public Builder content(Content content) {
                this.content = content;
                return this;
            }

            /**
             * <p>Creator ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7cb94cd48701</p>
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * <p>Creator&quot;s name.</p>
             * 
             * <strong>example:</strong>
             * <p>zhangsan</p>
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * <p>Cube identifier ID.</p>
             * 
             * <strong>example:</strong>
             * <p>d14e7448-0eb3-40d3-9375-4afef8de29fd</p>
             */
            public Builder cubeId(String cubeId) {
                this.cubeId = cubeId;
                return this;
            }

            /**
             * <p>Dataset name.</p>
             * 
             * <strong>example:</strong>
             * <p>test data source</p>
             */
            public Builder cubeName(String cubeName) {
                this.cubeName = cubeName;
                return this;
            }

            /**
             * <p>Description</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>Creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-18 14:00:02.0</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>Modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-21 18:02:36</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Modifier&quot;s userId.</p>
             * 
             * <strong>example:</strong>
             * <p>7cb94cd48701</p>
             */
            public Builder modifierId(String modifierId) {
                this.modifierId = modifierId;
                return this;
            }

            /**
             * <p>Modifier&quot;s name</p>
             * 
             * <strong>example:</strong>
             * <p>zhangsan</p>
             */
            public Builder modifierName(String modifierName) {
                this.modifierName = modifierName;
                return this;
            }

            /**
             * <p>Data service name.</p>
             * 
             * <strong>example:</strong>
             * <p>test report</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Owner ID</p>
             * 
             * <strong>example:</strong>
             * <p>862801339</p>
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>Owner&quot;s name</p>
             * 
             * <strong>example:</strong>
             * <p>lisi</p>
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * <p>Unique ID of the data service.</p>
             * 
             * <strong>example:</strong>
             * <p>dtsuq3i31f5j8v848b</p>
             */
            public Builder sid(String sid) {
                this.sid = sid;
                return this;
            }

            /**
             * <p>Workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7350a155-0e94-4c6c-8620-57bbec38****</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            /**
             * <p>Workspace name.</p>
             * 
             * <strong>example:</strong>
             * <p>test workspace</p>
             */
            public Builder workspaceName(String workspaceName) {
                this.workspaceName = workspaceName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDataServiceListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDataServiceListResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalNum")
        private Integer totalNum;

        @com.aliyun.core.annotation.NameInMap("TotalPages")
        private Integer totalPages;

        private Result(Builder builder) {
            this.data = builder.data;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.totalNum = builder.totalNum;
            this.totalPages = builder.totalPages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalNum
         */
        public Integer getTotalNum() {
            return this.totalNum;
        }

        /**
         * @return totalPages
         */
        public Integer getTotalPages() {
            return this.totalPages;
        }

        public static final class Builder {
            private java.util.List<Data> data; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer totalNum; 
            private Integer totalPages; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.data = model.data;
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.totalNum = model.totalNum;
                this.totalPages = model.totalPages;
            } 

            /**
             * <p>Data service information.</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>Page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>Number of records per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Total number of rows.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalNum(Integer totalNum) {
                this.totalNum = totalNum;
                return this;
            }

            /**
             * <p>Total number of pages.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalPages(Integer totalPages) {
                this.totalPages = totalPages;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
