// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OnsInstanceInServiceListRequest} extends {@link RequestModel}
 *
 * <p>OnsInstanceInServiceListRequest</p>
 */
public class OnsInstanceInServiceListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedResourceInfo")
    private Boolean needResourceInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    private OnsInstanceInServiceListRequest(Builder builder) {
        super(builder);
        this.needResourceInfo = builder.needResourceInfo;
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
     * @return needResourceInfo
     */
    public Boolean getNeedResourceInfo() {
        return this.needResourceInfo;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<OnsInstanceInServiceListRequest, Builder> {
        private Boolean needResourceInfo; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(OnsInstanceInServiceListRequest request) {
            super(request);
            this.needResourceInfo = request.needResourceInfo;
            this.tag = request.tag;
        } 

        /**
         * <p>Specifies whether you want the resource information to be returned.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder needResourceInfo(Boolean needResourceInfo) {
            this.putQueryParameter("NeedResourceInfo", needResourceInfo);
            this.needResourceInfo = needResourceInfo;
            return this;
        }

        /**
         * <p>The tags that you want to attach to the instance. You can attach up to 20 tags to the instance.</p>
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

    /**
     * 
     * {@link OnsInstanceInServiceListRequest} extends {@link TeaModel}
     *
     * <p>OnsInstanceInServiceListRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The tag key. This parameter is not required. If you configure this parameter, you must also configure <strong>Value</strong>.**** If you configure Key and Value in a request, this operation queries only the instances that use the specified tags. If you do not configure these parameters in a request, this operation queries all instances that you can access.</p>
             * <ul>
             * <li>The value of this parameter cannot be an empty string.</li>
             * <li>The tag key can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. The tag key cannot contain <code>http://</code> or <code>https://</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CartService</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. This parameter is not required. If you configure this parameter, you must also configure <strong>Key</strong>.**** If you configure Key and Value in a request, this operation queries only the instances that use the specified tags. If you do not configure these parameters in a request, this operation queries all instances that you can access.</p>
             * <ul>
             * <li>The value of this parameter can be an empty string.</li>
             * <li>The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag value cannot start with <code>acs:</code> or <code>aliyun</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SericeA</p>
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
