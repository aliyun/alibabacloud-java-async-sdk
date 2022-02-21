// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExternalStreamURLResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExternalStreamURLResponseBody</p>
 */
public class DescribeExternalStreamURLResponseBody extends TeaModel {
    @NameInMap("Ip")
    private String ip;

    @NameInMap("OutProtocol")
    private String outProtocol;

    @NameInMap("Port")
    private Long port;

    @NameInMap("Profile")
    private String profile;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TxId")
    private String txId;

    @NameInMap("Url")
    private String url;

    private DescribeExternalStreamURLResponseBody(Builder builder) {
        this.ip = builder.ip;
        this.outProtocol = builder.outProtocol;
        this.port = builder.port;
        this.profile = builder.profile;
        this.requestId = builder.requestId;
        this.txId = builder.txId;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExternalStreamURLResponseBody create() {
        return builder().build();
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return outProtocol
     */
    public String getOutProtocol() {
        return this.outProtocol;
    }

    /**
     * @return port
     */
    public Long getPort() {
        return this.port;
    }

    /**
     * @return profile
     */
    public String getProfile() {
        return this.profile;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return txId
     */
    public String getTxId() {
        return this.txId;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String ip; 
        private String outProtocol; 
        private Long port; 
        private String profile; 
        private String requestId; 
        private String txId; 
        private String url; 

        /**
         * Ip.
         */
        public Builder ip(String ip) {
            this.ip = ip;
            return this;
        }

        /**
         * OutProtocol.
         */
        public Builder outProtocol(String outProtocol) {
            this.outProtocol = outProtocol;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(Long port) {
            this.port = port;
            return this;
        }

        /**
         * Profile.
         */
        public Builder profile(String profile) {
            this.profile = profile;
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
         * TxId.
         */
        public Builder txId(String txId) {
            this.txId = txId;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public DescribeExternalStreamURLResponseBody build() {
            return new DescribeExternalStreamURLResponseBody(this);
        } 

    } 

}
