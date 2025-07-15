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
 * {@link UpdateLiveStreamTranscodeRequest} extends {@link RequestModel}
 *
 * <p>UpdateLiveStreamTranscodeRequest</p>
 */
public class UpdateLiveStreamTranscodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("App")
    @com.aliyun.core.annotation.Validation(required = true)
    private String app;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptParameters")
    private String encryptParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lazy")
    private String lazy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Template")
    @com.aliyun.core.annotation.Validation(required = true)
    private String template;

    private UpdateLiveStreamTranscodeRequest(Builder builder) {
        super(builder);
        this.app = builder.app;
        this.domain = builder.domain;
        this.encryptParameters = builder.encryptParameters;
        this.lazy = builder.lazy;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.template = builder.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLiveStreamTranscodeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return app
     */
    public String getApp() {
        return this.app;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return encryptParameters
     */
    public String getEncryptParameters() {
        return this.encryptParameters;
    }

    /**
     * @return lazy
     */
    public String getLazy() {
        return this.lazy;
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
     * @return template
     */
    public String getTemplate() {
        return this.template;
    }

    public static final class Builder extends Request.Builder<UpdateLiveStreamTranscodeRequest, Builder> {
        private String app; 
        private String domain; 
        private String encryptParameters; 
        private String lazy; 
        private Long ownerId; 
        private String regionId; 
        private String template; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLiveStreamTranscodeRequest request) {
            super(request);
            this.app = request.app;
            this.domain = request.domain;
            this.encryptParameters = request.encryptParameters;
            this.lazy = request.lazy;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.template = request.template;
        } 

        /**
         * <p>The name of the application to which the stream belongs, and it cannot be modified.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>liveApp****</p>
         */
        public Builder app(String app) {
            this.putQueryParameter("App", app);
            this.app = app;
            return this;
        }

        /**
         * <p>Streamer domain name, not modifiable.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>The encryption configuration. The value is a JSON string. The following fields are included in the syntax:</p>
         * <ul>
         * <li>EncryptType: the type of the encryption. Set the value to <strong>aliyun</strong>.</li>
         * <li>KmsKeyID: the ID of the CMK in KMS.</li>
         * <li>KmsKeyExpireInterval: the validity period of the CMK. Valid values: <strong>60 to 3600</strong>. Unit: seconds.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;EncryptType&quot;: &quot;aliyun&quot;, &quot;KmsKeyID&quot;:&quot;afce5722-81d2-43c3-9930-7601da11****&quot;,&quot;KmsKeyExpireInterval&quot;:&quot;3600&quot;}</p>
         */
        public Builder encryptParameters(String encryptParameters) {
            this.putQueryParameter("EncryptParameters", encryptParameters);
            this.encryptParameters = encryptParameters;
            return this;
        }

        /**
         * <p>Specifies whether to enable triggered transcoding. Valid values:</p>
         * <ul>
         * <li><strong>yes</strong>: enables triggered transcoding.</li>
         * <li><strong>no</strong>: disables triggered transcoding.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>yes</p>
         */
        public Builder lazy(String lazy) {
            this.putQueryParameter("Lazy", lazy);
            this.lazy = lazy;
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
         * <p>Transcoding template, not modifiable.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lsd</p>
         */
        public Builder template(String template) {
            this.putQueryParameter("Template", template);
            this.template = template;
            return this;
        }

        @Override
        public UpdateLiveStreamTranscodeRequest build() {
            return new UpdateLiveStreamTranscodeRequest(this);
        } 

    } 

}
