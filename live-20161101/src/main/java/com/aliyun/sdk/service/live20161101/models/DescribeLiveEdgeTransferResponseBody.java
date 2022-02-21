// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveEdgeTransferResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveEdgeTransferResponseBody</p>
 */
public class DescribeLiveEdgeTransferResponseBody extends TeaModel {
    @NameInMap("AppName")
    private String appName;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("HttpDns")
    private String httpDns;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StreamName")
    private String streamName;

    @NameInMap("TargetDomainList")
    private String targetDomainList;

    @NameInMap("TransferArgs")
    private String transferArgs;

    private DescribeLiveEdgeTransferResponseBody(Builder builder) {
        this.appName = builder.appName;
        this.domainName = builder.domainName;
        this.httpDns = builder.httpDns;
        this.requestId = builder.requestId;
        this.streamName = builder.streamName;
        this.targetDomainList = builder.targetDomainList;
        this.transferArgs = builder.transferArgs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveEdgeTransferResponseBody create() {
        return builder().build();
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return httpDns
     */
    public String getHttpDns() {
        return this.httpDns;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return streamName
     */
    public String getStreamName() {
        return this.streamName;
    }

    /**
     * @return targetDomainList
     */
    public String getTargetDomainList() {
        return this.targetDomainList;
    }

    /**
     * @return transferArgs
     */
    public String getTransferArgs() {
        return this.transferArgs;
    }

    public static final class Builder {
        private String appName; 
        private String domainName; 
        private String httpDns; 
        private String requestId; 
        private String streamName; 
        private String targetDomainList; 
        private String transferArgs; 

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * HttpDns.
         */
        public Builder httpDns(String httpDns) {
            this.httpDns = httpDns;
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
         * StreamName.
         */
        public Builder streamName(String streamName) {
            this.streamName = streamName;
            return this;
        }

        /**
         * TargetDomainList.
         */
        public Builder targetDomainList(String targetDomainList) {
            this.targetDomainList = targetDomainList;
            return this;
        }

        /**
         * TransferArgs.
         */
        public Builder transferArgs(String transferArgs) {
            this.transferArgs = transferArgs;
            return this;
        }

        public DescribeLiveEdgeTransferResponseBody build() {
            return new DescribeLiveEdgeTransferResponseBody(this);
        } 

    } 

}
