// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryIncidentVertexNodesResponseBody} extends {@link TeaModel}
 *
 * <p>QueryIncidentVertexNodesResponseBody</p>
 */
public class QueryIncidentVertexNodesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("VertexNodes")
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ACF97412-FD09-4D1F-994F-34DF12BREF20</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The results that are returned.</p>
         */
        public Builder vertexNodes(VertexNodes vertexNodes) {
            this.vertexNodes = vertexNodes;
            return this;
        }

        public QueryIncidentVertexNodesResponseBody build() {
            return new QueryIncidentVertexNodesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryIncidentVertexNodesResponseBody} extends {@link TeaModel}
     *
     * <p>QueryIncidentVertexNodesResponseBody</p>
     */
    public static class EdgeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Aliuid")
        private String aliuid;

        @com.aliyun.core.annotation.NameInMap("EndId")
        private String endId;

        @com.aliyun.core.annotation.NameInMap("EndType")
        private String endType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Origin")
        private String origin;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private String properties;

        @com.aliyun.core.annotation.NameInMap("Property")
        private java.util.Map < String, ? > property;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("ShowType")
        private String showType;

        @com.aliyun.core.annotation.NameInMap("StartId")
        private String startId;

        @com.aliyun.core.annotation.NameInMap("StartType")
        private String startType;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("TypeName")
        private String typeName;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("Uuid")
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
             * <p>The ID of the Alibaba Cloud account to which the edge belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>20973951</p>
             */
            public Builder aliuid(String aliuid) {
                this.aliuid = aliuid;
                return this;
            }

            /**
             * <p>The ID of the end node for the edge.</p>
             * 
             * <strong>example:</strong>
             * <p>64002</p>
             */
            public Builder endId(String endId) {
                this.endId = endId;
                return this;
            }

            /**
             * <p>The type of the end node for the edge. Valid values include but are not limited to:</p>
             * <ul>
             * <li><strong>process</strong></li>
             * <li><strong>file</strong></li>
             * <li><strong>alert</strong></li>
             * <li><strong>ip</strong></li>
             * <li><strong>domain</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>file</p>
             */
            public Builder endType(String endType) {
                this.endType = endType;
                return this;
            }

            /**
             * <p>The name of the edge.</p>
             * 
             * <strong>example:</strong>
             * <p>jdk</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The original name of the edge.</p>
             * 
             * <strong>example:</strong>
             * <p>distribution</p>
             */
            public Builder origin(String origin) {
                this.origin = origin;
                return this;
            }

            /**
             * <p>The properties of the edge. The value is in the text format.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;bandWidth&quot;:&quot;7810048&quot;,&quot;internetIp&quot;:&quot;47.57.13.255&quot;,&quot;changeReason&quot;:&quot;MODIFY_SPEC&quot;,&quot;bindInstanceId&quot;:&quot;i-j6chvo01tle7qfnhewr3&quot;,&quot;bindType&quot;:&quot;EIP_ECS&quot;}</p>
             */
            public Builder properties(String properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>The property of the edge.</p>
             */
            public Builder property(java.util.Map < String, ? > property) {
                this.property = property;
                return this;
            }

            /**
             * <p>The ID of the rule based on which the edge was created.</p>
             * 
             * <strong>example:</strong>
             * <p>368</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The display type of the edge.</p>
             * 
             * <strong>example:</strong>
             * <p>type</p>
             */
            public Builder showType(String showType) {
                this.showType = showType;
                return this;
            }

            /**
             * <p>The ID of the start node for the edge.</p>
             * 
             * <strong>example:</strong>
             * <p>52003</p>
             */
            public Builder startId(String startId) {
                this.startId = startId;
                return this;
            }

            /**
             * <p>The type of the start node for the edge. Valid values include but are not limited to:</p>
             * <ul>
             * <li><strong>process</strong></li>
             * <li><strong>file</strong></li>
             * <li><strong>alert</strong></li>
             * <li><strong>ip</strong></li>
             * <li><strong>domain</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>process</p>
             */
            public Builder startType(String startType) {
                this.startType = startType;
                return this;
            }

            /**
             * <p>The time when the edge was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-06 11:00:00</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The time when the edge was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1645168444</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The type of the edge.</p>
             * 
             * <strong>example:</strong>
             * <p>cve</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The type name of the edge.</p>
             * 
             * <strong>example:</strong>
             * <p>weak_password</p>
             */
            public Builder typeName(String typeName) {
                this.typeName = typeName;
                return this;
            }

            /**
             * <p>The time when the edge was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-16T07:20:33.000Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The UUID of the edge.</p>
             * 
             * <strong>example:</strong>
             * <p>549237d6-86d1-47f6-9ffa-3f97da9e6b10</p>
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
    /**
     * 
     * {@link QueryIncidentVertexNodesResponseBody} extends {@link TeaModel}
     *
     * <p>QueryIncidentVertexNodesResponseBody</p>
     */
    public static class EntityTypeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentVersionId")
        private String currentVersionId;

        @com.aliyun.core.annotation.NameInMap("DisplayColor")
        private String displayColor;

        @com.aliyun.core.annotation.NameInMap("DisplayIcon")
        private String displayIcon;

        @com.aliyun.core.annotation.NameInMap("DisplayOrder")
        private Integer displayOrder;

        @com.aliyun.core.annotation.NameInMap("DisplayTemplate")
        private String displayTemplate;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IsVirtualNode")
        private Integer isVirtualNode;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("SyncId")
        private Integer syncId;

        @com.aliyun.core.annotation.NameInMap("TraceSuccessFlag")
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
             * <p>The version of the entity.</p>
             * 
             * <strong>example:</strong>
             * <p>993</p>
             */
            public Builder currentVersionId(String currentVersionId) {
                this.currentVersionId = currentVersionId;
                return this;
            }

            /**
             * <p>The display color of the entity.</p>
             * 
             * <strong>example:</strong>
             * <p>red</p>
             */
            public Builder displayColor(String displayColor) {
                this.displayColor = displayColor;
                return this;
            }

            /**
             * <p>The display icon of the entity.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://img.22222.com">http://img.22222.com</a></p>
             */
            public Builder displayIcon(String displayIcon) {
                this.displayIcon = displayIcon;
                return this;
            }

            /**
             * <p>The display order of the entity.</p>
             * 
             * <strong>example:</strong>
             * <p>01</p>
             */
            public Builder displayOrder(Integer displayOrder) {
                this.displayOrder = displayOrder;
                return this;
            }

            /**
             * <p>The display template of the entity.</p>
             * 
             * <strong>example:</strong>
             * <p>template1</p>
             */
            public Builder displayTemplate(String displayTemplate) {
                this.displayTemplate = displayTemplate;
                return this;
            }

            /**
             * <p>The time when the entity was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-23T10:50Z</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the entity was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1623317089000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the entity.</p>
             * 
             * <strong>example:</strong>
             * <p>33926</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether the entity is a virtual node.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isVirtualNode(Integer isVirtualNode) {
                this.isVirtualNode = isVirtualNode;
                return this;
            }

            /**
             * <p>The name of the entity.</p>
             * 
             * <strong>example:</strong>
             * <p>auto-test-policy-name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace of the entity.</p>
             * 
             * <strong>example:</strong>
             * <p>78</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The synchronization ID of the entity.</p>
             * 
             * <strong>example:</strong>
             * <p>3212024a-1816-46d5-b286-e5d5780fd778</p>
             */
            public Builder syncId(Integer syncId) {
                this.syncId = syncId;
                return this;
            }

            /**
             * <p>Indicates whether the entity is traced. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The entity is traced.</li>
             * <li><strong>0</strong>: The entity fails to be traced.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link QueryIncidentVertexNodesResponseBody} extends {@link TeaModel}
     *
     * <p>QueryIncidentVertexNodesResponseBody</p>
     */
    public static class RelationTypeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentVersionId")
        private String currentVersionId;

        @com.aliyun.core.annotation.NameInMap("DIsplayIcon")
        private String dIsplayIcon;

        @com.aliyun.core.annotation.NameInMap("Directed")
        private Integer directed;

        @com.aliyun.core.annotation.NameInMap("DisplayColor")
        private String displayColor;

        @com.aliyun.core.annotation.NameInMap("DisplayTemplate")
        private String displayTemplate;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("ShowType")
        private String showType;

        @com.aliyun.core.annotation.NameInMap("SyncId")
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
             * <p>The version of the relationship.</p>
             * 
             * <strong>example:</strong>
             * <p>1487</p>
             */
            public Builder currentVersionId(String currentVersionId) {
                this.currentVersionId = currentVersionId;
                return this;
            }

            /**
             * <p>The display icon of the relationship.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://img.33.com">http://img.33.com</a></p>
             */
            public Builder dIsplayIcon(String dIsplayIcon) {
                this.dIsplayIcon = dIsplayIcon;
                return this;
            }

            /**
             * <p>The direction of the relationship. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: forward.</li>
             * <li><strong>0</strong>: reverse.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>in</p>
             */
            public Builder directed(Integer directed) {
                this.directed = directed;
                return this;
            }

            /**
             * <p>The display color of the relationship.</p>
             * 
             * <strong>example:</strong>
             * <p>red</p>
             */
            public Builder displayColor(String displayColor) {
                this.displayColor = displayColor;
                return this;
            }

            /**
             * <p>The display template of the relationship.</p>
             * 
             * <strong>example:</strong>
             * <p>template1</p>
             */
            public Builder displayTemplate(String displayTemplate) {
                this.displayTemplate = displayTemplate;
                return this;
            }

            /**
             * <p>The time when the relationship was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-02T10:20Z</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the relationship was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1637556498000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the relationship.</p>
             * 
             * <strong>example:</strong>
             * <p>9350</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the relationship.</p>
             * 
             * <strong>example:</strong>
             * <p>mongod</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace of the relationship.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The display type of the relationship.</p>
             * 
             * <strong>example:</strong>
             * <p>type1</p>
             */
            public Builder showType(String showType) {
                this.showType = showType;
                return this;
            }

            /**
             * <p>The synchronization ID of the relationship.</p>
             * 
             * <strong>example:</strong>
             * <p>a45185c7-b1b8-4a49-b04a-d6bfa051ef0e</p>
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
    /**
     * 
     * {@link QueryIncidentVertexNodesResponseBody} extends {@link TeaModel}
     *
     * <p>QueryIncidentVertexNodesResponseBody</p>
     */
    public static class DisplayInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The display name of the property.</p>
             * 
             * <strong>example:</strong>
             * <p>zabbix</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The display value of the property.</p>
             * 
             * <strong>example:</strong>
             * <p>cs-nacos</p>
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
    /**
     * 
     * {@link QueryIncidentVertexNodesResponseBody} extends {@link TeaModel}
     *
     * <p>QueryIncidentVertexNodesResponseBody</p>
     */
    public static class NeighborList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("HasMore")
        private Boolean hasMore;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * <p>The number of neighboring nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>27</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>Indicates whether more neighboring nodes exist. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>False</p>
             */
            public Builder hasMore(Boolean hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * <p>The type of the neighboring node. Valid values include but are not limited to:</p>
             * <ul>
             * <li><strong>process</strong></li>
             * <li><strong>file</strong></li>
             * <li><strong>alert</strong></li>
             * <li><strong>ip</strong></li>
             * <li><strong>domain</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>elf</p>
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
    /**
     * 
     * {@link QueryIncidentVertexNodesResponseBody} extends {@link TeaModel}
     *
     * <p>QueryIncidentVertexNodesResponseBody</p>
     */
    public static class VertexList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Aliuid")
        private String aliuid;

        @com.aliyun.core.annotation.NameInMap("DisplayInfo")
        private java.util.List < DisplayInfo> displayInfo;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Lang")
        private String lang;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NeighborList")
        private java.util.List < NeighborList> neighborList;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private String properties;

        @com.aliyun.core.annotation.NameInMap("Property")
        private java.util.Map < String, ? > property;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("Uuid")
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
             * <p>The ID of the Alibaba Cloud account to which the node belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>20973951</p>
             */
            public Builder aliuid(String aliuid) {
                this.aliuid = aliuid;
                return this;
            }

            /**
             * <p>The display information of the node.</p>
             */
            public Builder displayInfo(java.util.List < DisplayInfo> displayInfo) {
                this.displayInfo = displayInfo;
                return this;
            }

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>225</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The display language of the neighboring node. Valid values:</p>
             * <ul>
             * <li><strong>zh</strong>: Chinese.</li>
             * <li><strong>en</strong>: English.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>zh</p>
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * <p>The name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>zabbix</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The neighboring nodes of the node.</p>
             */
            public Builder neighborList(java.util.List < NeighborList> neighborList) {
                this.neighborList = neighborList;
                return this;
            }

            /**
             * <p>The properties of the node. The value is in the text format.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;bandWidth&quot;:&quot;5120&quot;,&quot;internetIp&quot;:&quot;47.242.191.206&quot;,&quot;changeReason&quot;:&quot;EIP_BIND&quot;,&quot;bindInstanceId&quot;:&quot;eci-j6ci7lvci50rore7dkv8&quot;,&quot;bindType&quot;:&quot;EIP_ECS&quot;}</p>
             */
            public Builder properties(String properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>The property of the node.</p>
             */
            public Builder property(java.util.Map < String, ? > property) {
                this.property = property;
                return this;
            }

            /**
             * <p>The ID of the rule based on which the node was created.</p>
             * 
             * <strong>example:</strong>
             * <p>171</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The time when the node was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1636081135</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The time when the node was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1645179073</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The type of the node. Valid values include but are not limited to:</p>
             * <ul>
             * <li><strong>process</strong></li>
             * <li><strong>file</strong></li>
             * <li><strong>alert</strong></li>
             * <li><strong>ip</strong></li>
             * <li><strong>domain</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sys</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The time when the node was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-16T07:20:33.000Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The UUID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>02ca8614-ecdb-44d3-b3d0-158655080e4f</p>
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
    /**
     * 
     * {@link QueryIncidentVertexNodesResponseBody} extends {@link TeaModel}
     *
     * <p>QueryIncidentVertexNodesResponseBody</p>
     */
    public static class VertexNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EdgeList")
        private java.util.List < EdgeList> edgeList;

        @com.aliyun.core.annotation.NameInMap("EntityTypeList")
        private java.util.List < EntityTypeList> entityTypeList;

        @com.aliyun.core.annotation.NameInMap("Lang")
        private String lang;

        @com.aliyun.core.annotation.NameInMap("RelationTypeList")
        private java.util.List < RelationTypeList> relationTypeList;

        @com.aliyun.core.annotation.NameInMap("VertexList")
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
             * <p>The edges that are returned.</p>
             */
            public Builder edgeList(java.util.List < EdgeList> edgeList) {
                this.edgeList = edgeList;
                return this;
            }

            /**
             * <p>The entities that are returned.</p>
             */
            public Builder entityTypeList(java.util.List < EntityTypeList> entityTypeList) {
                this.entityTypeList = entityTypeList;
                return this;
            }

            /**
             * <p>The language of the content within the request. Valid values:</p>
             * <ul>
             * <li><strong>zh</strong>: Chinese</li>
             * <li><strong>en</strong>: English</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>zh</p>
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * <p>The relationships that are returned.</p>
             */
            public Builder relationTypeList(java.util.List < RelationTypeList> relationTypeList) {
                this.relationTypeList = relationTypeList;
                return this;
            }

            /**
             * <p>The information about the node.</p>
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
