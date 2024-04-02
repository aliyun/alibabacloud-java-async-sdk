// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAuditCallbackResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAuditCallbackResponseBody</p>
 */
public class DescribeAuditCallbackResponseBody extends TeaModel {
    @NameInMap("Callback")
    private String callback;

    @NameInMap("CryptType")
    private Integer cryptType;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Seed")
    private String seed;

    private DescribeAuditCallbackResponseBody(Builder builder) {
        this.callback = builder.callback;
        this.cryptType = builder.cryptType;
        this.requestId = builder.requestId;
        this.seed = builder.seed;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAuditCallbackResponseBody create() {
        return builder().build();
    }

    /**
     * @return callback
     */
    public String getCallback() {
        return this.callback;
    }

    /**
     * @return cryptType
     */
    public Integer getCryptType() {
        return this.cryptType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return seed
     */
    public String getSeed() {
        return this.seed;
    }

    public static final class Builder {
        private String callback; 
        private Integer cryptType; 
        private String requestId; 
        private String seed; 

        /**
         * Callback.
         */
        public Builder callback(String callback) {
            this.callback = callback;
            return this;
        }

        /**
         * CryptType.
         */
        public Builder cryptType(Integer cryptType) {
            this.cryptType = cryptType;
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
         * Seed.
         */
        public Builder seed(String seed) {
            this.seed = seed;
            return this;
        }

        public DescribeAuditCallbackResponseBody build() {
            return new DescribeAuditCallbackResponseBody(this);
        } 

    } 

}
