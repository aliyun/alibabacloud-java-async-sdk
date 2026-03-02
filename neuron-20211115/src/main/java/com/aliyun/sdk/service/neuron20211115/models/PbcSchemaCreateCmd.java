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
 * {@link PbcSchemaCreateCmd} extends {@link TeaModel}
 *
 * <p>PbcSchemaCreateCmd</p>
 */
public class PbcSchemaCreateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("companyId")
    private Long companyId;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("marketId")
    private Long marketId;

    @com.aliyun.core.annotation.NameInMap("pbcName")
    private String pbcName;

    @com.aliyun.core.annotation.NameInMap("pbcVersion")
    private String pbcVersion;

    @com.aliyun.core.annotation.NameInMap("schema")
    private String schema;

    private PbcSchemaCreateCmd(Builder builder) {
        this.companyId = builder.companyId;
        this.id = builder.id;
        this.marketId = builder.marketId;
        this.pbcName = builder.pbcName;
        this.pbcVersion = builder.pbcVersion;
        this.schema = builder.schema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PbcSchemaCreateCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return companyId
     */
    public Long getCompanyId() {
        return this.companyId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return marketId
     */
    public Long getMarketId() {
        return this.marketId;
    }

    /**
     * @return pbcName
     */
    public String getPbcName() {
        return this.pbcName;
    }

    /**
     * @return pbcVersion
     */
    public String getPbcVersion() {
        return this.pbcVersion;
    }

    /**
     * @return schema
     */
    public String getSchema() {
        return this.schema;
    }

    public static final class Builder {
        private Long companyId; 
        private Long id; 
        private Long marketId; 
        private String pbcName; 
        private String pbcVersion; 
        private String schema; 

        private Builder() {
        } 

        private Builder(PbcSchemaCreateCmd model) {
            this.companyId = model.companyId;
            this.id = model.id;
            this.marketId = model.marketId;
            this.pbcName = model.pbcName;
            this.pbcVersion = model.pbcVersion;
            this.schema = model.schema;
        } 

        /**
         * companyId.
         */
        public Builder companyId(Long companyId) {
            this.companyId = companyId;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
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
         * pbcName.
         */
        public Builder pbcName(String pbcName) {
            this.pbcName = pbcName;
            return this;
        }

        /**
         * pbcVersion.
         */
        public Builder pbcVersion(String pbcVersion) {
            this.pbcVersion = pbcVersion;
            return this;
        }

        /**
         * schema.
         */
        public Builder schema(String schema) {
            this.schema = schema;
            return this;
        }

        public PbcSchemaCreateCmd build() {
            return new PbcSchemaCreateCmd(this);
        } 

    } 

}
