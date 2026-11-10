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
 * {@link PushMessageToiOSRequest} extends {@link RequestModel}
 *
 * <p>PushMessageToiOSRequest</p>
 */
public class PushMessageToiOSRequest extends Request {
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

    private PushMessageToiOSRequest(Builder builder) {
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

    public static PushMessageToiOSRequest create() {
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

    public static final class Builder extends Request.Builder<PushMessageToiOSRequest, Builder> {
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

        private Builder(PushMessageToiOSRequest request) {
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
         * <p>AppKey information.</p>
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
         * <p>The custom ID for the push Job. If JobKey is not empty, this field is included in the receipt log. For receipt logs, see <a href="https://help.aliyun.com/document_detail/434651.html">Receipt Logs</a>.</p>
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
         * <p>Whether to store the message offline. StoreOffline is set to false by default.</p>
         * <p>If stored, and the user is offline during the push, the message is sent again when the user comes online within the time-to-live (TTL). The default time-to-live (TTL) is 72 hours.</p>
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
         * <p>Push target. Valid values:</p>
         * <ul>
         * <li><p><strong>DEVICE</strong>: Push by device</p>
         * </li>
         * <li><p><strong>ACCOUNT</strong>: Push by account</p>
         * </li>
         * <li><p><strong>ALIAS</strong>: Push by alias</p>
         * </li>
         * <li><p><strong>TAG</strong>: Push by tag</p>
         * </li>
         * <li><p><strong>ALL</strong>: Push to all devices</p>
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
         * <p>Set based on Target. Separate multiple values with commas. If the limit is exceeded, push multiple times.</p>
         * <ul>
         * <li><p>Target=DEVICE. Example values: <code>deviceid111,deviceid1111</code> (supports up to 1,000).</p>
         * </li>
         * <li><p>Target=ACCOUNT. Example values: <code>account111,account222</code> (supports up to 1,000).</p>
         * </li>
         * <li><p>Target=ALIAS. Example values: <code>alias111,alias222</code> (supports up to 1,000).</p>
         * </li>
         * <li><p>Target=TAG. Supports single and multiple tags. For format, see <a href="https://help.aliyun.com/document_detail/434847.html">Tag Format</a>.</p>
         * </li>
         * <li><p>Target=ALL. Value is <strong>all</strong>.</p>
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
        public PushMessageToiOSRequest build() {
            return new PushMessageToiOSRequest(this);
        } 

    } 

}
