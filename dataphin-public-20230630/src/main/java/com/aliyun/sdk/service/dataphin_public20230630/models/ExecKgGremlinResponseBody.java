// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ExecKgGremlinResponseBody} extends {@link TeaModel}
 *
 * <p>ExecKgGremlinResponseBody</p>
 */
public class ExecKgGremlinResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ExecKgGremlinResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecKgGremlinResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ExecKgGremlinResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ExecKgGremlinResponseBody build() {
            return new ExecKgGremlinResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ExecKgGremlinResponseBody} extends {@link TeaModel}
     *
     * <p>ExecKgGremlinResponseBody</p>
     */
    public static class Properties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Properties(Builder builder) {
            this.code = builder.code;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Properties create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String code; 
            private String value; 

            private Builder() {
            } 

            private Builder(Properties model) {
                this.code = model.code;
                this.value = model.value;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Properties build() {
                return new Properties(this);
            } 

        } 

    }
    /**
     * 
     * {@link ExecKgGremlinResponseBody} extends {@link TeaModel}
     *
     * <p>ExecKgGremlinResponseBody</p>
     */
    public static class EdgeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataId")
        private String dataId;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private java.util.List<Properties> properties;

        @com.aliyun.core.annotation.NameInMap("RelationType")
        private String relationType;

        @com.aliyun.core.annotation.NameInMap("SourceEntityDataId")
        private String sourceEntityDataId;

        @com.aliyun.core.annotation.NameInMap("SourceEntityType")
        private String sourceEntityType;

        @com.aliyun.core.annotation.NameInMap("TargetEntityDataId")
        private String targetEntityDataId;

        @com.aliyun.core.annotation.NameInMap("TargetEntityType")
        private String targetEntityType;

        private EdgeList(Builder builder) {
            this.dataId = builder.dataId;
            this.properties = builder.properties;
            this.relationType = builder.relationType;
            this.sourceEntityDataId = builder.sourceEntityDataId;
            this.sourceEntityType = builder.sourceEntityType;
            this.targetEntityDataId = builder.targetEntityDataId;
            this.targetEntityType = builder.targetEntityType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EdgeList create() {
            return builder().build();
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
        }

        /**
         * @return properties
         */
        public java.util.List<Properties> getProperties() {
            return this.properties;
        }

        /**
         * @return relationType
         */
        public String getRelationType() {
            return this.relationType;
        }

        /**
         * @return sourceEntityDataId
         */
        public String getSourceEntityDataId() {
            return this.sourceEntityDataId;
        }

        /**
         * @return sourceEntityType
         */
        public String getSourceEntityType() {
            return this.sourceEntityType;
        }

        /**
         * @return targetEntityDataId
         */
        public String getTargetEntityDataId() {
            return this.targetEntityDataId;
        }

        /**
         * @return targetEntityType
         */
        public String getTargetEntityType() {
            return this.targetEntityType;
        }

        public static final class Builder {
            private String dataId; 
            private java.util.List<Properties> properties; 
            private String relationType; 
            private String sourceEntityDataId; 
            private String sourceEntityType; 
            private String targetEntityDataId; 
            private String targetEntityType; 

            private Builder() {
            } 

            private Builder(EdgeList model) {
                this.dataId = model.dataId;
                this.properties = model.properties;
                this.relationType = model.relationType;
                this.sourceEntityDataId = model.sourceEntityDataId;
                this.sourceEntityType = model.sourceEntityType;
                this.targetEntityDataId = model.targetEntityDataId;
                this.targetEntityType = model.targetEntityType;
            } 

            /**
             * DataId.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * Properties.
             */
            public Builder properties(java.util.List<Properties> properties) {
                this.properties = properties;
                return this;
            }

            /**
             * RelationType.
             */
            public Builder relationType(String relationType) {
                this.relationType = relationType;
                return this;
            }

            /**
             * SourceEntityDataId.
             */
            public Builder sourceEntityDataId(String sourceEntityDataId) {
                this.sourceEntityDataId = sourceEntityDataId;
                return this;
            }

            /**
             * SourceEntityType.
             */
            public Builder sourceEntityType(String sourceEntityType) {
                this.sourceEntityType = sourceEntityType;
                return this;
            }

            /**
             * TargetEntityDataId.
             */
            public Builder targetEntityDataId(String targetEntityDataId) {
                this.targetEntityDataId = targetEntityDataId;
                return this;
            }

            /**
             * TargetEntityType.
             */
            public Builder targetEntityType(String targetEntityType) {
                this.targetEntityType = targetEntityType;
                return this;
            }

            public EdgeList build() {
                return new EdgeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ExecKgGremlinResponseBody} extends {@link TeaModel}
     *
     * <p>ExecKgGremlinResponseBody</p>
     */
    public static class NodeListProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private NodeListProperties(Builder builder) {
            this.code = builder.code;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeListProperties create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String code; 
            private String value; 

            private Builder() {
            } 

            private Builder(NodeListProperties model) {
                this.code = model.code;
                this.value = model.value;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public NodeListProperties build() {
                return new NodeListProperties(this);
            } 

        } 

    }
    /**
     * 
     * {@link ExecKgGremlinResponseBody} extends {@link TeaModel}
     *
     * <p>ExecKgGremlinResponseBody</p>
     */
    public static class NodeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataId")
        private String dataId;

        @com.aliyun.core.annotation.NameInMap("EntityType")
        private String entityType;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private java.util.List<NodeListProperties> properties;

        private NodeList(Builder builder) {
            this.dataId = builder.dataId;
            this.entityType = builder.entityType;
            this.properties = builder.properties;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeList create() {
            return builder().build();
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
        }

        /**
         * @return entityType
         */
        public String getEntityType() {
            return this.entityType;
        }

        /**
         * @return properties
         */
        public java.util.List<NodeListProperties> getProperties() {
            return this.properties;
        }

        public static final class Builder {
            private String dataId; 
            private String entityType; 
            private java.util.List<NodeListProperties> properties; 

            private Builder() {
            } 

            private Builder(NodeList model) {
                this.dataId = model.dataId;
                this.entityType = model.entityType;
                this.properties = model.properties;
            } 

            /**
             * DataId.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * EntityType.
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * Properties.
             */
            public Builder properties(java.util.List<NodeListProperties> properties) {
                this.properties = properties;
                return this;
            }

            public NodeList build() {
                return new NodeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ExecKgGremlinResponseBody} extends {@link TeaModel}
     *
     * <p>ExecKgGremlinResponseBody</p>
     */
    public static class Columns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Columns(Builder builder) {
            this.code = builder.code;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Columns create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String code; 
            private String value; 

            private Builder() {
            } 

            private Builder(Columns model) {
                this.code = model.code;
                this.value = model.value;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Columns build() {
                return new Columns(this);
            } 

        } 

    }
    /**
     * 
     * {@link ExecKgGremlinResponseBody} extends {@link TeaModel}
     *
     * <p>ExecKgGremlinResponseBody</p>
     */
    public static class RowList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Columns")
        private java.util.List<Columns> columns;

        private RowList(Builder builder) {
            this.columns = builder.columns;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RowList create() {
            return builder().build();
        }

        /**
         * @return columns
         */
        public java.util.List<Columns> getColumns() {
            return this.columns;
        }

        public static final class Builder {
            private java.util.List<Columns> columns; 

            private Builder() {
            } 

            private Builder(RowList model) {
                this.columns = model.columns;
            } 

            /**
             * Columns.
             */
            public Builder columns(java.util.List<Columns> columns) {
                this.columns = columns;
                return this;
            }

            public RowList build() {
                return new RowList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ExecKgGremlinResponseBody} extends {@link TeaModel}
     *
     * <p>ExecKgGremlinResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EdgeList")
        private java.util.List<EdgeList> edgeList;

        @com.aliyun.core.annotation.NameInMap("ExecQuery")
        private String execQuery;

        @com.aliyun.core.annotation.NameInMap("NodeList")
        private java.util.List<NodeList> nodeList;

        @com.aliyun.core.annotation.NameInMap("RowList")
        private java.util.List<RowList> rowList;

        private Data(Builder builder) {
            this.edgeList = builder.edgeList;
            this.execQuery = builder.execQuery;
            this.nodeList = builder.nodeList;
            this.rowList = builder.rowList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return edgeList
         */
        public java.util.List<EdgeList> getEdgeList() {
            return this.edgeList;
        }

        /**
         * @return execQuery
         */
        public String getExecQuery() {
            return this.execQuery;
        }

        /**
         * @return nodeList
         */
        public java.util.List<NodeList> getNodeList() {
            return this.nodeList;
        }

        /**
         * @return rowList
         */
        public java.util.List<RowList> getRowList() {
            return this.rowList;
        }

        public static final class Builder {
            private java.util.List<EdgeList> edgeList; 
            private String execQuery; 
            private java.util.List<NodeList> nodeList; 
            private java.util.List<RowList> rowList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.edgeList = model.edgeList;
                this.execQuery = model.execQuery;
                this.nodeList = model.nodeList;
                this.rowList = model.rowList;
            } 

            /**
             * EdgeList.
             */
            public Builder edgeList(java.util.List<EdgeList> edgeList) {
                this.edgeList = edgeList;
                return this;
            }

            /**
             * ExecQuery.
             */
            public Builder execQuery(String execQuery) {
                this.execQuery = execQuery;
                return this;
            }

            /**
             * NodeList.
             */
            public Builder nodeList(java.util.List<NodeList> nodeList) {
                this.nodeList = nodeList;
                return this;
            }

            /**
             * RowList.
             */
            public Builder rowList(java.util.List<RowList> rowList) {
                this.rowList = rowList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
