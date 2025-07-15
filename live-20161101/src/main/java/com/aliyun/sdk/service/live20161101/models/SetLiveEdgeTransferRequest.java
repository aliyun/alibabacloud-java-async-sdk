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
 * {@link SetLiveEdgeTransferRequest} extends {@link RequestModel}
 *
 * <p>SetLiveEdgeTransferRequest</p>
 */
public class SetLiveEdgeTransferRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpDns")
    private String httpDns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamName")
    private String streamName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetDomainList")
    private String targetDomainList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransferArgs")
    private String transferArgs;

    private SetLiveEdgeTransferRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.domainName = builder.domainName;
        this.httpDns = builder.httpDns;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.streamName = builder.streamName;
        this.targetDomainList = builder.targetDomainList;
        this.transferArgs = builder.transferArgs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetLiveEdgeTransferRequest create() {
        return builder().build();
    }

@Override
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<SetLiveEdgeTransferRequest, Builder> {
        private String appName; 
        private String domainName; 
        private String httpDns; 
        private Long ownerId; 
        private String regionId; 
        private String streamName; 
        private String targetDomainList; 
        private String transferArgs; 

        private Builder() {
            super();
        } 

        private Builder(SetLiveEdgeTransferRequest request) {
            super(request);
            this.appName = request.appName;
            this.domainName = request.domainName;
            this.httpDns = request.httpDns;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.streamName = request.streamName;
            this.targetDomainList = request.targetDomainList;
            this.transferArgs = request.transferArgs;
        } 

        /**
         * <p>The name of the application to which the live stream belongs. Regular expressions are supported, with a few limits. For more information, see the <strong>Description about the AppName and StreamName parameters</strong> section. For example, a value of <strong>liveApp****[1,2,3]</strong> specifies that stream relay is configured for three applications: liveApp****1, liveApp****2, and liveApp****3.****</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter takes effect for only destination domain names that are specified by the TargetDomainList parameter.</p>
         * </li>
         * <li><p>You cannot use a caret (^) or a dollar sign ($) in a regular expression to configure the <code>AppName</code> parameter. Otherwise, stream relay fails.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>liveApp****</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The ingest domain. Stream relay is configured based on the ingest domain. Only one stream relay configuration can be set for an ingest domain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demo.aliyundoc.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The HTTPDNS API that is used to obtain the destination URLs. The request must contain the <code>TargetDomainList</code> parameter or the <code>HttpDns</code> parameter. The two parameters are mutually exclusive.</p>
         * <blockquote>
         * <p> If the <code>HttpDns</code> parameter is configured, you cannot configure the <code>TargetDomainList</code> parameter, and the <code>AppName</code> and <code>StreamName</code> parameters do not take effect.</p>
         * </blockquote>
         * <p>For information about the requirements on the structure of messages that are returned by the HTTPDNS API, see the <strong>Description about the HTTPDNS API</strong> section.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://developer.aliyundoc.com">http://developer.aliyundoc.com</a></p>
         */
        public Builder httpDns(String httpDns) {
            this.putQueryParameter("HttpDns", httpDns);
            this.httpDns = httpDns;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the ingested stream. Regular expressions are supported, with a few limits. For more information, see the <strong>Description about the AppName and StreamName parameters</strong> section. For example, a value of <strong>liveStream****[1,2,3]</strong> specifies that stream relay is configured for three streams: liveStream****1, liveStream****2, and liveStream****3.****</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter takes effect for only destination domain names that are specified by the TargetDomainList parameter.</p>
         * </li>
         * <li><p>You cannot use a caret (^) or a dollar sign ($) in a regular expression to configure the <code>StreamName</code> parameter. Otherwise, stream relay fails.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>liveStream****</p>
         */
        public Builder streamName(String streamName) {
            this.putQueryParameter("StreamName", streamName);
            this.streamName = streamName;
            return this;
        }

        /**
         * <p>The destination domain names to which you want to relay the ingested stream. Separate multiple domain names with commas (,). The request must contain the <code>TargetDomainList</code> parameter or the <code>HttpDns</code> parameter. The two parameters are mutually exclusive.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The <code>AppName</code> and <code>StreamName</code> parameters take effect only when the <code>TargetDomainList</code> parameter is configured.</p>
         * </li>
         * <li><p>If the <code>TargetDomainList</code> parameter is configured, you cannot configure the <code>HttpDns</code> parameter.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>learn.aliyundoc.com,guide.aliyundoc.com</p>
         */
        public Builder targetDomainList(String targetDomainList) {
            this.putQueryParameter("TargetDomainList", targetDomainList);
            this.targetDomainList = targetDomainList;
            return this;
        }

        /**
         * <p>Specifies whether to pass through stream ingest parameters. Valid values:</p>
         * <ul>
         * <li><strong>yes</strong>: passes through stream ingest parameters.</li>
         * <li><strong>no</strong>: does not pass through stream ingest parameters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>yes</p>
         */
        public Builder transferArgs(String transferArgs) {
            this.putQueryParameter("TransferArgs", transferArgs);
            this.transferArgs = transferArgs;
            return this;
        }

        @Override
        public SetLiveEdgeTransferRequest build() {
            return new SetLiveEdgeTransferRequest(this);
        } 

    } 

}
