// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEdgeInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetEdgeInstanceResponseBody</p>
 */
public class GetEdgeInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetEdgeInstanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEdgeInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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

        public GetEdgeInstanceResponseBody build() {
            return new GetEdgeInstanceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BizEnable")
        private Boolean bizEnable;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtCreateTimestamp")
        private Long gmtCreateTimestamp;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("GmtModifiedTimestamp")
        private Long gmtModifiedTimestamp;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("LatestDeploymentStatus")
        private Integer latestDeploymentStatus;

        @NameInMap("LatestDeploymentType")
        private String latestDeploymentType;

        @NameInMap("Name")
        private String name;

        @NameInMap("RoleArn")
        private String roleArn;

        @NameInMap("RoleAttachTime")
        private String roleAttachTime;

        @NameInMap("RoleAttachTimestamp")
        private Long roleAttachTimestamp;

        @NameInMap("RoleName")
        private String roleName;

        @NameInMap("Spec")
        private Integer spec;

        @NameInMap("Tags")
        private String tags;

        @NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.bizEnable = builder.bizEnable;
            this.gmtCreate = builder.gmtCreate;
            this.gmtCreateTimestamp = builder.gmtCreateTimestamp;
            this.gmtModified = builder.gmtModified;
            this.gmtModifiedTimestamp = builder.gmtModifiedTimestamp;
            this.instanceId = builder.instanceId;
            this.latestDeploymentStatus = builder.latestDeploymentStatus;
            this.latestDeploymentType = builder.latestDeploymentType;
            this.name = builder.name;
            this.roleArn = builder.roleArn;
            this.roleAttachTime = builder.roleAttachTime;
            this.roleAttachTimestamp = builder.roleAttachTimestamp;
            this.roleName = builder.roleName;
            this.spec = builder.spec;
            this.tags = builder.tags;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bizEnable
         */
        public Boolean getBizEnable() {
            return this.bizEnable;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtCreateTimestamp
         */
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return gmtModifiedTimestamp
         */
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return latestDeploymentStatus
         */
        public Integer getLatestDeploymentStatus() {
            return this.latestDeploymentStatus;
        }

        /**
         * @return latestDeploymentType
         */
        public String getLatestDeploymentType() {
            return this.latestDeploymentType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        /**
         * @return roleAttachTime
         */
        public String getRoleAttachTime() {
            return this.roleAttachTime;
        }

        /**
         * @return roleAttachTimestamp
         */
        public Long getRoleAttachTimestamp() {
            return this.roleAttachTimestamp;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        /**
         * @return spec
         */
        public Integer getSpec() {
            return this.spec;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean bizEnable; 
            private String gmtCreate; 
            private Long gmtCreateTimestamp; 
            private String gmtModified; 
            private Long gmtModifiedTimestamp; 
            private String instanceId; 
            private Integer latestDeploymentStatus; 
            private String latestDeploymentType; 
            private String name; 
            private String roleArn; 
            private String roleAttachTime; 
            private Long roleAttachTimestamp; 
            private String roleName; 
            private Integer spec; 
            private String tags; 
            private String type; 

            /**
             * BizEnable.
             */
            public Builder bizEnable(Boolean bizEnable) {
                this.bizEnable = bizEnable;
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
             * GmtCreateTimestamp.
             */
            public Builder gmtCreateTimestamp(Long gmtCreateTimestamp) {
                this.gmtCreateTimestamp = gmtCreateTimestamp;
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
             * GmtModifiedTimestamp.
             */
            public Builder gmtModifiedTimestamp(Long gmtModifiedTimestamp) {
                this.gmtModifiedTimestamp = gmtModifiedTimestamp;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * LatestDeploymentStatus.
             */
            public Builder latestDeploymentStatus(Integer latestDeploymentStatus) {
                this.latestDeploymentStatus = latestDeploymentStatus;
                return this;
            }

            /**
             * LatestDeploymentType.
             */
            public Builder latestDeploymentType(String latestDeploymentType) {
                this.latestDeploymentType = latestDeploymentType;
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
             * RoleArn.
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * RoleAttachTime.
             */
            public Builder roleAttachTime(String roleAttachTime) {
                this.roleAttachTime = roleAttachTime;
                return this;
            }

            /**
             * RoleAttachTimestamp.
             */
            public Builder roleAttachTimestamp(Long roleAttachTimestamp) {
                this.roleAttachTimestamp = roleAttachTimestamp;
                return this;
            }

            /**
             * RoleName.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * Spec.
             */
            public Builder spec(Integer spec) {
                this.spec = spec;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
