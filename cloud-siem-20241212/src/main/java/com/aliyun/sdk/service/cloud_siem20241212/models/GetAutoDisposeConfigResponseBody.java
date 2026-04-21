// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link GetAutoDisposeConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetAutoDisposeConfigResponseBody</p>
 */
public class GetAutoDisposeConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoDisposeConfig")
    private AutoDisposeConfig autoDisposeConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAutoDisposeConfigResponseBody(Builder builder) {
        this.autoDisposeConfig = builder.autoDisposeConfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAutoDisposeConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoDisposeConfig
     */
    public AutoDisposeConfig getAutoDisposeConfig() {
        return this.autoDisposeConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AutoDisposeConfig autoDisposeConfig; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAutoDisposeConfigResponseBody model) {
            this.autoDisposeConfig = model.autoDisposeConfig;
            this.requestId = model.requestId;
        } 

        /**
         * AutoDisposeConfig.
         */
        public Builder autoDisposeConfig(AutoDisposeConfig autoDisposeConfig) {
            this.autoDisposeConfig = autoDisposeConfig;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAutoDisposeConfigResponseBody build() {
            return new GetAutoDisposeConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAutoDisposeConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetAutoDisposeConfigResponseBody</p>
     */
    public static class AutoDisposeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoDecisionStatus")
        private String autoDecisionStatus;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        private AutoDisposeConfig(Builder builder) {
            this.autoDecisionStatus = builder.autoDecisionStatus;
            this.productCode = builder.productCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoDisposeConfig create() {
            return builder().build();
        }

        /**
         * @return autoDecisionStatus
         */
        public String getAutoDecisionStatus() {
            return this.autoDecisionStatus;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        public static final class Builder {
            private String autoDecisionStatus; 
            private String productCode; 

            private Builder() {
            } 

            private Builder(AutoDisposeConfig model) {
                this.autoDecisionStatus = model.autoDecisionStatus;
                this.productCode = model.productCode;
            } 

            /**
             * AutoDecisionStatus.
             */
            public Builder autoDecisionStatus(String autoDecisionStatus) {
                this.autoDecisionStatus = autoDecisionStatus;
                return this;
            }

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            public AutoDisposeConfig build() {
                return new AutoDisposeConfig(this);
            } 

        } 

    }
}
