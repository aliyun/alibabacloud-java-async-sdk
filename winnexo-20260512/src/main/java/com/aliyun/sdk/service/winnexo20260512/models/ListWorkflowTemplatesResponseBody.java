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
 * {@link ListWorkflowTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkflowTemplatesResponseBody</p>
 */
public class ListWorkflowTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("hasMore")
    private Boolean hasMore;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("page")
    private Long page;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListWorkflowTemplatesResponseBody(Builder builder) {
        this.code = builder.code;
        this.hasMore = builder.hasMore;
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkflowTemplatesResponseBody create() {
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
     * @return hasMore
     */
    public Boolean getHasMore() {
        return this.hasMore;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
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
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private Boolean hasMore; 
        private java.util.List<Items> items; 
        private Long maxResults; 
        private String message; 
        private String nextToken; 
        private Long page; 
        private Long pageSize; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListWorkflowTemplatesResponseBody model) {
            this.code = model.code;
            this.hasMore = model.hasMore;
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>业务状态码；成功为200</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>是否还有更多数据</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * <p>当前页模板摘要列表</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>本次生效的单页最大返回数量</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>错误描述</p>
         * 
         * <strong>example:</strong>
         * <p>请求的资源不存在</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>下一页翻页令牌；无更多数据时为空字符串</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>当前页码</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Long page) {
            this.page = page;
            return this;
        }

        /**
         * <p>生效单页条数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>请求追踪ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>筛选条件下可见总数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListWorkflowTemplatesResponseBody build() {
            return new ListWorkflowTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWorkflowTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkflowTemplatesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ownerCount")
        private Long ownerCount;

        @com.aliyun.core.annotation.NameInMap("reviewStepCount")
        private Long reviewStepCount;

        @com.aliyun.core.annotation.NameInMap("stepCount")
        private Long stepCount;

        @com.aliyun.core.annotation.NameInMap("templateId")
        private String templateId;

        private Items(Builder builder) {
            this.description = builder.description;
            this.gmtModified = builder.gmtModified;
            this.name = builder.name;
            this.ownerCount = builder.ownerCount;
            this.reviewStepCount = builder.reviewStepCount;
            this.stepCount = builder.stepCount;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ownerCount
         */
        public Long getOwnerCount() {
            return this.ownerCount;
        }

        /**
         * @return reviewStepCount
         */
        public Long getReviewStepCount() {
            return this.reviewStepCount;
        }

        /**
         * @return stepCount
         */
        public Long getStepCount() {
            return this.stepCount;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private String description; 
            private String gmtModified; 
            private String name; 
            private Long ownerCount; 
            private Long reviewStepCount; 
            private Long stepCount; 
            private String templateId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.description = model.description;
                this.gmtModified = model.gmtModified;
                this.name = model.name;
                this.ownerCount = model.ownerCount;
                this.reviewStepCount = model.reviewStepCount;
                this.stepCount = model.stepCount;
                this.templateId = model.templateId;
            } 

            /**
             * <p>模板描述</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>最近修改时间(ISO8601)</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>模板名称</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>去重后的负责人数量</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ownerCount(Long ownerCount) {
                this.ownerCount = ownerCount;
                return this;
            }

            /**
             * <p>配置了审核人的步骤数</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder reviewStepCount(Long reviewStepCount) {
                this.reviewStepCount = reviewStepCount;
                return this;
            }

            /**
             * <p>步骤数</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder stepCount(Long stepCount) {
                this.stepCount = stepCount;
                return this;
            }

            /**
             * <p>模板ID</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
