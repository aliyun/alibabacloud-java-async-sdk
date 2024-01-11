// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryIncidentVertexNodesResponseBody} extends {@link TeaModel}
 *
 * <p>QueryIncidentVertexNodesResponseBody</p>
 */
public class QueryIncidentVertexNodesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("VertexNodes")
    private VertexNodes vertexNodes;

    private QueryIncidentVertexNodesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.vertexNodes = builder.vertexNodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryIncidentVertexNodesResponseBody create() {
        return builder().build();
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

    /**
     * @return vertexNodes
     */
    public VertexNodes getVertexNodes() {
        return this.vertexNodes;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean success; 
        private VertexNodes vertexNodes; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The results that are returned.
         */
        public Builder vertexNodes(VertexNodes vertexNodes) {
            this.vertexNodes = vertexNodes;
            return this;
        }

        public QueryIncidentVertexNodesResponseBody build() {
            return new QueryIncidentVertexNodesResponseBody(this);
        } 

    } 

    public static class EdgeList extends TeaModel {
        @NameInMap("Aliuid")
        private String aliuid;

        @NameInMap("EndId")
        private String endId;

        @NameInMap("EndType")
        private String endType;

        @NameInMap("Name")
        private String name;

        @NameInMap("Origin")
        private String origin;

        @NameInMap("Properties")
        private String properties;

        @NameInMap("Property")
        private java.util.Map < String, ? > property;

        @NameInMap("RuleId")
        private String ruleId;

        @NameInMap("ShowType")
        private String showType;

        @NameInMap("StartId")
        private String startId;

        @NameInMap("StartType")
        private String startType;

        @NameInMap("Time")
        private String time;

        @NameInMap("Timestamp")
        private Long timestamp;

        @NameInMap("Type")
        private String type;

        @NameInMap("TypeName")
        private String typeName;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("Uuid")
        private String uuid;

        private EdgeList(Builder builder) {
            this.aliuid = builder.aliuid;
            this.endId = builder.endId;
            this.endType = builder.endType;
            this.name = builder.name;
            this.origin = builder.origin;
            this.properties = builder.properties;
            this.property = builder.property;
            this.ruleId = builder.ruleId;
            this.showType = builder.showType;
            this.startId = builder.startId;
            this.startType = builder.startType;
            this.time = builder.time;
            this.timestamp = builder.timestamp;
            this.type = builder.type;
            this.typeName = builder.typeName;
            this.updateTime = builder.updateTime;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EdgeList create() {
            return builder().build();
        }

        /**
         * @return aliuid
         */
        public String getAliuid() {
            return this.aliuid;
        }

        /**
         * @return endId
         */
        public String getEndId() {
            return this.endId;
        }

        /**
         * @return endType
         */
        public String getEndType() {
            return this.endType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return origin
         */
        public String getOrigin() {
            return this.origin;
        }

        /**
         * @return properties
         */
        public String getProperties() {
            return this.properties;
        }

        /**
         * @return property
         */
        public java.util.Map < String, ? > getProperty() {
            return this.property;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return showType
         */
        public String getShowType() {
            return this.showType;
        }

        /**
         * @return startId
         */
        public String getStartId() {
            return this.startId;
        }

        /**
         * @return startType
         */
        public String getStartType() {
            return this.startType;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return typeName
         */
        public String getTypeName() {
            return this.typeName;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String aliuid; 
            private String endId; 
            private String endType; 
            private String name; 
            private String origin; 
            private String properties; 
            private java.util.Map < String, ? > property; 
            private String ruleId; 
            private String showType; 
            private String startId; 
            private String startType; 
            private String time; 
            private Long timestamp; 
            private String type; 
            private String typeName; 
            private String updateTime; 
            private String uuid; 

            /**
             * The ID of the Alibaba Cloud account to which the edge belongs.
             */
            public Builder aliuid(String aliuid) {
                this.aliuid = aliuid;
                return this;
            }

            /**
             * The ID of the end node for the edge.
             */
            public Builder endId(String endId) {
                this.endId = endId;
                return this;
            }

            /**
             * The type of the end node for the edge. Valid values include but are not limited to:
             * <p>
             * 
             * *   **process**
             * *   **file**
             * *   **alert**
             * *   **ip**
             * *   **domain**
             */
            public Builder endType(String endType) {
                this.endType = endType;
                return this;
            }

            /**
             * The name of the edge.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The original name of the edge.
             */
            public Builder origin(String origin) {
                this.origin = origin;
                return this;
            }

            /**
             * The edge properties. The value is in the text format.
             */
            public Builder properties(String properties) {
                this.properties = properties;
                return this;
            }

            /**
             * The property of the edge.
             */
            public Builder property(java.util.Map < String, ? > property) {
                this.property = property;
                return this;
            }

            /**
             * The ID of the rule for which the edge was created.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * The display type of the edge.
             */
            public Builder showType(String showType) {
                this.showType = showType;
                return this;
            }

            /**
             * The ID of the start node for the edge.
             */
            public Builder startId(String startId) {
                this.startId = startId;
                return this;
            }

            /**
             * The type of the start node for the edge. Valid values include but are not limited to:
             * <p>
             * 
             * *   **process**
             * *   **file**
             * *   **alert**
             * *   **ip**
             * *   **domain**
             */
            public Builder startType(String startType) {
                this.startType = startType;
                return this;
            }

            /**
             * The time when the edge was created.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * The UNIX timestamp when the edge was created. Unit: milliseconds.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * The type of the edge.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The type name of the edge.
             */
            public Builder typeName(String typeName) {
                this.typeName = typeName;
                return this;
            }

            /**
             * The time when the edge was updated.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The UUID of the edge.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public EdgeList build() {
                return new EdgeList(this);
            } 

        } 

    }
    public static class EntityTypeList extends TeaModel {
        @NameInMap("CurrentVersionId")
        private String currentVersionId;

        @NameInMap("DisplayColor")
        private String displayColor;

        @NameInMap("DisplayIcon")
        private String displayIcon;

        @NameInMap("DisplayOrder")
        private Integer displayOrder;

        @NameInMap("DisplayTemplate")
        private String displayTemplate;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private String id;

        @NameInMap("IsVirtualNode")
        private Integer isVirtualNode;

        @NameInMap("Name")
        private String name;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("SyncId")
        private Integer syncId;

        @NameInMap("TraceSuccessFlag")
        private Integer traceSuccessFlag;

        private EntityTypeList(Builder builder) {
            this.currentVersionId = builder.currentVersionId;
            this.displayColor = builder.displayColor;
            this.displayIcon = builder.displayIcon;
            this.displayOrder = builder.displayOrder;
            this.displayTemplate = builder.displayTemplate;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.isVirtualNode = builder.isVirtualNode;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.syncId = builder.syncId;
            this.traceSuccessFlag = builder.traceSuccessFlag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EntityTypeList create() {
            return builder().build();
        }

        /**
         * @return currentVersionId
         */
        public String getCurrentVersionId() {
            return this.currentVersionId;
        }

        /**
         * @return displayColor
         */
        public String getDisplayColor() {
            return this.displayColor;
        }

        /**
         * @return displayIcon
         */
        public String getDisplayIcon() {
            return this.displayIcon;
        }

        /**
         * @return displayOrder
         */
        public Integer getDisplayOrder() {
            return this.displayOrder;
        }

        /**
         * @return displayTemplate
         */
        public String getDisplayTemplate() {
            return this.displayTemplate;
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
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return isVirtualNode
         */
        public Integer getIsVirtualNode() {
            return this.isVirtualNode;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return syncId
         */
        public Integer getSyncId() {
            return this.syncId;
        }

        /**
         * @return traceSuccessFlag
         */
        public Integer getTraceSuccessFlag() {
            return this.traceSuccessFlag;
        }

        public static final class Builder {
            private String currentVersionId; 
            private String displayColor; 
            private String displayIcon; 
            private Integer displayOrder; 
            private String displayTemplate; 
            private String gmtCreate; 
            private String gmtModified; 
            private String id; 
            private Integer isVirtualNode; 
            private String name; 
            private String namespace; 
            private Integer syncId; 
            private Integer traceSuccessFlag; 

            /**
             * The version of the entity.
             */
            public Builder currentVersionId(String currentVersionId) {
                this.currentVersionId = currentVersionId;
                return this;
            }

            /**
             * The display color of the entity.
             */
            public Builder displayColor(String displayColor) {
                this.displayColor = displayColor;
                return this;
            }

            /**
             * The display icon of the entity.
             */
            public Builder displayIcon(String displayIcon) {
                this.displayIcon = displayIcon;
                return this;
            }

            /**
             * The display order of the entity.
             */
            public Builder displayOrder(Integer displayOrder) {
                this.displayOrder = displayOrder;
                return this;
            }

            /**
             * The display template of the entity.
             */
            public Builder displayTemplate(String displayTemplate) {
                this.displayTemplate = displayTemplate;
                return this;
            }

            /**
             * The time when the entity was created.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the entity was updated.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of the entity.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Indicates whether the entity is a virtual node.
             */
            public Builder isVirtualNode(Integer isVirtualNode) {
                this.isVirtualNode = isVirtualNode;
                return this;
            }

            /**
             * The name of the entity.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The namespace of the entity.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The synchronization ID of the entity.
             */
            public Builder syncId(Integer syncId) {
                this.syncId = syncId;
                return this;
            }

            /**
             * Indicates whether the entity is traced. Valid values:
             * <p>
             * 
             * *   **1**: The entity is traced.
             * *   **0**: The entity fails to be traced.
             */
            public Builder traceSuccessFlag(Integer traceSuccessFlag) {
                this.traceSuccessFlag = traceSuccessFlag;
                return this;
            }

            public EntityTypeList build() {
                return new EntityTypeList(this);
            } 

        } 

    }
    public static class RelationTypeList extends TeaModel {
        @NameInMap("CurrentVersionId")
        private String currentVersionId;

        @NameInMap("DIsplayIcon")
        private String dIsplayIcon;

        @NameInMap("Directed")
        private Integer directed;

        @NameInMap("DisplayColor")
        private String displayColor;

        @NameInMap("DisplayTemplate")
        private String displayTemplate;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("ShowType")
        private String showType;

        @NameInMap("SyncId")
        private Integer syncId;

        private RelationTypeList(Builder builder) {
            this.currentVersionId = builder.currentVersionId;
            this.dIsplayIcon = builder.dIsplayIcon;
            this.directed = builder.directed;
            this.displayColor = builder.displayColor;
            this.displayTemplate = builder.displayTemplate;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.showType = builder.showType;
            this.syncId = builder.syncId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelationTypeList create() {
            return builder().build();
        }

        /**
         * @return currentVersionId
         */
        public String getCurrentVersionId() {
            return this.currentVersionId;
        }

        /**
         * @return dIsplayIcon
         */
        public String getDIsplayIcon() {
            return this.dIsplayIcon;
        }

        /**
         * @return directed
         */
        public Integer getDirected() {
            return this.directed;
        }

        /**
         * @return displayColor
         */
        public String getDisplayColor() {
            return this.displayColor;
        }

        /**
         * @return displayTemplate
         */
        public String getDisplayTemplate() {
            return this.displayTemplate;
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
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return showType
         */
        public String getShowType() {
            return this.showType;
        }

        /**
         * @return syncId
         */
        public Integer getSyncId() {
            return this.syncId;
        }

        public static final class Builder {
            private String currentVersionId; 
            private String dIsplayIcon; 
            private Integer directed; 
            private String displayColor; 
            private String displayTemplate; 
            private String gmtCreate; 
            private String gmtModified; 
            private String id; 
            private String name; 
            private String namespace; 
            private String showType; 
            private Integer syncId; 

            /**
             * The version of the relationship.
             */
            public Builder currentVersionId(String currentVersionId) {
                this.currentVersionId = currentVersionId;
                return this;
            }

            /**
             * The display icon of the relationship.
             */
            public Builder dIsplayIcon(String dIsplayIcon) {
                this.dIsplayIcon = dIsplayIcon;
                return this;
            }

            /**
             * The direction of the relationship. Valid values:
             * <p>
             * 
             * *   **1**: forward
             * *   **0**: reverse
             */
            public Builder directed(Integer directed) {
                this.directed = directed;
                return this;
            }

            /**
             * The display color of the relationship.
             */
            public Builder displayColor(String displayColor) {
                this.displayColor = displayColor;
                return this;
            }

            /**
             * The display template of the relationship.
             */
            public Builder displayTemplate(String displayTemplate) {
                this.displayTemplate = displayTemplate;
                return this;
            }

            /**
             * The time when the relationship was created.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the relationship was updated.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of the relationship.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the relationship.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The namespace of the relationship.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The display type of the relationship.
             */
            public Builder showType(String showType) {
                this.showType = showType;
                return this;
            }

            /**
             * The synchronization ID of the relationship.
             */
            public Builder syncId(Integer syncId) {
                this.syncId = syncId;
                return this;
            }

            public RelationTypeList build() {
                return new RelationTypeList(this);
            } 

        } 

    }
    public static class DisplayInfo extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private String value;

        private DisplayInfo(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DisplayInfo create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * The display name of the property.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The display value of the property.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DisplayInfo build() {
                return new DisplayInfo(this);
            } 

        } 

    }
    public static class NeighborList extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("HasMore")
        private Boolean hasMore;

        @NameInMap("Type")
        private String type;

        private NeighborList(Builder builder) {
            this.count = builder.count;
            this.hasMore = builder.hasMore;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NeighborList create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return hasMore
         */
        public Boolean getHasMore() {
            return this.hasMore;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer count; 
            private Boolean hasMore; 
            private String type; 

            /**
             * The number of neighboring nodes.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * Indicates whether more neighboring nodes exist. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder hasMore(Boolean hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * The type of the neighboring node. Valid values include but are not limited to:
             * <p>
             * 
             * *   **process**
             * *   **file**
             * *   **alert**
             * *   **ip**
             * *   **domain**
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public NeighborList build() {
                return new NeighborList(this);
            } 

        } 

    }
    public static class VertexList extends TeaModel {
        @NameInMap("Aliuid")
        private String aliuid;

        @NameInMap("DisplayInfo")
        private java.util.List < DisplayInfo> displayInfo;

        @NameInMap("Id")
        private String id;

        @NameInMap("Lang")
        private String lang;

        @NameInMap("Name")
        private String name;

        @NameInMap("NeighborList")
        private java.util.List < NeighborList> neighborList;

        @NameInMap("Properties")
        private String properties;

        @NameInMap("Property")
        private java.util.Map < String, ? > property;

        @NameInMap("RuleId")
        private String ruleId;

        @NameInMap("Time")
        private String time;

        @NameInMap("Timestamp")
        private Long timestamp;

        @NameInMap("Type")
        private String type;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("Uuid")
        private String uuid;

        private VertexList(Builder builder) {
            this.aliuid = builder.aliuid;
            this.displayInfo = builder.displayInfo;
            this.id = builder.id;
            this.lang = builder.lang;
            this.name = builder.name;
            this.neighborList = builder.neighborList;
            this.properties = builder.properties;
            this.property = builder.property;
            this.ruleId = builder.ruleId;
            this.time = builder.time;
            this.timestamp = builder.timestamp;
            this.type = builder.type;
            this.updateTime = builder.updateTime;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VertexList create() {
            return builder().build();
        }

        /**
         * @return aliuid
         */
        public String getAliuid() {
            return this.aliuid;
        }

        /**
         * @return displayInfo
         */
        public java.util.List < DisplayInfo> getDisplayInfo() {
            return this.displayInfo;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return lang
         */
        public String getLang() {
            return this.lang;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return neighborList
         */
        public java.util.List < NeighborList> getNeighborList() {
            return this.neighborList;
        }

        /**
         * @return properties
         */
        public String getProperties() {
            return this.properties;
        }

        /**
         * @return property
         */
        public java.util.Map < String, ? > getProperty() {
            return this.property;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String aliuid; 
            private java.util.List < DisplayInfo> displayInfo; 
            private String id; 
            private String lang; 
            private String name; 
            private java.util.List < NeighborList> neighborList; 
            private String properties; 
            private java.util.Map < String, ? > property; 
            private String ruleId; 
            private String time; 
            private Long timestamp; 
            private String type; 
            private String updateTime; 
            private String uuid; 

            /**
             * The ID of the Alibaba Cloud account to which the node belongs.
             */
            public Builder aliuid(String aliuid) {
                this.aliuid = aliuid;
                return this;
            }

            /**
             * The display information about the node.
             */
            public Builder displayInfo(java.util.List < DisplayInfo> displayInfo) {
                this.displayInfo = displayInfo;
                return this;
            }

            /**
             * The node ID.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The display language of the neighboring node. Valid values:
             * <p>
             * 
             * *   **zh**: Chinese
             * *   **en**: English
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * The node name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The neighboring nodes of the node.
             */
            public Builder neighborList(java.util.List < NeighborList> neighborList) {
                this.neighborList = neighborList;
                return this;
            }

            /**
             * The node properties. The value is in the text format.
             */
            public Builder properties(String properties) {
                this.properties = properties;
                return this;
            }

            /**
             * The node property.
             */
            public Builder property(java.util.Map < String, ? > property) {
                this.property = property;
                return this;
            }

            /**
             * The ID of the rule for which the node was created.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * The time when the node was created.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * The UNIX timestamp when the node was created. Unit: milliseconds.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * The node type. Valid values include but are not limited to:
             * <p>
             * 
             * *   **process**
             * *   **file**
             * *   **alert**
             * *   **ip**
             * *   **domain**
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The time when the node was updated.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The node UUID.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public VertexList build() {
                return new VertexList(this);
            } 

        } 

    }
    public static class VertexNodes extends TeaModel {
        @NameInMap("EdgeList")
        private java.util.List < EdgeList> edgeList;

        @NameInMap("EntityTypeList")
        private java.util.List < EntityTypeList> entityTypeList;

        @NameInMap("Lang")
        private String lang;

        @NameInMap("RelationTypeList")
        private java.util.List < RelationTypeList> relationTypeList;

        @NameInMap("VertexList")
        private java.util.List < VertexList> vertexList;

        private VertexNodes(Builder builder) {
            this.edgeList = builder.edgeList;
            this.entityTypeList = builder.entityTypeList;
            this.lang = builder.lang;
            this.relationTypeList = builder.relationTypeList;
            this.vertexList = builder.vertexList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VertexNodes create() {
            return builder().build();
        }

        /**
         * @return edgeList
         */
        public java.util.List < EdgeList> getEdgeList() {
            return this.edgeList;
        }

        /**
         * @return entityTypeList
         */
        public java.util.List < EntityTypeList> getEntityTypeList() {
            return this.entityTypeList;
        }

        /**
         * @return lang
         */
        public String getLang() {
            return this.lang;
        }

        /**
         * @return relationTypeList
         */
        public java.util.List < RelationTypeList> getRelationTypeList() {
            return this.relationTypeList;
        }

        /**
         * @return vertexList
         */
        public java.util.List < VertexList> getVertexList() {
            return this.vertexList;
        }

        public static final class Builder {
            private java.util.List < EdgeList> edgeList; 
            private java.util.List < EntityTypeList> entityTypeList; 
            private String lang; 
            private java.util.List < RelationTypeList> relationTypeList; 
            private java.util.List < VertexList> vertexList; 

            /**
             * The edges that are returned.
             */
            public Builder edgeList(java.util.List < EdgeList> edgeList) {
                this.edgeList = edgeList;
                return this;
            }

            /**
             * The entities that are returned.
             */
            public Builder entityTypeList(java.util.List < EntityTypeList> entityTypeList) {
                this.entityTypeList = entityTypeList;
                return this;
            }

            /**
             * The language of the content within the request. Valid values:
             * <p>
             * 
             * *   **zh**: Chinese
             * *   **en**: English
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * The relationships that are returned.
             */
            public Builder relationTypeList(java.util.List < RelationTypeList> relationTypeList) {
                this.relationTypeList = relationTypeList;
                return this;
            }

            /**
             * The detailed information about the node.
             */
            public Builder vertexList(java.util.List < VertexList> vertexList) {
                this.vertexList = vertexList;
                return this;
            }

            public VertexNodes build() {
                return new VertexNodes(this);
            } 

        } 

    }
}
