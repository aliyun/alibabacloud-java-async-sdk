// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20230516.models;

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
 * {@link QueryAgentInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAgentInfoResponseBody</p>
 */
public class QueryAgentInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Timestamp")
    private Long timestamp;

    private QueryAgentInfoResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.timestamp = builder.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAgentInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public Model getModel() {
        return this.model;
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
     * @return timestamp
     */
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Long code; 
        private String message; 
        private Model model; 
        private String requestId; 
        private Boolean success; 
        private Long timestamp; 

        private Builder() {
        } 

        private Builder(QueryAgentInfoResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.message = model.message;
            this.model = model.model;
            this.requestId = model.requestId;
            this.success = model.success;
            this.timestamp = model.timestamp;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(Long code) {
            this.code = code;
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
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
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
         * Timestamp.
         */
        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public QueryAgentInfoResponseBody build() {
            return new QueryAgentInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAgentInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAgentInfoResponseBody</p>
     */
    public static class AgentGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        private AgentGroupList(Builder builder) {
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentGroupList create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        public static final class Builder {
            private Long groupId; 
            private String groupName; 

            private Builder() {
            } 

            private Builder(AgentGroupList model) {
                this.groupId = model.groupId;
                this.groupName = model.groupName;
            } 

            /**
             * <p>坐席组ID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>坐席组名称</p>
             * 
             * <strong>example:</strong>
             * <p>a</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            public AgentGroupList build() {
                return new AgentGroupList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAgentInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAgentInfoResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Account")
        private String account;

        @com.aliyun.core.annotation.NameInMap("Active")
        private Long active;

        @com.aliyun.core.annotation.NameInMap("AgentExtension")
        private Long agentExtension;

        @com.aliyun.core.annotation.NameInMap("AgentGroupIds")
        private java.util.List<Long> agentGroupIds;

        @com.aliyun.core.annotation.NameInMap("AgentGroupList")
        private java.util.List<AgentGroupList> agentGroupList;

        @com.aliyun.core.annotation.NameInMap("AgentId")
        private Long agentId;

        @com.aliyun.core.annotation.NameInMap("AgentStatus")
        private Long agentStatus;

        @com.aliyun.core.annotation.NameInMap("AgentTag")
        private String agentTag;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ExtensionPwd")
        private String extensionPwd;

        @com.aliyun.core.annotation.NameInMap("ExtensionServer")
        private String extensionServer;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("WsProtocol")
        private String wsProtocol;

        @com.aliyun.core.annotation.NameInMap("WsRegisterAddress")
        private String wsRegisterAddress;

        private Model(Builder builder) {
            this.account = builder.account;
            this.active = builder.active;
            this.agentExtension = builder.agentExtension;
            this.agentGroupIds = builder.agentGroupIds;
            this.agentGroupList = builder.agentGroupList;
            this.agentId = builder.agentId;
            this.agentStatus = builder.agentStatus;
            this.agentTag = builder.agentTag;
            this.createTime = builder.createTime;
            this.extensionPwd = builder.extensionPwd;
            this.extensionServer = builder.extensionServer;
            this.name = builder.name;
            this.wsProtocol = builder.wsProtocol;
            this.wsRegisterAddress = builder.wsRegisterAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return account
         */
        public String getAccount() {
            return this.account;
        }

        /**
         * @return active
         */
        public Long getActive() {
            return this.active;
        }

        /**
         * @return agentExtension
         */
        public Long getAgentExtension() {
            return this.agentExtension;
        }

        /**
         * @return agentGroupIds
         */
        public java.util.List<Long> getAgentGroupIds() {
            return this.agentGroupIds;
        }

        /**
         * @return agentGroupList
         */
        public java.util.List<AgentGroupList> getAgentGroupList() {
            return this.agentGroupList;
        }

        /**
         * @return agentId
         */
        public Long getAgentId() {
            return this.agentId;
        }

        /**
         * @return agentStatus
         */
        public Long getAgentStatus() {
            return this.agentStatus;
        }

        /**
         * @return agentTag
         */
        public String getAgentTag() {
            return this.agentTag;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return extensionPwd
         */
        public String getExtensionPwd() {
            return this.extensionPwd;
        }

        /**
         * @return extensionServer
         */
        public String getExtensionServer() {
            return this.extensionServer;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return wsProtocol
         */
        public String getWsProtocol() {
            return this.wsProtocol;
        }

        /**
         * @return wsRegisterAddress
         */
        public String getWsRegisterAddress() {
            return this.wsRegisterAddress;
        }

        public static final class Builder {
            private String account; 
            private Long active; 
            private Long agentExtension; 
            private java.util.List<Long> agentGroupIds; 
            private java.util.List<AgentGroupList> agentGroupList; 
            private Long agentId; 
            private Long agentStatus; 
            private String agentTag; 
            private String createTime; 
            private String extensionPwd; 
            private String extensionServer; 
            private String name; 
            private String wsProtocol; 
            private String wsRegisterAddress; 

            private Builder() {
            } 

            private Builder(Model model) {
                this.account = model.account;
                this.active = model.active;
                this.agentExtension = model.agentExtension;
                this.agentGroupIds = model.agentGroupIds;
                this.agentGroupList = model.agentGroupList;
                this.agentId = model.agentId;
                this.agentStatus = model.agentStatus;
                this.agentTag = model.agentTag;
                this.createTime = model.createTime;
                this.extensionPwd = model.extensionPwd;
                this.extensionServer = model.extensionServer;
                this.name = model.name;
                this.wsProtocol = model.wsProtocol;
                this.wsRegisterAddress = model.wsRegisterAddress;
            } 

            /**
             * <p>坐席账号</p>
             * 
             * <strong>example:</strong>
             * <p>a</p>
             */
            public Builder account(String account) {
                this.account = account;
                return this;
            }

            /**
             * <p>账号启用状态，0-停用，1-启用，默认1</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder active(Long active) {
                this.active = active;
                return this;
            }

            /**
             * <p>坐席分机号</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder agentExtension(Long agentExtension) {
                this.agentExtension = agentExtension;
                return this;
            }

            /**
             * <p>坐席组ID列表</p>
             */
            public Builder agentGroupIds(java.util.List<Long> agentGroupIds) {
                this.agentGroupIds = agentGroupIds;
                return this;
            }

            /**
             * <p>坐席组列表</p>
             */
            public Builder agentGroupList(java.util.List<AgentGroupList> agentGroupList) {
                this.agentGroupList = agentGroupList;
                return this;
            }

            /**
             * <p>坐席ID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder agentId(Long agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>坐席状态，1:在线；2:忙碌；3:小休；4:离线</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder agentStatus(Long agentStatus) {
                this.agentStatus = agentStatus;
                return this;
            }

            /**
             * <p>坐席标签</p>
             * 
             * <strong>example:</strong>
             * <p>c</p>
             */
            public Builder agentTag(String agentTag) {
                this.agentTag = agentTag;
                return this;
            }

            /**
             * <p>创建时间</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-11 11:11:11</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>分机密码</p>
             * 
             * <strong>example:</strong>
             * <p>a</p>
             */
            public Builder extensionPwd(String extensionPwd) {
                this.extensionPwd = extensionPwd;
                return this;
            }

            /**
             * <p>分机注册地址</p>
             * 
             * <strong>example:</strong>
             * <p>b</p>
             */
            public Builder extensionServer(String extensionServer) {
                this.extensionServer = extensionServer;
                return this;
            }

            /**
             * <p>坐席名称</p>
             * 
             * <strong>example:</strong>
             * <p>b</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>WebSocket分机注册协议</p>
             * 
             * <strong>example:</strong>
             * <p>b</p>
             */
            public Builder wsProtocol(String wsProtocol) {
                this.wsProtocol = wsProtocol;
                return this;
            }

            /**
             * <p>WebSocket分机注册地址</p>
             * 
             * <strong>example:</strong>
             * <p>a</p>
             */
            public Builder wsRegisterAddress(String wsRegisterAddress) {
                this.wsRegisterAddress = wsRegisterAddress;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
