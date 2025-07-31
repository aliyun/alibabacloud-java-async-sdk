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
 * {@link GetProjectResponseBody} extends {@link TeaModel}
 *
 * <p>GetProjectResponseBody</p>
 */
public class GetProjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("ProjectInfo")
    private ProjectInfo projectInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetProjectResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.projectInfo = builder.projectInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectResponseBody create() {
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
     * @return projectInfo
     */
    public ProjectInfo getProjectInfo() {
        return this.projectInfo;
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
        private ProjectInfo projectInfo; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetProjectResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.projectInfo = model.projectInfo;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * ProjectInfo.
         */
        public Builder projectInfo(ProjectInfo projectInfo) {
            this.projectInfo = projectInfo;
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

        public GetProjectResponseBody build() {
            return new GetProjectResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetProjectResponseBody} extends {@link TeaModel}
     *
     * <p>GetProjectResponseBody</p>
     */
    public static class WhiteLists extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        private WhiteLists(Builder builder) {
            this.description = builder.description;
            this.ip = builder.ip;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WhiteLists create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        public static final class Builder {
            private String description; 
            private String ip; 
            private String port; 

            private Builder() {
            } 

            private Builder(WhiteLists model) {
                this.description = model.description;
                this.ip = model.ip;
                this.port = model.port;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>ip</p>
             * 
             * <strong>example:</strong>
             * <p>10.209.47.198</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            public WhiteLists build() {
                return new WhiteLists(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetProjectResponseBody} extends {@link TeaModel}
     *
     * <p>GetProjectResponseBody</p>
     */
    public static class ProjectInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizUnitDisplayName")
        private String bizUnitDisplayName;

        @com.aliyun.core.annotation.NameInMap("BizUnitId")
        private Long bizUnitId;

        @com.aliyun.core.annotation.NameInMap("ComputeSourceId")
        private Long computeSourceId;

        @com.aliyun.core.annotation.NameInMap("ComputeSourceName")
        private String computeSourceName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Env")
        private String env;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NameSpaceTag")
        private String nameSpaceTag;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("OwnerName")
        private String ownerName;

        @com.aliyun.core.annotation.NameInMap("StreamComputeSourceId")
        private Long streamComputeSourceId;

        @com.aliyun.core.annotation.NameInMap("StreamComputeSourceName")
        private String streamComputeSourceName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("WhiteLists")
        private java.util.List<WhiteLists> whiteLists;

        private ProjectInfo(Builder builder) {
            this.bizUnitDisplayName = builder.bizUnitDisplayName;
            this.bizUnitId = builder.bizUnitId;
            this.computeSourceId = builder.computeSourceId;
            this.computeSourceName = builder.computeSourceName;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.env = builder.env;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.mode = builder.mode;
            this.name = builder.name;
            this.nameSpaceTag = builder.nameSpaceTag;
            this.owner = builder.owner;
            this.ownerName = builder.ownerName;
            this.streamComputeSourceId = builder.streamComputeSourceId;
            this.streamComputeSourceName = builder.streamComputeSourceName;
            this.type = builder.type;
            this.whiteLists = builder.whiteLists;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProjectInfo create() {
            return builder().build();
        }

        /**
         * @return bizUnitDisplayName
         */
        public String getBizUnitDisplayName() {
            return this.bizUnitDisplayName;
        }

        /**
         * @return bizUnitId
         */
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        /**
         * @return computeSourceId
         */
        public Long getComputeSourceId() {
            return this.computeSourceId;
        }

        /**
         * @return computeSourceName
         */
        public String getComputeSourceName() {
            return this.computeSourceName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
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
        public Long getId() {
            return this.id;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nameSpaceTag
         */
        public String getNameSpaceTag() {
            return this.nameSpaceTag;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return streamComputeSourceId
         */
        public Long getStreamComputeSourceId() {
            return this.streamComputeSourceId;
        }

        /**
         * @return streamComputeSourceName
         */
        public String getStreamComputeSourceName() {
            return this.streamComputeSourceName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return whiteLists
         */
        public java.util.List<WhiteLists> getWhiteLists() {
            return this.whiteLists;
        }

        public static final class Builder {
            private String bizUnitDisplayName; 
            private Long bizUnitId; 
            private Long computeSourceId; 
            private String computeSourceName; 
            private String description; 
            private String displayName; 
            private String env; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String mode; 
            private String name; 
            private String nameSpaceTag; 
            private String owner; 
            private String ownerName; 
            private Long streamComputeSourceId; 
            private String streamComputeSourceName; 
            private String type; 
            private java.util.List<WhiteLists> whiteLists; 

            private Builder() {
            } 

            private Builder(ProjectInfo model) {
                this.bizUnitDisplayName = model.bizUnitDisplayName;
                this.bizUnitId = model.bizUnitId;
                this.computeSourceId = model.computeSourceId;
                this.computeSourceName = model.computeSourceName;
                this.description = model.description;
                this.displayName = model.displayName;
                this.env = model.env;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.mode = model.mode;
                this.name = model.name;
                this.nameSpaceTag = model.nameSpaceTag;
                this.owner = model.owner;
                this.ownerName = model.ownerName;
                this.streamComputeSourceId = model.streamComputeSourceId;
                this.streamComputeSourceName = model.streamComputeSourceName;
                this.type = model.type;
                this.whiteLists = model.whiteLists;
            } 

            /**
             * BizUnitDisplayName.
             */
            public Builder bizUnitDisplayName(String bizUnitDisplayName) {
                this.bizUnitDisplayName = bizUnitDisplayName;
                return this;
            }

            /**
             * BizUnitId.
             */
            public Builder bizUnitId(Long bizUnitId) {
                this.bizUnitId = bizUnitId;
                return this;
            }

            /**
             * ComputeSourceId.
             */
            public Builder computeSourceId(Long computeSourceId) {
                this.computeSourceId = computeSourceId;
                return this;
            }

            /**
             * ComputeSourceName.
             */
            public Builder computeSourceName(String computeSourceName) {
                this.computeSourceName = computeSourceName;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Env.
             */
            public Builder env(String env) {
                this.env = env;
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
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
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
             * NameSpaceTag.
             */
            public Builder nameSpaceTag(String nameSpaceTag) {
                this.nameSpaceTag = nameSpaceTag;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * OwnerName.
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * StreamComputeSourceId.
             */
            public Builder streamComputeSourceId(Long streamComputeSourceId) {
                this.streamComputeSourceId = streamComputeSourceId;
                return this;
            }

            /**
             * StreamComputeSourceName.
             */
            public Builder streamComputeSourceName(String streamComputeSourceName) {
                this.streamComputeSourceName = streamComputeSourceName;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * WhiteLists.
             */
            public Builder whiteLists(java.util.List<WhiteLists> whiteLists) {
                this.whiteLists = whiteLists;
                return this;
            }

            public ProjectInfo build() {
                return new ProjectInfo(this);
            } 

        } 

    }
}
