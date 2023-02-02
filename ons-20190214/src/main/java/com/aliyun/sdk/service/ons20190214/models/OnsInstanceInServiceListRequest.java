// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsInstanceInServiceListRequest} extends {@link RequestModel}
 *
 * <p>OnsInstanceInServiceListRequest</p>
 */
public class OnsInstanceInServiceListRequest extends Request {
    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    private OnsInstanceInServiceListRequest(Builder builder) {
        super(builder);
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsInstanceInServiceListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<OnsInstanceInServiceListRequest, Builder> {
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(OnsInstanceInServiceListRequest request) {
            super(request);
            this.tag = request.tag;
        } 

        /**
         * The list of tags that are attached to the instance. A maximum of 20 tags can be included in a list.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public OnsInstanceInServiceListRequest build() {
            return new OnsInstanceInServiceListRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        private String key;

        @NameInMap("Value")
        @Validation(required = true)
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

            /**
             * The key of a tag that is attached to the instances you want to query. This parameter is not required. If you configure this parameter, you must also configure the **Tag.N.Key** parameter.**** If you include the Key and Value parameters in a request, this operation queries only the instances that use the specified tags. If you do not include these parameters in a request, this operation queries all instances that you can access.
             * <p>
             * 
             * *   The value of this parameter cannot be an empty string.
             * *   The tag key can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of a tag that is attached to the instances you want to query. This parameter is not required. If you configure this parameter, you must also configure the **Tag.N.Key** parameter.**** If you include the Key and Value parameters in a request, this operation queries only the instances that use the specified tags. If you do not include these parameters in a request, this operation queries all instances that you can access.
             * <p>
             * 
             * *   The value of this parameter can be an empty string.
             * *   The tag key can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.
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
