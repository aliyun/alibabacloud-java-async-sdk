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
 * {@link PageQueryAgentListResponseBody} extends {@link TeaModel}
 *
 * <p>PageQueryAgentListResponseBody</p>
 */
public class PageQueryAgentListResponseBody extends TeaModel {
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

    private PageQueryAgentListResponseBody(Builder builder) {
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

    public static PageQueryAgentListResponseBody create() {
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

        private Builder(PageQueryAgentListResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The detailed reason why access was denied.</p>
         * 
         * <strong>example:</strong>
         * <p>Access Denied</p>
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
         * <p>Succeeded</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>742C9243-2870-B8D6-0C68-C60BEB2DF09A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
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

        public PageQueryAgentListResponseBody build() {
            return new PageQueryAgentListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PageQueryAgentListResponseBody} extends {@link TeaModel}
     *
     * <p>PageQueryAgentListResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        @com.aliyun.core.annotation.NameInMap("ApplicationCode")
        private String applicationCode;

        @com.aliyun.core.annotation.NameInMap("AuditReason")
        private String auditReason;

        @com.aliyun.core.annotation.NameInMap("BuildFailReason")
        private String buildFailReason;

        @com.aliyun.core.annotation.NameInMap("BusinessTypeName")
        private String businessTypeName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("LastOnlineTime")
        private String lastOnlineTime;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("WithActivePrompt")
        private Boolean withActivePrompt;

        @com.aliyun.core.annotation.NameInMap("WithConfig")
        private Boolean withConfig;

        private List(Builder builder) {
            this.agentId = builder.agentId;
            this.agentName = builder.agentName;
            this.applicationCode = builder.applicationCode;
            this.auditReason = builder.auditReason;
            this.buildFailReason = builder.buildFailReason;
            this.businessTypeName = builder.businessTypeName;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.lastOnlineTime = builder.lastOnlineTime;
            this.modifyTime = builder.modifyTime;
            this.status = builder.status;
            this.withActivePrompt = builder.withActivePrompt;
            this.withConfig = builder.withConfig;
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
        public String getAgentId() {
            return this.agentId;
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
         * @return auditReason
         */
        public String getAuditReason() {
            return this.auditReason;
        }

        /**
         * @return buildFailReason
         */
        public String getBuildFailReason() {
            return this.buildFailReason;
        }

        /**
         * @return businessTypeName
         */
        public String getBusinessTypeName() {
            return this.businessTypeName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return lastOnlineTime
         */
        public String getLastOnlineTime() {
            return this.lastOnlineTime;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return withActivePrompt
         */
        public Boolean getWithActivePrompt() {
            return this.withActivePrompt;
        }

        /**
         * @return withConfig
         */
        public Boolean getWithConfig() {
            return this.withConfig;
        }

        public static final class Builder {
            private String agentId; 
            private String agentName; 
            private String applicationCode; 
            private String auditReason; 
            private String buildFailReason; 
            private String businessTypeName; 
            private String createTime; 
            private String description; 
            private String lastOnlineTime; 
            private String modifyTime; 
            private Long status; 
            private Boolean withActivePrompt; 
            private Boolean withConfig; 

            private Builder() {
            } 

            private Builder(List model) {
                this.agentId = model.agentId;
                this.agentName = model.agentName;
                this.applicationCode = model.applicationCode;
                this.auditReason = model.auditReason;
                this.buildFailReason = model.buildFailReason;
                this.businessTypeName = model.businessTypeName;
                this.createTime = model.createTime;
                this.description = model.description;
                this.lastOnlineTime = model.lastOnlineTime;
                this.modifyTime = model.modifyTime;
                this.status = model.status;
                this.withActivePrompt = model.withActivePrompt;
                this.withConfig = model.withConfig;
            } 

            /**
             * <p>The agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>121312*******</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The agent name.</p>
             * 
             * <strong>example:</strong>
             * <p>TestAgent</p>
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * <p>The application code.</p>
             * 
             * <strong>example:</strong>
             * <p>DFAS*****</p>
             */
            public Builder applicationCode(String applicationCode) {
                this.applicationCode = applicationCode;
                return this;
            }

            /**
             * <p>The reason for review failure.</p>
             * 
             * <strong>example:</strong>
             * <p>Provide additional process description</p>
             */
            public Builder auditReason(String auditReason) {
                this.auditReason = auditReason;
                return this;
            }

            /**
             * <p>The reason for build failure.</p>
             * 
             * <strong>example:</strong>
             * <p>System error</p>
             */
            public Builder buildFailReason(String buildFailReason) {
                this.buildFailReason = buildFailReason;
                return this;
            }

            /**
             * <p>The business scenario name.</p>
             * 
             * <strong>example:</strong>
             * <p>Personal customer lead conversion</p>
             */
            public Builder businessTypeName(String businessTypeName) {
                this.businessTypeName = businessTypeName;
                return this;
            }

            /**
             * <p>The creation time, in the format of YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-10-28 17:10:17</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The agent description.</p>
             * 
             * <strong>example:</strong>
             * <p>Used for daily testing</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The most recent online time, in the format of YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-10-28 14:38:15</p>
             */
            public Builder lastOnlineTime(String lastOnlineTime) {
                this.lastOnlineTime = lastOnlineTime;
                return this;
            }

            /**
             * <p>The most recent modification time, in the format of YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-10-28 17:10:17</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The agent status.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * WithActivePrompt.
             */
            public Builder withActivePrompt(Boolean withActivePrompt) {
                this.withActivePrompt = withActivePrompt;
                return this;
            }

            /**
             * <p>Indicates whether the agent has been configured.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder withConfig(Boolean withConfig) {
                this.withConfig = withConfig;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link PageQueryAgentListResponseBody} extends {@link TeaModel}
     *
     * <p>PageQueryAgentListResponseBody</p>
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
             * <p>The list of agent data.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * <p>The page size.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>14</p>
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
