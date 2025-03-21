// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * <p>The response code. Valid values:</p>
         * <ul>
         * <li><strong>200</strong>: The request was successful.</li>
         * <li><strong>400</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The information about the entities and edges.</p>
         */
        public Builder infoList(InfoList infoList) {
            this.infoList = infoList;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>09969D2C-4FAD-429E-BFBF-9A60DEF8****</p>
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
         * <p>The consumed time of the request. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder timeCost(Long timeCost) {
            this.timeCost = timeCost;
            return this;
        }

        public QueryIncidentIconListResponseBody build() {
            return new QueryIncidentIconListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryIncidentIconListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryIncidentIconListResponseBody</p>
     */
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
             * <p>The display color of the entity.</p>
             * 
             * <strong>example:</strong>
             * <p>#fff</p>
             */
            public Builder displayColor(String displayColor) {
                this.displayColor = displayColor;
                return this;
            }

            /**
             * <p>The icon that corresponds to the entity.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://img.alicdn.com/imgextra/i4/O1CN011BZBvK1oifgsWIXoO_!!60000*****-55-tps-32-32.svg">https://img.alicdn.com/imgextra/i4/O1CN011BZBvK1oifgsWIXoO_!!60000*****-55-tps-32-32.svg</a></p>
             */
            public Builder displayIcon(String displayIcon) {
                this.displayIcon = displayIcon;
                return this;
            }

            /**
             * <p>The display sequence of the entity.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder displayOrder(String displayOrder) {
                this.displayOrder = displayOrder;
                return this;
            }

            /**
             * <p>The display template of the entity.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;name&quot;:&quot;${sas.trace2.name.logtime}&quot;,&quot;value&quot;:&quot;$!{time}&quot;},{&quot;name&quot;:&quot;${sas.trace2.name.node_type}&quot;,&quot;value&quot;:&quot;${sas.trace2.name.ip}&quot;},{&quot;name&quot;:&quot;${sas.trace2.property.name}&quot;,&quot;value&quot;:&quot;$!{name}&quot;}#if($p_log_time),{&quot;name&quot;:&quot;${sas.trace2.property.log_time}&quot;,&quot;value&quot;:&quot;$!{p_log_time}&quot;}#end#if($p_pid),{&quot;name&quot;:&quot;${sas.trace2.property.pid}&quot;,&quot;value&quot;:&quot;$!{p_pid}&quot;}#end#if($p_procname),{&quot;name&quot;:&quot;${sas.trace2.property.procname}&quot;,&quot;value&quot;:&quot;$!{p_procname}&quot;}#end#if($p_proc_path),{&quot;name&quot;:&quot;${sas.trace2.property.proc_path}&quot;,&quot;value&quot;:&quot;$!{p_proc_path}&quot;}#end#if($p_cmdline),{&quot;name&quot;:&quot;${sas.trace2.property.cmdline}&quot;,&quot;value&quot;:&quot;$!{p_cmdline}&quot;}#end#if($p_username),{&quot;name&quot;:&quot;${sas.trace2.property.username}&quot;,&quot;value&quot;:&quot;$!{p_username}&quot;}#end#if($p_cwd),{&quot;name&quot;:&quot;${sas.trace2.property.cwd}&quot;,&quot;value&quot;:&quot;$!{p_cwd}&quot;}#end#if($p_filepath),{&quot;name&quot;:&quot;${sas.trace2.property.filepath}&quot;,&quot;value&quot;:&quot;$!{p_filepath}&quot;}#end#if($p_md5),{&quot;name&quot;:&quot;${sas.trace2.property.md5}&quot;,&quot;value&quot;:&quot;$!{p_md5}&quot;}#end#if($p_ctime),{&quot;name&quot;:&quot;${sas.trace2.property.ctime}&quot;,&quot;value&quot;:&quot;$!{p_ctime}&quot;}#end#if($p_mtime),{&quot;name&quot;:&quot;${sas.trace2.property.mtime}&quot;,&quot;value&quot;:&quot;$!{p_mtime}&quot;}#end#if($p_size),{&quot;name&quot;:&quot;${sas.trace2.property.size}&quot;,&quot;value&quot;:&quot;$!{p_size}&quot;}#end#if($p_port),{&quot;name&quot;:&quot;${sas.trace2.property.port}&quot;,&quot;value&quot;:&quot;$!{p_port}&quot;}#end#if($p_ip),{&quot;name&quot;:&quot;${sas.trace2.property.ip}&quot;,&quot;value&quot;:&quot;$!{p_ip}&quot;}#end#if($p_src_ip),{&quot;name&quot;:&quot;${sas.trace2.property.src_ip}&quot;,&quot;value&quot;:&quot;$!{p_src_ip}&quot;}#end#if($p_dst_ip),{&quot;name&quot;:&quot;${sas.trace2.property.dst_ip}&quot;,&quot;value&quot;:&quot;$!{p_dst_ip}&quot;}#end#if($p_host),{&quot;name&quot;:&quot;${sas.trace2.property.host}&quot;,&quot;value&quot;:&quot;$!{p_host}&quot;}#end#if($p_uri),{&quot;name&quot;:&quot;${sas.trace2.property.uri}&quot;,&quot;value&quot;:&quot;$!{p_uri}&quot;}#end#if($p_post_data),{&quot;name&quot;:&quot;${sas.trace2.property.post_data}&quot;,&quot;value&quot;:&quot;$!{p_post_data}&quot;}#end#if($p_content),{&quot;name&quot;:&quot;${sas.trace2.property.content}&quot;,&quot;value&quot;:&quot;$!{p_content}&quot;}#end#if($p_type),{&quot;name&quot;:&quot;${sas.trace2.property.type}&quot;,&quot;value&quot;:&quot;$!{p_type}&quot;}#end]&quot;,</p>
             */
            public Builder displayTemplate(String displayTemplate) {
                this.displayTemplate = displayTemplate;
                return this;
            }

            /**
             * <p>The time when the entity was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-08T15:27Z</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the entity was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-11T10:16Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the entity.</p>
             * 
             * <strong>example:</strong>
             * <p>8038****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether the entity is a virtual node. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: yes</li>
             * <li><strong>0</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isVirtualNode(String isVirtualNode) {
                this.isVirtualNode = isVirtualNode;
                return this;
            }

            /**
             * <p>The name of the entity.</p>
             * 
             * <strong>example:</strong>
             * <p>shujuku</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace of the entity.</p>
             * 
             * <strong>example:</strong>
             * <p>kube-system</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The tag that indicates whether tracing was successful.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link QueryIncidentIconListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryIncidentIconListResponseBody</p>
     */
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
             * <p>The direction of the edge. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: forward</li>
             * <li><strong>0</strong>: reverse</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder directed(String directed) {
                this.directed = directed;
                return this;
            }

            /**
             * <p>The display color of the edge.</p>
             * 
             * <strong>example:</strong>
             * <p>#FFF</p>
             */
            public Builder displayColor(String displayColor) {
                this.displayColor = displayColor;
                return this;
            }

            /**
             * <p>The icon that corresponds to the edge.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://img.alicdn.com/imgextra/i4/O1CN01ft6rvQ22uUX2JsTmv_!!600000******-55-tps-12-12.svg">https://img.alicdn.com/imgextra/i4/O1CN01ft6rvQ22uUX2JsTmv_!!600000******-55-tps-12-12.svg</a></p>
             */
            public Builder displayIcon(String displayIcon) {
                this.displayIcon = displayIcon;
                return this;
            }

            /**
             * <p>The display template of the edge.</p>
             * 
             * <strong>example:</strong>
             * <p>test_template</p>
             */
            public Builder displayTemplate(String displayTemplate) {
                this.displayTemplate = displayTemplate;
                return this;
            }

            /**
             * <p>The time when the edge was created.</p>
             * 
             * <strong>example:</strong>
             * <p>167660031*****</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the edge was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-04T17:35Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the edge.</p>
             * 
             * <strong>example:</strong>
             * <p>4556****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the edge.</p>
             * 
             * <strong>example:</strong>
             * <p>policy-auto-effs3b</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace of the edge.</p>
             * 
             * <strong>example:</strong>
             * <p>lkl-zf-bs-lams</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The display type of the edge.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
     * {@link QueryIncidentIconListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryIncidentIconListResponseBody</p>
     */
    public static class InfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EntityTypeList")
        private java.util.List<EntityTypeList> entityTypeList;

        @com.aliyun.core.annotation.NameInMap("RelationTypeList")
        private java.util.List<RelationTypeList> relationTypeList;

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
        public java.util.List<EntityTypeList> getEntityTypeList() {
            return this.entityTypeList;
        }

        /**
         * @return relationTypeList
         */
        public java.util.List<RelationTypeList> getRelationTypeList() {
            return this.relationTypeList;
        }

        public static final class Builder {
            private java.util.List<EntityTypeList> entityTypeList; 
            private java.util.List<RelationTypeList> relationTypeList; 

            /**
             * <p>The information about the entities.</p>
             */
            public Builder entityTypeList(java.util.List<EntityTypeList> entityTypeList) {
                this.entityTypeList = entityTypeList;
                return this;
            }

            /**
             * <p>The information about the edges.</p>
             */
            public Builder relationTypeList(java.util.List<RelationTypeList> relationTypeList) {
                this.relationTypeList = relationTypeList;
                return this;
            }

            public InfoList build() {
                return new InfoList(this);
            } 

        } 

    }
}
