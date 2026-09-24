// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link PageQueryAgentListNewResponseBody} extends {@link TeaModel}
 *
 * <p>PageQueryAgentListNewResponseBody</p>
 */
public class PageQueryAgentListNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private PageQueryAgentListNewResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PageQueryAgentListNewResponseBody create() {
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
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(PageQueryAgentListNewResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The details about the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>Access denied due to insufficient permissions</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The status code description.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-1234-1234-123456789012</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: Successful.</li>
         * <li><strong>false</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public PageQueryAgentListNewResponseBody build() {
            return new PageQueryAgentListNewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PageQueryAgentListNewResponseBody} extends {@link TeaModel}
     *
     * <p>PageQueryAgentListNewResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private Long agentId;

        @com.aliyun.core.annotation.NameInMap("AgentMode")
        private Long agentMode;

        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        @com.aliyun.core.annotation.NameInMap("ApplicationCode")
        private String applicationCode;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DeployBranchId")
        private Long deployBranchId;

        @com.aliyun.core.annotation.NameInMap("DeployBranchName")
        private String deployBranchName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EffectiveVersionId")
        private Long effectiveVersionId;

        @com.aliyun.core.annotation.NameInMap("EffectiveVersionName")
        private String effectiveVersionName;

        @com.aliyun.core.annotation.NameInMap("IsAvailable")
        private Boolean isAvailable;

        @com.aliyun.core.annotation.NameInMap("LatestPublishTime")
        private String latestPublishTime;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("ServiceDirection")
        private String serviceDirection;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private Long templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        private List(Builder builder) {
            this.agentId = builder.agentId;
            this.agentMode = builder.agentMode;
            this.agentName = builder.agentName;
            this.applicationCode = builder.applicationCode;
            this.createTime = builder.createTime;
            this.deployBranchId = builder.deployBranchId;
            this.deployBranchName = builder.deployBranchName;
            this.description = builder.description;
            this.effectiveVersionId = builder.effectiveVersionId;
            this.effectiveVersionName = builder.effectiveVersionName;
            this.isAvailable = builder.isAvailable;
            this.latestPublishTime = builder.latestPublishTime;
            this.modifyTime = builder.modifyTime;
            this.scene = builder.scene;
            this.serviceDirection = builder.serviceDirection;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public Long getAgentId() {
            return this.agentId;
        }

        /**
         * @return agentMode
         */
        public Long getAgentMode() {
            return this.agentMode;
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
        }

        /**
         * @return applicationCode
         */
        public String getApplicationCode() {
            return this.applicationCode;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deployBranchId
         */
        public Long getDeployBranchId() {
            return this.deployBranchId;
        }

        /**
         * @return deployBranchName
         */
        public String getDeployBranchName() {
            return this.deployBranchName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return effectiveVersionId
         */
        public Long getEffectiveVersionId() {
            return this.effectiveVersionId;
        }

        /**
         * @return effectiveVersionName
         */
        public String getEffectiveVersionName() {
            return this.effectiveVersionName;
        }

        /**
         * @return isAvailable
         */
        public Boolean getIsAvailable() {
            return this.isAvailable;
        }

        /**
         * @return latestPublishTime
         */
        public String getLatestPublishTime() {
            return this.latestPublishTime;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return serviceDirection
         */
        public String getServiceDirection() {
            return this.serviceDirection;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private Long agentId; 
            private Long agentMode; 
            private String agentName; 
            private String applicationCode; 
            private String createTime; 
            private Long deployBranchId; 
            private String deployBranchName; 
            private String description; 
            private Long effectiveVersionId; 
            private String effectiveVersionName; 
            private Boolean isAvailable; 
            private String latestPublishTime; 
            private String modifyTime; 
            private String scene; 
            private String serviceDirection; 
            private Long templateId; 
            private String templateName; 

            private Builder() {
            } 

            private Builder(List model) {
                this.agentId = model.agentId;
                this.agentMode = model.agentMode;
                this.agentName = model.agentName;
                this.applicationCode = model.applicationCode;
                this.createTime = model.createTime;
                this.deployBranchId = model.deployBranchId;
                this.deployBranchName = model.deployBranchName;
                this.description = model.description;
                this.effectiveVersionId = model.effectiveVersionId;
                this.effectiveVersionName = model.effectiveVersionName;
                this.isAvailable = model.isAvailable;
                this.latestPublishTime = model.latestPublishTime;
                this.modifyTime = model.modifyTime;
                this.scene = model.scene;
                this.serviceDirection = model.serviceDirection;
                this.templateId = model.templateId;
                this.templateName = model.templateName;
            } 

            /**
             * <p>The agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>51</p>
             */
            public Builder agentId(Long agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The agent building mode. Valid values:</p>
             * <ul>
             * <li>0: prompt mode (PROMPT).</li>
             * <li>1: dialog flow mode (CONVERSATION).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder agentMode(Long agentMode) {
                this.agentMode = agentMode;
                return this;
            }

            /**
             * <p>The agent name.</p>
             * 
             * <strong>example:</strong>
             * <p>Intelligent Customer Service Assistant</p>
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * <p>The application code.</p>
             * 
             * <strong>example:</strong>
             * <p>aicc_demo_app</p>
             */
            public Builder applicationCode(String applicationCode) {
                this.applicationCode = applicationCode;
                return this;
            }

            /**
             * <p>The creation time, in the format of YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-20 12:00:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the branch being deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>24</p>
             */
            public Builder deployBranchId(Long deployBranchId) {
                this.deployBranchId = deployBranchId;
                return this;
            }

            /**
             * <p>The name of the active branch.</p>
             * 
             * <strong>example:</strong>
             * <p>master</p>
             */
            public Builder deployBranchName(String deployBranchName) {
                this.deployBranchName = deployBranchName;
                return this;
            }

            /**
             * <p>The agent description.</p>
             * 
             * <strong>example:</strong>
             * <p>Intelligent customer service assistant that provides automated customer service support</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the active version.</p>
             * 
             * <strong>example:</strong>
             * <p>71</p>
             */
            public Builder effectiveVersionId(Long effectiveVersionId) {
                this.effectiveVersionId = effectiveVersionId;
                return this;
            }

            /**
             * <p>The name of the active version.</p>
             * 
             * <strong>example:</strong>
             * <p>v1.0.0</p>
             */
            public Builder effectiveVersionName(String effectiveVersionName) {
                this.effectiveVersionName = effectiveVersionName;
                return this;
            }

            /**
             * <p>Indicates whether the agent is available for outbound calls. A value of True indicates that the current deployment branch of the agent has a published version and is available for outbound calls.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isAvailable(Boolean isAvailable) {
                this.isAvailable = isAvailable;
                return this;
            }

            /**
             * <p>The latest version publish time, in the format of YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-20 12:00:00</p>
             */
            public Builder latestPublishTime(String latestPublishTime) {
                this.latestPublishTime = latestPublishTime;
                return this;
            }

            /**
             * <p>The last modification time, in the format of YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-15 10:30:00</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>Personal lead conversion</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>The service direction.</p>
             * 
             * <strong>example:</strong>
             * <p>Sample value</p>
             */
            public Builder serviceDirection(String serviceDirection) {
                this.serviceDirection = serviceDirection;
                return this;
            }

            /**
             * <p>The source template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>62</p>
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The source template name.</p>
             * 
             * <strong>example:</strong>
             * <p>Sample value</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link PageQueryAgentListNewResponseBody} extends {@link TeaModel}
     *
     * <p>PageQueryAgentListNewResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Long pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return pageNo
         */
        public Long getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private Long pageNo; 
            private Long pageSize; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * <p>The data list.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>28</p>
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * <p>The page size.</p>
             * 
             * <strong>example:</strong>
             * <p>41</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
