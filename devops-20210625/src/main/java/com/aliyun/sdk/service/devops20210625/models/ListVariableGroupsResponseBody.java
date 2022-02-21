// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVariableGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVariableGroupsResponseBody</p>
 */
public class ListVariableGroupsResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("nextToken")
    private String nextToken;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("totalCount")
    private Long totalCount;

    @NameInMap("variableGroups")
    private java.util.List < VariableGroups> variableGroups;

    private ListVariableGroupsResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
        this.variableGroups = builder.variableGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVariableGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return variableGroups
     */
    public java.util.List < VariableGroups> getVariableGroups() {
        return this.variableGroups;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 
        private java.util.List < VariableGroups> variableGroups; 

        /**
         * 错误码
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * 错误信息
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * 下一次查询的token，为空表示最后一页
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 请求id，每次请求都是唯一值，便于后续排查问题
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * true 接口调用成功，false 接口调用失败
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * 变量组总数
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * 变量组
         */
        public Builder variableGroups(java.util.List < VariableGroups> variableGroups) {
            this.variableGroups = variableGroups;
            return this;
        }

        public ListVariableGroupsResponseBody build() {
            return new ListVariableGroupsResponseBody(this);
        } 

    } 

    public static class RelatedPipelines extends TeaModel {
        @NameInMap("id")
        private Long id;

        @NameInMap("name")
        private String name;

        private RelatedPipelines(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedPipelines create() {
            return builder().build();
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

        public static final class Builder {
            private Long id; 
            private String name; 

            /**
             * 关联的流水线Id
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 关联的流水线名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public RelatedPipelines build() {
                return new RelatedPipelines(this);
            } 

        } 

    }
    public static class Variables extends TeaModel {
        @NameInMap("isEncrypted")
        private Boolean isEncrypted;

        @NameInMap("name")
        private String name;

        @NameInMap("value")
        private String value;

        private Variables(Builder builder) {
            this.isEncrypted = builder.isEncrypted;
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Variables create() {
            return builder().build();
        }

        /**
         * @return isEncrypted
         */
        public Boolean getIsEncrypted() {
            return this.isEncrypted;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Boolean isEncrypted; 
            private String name; 
            private String value; 

            /**
             * 是否加密
             */
            public Builder isEncrypted(Boolean isEncrypted) {
                this.isEncrypted = isEncrypted;
                return this;
            }

            /**
             * 变量名
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 变量值
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Variables build() {
                return new Variables(this);
            } 

        } 

    }
    public static class VariableGroups extends TeaModel {
        @NameInMap("createTime")
        private Long createTime;

        @NameInMap("creatorAccountId")
        private String creatorAccountId;

        @NameInMap("description")
        private String description;

        @NameInMap("id")
        private Long id;

        @NameInMap("modifierAccountId")
        private String modifierAccountId;

        @NameInMap("name")
        private String name;

        @NameInMap("relatedPipelines")
        private java.util.List < RelatedPipelines> relatedPipelines;

        @NameInMap("updateTime")
        private Long updateTime;

        @NameInMap("variables")
        private java.util.List < Variables> variables;

        private VariableGroups(Builder builder) {
            this.createTime = builder.createTime;
            this.creatorAccountId = builder.creatorAccountId;
            this.description = builder.description;
            this.id = builder.id;
            this.modifierAccountId = builder.modifierAccountId;
            this.name = builder.name;
            this.relatedPipelines = builder.relatedPipelines;
            this.updateTime = builder.updateTime;
            this.variables = builder.variables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VariableGroups create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creatorAccountId
         */
        public String getCreatorAccountId() {
            return this.creatorAccountId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return modifierAccountId
         */
        public String getModifierAccountId() {
            return this.modifierAccountId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return relatedPipelines
         */
        public java.util.List < RelatedPipelines> getRelatedPipelines() {
            return this.relatedPipelines;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return variables
         */
        public java.util.List < Variables> getVariables() {
            return this.variables;
        }

        public static final class Builder {
            private Long createTime; 
            private String creatorAccountId; 
            private String description; 
            private Long id; 
            private String modifierAccountId; 
            private String name; 
            private java.util.List < RelatedPipelines> relatedPipelines; 
            private Long updateTime; 
            private java.util.List < Variables> variables; 

            /**
             * 创建时间
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 创建人阿里云账号id
             */
            public Builder creatorAccountId(String creatorAccountId) {
                this.creatorAccountId = creatorAccountId;
                return this;
            }

            /**
             * 变量组描述
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 变量组id
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 更新人阿里云账号id
             */
            public Builder modifierAccountId(String modifierAccountId) {
                this.modifierAccountId = modifierAccountId;
                return this;
            }

            /**
             * 变量组名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 关联的流水线
             */
            public Builder relatedPipelines(java.util.List < RelatedPipelines> relatedPipelines) {
                this.relatedPipelines = relatedPipelines;
                return this;
            }

            /**
             * 更新时间
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * 变量
             */
            public Builder variables(java.util.List < Variables> variables) {
                this.variables = variables;
                return this;
            }

            public VariableGroups build() {
                return new VariableGroups(this);
            } 

        } 

    }
}
