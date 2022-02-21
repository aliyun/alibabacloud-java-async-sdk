// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSubDomainRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteSubDomainRecordsResponseBody</p>
 */
public class DeleteSubDomainRecordsResponseBody extends TeaModel {
    @NameInMap("RR")
    private String RR;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private String totalCount;

    private DeleteSubDomainRecordsResponseBody(Builder builder) {
        this.RR = builder.RR;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSubDomainRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return RR
     */
    public String getRR() {
        return this.RR;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String RR; 
        private String requestId; 
        private String totalCount; 

        /**
         * RR.
         */
        public Builder RR(String RR) {
            this.RR = RR;
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
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DeleteSubDomainRecordsResponseBody build() {
            return new DeleteSubDomainRecordsResponseBody(this);
        } 

    } 

}
