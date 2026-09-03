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
         * AttributePassingSetting.
         */
        public Builder attributePassingSetting(AttributePassingSetting attributePassingSetting) {
            this.attributePassingSetting = attributePassingSetting;
            return this;
        }

        /**
         * RequestId.
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
             * SourceIdentityPassing.
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
