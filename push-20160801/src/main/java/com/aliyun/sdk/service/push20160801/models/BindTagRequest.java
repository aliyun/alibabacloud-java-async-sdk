// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

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
 * {@link BindTagRequest} extends {@link RequestModel}
 *
 * <p>BindTagRequest</p>
 */
public class BindTagRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tagName;

    private BindTagRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.clientKey = builder.clientKey;
        this.keyType = builder.keyType;
        this.tagName = builder.tagName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindTagRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public Long getAppKey() {
        return this.appKey;
    }

    /**
     * @return clientKey
     */
    public String getClientKey() {
        return this.clientKey;
    }

    /**
     * @return keyType
     */
    public String getKeyType() {
        return this.keyType;
    }

    /**
     * @return tagName
     */
    public String getTagName() {
        return this.tagName;
    }

    public static final class Builder extends Request.Builder<BindTagRequest, Builder> {
        private Long appKey; 
        private String clientKey; 
        private String keyType; 
        private String tagName; 

        private Builder() {
            super();
        } 

        private Builder(BindTagRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.clientKey = request.clientKey;
            this.keyType = request.keyType;
            this.tagName = request.tagName;
        } 

        /**
         * <p>The AppKey of your application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>23267207</p>
         */
        public Builder appKey(Long appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * <p>The ID of the target device. You can specify a maximum of 1,000 device IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e2ba19de97604f55b16557673****</p>
         */
        public Builder clientKey(String clientKey) {
            this.putQueryParameter("ClientKey", clientKey);
            this.clientKey = clientKey;
            return this;
        }

        /**
         * <p>The type of the <code>ClientKey</code>. Valid value:</p>
         * <ul>
         * <li><strong>DEVICE</strong>: Indicates a device target.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DEVICE</p>
         */
        public Builder keyType(String keyType) {
            this.putQueryParameter("KeyType", keyType);
            this.keyType = keyType;
            return this;
        }

        /**
         * <p>The tags to bind. Separate multiple tags with commas (,). You can bind up to 10 tags per request.
         * A tag name can be up to 128 characters long (each Chinese character counts as 1 character). Each application can have up to 10,000 tags. A single device can be bound to multiple tags.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>Do not bind a single tag to more than 100,000 devices. This practice can increase push processing time and increase response time.</p>
         * <ul>
         * <li><p>Use the full push feature to send notifications to all devices.</p>
         * </li>
         * <li><p>Split the device set into multiple fine-grained tags and call the push API in batches.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>If you attempt to bind the same tag multiple times, the system automatically removes the duplicates.</p>
         * </li>
         * <li><p>When a user uninstalls the application from a device, the tags associated with that device are automatically unbound. This unbinding process may be slightly delayed.</p>
         * </li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_tag,test_tag2</p>
         */
        public Builder tagName(String tagName) {
            this.putQueryParameter("TagName", tagName);
            this.tagName = tagName;
            return this;
        }

        @Override
        public BindTagRequest build() {
            return new BindTagRequest(this);
        } 

    } 

}
