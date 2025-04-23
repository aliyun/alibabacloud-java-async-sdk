// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DeleteSubDomainRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteSubDomainRecordsResponseBody</p>
 */
public class DeleteSubDomainRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RR")
    private String rr;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DeleteSubDomainRecordsResponseBody(Builder builder) {
        this.rr = builder.rr;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSubDomainRecordsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return rr
     */
    public String getRr() {
        return this.rr;
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
        private String rr; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(DeleteSubDomainRecordsResponseBody model) {
            this.rr = model.rr;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The hostname.</p>
         * 
         * <strong>example:</strong>
         * <p>www</p>
         */
        public Builder rr(String rr) {
            this.rr = rr;
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
         * <p>The total number of the DNS records to be deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
