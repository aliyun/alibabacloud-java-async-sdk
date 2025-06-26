// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oms20160615.models;

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
 * {@link PutDomainPartRequest} extends {@link RequestModel}
 *
 * <p>PutDomainPartRequest</p>
 */
public class PutDomainPartRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Compressed")
    private Boolean compressed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Data")
    @com.aliyun.core.annotation.Validation(required = true)
    private String data;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataType")
    private String dataType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainCode;

    private PutDomainPartRequest(Builder builder) {
        super(builder);
        this.compressed = builder.compressed;
        this.data = builder.data;
        this.dataType = builder.dataType;
        this.domainCode = builder.domainCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutDomainPartRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return compressed
     */
    public Boolean getCompressed() {
        return this.compressed;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return domainCode
     */
    public String getDomainCode() {
        return this.domainCode;
    }

    public static final class Builder extends Request.Builder<PutDomainPartRequest, Builder> {
        private Boolean compressed; 
        private String data; 
        private String dataType; 
        private String domainCode; 

        private Builder() {
            super();
        } 

        private Builder(PutDomainPartRequest request) {
            super(request);
            this.compressed = request.compressed;
            this.data = request.data;
            this.dataType = request.dataType;
            this.domainCode = request.domainCode;
        } 

        /**
         * Compressed.
         */
        public Builder compressed(Boolean compressed) {
            this.putQueryParameter("Compressed", compressed);
            this.compressed = compressed;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder data(String data) {
            this.putQueryParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * DataType.
         */
        public Builder dataType(String dataType) {
            this.putQueryParameter("DataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainCode(String domainCode) {
            this.putQueryParameter("DomainCode", domainCode);
            this.domainCode = domainCode;
            return this;
        }

        @Override
        public PutDomainPartRequest build() {
            return new PutDomainPartRequest(this);
        } 

    } 

}
