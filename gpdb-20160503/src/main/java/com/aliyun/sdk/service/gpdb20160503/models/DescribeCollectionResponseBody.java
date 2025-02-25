// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
    private java.util.Map<String, String> metadata;

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
    public java.util.Map<String, String> getMetadata() {
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
        private java.util.Map<String, String> metadata; 
        private String metrics; 
        private String namespace; 
        private String parser; 
        private String regionId; 
        private String requestId; 
        private String status; 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The number of vector dimensions.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder dimension(Integer dimension) {
            this.dimension = dimension;
            return this;
        }

        /**
         * <p>The fields that are used for full-text search. Multiple fields are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>title,content</p>
         */
        public Builder fullTextRetrievalFields(String fullTextRetrievalFields) {
            this.fullTextRetrievalFields = fullTextRetrievalFields;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The metadata of vector data, which is a JSON string in the MAP format. The key specifies the field name, and the value specifies the data type.</p>
         * <p>**</p>
         * <p><strong>Warning</strong> Reserved fields such as id, vector, and to_tsvector cannot be used.</p>
         */
        public Builder metadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>The distance metrics.</p>
         * 
         * <strong>example:</strong>
         * <p>cosine</p>
         */
        public Builder metrics(String metrics) {
            this.metrics = metrics;
            return this;
        }

        /**
         * <p>The name of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>mynamespace</p>
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The analyzer that is used for full-text search.</p>
         * 
         * <strong>example:</strong>
         * <p>zh_cn</p>
         */
        public Builder parser(String parser) {
            this.parser = parser;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>success</strong></li>
         * <li><strong>fail</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
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
