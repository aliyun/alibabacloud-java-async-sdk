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
 * {@link ListNodesResponseBody} extends {@link TeaModel}
 *
 * <p>ListNodesResponseBody</p>
 */
public class ListNodesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageResult")
    private PageResult pageResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListNodesResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageResult = builder.pageResult;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodesResponseBody create() {
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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageResult
     */
    public PageResult getPageResult() {
        return this.pageResult;
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
        private String message; 
        private PageResult pageResult; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListNodesResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageResult = model.pageResult;
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
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The paging query result.</p>
         */
        public Builder pageResult(PageResult pageResult) {
            this.pageResult = pageResult;
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

        public ListNodesResponseBody build() {
            return new ListNodesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodesResponseBody</p>
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
             * <p>23222</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>xxTest</p>
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
     * {@link ListNodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodesResponseBody</p>
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
             * <p>311131</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>xxTest</p>
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
     * {@link ListNodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodesResponseBody</p>
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
             * <p>23222</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>xxTest</p>
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
     * {@link ListNodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodesResponseBody</p>
     */
    public static class ProjectInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private ProjectInfo(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProjectInfo create() {
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

            private Builder(ProjectInfo model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * <p>The project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1121321</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The project name.</p>
             * 
             * <strong>example:</strong>
             * <p>xxTest</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ProjectInfo build() {
                return new ProjectInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodesResponseBody</p>
     */
    public static class NodeList extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("ExtendInfo")
        private String extendInfo;

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

        @com.aliyun.core.annotation.NameInMap("ProjectInfo")
        private ProjectInfo projectInfo;

        @com.aliyun.core.annotation.NameInMap("SchedulePaused")
        private Boolean schedulePaused;

        @com.aliyun.core.annotation.NameInMap("SchedulePeriodList")
        private java.util.List<String> schedulePeriodList;

        @com.aliyun.core.annotation.NameInMap("SubDetailType")
        private String subDetailType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private NodeList(Builder builder) {
            this.bizUnitName = builder.bizUnitName;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.description = builder.description;
            this.dryRun = builder.dryRun;
            this.extendInfo = builder.extendInfo;
            this.from = builder.from;
            this.hasDev = builder.hasDev;
            this.hasProd = builder.hasProd;
            this.id = builder.id;
            this.lastModifiedTime = builder.lastModifiedTime;
            this.modifier = builder.modifier;
            this.name = builder.name;
            this.ownerList = builder.ownerList;
            this.priorityList = builder.priorityList;
            this.projectInfo = builder.projectInfo;
            this.schedulePaused = builder.schedulePaused;
            this.schedulePeriodList = builder.schedulePeriodList;
            this.subDetailType = builder.subDetailType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeList create() {
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
         * @return extendInfo
         */
        public String getExtendInfo() {
            return this.extendInfo;
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
         * @return projectInfo
         */
        public ProjectInfo getProjectInfo() {
            return this.projectInfo;
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
            private String extendInfo; 
            private String from; 
            private Boolean hasDev; 
            private Boolean hasProd; 
            private String id; 
            private String lastModifiedTime; 
            private Modifier modifier; 
            private String name; 
            private java.util.List<OwnerList> ownerList; 
            private java.util.List<String> priorityList; 
            private ProjectInfo projectInfo; 
            private Boolean schedulePaused; 
            private java.util.List<String> schedulePeriodList; 
            private String subDetailType; 
            private String type; 

            private Builder() {
            } 

            private Builder(NodeList model) {
                this.bizUnitName = model.bizUnitName;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.description = model.description;
                this.dryRun = model.dryRun;
                this.extendInfo = model.extendInfo;
                this.from = model.from;
                this.hasDev = model.hasDev;
                this.hasProd = model.hasProd;
                this.id = model.id;
                this.lastModifiedTime = model.lastModifiedTime;
                this.modifier = model.modifier;
                this.name = model.name;
                this.ownerList = model.ownerList;
                this.priorityList = model.priorityList;
                this.projectInfo = model.projectInfo;
                this.schedulePaused = model.schedulePaused;
                this.schedulePeriodList = model.schedulePeriodList;
                this.subDetailType = model.subDetailType;
                this.type = model.type;
            } 

            /**
             * <p>The name of the business unit to which the node belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>xxTest</p>
             */
            public Builder bizUnitName(String bizUnitName) {
                this.bizUnitName = bizUnitName;
                return this;
            }

            /**
             * <p>The time when the node was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-05-30 16:47:13</p>
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
             * <p>The description of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>xx test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Specifies whether to perform a dry run.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dryRun(Boolean dryRun) {
                this.dryRun = dryRun;
                return this;
            }

            /**
             * <p>The extended information of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;xx&quot;:&quot;zz&quot;}</p>
             */
            public Builder extendInfo(String extendInfo) {
                this.extendInfo = extendInfo;
                return this;
            }

            /**
             * <p>The source of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>DATA_PROCESS</p>
             */
            public Builder from(String from) {
                this.from = from;
                return this;
            }

            /**
             * <p>Indicates whether the node has a development environment.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasDev(Boolean hasDev) {
                this.hasDev = hasDev;
                return this;
            }

            /**
             * <p>Indicates whether the node has a production environment.</p>
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
             * <p>n_31111</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The time when the node was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-05-30 16:47:13</p>
             */
            public Builder lastModifiedTime(String lastModifiedTime) {
                this.lastModifiedTime = lastModifiedTime;
                return this;
            }

            /**
             * <p>The user who last modified the node.</p>
             */
            public Builder modifier(Modifier modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * <p>The name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>xxTest</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The owner.</p>
             */
            public Builder ownerList(java.util.List<OwnerList> ownerList) {
                this.ownerList = ownerList;
                return this;
            }

            /**
             * <p>The priority.</p>
             */
            public Builder priorityList(java.util.List<String> priorityList) {
                this.priorityList = priorityList;
                return this;
            }

            /**
             * <p>The project to which the node belongs.</p>
             */
            public Builder projectInfo(ProjectInfo projectInfo) {
                this.projectInfo = projectInfo;
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
             * <p>The scheduling period.</p>
             */
            public Builder schedulePeriodList(java.util.List<String> schedulePeriodList) {
                this.schedulePeriodList = schedulePeriodList;
                return this;
            }

            /**
             * <p>The sub-business type. Valid values:</p>
             * <ul>
             * <li>MAX_COMPUTE_SQL</li>
             * <li>HIVE_SQL</li>
             * <li>SHELL</li>
             * <li>PYTHON</li>
             * <li>ONE_SERVICE_SQL</li>
             * <li>DATABASE_SQL, etc.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SHELL</p>
             */
            public Builder subDetailType(String subDetailType) {
                this.subDetailType = subDetailType;
                return this;
            }

            /**
             * <p>The type of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>DATA_PROCESS</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public NodeList build() {
                return new NodeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodesResponseBody</p>
     */
    public static class PageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeList")
        private java.util.List<NodeList> nodeList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageResult(Builder builder) {
            this.nodeList = builder.nodeList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageResult create() {
            return builder().build();
        }

        /**
         * @return nodeList
         */
        public java.util.List<NodeList> getNodeList() {
            return this.nodeList;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<NodeList> nodeList; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageResult model) {
                this.nodeList = model.nodeList;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The paginated list of nodes.</p>
             */
            public Builder nodeList(java.util.List<NodeList> nodeList) {
                this.nodeList = nodeList;
                return this;
            }

            /**
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageResult build() {
                return new PageResult(this);
            } 

        } 

    }
}
