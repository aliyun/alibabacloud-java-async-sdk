// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sfmmultimodalapp20250909.models;

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
 * {@link ListCommandResponseBody} extends {@link TeaModel}
 *
 * <p>ListCommandResponseBody</p>
 */
public class ListCommandResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ToolInfoList")
    private java.util.List<ToolInfoList> toolInfoList;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListCommandResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.toolInfoList = builder.toolInfoList;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCommandResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return toolInfoList
     */
    public java.util.List<ToolInfoList> getToolInfoList() {
        return this.toolInfoList;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<ToolInfoList> toolInfoList; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListCommandResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.toolInfoList = model.toolInfoList;
            this.totalCount = model.totalCount;
        } 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * ToolInfoList.
         */
        public Builder toolInfoList(java.util.List<ToolInfoList> toolInfoList) {
            this.toolInfoList = toolInfoList;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCommandResponseBody build() {
            return new ListCommandResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCommandResponseBody} extends {@link TeaModel}
     *
     * <p>ListCommandResponseBody</p>
     */
    public static class ToolExamples extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Query")
        private String query;

        private ToolExamples(Builder builder) {
            this.query = builder.query;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ToolExamples create() {
            return builder().build();
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        public static final class Builder {
            private String query; 

            private Builder() {
            } 

            private Builder(ToolExamples model) {
                this.query = model.query;
            } 

            /**
             * Query.
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            public ToolExamples build() {
                return new ToolExamples(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCommandResponseBody} extends {@link TeaModel}
     *
     * <p>ListCommandResponseBody</p>
     */
    public static class ToolParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParamDesc")
        private String paramDesc;

        @com.aliyun.core.annotation.NameInMap("ParamExample")
        private String paramExample;

        @com.aliyun.core.annotation.NameInMap("ParamName")
        private String paramName;

        private ToolParams(Builder builder) {
            this.paramDesc = builder.paramDesc;
            this.paramExample = builder.paramExample;
            this.paramName = builder.paramName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ToolParams create() {
            return builder().build();
        }

        /**
         * @return paramDesc
         */
        public String getParamDesc() {
            return this.paramDesc;
        }

        /**
         * @return paramExample
         */
        public String getParamExample() {
            return this.paramExample;
        }

        /**
         * @return paramName
         */
        public String getParamName() {
            return this.paramName;
        }

        public static final class Builder {
            private String paramDesc; 
            private String paramExample; 
            private String paramName; 

            private Builder() {
            } 

            private Builder(ToolParams model) {
                this.paramDesc = model.paramDesc;
                this.paramExample = model.paramExample;
                this.paramName = model.paramName;
            } 

            /**
             * ParamDesc.
             */
            public Builder paramDesc(String paramDesc) {
                this.paramDesc = paramDesc;
                return this;
            }

            /**
             * ParamExample.
             */
            public Builder paramExample(String paramExample) {
                this.paramExample = paramExample;
                return this;
            }

            /**
             * ParamName.
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            public ToolParams build() {
                return new ToolParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCommandResponseBody} extends {@link TeaModel}
     *
     * <p>ListCommandResponseBody</p>
     */
    public static class ToolInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CreateUserId")
        private String createUserId;

        @com.aliyun.core.annotation.NameInMap("CreateUserName")
        private String createUserName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DomainCode")
        private String domainCode;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("ModifyUserId")
        private String modifyUserId;

        @com.aliyun.core.annotation.NameInMap("ModifyUserName")
        private String modifyUserName;

        @com.aliyun.core.annotation.NameInMap("ToolExamples")
        private java.util.List<ToolExamples> toolExamples;

        @com.aliyun.core.annotation.NameInMap("ToolId")
        private String toolId;

        @com.aliyun.core.annotation.NameInMap("ToolName")
        private String toolName;

        @com.aliyun.core.annotation.NameInMap("ToolParams")
        private java.util.List<ToolParams> toolParams;

        private ToolInfoList(Builder builder) {
            this.appId = builder.appId;
            this.createUserId = builder.createUserId;
            this.createUserName = builder.createUserName;
            this.description = builder.description;
            this.domainCode = builder.domainCode;
            this.domainName = builder.domainName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.modifyUserId = builder.modifyUserId;
            this.modifyUserName = builder.modifyUserName;
            this.toolExamples = builder.toolExamples;
            this.toolId = builder.toolId;
            this.toolName = builder.toolName;
            this.toolParams = builder.toolParams;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ToolInfoList create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return createUserId
         */
        public String getCreateUserId() {
            return this.createUserId;
        }

        /**
         * @return createUserName
         */
        public String getCreateUserName() {
            return this.createUserName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return domainCode
         */
        public String getDomainCode() {
            return this.domainCode;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
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
         * @return modifyUserId
         */
        public String getModifyUserId() {
            return this.modifyUserId;
        }

        /**
         * @return modifyUserName
         */
        public String getModifyUserName() {
            return this.modifyUserName;
        }

        /**
         * @return toolExamples
         */
        public java.util.List<ToolExamples> getToolExamples() {
            return this.toolExamples;
        }

        /**
         * @return toolId
         */
        public String getToolId() {
            return this.toolId;
        }

        /**
         * @return toolName
         */
        public String getToolName() {
            return this.toolName;
        }

        /**
         * @return toolParams
         */
        public java.util.List<ToolParams> getToolParams() {
            return this.toolParams;
        }

        public static final class Builder {
            private String appId; 
            private String createUserId; 
            private String createUserName; 
            private String description; 
            private String domainCode; 
            private String domainName; 
            private String gmtCreate; 
            private String gmtModified; 
            private String modifyUserId; 
            private String modifyUserName; 
            private java.util.List<ToolExamples> toolExamples; 
            private String toolId; 
            private String toolName; 
            private java.util.List<ToolParams> toolParams; 

            private Builder() {
            } 

            private Builder(ToolInfoList model) {
                this.appId = model.appId;
                this.createUserId = model.createUserId;
                this.createUserName = model.createUserName;
                this.description = model.description;
                this.domainCode = model.domainCode;
                this.domainName = model.domainName;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.modifyUserId = model.modifyUserId;
                this.modifyUserName = model.modifyUserName;
                this.toolExamples = model.toolExamples;
                this.toolId = model.toolId;
                this.toolName = model.toolName;
                this.toolParams = model.toolParams;
            } 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * CreateUserId.
             */
            public Builder createUserId(String createUserId) {
                this.createUserId = createUserId;
                return this;
            }

            /**
             * CreateUserName.
             */
            public Builder createUserName(String createUserName) {
                this.createUserName = createUserName;
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
             * DomainCode.
             */
            public Builder domainCode(String domainCode) {
                this.domainCode = domainCode;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
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
             * ModifyUserId.
             */
            public Builder modifyUserId(String modifyUserId) {
                this.modifyUserId = modifyUserId;
                return this;
            }

            /**
             * ModifyUserName.
             */
            public Builder modifyUserName(String modifyUserName) {
                this.modifyUserName = modifyUserName;
                return this;
            }

            /**
             * ToolExamples.
             */
            public Builder toolExamples(java.util.List<ToolExamples> toolExamples) {
                this.toolExamples = toolExamples;
                return this;
            }

            /**
             * ToolId.
             */
            public Builder toolId(String toolId) {
                this.toolId = toolId;
                return this;
            }

            /**
             * ToolName.
             */
            public Builder toolName(String toolName) {
                this.toolName = toolName;
                return this;
            }

            /**
             * ToolParams.
             */
            public Builder toolParams(java.util.List<ToolParams> toolParams) {
                this.toolParams = toolParams;
                return this;
            }

            public ToolInfoList build() {
                return new ToolInfoList(this);
            } 

        } 

    }
}
