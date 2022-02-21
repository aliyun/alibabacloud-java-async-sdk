// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveTranscodeInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveTranscodeInfoResponseBody</p>
 */
public class DescribeLiveTranscodeInfoResponseBody extends TeaModel {
    @NameInMap("DomainTranscodeList")
    private DomainTranscodeList domainTranscodeList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLiveTranscodeInfoResponseBody(Builder builder) {
        this.domainTranscodeList = builder.domainTranscodeList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveTranscodeInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainTranscodeList
     */
    public DomainTranscodeList getDomainTranscodeList() {
        return this.domainTranscodeList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DomainTranscodeList domainTranscodeList; 
        private String requestId; 

        /**
         * DomainTranscodeList.
         */
        public Builder domainTranscodeList(DomainTranscodeList domainTranscodeList) {
            this.domainTranscodeList = domainTranscodeList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveTranscodeInfoResponseBody build() {
            return new DescribeLiveTranscodeInfoResponseBody(this);
        } 

    } 

    public static class DomainTranscodeInfo extends TeaModel {
        @NameInMap("TranscodeApp")
        private String transcodeApp;

        @NameInMap("TranscodeName")
        private String transcodeName;

        @NameInMap("TranscodeTemplate")
        private String transcodeTemplate;

        private DomainTranscodeInfo(Builder builder) {
            this.transcodeApp = builder.transcodeApp;
            this.transcodeName = builder.transcodeName;
            this.transcodeTemplate = builder.transcodeTemplate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainTranscodeInfo create() {
            return builder().build();
        }

        /**
         * @return transcodeApp
         */
        public String getTranscodeApp() {
            return this.transcodeApp;
        }

        /**
         * @return transcodeName
         */
        public String getTranscodeName() {
            return this.transcodeName;
        }

        /**
         * @return transcodeTemplate
         */
        public String getTranscodeTemplate() {
            return this.transcodeTemplate;
        }

        public static final class Builder {
            private String transcodeApp; 
            private String transcodeName; 
            private String transcodeTemplate; 

            /**
             * TranscodeApp.
             */
            public Builder transcodeApp(String transcodeApp) {
                this.transcodeApp = transcodeApp;
                return this;
            }

            /**
             * TranscodeName.
             */
            public Builder transcodeName(String transcodeName) {
                this.transcodeName = transcodeName;
                return this;
            }

            /**
             * TranscodeTemplate.
             */
            public Builder transcodeTemplate(String transcodeTemplate) {
                this.transcodeTemplate = transcodeTemplate;
                return this;
            }

            public DomainTranscodeInfo build() {
                return new DomainTranscodeInfo(this);
            } 

        } 

    }
    public static class DomainTranscodeList extends TeaModel {
        @NameInMap("DomainTranscodeInfo")
        private java.util.List < DomainTranscodeInfo> domainTranscodeInfo;

        private DomainTranscodeList(Builder builder) {
            this.domainTranscodeInfo = builder.domainTranscodeInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainTranscodeList create() {
            return builder().build();
        }

        /**
         * @return domainTranscodeInfo
         */
        public java.util.List < DomainTranscodeInfo> getDomainTranscodeInfo() {
            return this.domainTranscodeInfo;
        }

        public static final class Builder {
            private java.util.List < DomainTranscodeInfo> domainTranscodeInfo; 

            /**
             * DomainTranscodeInfo.
             */
            public Builder domainTranscodeInfo(java.util.List < DomainTranscodeInfo> domainTranscodeInfo) {
                this.domainTranscodeInfo = domainTranscodeInfo;
                return this;
            }

            public DomainTranscodeList build() {
                return new DomainTranscodeList(this);
            } 

        } 

    }
}
