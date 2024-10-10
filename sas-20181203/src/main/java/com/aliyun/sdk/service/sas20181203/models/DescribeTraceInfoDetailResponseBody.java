// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeTraceInfoDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTraceInfoDetailResponseBody</p>
 */
public class DescribeTraceInfoDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TraceInfoDetail")
    private TraceInfoDetail traceInfoDetail;

    private DescribeTraceInfoDetailResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceInfoDetail = builder.traceInfoDetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTraceInfoDetailResponseBody create() {
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
     * @return traceInfoDetail
     */
    public TraceInfoDetail getTraceInfoDetail() {
        return this.traceInfoDetail;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean success; 
        private TraceInfoDetail traceInfoDetail; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>24A20733-10A0-4AF6-BE6B-XXXXXXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
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
         * <p>The details of the tracing diagram.</p>
         */
        public Builder traceInfoDetail(TraceInfoDetail traceInfoDetail) {
            this.traceInfoDetail = traceInfoDetail;
            return this;
        }

        public DescribeTraceInfoDetailResponseBody build() {
            return new DescribeTraceInfoDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTraceInfoDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTraceInfoDetailResponseBody</p>
     */
    public static class EdgeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("EndId")
        private String endId;

        @com.aliyun.core.annotation.NameInMap("StartId")
        private String startId;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private EdgeList(Builder builder) {
            this.count = builder.count;
            this.endId = builder.endId;
            this.startId = builder.startId;
            this.time = builder.time;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EdgeList create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return endId
         */
        public String getEndId() {
            return this.endId;
        }

        /**
         * @return startId
         */
        public String getStartId() {
            return this.startId;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer count; 
            private String endId; 
            private String startId; 
            private String time; 
            private String type; 

            /**
             * <p>The number of times.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The ending vertex ID of the edge of the tracing diagram.</p>
             * 
             * <strong>example:</strong>
             * <p>a1d1fa39e5345dcef3f9712172cxxxxx</p>
             */
            public Builder endId(String endId) {
                this.endId = endId;
                return this;
            }

            /**
             * <p>The starting vertex ID of the edge of the tracing diagram.</p>
             * 
             * <strong>example:</strong>
             * <p>02b4bf933c8e3bb8b9465eee502xxxxx</p>
             */
            public Builder startId(String startId) {
                this.startId = startId;
                return this;
            }

            /**
             * <p>The point in time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-21 10:24:42</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The type of the edge of the tracing diagram.</p>
             * 
             * <strong>example:</strong>
             * <p>trigger_file_alert</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public EdgeList build() {
                return new EdgeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTraceInfoDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTraceInfoDetailResponseBody</p>
     */
    public static class EntityTypeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbId")
        private Integer dbId;

        @com.aliyun.core.annotation.NameInMap("DisplayColor")
        private String displayColor;

        @com.aliyun.core.annotation.NameInMap("DisplayIcon")
        private String displayIcon;

        @com.aliyun.core.annotation.NameInMap("DisplayTemplate")
        private String displayTemplate;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Limit")
        private Integer limit;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("Offset")
        private Integer offset;

        private EntityTypeList(Builder builder) {
            this.dbId = builder.dbId;
            this.displayColor = builder.displayColor;
            this.displayIcon = builder.displayIcon;
            this.displayTemplate = builder.displayTemplate;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.limit = builder.limit;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.offset = builder.offset;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EntityTypeList create() {
            return builder().build();
        }

        /**
         * @return dbId
         */
        public Integer getDbId() {
            return this.dbId;
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
         * @return displayTemplate
         */
        public String getDisplayTemplate() {
            return this.displayTemplate;
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
         * @return limit
         */
        public Integer getLimit() {
            return this.limit;
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
         * @return offset
         */
        public Integer getOffset() {
            return this.offset;
        }

        public static final class Builder {
            private Integer dbId; 
            private String displayColor; 
            private String displayIcon; 
            private String displayTemplate; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String id; 
            private Integer limit; 
            private String name; 
            private String namespace; 
            private Integer offset; 

            /**
             * <p>This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>Deprecated</p>
             */
            public Builder dbId(Integer dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>The rendering color of the vertex.</p>
             * 
             * <strong>example:</strong>
             * <p>#fff</p>
             */
            public Builder displayColor(String displayColor) {
                this.displayColor = displayColor;
                return this;
            }

            /**
             * <p>The icon style of the vertex.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://img.alicdn.com/tfs/TB176P5OgDqK1RjSZSyXXaxEVXa-49-48.png">https://img.alicdn.com/tfs/TB176P5OgDqK1RjSZSyXXaxEVXa-49-48.png</a></p>
             */
            public Builder displayIcon(String displayIcon) {
                this.displayIcon = displayIcon;
                return this;
            }

            /**
             * <p>This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;name&quot;:&quot;${logtime}&quot;,&quot;value&quot;:&quot;$!{time}&quot;}]</p>
             */
            public Builder displayTemplate(String displayTemplate) {
                this.displayTemplate = displayTemplate;
                return this;
            }

            /**
             * <p>The timestamp when the vertex was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-09T11:47Z</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the vertex was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-09T11:47Z</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the vertex type.</p>
             * 
             * <strong>example:</strong>
             * <p>Alert</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>Deprecated</p>
             */
            public Builder limit(Integer limit) {
                this.limit = limit;
                return this;
            }

            /**
             * <p>The name of the vertex type.</p>
             * 
             * <strong>example:</strong>
             * <p>Alert</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>Deprecated</p>
             */
            public Builder offset(Integer offset) {
                this.offset = offset;
                return this;
            }

            public EntityTypeList build() {
                return new EntityTypeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTraceInfoDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTraceInfoDetailResponseBody</p>
     */
    public static class RelationTypeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Directed")
        private Integer directed;

        @com.aliyun.core.annotation.NameInMap("DisplayColor")
        private String displayColor;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RelationTypeId")
        private String relationTypeId;

        @com.aliyun.core.annotation.NameInMap("ShowType")
        private String showType;

        private RelationTypeList(Builder builder) {
            this.directed = builder.directed;
            this.displayColor = builder.displayColor;
            this.name = builder.name;
            this.relationTypeId = builder.relationTypeId;
            this.showType = builder.showType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelationTypeList create() {
            return builder().build();
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return relationTypeId
         */
        public String getRelationTypeId() {
            return this.relationTypeId;
        }

        /**
         * @return showType
         */
        public String getShowType() {
            return this.showType;
        }

        public static final class Builder {
            private Integer directed; 
            private String displayColor; 
            private String name; 
            private String relationTypeId; 
            private String showType; 

            /**
             * <p>Indicates whether the edge is a directional edge. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: yes</li>
             * <li><strong>0</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder directed(Integer directed) {
                this.directed = directed;
                return this;
            }

            /**
             * <p>The rendering color of the edge.</p>
             * 
             * <strong>example:</strong>
             * <p>#fff</p>
             */
            public Builder displayColor(String displayColor) {
                this.displayColor = displayColor;
                return this;
            }

            /**
             * <p>The name of the edge type.</p>
             * 
             * <strong>example:</strong>
             * <p>file</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the edge type.</p>
             * 
             * <strong>example:</strong>
             * <p>netflow_to_process</p>
             */
            public Builder relationTypeId(String relationTypeId) {
                this.relationTypeId = relationTypeId;
                return this;
            }

            /**
             * <p>This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>Deprecated</p>
             */
            public Builder showType(String showType) {
                this.showType = showType;
                return this;
            }

            public RelationTypeList build() {
                return new RelationTypeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTraceInfoDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTraceInfoDetailResponseBody</p>
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
             * <p>The number of neighbor nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>Indicates whether one more page is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>False</p>
             */
            public Builder hasMore(Boolean hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * <p>The type of the neighbor node. The value is fixed as <strong>alert</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>alert</p>
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
     * {@link DescribeTraceInfoDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTraceInfoDetailResponseBody</p>
     */
    public static class VertexList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NeighborList")
        private java.util.List < NeighborList> neighborList;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private VertexList(Builder builder) {
            this.count = builder.count;
            this.id = builder.id;
            this.name = builder.name;
            this.neighborList = builder.neighborList;
            this.time = builder.time;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VertexList create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
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
         * @return neighborList
         */
        public java.util.List < NeighborList> getNeighborList() {
            return this.neighborList;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer count; 
            private String id; 
            private String name; 
            private java.util.List < NeighborList> neighborList; 
            private String time; 
            private String type; 

            /**
             * <p>The number of times.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The ID of the vertex.</p>
             * 
             * <strong>example:</strong>
             * <p>a1d1fa39e5345dcef3f9712172xxxxxx</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the entity represented by the vertex.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/local/tomcat</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>An array that consists of the neighbor nodes.</p>
             */
            public Builder neighborList(java.util.List < NeighborList> neighborList) {
                this.neighborList = neighborList;
                return this;
            }

            /**
             * <p>The point in time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-21 10:24:42</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The type of the entity represented by the vertex.</p>
             * 
             * <strong>example:</strong>
             * <p>file_path</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public VertexList build() {
                return new VertexList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTraceInfoDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTraceInfoDetailResponseBody</p>
     */
    public static class TraceInfoDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EdgeList")
        private java.util.List < EdgeList> edgeList;

        @com.aliyun.core.annotation.NameInMap("EntityTypeList")
        private java.util.List < EntityTypeList> entityTypeList;

        @com.aliyun.core.annotation.NameInMap("RelationTypeList")
        private java.util.List < RelationTypeList> relationTypeList;

        @com.aliyun.core.annotation.NameInMap("VertexList")
        private java.util.List < VertexList> vertexList;

        private TraceInfoDetail(Builder builder) {
            this.edgeList = builder.edgeList;
            this.entityTypeList = builder.entityTypeList;
            this.relationTypeList = builder.relationTypeList;
            this.vertexList = builder.vertexList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TraceInfoDetail create() {
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
            private java.util.List < RelationTypeList> relationTypeList; 
            private java.util.List < VertexList> vertexList; 

            /**
             * <p>An array that consists of the edges of the tracing diagram.</p>
             */
            public Builder edgeList(java.util.List < EdgeList> edgeList) {
                this.edgeList = edgeList;
                return this;
            }

            /**
             * <p>An array that consists of the metadata configurations of the vertex type.</p>
             */
            public Builder entityTypeList(java.util.List < EntityTypeList> entityTypeList) {
                this.entityTypeList = entityTypeList;
                return this;
            }

            /**
             * <p>An array that consists of the metadata configurations of the edge type.</p>
             */
            public Builder relationTypeList(java.util.List < RelationTypeList> relationTypeList) {
                this.relationTypeList = relationTypeList;
                return this;
            }

            /**
             * <p>An array that consists of all vertexes of the tracing diagram.</p>
             */
            public Builder vertexList(java.util.List < VertexList> vertexList) {
                this.vertexList = vertexList;
                return this;
            }

            public TraceInfoDetail build() {
                return new TraceInfoDetail(this);
            } 

        } 

    }
}
