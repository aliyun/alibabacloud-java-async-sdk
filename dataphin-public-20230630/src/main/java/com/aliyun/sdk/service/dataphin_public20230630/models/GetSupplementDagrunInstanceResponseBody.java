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
 * {@link GetSupplementDagrunInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetSupplementDagrunInstanceResponseBody</p>
 */
public class GetSupplementDagrunInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("InstanceList")
    private java.util.List<InstanceList> instanceList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetSupplementDagrunInstanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.instanceList = builder.instanceList;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSupplementDagrunInstanceResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return instanceList
     */
    public java.util.List<InstanceList> getInstanceList() {
        return this.instanceList;
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
        private Integer httpStatusCode; 
        private java.util.List<InstanceList> instanceList; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetSupplementDagrunInstanceResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.instanceList = model.instanceList;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code. A value of OK indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The list of instances.</p>
         */
        public Builder instanceList(java.util.List<InstanceList> instanceList) {
            this.instanceList = instanceList;
            return this;
        }

        /**
         * <p>The error message.</p>
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
         * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSupplementDagrunInstanceResponseBody build() {
            return new GetSupplementDagrunInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSupplementDagrunInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetSupplementDagrunInstanceResponseBody</p>
     */
    public static class Creator extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Creator(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Creator create() {
            return builder().build();
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

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(Creator model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1001012</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>xx测试</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Creator build() {
                return new Creator(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSupplementDagrunInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetSupplementDagrunInstanceResponseBody</p>
     */
    public static class Modifier extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Modifier(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Modifier create() {
            return builder().build();
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

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(Modifier model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1001012</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>xx测试</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Modifier build() {
                return new Modifier(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSupplementDagrunInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetSupplementDagrunInstanceResponseBody</p>
     */
    public static class OwnerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private OwnerList(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OwnerList create() {
            return builder().build();
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

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(OwnerList model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1001012</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>xx测试</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public OwnerList build() {
                return new OwnerList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSupplementDagrunInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetSupplementDagrunInstanceResponseBody</p>
     */
    public static class NodeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizUnitName")
        private String bizUnitName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private Creator creator;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DryRun")
        private Boolean dryRun;

        @com.aliyun.core.annotation.NameInMap("From")
        private String from;

        @com.aliyun.core.annotation.NameInMap("HasDev")
        private Boolean hasDev;

        @com.aliyun.core.annotation.NameInMap("HasProd")
        private Boolean hasProd;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("LastModifiedTime")
        private String lastModifiedTime;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private Modifier modifier;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OwnerList")
        private java.util.List<OwnerList> ownerList;

        @com.aliyun.core.annotation.NameInMap("PriorityList")
        private java.util.List<String> priorityList;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupList")
        private java.util.List<String> resourceGroupList;

        @com.aliyun.core.annotation.NameInMap("SchedulePaused")
        private Boolean schedulePaused;

        @com.aliyun.core.annotation.NameInMap("SchedulePeriodList")
        private java.util.List<String> schedulePeriodList;

        @com.aliyun.core.annotation.NameInMap("SubDetailType")
        private String subDetailType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private NodeInfo(Builder builder) {
            this.bizUnitName = builder.bizUnitName;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.description = builder.description;
            this.dryRun = builder.dryRun;
            this.from = builder.from;
            this.hasDev = builder.hasDev;
            this.hasProd = builder.hasProd;
            this.id = builder.id;
            this.lastModifiedTime = builder.lastModifiedTime;
            this.modifier = builder.modifier;
            this.name = builder.name;
            this.ownerList = builder.ownerList;
            this.priorityList = builder.priorityList;
            this.resourceGroupList = builder.resourceGroupList;
            this.schedulePaused = builder.schedulePaused;
            this.schedulePeriodList = builder.schedulePeriodList;
            this.subDetailType = builder.subDetailType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeInfo create() {
            return builder().build();
        }

        /**
         * @return bizUnitName
         */
        public String getBizUnitName() {
            return this.bizUnitName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public Creator getCreator() {
            return this.creator;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return dryRun
         */
        public Boolean getDryRun() {
            return this.dryRun;
        }

        /**
         * @return from
         */
        public String getFrom() {
            return this.from;
        }

        /**
         * @return hasDev
         */
        public Boolean getHasDev() {
            return this.hasDev;
        }

        /**
         * @return hasProd
         */
        public Boolean getHasProd() {
            return this.hasProd;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return lastModifiedTime
         */
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        /**
         * @return modifier
         */
        public Modifier getModifier() {
            return this.modifier;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ownerList
         */
        public java.util.List<OwnerList> getOwnerList() {
            return this.ownerList;
        }

        /**
         * @return priorityList
         */
        public java.util.List<String> getPriorityList() {
            return this.priorityList;
        }

        /**
         * @return resourceGroupList
         */
        public java.util.List<String> getResourceGroupList() {
            return this.resourceGroupList;
        }

        /**
         * @return schedulePaused
         */
        public Boolean getSchedulePaused() {
            return this.schedulePaused;
        }

        /**
         * @return schedulePeriodList
         */
        public java.util.List<String> getSchedulePeriodList() {
            return this.schedulePeriodList;
        }

        /**
         * @return subDetailType
         */
        public String getSubDetailType() {
            return this.subDetailType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String bizUnitName; 
            private String createTime; 
            private Creator creator; 
            private String description; 
            private Boolean dryRun; 
            private String from; 
            private Boolean hasDev; 
            private Boolean hasProd; 
            private String id; 
            private String lastModifiedTime; 
            private Modifier modifier; 
            private String name; 
            private java.util.List<OwnerList> ownerList; 
            private java.util.List<String> priorityList; 
            private java.util.List<String> resourceGroupList; 
            private Boolean schedulePaused; 
            private java.util.List<String> schedulePeriodList; 
            private String subDetailType; 
            private String type; 

            private Builder() {
            } 

            private Builder(NodeInfo model) {
                this.bizUnitName = model.bizUnitName;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.description = model.description;
                this.dryRun = model.dryRun;
                this.from = model.from;
                this.hasDev = model.hasDev;
                this.hasProd = model.hasProd;
                this.id = model.id;
                this.lastModifiedTime = model.lastModifiedTime;
                this.modifier = model.modifier;
                this.name = model.name;
                this.ownerList = model.ownerList;
                this.priorityList = model.priorityList;
                this.resourceGroupList = model.resourceGroupList;
                this.schedulePaused = model.schedulePaused;
                this.schedulePeriodList = model.schedulePeriodList;
                this.subDetailType = model.subDetailType;
                this.type = model.type;
            } 

            /**
             * <p>The business unit.</p>
             * 
             * <strong>example:</strong>
             * <p>xx测试</p>
             */
            public Builder bizUnitName(String bizUnitName) {
                this.bizUnitName = bizUnitName;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-30 10:08:49</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The creator of the node.</p>
             */
            public Builder creator(Creator creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The node description.</p>
             * 
             * <strong>example:</strong>
             * <p>xx测试</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the node is a dry run.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dryRun(Boolean dryRun) {
                this.dryRun = dryRun;
                return this;
            }

            /**
             * <p>The source business system. Valid values:</p>
             * <ul>
             * <li>DATA_PROCESS: code development.</li>
             * <li>BLACK_BOX: black box.</li>
             * <li>ONE_ID: extraction.</li>
             * <li>PIPELINE: pipeline.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DATA_PROCESS</p>
             */
            public Builder from(String from) {
                this.from = from;
                return this;
            }

            /**
             * <p>Indicates whether the node exists in the development environment.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasDev(Boolean hasDev) {
                this.hasDev = hasDev;
                return this;
            }

            /**
             * <p>Indicates whether the node exists in the production environment.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasProd(Boolean hasProd) {
                this.hasProd = hasProd;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>n_239496</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The last modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-30 10:08:49</p>
             */
            public Builder lastModifiedTime(String lastModifiedTime) {
                this.lastModifiedTime = lastModifiedTime;
                return this;
            }

            /**
             * <p>The modifier.</p>
             */
            public Builder modifier(Modifier modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * <p>The node name.</p>
             * 
             * <strong>example:</strong>
             * <p>xx测试</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The owners of the node.</p>
             */
            public Builder ownerList(java.util.List<OwnerList> ownerList) {
                this.ownerList = ownerList;
                return this;
            }

            /**
             * <p>The priority. Valid values:</p>
             * <ul>
             * <li>HIGHEST</li>
             * <li>HIGH</li>
             * <li>MIDDLE</li>
             * <li>LOW</li>
             * <li>LOWEST.</li>
             * </ul>
             */
            public Builder priorityList(java.util.List<String> priorityList) {
                this.priorityList = priorityList;
                return this;
            }

            /**
             * <p>The schedule resource groups.</p>
             */
            public Builder resourceGroupList(java.util.List<String> resourceGroupList) {
                this.resourceGroupList = resourceGroupList;
                return this;
            }

            /**
             * <p>Indicates whether the node is paused.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder schedulePaused(Boolean schedulePaused) {
                this.schedulePaused = schedulePaused;
                return this;
            }

            /**
             * <p>The scheduling period. Valid values:</p>
             * <ul>
             * <li>MINUTELY</li>
             * <li>HOURLY</li>
             * <li>DAILY</li>
             * <li>WEEKLY</li>
             * <li>MONTHLY</li>
             * <li>QUARTERLY.</li>
             * </ul>
             */
            public Builder schedulePeriodList(java.util.List<String> schedulePeriodList) {
                this.schedulePeriodList = schedulePeriodList;
                return this;
            }

            /**
             * <p>The node subtype.</p>
             * 
             * <strong>example:</strong>
             * <p>SHELL</p>
             */
            public Builder subDetailType(String subDetailType) {
                this.subDetailType = subDetailType;
                return this;
            }

            /**
             * <p>The node type. Valid values:</p>
             * <ul>
             * <li>DATA_PROCESS: code node.</li>
             * <li>BBOX_LOGIC_TABLE_NODE: black box logical table node.</li>
             * <li>ONE_ID_LABEL: extraction label node.</li>
             * <li>ONE_ID_RULE: extraction label node.</li>
             * <li>PIPELINE_NODE: pipeline node.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DATA_PROCESS</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public NodeInfo build() {
                return new NodeInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSupplementDagrunInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetSupplementDagrunInstanceResponseBody</p>
     */
    public static class InstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizDate")
        private Long bizDate;

        @com.aliyun.core.annotation.NameInMap("DueTime")
        private Long dueTime;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("EndExecuteTime")
        private Long endExecuteTime;

        @com.aliyun.core.annotation.NameInMap("ExtendInfo")
        private String extendInfo;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("NodeInfo")
        private NodeInfo nodeInfo;

        @com.aliyun.core.annotation.NameInMap("StartExecuteTime")
        private Long startExecuteTime;

        @com.aliyun.core.annotation.NameInMap("StatusList")
        private java.util.List<String> statusList;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private InstanceList(Builder builder) {
            this.bizDate = builder.bizDate;
            this.dueTime = builder.dueTime;
            this.duration = builder.duration;
            this.endExecuteTime = builder.endExecuteTime;
            this.extendInfo = builder.extendInfo;
            this.id = builder.id;
            this.index = builder.index;
            this.nodeInfo = builder.nodeInfo;
            this.startExecuteTime = builder.startExecuteTime;
            this.statusList = builder.statusList;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceList create() {
            return builder().build();
        }

        /**
         * @return bizDate
         */
        public Long getBizDate() {
            return this.bizDate;
        }

        /**
         * @return dueTime
         */
        public Long getDueTime() {
            return this.dueTime;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return endExecuteTime
         */
        public Long getEndExecuteTime() {
            return this.endExecuteTime;
        }

        /**
         * @return extendInfo
         */
        public String getExtendInfo() {
            return this.extendInfo;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return nodeInfo
         */
        public NodeInfo getNodeInfo() {
            return this.nodeInfo;
        }

        /**
         * @return startExecuteTime
         */
        public Long getStartExecuteTime() {
            return this.startExecuteTime;
        }

        /**
         * @return statusList
         */
        public java.util.List<String> getStatusList() {
            return this.statusList;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long bizDate; 
            private Long dueTime; 
            private String duration; 
            private Long endExecuteTime; 
            private String extendInfo; 
            private String id; 
            private Integer index; 
            private NodeInfo nodeInfo; 
            private Long startExecuteTime; 
            private java.util.List<String> statusList; 
            private String type; 

            private Builder() {
            } 

            private Builder(InstanceList model) {
                this.bizDate = model.bizDate;
                this.dueTime = model.dueTime;
                this.duration = model.duration;
                this.endExecuteTime = model.endExecuteTime;
                this.extendInfo = model.extendInfo;
                this.id = model.id;
                this.index = model.index;
                this.nodeInfo = model.nodeInfo;
                this.startExecuteTime = model.startExecuteTime;
                this.statusList = model.statusList;
                this.type = model.type;
            } 

            /**
             * <p>The business date.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-04-01</p>
             */
            public Builder bizDate(Long bizDate) {
                this.bizDate = bizDate;
                return this;
            }

            /**
             * <p>The scheduled date.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-04-02</p>
             */
            public Builder dueTime(Long dueTime) {
                this.dueTime = dueTime;
                return this;
            }

            /**
             * <p>The execution duration. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The end time of the execution.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-04-12 00:25:02</p>
             */
            public Builder endExecuteTime(Long endExecuteTime) {
                this.endExecuteTime = endExecuteTime;
                return this;
            }

            /**
             * <p>The extended information. This field contains information specific to instances of different business systems, such as the fileId of a pipeline, whether a logical table is a hierarchy dimension table, mid-node information, and instance output names.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;a&quot;:&quot;b&quot;}</p>
             */
            public Builder extendInfo(String extendInfo) {
                this.extendInfo = extendInfo;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>t_239496_20210411_246982077481</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The sequence number of the hourly or minutely instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The details of the node associated with the instance.</p>
             */
            public Builder nodeInfo(NodeInfo nodeInfo) {
                this.nodeInfo = nodeInfo;
                return this;
            }

            /**
             * <p>The start time of the execution.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-04-12 00:00:00</p>
             */
            public Builder startExecuteTime(Long startExecuteTime) {
                this.startExecuteTime = startExecuteTime;
                return this;
            }

            /**
             * <p>The list of instance statuses. A physical instance list contains only one status. Valid values:</p>
             * <ul>
             * <li>NIT: init.</li>
             * <li>WATING: waiting.</li>
             * <li>RUNNING: running.</li>
             * <li>SUCCESS: succeeded.</li>
             * <li>FAILED: failed.</li>
             * </ul>
             */
            public Builder statusList(java.util.List<String> statusList) {
                this.statusList = statusList;
                return this;
            }

            /**
             * <p>The instance type. Valid values:</p>
             * <ul>
             * <li>NORMAL: periodic instance.</li>
             * <li>SUPPLEMENT: data backfill instance.</li>
             * <li>MANUAL: manual instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUPPLEMENT</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public InstanceList build() {
                return new InstanceList(this);
            } 

        } 

    }
}
