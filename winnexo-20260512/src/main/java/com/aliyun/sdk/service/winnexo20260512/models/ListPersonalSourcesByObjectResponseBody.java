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
 * {@link ListPersonalSourcesByObjectResponseBody} extends {@link TeaModel}
 *
 * <p>ListPersonalSourcesByObjectResponseBody</p>
 */
public class ListPersonalSourcesByObjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("page")
    private Long page;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("sources")
    private java.util.List<Sources> sources;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListPersonalSourcesByObjectResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.sources = builder.sources;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPersonalSourcesByObjectResponseBody create() {
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
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return sources
     */
    public java.util.List<Sources> getSources() {
        return this.sources;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Long page; 
        private Long pageSize; 
        private String requestId; 
        private java.util.List<Sources> sources; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListPersonalSourcesByObjectResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.sources = model.sources;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>错误描述，成功时为 success</p>
         * 
         * <strong>example:</strong>
         * <p>请求的资源不存在</p>
         */
        public Builder message(String message) {
            this.message = message;
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
         * <p>每页条数</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
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

        /**
         * <p>当前页资源列表；空数组表示当前页没有可见匹配资源</p>
         */
        public Builder sources(java.util.List<Sources> sources) {
            this.sources = sources;
            return this;
        }

        /**
         * <p>权限过滤并按 Source ID 去重后的匹配总数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListPersonalSourcesByObjectResponseBody build() {
            return new ListPersonalSourcesByObjectResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPersonalSourcesByObjectResponseBody} extends {@link TeaModel}
     *
     * <p>ListPersonalSourcesByObjectResponseBody</p>
     */
    public static class Sources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("directoryId")
        private String directoryId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("sourceId")
        private String sourceId;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Sources(Builder builder) {
            this.description = builder.description;
            this.directoryId = builder.directoryId;
            this.name = builder.name;
            this.scope = builder.scope;
            this.sourceId = builder.sourceId;
            this.sourceType = builder.sourceType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sources create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return directoryId
         */
        public String getDirectoryId() {
            return this.directoryId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return sourceId
         */
        public String getSourceId() {
            return this.sourceId;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String description; 
            private String directoryId; 
            private String name; 
            private String scope; 
            private String sourceId; 
            private String sourceType; 
            private String status; 

            private Builder() {
            } 

            private Builder(Sources model) {
                this.description = model.description;
                this.directoryId = model.directoryId;
                this.name = model.name;
                this.scope = model.scope;
                this.sourceId = model.sourceId;
                this.sourceType = model.sourceType;
                this.status = model.status;
            } 

            /**
             * <p>资源描述，可为空</p>
             * 
             * <strong>example:</strong>
             * <p>user-data test user_data_test fa6c967-20260928141235</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>权限过滤后选择的代表目录 ID；不暴露不可读目录</p>
             * 
             * <strong>example:</strong>
             * <p>root</p>
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * <p>资源名称</p>
             * 
             * <strong>example:</strong>
             * <p>openapi-personal-public-url-7vw69qzc</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>资源范围，固定为 PERSONAL</p>
             * 
             * <strong>example:</strong>
             * <p>read:user,read:repo,write:repo,read:org,read:group</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>资源 ID</p>
             * 
             * <strong>example:</strong>
             * <p>src-da170aem1hkj8qfor7ig</p>
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * <p>资源类型，如 TEXT、FILE、ONLINE_DOC、VOICE_MEETING 等</p>
             * 
             * <strong>example:</strong>
             * <p>BUILTIN</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>资源实际处理状态，如 READY、RUNNING、PENDING、FAILED 等</p>
             * 
             * <strong>example:</strong>
             * <p>Stopped</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Sources build() {
                return new Sources(this);
            } 

        } 

    }
}
