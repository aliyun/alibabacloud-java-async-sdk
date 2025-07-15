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
 * {@link SetLiveLazyPullStreamInfoConfigRequest} extends {@link RequestModel}
 *
 * <p>SetLiveLazyPullStreamInfoConfigRequest</p>
 */
public class SetLiveLazyPullStreamInfoConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PullAppName")
    private String pullAppName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PullDomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pullDomainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PullProtocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pullProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TranscodeLazy")
    private String transcodeLazy;

    private SetLiveLazyPullStreamInfoConfigRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.pullAppName = builder.pullAppName;
        this.pullDomainName = builder.pullDomainName;
        this.pullProtocol = builder.pullProtocol;
        this.regionId = builder.regionId;
        this.transcodeLazy = builder.transcodeLazy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetLiveLazyPullStreamInfoConfigRequest create() {
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
     * @return pullAppName
     */
    public String getPullAppName() {
        return this.pullAppName;
    }

    /**
     * @return pullDomainName
     */
    public String getPullDomainName() {
        return this.pullDomainName;
    }

    /**
     * @return pullProtocol
     */
    public String getPullProtocol() {
        return this.pullProtocol;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return transcodeLazy
     */
    public String getTranscodeLazy() {
        return this.transcodeLazy;
    }

    public static final class Builder extends Request.Builder<SetLiveLazyPullStreamInfoConfigRequest, Builder> {
        private String appName; 
        private String domainName; 
        private Long ownerId; 
        private String pullAppName; 
        private String pullDomainName; 
        private String pullProtocol; 
        private String regionId; 
        private String transcodeLazy; 

        private Builder() {
            super();
        } 

        private Builder(SetLiveLazyPullStreamInfoConfigRequest request) {
            super(request);
            this.appName = request.appName;
            this.domainName = request.domainName;
            this.ownerId = request.ownerId;
            this.pullAppName = request.pullAppName;
            this.pullDomainName = request.pullDomainName;
            this.pullProtocol = request.pullProtocol;
            this.regionId = request.regionId;
            this.transcodeLazy = request.transcodeLazy;
        } 

        /**
         * <p>The name of the application to which the live stream belongs.</p>
         * <blockquote>
         * <p> If you want to configure triggered stream pulling for all applications, set the value to <strong>ali_all_app</strong>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ali_all_app</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The main streaming domain.</p>
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
         * <p>The name of the application for back-to-origin stream pulling.</p>
         * <blockquote>
         * <p> If you want to use the application specified in the streaming URL, leave this parameter empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>livePullApp****</p>
         */
        public Builder pullAppName(String pullAppName) {
            this.putQueryParameter("PullAppName", pullAppName);
            this.pullAppName = pullAppName;
            return this;
        }

        /**
         * <p>The origin server address of the live stream. Separate multiple addresses with semicolons (;).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>guide.aliyundoc.com</p>
         */
        public Builder pullDomainName(String pullDomainName) {
            this.putQueryParameter("PullDomainName", pullDomainName);
            this.pullDomainName = pullDomainName;
            return this;
        }

        /**
         * <p>The protocol for back-to-origin stream pulling. Valid values:</p>
         * <ul>
         * <li><strong>rtmp</strong></li>
         * <li><strong>httpflv</strong></li>
         * <li><strong>hls</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp</p>
         */
        public Builder pullProtocol(String pullProtocol) {
            this.putQueryParameter("PullProtocol", pullProtocol);
            this.pullProtocol = pullProtocol;
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
         * <p>Specifies whether to trigger stream pulling when the transcoded stream is played. The default value is <strong>no</strong>. Valid values:</p>
         * <ul>
         * <li><strong>yes</strong></li>
         * <li><strong>no</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>no</p>
         */
        public Builder transcodeLazy(String transcodeLazy) {
            this.putQueryParameter("TranscodeLazy", transcodeLazy);
            this.transcodeLazy = transcodeLazy;
            return this;
        }

        @Override
        public SetLiveLazyPullStreamInfoConfigRequest build() {
            return new SetLiveLazyPullStreamInfoConfigRequest(this);
        } 

    } 

}
