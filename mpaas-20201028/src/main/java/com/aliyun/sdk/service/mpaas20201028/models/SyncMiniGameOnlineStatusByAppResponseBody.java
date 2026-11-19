// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

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
 * {@link SyncMiniGameOnlineStatusByAppResponseBody} extends {@link TeaModel}
 *
 * <p>SyncMiniGameOnlineStatusByAppResponseBody</p>
 */
public class SyncMiniGameOnlineStatusByAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultMsg")
    private String resultMsg;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private SyncMiniGameOnlineStatusByAppResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.content = builder.content;
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.resultMsg = builder.resultMsg;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncMiniGameOnlineStatusByAppResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultMsg
     */
    public String getResultMsg() {
        return this.resultMsg;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Content content; 
        private String errorCode; 
        private String requestId; 
        private String resultMsg; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(SyncMiniGameOnlineStatusByAppResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.content = model.content;
            this.errorCode = model.errorCode;
            this.requestId = model.requestId;
            this.resultMsg = model.resultMsg;
            this.success = model.success;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultMsg.
         */
        public Builder resultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SyncMiniGameOnlineStatusByAppResponseBody build() {
            return new SyncMiniGameOnlineStatusByAppResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SyncMiniGameOnlineStatusByAppResponseBody} extends {@link TeaModel}
     *
     * <p>SyncMiniGameOnlineStatusByAppResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentOnlineStatus")
        private Integer currentOnlineStatus;

        @com.aliyun.core.annotation.NameInMap("MiniProgramCode")
        private String miniProgramCode;

        @com.aliyun.core.annotation.NameInMap("StatusChanged")
        private Boolean statusChanged;

        private Content(Builder builder) {
            this.currentOnlineStatus = builder.currentOnlineStatus;
            this.miniProgramCode = builder.miniProgramCode;
            this.statusChanged = builder.statusChanged;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return currentOnlineStatus
         */
        public Integer getCurrentOnlineStatus() {
            return this.currentOnlineStatus;
        }

        /**
         * @return miniProgramCode
         */
        public String getMiniProgramCode() {
            return this.miniProgramCode;
        }

        /**
         * @return statusChanged
         */
        public Boolean getStatusChanged() {
            return this.statusChanged;
        }

        public static final class Builder {
            private Integer currentOnlineStatus; 
            private String miniProgramCode; 
            private Boolean statusChanged; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.currentOnlineStatus = model.currentOnlineStatus;
                this.miniProgramCode = model.miniProgramCode;
                this.statusChanged = model.statusChanged;
            } 

            /**
             * CurrentOnlineStatus.
             */
            public Builder currentOnlineStatus(Integer currentOnlineStatus) {
                this.currentOnlineStatus = currentOnlineStatus;
                return this;
            }

            /**
             * MiniProgramCode.
             */
            public Builder miniProgramCode(String miniProgramCode) {
                this.miniProgramCode = miniProgramCode;
                return this;
            }

            /**
             * StatusChanged.
             */
            public Builder statusChanged(Boolean statusChanged) {
                this.statusChanged = statusChanged;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
