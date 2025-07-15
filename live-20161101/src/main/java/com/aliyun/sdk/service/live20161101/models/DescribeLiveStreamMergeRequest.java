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
 * {@link DescribeLiveStreamMergeRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveStreamMergeRequest</p>
 */
public class DescribeLiveStreamMergeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamName")
    private String streamName;

    private DescribeLiveStreamMergeRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.protocol = builder.protocol;
        this.regionId = builder.regionId;
        this.streamName = builder.streamName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamMergeRequest create() {
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
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

    public static final class Builder extends Request.Builder<DescribeLiveStreamMergeRequest, Builder> {
        private String appName; 
        private String domainName; 
        private Long ownerId; 
        private String protocol; 
        private String regionId; 
        private String streamName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveStreamMergeRequest request) {
            super(request);
            this.appName = request.appName;
            this.domainName = request.domainName;
            this.ownerId = request.ownerId;
            this.protocol = request.protocol;
            this.regionId = request.regionId;
            this.streamName = request.streamName;
        } 

        /**
         * <p>The name of the application that generates the output stream. You can view the application name on the <a href="https://help.aliyun.com/document_detail/606583.html">Primary/Secondary Stream Mixing Settings</a> page of the ApsaraVideo Live console.</p>
         * 
         * <strong>example:</strong>
         * <p>app</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The streaming domain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
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
         * <p>The streaming protocol. Valid values:</p>
         * <ul>
         * <li><strong>rtmp</strong>: This is the default value.</li>
         * <li><strong>rtc</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rtmp</p>
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
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
         * <p>The name of the output stream. You can view the stream name on the <a href="https://help.aliyun.com/document_detail/606583.html">Primary/Secondary Stream Mixing Settings</a> page of the ApsaraVideo Live console.</p>
         * 
         * <strong>example:</strong>
         * <p>StreamName</p>
         */
        public Builder streamName(String streamName) {
            this.putQueryParameter("StreamName", streamName);
            this.streamName = streamName;
            return this;
        }

        @Override
        public DescribeLiveStreamMergeRequest build() {
            return new DescribeLiveStreamMergeRequest(this);
        } 

    } 

}
