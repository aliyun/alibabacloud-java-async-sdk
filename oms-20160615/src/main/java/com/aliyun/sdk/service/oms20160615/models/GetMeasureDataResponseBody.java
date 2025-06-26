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
 * {@link GetMeasureDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetMeasureDataResponseBody</p>
 */
public class GetMeasureDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiType")
    private String apiType;

    @com.aliyun.core.annotation.NameInMap("Compressed")
    private Boolean compressed;

    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("DataType")
    private String dataType;

    @com.aliyun.core.annotation.NameInMap("DomainCode")
    private String domainCode;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetMeasureDataResponseBody(Builder builder) {
        this.apiType = builder.apiType;
        this.compressed = builder.compressed;
        this.data = builder.data;
        this.dataType = builder.dataType;
        this.domainCode = builder.domainCode;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMeasureDataResponseBody create() {
        return builder().build();
    }

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
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String apiType; 
        private Boolean compressed; 
        private String data; 
        private String dataType; 
        private String domainCode; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetMeasureDataResponseBody model) {
            this.apiType = model.apiType;
            this.compressed = model.compressed;
            this.data = model.data;
            this.dataType = model.dataType;
            this.domainCode = model.domainCode;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * ApiType.
         */
        public Builder apiType(String apiType) {
            this.apiType = apiType;
            return this;
        }

        /**
         * Compressed.
         */
        public Builder compressed(Boolean compressed) {
            this.compressed = compressed;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * DataType.
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * DomainCode.
         */
        public Builder domainCode(String domainCode) {
            this.domainCode = domainCode;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMeasureDataResponseBody build() {
            return new GetMeasureDataResponseBody(this);
        } 

    } 

}
