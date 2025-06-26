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
 * {@link DeleteMeasureDataRequest} extends {@link RequestModel}
 *
 * <p>DeleteMeasureDataRequest</p>
 */
public class DeleteMeasureDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiType")
    private String apiType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Compressed")
    private Boolean compressed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataType")
    private String dataType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainCode")
    private String domainCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private String filter;

    private DeleteMeasureDataRequest(Builder builder) {
        super(builder);
        this.apiType = builder.apiType;
        this.compressed = builder.compressed;
        this.data = builder.data;
        this.dataType = builder.dataType;
        this.domainCode = builder.domainCode;
        this.filter = builder.filter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMeasureDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiType
     */
    public String getApiType() {
        return this.apiType;
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

    /**
     * @return filter
     */
    public String getFilter() {
        return this.filter;
    }

    public static final class Builder extends Request.Builder<DeleteMeasureDataRequest, Builder> {
        private String apiType; 
        private Boolean compressed; 
        private String data; 
        private String dataType; 
        private String domainCode; 
        private String filter; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMeasureDataRequest request) {
            super(request);
            this.apiType = request.apiType;
            this.compressed = request.compressed;
            this.data = request.data;
            this.dataType = request.dataType;
            this.domainCode = request.domainCode;
            this.filter = request.filter;
        } 

        /**
         * ApiType.
         */
        public Builder apiType(String apiType) {
            this.putQueryParameter("ApiType", apiType);
            this.apiType = apiType;
            return this;
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
         * Data.
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
         * <p>OMS Domain</p>
         * 
         * <strong>example:</strong>
         * <p>VM</p>
         */
        public Builder domainCode(String domainCode) {
            this.putQueryParameter("DomainCode", domainCode);
            this.domainCode = domainCode;
            return this;
        }

        /**
         * Filter.
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        @Override
        public DeleteMeasureDataRequest build() {
            return new DeleteMeasureDataRequest(this);
        } 

    } 

}
