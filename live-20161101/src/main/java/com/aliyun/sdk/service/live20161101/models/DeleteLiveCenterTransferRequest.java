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
 * {@link DeleteLiveCenterTransferRequest} extends {@link RequestModel}
 *
 * <p>DeleteLiveCenterTransferRequest</p>
 */
public class DeleteLiveCenterTransferRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstUrl")
    private String dstUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String streamName;

    private DeleteLiveCenterTransferRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.domainName = builder.domainName;
        this.dstUrl = builder.dstUrl;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.streamName = builder.streamName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLiveCenterTransferRequest create() {
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
     * @return dstUrl
     */
    public String getDstUrl() {
        return this.dstUrl;
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

    public static final class Builder extends Request.Builder<DeleteLiveCenterTransferRequest, Builder> {
        private String appName; 
        private String domainName; 
        private String dstUrl; 
        private Long ownerId; 
        private String regionId; 
        private String streamName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLiveCenterTransferRequest request) {
            super(request);
            this.appName = request.appName;
            this.domainName = request.domainName;
            this.dstUrl = request.dstUrl;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.streamName = request.streamName;
        } 

        /**
         * <p>The name of the application to which the live stream belongs. The value of this parameter must be the same as the application name for the live stream that you want to relay. Otherwise, the configuration does not take effect. You can view the application name on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page of the ApsaraVideo Live console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testapp</p>
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
         * <p>The third-party URL to which the live stream is relayed.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://push.example2.aliyundoc.com/testapp1/teststream2</p>
         */
        public Builder dstUrl(String dstUrl) {
            this.putQueryParameter("DstUrl", dstUrl);
            this.dstUrl = dstUrl;
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
         * <p>The name of the live stream. You can view the stream name on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page of the ApsaraVideo Live console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>teststream</p>
         */
        public Builder streamName(String streamName) {
            this.putQueryParameter("StreamName", streamName);
            this.streamName = streamName;
            return this;
        }

        @Override
        public DeleteLiveCenterTransferRequest build() {
            return new DeleteLiveCenterTransferRequest(this);
        } 

    } 

}
