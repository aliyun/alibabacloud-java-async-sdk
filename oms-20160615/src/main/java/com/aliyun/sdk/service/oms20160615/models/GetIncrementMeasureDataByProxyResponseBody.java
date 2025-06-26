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
 * {@link GetIncrementMeasureDataByProxyResponseBody} extends {@link TeaModel}
 *
 * <p>GetIncrementMeasureDataByProxyResponseBody</p>
 */
public class GetIncrementMeasureDataByProxyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Compressed")
    private String compressed;

    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("DataType")
    private String dataType;

    @com.aliyun.core.annotation.NameInMap("DomainCode")
    private String domainCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetIncrementMeasureDataByProxyResponseBody(Builder builder) {
        this.compressed = builder.compressed;
        this.data = builder.data;
        this.dataType = builder.dataType;
        this.domainCode = builder.domainCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIncrementMeasureDataByProxyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return compressed
     */
    public String getCompressed() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String compressed; 
        private String data; 
        private String dataType; 
        private String domainCode; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetIncrementMeasureDataByProxyResponseBody model) {
            this.compressed = model.compressed;
            this.data = model.data;
            this.dataType = model.dataType;
            this.domainCode = model.domainCode;
            this.requestId = model.requestId;
        } 

        /**
         * Compressed.
         */
        public Builder compressed(String compressed) {
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>645B25AB-4E09-5DCA-8443-A7A58138690B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetIncrementMeasureDataByProxyResponseBody build() {
            return new GetIncrementMeasureDataByProxyResponseBody(this);
        } 

    } 

}
