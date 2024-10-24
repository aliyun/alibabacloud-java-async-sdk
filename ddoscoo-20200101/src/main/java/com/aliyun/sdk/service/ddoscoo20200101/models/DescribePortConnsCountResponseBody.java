// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribePortConnsCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePortConnsCountResponseBody</p>
 */
public class DescribePortConnsCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActConns")
    private Long actConns;

    @com.aliyun.core.annotation.NameInMap("Conns")
    private Long conns;

    @com.aliyun.core.annotation.NameInMap("Cps")
    private Long cps;

    @com.aliyun.core.annotation.NameInMap("InActConns")
    private Long inActConns;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePortConnsCountResponseBody(Builder builder) {
        this.actConns = builder.actConns;
        this.conns = builder.conns;
        this.cps = builder.cps;
        this.inActConns = builder.inActConns;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePortConnsCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return actConns
     */
    public Long getActConns() {
        return this.actConns;
    }

    /**
     * @return conns
     */
    public Long getConns() {
        return this.conns;
    }

    /**
     * @return cps
     */
    public Long getCps() {
        return this.cps;
    }

    /**
     * @return inActConns
     */
    public Long getInActConns() {
        return this.inActConns;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long actConns; 
        private Long conns; 
        private Long cps; 
        private Long inActConns; 
        private String requestId; 

        /**
         * <p>The number of active connections.</p>
         * 
         * <strong>example:</strong>
         * <p>159</p>
         */
        public Builder actConns(Long actConns) {
            this.actConns = actConns;
            return this;
        }

        /**
         * <p>The number of concurrent connections.</p>
         * 
         * <strong>example:</strong>
         * <p>46340</p>
         */
        public Builder conns(Long conns) {
            this.conns = conns;
            return this;
        }

        /**
         * <p>The number of new connections.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder cps(Long cps) {
            this.cps = cps;
            return this;
        }

        /**
         * <p>The number of inactive connections.</p>
         * 
         * <strong>example:</strong>
         * <p>121</p>
         */
        public Builder inActConns(Long inActConns) {
            this.inActConns = inActConns;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>48859E14-A9FB-4100-99FF-AAB75CA46776</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePortConnsCountResponseBody build() {
            return new DescribePortConnsCountResponseBody(this);
        } 

    } 

}
