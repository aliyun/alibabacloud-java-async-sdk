// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link PbcVersionCmd} extends {@link TeaModel}
 *
 * <p>PbcVersionCmd</p>
 */
public class PbcVersionCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiSchema")
    private String apiSchema;

    @com.aliyun.core.annotation.NameInMap("companyId")
    private Long companyId;

    @com.aliyun.core.annotation.NameInMap("developerId")
    private Long developerId;

    @com.aliyun.core.annotation.NameInMap("document")
    private String document;

    @com.aliyun.core.annotation.NameInMap("marketId")
    private Long marketId;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("schema")
    private String schema;

    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private PbcVersionCmd(Builder builder) {
        this.apiSchema = builder.apiSchema;
        this.companyId = builder.companyId;
        this.developerId = builder.developerId;
        this.document = builder.document;
        this.marketId = builder.marketId;
        this.name = builder.name;
        this.schema = builder.schema;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PbcVersionCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiSchema
     */
    public String getApiSchema() {
        return this.apiSchema;
    }

    /**
     * @return companyId
     */
    public Long getCompanyId() {
        return this.companyId;
    }

    /**
     * @return developerId
     */
    public Long getDeveloperId() {
        return this.developerId;
    }

    /**
     * @return document
     */
    public String getDocument() {
        return this.document;
    }

    /**
     * @return marketId
     */
    public Long getMarketId() {
        return this.marketId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return schema
     */
    public String getSchema() {
        return this.schema;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String apiSchema; 
        private Long companyId; 
        private Long developerId; 
        private String document; 
        private Long marketId; 
        private String name; 
        private String schema; 
        private String version; 

        private Builder() {
        } 

        private Builder(PbcVersionCmd model) {
            this.apiSchema = model.apiSchema;
            this.companyId = model.companyId;
            this.developerId = model.developerId;
            this.document = model.document;
            this.marketId = model.marketId;
            this.name = model.name;
            this.schema = model.schema;
            this.version = model.version;
        } 

        /**
         * apiSchema.
         */
        public Builder apiSchema(String apiSchema) {
            this.apiSchema = apiSchema;
            return this;
        }

        /**
         * companyId.
         */
        public Builder companyId(Long companyId) {
            this.companyId = companyId;
            return this;
        }

        /**
         * developerId.
         */
        public Builder developerId(Long developerId) {
            this.developerId = developerId;
            return this;
        }

        /**
         * document.
         */
        public Builder document(String document) {
            this.document = document;
            return this;
        }

        /**
         * marketId.
         */
        public Builder marketId(Long marketId) {
            this.marketId = marketId;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * schema.
         */
        public Builder schema(String schema) {
            this.schema = schema;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public PbcVersionCmd build() {
            return new PbcVersionCmd(this);
        } 

    } 

}
