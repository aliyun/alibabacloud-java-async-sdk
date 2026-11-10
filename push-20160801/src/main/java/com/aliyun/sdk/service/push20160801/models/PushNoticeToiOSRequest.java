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
 * {@link PushNoticeToiOSRequest} extends {@link RequestModel}
 *
 * <p>PushNoticeToiOSRequest</p>
 */
public class PushNoticeToiOSRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApnsEnv")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apnsEnv;

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
    @com.aliyun.core.annotation.NameInMap("Target")
    @com.aliyun.core.annotation.Validation(required = true)
    private String target;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetValue")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    private PushNoticeToiOSRequest(Builder builder) {
        super(builder);
        this.apnsEnv = builder.apnsEnv;
        this.appKey = builder.appKey;
        this.body = builder.body;
        this.extParameters = builder.extParameters;
        this.jobKey = builder.jobKey;
        this.target = builder.target;
        this.targetValue = builder.targetValue;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushNoticeToiOSRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apnsEnv
     */
    public String getApnsEnv() {
        return this.apnsEnv;
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

    public static final class Builder extends Request.Builder<PushNoticeToiOSRequest, Builder> {
        private String apnsEnv; 
        private Long appKey; 
        private String body; 
        private String extParameters; 
        private String jobKey; 
        private String target; 
        private String targetValue; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(PushNoticeToiOSRequest request) {
            super(request);
            this.apnsEnv = request.apnsEnv;
            this.appKey = request.appKey;
            this.body = request.body;
            this.extParameters = request.extParameters;
            this.jobKey = request.jobKey;
            this.target = request.target;
            this.targetValue = request.targetValue;
            this.title = request.title;
        } 

        /**
         * <p>iOS notifications use Apple’s APNs service. Specify the environment.</p>
         * <ul>
         * <li><p>DEV: Development environment.</p>
         * </li>
         * <li><p>PRODUCT: Production environment.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        public Builder apnsEnv(String apnsEnv) {
            this.putQueryParameter("ApnsEnv", apnsEnv);
            this.apnsEnv = apnsEnv;
            return this;
        }

        /**
         * <p>Your AppKey.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>24780725</p>
         */
        public Builder appKey(Long appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * <p>The body text of the notification.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello World</p>
         */
        public Builder body(String body) {
            this.putQueryParameter("Body", body);
            this.body = body;
            return this;
        }

        /**
         * <p>A custom key-value map for developer extensions.</p>
         * <blockquote>
         * <p>For iOS devices, pass this parameter as a JSON object. Otherwise, parsing fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;k1&quot;:&quot;ios&quot;,&quot;k2&quot;:&quot;v2&quot;}</p>
         */
        public Builder extParameters(String extParameters) {
            this.putQueryParameter("ExtParameters", extParameters);
            this.extParameters = extParameters;
            return this;
        }

        /**
         * <p>A custom ID for the push task. If you specify a JobKey, the delivery log includes this field. For more information, see <a href="https://help.aliyun.com/document_detail/434651.html">Delivery logs</a>.</p>
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
         * <p>Values depend on the Target value. Separate multiple values with commas. If you exceed the limit, send multiple requests.</p>
         * <ul>
         * <li><p>If Target=DEVICE, use values such as <code>deviceid111,deviceid1111</code>. Maximum: 1000.</p>
         * </li>
         * <li><p>If Target=ACCOUNT, use values such as <code>account111,account222</code>. Maximum: 1000.</p>
         * </li>
         * <li><p>If Target=ALIAS, use values such as <code>alias111,alias222</code>. Maximum: 1000.</p>
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
         * <ul>
         * <li><p>iOS 10 and later: Displays as the notification title.</p>
         * </li>
         * <li><p>iOS 8.2 through iOS 9.x: Replaces the app name in the notification.</p>
         * </li>
         * </ul>
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
        public PushNoticeToiOSRequest build() {
            return new PushNoticeToiOSRequest(this);
        } 

    } 

}
