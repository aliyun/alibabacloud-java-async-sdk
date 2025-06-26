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
 * {@link GetDomainPartByProxyRequest} extends {@link RequestModel}
 *
 * <p>GetDomainPartByProxyRequest</p>
 */
public class GetDomainPartByProxyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompressEnable")
    private Boolean compressEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataType")
    private String dataType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Part")
    @com.aliyun.core.annotation.Validation(required = true)
    private String part;

    private GetDomainPartByProxyRequest(Builder builder) {
        super(builder);
        this.compressEnable = builder.compressEnable;
        this.dataType = builder.dataType;
        this.domainCode = builder.domainCode;
        this.part = builder.part;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDomainPartByProxyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return compressEnable
     */
    public Boolean getCompressEnable() {
        return this.compressEnable;
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
     * @return part
     */
    public String getPart() {
        return this.part;
    }

    public static final class Builder extends Request.Builder<GetDomainPartByProxyRequest, Builder> {
        private Boolean compressEnable; 
        private String dataType; 
        private String domainCode; 
        private String part; 

        private Builder() {
            super();
        } 

        private Builder(GetDomainPartByProxyRequest request) {
            super(request);
            this.compressEnable = request.compressEnable;
            this.dataType = request.dataType;
            this.domainCode = request.domainCode;
            this.part = request.part;
        } 

        /**
         * CompressEnable.
         */
        public Builder compressEnable(Boolean compressEnable) {
            this.putQueryParameter("CompressEnable", compressEnable);
            this.compressEnable = compressEnable;
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

        /**
         * <p>This parameter is required.</p>
         */
        public Builder part(String part) {
            this.putQueryParameter("Part", part);
            this.part = part;
            return this;
        }

        @Override
        public GetDomainPartByProxyRequest build() {
            return new GetDomainPartByProxyRequest(this);
        } 

    } 

}
