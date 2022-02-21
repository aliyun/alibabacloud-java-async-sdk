// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms_export20211101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchGetRequest} extends {@link RequestModel}
 *
 * <p>BatchGetRequest</p>
 */
public class BatchGetRequest extends Request {
    @Body
    @NameInMap("CompressionType")
    private String compressionType;

    @Body
    @NameInMap("Cursor")
    @Validation(required = true)
    private String cursor;

    @Body
    @NameInMap("Length")
    @Validation(required = true)
    private Integer length;

    @Body
    @NameInMap("Metric")
    @Validation(required = true)
    private String metric;

    @Body
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Body
    @NameInMap("RecordKeyWhiteList")
    private String recordKeyWhiteList;

    private BatchGetRequest(Builder builder) {
        super(builder);
        this.compressionType = builder.compressionType;
        this.cursor = builder.cursor;
        this.length = builder.length;
        this.metric = builder.metric;
        this.namespace = builder.namespace;
        this.recordKeyWhiteList = builder.recordKeyWhiteList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return compressionType
     */
    public String getCompressionType() {
        return this.compressionType;
    }

    /**
     * @return cursor
     */
    public String getCursor() {
        return this.cursor;
    }

    /**
     * @return length
     */
    public Integer getLength() {
        return this.length;
    }

    /**
     * @return metric
     */
    public String getMetric() {
        return this.metric;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return recordKeyWhiteList
     */
    public String getRecordKeyWhiteList() {
        return this.recordKeyWhiteList;
    }

    public static final class Builder extends Request.Builder<BatchGetRequest, Builder> {
        private String compressionType; 
        private String cursor; 
        private Integer length; 
        private String metric; 
        private String namespace; 
        private String recordKeyWhiteList; 

        private Builder() {
            super();
        } 

        private Builder(BatchGetRequest response) {
            super(response);
            this.compressionType = response.compressionType;
            this.cursor = response.cursor;
            this.length = response.length;
            this.metric = response.metric;
            this.namespace = response.namespace;
            this.recordKeyWhiteList = response.recordKeyWhiteList;
        } 

        /**
         * CompressionType.
         */
        public Builder compressionType(String compressionType) {
            this.putBodyParameter("CompressionType", compressionType);
            this.compressionType = compressionType;
            return this;
        }

        /**
         * Cursor.
         */
        public Builder cursor(String cursor) {
            this.putBodyParameter("Cursor", cursor);
            this.cursor = cursor;
            return this;
        }

        /**
         * Length.
         */
        public Builder length(Integer length) {
            this.putBodyParameter("Length", length);
            this.length = length;
            return this;
        }

        /**
         * Metric.
         */
        public Builder metric(String metric) {
            this.putBodyParameter("Metric", metric);
            this.metric = metric;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * RecordKeyWhiteList.
         */
        public Builder recordKeyWhiteList(String recordKeyWhiteList) {
            this.putBodyParameter("RecordKeyWhiteList", recordKeyWhiteList);
            this.recordKeyWhiteList = recordKeyWhiteList;
            return this;
        }

        @Override
        public BatchGetRequest build() {
            return new BatchGetRequest(this);
        } 

    } 

}
