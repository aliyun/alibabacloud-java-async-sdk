// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link CreateKeyRequest} extends {@link RequestModel}
 *
 * <p>CreateKeyRequest</p>
 */
public class CreateKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DKMSInstanceId")
    private String DKMSInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableAutomaticRotation")
    private Boolean enableAutomaticRotation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeySpec")
    private String keySpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyUsage")
    private String keyUsage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Origin")
    private String origin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Policy")
    private String policy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtectionLevel")
    private String protectionLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RotationInterval")
    private String rotationInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    private CreateKeyRequest(Builder builder) {
        super(builder);
        this.DKMSInstanceId = builder.DKMSInstanceId;
        this.description = builder.description;
        this.enableAutomaticRotation = builder.enableAutomaticRotation;
        this.keySpec = builder.keySpec;
        this.keyUsage = builder.keyUsage;
        this.origin = builder.origin;
        this.policy = builder.policy;
        this.protectionLevel = builder.protectionLevel;
        this.rotationInterval = builder.rotationInterval;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DKMSInstanceId
     */
    public String getDKMSInstanceId() {
        return this.DKMSInstanceId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enableAutomaticRotation
     */
    public Boolean getEnableAutomaticRotation() {
        return this.enableAutomaticRotation;
    }

    /**
     * @return keySpec
     */
    public String getKeySpec() {
        return this.keySpec;
    }

    /**
     * @return keyUsage
     */
    public String getKeyUsage() {
        return this.keyUsage;
    }

    /**
     * @return origin
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return protectionLevel
     */
    public String getProtectionLevel() {
        return this.protectionLevel;
    }

    /**
     * @return rotationInterval
     */
    public String getRotationInterval() {
        return this.rotationInterval;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<CreateKeyRequest, Builder> {
        private String DKMSInstanceId; 
        private String description; 
        private Boolean enableAutomaticRotation; 
        private String keySpec; 
        private String keyUsage; 
        private String origin; 
        private String policy; 
        private String protectionLevel; 
        private String rotationInterval; 
        private String tags; 

        private Builder() {
            super();
        } 

        private Builder(CreateKeyRequest request) {
            super(request);
            this.DKMSInstanceId = request.DKMSInstanceId;
            this.description = request.description;
            this.enableAutomaticRotation = request.enableAutomaticRotation;
            this.keySpec = request.keySpec;
            this.keyUsage = request.keyUsage;
            this.origin = request.origin;
            this.policy = request.policy;
            this.protectionLevel = request.protectionLevel;
            this.rotationInterval = request.rotationInterval;
            this.tags = request.tags;
        } 

        /**
         * <p>The ID of the KMS instance.</p>
         * <blockquote>
         * <p>You must specify this parameter if you need to create a key for a KMS instance. If you need to create a default key of the CMK type, you do not need to specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>kst-bjj62d8f5e0sgtx8h****</p>
         */
        public Builder DKMSInstanceId(String DKMSInstanceId) {
            this.putQueryParameter("DKMSInstanceId", DKMSInstanceId);
            this.DKMSInstanceId = DKMSInstanceId;
            return this;
        }

        /**
         * <p>The description of the key.</p>
         * <p>The description can be 0 to 8,192 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>key description example</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic key rotation. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false (default)</li>
         * </ul>
         * <p>This parameter is valid only when the key belongs to an instance type that supports automatic rotation. For more information, see <a href="https://help.aliyun.com/document_detail/2358146.html">Key rotation</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableAutomaticRotation(Boolean enableAutomaticRotation) {
            this.putQueryParameter("EnableAutomaticRotation", enableAutomaticRotation);
            this.enableAutomaticRotation = enableAutomaticRotation;
            return this;
        }

        /**
         * <p>The key specification. The valid values vary based on the KMS instance type. For more information, see <a href="https://help.aliyun.com/document_detail/480159.html">Overview</a>.</p>
         * <blockquote>
         * <p>If you do not specify a value for this parameter, the default key specification is Aliyun_AES_256.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Aliyun_AES_256</p>
         */
        public Builder keySpec(String keySpec) {
            this.putQueryParameter("KeySpec", keySpec);
            this.keySpec = keySpec;
            return this;
        }

        /**
         * <p>The usage of the key. Valid values:</p>
         * <ul>
         * <li>ENCRYPT/DECRYPT</li>
         * <li>SIGN/VERIFY</li>
         * </ul>
         * <p>If the key supports signing and verification, the default value is SIGN/VERIFY. If the key does not support signing and verification, the default value is ENCRYPT/DECRYPT.</p>
         * 
         * <strong>example:</strong>
         * <p>ENCRYPT/DECRYPT</p>
         */
        public Builder keyUsage(String keyUsage) {
            this.putQueryParameter("KeyUsage", keyUsage);
            this.keyUsage = keyUsage;
            return this;
        }

        /**
         * <p>The key material origin. Valid values:</p>
         * <ul>
         * <li>Aliyun_KMS (default): KMS generates key material.</li>
         * <li>EXTERNAL: You import key material.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>The value of this parameter is case-sensitive.</li>
         * <li>Default keys of the customer master key (CMK) type support Aliyun_KMS and EXTERNAL. Keys in instances of the software key management type support only Aliyun_KMS. Keys in instances of the hardware key management type support Aliyun_KMS and EXTERNAL.</li>
         * <li>If you set Origin to EXTERNAL, you must import key material. For more information, see <a href="https://help.aliyun.com/document_detail/607841.html">Import key material into a symmetric key</a> or <a href="https://help.aliyun.com/document_detail/608827.html">Import key material into an asymmetric key</a>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Aliyun_KMS</p>
         */
        public Builder origin(String origin) {
            this.putQueryParameter("Origin", origin);
            this.origin = origin;
            return this;
        }

        /**
         * Policy.
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * <p>You do not need to specify this parameter. KMS sets a protection level for your key.</p>
         * <p>The protection level of the key. Valid values:</p>
         * <ul>
         * <li>SOFTWARE</li>
         * <li>HSM</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If DKMSInstanceId is specified, this parameter does not take effect. If your instance is an instance of the software key management type, set the value to SOFTWARE. If your instance is an instance of the hardware key management type, set the value to HSM.</li>
         * <li>If you do not specify DKMSInstanceId, we recommend that you do not specify this parameter. KMS sets a protection level for your key. If managed hardware security modules (HSMs) exist in the region of your KMS instance, set the value to HSM. If managed HSMs do not exist in the region of your KMS instance, set the value to SOFTWARE. For more information, see Managed HSM overview.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SOFTWARE</p>
         */
        public Builder protectionLevel(String protectionLevel) {
            this.putQueryParameter("ProtectionLevel", protectionLevel);
            this.protectionLevel = protectionLevel;
            return this;
        }

        /**
         * <p>The period of automatic key rotation. Format: integer[unit]. Unit: d (day), h (hour), m (minute), or s (second). For example, both 7d and 604800s represent a seven-day interval.</p>
         * <ul>
         * <li>For a default key, set the value to 365 days.</li>
         * <li>For a software-protected key, set a value that ranges from 7 to 365 days.</li>
         * <li>A hardware-protected key does not support automatic rotation.</li>
         * </ul>
         * <blockquote>
         * <p>If EnableAutomaticRotation is set to true, this parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>365d</p>
         */
        public Builder rotationInterval(String rotationInterval) {
            this.putQueryParameter("RotationInterval", rotationInterval);
            this.rotationInterval = rotationInterval;
            return this;
        }

        /**
         * <p>The tag that is added to the key. A tag consists of a key-value pair.</p>
         * <p>You can enter up to 20 tags. Enter multiple tags in the [{&quot;TagKey&quot;:&quot;key1&quot;,&quot;TagValue&quot;:&quot;value1&quot;},{&quot;TagKey&quot;:&quot;key2&quot;,&quot;TagValue&quot;:&quot;value2&quot;},..] format.</p>
         * <p>Each tag key or tag value can be up to 128 characters in length and can contain letters, digits, forward slashes (/), backslashes (), underscores (_), hyphens (-), periods (.), plus signs (+), equal signs (=), colons (:), and at signs (@).</p>
         * <blockquote>
         * <p>The tag key cannot start with aliyun or acs:.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;TagKey&quot;:&quot;disk-encryption&quot;,&quot;TagValue&quot;:&quot;true&quot;}]</p>
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public CreateKeyRequest build() {
            return new CreateKeyRequest(this);
        } 

    } 

}
