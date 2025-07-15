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
 * {@link AddLiveStreamTranscodeRequest} extends {@link RequestModel}
 *
 * <p>AddLiveStreamTranscodeRequest</p>
 */
public class AddLiveStreamTranscodeRequest extends Request {
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

    private AddLiveStreamTranscodeRequest(Builder builder) {
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

    public static AddLiveStreamTranscodeRequest create() {
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

    public static final class Builder extends Request.Builder<AddLiveStreamTranscodeRequest, Builder> {
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

        private Builder(AddLiveStreamTranscodeRequest request) {
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
         * <p>The name of the application to which the live stream belongs.</p>
         * <ul>
         * <li>The transcoding template takes effect only if the value of this parameter is the same as the application name that is specified in the ingest URL. The name can be up to 256 characters in length and can contain digits, letters, hyphens (-), and underscores (_).</li>
         * <li>You can also set this parameter to an asterisk (*). Asterisks (*) can match any string, including an empty string.</li>
         * </ul>
         * <blockquote>
         * <p> If you configure a transcoding template for which App is set to an asterisk (*), the transcoding template is used only if no transcoding template for which App is set to the same value as AppName in the ingest URL exists.</p>
         * </blockquote>
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
         * <p>The name of the main streaming domain.</p>
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
         * <p>Specifies whether to use the load-on-demand mechanism for transcoding. Default value: <strong>yes</strong>.</p>
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
         * <p>The transcoding template. Valid values:</p>
         * <ul>
         * <li><p>Standard transcoding template:</p>
         * <ul>
         * <li><strong>lld</strong>: low definition</li>
         * <li><strong>lsd</strong>: standard definition</li>
         * <li><strong>lhd</strong>: high definition</li>
         * <li><strong>lud</strong>: ultra-high definition</li>
         * </ul>
         * </li>
         * <li><p>Narrowband HD™ transcoding template:</p>
         * <ul>
         * <li><strong>ld</strong>: low definition</li>
         * <li><strong>sd</strong>: standard definition</li>
         * <li><strong>hd</strong>: high definition</li>
         * <li><strong>ud</strong>: ultra-high definition</li>
         * </ul>
         * </li>
         * </ul>
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
        public AddLiveStreamTranscodeRequest build() {
            return new AddLiveStreamTranscodeRequest(this);
        } 

    } 

}
