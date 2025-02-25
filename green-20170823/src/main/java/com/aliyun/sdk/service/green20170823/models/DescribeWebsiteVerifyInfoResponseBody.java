// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebsiteVerifyInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebsiteVerifyInfoResponseBody</p>
 */
public class DescribeWebsiteVerifyInfoResponseBody extends TeaModel {
    @NameInMap("Cname")
    private String cname;

    @NameInMap("Domain")
    private String domain;

    @NameInMap("HostFile")
    private String hostFile;

    @NameInMap("IndexPage")
    private String indexPage;

    @NameInMap("Protocol")
    private String protocol;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VerifyMethod")
    private String verifyMethod;

    private DescribeWebsiteVerifyInfoResponseBody(Builder builder) {
        this.cname = builder.cname;
        this.domain = builder.domain;
        this.hostFile = builder.hostFile;
        this.indexPage = builder.indexPage;
        this.protocol = builder.protocol;
        this.requestId = builder.requestId;
        this.verifyMethod = builder.verifyMethod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebsiteVerifyInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return cname
     */
    public String getCname() {
        return this.cname;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return hostFile
     */
    public String getHostFile() {
        return this.hostFile;
    }

    /**
     * @return indexPage
     */
    public String getIndexPage() {
        return this.indexPage;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return verifyMethod
     */
    public String getVerifyMethod() {
        return this.verifyMethod;
    }

    public static final class Builder {
        private String cname; 
        private String domain; 
        private String hostFile; 
        private String indexPage; 
        private String protocol; 
        private String requestId; 
        private String verifyMethod; 

        /**
         * Cname.
         */
        public Builder cname(String cname) {
            this.cname = cname;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * HostFile.
         */
        public Builder hostFile(String hostFile) {
            this.hostFile = hostFile;
            return this;
        }

        /**
         * IndexPage.
         */
        public Builder indexPage(String indexPage) {
            this.indexPage = indexPage;
            return this;
        }

        /**
         * Protocol.
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
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
         * VerifyMethod.
         */
        public Builder verifyMethod(String verifyMethod) {
            this.verifyMethod = verifyMethod;
            return this;
        }

        public DescribeWebsiteVerifyInfoResponseBody build() {
            return new DescribeWebsiteVerifyInfoResponseBody(this);
        } 

    } 

}
