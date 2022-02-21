// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDNSSLBWeightResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateDNSSLBWeightResponseBody</p>
 */
public class UpdateDNSSLBWeightResponseBody extends TeaModel {
    @NameInMap("RecordId")
    private String recordId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Weight")
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
         * RecordId.
         */
        public Builder recordId(String recordId) {
            this.recordId = recordId;
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
         * Weight.
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
