// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetAuditResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetAuditResultResponseBody</p>
 */
public class GetAuditResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AIAuditResult")
    private AIAuditResult AIAuditResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAuditResultResponseBody(Builder builder) {
        this.AIAuditResult = builder.AIAuditResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuditResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIAuditResult
     */
    public AIAuditResult getAIAuditResult() {
        return this.AIAuditResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AIAuditResult AIAuditResult; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAuditResultResponseBody model) {
            this.AIAuditResult = model.AIAuditResult;
            this.requestId = model.requestId;
        } 

        /**
         * AIAuditResult.
         */
        public Builder AIAuditResult(AIAuditResult AIAuditResult) {
            this.AIAuditResult = AIAuditResult;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAuditResultResponseBody build() {
            return new GetAuditResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAuditResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAuditResultResponseBody</p>
     */
    public static class AIAuditResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AbnormalModules")
        private String abnormalModules;

        @com.aliyun.core.annotation.NameInMap("CoverResult")
        private String coverResult;

        @com.aliyun.core.annotation.NameInMap("ImageResult")
        private String imageResult;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("PornResult")
        private String pornResult;

        @com.aliyun.core.annotation.NameInMap("TerrorismResult")
        private String terrorismResult;

        @com.aliyun.core.annotation.NameInMap("TitleResult")
        private String titleResult;

        private AIAuditResult(Builder builder) {
            this.abnormalModules = builder.abnormalModules;
            this.coverResult = builder.coverResult;
            this.imageResult = builder.imageResult;
            this.label = builder.label;
            this.pornResult = builder.pornResult;
            this.terrorismResult = builder.terrorismResult;
            this.titleResult = builder.titleResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AIAuditResult create() {
            return builder().build();
        }

        /**
         * @return abnormalModules
         */
        public String getAbnormalModules() {
            return this.abnormalModules;
        }

        /**
         * @return coverResult
         */
        public String getCoverResult() {
            return this.coverResult;
        }

        /**
         * @return imageResult
         */
        public String getImageResult() {
            return this.imageResult;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return pornResult
         */
        public String getPornResult() {
            return this.pornResult;
        }

        /**
         * @return terrorismResult
         */
        public String getTerrorismResult() {
            return this.terrorismResult;
        }

        /**
         * @return titleResult
         */
        public String getTitleResult() {
            return this.titleResult;
        }

        public static final class Builder {
            private String abnormalModules; 
            private String coverResult; 
            private String imageResult; 
            private String label; 
            private String pornResult; 
            private String terrorismResult; 
            private String titleResult; 

            private Builder() {
            } 

            private Builder(AIAuditResult model) {
                this.abnormalModules = model.abnormalModules;
                this.coverResult = model.coverResult;
                this.imageResult = model.imageResult;
                this.label = model.label;
                this.pornResult = model.pornResult;
                this.terrorismResult = model.terrorismResult;
                this.titleResult = model.titleResult;
            } 

            /**
             * AbnormalModules.
             */
            public Builder abnormalModules(String abnormalModules) {
                this.abnormalModules = abnormalModules;
                return this;
            }

            /**
             * CoverResult.
             */
            public Builder coverResult(String coverResult) {
                this.coverResult = coverResult;
                return this;
            }

            /**
             * ImageResult.
             */
            public Builder imageResult(String imageResult) {
                this.imageResult = imageResult;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * PornResult.
             */
            public Builder pornResult(String pornResult) {
                this.pornResult = pornResult;
                return this;
            }

            /**
             * TerrorismResult.
             */
            public Builder terrorismResult(String terrorismResult) {
                this.terrorismResult = terrorismResult;
                return this;
            }

            /**
             * TitleResult.
             */
            public Builder titleResult(String titleResult) {
                this.titleResult = titleResult;
                return this;
            }

            public AIAuditResult build() {
                return new AIAuditResult(this);
            } 

        } 

    }
}
