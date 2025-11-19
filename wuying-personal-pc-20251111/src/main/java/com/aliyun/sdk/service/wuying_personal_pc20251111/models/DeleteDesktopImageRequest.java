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
 * {@link DeleteDesktopImageRequest} extends {@link RequestModel}
 *
 * <p>DeleteDesktopImageRequest</p>
 */
public class DeleteDesktopImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsCleanImageCode")
    private Boolean isCleanImageCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    private DeleteDesktopImageRequest(Builder builder) {
        super(builder);
        this.apiKey = builder.apiKey;
        this.imageId = builder.imageId;
        this.isCleanImageCode = builder.isCleanImageCode;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDesktopImageRequest create() {
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
     * @return isCleanImageCode
     */
    public Boolean getIsCleanImageCode() {
        return this.isCleanImageCode;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<DeleteDesktopImageRequest, Builder> {
        private String apiKey; 
        private String imageId; 
        private Boolean isCleanImageCode; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDesktopImageRequest request) {
            super(request);
            this.apiKey = request.apiKey;
            this.imageId = request.imageId;
            this.isCleanImageCode = request.isCleanImageCode;
            this.sessionId = request.sessionId;
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
         * <p>This parameter is required.</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * IsCleanImageCode.
         */
        public Builder isCleanImageCode(Boolean isCleanImageCode) {
            this.putQueryParameter("IsCleanImageCode", isCleanImageCode);
            this.isCleanImageCode = isCleanImageCode;
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

        @Override
        public DeleteDesktopImageRequest build() {
            return new DeleteDesktopImageRequest(this);
        } 

    } 

}
