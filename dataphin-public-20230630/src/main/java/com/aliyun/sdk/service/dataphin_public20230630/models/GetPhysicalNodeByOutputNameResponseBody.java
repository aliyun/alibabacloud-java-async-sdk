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
 * {@link GetPhysicalNodeByOutputNameResponseBody} extends {@link TeaModel}
 *
 * <p>GetPhysicalNodeByOutputNameResponseBody</p>
 */
public class GetPhysicalNodeByOutputNameResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NodeInfo")
    private NodeInfo nodeInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetPhysicalNodeByOutputNameResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.nodeInfo = builder.nodeInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPhysicalNodeByOutputNameResponseBody create() {
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
     * @return nodeInfo
     */
    public NodeInfo getNodeInfo() {
        return this.nodeInfo;
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
        private NodeInfo nodeInfo; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetPhysicalNodeByOutputNameResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.nodeInfo = model.nodeInfo;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Error code. OK indicates a successful request.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>HTTP status code returned by the backend</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Error message</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Node details</p>
         */
        public Builder nodeInfo(NodeInfo nodeInfo) {
            this.nodeInfo = nodeInfo;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetPhysicalNodeByOutputNameResponseBody build() {
            return new GetPhysicalNodeByOutputNameResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPhysicalNodeByOutputNameResponseBody} extends {@link TeaModel}
     *
     * <p>GetPhysicalNodeByOutputNameResponseBody</p>
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
             * <p>User ID</p>
             * 
             * <strong>example:</strong>
             * <p>1311131</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Username</p>
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
     * {@link GetPhysicalNodeByOutputNameResponseBody} extends {@link TeaModel}
     *
     * <p>GetPhysicalNodeByOutputNameResponseBody</p>
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
             * <p>User ID</p>
             * 
             * <strong>example:</strong>
             * <p>1311131</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Username</p>
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
     * {@link GetPhysicalNodeByOutputNameResponseBody} extends {@link TeaModel}
     *
     * <p>GetPhysicalNodeByOutputNameResponseBody</p>
     */
    public static class Owner extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Owner(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Owner create() {
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

            private Builder(Owner model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * <p>User ID</p>
             * 
             * <strong>example:</strong>
             * <p>1311131</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Username</p>
             * 
             * <strong>example:</strong>
             * <p>xx测试</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Owner build() {
                return new Owner(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPhysicalNodeByOutputNameResponseBody} extends {@link TeaModel}
     *
     * <p>GetPhysicalNodeByOutputNameResponseBody</p>
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
             * <p>Project ID</p>
             * 
             * <strong>example:</strong>
             * <p>1324211</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Project name</p>
             * 
             * <strong>example:</strong>
             * <p>xx测试</p>
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
     * {@link GetPhysicalNodeByOutputNameResponseBody} extends {@link TeaModel}
     *
     * <p>GetPhysicalNodeByOutputNameResponseBody</p>
     */
    public static class NodeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private Creator creator;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("From")
        private String from;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("LastModifiedTime")
        private Long lastModifiedTime;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private Modifier modifier;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OperatorType")
        private String operatorType;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private Owner owner;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private String priority;

        @com.aliyun.core.annotation.NameInMap("ProjectInfo")
        private ProjectInfo projectInfo;

        @com.aliyun.core.annotation.NameInMap("ScheduleType")
        private String scheduleType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TriggerConfig")
        private String triggerConfig;

        private NodeInfo(Builder builder) {
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.description = builder.description;
            this.from = builder.from;
            this.id = builder.id;
            this.lastModifiedTime = builder.lastModifiedTime;
            this.modifier = builder.modifier;
            this.name = builder.name;
            this.operatorType = builder.operatorType;
            this.owner = builder.owner;
            this.priority = builder.priority;
            this.projectInfo = builder.projectInfo;
            this.scheduleType = builder.scheduleType;
            this.status = builder.status;
            this.triggerConfig = builder.triggerConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeInfo create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
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
         * @return from
         */
        public String getFrom() {
            return this.from;
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
        public Long getLastModifiedTime() {
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
         * @return operatorType
         */
        public String getOperatorType() {
            return this.operatorType;
        }

        /**
         * @return owner
         */
        public Owner getOwner() {
            return this.owner;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return projectInfo
         */
        public ProjectInfo getProjectInfo() {
            return this.projectInfo;
        }

        /**
         * @return scheduleType
         */
        public String getScheduleType() {
            return this.scheduleType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return triggerConfig
         */
        public String getTriggerConfig() {
            return this.triggerConfig;
        }

        public static final class Builder {
            private Long createTime; 
            private Creator creator; 
            private String description; 
            private String from; 
            private String id; 
            private Long lastModifiedTime; 
            private Modifier modifier; 
            private String name; 
            private String operatorType; 
            private Owner owner; 
            private String priority; 
            private ProjectInfo projectInfo; 
            private String scheduleType; 
            private String status; 
            private String triggerConfig; 

            private Builder() {
            } 

            private Builder(NodeInfo model) {
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.description = model.description;
                this.from = model.from;
                this.id = model.id;
                this.lastModifiedTime = model.lastModifiedTime;
                this.modifier = model.modifier;
                this.name = model.name;
                this.operatorType = model.operatorType;
                this.owner = model.owner;
                this.priority = model.priority;
                this.projectInfo = model.projectInfo;
                this.scheduleType = model.scheduleType;
                this.status = model.status;
                this.triggerConfig = model.triggerConfig;
            } 

            /**
             * <p>Creation time</p>
             * 
             * <strong>example:</strong>
             * <p>1717343597000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Node creator</p>
             */
            public Builder creator(Creator creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>Description</p>
             * 
             * <strong>example:</strong>
             * <p>xx测试</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Node source</p>
             * <ul>
             * <li>DATA_PROCESS: Code development</li>
             * <li>BLACK_BOX: Black box</li>
             * <li>ONE_ID: Extraction</li>
             * <li>PIPELINE: Pipeline</li>
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
             * <p>Node ID</p>
             * 
             * <strong>example:</strong>
             * <p>n_2321</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Last modified time</p>
             * 
             * <strong>example:</strong>
             * <p>1717343597000</p>
             */
            public Builder lastModifiedTime(Long lastModifiedTime) {
                this.lastModifiedTime = lastModifiedTime;
                return this;
            }

            /**
             * <p>Node modifier</p>
             */
            public Builder modifier(Modifier modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * <p>Name</p>
             * 
             * <strong>example:</strong>
             * <p>xx测试</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Node subtype</p>
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
            public Builder operatorType(String operatorType) {
                this.operatorType = operatorType;
                return this;
            }

            /**
             * <p>Node owner</p>
             */
            public Builder owner(Owner owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>Priority</p>
             * <ul>
             * <li>HIGHEST</li>
             * <li>HIGH</li>
             * <li>MIDDLE</li>
             * <li>LOW</li>
             * <li>LOWEST</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MIDDLE</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>Project to which the node belongs</p>
             */
            public Builder projectInfo(ProjectInfo projectInfo) {
                this.projectInfo = projectInfo;
                return this;
            }

            /**
             * <p>Scheduling period type</p>
             * <ul>
             * <li>MINUTELY</li>
             * <li>HOURLY</li>
             * <li>DAILY</li>
             * <li>WEEKLY</li>
             * <li>MONTHLY</li>
             * <li>YEARLY</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DAILY</p>
             */
            public Builder scheduleType(String scheduleType) {
                this.scheduleType = scheduleType;
                return this;
            }

            /**
             * <p>Node scheduling status</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Trigger configuration, used to implement field dependencies on logical tables</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;expression&quot;:&quot;any_success&quot;}</p>
             */
            public Builder triggerConfig(String triggerConfig) {
                this.triggerConfig = triggerConfig;
                return this;
            }

            public NodeInfo build() {
                return new NodeInfo(this);
            } 

        } 

    }
}
