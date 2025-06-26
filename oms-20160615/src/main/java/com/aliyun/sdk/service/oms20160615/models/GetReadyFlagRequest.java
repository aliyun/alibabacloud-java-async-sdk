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
 * {@link GetReadyFlagRequest} extends {@link RequestModel}
 *
 * <p>GetReadyFlagRequest</p>
 */
public class GetReadyFlagRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiType;

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
    @com.aliyun.core.annotation.NameInMap("Filter")
    @com.aliyun.core.annotation.Validation(required = true)
    private String filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResult")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
    private Integer maxResult;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    private GetReadyFlagRequest(Builder builder) {
        super(builder);
        this.apiType = builder.apiType;
        this.compressEnable = builder.compressEnable;
        this.dataType = builder.dataType;
        this.domainCode = builder.domainCode;
        this.filter = builder.filter;
        this.maxResult = builder.maxResult;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetReadyFlagRequest create() {
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
     * @return filter
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * @return maxResult
     */
    public Integer getMaxResult() {
        return this.maxResult;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<GetReadyFlagRequest, Builder> {
        private String apiType; 
        private Boolean compressEnable; 
        private String dataType; 
        private String domainCode; 
        private String filter; 
        private Integer maxResult; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(GetReadyFlagRequest request) {
            super(request);
            this.apiType = request.apiType;
            this.compressEnable = request.compressEnable;
            this.dataType = request.dataType;
            this.domainCode = request.domainCode;
            this.filter = request.filter;
            this.maxResult = request.maxResult;
            this.nextToken = request.nextToken;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder apiType(String apiType) {
            this.putQueryParameter("ApiType", apiType);
            this.apiType = apiType;
            return this;
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
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder maxResult(Integer maxResult) {
            this.putQueryParameter("MaxResult", maxResult);
            this.maxResult = maxResult;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public GetReadyFlagRequest build() {
            return new GetReadyFlagRequest(this);
        } 

    } 

}
