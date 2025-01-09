// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link GetUserInformationResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserInformationResponseBody</p>
 */
public class GetUserInformationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeliverySettings")
    private DeliverySettings deliverySettings;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetUserInformationResponseBody(Builder builder) {
        this.deliverySettings = builder.deliverySettings;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserInformationResponseBody create() {
        return builder().build();
    }

    /**
     * @return deliverySettings
     */
    public DeliverySettings getDeliverySettings() {
        return this.deliverySettings;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DeliverySettings deliverySettings; 
        private String requestId; 

        /**
         * <p>The delivery settings.</p>
         */
        public Builder deliverySettings(DeliverySettings deliverySettings) {
            this.deliverySettings = deliverySettings;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>52EBAF16-22F6-53DB-AE1E-44764FC62AF0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetUserInformationResponseBody build() {
            return new GetUserInformationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserInformationResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserInformationResponseBody</p>
     */
    public static class DeliverySettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiontrailDeliveryToOssEnabled")
        private Boolean actiontrailDeliveryToOssEnabled;

        @com.aliyun.core.annotation.NameInMap("OssBucketName")
        private String ossBucketName;

        @com.aliyun.core.annotation.NameInMap("OssEnabled")
        private Boolean ossEnabled;

        @com.aliyun.core.annotation.NameInMap("OssExpirationDays")
        private Long ossExpirationDays;

        @com.aliyun.core.annotation.NameInMap("OssPath")
        private String ossPath;

        private DeliverySettings(Builder builder) {
            this.actiontrailDeliveryToOssEnabled = builder.actiontrailDeliveryToOssEnabled;
            this.ossBucketName = builder.ossBucketName;
            this.ossEnabled = builder.ossEnabled;
            this.ossExpirationDays = builder.ossExpirationDays;
            this.ossPath = builder.ossPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeliverySettings create() {
            return builder().build();
        }

        /**
         * @return actiontrailDeliveryToOssEnabled
         */
        public Boolean getActiontrailDeliveryToOssEnabled() {
            return this.actiontrailDeliveryToOssEnabled;
        }

        /**
         * @return ossBucketName
         */
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        /**
         * @return ossEnabled
         */
        public Boolean getOssEnabled() {
            return this.ossEnabled;
        }

        /**
         * @return ossExpirationDays
         */
        public Long getOssExpirationDays() {
            return this.ossExpirationDays;
        }

        /**
         * @return ossPath
         */
        public String getOssPath() {
            return this.ossPath;
        }

        public static final class Builder {
            private Boolean actiontrailDeliveryToOssEnabled; 
            private String ossBucketName; 
            private Boolean ossEnabled; 
            private Long ossExpirationDays; 
            private String ossPath; 

            /**
             * <p>Indicates whether screencast delivery to OSS is enabled. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder actiontrailDeliveryToOssEnabled(Boolean actiontrailDeliveryToOssEnabled) {
                this.actiontrailDeliveryToOssEnabled = actiontrailDeliveryToOssEnabled;
                return this;
            }

            /**
             * <p>The name of the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>0101data</p>
             */
            public Builder ossBucketName(String ossBucketName) {
                this.ossBucketName = ossBucketName;
                return this;
            }

            /**
             * <p>Indicates whether screencast delivery to Object Storage Service (OSS) is enabled. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ossEnabled(Boolean ossEnabled) {
                this.ossEnabled = ossEnabled;
                return this;
            }

            /**
             * <p>The number of days for which the screencasts are saved.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder ossExpirationDays(Long ossExpirationDays) {
                this.ossExpirationDays = ossExpirationDays;
                return this;
            }

            /**
             * <p>The OSS path.</p>
             * 
             * <strong>example:</strong>
             * <p>/test</p>
             */
            public Builder ossPath(String ossPath) {
                this.ossPath = ossPath;
                return this;
            }

            public DeliverySettings build() {
                return new DeliverySettings(this);
            } 

        } 

    }
}
