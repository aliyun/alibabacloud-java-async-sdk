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
 * {@link DeleteMeasureDataResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteMeasureDataResponseBody</p>
 */
public class DeleteMeasureDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiType")
    private String apiType;

    @com.aliyun.core.annotation.NameInMap("DataType")
    private String dataType;

    @com.aliyun.core.annotation.NameInMap("DomainCode")
    private String domainCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private DeleteMeasureDataResponseBody(Builder builder) {
        this.apiType = builder.apiType;
        this.dataType = builder.dataType;
        this.domainCode = builder.domainCode;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMeasureDataResponseBody create() {
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
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String apiType; 
        private String dataType; 
        private String domainCode; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(DeleteMeasureDataResponseBody model) {
            this.apiType = model.apiType;
            this.dataType = model.dataType;
            this.domainCode = model.domainCode;
            this.requestId = model.requestId;
            this.total = model.total;
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
         * <p>OMS Domain</p>
         * 
         * <strong>example:</strong>
         * <p>VM</p>
         */
        public Builder domainCode(String domainCode) {
            this.domainCode = domainCode;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>1111-1111-1111</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DeleteMeasureDataResponseBody build() {
            return new DeleteMeasureDataResponseBody(this);
        } 

    } 

}
