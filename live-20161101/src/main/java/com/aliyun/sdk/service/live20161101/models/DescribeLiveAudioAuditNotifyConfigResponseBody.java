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
 * {@link DescribeLiveAudioAuditNotifyConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveAudioAuditNotifyConfigResponseBody</p>
 */
public class DescribeLiveAudioAuditNotifyConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LiveAudioAuditNotifyConfigList")
    private LiveAudioAuditNotifyConfigList liveAudioAuditNotifyConfigList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeLiveAudioAuditNotifyConfigResponseBody model) {
            this.liveAudioAuditNotifyConfigList = model.liveAudioAuditNotifyConfigList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The configuration of callbacks for audio moderation results.</p>
         */
        public Builder liveAudioAuditNotifyConfigList(LiveAudioAuditNotifyConfigList liveAudioAuditNotifyConfigList) {
            this.liveAudioAuditNotifyConfigList = liveAudioAuditNotifyConfigList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B908FF89-B03C-4831-B55B-48D2A******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveAudioAuditNotifyConfigResponseBody build() {
            return new DescribeLiveAudioAuditNotifyConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveAudioAuditNotifyConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveAudioAuditNotifyConfigResponseBody</p>
     */
    public static class LiveAudioAuditNotifyConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Callback")
        private String callback;

        @com.aliyun.core.annotation.NameInMap("CallbackTemplate")
        private String callbackTemplate;

        @com.aliyun.core.annotation.NameInMap("DomainName")
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

            private Builder() {
            } 

            private Builder(LiveAudioAuditNotifyConfig model) {
                this.callback = model.callback;
                this.callbackTemplate = model.callbackTemplate;
                this.domainName = model.domainName;
            } 

            /**
             * <p>The callback URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://guide.aliyundoc.com/callback">http://guide.aliyundoc.com/callback</a></p>
             */
            public Builder callback(String callback) {
                this.callback = callback;
                return this;
            }

            /**
             * <p>The callback template. The following fields are configured:</p>
             * <ul>
             * <li><strong>{DomainName}</strong>: the streaming domain.</li>
             * <li><strong>{AppName}</strong>: the name of the application to which the live stream belongs.</li>
             * <li><strong>{StreamName}</strong>: the name of the live stream.</li>
             * <li><strong>{Timestamp}</strong>: the time when the callback is returned. The value of this field is a UNIX timestamp. Unit: seconds.</li>
             * <li><strong>{Result}</strong>: the moderation results.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;domain&quot;:{DomainName},&quot;app&quot;:{AppName},&quot;stream&quot;:{StreamName},&quot;timestamp&quot;:{Timestamp},&quot;result&quot;:{Result}}</p>
             */
            public Builder callbackTemplate(String callbackTemplate) {
                this.callbackTemplate = callbackTemplate;
                return this;
            }

            /**
             * <p>The main streaming domain.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
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
    /**
     * 
     * {@link DescribeLiveAudioAuditNotifyConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveAudioAuditNotifyConfigResponseBody</p>
     */
    public static class LiveAudioAuditNotifyConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LiveAudioAuditNotifyConfig")
        private java.util.List<LiveAudioAuditNotifyConfig> liveAudioAuditNotifyConfig;

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
        public java.util.List<LiveAudioAuditNotifyConfig> getLiveAudioAuditNotifyConfig() {
            return this.liveAudioAuditNotifyConfig;
        }

        public static final class Builder {
            private java.util.List<LiveAudioAuditNotifyConfig> liveAudioAuditNotifyConfig; 

            private Builder() {
            } 

            private Builder(LiveAudioAuditNotifyConfigList model) {
                this.liveAudioAuditNotifyConfig = model.liveAudioAuditNotifyConfig;
            } 

            /**
             * LiveAudioAuditNotifyConfig.
             */
            public Builder liveAudioAuditNotifyConfig(java.util.List<LiveAudioAuditNotifyConfig> liveAudioAuditNotifyConfig) {
                this.liveAudioAuditNotifyConfig = liveAudioAuditNotifyConfig;
                return this;
            }

            public LiveAudioAuditNotifyConfigList build() {
                return new LiveAudioAuditNotifyConfigList(this);
            } 

        } 

    }
}
