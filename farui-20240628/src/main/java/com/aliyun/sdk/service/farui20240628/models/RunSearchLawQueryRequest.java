// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.farui20240628.models;

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
 * {@link RunSearchLawQueryRequest} extends {@link RequestModel}
 *
 * <p>RunSearchLawQueryRequest</p>
 */
public class RunSearchLawQueryRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("appId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("filterCondition")
    private FilterCondition filterCondition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageParam")
    private PageParam pageParam;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("queryKeywords")
    private java.util.List<String> queryKeywords;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("thread")
    private Thread thread;

    private RunSearchLawQueryRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.filterCondition = builder.filterCondition;
        this.pageParam = builder.pageParam;
        this.query = builder.query;
        this.queryKeywords = builder.queryKeywords;
        this.thread = builder.thread;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunSearchLawQueryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return filterCondition
     */
    public FilterCondition getFilterCondition() {
        return this.filterCondition;
    }

    /**
     * @return pageParam
     */
    public PageParam getPageParam() {
        return this.pageParam;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return queryKeywords
     */
    public java.util.List<String> getQueryKeywords() {
        return this.queryKeywords;
    }

    /**
     * @return thread
     */
    public Thread getThread() {
        return this.thread;
    }

    public static final class Builder extends Request.Builder<RunSearchLawQueryRequest, Builder> {
        private String workspaceId; 
        private String regionId; 
        private String appId; 
        private FilterCondition filterCondition; 
        private PageParam pageParam; 
        private String query; 
        private java.util.List<String> queryKeywords; 
        private Thread thread; 

        private Builder() {
            super();
        } 

        private Builder(RunSearchLawQueryRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.filterCondition = request.filterCondition;
            this.pageParam = request.pageParam;
            this.query = request.query;
            this.queryKeywords = request.queryKeywords;
            this.thread = request.thread;
        } 

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * appId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * filterCondition.
         */
        public Builder filterCondition(FilterCondition filterCondition) {
            String filterConditionShrink = shrink(filterCondition, "filterCondition", "json");
            this.putBodyParameter("filterCondition", filterConditionShrink);
            this.filterCondition = filterCondition;
            return this;
        }

        /**
         * pageParam.
         */
        public Builder pageParam(PageParam pageParam) {
            String pageParamShrink = shrink(pageParam, "pageParam", "json");
            this.putBodyParameter("pageParam", pageParamShrink);
            this.pageParam = pageParam;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder query(String query) {
            this.putBodyParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * queryKeywords.
         */
        public Builder queryKeywords(java.util.List<String> queryKeywords) {
            String queryKeywordsShrink = shrink(queryKeywords, "queryKeywords", "json");
            this.putBodyParameter("queryKeywords", queryKeywordsShrink);
            this.queryKeywords = queryKeywords;
            return this;
        }

        /**
         * thread.
         */
        public Builder thread(Thread thread) {
            String threadShrink = shrink(thread, "thread", "json");
            this.putBodyParameter("thread", threadShrink);
            this.thread = thread;
            return this;
        }

        @Override
        public RunSearchLawQueryRequest build() {
            return new RunSearchLawQueryRequest(this);
        } 

    } 

    /**
     * 
     * {@link RunSearchLawQueryRequest} extends {@link TeaModel}
     *
     * <p>RunSearchLawQueryRequest</p>
     */
    public static class FilterCondition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("lawName")
        private String lawName;

        private FilterCondition(Builder builder) {
            this.lawName = builder.lawName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilterCondition create() {
            return builder().build();
        }

        /**
         * @return lawName
         */
        public String getLawName() {
            return this.lawName;
        }

        public static final class Builder {
            private String lawName; 

            /**
             * lawName.
             */
            public Builder lawName(String lawName) {
                this.lawName = lawName;
                return this;
            }

            public FilterCondition build() {
                return new FilterCondition(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchLawQueryRequest} extends {@link TeaModel}
     *
     * <p>RunSearchLawQueryRequest</p>
     */
    public static class PageParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("pageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Integer pageSize;

        private PageParam(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageParam create() {
            return builder().build();
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

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 

            /**
             * pageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            public PageParam build() {
                return new PageParam(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchLawQueryRequest} extends {@link TeaModel}
     *
     * <p>RunSearchLawQueryRequest</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        private Messages(Builder builder) {
            this.content = builder.content;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String content; 
            private String role; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchLawQueryRequest} extends {@link TeaModel}
     *
     * <p>RunSearchLawQueryRequest</p>
     */
    public static class Thread extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("messages")
        private java.util.List<Messages> messages;

        private Thread(Builder builder) {
            this.messages = builder.messages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Thread create() {
            return builder().build();
        }

        /**
         * @return messages
         */
        public java.util.List<Messages> getMessages() {
            return this.messages;
        }

        public static final class Builder {
            private java.util.List<Messages> messages; 

            /**
             * messages.
             */
            public Builder messages(java.util.List<Messages> messages) {
                this.messages = messages;
                return this;
            }

            public Thread build() {
                return new Thread(this);
            } 

        } 

    }
}
