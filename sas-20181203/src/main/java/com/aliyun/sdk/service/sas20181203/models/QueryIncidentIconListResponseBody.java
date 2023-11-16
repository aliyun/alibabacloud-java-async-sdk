// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryIncidentIconListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryIncidentIconListResponseBody</p>
 */
public class QueryIncidentIconListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("InfoList")
    private InfoList infoList;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TimeCost")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * InfoList.
         */
        public Builder infoList(InfoList infoList) {
            this.infoList = infoList;
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
         * TimeCost.
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
        @NameInMap("DisplayColor")
        private String displayColor;

        @NameInMap("DisplayIcon")
        private String displayIcon;

        @NameInMap("DisplayOrder")
        private String displayOrder;

        @NameInMap("DisplayTemplate")
        private String displayTemplate;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private String id;

        @NameInMap("IsVirtualNode")
        private String isVirtualNode;

        @NameInMap("Name")
        private String name;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("TraceSuccessFlag")
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
             * DisplayOrder.
             */
            public Builder displayOrder(String displayOrder) {
                this.displayOrder = displayOrder;
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
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
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
             * IsVirtualNode.
             */
            public Builder isVirtualNode(String isVirtualNode) {
                this.isVirtualNode = isVirtualNode;
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
             * TraceSuccessFlag.
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
        @NameInMap("Directed")
        private String directed;

        @NameInMap("DisplayColor")
        private String displayColor;

        @NameInMap("DisplayIcon")
        private String displayIcon;

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
             * Directed.
             */
            public Builder directed(String directed) {
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
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
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
    public static class InfoList extends TeaModel {
        @NameInMap("EntityTypeList")
        private java.util.List < EntityTypeList> entityTypeList;

        @NameInMap("RelationTypeList")
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

            public InfoList build() {
                return new InfoList(this);
            } 

        } 

    }
}
