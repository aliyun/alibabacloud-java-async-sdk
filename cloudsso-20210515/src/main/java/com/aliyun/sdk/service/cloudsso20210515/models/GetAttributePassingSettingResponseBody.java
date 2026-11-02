// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

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
 * {@link GetAttributePassingSettingResponseBody} extends {@link TeaModel}
 *
 * <p>GetAttributePassingSettingResponseBody</p>
 */
public class GetAttributePassingSettingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AttributePassingSetting")
    private AttributePassingSetting attributePassingSetting;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAttributePassingSettingResponseBody(Builder builder) {
        this.attributePassingSetting = builder.attributePassingSetting;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAttributePassingSettingResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attributePassingSetting
     */
    public AttributePassingSetting getAttributePassingSetting() {
        return this.attributePassingSetting;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AttributePassingSetting attributePassingSetting; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAttributePassingSettingResponseBody model) {
            this.attributePassingSetting = model.attributePassingSetting;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The attribute passing settings.</p>
         */
        public Builder attributePassingSetting(AttributePassingSetting attributePassingSetting) {
            this.attributePassingSetting = attributePassingSetting;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F6F90F3D-4502-5877-B80B-97476F6AE2CC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAttributePassingSettingResponseBody build() {
            return new GetAttributePassingSettingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAttributePassingSettingResponseBody} extends {@link TeaModel}
     *
     * <p>GetAttributePassingSettingResponseBody</p>
     */
    public static class AttributePassingSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceIdentityPassing")
        private String sourceIdentityPassing;

        private AttributePassingSetting(Builder builder) {
            this.sourceIdentityPassing = builder.sourceIdentityPassing;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttributePassingSetting create() {
            return builder().build();
        }

        /**
         * @return sourceIdentityPassing
         */
        public String getSourceIdentityPassing() {
            return this.sourceIdentityPassing;
        }

        public static final class Builder {
            private String sourceIdentityPassing; 

            private Builder() {
            } 

            private Builder(AttributePassingSetting model) {
                this.sourceIdentityPassing = model.sourceIdentityPassing;
            } 

            /**
             * <p>The SourceIdentity pass-through mode. If not configured, Disabled is returned by default. Valid values:</p>
             * <ul>
             * <li>IdP: Uses the SourceIdentity attribute value carried in the SAML assertion from the external identity provider (IdP). The attribute value must be 2 to 64 characters in length and can contain only letters, digits, and the following special characters: =,.@-_.</li>
             * <li>UserName: Uses the CloudSSO username as the SourceIdentity. The system automatically adds a reserved prefix, resulting in the format acs:sso:<username>. The total length cannot exceed 64 characters.</li>
             * <li>Disabled: Does not pass through the SourceIdentity.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Disabled</p>
             */
            public Builder sourceIdentityPassing(String sourceIdentityPassing) {
                this.sourceIdentityPassing = sourceIdentityPassing;
                return this;
            }

            public AttributePassingSetting build() {
                return new AttributePassingSetting(this);
            } 

        } 

    }
}
