// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

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
 * {@link DescribeDomainAttackMaxQpsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainAttackMaxQpsResponseBody</p>
 */
public class DescribeDomainAttackMaxQpsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Qps")
    private String qps;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDomainAttackMaxQpsResponseBody(Builder builder) {
        this.qps = builder.qps;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainAttackMaxQpsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return qps
     */
    public String getQps() {
        return this.qps;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String qps; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDomainAttackMaxQpsResponseBody model) {
            this.qps = model.qps;
            this.requestId = model.requestId;
        } 

        /**
         * Qps.
         */
        public Builder qps(String qps) {
            this.qps = qps;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainAttackMaxQpsResponseBody build() {
            return new DescribeDomainAttackMaxQpsResponseBody(this);
        } 

    } 

}
