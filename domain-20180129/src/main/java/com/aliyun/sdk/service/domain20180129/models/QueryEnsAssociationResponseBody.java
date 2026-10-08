// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QueryEnsAssociationResponseBody model) {
            this.address = model.address;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The wallet address in the ENS system.</p>
         * 
         * <strong>example:</strong>
         * <p>0x123456789012345678901234567890123456****</p>
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * <p>Unique request access token.</p>
         * 
         * <strong>example:</strong>
         * <p>3ECD5439-39A2-477D-9A19-64FCA1F77EEB</p>
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
