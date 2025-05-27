// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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
 * {@link ListAutomateResponseConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAutomateResponseConfigsResponseBody</p>
 */
public class ListAutomateResponseConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListAutomateResponseConfigsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAutomateResponseConfigsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListAutomateResponseConfigsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
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
         * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListAutomateResponseConfigsResponseBody build() {
            return new ListAutomateResponseConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAutomateResponseConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAutomateResponseConfigsResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private PageInfo(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAutomateResponseConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAutomateResponseConfigsResponseBody</p>
     */
    public static class ResponseData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionConfig")
        private String actionConfig;

        @com.aliyun.core.annotation.NameInMap("ActionType")
        private String actionType;

        @com.aliyun.core.annotation.NameInMap("Aliuid")
        private Long aliuid;

        @com.aliyun.core.annotation.NameInMap("AutoResponseType")
        private String autoResponseType;

        @com.aliyun.core.annotation.NameInMap("DataType")
        private Integer dataType;

        @com.aliyun.core.annotation.NameInMap("ExecutionCondition")
        private String executionCondition;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("SubUserId")
        private Long subUserId;

        private ResponseData(Builder builder) {
            this.actionConfig = builder.actionConfig;
            this.actionType = builder.actionType;
            this.aliuid = builder.aliuid;
            this.autoResponseType = builder.autoResponseType;
            this.dataType = builder.dataType;
            this.executionCondition = builder.executionCondition;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.ruleName = builder.ruleName;
            this.status = builder.status;
            this.subUserId = builder.subUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResponseData create() {
            return builder().build();
        }

        /**
         * @return actionConfig
         */
        public String getActionConfig() {
            return this.actionConfig;
        }

        /**
         * @return actionType
         */
        public String getActionType() {
            return this.actionType;
        }

        /**
         * @return aliuid
         */
        public Long getAliuid() {
            return this.aliuid;
        }

        /**
         * @return autoResponseType
         */
        public String getAutoResponseType() {
            return this.autoResponseType;
        }

        /**
         * @return dataType
         */
        public Integer getDataType() {
            return this.dataType;
        }

        /**
         * @return executionCondition
         */
        public String getExecutionCondition() {
            return this.executionCondition;
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
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return subUserId
         */
        public Long getSubUserId() {
            return this.subUserId;
        }

        public static final class Builder {
            private String actionConfig; 
            private String actionType; 
            private Long aliuid; 
            private String autoResponseType; 
            private Integer dataType; 
            private String executionCondition; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String ruleName; 
            private Integer status; 
            private Long subUserId; 

            private Builder() {
            } 

            private Builder(ResponseData model) {
                this.actionConfig = model.actionConfig;
                this.actionType = model.actionType;
                this.aliuid = model.aliuid;
                this.autoResponseType = model.autoResponseType;
                this.dataType = model.dataType;
                this.executionCondition = model.executionCondition;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.ruleName = model.ruleName;
                this.status = model.status;
                this.subUserId = model.subUserId;
            } 

            /**
             * <p>The configuration of the action that is performed after the automated response rule is hit. The value is in the JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>[
             *       {
             *             &quot;actionType&quot;: &quot;doPlaybook&quot;,
             *             &quot;playbookName&quot;: &quot;WafBlockIP&quot;,
             *             &quot;playbookUuid&quot;: &quot;bdad6220-6584-41b2-9704-fc6584568758&quot;
             *       }
             * ]</p>
             */
            public Builder actionConfig(String actionConfig) {
                this.actionConfig = actionConfig;
                return this;
            }

            /**
             * <p>The type of the handling action. Multiple types are separated by commas (,). Valid values:</p>
             * <ul>
             * <li><strong>doPlaybook</strong>: runs the playbook.</li>
             * <li><strong>changeEventStatus</strong>: changes the event status.</li>
             * <li><strong>changeThreatLevel</strong>: changes the risk level of the event.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>doPlaybook,changeEventStatus</p>
             */
            public Builder actionType(String actionType) {
                this.actionType = actionType;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that is associated with the rule in SIEM.</p>
             * 
             * <strong>example:</strong>
             * <p>127608589417****</p>
             */
            public Builder aliuid(Long aliuid) {
                this.aliuid = aliuid;
                return this;
            }

            /**
             * <p>The type of the automated response rule. Valid values:</p>
             * <ul>
             * <li><strong>event</strong></li>
             * <li><strong>alert</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>event</p>
             */
            public Builder autoResponseType(String autoResponseType) {
                this.autoResponseType = autoResponseType;
                return this;
            }

            /**
             * <p>The type of the view. Valid values:</p>
             * <p>0: the current Alibaba Cloud account
             * 1: the global account</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder dataType(Integer dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * <p>The trigger condition of the automated response rule. The value is in the JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;left&quot;:{&quot;value&quot;:&quot;alert_name&quot;},&quot;operator&quot;:&quot;containsString&quot;,&quot;right&quot;:{&quot;value&quot;:&quot;webshell_online&quot;}}]</p>
             */
            public Builder executionCondition(String executionCondition) {
                this.executionCondition = executionCondition;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-06 16:37:29</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-06 16:37:29</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the automated response rule.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the automated response rule.</p>
             * 
             * <strong>example:</strong>
             * <p>cfw kill quara book</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The status of the rule. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: disabled.</li>
             * <li><strong>100</strong>: enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the user who created the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>17108579417****</p>
             */
            public Builder subUserId(Long subUserId) {
                this.subUserId = subUserId;
                return this;
            }

            public ResponseData build() {
                return new ResponseData(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAutomateResponseConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAutomateResponseConfigsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageInfo")
        private PageInfo pageInfo;

        @com.aliyun.core.annotation.NameInMap("ResponseData")
        private java.util.List<ResponseData> responseData;

        private Data(Builder builder) {
            this.pageInfo = builder.pageInfo;
            this.responseData = builder.responseData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageInfo
         */
        public PageInfo getPageInfo() {
            return this.pageInfo;
        }

        /**
         * @return responseData
         */
        public java.util.List<ResponseData> getResponseData() {
            return this.responseData;
        }

        public static final class Builder {
            private PageInfo pageInfo; 
            private java.util.List<ResponseData> responseData; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageInfo = model.pageInfo;
                this.responseData = model.responseData;
            } 

            /**
             * <p>The pagination information.</p>
             */
            public Builder pageInfo(PageInfo pageInfo) {
                this.pageInfo = pageInfo;
                return this;
            }

            /**
             * <p>The detailed data.</p>
             */
            public Builder responseData(java.util.List<ResponseData> responseData) {
                this.responseData = responseData;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
