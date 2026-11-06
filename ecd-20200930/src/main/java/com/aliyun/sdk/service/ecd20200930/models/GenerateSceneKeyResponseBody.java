// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link GenerateSceneKeyResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateSceneKeyResponseBody</p>
 */
public class GenerateSceneKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BaseUrl")
    private String baseUrl;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SceneUrl")
    private String sceneUrl;

    private GenerateSceneKeyResponseBody(Builder builder) {
        this.baseUrl = builder.baseUrl;
        this.expireTime = builder.expireTime;
        this.key = builder.key;
        this.requestId = builder.requestId;
        this.sceneUrl = builder.sceneUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateSceneKeyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baseUrl
     */
    public String getBaseUrl() {
        return this.baseUrl;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sceneUrl
     */
    public String getSceneUrl() {
        return this.sceneUrl;
    }

    public static final class Builder {
        private String baseUrl; 
        private String expireTime; 
        private String key; 
        private String requestId; 
        private String sceneUrl; 

        private Builder() {
        } 

        private Builder(GenerateSceneKeyResponseBody model) {
            this.baseUrl = model.baseUrl;
            this.expireTime = model.expireTime;
            this.key = model.key;
            this.requestId = model.requestId;
            this.sceneUrl = model.sceneUrl;
        } 

        /**
         * <p>The Agent Gateway endpoint, which includes the cluster offset mapping port. This parameter is returned only for desktop scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-agent-cn-hangzhou.wuyinggw.com:18008</p>
         */
        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        /**
         * <p>The expiration time of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-13T12:00:00Z</p>
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>The scenario access key.</p>
         * 
         * <strong>example:</strong>
         * <p>sk-0123456789abcdef0123456789abcdef</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The scenario access URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://gw-example.cn-hangzhou.aigclinks.com:18008">https://gw-example.cn-hangzhou.aigclinks.com:18008</a></p>
         */
        public Builder sceneUrl(String sceneUrl) {
            this.sceneUrl = sceneUrl;
            return this;
        }

        public GenerateSceneKeyResponseBody build() {
            return new GenerateSceneKeyResponseBody(this);
        } 

    } 

}
