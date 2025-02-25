// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEnsAssociationResponseBody} extends {@link TeaModel}
 *
 * <p>QueryEnsAssociationResponseBody</p>
 */
public class QueryEnsAssociationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Address")
    private String address;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryEnsAssociationResponseBody(Builder builder) {
        this.address = builder.address;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEnsAssociationResponseBody create() {
        return builder().build();
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String address; 
        private String requestId; 

        /**
         * Address.
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryEnsAssociationResponseBody build() {
            return new QueryEnsAssociationResponseBody(this);
        } 

    } 

}
