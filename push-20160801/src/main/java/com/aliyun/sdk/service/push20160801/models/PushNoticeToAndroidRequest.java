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
 * {@link PushNoticeToAndroidRequest} extends {@link RequestModel}
 *
 * <p>PushNoticeToAndroidRequest</p>
 */
public class PushNoticeToAndroidRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Body")
    @com.aliyun.core.annotation.Validation(required = true)
    private String body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtParameters")
    private String extParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobKey")
    private String jobKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StoreOffline")
    private Boolean storeOffline;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Target")
    @com.aliyun.core.annotation.Validation(required = true)
    private String target;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetValue")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    private PushNoticeToAndroidRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.body = builder.body;
        this.extParameters = builder.extParameters;
        this.jobKey = builder.jobKey;
        this.storeOffline = builder.storeOffline;
        this.target = builder.target;
        this.targetValue = builder.targetValue;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushNoticeToAndroidRequest create() {
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
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return extParameters
     */
    public String getExtParameters() {
        return this.extParameters;
    }

    /**
     * @return jobKey
     */
    public String getJobKey() {
        return this.jobKey;
    }

    /**
     * @return storeOffline
     */
    public Boolean getStoreOffline() {
        return this.storeOffline;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * @return targetValue
     */
    public String getTargetValue() {
        return this.targetValue;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<PushNoticeToAndroidRequest, Builder> {
        private Long appKey; 
        private String body; 
        private String extParameters; 
        private String jobKey; 
        private Boolean storeOffline; 
        private String target; 
        private String targetValue; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(PushNoticeToAndroidRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.body = request.body;
            this.extParameters = request.extParameters;
            this.jobKey = request.jobKey;
            this.storeOffline = request.storeOffline;
            this.target = request.target;
            this.targetValue = request.targetValue;
            this.title = request.title;
        } 

        /**
         * <p>Your AppKey.</p>
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
         * <p>The body of the notification.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>body</p>
         */
        public Builder body(String body) {
            this.putQueryParameter("Body", body);
            this.body = body;
            return this;
        }

        /**
         * <p>Custom key-value pairs for Android-specific extensions. Pass this as a JSON object.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key1&quot;:&quot;value1&quot;,&quot;api_name&quot;:&quot;PushNoticeToAndroidRequest&quot;}</p>
         */
        public Builder extParameters(String extParameters) {
            this.putQueryParameter("ExtParameters", extParameters);
            this.extParameters = extParameters;
            return this;
        }

        /**
         * <p>A custom ID for the push task. If you specify a non-empty JobKey, it appears in the delivery receipt log. For more information, see <a href="https://help.aliyun.com/document_detail/434651.html">Delivery receipt logs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder jobKey(String jobKey) {
            this.putQueryParameter("JobKey", jobKey);
            this.jobKey = jobKey;
            return this;
        }

        /**
         * <p>Whether to store the notification for offline delivery. Default: false.</p>
         * <p>If enabled, the notification is redelivered when the user comes online within the time-to-live (TTL) period. Default TTL: 72 hours.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder storeOffline(Boolean storeOffline) {
            this.putQueryParameter("StoreOffline", storeOffline);
            this.storeOffline = storeOffline;
            return this;
        }

        /**
         * <p>The target of the push. Valid values:</p>
         * <ul>
         * <li><p><strong>DEVICE</strong>: Push to specific devices.</p>
         * </li>
         * <li><p><strong>ACCOUNT</strong>: Push to specific accounts.</p>
         * </li>
         * <li><p><strong>ALIAS</strong>: Push to users with specific aliases.</p>
         * </li>
         * <li><p><strong>TAG</strong>: Push to users with specific tags.</p>
         * </li>
         * <li><p><strong>ALL</strong>: Push to all devices.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        /**
         * <p>Set this based on the Target value. Separate multiple values with commas. If you exceed the limit, send multiple requests.</p>
         * <ul>
         * <li><p>If Target=DEVICE, use values such as <code>deviceid111,deviceid1111</code>. Maximum: 1000 devices.</p>
         * </li>
         * <li><p>If Target=ACCOUNT, use values such as <code>account111,account222</code>. Maximum: 1000 accounts.</p>
         * </li>
         * <li><p>If Target=ALIAS, use values such as <code>alias111,alias222</code>. Maximum: 1000 aliases.</p>
         * </li>
         * <li><p>If Target=TAG, support single or multiple tags. For format details, see <a href="https://help.aliyun.com/document_detail/434847.html">Tag format</a>.</p>
         * </li>
         * <li><p>If Target=ALL, set this to <strong>ALL</strong>.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        public Builder targetValue(String targetValue) {
            this.putQueryParameter("TargetValue", targetValue);
            this.targetValue = targetValue;
            return this;
        }

        /**
         * <p>The title of the notification.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>title</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public PushNoticeToAndroidRequest build() {
            return new PushNoticeToAndroidRequest(this);
        } 

    } 

}
