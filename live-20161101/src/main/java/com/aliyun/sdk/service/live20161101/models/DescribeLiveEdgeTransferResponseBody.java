// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveEdgeTransferResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveEdgeTransferResponseBody</p>
 */
public class DescribeLiveEdgeTransferResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("HttpDns")
    private String httpDns;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StreamName")
    private String streamName;

    @com.aliyun.core.annotation.NameInMap("TargetDomainList")
    private String targetDomainList;

    @com.aliyun.core.annotation.NameInMap("TransferArgs")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeLiveEdgeTransferResponseBody model) {
            this.appName = model.appName;
            this.domainName = model.domainName;
            this.httpDns = model.httpDns;
            this.requestId = model.requestId;
            this.streamName = model.streamName;
            this.targetDomainList = model.targetDomainList;
            this.transferArgs = model.transferArgs;
        } 

        /**
         * <p>The name of the application to which the live stream belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>liveApp****</p>
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * <p>The ingest domain.</p>
         * 
         * <strong>example:</strong>
         * <p>demo.aliyundoc.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The HTTPDNS API that is used to obtain the destination URLs.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://developer.aliyundoc.com/">http://developer.aliyundoc.com/</a>****</p>
         */
        public Builder httpDns(String httpDns) {
            this.httpDns = httpDns;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>53FCB985-C67C-467B-B2B3-398430A21E14</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The name of the ingested stream.</p>
         * 
         * <strong>example:</strong>
         * <p>liveStream****</p>
         */
        public Builder streamName(String streamName) {
            this.streamName = streamName;
            return this;
        }

        /**
         * <p>The destination domain names to which the ingested stream is relayed. Multiple domain names are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>learn.aliyundoc.com,guide.aliyundoc.com</p>
         */
        public Builder targetDomainList(String targetDomainList) {
            this.targetDomainList = targetDomainList;
            return this;
        }

        /**
         * <p>Indicates whether stream ingest parameters are passed through. Valid values:</p>
         * <ul>
         * <li><strong>yes</strong>: Stream ingest parameters are passed through.</li>
         * <li><strong>no</strong>: Stream ingest parameters are not passed through.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>yes</p>
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
