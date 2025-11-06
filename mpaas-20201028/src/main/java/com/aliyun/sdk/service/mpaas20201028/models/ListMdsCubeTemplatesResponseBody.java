// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

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
 * {@link ListMdsCubeTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListMdsCubeTemplatesResponseBody</p>
 */
public class ListMdsCubeTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultContent")
    private ResultContent resultContent;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    private ListMdsCubeTemplatesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultContent = builder.resultContent;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMdsCubeTemplatesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultContent
     */
    public ResultContent getResultContent() {
        return this.resultContent;
    }

    /**
     * @return resultMessage
     */
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static final class Builder {
        private String requestId; 
        private String resultCode; 
        private ResultContent resultContent; 
        private String resultMessage; 

        private Builder() {
        } 

        private Builder(ListMdsCubeTemplatesResponseBody model) {
            this.requestId = model.requestId;
            this.resultCode = model.resultCode;
            this.resultContent = model.resultContent;
            this.resultMessage = model.resultMessage;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultCode.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * ResultContent.
         */
        public Builder resultContent(ResultContent resultContent) {
            this.resultContent = resultContent;
            return this;
        }

        /**
         * ResultMessage.
         */
        public Builder resultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }

        public ListMdsCubeTemplatesResponseBody build() {
            return new ListMdsCubeTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMdsCubeTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMdsCubeTemplatesResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppCode")
        private String appCode;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TemplateDesc")
        private String templateDesc;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        private List(Builder builder) {
            this.appCode = builder.appCode;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.status = builder.status;
            this.templateDesc = builder.templateDesc;
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
         * @return appCode
         */
        public String getAppCode() {
            return this.appCode;
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
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return templateDesc
         */
        public String getTemplateDesc() {
            return this.templateDesc;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private String appCode; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private Integer status; 
            private String templateDesc; 
            private String templateId; 
            private String templateName; 

            private Builder() {
            } 

            private Builder(List model) {
                this.appCode = model.appCode;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.status = model.status;
                this.templateDesc = model.templateDesc;
                this.templateId = model.templateId;
                this.templateName = model.templateName;
            } 

            /**
             * AppCode.
             */
            public Builder appCode(String appCode) {
                this.appCode = appCode;
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
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TemplateDesc.
             */
            public Builder templateDesc(String templateDesc) {
                this.templateDesc = templateDesc;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * TemplateName.
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
     * {@link ListMdsCubeTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMdsCubeTemplatesResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FirstPage")
        private Boolean firstPage;

        @com.aliyun.core.annotation.NameInMap("FirstResult")
        private Long firstResult;

        @com.aliyun.core.annotation.NameInMap("LastPage")
        private Boolean lastPage;

        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("NextPage")
        private Long nextPage;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Integer pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("PrePage")
        private Long prePage;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("TotalPage")
        private Long totalPage;

        private Content(Builder builder) {
            this.firstPage = builder.firstPage;
            this.firstResult = builder.firstResult;
            this.lastPage = builder.lastPage;
            this.list = builder.list;
            this.nextPage = builder.nextPage;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.prePage = builder.prePage;
            this.totalCount = builder.totalCount;
            this.totalPage = builder.totalPage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return firstPage
         */
        public Boolean getFirstPage() {
            return this.firstPage;
        }

        /**
         * @return firstResult
         */
        public Long getFirstResult() {
            return this.firstResult;
        }

        /**
         * @return lastPage
         */
        public Boolean getLastPage() {
            return this.lastPage;
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return nextPage
         */
        public Long getNextPage() {
            return this.nextPage;
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return prePage
         */
        public Long getPrePage() {
            return this.prePage;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalPage
         */
        public Long getTotalPage() {
            return this.totalPage;
        }

        public static final class Builder {
            private Boolean firstPage; 
            private Long firstResult; 
            private Boolean lastPage; 
            private java.util.List<List> list; 
            private Long nextPage; 
            private Integer pageNo; 
            private Integer pageSize; 
            private Long prePage; 
            private Integer totalCount; 
            private Long totalPage; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.firstPage = model.firstPage;
                this.firstResult = model.firstResult;
                this.lastPage = model.lastPage;
                this.list = model.list;
                this.nextPage = model.nextPage;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.prePage = model.prePage;
                this.totalCount = model.totalCount;
                this.totalPage = model.totalPage;
            } 

            /**
             * FirstPage.
             */
            public Builder firstPage(Boolean firstPage) {
                this.firstPage = firstPage;
                return this;
            }

            /**
             * FirstResult.
             */
            public Builder firstResult(Long firstResult) {
                this.firstResult = firstResult;
                return this;
            }

            /**
             * LastPage.
             */
            public Builder lastPage(Boolean lastPage) {
                this.lastPage = lastPage;
                return this;
            }

            /**
             * List.
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * NextPage.
             */
            public Builder nextPage(Long nextPage) {
                this.nextPage = nextPage;
                return this;
            }

            /**
             * PageNo.
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
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
             * PrePage.
             */
            public Builder prePage(Long prePage) {
                this.prePage = prePage;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * TotalPage.
             */
            public Builder totalPage(Long totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMdsCubeTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMdsCubeTemplatesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private Content content;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("ResultMsg")
        private String resultMsg;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private Data(Builder builder) {
            this.content = builder.content;
            this.errorCode = builder.errorCode;
            this.requestId = builder.requestId;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public Content getContent() {
            return this.content;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return resultMsg
         */
        public String getResultMsg() {
            return this.resultMsg;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private Content content; 
            private String errorCode; 
            private String requestId; 
            private String resultMsg; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.content = model.content;
                this.errorCode = model.errorCode;
                this.requestId = model.requestId;
                this.resultMsg = model.resultMsg;
                this.success = model.success;
            } 

            /**
             * Content.
             */
            public Builder content(Content content) {
                this.content = content;
                return this;
            }

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
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
             * ResultMsg.
             */
            public Builder resultMsg(String resultMsg) {
                this.resultMsg = resultMsg;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMdsCubeTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMdsCubeTemplatesResponseBody</p>
     */
    public static class ResultContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private Data data;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        private ResultContent(Builder builder) {
            this.data = builder.data;
            this.requestId = builder.requestId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultContent create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public Data getData() {
            return this.data;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        public static final class Builder {
            private Data data; 
            private String requestId; 

            private Builder() {
            } 

            private Builder(ResultContent model) {
                this.data = model.data;
                this.requestId = model.requestId;
            } 

            /**
             * Data.
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * RequestId.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            public ResultContent build() {
                return new ResultContent(this);
            } 

        } 

    }
}
