// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryLocalEnsAssociationResponseBody} extends {@link TeaModel}
 *
 * <p>QueryLocalEnsAssociationResponseBody</p>
 */
public class QueryLocalEnsAssociationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Address")
    private String address;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryLocalEnsAssociationResponseBody(Builder builder) {
        this.address = builder.address;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryLocalEnsAssociationResponseBody create() {
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

        public QueryLocalEnsAssociationResponseBody build() {
            return new QueryLocalEnsAssociationResponseBody(this);
        } 

    } 

}
