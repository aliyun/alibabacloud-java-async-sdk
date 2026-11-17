// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link DisableOutputItemShareResponseBody} extends {@link TeaModel}
 *
 * <p>DisableOutputItemShareResponseBody</p>
 */
public class DisableOutputItemShareResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("outputItemId")
    private String outputItemId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("shareAccessType")
    private String shareAccessType;

    @com.aliyun.core.annotation.NameInMap("shareEnabled")
    private Boolean shareEnabled;

    @com.aliyun.core.annotation.NameInMap("shareEnabledAt")
    private String shareEnabledAt;

    @com.aliyun.core.annotation.NameInMap("sharePath")
    private String sharePath;

    @com.aliyun.core.annotation.NameInMap("shareToken")
    private String shareToken;

    @com.aliyun.core.annotation.NameInMap("shareUrl")
    private String shareUrl;

    @com.aliyun.core.annotation.NameInMap("shareUserGroupIds")
    private java.util.List<String> shareUserGroupIds;

    @com.aliyun.core.annotation.NameInMap("shareUserIds")
    private java.util.List<Long> shareUserIds;

    private DisableOutputItemShareResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.outputItemId = builder.outputItemId;
        this.requestId = builder.requestId;
        this.shareAccessType = builder.shareAccessType;
        this.shareEnabled = builder.shareEnabled;
        this.shareEnabledAt = builder.shareEnabledAt;
        this.sharePath = builder.sharePath;
        this.shareToken = builder.shareToken;
        this.shareUrl = builder.shareUrl;
        this.shareUserGroupIds = builder.shareUserGroupIds;
        this.shareUserIds = builder.shareUserIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableOutputItemShareResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return outputItemId
     */
    public String getOutputItemId() {
        return this.outputItemId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return shareAccessType
     */
    public String getShareAccessType() {
        return this.shareAccessType;
    }

    /**
     * @return shareEnabled
     */
    public Boolean getShareEnabled() {
        return this.shareEnabled;
    }

    /**
     * @return shareEnabledAt
     */
    public String getShareEnabledAt() {
        return this.shareEnabledAt;
    }

    /**
     * @return sharePath
     */
    public String getSharePath() {
        return this.sharePath;
    }

    /**
     * @return shareToken
     */
    public String getShareToken() {
        return this.shareToken;
    }

    /**
     * @return shareUrl
     */
    public String getShareUrl() {
        return this.shareUrl;
    }

    /**
     * @return shareUserGroupIds
     */
    public java.util.List<String> getShareUserGroupIds() {
        return this.shareUserGroupIds;
    }

    /**
     * @return shareUserIds
     */
    public java.util.List<Long> getShareUserIds() {
        return this.shareUserIds;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String outputItemId; 
        private String requestId; 
        private String shareAccessType; 
        private Boolean shareEnabled; 
        private String shareEnabledAt; 
        private String sharePath; 
        private String shareToken; 
        private String shareUrl; 
        private java.util.List<String> shareUserGroupIds; 
        private java.util.List<Long> shareUserIds; 

        private Builder() {
        } 

        private Builder(DisableOutputItemShareResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.outputItemId = model.outputItemId;
            this.requestId = model.requestId;
            this.shareAccessType = model.shareAccessType;
            this.shareEnabled = model.shareEnabled;
            this.shareEnabledAt = model.shareEnabledAt;
            this.sharePath = model.sharePath;
            this.shareToken = model.shareToken;
            this.shareUrl = model.shareUrl;
            this.shareUserGroupIds = model.shareUserGroupIds;
            this.shareUserIds = model.shareUserIds;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid request parameters</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The output item ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleOutputItemId</p>
         */
        public Builder outputItemId(String outputItemId) {
            this.outputItemId = outputItemId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The most recently configured sharing scope.</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        public Builder shareAccessType(String shareAccessType) {
            this.shareAccessType = shareAccessType;
            return this;
        }

        /**
         * <p>Indicates whether sharing is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder shareEnabled(Boolean shareEnabled) {
            this.shareEnabled = shareEnabled;
            return this;
        }

        /**
         * <p>The time when sharing was most recently enabled, in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-16T13:00:00+00:00</p>
         */
        public Builder shareEnabledAt(String shareEnabledAt) {
            this.shareEnabledAt = shareEnabledAt;
            return this;
        }

        /**
         * <p>The relative path for internal sharing. This value is empty when sharing is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder sharePath(String sharePath) {
            this.sharePath = sharePath;
            return this;
        }

        /**
         * <p>The sharing token. This token exists when sharing is enabled and can be used to access the public sharing preview API operation.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder shareToken(String shareToken) {
            this.shareToken = shareToken;
            return this;
        }

        /**
         * <p>The current absolute sharing URL. This value is empty when sharing is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder shareUrl(String shareUrl) {
            this.shareUrl = shareUrl;
            return this;
        }

        /**
         * <p>The list of specified user group IDs from the most recent configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder shareUserGroupIds(java.util.List<String> shareUserGroupIds) {
            this.shareUserGroupIds = shareUserGroupIds;
            return this;
        }

        /**
         * <p>The list of specified user IDs from the most recent configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder shareUserIds(java.util.List<Long> shareUserIds) {
            this.shareUserIds = shareUserIds;
            return this;
        }

        public DisableOutputItemShareResponseBody build() {
            return new DisableOutputItemShareResponseBody(this);
        } 

    } 

}
