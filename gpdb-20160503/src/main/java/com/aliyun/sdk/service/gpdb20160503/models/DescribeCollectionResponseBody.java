// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCollectionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCollectionResponseBody</p>
 */
public class DescribeCollectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("Dimension")
    private Integer dimension;

    @com.aliyun.core.annotation.NameInMap("FullTextRetrievalFields")
    private String fullTextRetrievalFields;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private java.util.Map < String, String > metadata;

    @com.aliyun.core.annotation.NameInMap("Metrics")
    private String metrics;

    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("Parser")
    private String parser;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeCollectionResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.dimension = builder.dimension;
        this.fullTextRetrievalFields = builder.fullTextRetrievalFields;
        this.message = builder.message;
        this.metadata = builder.metadata;
        this.metrics = builder.metrics;
        this.namespace = builder.namespace;
        this.parser = builder.parser;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCollectionResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return dimension
     */
    public Integer getDimension() {
        return this.dimension;
    }

    /**
     * @return fullTextRetrievalFields
     */
    public String getFullTextRetrievalFields() {
        return this.fullTextRetrievalFields;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return metadata
     */
    public java.util.Map < String, String > getMetadata() {
        return this.metadata;
    }

    /**
     * @return metrics
     */
    public String getMetrics() {
        return this.metrics;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return parser
     */
    public String getParser() {
        return this.parser;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private Integer dimension; 
        private String fullTextRetrievalFields; 
        private String message; 
        private java.util.Map < String, String > metadata; 
        private String metrics; 
        private String namespace; 
        private String parser; 
        private String regionId; 
        private String requestId; 
        private String status; 

        /**
         * The instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The number of vector dimensions.
         */
        public Builder dimension(Integer dimension) {
            this.dimension = dimension;
            return this;
        }

        /**
         * The fields that are used for full-text search. Multiple fields are separated by commas (,).
         */
        public Builder fullTextRetrievalFields(String fullTextRetrievalFields) {
            this.fullTextRetrievalFields = fullTextRetrievalFields;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The metadata of vector data, which is a JSON string in the MAP format. The key specifies the field name, and the value specifies the data type.
         * <p>
         * 
         * **
         * 
         * **Warning** Reserved fields such as id, vector, and to_tsvector cannot be used.
         */
        public Builder metadata(java.util.Map < String, String > metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * The distance metrics.
         */
        public Builder metrics(String metrics) {
            this.metrics = metrics;
            return this;
        }

        /**
         * The name of the namespace.
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * The analyzer that is used for full-text search.
         */
        public Builder parser(String parser) {
            this.parser = parser;
            return this;
        }

        /**
         * The region ID of the instance.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
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
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **success**
         * *   **fail**
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeCollectionResponseBody build() {
            return new DescribeCollectionResponseBody(this);
        } 

    } 

}
