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
 * {@link GetComputeClusterResponseBody} extends {@link TeaModel}
 *
 * <p>GetComputeClusterResponseBody</p>
 */
public class GetComputeClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterConfig")
    private ClusterConfig clusterConfig;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetComputeClusterResponseBody(Builder builder) {
        this.clusterConfig = builder.clusterConfig;
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetComputeClusterResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterConfig
     */
    public ClusterConfig getClusterConfig() {
        return this.clusterConfig;
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
        private ClusterConfig clusterConfig; 
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetComputeClusterResponseBody model) {
            this.clusterConfig = model.clusterConfig;
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * ClusterConfig.
         */
        public Builder clusterConfig(ClusterConfig clusterConfig) {
            this.clusterConfig = clusterConfig;
            return this;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
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

        public GetComputeClusterResponseBody build() {
            return new GetComputeClusterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetComputeClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetComputeClusterResponseBody</p>
     */
    public static class ClusterSafetyControl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterSafetyAuthType")
        private String clusterSafetyAuthType;

        @com.aliyun.core.annotation.NameInMap("UserGroupIds")
        private java.util.List<String> userGroupIds;

        @com.aliyun.core.annotation.NameInMap("UserGroupNames")
        private java.util.List<String> userGroupNames;

        @com.aliyun.core.annotation.NameInMap("UserIds")
        private java.util.List<String> userIds;

        @com.aliyun.core.annotation.NameInMap("UserNames")
        private java.util.List<String> userNames;

        private ClusterSafetyControl(Builder builder) {
            this.clusterSafetyAuthType = builder.clusterSafetyAuthType;
            this.userGroupIds = builder.userGroupIds;
            this.userGroupNames = builder.userGroupNames;
            this.userIds = builder.userIds;
            this.userNames = builder.userNames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterSafetyControl create() {
            return builder().build();
        }

        /**
         * @return clusterSafetyAuthType
         */
        public String getClusterSafetyAuthType() {
            return this.clusterSafetyAuthType;
        }

        /**
         * @return userGroupIds
         */
        public java.util.List<String> getUserGroupIds() {
            return this.userGroupIds;
        }

        /**
         * @return userGroupNames
         */
        public java.util.List<String> getUserGroupNames() {
            return this.userGroupNames;
        }

        /**
         * @return userIds
         */
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

        /**
         * @return userNames
         */
        public java.util.List<String> getUserNames() {
            return this.userNames;
        }

        public static final class Builder {
            private String clusterSafetyAuthType; 
            private java.util.List<String> userGroupIds; 
            private java.util.List<String> userGroupNames; 
            private java.util.List<String> userIds; 
            private java.util.List<String> userNames; 

            private Builder() {
            } 

            private Builder(ClusterSafetyControl model) {
                this.clusterSafetyAuthType = model.clusterSafetyAuthType;
                this.userGroupIds = model.userGroupIds;
                this.userGroupNames = model.userGroupNames;
                this.userIds = model.userIds;
                this.userNames = model.userNames;
            } 

            /**
             * ClusterSafetyAuthType.
             */
            public Builder clusterSafetyAuthType(String clusterSafetyAuthType) {
                this.clusterSafetyAuthType = clusterSafetyAuthType;
                return this;
            }

            /**
             * UserGroupIds.
             */
            public Builder userGroupIds(java.util.List<String> userGroupIds) {
                this.userGroupIds = userGroupIds;
                return this;
            }

            /**
             * UserGroupNames.
             */
            public Builder userGroupNames(java.util.List<String> userGroupNames) {
                this.userGroupNames = userGroupNames;
                return this;
            }

            /**
             * UserIds.
             */
            public Builder userIds(java.util.List<String> userIds) {
                this.userIds = userIds;
                return this;
            }

            /**
             * UserNames.
             */
            public Builder userNames(java.util.List<String> userNames) {
                this.userNames = userNames;
                return this;
            }

            public ClusterSafetyControl build() {
                return new ClusterSafetyControl(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetComputeClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetComputeClusterResponseBody</p>
     */
    public static class ClusterConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterSafetyControl")
        private ClusterSafetyControl clusterSafetyControl;

        @com.aliyun.core.annotation.NameInMap("Des")
        private String des;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("TypeVersion")
        private String typeVersion;

        private ClusterConfig(Builder builder) {
            this.clusterSafetyControl = builder.clusterSafetyControl;
            this.des = builder.des;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.name = builder.name;
            this.owner = builder.owner;
            this.typeVersion = builder.typeVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterConfig create() {
            return builder().build();
        }

        /**
         * @return clusterSafetyControl
         */
        public ClusterSafetyControl getClusterSafetyControl() {
            return this.clusterSafetyControl;
        }

        /**
         * @return des
         */
        public String getDes() {
            return this.des;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return typeVersion
         */
        public String getTypeVersion() {
            return this.typeVersion;
        }

        public static final class Builder {
            private ClusterSafetyControl clusterSafetyControl; 
            private String des; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String name; 
            private String owner; 
            private String typeVersion; 

            private Builder() {
            } 

            private Builder(ClusterConfig model) {
                this.clusterSafetyControl = model.clusterSafetyControl;
                this.des = model.des;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.name = model.name;
                this.owner = model.owner;
                this.typeVersion = model.typeVersion;
            } 

            /**
             * ClusterSafetyControl.
             */
            public Builder clusterSafetyControl(ClusterSafetyControl clusterSafetyControl) {
                this.clusterSafetyControl = clusterSafetyControl;
                return this;
            }

            /**
             * Des.
             */
            public Builder des(String des) {
                this.des = des;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * TypeVersion.
             */
            public Builder typeVersion(String typeVersion) {
                this.typeVersion = typeVersion;
                return this;
            }

            public ClusterConfig build() {
                return new ClusterConfig(this);
            } 

        } 

    }
}
