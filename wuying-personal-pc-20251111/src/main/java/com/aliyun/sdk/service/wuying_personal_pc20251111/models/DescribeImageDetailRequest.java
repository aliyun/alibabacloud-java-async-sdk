// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wuying_personal_pc20251111.models;

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
 * {@link DescribeImageDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageDetailRequest</p>
 */
public class DescribeImageDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShareCode")
    private String shareCode;

    private DescribeImageDetailRequest(Builder builder) {
        super(builder);
        this.apiKey = builder.apiKey;
        this.imageId = builder.imageId;
        this.sessionId = builder.sessionId;
        this.shareCode = builder.shareCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return shareCode
     */
    public String getShareCode() {
        return this.shareCode;
    }

    public static final class Builder extends Request.Builder<DescribeImageDetailRequest, Builder> {
        private String apiKey; 
        private String imageId; 
        private String sessionId; 
        private String shareCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageDetailRequest request) {
            super(request);
            this.apiKey = request.apiKey;
            this.imageId = request.imageId;
            this.sessionId = request.sessionId;
            this.shareCode = request.shareCode;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder apiKey(String apiKey) {
            this.putQueryParameter("ApiKey", apiKey);
            this.apiKey = apiKey;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * ShareCode.
         */
        public Builder shareCode(String shareCode) {
            this.putQueryParameter("ShareCode", shareCode);
            this.shareCode = shareCode;
            return this;
        }

        @Override
        public DescribeImageDetailRequest build() {
            return new DescribeImageDetailRequest(this);
        } 

    } 

}
