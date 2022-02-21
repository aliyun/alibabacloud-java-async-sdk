// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveAudioAuditNotifyConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveAudioAuditNotifyConfigResponseBody</p>
 */
public class DescribeLiveAudioAuditNotifyConfigResponseBody extends TeaModel {
    @NameInMap("LiveAudioAuditNotifyConfigList")
    private LiveAudioAuditNotifyConfigList liveAudioAuditNotifyConfigList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLiveAudioAuditNotifyConfigResponseBody(Builder builder) {
        this.liveAudioAuditNotifyConfigList = builder.liveAudioAuditNotifyConfigList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveAudioAuditNotifyConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return liveAudioAuditNotifyConfigList
     */
    public LiveAudioAuditNotifyConfigList getLiveAudioAuditNotifyConfigList() {
        return this.liveAudioAuditNotifyConfigList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LiveAudioAuditNotifyConfigList liveAudioAuditNotifyConfigList; 
        private String requestId; 

        /**
         * LiveAudioAuditNotifyConfigList.
         */
        public Builder liveAudioAuditNotifyConfigList(LiveAudioAuditNotifyConfigList liveAudioAuditNotifyConfigList) {
            this.liveAudioAuditNotifyConfigList = liveAudioAuditNotifyConfigList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveAudioAuditNotifyConfigResponseBody build() {
            return new DescribeLiveAudioAuditNotifyConfigResponseBody(this);
        } 

    } 

    public static class LiveAudioAuditNotifyConfig extends TeaModel {
        @NameInMap("Callback")
        private String callback;

        @NameInMap("CallbackTemplate")
        private String callbackTemplate;

        @NameInMap("DomainName")
        private String domainName;

        private LiveAudioAuditNotifyConfig(Builder builder) {
            this.callback = builder.callback;
            this.callbackTemplate = builder.callbackTemplate;
            this.domainName = builder.domainName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveAudioAuditNotifyConfig create() {
            return builder().build();
        }

        /**
         * @return callback
         */
        public String getCallback() {
            return this.callback;
        }

        /**
         * @return callbackTemplate
         */
        public String getCallbackTemplate() {
            return this.callbackTemplate;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        public static final class Builder {
            private String callback; 
            private String callbackTemplate; 
            private String domainName; 

            /**
             * Callback.
             */
            public Builder callback(String callback) {
                this.callback = callback;
                return this;
            }

            /**
             * CallbackTemplate.
             */
            public Builder callbackTemplate(String callbackTemplate) {
                this.callbackTemplate = callbackTemplate;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            public LiveAudioAuditNotifyConfig build() {
                return new LiveAudioAuditNotifyConfig(this);
            } 

        } 

    }
    public static class LiveAudioAuditNotifyConfigList extends TeaModel {
        @NameInMap("LiveAudioAuditNotifyConfig")
        private java.util.List < LiveAudioAuditNotifyConfig> liveAudioAuditNotifyConfig;

        private LiveAudioAuditNotifyConfigList(Builder builder) {
            this.liveAudioAuditNotifyConfig = builder.liveAudioAuditNotifyConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveAudioAuditNotifyConfigList create() {
            return builder().build();
        }

        /**
         * @return liveAudioAuditNotifyConfig
         */
        public java.util.List < LiveAudioAuditNotifyConfig> getLiveAudioAuditNotifyConfig() {
            return this.liveAudioAuditNotifyConfig;
        }

        public static final class Builder {
            private java.util.List < LiveAudioAuditNotifyConfig> liveAudioAuditNotifyConfig; 

            /**
             * LiveAudioAuditNotifyConfig.
             */
            public Builder liveAudioAuditNotifyConfig(java.util.List < LiveAudioAuditNotifyConfig> liveAudioAuditNotifyConfig) {
                this.liveAudioAuditNotifyConfig = liveAudioAuditNotifyConfig;
                return this;
            }

            public LiveAudioAuditNotifyConfigList build() {
                return new LiveAudioAuditNotifyConfigList(this);
            } 

        } 

    }
}
