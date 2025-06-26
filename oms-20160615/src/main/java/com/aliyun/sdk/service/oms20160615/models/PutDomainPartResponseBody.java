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
 * {@link PutDomainPartResponseBody} extends {@link TeaModel}
 *
 * <p>PutDomainPartResponseBody</p>
 */
public class PutDomainPartResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataType")
    private String dataType;

    @com.aliyun.core.annotation.NameInMap("DomainCode")
    private String domainCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private PutDomainPartResponseBody(Builder builder) {
        this.dataType = builder.dataType;
        this.domainCode = builder.domainCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutDomainPartResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private String dataType; 
        private String domainCode; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(PutDomainPartResponseBody model) {
            this.dataType = model.dataType;
            this.domainCode = model.domainCode;
            this.requestId = model.requestId;
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

        public PutDomainPartResponseBody build() {
            return new PutDomainPartResponseBody(this);
        } 

    } 

}
