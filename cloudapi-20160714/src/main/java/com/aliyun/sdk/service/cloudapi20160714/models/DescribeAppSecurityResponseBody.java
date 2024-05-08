// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * The AppCode of the app.
         */
        public Builder appCode(String appCode) {
            this.appCode = appCode;
            return this;
        }

        /**
         * The key of the app.
         */
        public Builder appKey(String appKey) {
            this.appKey = appKey;
            return this;
        }

        /**
         * The password of the app.
         */
        public Builder appSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }

        /**
         * The creation time (UTC) of the key, which is the same as the app creation time.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * The modification time (UTC) of the key.
         */
        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * The ID of the request.
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
