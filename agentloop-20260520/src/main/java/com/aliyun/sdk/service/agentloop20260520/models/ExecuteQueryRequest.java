// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link ExecuteQueryRequest} extends {@link RequestModel}
 *
 * <p>ExecuteQueryRequest</p>
 */
public class ExecuteQueryRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String agentSpace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("datasetName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String datasetName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("from")
    private Integer from;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("length")
    private Integer length;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("maxOutputLength")
    private Integer maxOutputLength;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("offset")
    private Integer offset;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("to")
    private Integer to;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private ExecuteQueryRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.datasetName = builder.datasetName;
        this.from = builder.from;
        this.length = builder.length;
        this.maxOutputLength = builder.maxOutputLength;
        this.offset = builder.offset;
        this.query = builder.query;
        this.to = builder.to;
        this.type = builder.type;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteQueryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentSpace
     */
    public String getAgentSpace() {
        return this.agentSpace;
    }

    /**
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * @return from
     */
    public Integer getFrom() {
        return this.from;
    }

    /**
     * @return length
     */
    public Integer getLength() {
        return this.length;
    }

    /**
     * @return maxOutputLength
     */
    public Integer getMaxOutputLength() {
        return this.maxOutputLength;
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return to
     */
    public Integer getTo() {
        return this.to;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<ExecuteQueryRequest, Builder> {
        private String agentSpace; 
        private String datasetName; 
        private Integer from; 
        private Integer length; 
        private Integer maxOutputLength; 
        private Integer offset; 
        private String query; 
        private Integer to; 
        private String type; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteQueryRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.datasetName = request.datasetName;
            this.from = request.from;
            this.length = request.length;
            this.maxOutputLength = request.maxOutputLength;
            this.offset = request.offset;
            this.query = request.query;
            this.to = request.to;
            this.type = request.type;
            this.version = request.version;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sop-agent</p>
         */
        public Builder agentSpace(String agentSpace) {
            this.putPathParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>product_faq_dataset</p>
         */
        public Builder datasetName(String datasetName) {
            this.putPathParameter("datasetName", datasetName);
            this.datasetName = datasetName;
            return this;
        }

        /**
         * from.
         */
        public Builder from(Integer from) {
            this.putBodyParameter("from", from);
            this.from = from;
            return this;
        }

        /**
         * length.
         */
        public Builder length(Integer length) {
            this.putBodyParameter("length", length);
            this.length = length;
            return this;
        }

        /**
         * maxOutputLength.
         */
        public Builder maxOutputLength(Integer maxOutputLength) {
            this.putBodyParameter("maxOutputLength", maxOutputLength);
            this.maxOutputLength = maxOutputLength;
            return this;
        }

        /**
         * offset.
         */
        public Builder offset(Integer offset) {
            this.putBodyParameter("offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>select count(*) from product_faq_dataset</p>
         */
        public Builder query(String query) {
            this.putBodyParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * to.
         */
        public Builder to(Integer to) {
            this.putBodyParameter("to", to);
            this.to = to;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SQL</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.putBodyParameter("version", version);
            this.version = version;
            return this;
        }

        @Override
        public ExecuteQueryRequest build() {
            return new ExecuteQueryRequest(this);
        } 

    } 

}
