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
 * {@link GetKgNeighborResponseBody} extends {@link TeaModel}
 *
 * <p>GetKgNeighborResponseBody</p>
 */
public class GetKgNeighborResponseBody extends TeaModel {
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

    private GetKgNeighborResponseBody(Builder builder) {
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

    public static GetKgNeighborResponseBody create() {
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

        private Builder(GetKgNeighborResponseBody model) {
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

        public GetKgNeighborResponseBody build() {
            return new GetKgNeighborResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetKgNeighborResponseBody} extends {@link TeaModel}
     *
     * <p>GetKgNeighborResponseBody</p>
     */
    public static class PropertyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private PropertyList(Builder builder) {
            this.code = builder.code;
            this.dataType = builder.dataType;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String code; 
            private String dataType; 
            private String value; 

            private Builder() {
            } 

            private Builder(PropertyList model) {
                this.code = model.code;
                this.dataType = model.dataType;
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
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public PropertyList build() {
                return new PropertyList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetKgNeighborResponseBody} extends {@link TeaModel}
     *
     * <p>GetKgNeighborResponseBody</p>
     */
    public static class EdgeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PropertyList")
        private java.util.List<PropertyList> propertyList;

        @com.aliyun.core.annotation.NameInMap("RelationId")
        private String relationId;

        @com.aliyun.core.annotation.NameInMap("RelationType")
        private String relationType;

        @com.aliyun.core.annotation.NameInMap("SourceEntityId")
        private String sourceEntityId;

        @com.aliyun.core.annotation.NameInMap("TargetEntityId")
        private String targetEntityId;

        private EdgeList(Builder builder) {
            this.propertyList = builder.propertyList;
            this.relationId = builder.relationId;
            this.relationType = builder.relationType;
            this.sourceEntityId = builder.sourceEntityId;
            this.targetEntityId = builder.targetEntityId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EdgeList create() {
            return builder().build();
        }

        /**
         * @return propertyList
         */
        public java.util.List<PropertyList> getPropertyList() {
            return this.propertyList;
        }

        /**
         * @return relationId
         */
        public String getRelationId() {
            return this.relationId;
        }

        /**
         * @return relationType
         */
        public String getRelationType() {
            return this.relationType;
        }

        /**
         * @return sourceEntityId
         */
        public String getSourceEntityId() {
            return this.sourceEntityId;
        }

        /**
         * @return targetEntityId
         */
        public String getTargetEntityId() {
            return this.targetEntityId;
        }

        public static final class Builder {
            private java.util.List<PropertyList> propertyList; 
            private String relationId; 
            private String relationType; 
            private String sourceEntityId; 
            private String targetEntityId; 

            private Builder() {
            } 

            private Builder(EdgeList model) {
                this.propertyList = model.propertyList;
                this.relationId = model.relationId;
                this.relationType = model.relationType;
                this.sourceEntityId = model.sourceEntityId;
                this.targetEntityId = model.targetEntityId;
            } 

            /**
             * PropertyList.
             */
            public Builder propertyList(java.util.List<PropertyList> propertyList) {
                this.propertyList = propertyList;
                return this;
            }

            /**
             * RelationId.
             */
            public Builder relationId(String relationId) {
                this.relationId = relationId;
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
             * SourceEntityId.
             */
            public Builder sourceEntityId(String sourceEntityId) {
                this.sourceEntityId = sourceEntityId;
                return this;
            }

            /**
             * TargetEntityId.
             */
            public Builder targetEntityId(String targetEntityId) {
                this.targetEntityId = targetEntityId;
                return this;
            }

            public EdgeList build() {
                return new EdgeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetKgNeighborResponseBody} extends {@link TeaModel}
     *
     * <p>GetKgNeighborResponseBody</p>
     */
    public static class NodeListPropertyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private NodeListPropertyList(Builder builder) {
            this.code = builder.code;
            this.dataType = builder.dataType;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeListPropertyList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String code; 
            private String dataType; 
            private String value; 

            private Builder() {
            } 

            private Builder(NodeListPropertyList model) {
                this.code = model.code;
                this.dataType = model.dataType;
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
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public NodeListPropertyList build() {
                return new NodeListPropertyList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetKgNeighborResponseBody} extends {@link TeaModel}
     *
     * <p>GetKgNeighborResponseBody</p>
     */
    public static class NodeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EntityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("EntityType")
        private String entityType;

        @com.aliyun.core.annotation.NameInMap("PropertyList")
        private java.util.List<NodeListPropertyList> propertyList;

        private NodeList(Builder builder) {
            this.entityId = builder.entityId;
            this.entityType = builder.entityType;
            this.propertyList = builder.propertyList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeList create() {
            return builder().build();
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return entityType
         */
        public String getEntityType() {
            return this.entityType;
        }

        /**
         * @return propertyList
         */
        public java.util.List<NodeListPropertyList> getPropertyList() {
            return this.propertyList;
        }

        public static final class Builder {
            private String entityId; 
            private String entityType; 
            private java.util.List<NodeListPropertyList> propertyList; 

            private Builder() {
            } 

            private Builder(NodeList model) {
                this.entityId = model.entityId;
                this.entityType = model.entityType;
                this.propertyList = model.propertyList;
            } 

            /**
             * EntityId.
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
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
             * PropertyList.
             */
            public Builder propertyList(java.util.List<NodeListPropertyList> propertyList) {
                this.propertyList = propertyList;
                return this;
            }

            public NodeList build() {
                return new NodeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetKgNeighborResponseBody} extends {@link TeaModel}
     *
     * <p>GetKgNeighborResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EdgeList")
        private java.util.List<EdgeList> edgeList;

        @com.aliyun.core.annotation.NameInMap("NodeList")
        private java.util.List<NodeList> nodeList;

        private Data(Builder builder) {
            this.edgeList = builder.edgeList;
            this.nodeList = builder.nodeList;
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
         * @return nodeList
         */
        public java.util.List<NodeList> getNodeList() {
            return this.nodeList;
        }

        public static final class Builder {
            private java.util.List<EdgeList> edgeList; 
            private java.util.List<NodeList> nodeList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.edgeList = model.edgeList;
                this.nodeList = model.nodeList;
            } 

            /**
             * EdgeList.
             */
            public Builder edgeList(java.util.List<EdgeList> edgeList) {
                this.edgeList = edgeList;
                return this;
            }

            /**
             * NodeList.
             */
            public Builder nodeList(java.util.List<NodeList> nodeList) {
                this.nodeList = nodeList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
