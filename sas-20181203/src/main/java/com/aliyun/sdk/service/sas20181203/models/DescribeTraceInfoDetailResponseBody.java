// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTraceInfoDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTraceInfoDetailResponseBody</p>
 */
public class DescribeTraceInfoDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TraceInfoDetail")
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
         * RequestId.
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

        /**
         * TraceInfoDetail.
         */
        public Builder traceInfoDetail(TraceInfoDetail traceInfoDetail) {
            this.traceInfoDetail = traceInfoDetail;
            return this;
        }

        public DescribeTraceInfoDetailResponseBody build() {
            return new DescribeTraceInfoDetailResponseBody(this);
        } 

    } 

    public static class EdgeList extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("EndId")
        private String endId;

        @NameInMap("StartId")
        private String startId;

        @NameInMap("Time")
        private String time;

        @NameInMap("Type")
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
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * EndId.
             */
            public Builder endId(String endId) {
                this.endId = endId;
                return this;
            }

            /**
             * StartId.
             */
            public Builder startId(String startId) {
                this.startId = startId;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * Type.
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
    public static class EntityTypeList extends TeaModel {
        @NameInMap("DbId")
        private Integer dbId;

        @NameInMap("DisplayColor")
        private String displayColor;

        @NameInMap("DisplayIcon")
        private String displayIcon;

        @NameInMap("DisplayTemplate")
        private String displayTemplate;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("Id")
        private String id;

        @NameInMap("Limit")
        private Integer limit;

        @NameInMap("Name")
        private String name;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("Offset")
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
             * DbId.
             */
            public Builder dbId(Integer dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * DisplayColor.
             */
            public Builder displayColor(String displayColor) {
                this.displayColor = displayColor;
                return this;
            }

            /**
             * DisplayIcon.
             */
            public Builder displayIcon(String displayIcon) {
                this.displayIcon = displayIcon;
                return this;
            }

            /**
             * DisplayTemplate.
             */
            public Builder displayTemplate(String displayTemplate) {
                this.displayTemplate = displayTemplate;
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
             * Limit.
             */
            public Builder limit(Integer limit) {
                this.limit = limit;
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
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * Offset.
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
    public static class RelationTypeList extends TeaModel {
        @NameInMap("Directed")
        private Integer directed;

        @NameInMap("DisplayColor")
        private String displayColor;

        @NameInMap("Name")
        private String name;

        @NameInMap("RelationTypeId")
        private String relationTypeId;

        @NameInMap("ShowType")
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
             * Directed.
             */
            public Builder directed(Integer directed) {
                this.directed = directed;
                return this;
            }

            /**
             * DisplayColor.
             */
            public Builder displayColor(String displayColor) {
                this.displayColor = displayColor;
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
             * RelationTypeId.
             */
            public Builder relationTypeId(String relationTypeId) {
                this.relationTypeId = relationTypeId;
                return this;
            }

            /**
             * ShowType.
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
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * HasMore.
             */
            public Builder hasMore(Boolean hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * Type.
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
        @NameInMap("Count")
        private Integer count;

        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        @NameInMap("NeighborList")
        private java.util.List < NeighborList> neighborList;

        @NameInMap("Time")
        private String time;

        @NameInMap("Type")
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
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NeighborList.
             */
            public Builder neighborList(java.util.List < NeighborList> neighborList) {
                this.neighborList = neighborList;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * Type.
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
    public static class TraceInfoDetail extends TeaModel {
        @NameInMap("EdgeList")
        private java.util.List < EdgeList> edgeList;

        @NameInMap("EntityTypeList")
        private java.util.List < EntityTypeList> entityTypeList;

        @NameInMap("RelationTypeList")
        private java.util.List < RelationTypeList> relationTypeList;

        @NameInMap("VertexList")
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
             * EdgeList.
             */
            public Builder edgeList(java.util.List < EdgeList> edgeList) {
                this.edgeList = edgeList;
                return this;
            }

            /**
             * EntityTypeList.
             */
            public Builder entityTypeList(java.util.List < EntityTypeList> entityTypeList) {
                this.entityTypeList = entityTypeList;
                return this;
            }

            /**
             * RelationTypeList.
             */
            public Builder relationTypeList(java.util.List < RelationTypeList> relationTypeList) {
                this.relationTypeList = relationTypeList;
                return this;
            }

            /**
             * VertexList.
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
