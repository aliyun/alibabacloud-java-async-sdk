// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListPluginRepositoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPluginRepositoriesResponseBody</p>
 */
public class ListPluginRepositoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListPluginRepositoriesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPluginRepositoriesResponseBody create() {
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
     * @return data
     */
    public java.util.List<Data> getData() {
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

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListPluginRepositoriesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPluginRepositoriesResponseBody build() {
            return new ListPluginRepositoriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPluginRepositoriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPluginRepositoriesResponseBody</p>
     */
    public static class Repositories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("repositoryId")
        private String repositoryId;

        @com.aliyun.core.annotation.NameInMap("repositoryName")
        private String repositoryName;

        private Repositories(Builder builder) {
            this.repositoryId = builder.repositoryId;
            this.repositoryName = builder.repositoryName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Repositories create() {
            return builder().build();
        }

        /**
         * @return repositoryId
         */
        public String getRepositoryId() {
            return this.repositoryId;
        }

        /**
         * @return repositoryName
         */
        public String getRepositoryName() {
            return this.repositoryName;
        }

        public static final class Builder {
            private String repositoryId; 
            private String repositoryName; 

            private Builder() {
            } 

            private Builder(Repositories model) {
                this.repositoryId = model.repositoryId;
                this.repositoryName = model.repositoryName;
            } 

            /**
             * repositoryId.
             */
            public Builder repositoryId(String repositoryId) {
                this.repositoryId = repositoryId;
                return this;
            }

            /**
             * repositoryName.
             */
            public Builder repositoryName(String repositoryName) {
                this.repositoryName = repositoryName;
                return this;
            }

            public Repositories build() {
                return new Repositories(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPluginRepositoriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPluginRepositoriesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("organizationId")
        private String organizationId;

        @com.aliyun.core.annotation.NameInMap("organizationName")
        private String organizationName;

        @com.aliyun.core.annotation.NameInMap("repositories")
        private java.util.List<Repositories> repositories;

        private Data(Builder builder) {
            this.organizationId = builder.organizationId;
            this.organizationName = builder.organizationName;
            this.repositories = builder.repositories;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        /**
         * @return organizationName
         */
        public String getOrganizationName() {
            return this.organizationName;
        }

        /**
         * @return repositories
         */
        public java.util.List<Repositories> getRepositories() {
            return this.repositories;
        }

        public static final class Builder {
            private String organizationId; 
            private String organizationName; 
            private java.util.List<Repositories> repositories; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.organizationId = model.organizationId;
                this.organizationName = model.organizationName;
                this.repositories = model.repositories;
            } 

            /**
             * organizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            /**
             * organizationName.
             */
            public Builder organizationName(String organizationName) {
                this.organizationName = organizationName;
                return this;
            }

            /**
             * repositories.
             */
            public Builder repositories(java.util.List<Repositories> repositories) {
                this.repositories = repositories;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
