// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link ModifyMobileAgentPackageRequest} extends {@link RequestModel}
 *
 * <p>ModifyMobileAgentPackageRequest</p>
 */
public class ModifyMobileAgentPackageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageId")
    private String packageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private ModifyMobileAgentPackageRequest(Builder builder) {
        super(builder);
        this.packageId = builder.packageId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyMobileAgentPackageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return packageId
     */
    public String getPackageId() {
        return this.packageId;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<ModifyMobileAgentPackageRequest, Builder> {
        private String packageId; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(ModifyMobileAgentPackageRequest request) {
            super(request);
            this.packageId = request.packageId;
            this.tag = request.tag;
        } 

        /**
         * <p>The package ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cmag-xxxx</p>
         */
        public Builder packageId(String packageId) {
            this.putQueryParameter("PackageId", packageId);
            this.packageId = packageId;
            return this;
        }

        /**
         * <p>The list of tags. You can specify 1 to 20 tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public ModifyMobileAgentPackageRequest build() {
            return new ModifyMobileAgentPackageRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyMobileAgentPackageRequest} extends {@link TeaModel}
     *
     * <p>ModifyMobileAgentPackageRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(maxLength = 128)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(maxLength = 256)
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key. If you specify this parameter, it cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>keyname</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. It can be an empty string. The tag value can be up to 128 characters in length and cannot start with acs:. It cannot contain http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
