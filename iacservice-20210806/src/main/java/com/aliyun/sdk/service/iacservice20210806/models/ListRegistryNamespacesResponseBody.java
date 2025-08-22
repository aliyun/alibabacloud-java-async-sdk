// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link ListRegistryNamespacesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRegistryNamespacesResponseBody</p>
 */
public class ListRegistryNamespacesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("namespaces")
    private java.util.List<Namespaces> namespaces;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListRegistryNamespacesResponseBody(Builder builder) {
        this.count = builder.count;
        this.maxResults = builder.maxResults;
        this.namespaces = builder.namespaces;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRegistryNamespacesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return namespaces
     */
    public java.util.List<Namespaces> getNamespaces() {
        return this.namespaces;
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

    public static final class Builder {
        private Long count; 
        private Integer maxResults; 
        private java.util.List<Namespaces> namespaces; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListRegistryNamespacesResponseBody model) {
            this.count = model.count;
            this.maxResults = model.maxResults;
            this.namespaces = model.namespaces;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * count.
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * namespaces.
         */
        public Builder namespaces(java.util.List<Namespaces> namespaces) {
            this.namespaces = namespaces;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListRegistryNamespacesResponseBody build() {
            return new ListRegistryNamespacesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRegistryNamespacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRegistryNamespacesResponseBody</p>
     */
    public static class Namespaces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("acl")
        private String acl;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("maintainer")
        private String maintainer;

        @com.aliyun.core.annotation.NameInMap("modules")
        private Integer modules;

        @com.aliyun.core.annotation.NameInMap("namespaceName")
        private String namespaceName;

        @com.aliyun.core.annotation.NameInMap("sharedAccounts")
        private java.util.List<Long> sharedAccounts;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Namespaces(Builder builder) {
            this.acl = builder.acl;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.maintainer = builder.maintainer;
            this.modules = builder.modules;
            this.namespaceName = builder.namespaceName;
            this.sharedAccounts = builder.sharedAccounts;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Namespaces create() {
            return builder().build();
        }

        /**
         * @return acl
         */
        public String getAcl() {
            return this.acl;
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
         * @return maintainer
         */
        public String getMaintainer() {
            return this.maintainer;
        }

        /**
         * @return modules
         */
        public Integer getModules() {
            return this.modules;
        }

        /**
         * @return namespaceName
         */
        public String getNamespaceName() {
            return this.namespaceName;
        }

        /**
         * @return sharedAccounts
         */
        public java.util.List<Long> getSharedAccounts() {
            return this.sharedAccounts;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String acl; 
            private String createTime; 
            private String description; 
            private String maintainer; 
            private Integer modules; 
            private String namespaceName; 
            private java.util.List<Long> sharedAccounts; 
            private String type; 

            private Builder() {
            } 

            private Builder(Namespaces model) {
                this.acl = model.acl;
                this.createTime = model.createTime;
                this.description = model.description;
                this.maintainer = model.maintainer;
                this.modules = model.modules;
                this.namespaceName = model.namespaceName;
                this.sharedAccounts = model.sharedAccounts;
                this.type = model.type;
            } 

            /**
             * acl.
             */
            public Builder acl(String acl) {
                this.acl = acl;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * maintainer.
             */
            public Builder maintainer(String maintainer) {
                this.maintainer = maintainer;
                return this;
            }

            /**
             * modules.
             */
            public Builder modules(Integer modules) {
                this.modules = modules;
                return this;
            }

            /**
             * namespaceName.
             */
            public Builder namespaceName(String namespaceName) {
                this.namespaceName = namespaceName;
                return this;
            }

            /**
             * sharedAccounts.
             */
            public Builder sharedAccounts(java.util.List<Long> sharedAccounts) {
                this.sharedAccounts = sharedAccounts;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Namespaces build() {
                return new Namespaces(this);
            } 

        } 

    }
}
