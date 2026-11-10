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
 * {@link PushMessageToAndroidRequest} extends {@link RequestModel}
 *
 * <p>PushMessageToAndroidRequest</p>
 */
public class PushMessageToAndroidRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Body")
    @com.aliyun.core.annotation.Validation(required = true)
    private String body;

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

    private PushMessageToAndroidRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.body = builder.body;
        this.jobKey = builder.jobKey;
        this.storeOffline = builder.storeOffline;
        this.target = builder.target;
        this.targetValue = builder.targetValue;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushMessageToAndroidRequest create() {
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

    public static final class Builder extends Request.Builder<PushMessageToAndroidRequest, Builder> {
        private Long appKey; 
        private String body; 
        private String jobKey; 
        private Boolean storeOffline; 
        private String target; 
        private String targetValue; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(PushMessageToAndroidRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.body = request.body;
            this.jobKey = request.jobKey;
            this.storeOffline = request.storeOffline;
            this.target = request.target;
            this.targetValue = request.targetValue;
            this.title = request.title;
        } 

        /**
         * <p>The AppKey.</p>
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
         * <p>The content of the message.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my body</p>
         */
        public Builder body(String body) {
            this.putQueryParameter("Body", body);
            this.body = body;
            return this;
        }

        /**
         * <p>A custom ID for the push task. If \<code>JobKey\\</code> is not empty, this field is included in the receipt logs. For more information, see <a href="https://help.aliyun.com/document_detail/434651.html">Receipt logs</a>.</p>
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
         * <p>Specifies whether to store the message offline. The default value is false.</p>
         * <p>If you store the message and the user is offline, the message is sent again when the user comes online within the time-to-live (TTL) period. The default TTL is 72 hours.</p>
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
         * <p>The push target. Valid values:</p>
         * <ul>
         * <li><p><strong>DEVICE</strong>: Pushes messages to devices.</p>
         * </li>
         * <li><p><strong>ACCOUNT</strong>: Pushes messages to accounts.</p>
         * </li>
         * <li><p><strong>ALIAS</strong>: Pushes messages to aliases.</p>
         * </li>
         * <li><p><strong>TAG</strong>: Pushes messages to tags.</p>
         * </li>
         * <li><p><strong>ALL</strong>: Pushes messages to all devices.</p>
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
         * <p>Set this parameter based on the value of \<code>Target\\</code>. Use commas (,) to separate multiple values. If you exceed the limit, send the pushes in batches.</p>
         * <ul>
         * <li><p>If \<code>Target\\</code> is set to \<code>DEVICE\\</code>, specify device IDs. Example: <code>deviceid111,deviceid1111</code>. You can specify up to 1,000 device IDs.</p>
         * </li>
         * <li><p>If \<code>Target\\</code> is set to \<code>ACCOUNT\\</code>, specify account IDs. Example: <code>account111,account222</code>. You can specify up to 1,000 account IDs.</p>
         * </li>
         * <li><p>If \<code>Target\\</code> is set to \<code>ALIAS\\</code>, specify aliases. Example: <code>alias111,alias222</code>. You can specify up to 1,000 aliases.</p>
         * </li>
         * <li><p>If \<code>Target\\</code> is set to \<code>TAG\\</code>, you can specify one or more tags. For more information about the format, see <a href="https://help.aliyun.com/document_detail/434847.html">Tag format</a>.</p>
         * </li>
         * <li><p>If \<code>Target\\</code> is set to \<code>ALL\\</code>, set the value to <strong>all</strong>.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        public Builder targetValue(String targetValue) {
            this.putQueryParameter("TargetValue", targetValue);
            this.targetValue = targetValue;
            return this;
        }

        /**
         * <p>The title of the message.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my title</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public PushMessageToAndroidRequest build() {
            return new PushMessageToAndroidRequest(this);
        } 

    } 

}
