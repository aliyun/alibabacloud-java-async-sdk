// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link CreateLiveMessageAppResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLiveMessageAppResponseBody</p>
 */
public class CreateLiveMessageAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("AppKey")
    private String appKey;

    @com.aliyun.core.annotation.NameInMap("AppSign")
    private String appSign;

    @com.aliyun.core.annotation.NameInMap("DataCenter")
    private String dataCenter;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateLiveMessageAppResponseBody(Builder builder) {
        this.appId = builder.appId;
        this.appKey = builder.appKey;
        this.appSign = builder.appSign;
        this.dataCenter = builder.dataCenter;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLiveMessageAppResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return appSign
     */
    public String getAppSign() {
        return this.appSign;
    }

    /**
     * @return dataCenter
     */
    public String getDataCenter() {
        return this.dataCenter;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String appId; 
        private String appKey; 
        private String appSign; 
        private String dataCenter; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateLiveMessageAppResponseBody model) {
            this.appId = model.appId;
            this.appKey = model.appKey;
            this.appSign = model.appSign;
            this.dataCenter = model.dataCenter;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The application ID. The ID is used in subsequent operations, such as joining a group.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * <p>The AppKey for authentication of this application.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder appKey(String appKey) {
            this.appKey = appKey;
            return this;
        }

        /**
         * <p>The application signature. The signature is required when you use the interactive messaging SDK.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder appSign(String appSign) {
            this.appSign = appSign;
            return this;
        }

        /**
         * <p>The data center in which the interactive messaging application was created.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder dataCenter(String dataCenter) {
            this.dataCenter = dataCenter;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>65EEDBEB-43FE-1E15-976F-3DDD753A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateLiveMessageAppResponseBody build() {
            return new CreateLiveMessageAppResponseBody(this);
        } 

    } 

}
