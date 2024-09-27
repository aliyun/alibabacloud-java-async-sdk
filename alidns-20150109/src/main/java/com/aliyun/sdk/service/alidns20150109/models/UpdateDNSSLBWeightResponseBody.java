// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateDNSSLBWeightResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateDNSSLBWeightResponseBody</p>
 */
public class UpdateDNSSLBWeightResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RecordId")
    private String recordId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Weight")
    private Integer weight;

    private UpdateDNSSLBWeightResponseBody(Builder builder) {
        this.recordId = builder.recordId;
        this.requestId = builder.requestId;
        this.weight = builder.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDNSSLBWeightResponseBody create() {
        return builder().build();
    }

    /**
     * @return recordId
     */
    public String getRecordId() {
        return this.recordId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return weight
     */
    public Integer getWeight() {
        return this.weight;
    }

    public static final class Builder {
        private String recordId; 
        private String requestId; 
        private Integer weight; 

        /**
         * <p>The ID of the DNS record.</p>
         * 
         * <strong>example:</strong>
         * <p>9999985</p>
         */
        public Builder recordId(String recordId) {
            this.recordId = recordId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The updated weight.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder weight(Integer weight) {
            this.weight = weight;
            return this;
        }

        public UpdateDNSSLBWeightResponseBody build() {
            return new UpdateDNSSLBWeightResponseBody(this);
        } 

    } 

}
