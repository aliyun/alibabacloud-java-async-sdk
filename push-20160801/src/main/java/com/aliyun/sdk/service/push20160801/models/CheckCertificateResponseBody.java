// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

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
 * {@link CheckCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>CheckCertificateResponseBody</p>
 */
public class CheckCertificateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Android")
    private Boolean android;

    @com.aliyun.core.annotation.NameInMap("DevelopmentCertInfo")
    private DevelopmentCertInfo developmentCertInfo;

    @com.aliyun.core.annotation.NameInMap("IOS")
    private Boolean IOS;

    @com.aliyun.core.annotation.NameInMap("ProductionCertInfo")
    private ProductionCertInfo productionCertInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckCertificateResponseBody(Builder builder) {
        this.android = builder.android;
        this.developmentCertInfo = builder.developmentCertInfo;
        this.IOS = builder.IOS;
        this.productionCertInfo = builder.productionCertInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckCertificateResponseBody create() {
        return builder().build();
    }

    /**
     * @return android
     */
    public Boolean getAndroid() {
        return this.android;
    }

    /**
     * @return developmentCertInfo
     */
    public DevelopmentCertInfo getDevelopmentCertInfo() {
        return this.developmentCertInfo;
    }

    /**
     * @return IOS
     */
    public Boolean getIOS() {
        return this.IOS;
    }

    /**
     * @return productionCertInfo
     */
    public ProductionCertInfo getProductionCertInfo() {
        return this.productionCertInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean android; 
        private DevelopmentCertInfo developmentCertInfo; 
        private Boolean IOS; 
        private ProductionCertInfo productionCertInfo; 
        private String requestId; 

        /**
         * Android.
         */
        public Builder android(Boolean android) {
            this.android = android;
            return this;
        }

        /**
         * DevelopmentCertInfo.
         */
        public Builder developmentCertInfo(DevelopmentCertInfo developmentCertInfo) {
            this.developmentCertInfo = developmentCertInfo;
            return this;
        }

        /**
         * IOS.
         */
        public Builder IOS(Boolean IOS) {
            this.IOS = IOS;
            return this;
        }

        /**
         * ProductionCertInfo.
         */
        public Builder productionCertInfo(ProductionCertInfo productionCertInfo) {
            this.productionCertInfo = productionCertInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckCertificateResponseBody build() {
            return new CheckCertificateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckCertificateResponseBody} extends {@link TeaModel}
     *
     * <p>CheckCertificateResponseBody</p>
     */
    public static class DevelopmentCertInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExipreTime")
        private Long exipreTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DevelopmentCertInfo(Builder builder) {
            this.exipreTime = builder.exipreTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DevelopmentCertInfo create() {
            return builder().build();
        }

        /**
         * @return exipreTime
         */
        public Long getExipreTime() {
            return this.exipreTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long exipreTime; 
            private String status; 

            /**
             * ExipreTime.
             */
            public Builder exipreTime(Long exipreTime) {
                this.exipreTime = exipreTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DevelopmentCertInfo build() {
                return new DevelopmentCertInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CheckCertificateResponseBody} extends {@link TeaModel}
     *
     * <p>CheckCertificateResponseBody</p>
     */
    public static class ProductionCertInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExipreTime")
        private Long exipreTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ProductionCertInfo(Builder builder) {
            this.exipreTime = builder.exipreTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductionCertInfo create() {
            return builder().build();
        }

        /**
         * @return exipreTime
         */
        public Long getExipreTime() {
            return this.exipreTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long exipreTime; 
            private String status; 

            /**
             * ExipreTime.
             */
            public Builder exipreTime(Long exipreTime) {
                this.exipreTime = exipreTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ProductionCertInfo build() {
                return new ProductionCertInfo(this);
            } 

        } 

    }
}
