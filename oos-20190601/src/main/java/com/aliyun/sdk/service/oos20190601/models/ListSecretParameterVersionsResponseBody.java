// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link ListSecretParameterVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSecretParameterVersionsResponseBody</p>
 */
public class ListSecretParameterVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreatedBy")
    private String createdBy;

    @com.aliyun.core.annotation.NameInMap("CreatedDate")
    private String createdDate;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("ParameterVersions")
    private java.util.List<ParameterVersions> parameterVersions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ListSecretParameterVersionsResponseBody(Builder builder) {
        this.createdBy = builder.createdBy;
        this.createdDate = builder.createdDate;
        this.description = builder.description;
        this.id = builder.id;
        this.maxResults = builder.maxResults;
        this.name = builder.name;
        this.nextToken = builder.nextToken;
        this.parameterVersions = builder.parameterVersions;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSecretParameterVersionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createdBy
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * @return createdDate
     */
    public String getCreatedDate() {
        return this.createdDate;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return parameterVersions
     */
    public java.util.List<ParameterVersions> getParameterVersions() {
        return this.parameterVersions;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String createdBy; 
        private String createdDate; 
        private String description; 
        private String id; 
        private Integer maxResults; 
        private String name; 
        private String nextToken; 
        private java.util.List<ParameterVersions> parameterVersions; 
        private String requestId; 
        private Integer totalCount; 
        private String type; 

        private Builder() {
        } 

        private Builder(ListSecretParameterVersionsResponseBody model) {
            this.createdBy = model.createdBy;
            this.createdDate = model.createdDate;
            this.description = model.description;
            this.id = model.id;
            this.maxResults = model.maxResults;
            this.name = model.name;
            this.nextToken = model.nextToken;
            this.parameterVersions = model.parameterVersions;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.type = model.type;
        } 

        /**
         * <p>The user who created the encryption parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>root(130900000)</p>
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        /**
         * <p>The time when the encryption parameter was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-01T08:01:43Z</p>
         */
        public Builder createdDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }

        /**
         * <p>The description of the encryption parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>SecretParameter</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the encryption parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>p-4c4b401cab6747xxxxxx</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The name of the encryption parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>MySecretParameter</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>MTRBMDc0NjAtRUJFNy00N0NBLTk3NTctMTJDQzQ3NjFENDdB</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The information about the version of the encryption parameter.</p>
         */
        public Builder parameterVersions(java.util.List<ParameterVersions> parameterVersions) {
            this.parameterVersions = parameterVersions;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DBA6E6C8-F75D-41DE-AFF5-1FA03F551CA3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The type of the encryption parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Secret</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public ListSecretParameterVersionsResponseBody build() {
            return new ListSecretParameterVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSecretParameterVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSecretParameterVersionsResponseBody</p>
     */
    public static class ParameterVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParameterVersion")
        private Integer parameterVersion;

        @com.aliyun.core.annotation.NameInMap("UpdatedBy")
        private String updatedBy;

        @com.aliyun.core.annotation.NameInMap("UpdatedDate")
        private String updatedDate;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ParameterVersions(Builder builder) {
            this.parameterVersion = builder.parameterVersion;
            this.updatedBy = builder.updatedBy;
            this.updatedDate = builder.updatedDate;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParameterVersions create() {
            return builder().build();
        }

        /**
         * @return parameterVersion
         */
        public Integer getParameterVersion() {
            return this.parameterVersion;
        }

        /**
         * @return updatedBy
         */
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        /**
         * @return updatedDate
         */
        public String getUpdatedDate() {
            return this.updatedDate;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Integer parameterVersion; 
            private String updatedBy; 
            private String updatedDate; 
            private String value; 

            private Builder() {
            } 

            private Builder(ParameterVersions model) {
                this.parameterVersion = model.parameterVersion;
                this.updatedBy = model.updatedBy;
                this.updatedDate = model.updatedDate;
                this.value = model.value;
            } 

            /**
             * <p>The version number of the encryption parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder parameterVersion(Integer parameterVersion) {
                this.parameterVersion = parameterVersion;
                return this;
            }

            /**
             * <p>The user who updated the encryption parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>root(130900000)</p>
             */
            public Builder updatedBy(String updatedBy) {
                this.updatedBy = updatedBy;
                return this;
            }

            /**
             * <p>The time when the encryption parameter was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-09-01T08:01:43Z</p>
             */
            public Builder updatedDate(String updatedDate) {
                this.updatedDate = updatedDate;
                return this;
            }

            /**
             * <p>The value of the encryption parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>SecretParameter</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ParameterVersions build() {
                return new ParameterVersions(this);
            } 

        } 

    }
}
