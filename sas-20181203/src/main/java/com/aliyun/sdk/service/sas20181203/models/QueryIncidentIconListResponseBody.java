// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryIncidentIconListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryIncidentIconListResponseBody</p>
 */
public class QueryIncidentIconListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("InfoList")
    private InfoList infoList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TimeCost")
    private Long timeCost;

    private QueryIncidentIconListResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.infoList = builder.infoList;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.timeCost = builder.timeCost;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryIncidentIconListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return infoList
     */
    public InfoList getInfoList() {
        return this.infoList;
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

    /**
     * @return timeCost
     */
    public Long getTimeCost() {
        return this.timeCost;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private InfoList infoList; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private Long timeCost; 

        /**
         * The response code. Valid values:
         * <p>
         * 
         * *   **200**: The request was successful.
         * *   **400**: The request failed.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The information about the entities and edges.
         */
        public Builder infoList(InfoList infoList) {
            this.infoList = infoList;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

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
         * The consumed time of the request. Unit: seconds.
         */
        public Builder timeCost(Long timeCost) {
            this.timeCost = timeCost;
            return this;
        }

        public QueryIncidentIconListResponseBody build() {
            return new QueryIncidentIconListResponseBody(this);
        } 

    } 

    public static class EntityTypeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayColor")
        private String displayColor;

        @com.aliyun.core.annotation.NameInMap("DisplayIcon")
        private String displayIcon;

        @com.aliyun.core.annotation.NameInMap("DisplayOrder")
        private String displayOrder;

        @com.aliyun.core.annotation.NameInMap("DisplayTemplate")
        private String displayTemplate;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IsVirtualNode")
        private String isVirtualNode;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("TraceSuccessFlag")
        private String traceSuccessFlag;

        private EntityTypeList(Builder builder) {
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
            this.traceSuccessFlag = builder.traceSuccessFlag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EntityTypeList create() {
            return builder().build();
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
        public String getDisplayOrder() {
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
        public String getIsVirtualNode() {
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
         * @return traceSuccessFlag
         */
        public String getTraceSuccessFlag() {
            return this.traceSuccessFlag;
        }

        public static final class Builder {
            private String displayColor; 
            private String displayIcon; 
            private String displayOrder; 
            private String displayTemplate; 
            private String gmtCreate; 
            private String gmtModified; 
            private String id; 
            private String isVirtualNode; 
            private String name; 
            private String namespace; 
            private String traceSuccessFlag; 

            /**
             * The display color of the entity.
             */
            public Builder displayColor(String displayColor) {
                this.displayColor = displayColor;
                return this;
            }

            /**
             * The icon that corresponds to the entity.
             */
            public Builder displayIcon(String displayIcon) {
                this.displayIcon = displayIcon;
                return this;
            }

            /**
             * The display sequence of the entity.
             */
            public Builder displayOrder(String displayOrder) {
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
             * Indicates whether the entity is a virtual node. Valid values:
             * <p>
             * 
             * *   **1**: yes
             * *   **0**: no
             */
            public Builder isVirtualNode(String isVirtualNode) {
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
             * The tag that indicates whether tracing was successful.
             */
            public Builder traceSuccessFlag(String traceSuccessFlag) {
                this.traceSuccessFlag = traceSuccessFlag;
                return this;
            }

            public EntityTypeList build() {
                return new EntityTypeList(this);
            } 

        } 

    }
    public static class RelationTypeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Directed")
        private String directed;

        @com.aliyun.core.annotation.NameInMap("DisplayColor")
        private String displayColor;

        @com.aliyun.core.annotation.NameInMap("DisplayIcon")
        private String displayIcon;

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

        private RelationTypeList(Builder builder) {
            this.directed = builder.directed;
            this.displayColor = builder.displayColor;
            this.displayIcon = builder.displayIcon;
            this.displayTemplate = builder.displayTemplate;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.name = builder.name;
            this.namespace = builder.namespace;
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
        public String getDirected() {
            return this.directed;
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

        public static final class Builder {
            private String directed; 
            private String displayColor; 
            private String displayIcon; 
            private String displayTemplate; 
            private String gmtCreate; 
            private String gmtModified; 
            private String id; 
            private String name; 
            private String namespace; 
            private String showType; 

            /**
             * The direction of the edge. Valid values:
             * <p>
             * 
             * *   **1**: forward
             * *   **0**: reverse
             */
            public Builder directed(String directed) {
                this.directed = directed;
                return this;
            }

            /**
             * The display color of the edge.
             */
            public Builder displayColor(String displayColor) {
                this.displayColor = displayColor;
                return this;
            }

            /**
             * The icon that corresponds to the edge.
             */
            public Builder displayIcon(String displayIcon) {
                this.displayIcon = displayIcon;
                return this;
            }

            /**
             * The display template of the edge.
             */
            public Builder displayTemplate(String displayTemplate) {
                this.displayTemplate = displayTemplate;
                return this;
            }

            /**
             * The time when the edge was created.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the edge was modified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of the edge.
             */
            public Builder id(String id) {
                this.id = id;
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
             * The namespace of the edge.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The display type of the edge.
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
    public static class InfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EntityTypeList")
        private java.util.List < EntityTypeList> entityTypeList;

        @com.aliyun.core.annotation.NameInMap("RelationTypeList")
        private java.util.List < RelationTypeList> relationTypeList;

        private InfoList(Builder builder) {
            this.entityTypeList = builder.entityTypeList;
            this.relationTypeList = builder.relationTypeList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InfoList create() {
            return builder().build();
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

        public static final class Builder {
            private java.util.List < EntityTypeList> entityTypeList; 
            private java.util.List < RelationTypeList> relationTypeList; 

            /**
             * The information about the entities.
             */
            public Builder entityTypeList(java.util.List < EntityTypeList> entityTypeList) {
                this.entityTypeList = entityTypeList;
                return this;
            }

            /**
             * The information about the edges.
             */
            public Builder relationTypeList(java.util.List < RelationTypeList> relationTypeList) {
                this.relationTypeList = relationTypeList;
                return this;
            }

            public InfoList build() {
                return new InfoList(this);
            } 

        } 

    }
}
