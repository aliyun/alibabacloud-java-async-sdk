// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link GetTrustedOriginResponseBody} extends {@link TeaModel}
 *
 * <p>GetTrustedOriginResponseBody</p>
 */
public class GetTrustedOriginResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TrustedOrigin")
    private TrustedOrigin trustedOrigin;

    private GetTrustedOriginResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.trustedOrigin = builder.trustedOrigin;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrustedOriginResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return trustedOrigin
     */
    public TrustedOrigin getTrustedOrigin() {
        return this.trustedOrigin;
    }

    public static final class Builder {
        private String requestId; 
        private TrustedOrigin trustedOrigin; 

        private Builder() {
        } 

        private Builder(GetTrustedOriginResponseBody model) {
            this.requestId = model.requestId;
            this.trustedOrigin = model.trustedOrigin;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TrustedOrigin.
         */
        public Builder trustedOrigin(TrustedOrigin trustedOrigin) {
            this.trustedOrigin = trustedOrigin;
            return this;
        }

        public GetTrustedOriginResponseBody build() {
            return new GetTrustedOriginResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTrustedOriginResponseBody} extends {@link TeaModel}
     *
     * <p>GetTrustedOriginResponseBody</p>
     */
    public static class TrustedOrigin extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Origin")
        private String origin;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TrustOriginName")
        private String trustOriginName;

        @com.aliyun.core.annotation.NameInMap("TrustedOriginId")
        private String trustedOriginId;

        @com.aliyun.core.annotation.NameInMap("TrustedOriginScene")
        private java.util.List<String> trustedOriginScene;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private TrustedOrigin(Builder builder) {
            this.createTime = builder.createTime;
            this.instanceId = builder.instanceId;
            this.origin = builder.origin;
            this.status = builder.status;
            this.trustOriginName = builder.trustOriginName;
            this.trustedOriginId = builder.trustedOriginId;
            this.trustedOriginScene = builder.trustedOriginScene;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrustedOrigin create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return origin
         */
        public String getOrigin() {
            return this.origin;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return trustOriginName
         */
        public String getTrustOriginName() {
            return this.trustOriginName;
        }

        /**
         * @return trustedOriginId
         */
        public String getTrustedOriginId() {
            return this.trustedOriginId;
        }

        /**
         * @return trustedOriginScene
         */
        public java.util.List<String> getTrustedOriginScene() {
            return this.trustedOriginScene;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String instanceId; 
            private String origin; 
            private String status; 
            private String trustOriginName; 
            private String trustedOriginId; 
            private java.util.List<String> trustedOriginScene; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(TrustedOrigin model) {
                this.createTime = model.createTime;
                this.instanceId = model.instanceId;
                this.origin = model.origin;
                this.status = model.status;
                this.trustOriginName = model.trustOriginName;
                this.trustedOriginId = model.trustedOriginId;
                this.trustedOriginScene = model.trustedOriginScene;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-20T08:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Origin.
             */
            public Builder origin(String origin) {
                this.origin = origin;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TrustOriginName.
             */
            public Builder trustOriginName(String trustOriginName) {
                this.trustOriginName = trustOriginName;
                return this;
            }

            /**
             * TrustedOriginId.
             */
            public Builder trustedOriginId(String trustedOriginId) {
                this.trustedOriginId = trustedOriginId;
                return this;
            }

            /**
             * TrustedOriginScene.
             */
            public Builder trustedOriginScene(java.util.List<String> trustedOriginScene) {
                this.trustedOriginScene = trustedOriginScene;
                return this;
            }

            /**
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-20T08:00:00Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public TrustedOrigin build() {
                return new TrustedOrigin(this);
            } 

        } 

    }
}
