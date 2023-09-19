// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSecretParametersByPathResponseBody} extends {@link TeaModel}
 *
 * <p>GetSecretParametersByPathResponseBody</p>
 */
public class GetSecretParametersByPathResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("Parameters")
    private java.util.List < Parameters> parameters;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private GetSecretParametersByPathResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.parameters = builder.parameters;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSecretParametersByPathResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return parameters
     */
    public java.util.List < Parameters> getParameters() {
        return this.parameters;
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

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List < Parameters> parameters; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The number of entries per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The information about the encryption parameters.
         */
        public Builder parameters(java.util.List < Parameters> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetSecretParametersByPathResponseBody build() {
            return new GetSecretParametersByPathResponseBody(this);
        } 

    } 

    public static class Parameters extends TeaModel {
        @NameInMap("Constraints")
        private String constraints;

        @NameInMap("CreatedBy")
        private String createdBy;

        @NameInMap("CreatedDate")
        private String createdDate;

        @NameInMap("Description")
        private String description;

        @NameInMap("Id")
        private String id;

        @NameInMap("KeyId")
        private String keyId;

        @NameInMap("Name")
        private String name;

        @NameInMap("ParameterVersion")
        private Integer parameterVersion;

        @NameInMap("ShareType")
        private String shareType;

        @NameInMap("Type")
        private String type;

        @NameInMap("UpdatedBy")
        private String updatedBy;

        @NameInMap("UpdatedDate")
        private String updatedDate;

        @NameInMap("Value")
        private String value;

        private Parameters(Builder builder) {
            this.constraints = builder.constraints;
            this.createdBy = builder.createdBy;
            this.createdDate = builder.createdDate;
            this.description = builder.description;
            this.id = builder.id;
            this.keyId = builder.keyId;
            this.name = builder.name;
            this.parameterVersion = builder.parameterVersion;
            this.shareType = builder.shareType;
            this.type = builder.type;
            this.updatedBy = builder.updatedBy;
            this.updatedDate = builder.updatedDate;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return constraints
         */
        public String getConstraints() {
            return this.constraints;
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
         * @return keyId
         */
        public String getKeyId() {
            return this.keyId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parameterVersion
         */
        public Integer getParameterVersion() {
            return this.parameterVersion;
        }

        /**
         * @return shareType
         */
        public String getShareType() {
            return this.shareType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
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
            private String constraints; 
            private String createdBy; 
            private String createdDate; 
            private String description; 
            private String id; 
            private String keyId; 
            private String name; 
            private Integer parameterVersion; 
            private String shareType; 
            private String type; 
            private String updatedBy; 
            private String updatedDate; 
            private String value; 

            /**
             * The constraints of the encryption parameter.
             */
            public Builder constraints(String constraints) {
                this.constraints = constraints;
                return this;
            }

            /**
             * The user who created the encryption parameter.
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * The time when the encryption parameter was updated.
             */
            public Builder createdDate(String createdDate) {
                this.createdDate = createdDate;
                return this;
            }

            /**
             * The description of the encryption parameter.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the encryption parameter.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The ID of the key.
             */
            public Builder keyId(String keyId) {
                this.keyId = keyId;
                return this;
            }

            /**
             * The name of the encryption parameter.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The version number of the encryption parameter.
             */
            public Builder parameterVersion(Integer parameterVersion) {
                this.parameterVersion = parameterVersion;
                return this;
            }

            /**
             * The share type of the encryption parameter.
             */
            public Builder shareType(String shareType) {
                this.shareType = shareType;
                return this;
            }

            /**
             * The data type of the encryption parameter.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The user who updated the encryption parameter.
             */
            public Builder updatedBy(String updatedBy) {
                this.updatedBy = updatedBy;
                return this;
            }

            /**
             * The time when the encryption parameter was updated.
             */
            public Builder updatedDate(String updatedDate) {
                this.updatedDate = updatedDate;
                return this;
            }

            /**
             * The value of the encryption parameter.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
}
