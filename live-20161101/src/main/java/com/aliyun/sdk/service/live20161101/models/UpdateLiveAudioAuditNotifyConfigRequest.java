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
 * {@link UpdateLiveAudioAuditNotifyConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateLiveAudioAuditNotifyConfigRequest</p>
 */
public class UpdateLiveAudioAuditNotifyConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Callback")
    private String callback;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackTemplate")
    private String callbackTemplate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private UpdateLiveAudioAuditNotifyConfigRequest(Builder builder) {
        super(builder);
        this.callback = builder.callback;
        this.callbackTemplate = builder.callbackTemplate;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLiveAudioAuditNotifyConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callback
     */
    public String getCallback() {
        return this.callback;
    }

    /**
     * @return callbackTemplate
     */
    public String getCallbackTemplate() {
        return this.callbackTemplate;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateLiveAudioAuditNotifyConfigRequest, Builder> {
        private String callback; 
        private String callbackTemplate; 
        private String domainName; 
        private Long ownerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLiveAudioAuditNotifyConfigRequest request) {
            super(request);
            this.callback = request.callback;
            this.callbackTemplate = request.callbackTemplate;
            this.domainName = request.domainName;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The callback URL. This URL is used to receive callback notifications about violations in audio.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://guide.aliyundoc.com/callback">http://guide.aliyundoc.com/callback</a></p>
         */
        public Builder callback(String callback) {
            this.putQueryParameter("Callback", callback);
            this.callback = callback;
            return this;
        }

        /**
         * <p>The callback template. Configure the following fields:</p>
         * <ul>
         * <li><strong>{DomainName}</strong>: the streaming domain.</li>
         * <li><strong>{AppName}</strong>: the name of the application to which the live stream belongs.</li>
         * <li><strong>{StreamName}</strong>: the name of the live stream.</li>
         * <li><strong>{Timestamp}</strong>: the time when the callback is returned. The value of this field is a UNIX timestamp. Unit: seconds.</li>
         * <li><strong>{Result}</strong>: the moderation results.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;domain&quot;:{DomainName},&quot;app&quot;:{AppName},&quot;stream&quot;:{StreamName},&quot;timestamp&quot;:{Timestamp},&quot;result&quot;:{Result}}</p>
         */
        public Builder callbackTemplate(String callbackTemplate) {
            this.putQueryParameter("CallbackTemplate", callbackTemplate);
            this.callbackTemplate = callbackTemplate;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateLiveAudioAuditNotifyConfigRequest build() {
            return new UpdateLiveAudioAuditNotifyConfigRequest(this);
        } 

    } 

}
