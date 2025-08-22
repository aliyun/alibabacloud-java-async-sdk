// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

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
 * {@link DescribeDcdnL2IpsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnL2IpsResponseBody</p>
 */
public class DescribeDcdnL2IpsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Vips")
    private java.util.List<String> vips;

    private DescribeDcdnL2IpsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vips = builder.vips;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnL2IpsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vips
     */
    public java.util.List<String> getVips() {
        return this.vips;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<String> vips; 

        private Builder() {
        } 

        private Builder(DescribeDcdnL2IpsResponseBody model) {
            this.requestId = model.requestId;
            this.vips = model.vips;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C370DAF1-C838-4288-A1A0-9A87633D248E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The CIDR blocks of the POPs.</p>
         */
        public Builder vips(java.util.List<String> vips) {
            this.vips = vips;
            return this;
        }

        public DescribeDcdnL2IpsResponseBody build() {
            return new DescribeDcdnL2IpsResponseBody(this);
        } 

    } 

}
