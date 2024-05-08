// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInventorySchemaResponseBody} extends {@link TeaModel}
 *
 * <p>GetInventorySchemaResponseBody</p>
 */
public class GetInventorySchemaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private String maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Schemas")
    private java.util.List < Schemas> schemas;

    private GetInventorySchemaResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.schemas = builder.schemas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInventorySchemaResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public String getMaxResults() {
        return this.maxResults;
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
     * @return schemas
     */
    public java.util.List < Schemas> getSchemas() {
        return this.schemas;
    }

    public static final class Builder {
        private String maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < Schemas> schemas; 

        /**
         * The number of entries per page.
         */
        public Builder maxResults(String maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that was used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * The detailed configurations of the configuration list.
         */
        public Builder schemas(java.util.List < Schemas> schemas) {
            this.schemas = schemas;
            return this;
        }

        public GetInventorySchemaResponseBody build() {
            return new GetInventorySchemaResponseBody(this);
        } 

    } 

    public static class Attributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Attributes(Builder builder) {
            this.dataType = builder.dataType;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attributes create() {
            return builder().build();
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String dataType; 
            private String name; 

            /**
             * The data type of the property.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * The name of the property.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Attributes build() {
                return new Attributes(this);
            } 

        } 

    }
    public static class Schemas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attributes")
        private java.util.List < Attributes> attributes;

        @com.aliyun.core.annotation.NameInMap("TypeName")
        private String typeName;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Schemas(Builder builder) {
            this.attributes = builder.attributes;
            this.typeName = builder.typeName;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Schemas create() {
            return builder().build();
        }

        /**
         * @return attributes
         */
        public java.util.List < Attributes> getAttributes() {
            return this.attributes;
        }

        /**
         * @return typeName
         */
        public String getTypeName() {
            return this.typeName;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private java.util.List < Attributes> attributes; 
            private String typeName; 
            private String version; 

            /**
             * The properties of the configuration list.
             */
            public Builder attributes(java.util.List < Attributes> attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * The name of the configuration list.
             */
            public Builder typeName(String typeName) {
                this.typeName = typeName;
                return this;
            }

            /**
             * The version of the configuration list.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Schemas build() {
                return new Schemas(this);
            } 

        } 

    }
}
