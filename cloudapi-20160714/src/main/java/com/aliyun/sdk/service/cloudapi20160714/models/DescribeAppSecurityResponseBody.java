// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link DescribeAppSecurityResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppSecurityResponseBody</p>
 */
public class DescribeAppSecurityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppCode")
    private String appCode;

    @com.aliyun.core.annotation.NameInMap("AppKey")
    private String appKey;

    @com.aliyun.core.annotation.NameInMap("AppSecret")
    private String appSecret;

    @com.aliyun.core.annotation.NameInMap("CreatedTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("ModifiedTime")
    private String modifiedTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAppSecurityResponseBody(Builder builder) {
        this.appCode = builder.appCode;
        this.appKey = builder.appKey;
        this.appSecret = builder.appSecret;
        this.createdTime = builder.createdTime;
        this.modifiedTime = builder.modifiedTime;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppSecurityResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appCode
     */
    public String getAppCode() {
        return this.appCode;
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return appSecret
     */
    public String getAppSecret() {
        return this.appSecret;
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return modifiedTime
     */
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String appCode; 
        private String appKey; 
        private String appSecret; 
        private String createdTime; 
        private String modifiedTime; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAppSecurityResponseBody model) {
            this.appCode = model.appCode;
            this.appKey = model.appKey;
            this.appSecret = model.appSecret;
            this.createdTime = model.createdTime;
            this.modifiedTime = model.modifiedTime;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The AppCode of the app.</p>
         * 
         * <strong>example:</strong>
         * <p>3aaf905a0a1f4f0eabc6d891dfa08afc</p>
         */
        public Builder appCode(String appCode) {
            this.appCode = appCode;
            return this;
        }

        /**
         * <p>The key of the app.</p>
         * 
         * <strong>example:</strong>
         * <p>60030986</p>
         */
        public Builder appKey(String appKey) {
            this.appKey = appKey;
            return this;
        }

        /**
         * <p>The password of the app.</p>
         * 
         * <strong>example:</strong>
         * <p>c1ae97aaa7e45f21d10824bc44678fee</p>
         */
        public Builder appSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }

        /**
         * <p>The creation time (UTC) of the key, which is the same as the app creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-07-31T04:10:19Z</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>The modification time (UTC) of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-07-31T04:10:19Z</p>
         */
        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ015</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAppSecurityResponseBody build() {
            return new DescribeAppSecurityResponseBody(this);
        } 

    } 

}
