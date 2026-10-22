// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link ListIdentityProviderDepartmentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIdentityProviderDepartmentsResponseBody</p>
 */
public class ListIdentityProviderDepartmentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListIdentityProviderDepartmentsResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIdentityProviderDepartmentsResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
    public Integer getMaxResults() {
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

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private java.util.List<Items> items; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListIdentityProviderDepartmentsResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The business status code of the API request. A value of SUCCESS indicates that the request is successful, but does not indicate that the asynchronous synchronization task is completed.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code of the API request. This code does not indicate the execution result of an asynchronous task.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The direct child departments on the current page under the parent department. You must query the details of the child departments separately.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;id&quot;:&quot;10001&quot;,&quot;name&quot;:&quot;R&amp;D Department&quot;,&quot;parentId&quot;:&quot;1&quot;,&quot;memberCount&quot;:12,&quot;hasChildren&quot;:true}]</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The number of entries per page used for this query.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The response message of the API request.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The token for the next page. An empty or missing value indicates that there are no subsequent pages at the current hierarchy of the parent department, but does not indicate that the entire department tree has been returned.</p>
         * 
         * <strong>example:</strong>
         * <p>example-next-page-token</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The unique identifier of the request. Provide this value when troubleshooting issues.</p>
         * 
         * <strong>example:</strong>
         * <p>01234567-89AB-CDEF-0123-456789ABCDEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API request is successful. To check whether an asynchronous task is completed, query the task status.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of departments. This API does not provide this statistic. The value may not be returned and must not be treated as 0.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListIdentityProviderDepartmentsResponseBody build() {
            return new ListIdentityProviderDepartmentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIdentityProviderDepartmentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIdentityProviderDepartmentsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("hasChildren")
        private Boolean hasChildren;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("memberCount")
        private Long memberCount;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("parentId")
        private String parentId;

        private Items(Builder builder) {
            this.hasChildren = builder.hasChildren;
            this.id = builder.id;
            this.memberCount = builder.memberCount;
            this.name = builder.name;
            this.parentId = builder.parentId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return hasChildren
         */
        public Boolean getHasChildren() {
            return this.hasChildren;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return memberCount
         */
        public Long getMemberCount() {
            return this.memberCount;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parentId
         */
        public String getParentId() {
            return this.parentId;
        }

        public static final class Builder {
            private Boolean hasChildren; 
            private String id; 
            private Long memberCount; 
            private String name; 
            private String parentId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.hasChildren = model.hasChildren;
                this.id = model.id;
                this.memberCount = model.memberCount;
                this.name = model.name;
                this.parentId = model.parentId;
            } 

            /**
             * <p>Indicates whether child departments exist. A value of true indicates that child departments exist and an expansion entry can be displayed. A value of false indicates a leaf node. If this field is not returned, the status is unknown. To query the details of child departments, use the ID of the current node.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasChildren(Boolean hasChildren) {
                this.hasChildren = hasChildren;
                return this;
            }

            /**
             * <p>The unique identifier of the department returned by the identity provider. When querying the child departments of this node, use this value as parentDepartmentId.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The number of members in the department returned by the identity provider. This value is not returned when unknown. Do not treat a missing value as 0.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder memberCount(Long memberCount) {
                this.memberCount = memberCount;
                return this;
            }

            /**
             * <p>The name of the department returned by the identity provider.</p>
             * 
             * <strong>example:</strong>
             * <p>R&amp;D Department</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the parent department to which this department belongs. This value describes the parent-child relationship and is not used to expand the current node.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
