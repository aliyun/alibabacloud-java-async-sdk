// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link ReplaceKnowledgeBaseAdminsResponseBody} extends {@link TeaModel}
 *
 * <p>ReplaceKnowledgeBaseAdminsResponseBody</p>
 */
public class ReplaceKnowledgeBaseAdminsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("creator")
    private Creator creator;

    @com.aliyun.core.annotation.NameInMap("directoryId")
    private String directoryId;

    @com.aliyun.core.annotation.NameInMap("effectiveApprovers")
    private java.util.List<EffectiveApprovers> effectiveApprovers;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("principals")
    private java.util.List<Principals> principals;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ReplaceKnowledgeBaseAdminsResponseBody(Builder builder) {
        this.code = builder.code;
        this.creator = builder.creator;
        this.directoryId = builder.directoryId;
        this.effectiveApprovers = builder.effectiveApprovers;
        this.message = builder.message;
        this.principals = builder.principals;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplaceKnowledgeBaseAdminsResponseBody create() {
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
     * @return creator
     */
    public Creator getCreator() {
        return this.creator;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return effectiveApprovers
     */
    public java.util.List<EffectiveApprovers> getEffectiveApprovers() {
        return this.effectiveApprovers;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return principals
     */
    public java.util.List<Principals> getPrincipals() {
        return this.principals;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Creator creator; 
        private String directoryId; 
        private java.util.List<EffectiveApprovers> effectiveApprovers; 
        private String message; 
        private java.util.List<Principals> principals; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ReplaceKnowledgeBaseAdminsResponseBody model) {
            this.code = model.code;
            this.creator = model.creator;
            this.directoryId = model.directoryId;
            this.effectiveApprovers = model.effectiveApprovers;
            this.message = model.message;
            this.principals = model.principals;
            this.requestId = model.requestId;
        } 

        /**
         * <p>业务状态码：成功为 200，失败为后端错误码</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>知识库创建者</p>
         */
        public Builder creator(Creator creator) {
            this.creator = creator;
            return this;
        }

        /**
         * <p>已配置的知识库根目录业务 ID</p>
         * 
         * <strong>example:</strong>
         * <p>kb_001</p>
         */
        public Builder directoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>用户组展开和去重后的有效审批人</p>
         */
        public Builder effectiveApprovers(java.util.List<EffectiveApprovers> effectiveApprovers) {
            this.effectiveApprovers = effectiveApprovers;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>配置完成后的管理员主体列表，包含创建者</p>
         */
        public Builder principals(java.util.List<Principals> principals) {
            this.principals = principals;
            return this;
        }

        /**
         * <p>请求追踪 ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ReplaceKnowledgeBaseAdminsResponseBody build() {
            return new ReplaceKnowledgeBaseAdminsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ReplaceKnowledgeBaseAdminsResponseBody} extends {@link TeaModel}
     *
     * <p>ReplaceKnowledgeBaseAdminsResponseBody</p>
     */
    public static class Creator extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("immutable")
        private Boolean immutable;

        @com.aliyun.core.annotation.NameInMap("principalId")
        private String principalId;

        @com.aliyun.core.annotation.NameInMap("principalName")
        private String principalName;

        @com.aliyun.core.annotation.NameInMap("principalType")
        private String principalType;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        private Creator(Builder builder) {
            this.immutable = builder.immutable;
            this.principalId = builder.principalId;
            this.principalName = builder.principalName;
            this.principalType = builder.principalType;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Creator create() {
            return builder().build();
        }

        /**
         * @return immutable
         */
        public Boolean getImmutable() {
            return this.immutable;
        }

        /**
         * @return principalId
         */
        public String getPrincipalId() {
            return this.principalId;
        }

        /**
         * @return principalName
         */
        public String getPrincipalName() {
            return this.principalName;
        }

        /**
         * @return principalType
         */
        public String getPrincipalType() {
            return this.principalType;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private Boolean immutable; 
            private String principalId; 
            private String principalName; 
            private String principalType; 
            private String source; 

            private Builder() {
            } 

            private Builder(Creator model) {
                this.immutable = model.immutable;
                this.principalId = model.principalId;
                this.principalName = model.principalName;
                this.principalType = model.principalType;
                this.source = model.source;
            } 

            /**
             * <p>是否为不可移除的创建者</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder immutable(Boolean immutable) {
                this.immutable = immutable;
                return this;
            }

            /**
             * <p>用户 ID 或用户组 ID</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder principalId(String principalId) {
                this.principalId = principalId;
                return this;
            }

            /**
             * <p>主体显示名称，无法解析时为空</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder principalName(String principalName) {
                this.principalName = principalName;
                return this;
            }

            /**
             * <p>主体类型：USER 或 USER_GROUP</p>
             * 
             * <strong>example:</strong>
             * <p>USER</p>
             */
            public Builder principalType(String principalType) {
                this.principalType = principalType;
                return this;
            }

            /**
             * <p>权限来源：CREATOR 或 DIRECT</p>
             * 
             * <strong>example:</strong>
             * <p>CREATOR</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public Creator build() {
                return new Creator(this);
            } 

        } 

    }
    /**
     * 
     * {@link ReplaceKnowledgeBaseAdminsResponseBody} extends {@link TeaModel}
     *
     * <p>ReplaceKnowledgeBaseAdminsResponseBody</p>
     */
    public static class EffectiveApprovers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("sourcePrincipalIds")
        private java.util.List<String> sourcePrincipalIds;

        @com.aliyun.core.annotation.NameInMap("userId")
        private Long userId;

        @com.aliyun.core.annotation.NameInMap("userName")
        private String userName;

        private EffectiveApprovers(Builder builder) {
            this.sourcePrincipalIds = builder.sourcePrincipalIds;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EffectiveApprovers create() {
            return builder().build();
        }

        /**
         * @return sourcePrincipalIds
         */
        public java.util.List<String> getSourcePrincipalIds() {
            return this.sourcePrincipalIds;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private java.util.List<String> sourcePrincipalIds; 
            private Long userId; 
            private String userName; 

            private Builder() {
            } 

            private Builder(EffectiveApprovers model) {
                this.sourcePrincipalIds = model.sourcePrincipalIds;
                this.userId = model.userId;
                this.userName = model.userName;
            } 

            /**
             * <p>产生该审批权限的主体 ID 列表</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;10001&quot;,&quot;group-1&quot;]</p>
             */
            public Builder sourcePrincipalIds(java.util.List<String> sourcePrincipalIds) {
                this.sourcePrincipalIds = sourcePrincipalIds;
                return this;
            }

            /**
             * <p>有效审批用户 ID</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>租户内显示名称，无法解析时为空</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public EffectiveApprovers build() {
                return new EffectiveApprovers(this);
            } 

        } 

    }
    /**
     * 
     * {@link ReplaceKnowledgeBaseAdminsResponseBody} extends {@link TeaModel}
     *
     * <p>ReplaceKnowledgeBaseAdminsResponseBody</p>
     */
    public static class Principals extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("immutable")
        private Boolean immutable;

        @com.aliyun.core.annotation.NameInMap("principalId")
        private String principalId;

        @com.aliyun.core.annotation.NameInMap("principalName")
        private String principalName;

        @com.aliyun.core.annotation.NameInMap("principalType")
        private String principalType;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        private Principals(Builder builder) {
            this.immutable = builder.immutable;
            this.principalId = builder.principalId;
            this.principalName = builder.principalName;
            this.principalType = builder.principalType;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Principals create() {
            return builder().build();
        }

        /**
         * @return immutable
         */
        public Boolean getImmutable() {
            return this.immutable;
        }

        /**
         * @return principalId
         */
        public String getPrincipalId() {
            return this.principalId;
        }

        /**
         * @return principalName
         */
        public String getPrincipalName() {
            return this.principalName;
        }

        /**
         * @return principalType
         */
        public String getPrincipalType() {
            return this.principalType;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private Boolean immutable; 
            private String principalId; 
            private String principalName; 
            private String principalType; 
            private String source; 

            private Builder() {
            } 

            private Builder(Principals model) {
                this.immutable = model.immutable;
                this.principalId = model.principalId;
                this.principalName = model.principalName;
                this.principalType = model.principalType;
                this.source = model.source;
            } 

            /**
             * <p>是否为不可移除的创建者</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder immutable(Boolean immutable) {
                this.immutable = immutable;
                return this;
            }

            /**
             * <p>用户 ID 或用户组 ID</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder principalId(String principalId) {
                this.principalId = principalId;
                return this;
            }

            /**
             * <p>主体显示名称，无法解析时为空</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder principalName(String principalName) {
                this.principalName = principalName;
                return this;
            }

            /**
             * <p>主体类型：USER 或 USER_GROUP</p>
             * 
             * <strong>example:</strong>
             * <p>USER</p>
             */
            public Builder principalType(String principalType) {
                this.principalType = principalType;
                return this;
            }

            /**
             * <p>权限来源：CREATOR 或 DIRECT</p>
             * 
             * <strong>example:</strong>
             * <p>CREATOR</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public Principals build() {
                return new Principals(this);
            } 

        } 

    }
}
