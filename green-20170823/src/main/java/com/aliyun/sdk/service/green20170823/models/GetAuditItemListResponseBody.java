// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAuditItemListResponseBody} extends {@link TeaModel}
 *
 * <p>GetAuditItemListResponseBody</p>
 */
public class GetAuditItemListResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    private Long currentPage;

    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private GetAuditItemListResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuditItemListResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long currentPage; 
        private java.util.List < Items> items; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetAuditItemListResponseBody build() {
            return new GetAuditItemListResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("BizType")
        private String bizType;

        @NameInMap("Content")
        private String content;

        @NameInMap("Create")
        private String create;

        @NameInMap("CustomResult")
        private String customResult;

        @NameInMap("CustomRiskType")
        private String customRiskType;

        @NameInMap("CustomTs")
        private String customTs;

        @NameInMap("DataId")
        private String dataId;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Operator")
        private String operator;

        @NameInMap("RcpResult")
        private String rcpResult;

        @NameInMap("RcpRiskType")
        private String rcpRiskType;

        @NameInMap("RcpTs")
        private String rcpTs;

        @NameInMap("SubUid")
        private String subUid;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("Thumbnail")
        private String thumbnail;

        @NameInMap("Type")
        private String type;

        @NameInMap("Uid")
        private String uid;

        @NameInMap("Url")
        private String url;

        private Items(Builder builder) {
            this.bizType = builder.bizType;
            this.content = builder.content;
            this.create = builder.create;
            this.customResult = builder.customResult;
            this.customRiskType = builder.customRiskType;
            this.customTs = builder.customTs;
            this.dataId = builder.dataId;
            this.id = builder.id;
            this.operator = builder.operator;
            this.rcpResult = builder.rcpResult;
            this.rcpRiskType = builder.rcpRiskType;
            this.rcpTs = builder.rcpTs;
            this.subUid = builder.subUid;
            this.taskId = builder.taskId;
            this.thumbnail = builder.thumbnail;
            this.type = builder.type;
            this.uid = builder.uid;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return create
         */
        public String getCreate() {
            return this.create;
        }

        /**
         * @return customResult
         */
        public String getCustomResult() {
            return this.customResult;
        }

        /**
         * @return customRiskType
         */
        public String getCustomRiskType() {
            return this.customRiskType;
        }

        /**
         * @return customTs
         */
        public String getCustomTs() {
            return this.customTs;
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return rcpResult
         */
        public String getRcpResult() {
            return this.rcpResult;
        }

        /**
         * @return rcpRiskType
         */
        public String getRcpRiskType() {
            return this.rcpRiskType;
        }

        /**
         * @return rcpTs
         */
        public String getRcpTs() {
            return this.rcpTs;
        }

        /**
         * @return subUid
         */
        public String getSubUid() {
            return this.subUid;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return thumbnail
         */
        public String getThumbnail() {
            return this.thumbnail;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String bizType; 
            private String content; 
            private String create; 
            private String customResult; 
            private String customRiskType; 
            private String customTs; 
            private String dataId; 
            private Long id; 
            private String operator; 
            private String rcpResult; 
            private String rcpRiskType; 
            private String rcpTs; 
            private String subUid; 
            private String taskId; 
            private String thumbnail; 
            private String type; 
            private String uid; 
            private String url; 

            /**
             * BizType.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Create.
             */
            public Builder create(String create) {
                this.create = create;
                return this;
            }

            /**
             * CustomResult.
             */
            public Builder customResult(String customResult) {
                this.customResult = customResult;
                return this;
            }

            /**
             * CustomRiskType.
             */
            public Builder customRiskType(String customRiskType) {
                this.customRiskType = customRiskType;
                return this;
            }

            /**
             * CustomTs.
             */
            public Builder customTs(String customTs) {
                this.customTs = customTs;
                return this;
            }

            /**
             * DataId.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
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
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * RcpResult.
             */
            public Builder rcpResult(String rcpResult) {
                this.rcpResult = rcpResult;
                return this;
            }

            /**
             * RcpRiskType.
             */
            public Builder rcpRiskType(String rcpRiskType) {
                this.rcpRiskType = rcpRiskType;
                return this;
            }

            /**
             * RcpTs.
             */
            public Builder rcpTs(String rcpTs) {
                this.rcpTs = rcpTs;
                return this;
            }

            /**
             * SubUid.
             */
            public Builder subUid(String subUid) {
                this.subUid = subUid;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * Thumbnail.
             */
            public Builder thumbnail(String thumbnail) {
                this.thumbnail = thumbnail;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
