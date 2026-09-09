// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link SetVsStreamsNotifyUrlConfigRequest} extends {@link RequestModel}
 *
 * <p>SetVsStreamsNotifyUrlConfigRequest</p>
 */
public class SetVsStreamsNotifyUrlConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthKey")
    private String authKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthType")
    private String authType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotifyUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String notifyUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    private SetVsStreamsNotifyUrlConfigRequest(Builder builder) {
        super(builder);
        this.authKey = builder.authKey;
        this.authType = builder.authType;
        this.domainName = builder.domainName;
        this.notifyUrl = builder.notifyUrl;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetVsStreamsNotifyUrlConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authKey
     */
    public String getAuthKey() {
        return this.authKey;
    }

    /**
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return notifyUrl
     */
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<SetVsStreamsNotifyUrlConfigRequest, Builder> {
        private String authKey; 
        private String authType; 
        private String domainName; 
        private String notifyUrl; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(SetVsStreamsNotifyUrlConfigRequest request) {
            super(request);
            this.authKey = request.authKey;
            this.authType = request.authType;
            this.domainName = request.domainName;
            this.notifyUrl = request.notifyUrl;
            this.ownerId = request.ownerId;
        } 

        /**
         * <p>The primary key associated with the playback domain name. This key generates authenticated URLs.</p>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/464513.html">DescribeVsDomainConfigs</a> operation to query the AuthKey value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ocs*****ace</p>
         */
        public Builder authKey(String authKey) {
            this.putQueryParameter("AuthKey", authKey);
            this.authKey = authKey;
            return this;
        }

        /**
         * <p>The authentication type. Valid values:</p>
         * <ul>
         * <li><p><strong>no_auth</strong> (disabled)</p>
         * </li>
         * <li><p><strong>type_a</strong> (method A)</p>
         * </li>
         * <li><p><strong>type_b</strong> (method B)</p>
         * </li>
         * <li><p><strong>type_c</strong> (method C)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>type_a</p>
         */
        public Builder authType(String authType) {
            this.putQueryParameter("AuthType", authType);
            this.authType = authType;
            return this;
        }

        /**
         * <p>Your accelerated domain name.</p>
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
         * <p>The URL to which live stream information is pushed.</p>
         * <blockquote>
         * <p>This URL must start with http\:// or https\://.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxx.com/xx">http://xxx.com/xx</a></p>
         */
        public Builder notifyUrl(String notifyUrl) {
            this.putQueryParameter("NotifyUrl", notifyUrl);
            this.notifyUrl = notifyUrl;
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

        @Override
        public SetVsStreamsNotifyUrlConfigRequest build() {
            return new SetVsStreamsNotifyUrlConfigRequest(this);
        } 

    } 

}
