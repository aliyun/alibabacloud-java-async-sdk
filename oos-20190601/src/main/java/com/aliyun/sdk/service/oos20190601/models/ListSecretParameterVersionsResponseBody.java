// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSecretParameterVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSecretParameterVersionsResponseBody</p>
 */
public class ListSecretParameterVersionsResponseBody extends TeaModel {
    @NameInMap("CreatedBy")
    private String createdBy;

    @NameInMap("CreatedDate")
    private String createdDate;

    @NameInMap("Description")
    private String description;

    @NameInMap("Id")
    private String id;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("Name")
    private String name;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("ParameterVersions")
    private java.util.List < ParameterVersions> parameterVersions;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("Type")
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
    public java.util.List < ParameterVersions> getParameterVersions() {
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
        private java.util.List < ParameterVersions> parameterVersions; 
        private String requestId; 
        private Integer totalCount; 
        private String type; 

        /**
         * CreatedBy.
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        /**
         * CreatedDate.
         */
        public Builder createdDate(String createdDate) {
            this.createdDate = createdDate;
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
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * ParameterVersions.
         */
        public Builder parameterVersions(java.util.List < ParameterVersions> parameterVersions) {
            this.parameterVersions = parameterVersions;
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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public ListSecretParameterVersionsResponseBody build() {
            return new ListSecretParameterVersionsResponseBody(this);
        } 

    } 

    public static class ParameterVersions extends TeaModel {
        @NameInMap("ParameterVersion")
        private Integer parameterVersion;

        @NameInMap("UpdatedBy")
        private String updatedBy;

        @NameInMap("UpdatedDate")
        private String updatedDate;

        @NameInMap("Value")
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

            /**
             * ParameterVersion.
             */
            public Builder parameterVersion(Integer parameterVersion) {
                this.parameterVersion = parameterVersion;
                return this;
            }

            /**
             * UpdatedBy.
             */
            public Builder updatedBy(String updatedBy) {
                this.updatedBy = updatedBy;
                return this;
            }

            /**
             * UpdatedDate.
             */
            public Builder updatedDate(String updatedDate) {
                this.updatedDate = updatedDate;
                return this;
            }

            /**
             * Value.
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
