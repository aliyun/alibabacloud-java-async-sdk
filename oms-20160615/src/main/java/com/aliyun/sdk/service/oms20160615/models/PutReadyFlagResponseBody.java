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
 * {@link PutReadyFlagResponseBody} extends {@link TeaModel}
 *
 * <p>PutReadyFlagResponseBody</p>
 */
public class PutReadyFlagResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiType")
    private String apiType;

    @com.aliyun.core.annotation.NameInMap("DataType")
    private String dataType;

    @com.aliyun.core.annotation.NameInMap("DomainCode")
    private String domainCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceRequestId")
    private String sourceRequestId;

    private PutReadyFlagResponseBody(Builder builder) {
        this.apiType = builder.apiType;
        this.dataType = builder.dataType;
        this.domainCode = builder.domainCode;
        this.requestId = builder.requestId;
        this.sourceRequestId = builder.sourceRequestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutReadyFlagResponseBody create() {
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

    /**
     * @return sourceRequestId
     */
    public String getSourceRequestId() {
        return this.sourceRequestId;
    }

    public static final class Builder {
        private String apiType; 
        private String dataType; 
        private String domainCode; 
        private String requestId; 
        private String sourceRequestId; 

        private Builder() {
        } 

        private Builder(PutReadyFlagResponseBody model) {
            this.apiType = model.apiType;
            this.dataType = model.dataType;
            this.domainCode = model.domainCode;
            this.requestId = model.requestId;
            this.sourceRequestId = model.sourceRequestId;
        } 

        /**
         * ApiType.
         */
        public Builder apiType(String apiType) {
            this.apiType = apiType;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SourceRequestId.
         */
        public Builder sourceRequestId(String sourceRequestId) {
            this.sourceRequestId = sourceRequestId;
            return this;
        }

        public PutReadyFlagResponseBody build() {
            return new PutReadyFlagResponseBody(this);
        } 

    } 

}
