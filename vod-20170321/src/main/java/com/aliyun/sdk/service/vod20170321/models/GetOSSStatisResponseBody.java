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
 * {@link GetOSSStatisResponseBody} extends {@link TeaModel}
 *
 * <p>GetOSSStatisResponseBody</p>
 */
public class GetOSSStatisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxStorageUtilization")
    private Long maxStorageUtilization;

    @com.aliyun.core.annotation.NameInMap("OssStatisList")
    private OssStatisList ossStatisList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetOSSStatisResponseBody(Builder builder) {
        this.maxStorageUtilization = builder.maxStorageUtilization;
        this.ossStatisList = builder.ossStatisList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOSSStatisResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxStorageUtilization
     */
    public Long getMaxStorageUtilization() {
        return this.maxStorageUtilization;
    }

    /**
     * @return ossStatisList
     */
    public OssStatisList getOssStatisList() {
        return this.ossStatisList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long maxStorageUtilization; 
        private OssStatisList ossStatisList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetOSSStatisResponseBody model) {
            this.maxStorageUtilization = model.maxStorageUtilization;
            this.ossStatisList = model.ossStatisList;
            this.requestId = model.requestId;
        } 

        /**
         * MaxStorageUtilization.
         */
        public Builder maxStorageUtilization(Long maxStorageUtilization) {
            this.maxStorageUtilization = maxStorageUtilization;
            return this;
        }

        /**
         * OssStatisList.
         */
        public Builder ossStatisList(OssStatisList ossStatisList) {
            this.ossStatisList = ossStatisList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetOSSStatisResponseBody build() {
            return new GetOSSStatisResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOSSStatisResponseBody} extends {@link TeaModel}
     *
     * <p>GetOSSStatisResponseBody</p>
     */
    public static class OSSMetric extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StatTime")
        private String statTime;

        @com.aliyun.core.annotation.NameInMap("StatTimeUTC")
        private String statTimeUTC;

        @com.aliyun.core.annotation.NameInMap("StorageUtilization")
        private Long storageUtilization;

        private OSSMetric(Builder builder) {
            this.statTime = builder.statTime;
            this.statTimeUTC = builder.statTimeUTC;
            this.storageUtilization = builder.storageUtilization;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OSSMetric create() {
            return builder().build();
        }

        /**
         * @return statTime
         */
        public String getStatTime() {
            return this.statTime;
        }

        /**
         * @return statTimeUTC
         */
        public String getStatTimeUTC() {
            return this.statTimeUTC;
        }

        /**
         * @return storageUtilization
         */
        public Long getStorageUtilization() {
            return this.storageUtilization;
        }

        public static final class Builder {
            private String statTime; 
            private String statTimeUTC; 
            private Long storageUtilization; 

            private Builder() {
            } 

            private Builder(OSSMetric model) {
                this.statTime = model.statTime;
                this.statTimeUTC = model.statTimeUTC;
                this.storageUtilization = model.storageUtilization;
            } 

            /**
             * StatTime.
             */
            public Builder statTime(String statTime) {
                this.statTime = statTime;
                return this;
            }

            /**
             * StatTimeUTC.
             */
            public Builder statTimeUTC(String statTimeUTC) {
                this.statTimeUTC = statTimeUTC;
                return this;
            }

            /**
             * StorageUtilization.
             */
            public Builder storageUtilization(Long storageUtilization) {
                this.storageUtilization = storageUtilization;
                return this;
            }

            public OSSMetric build() {
                return new OSSMetric(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOSSStatisResponseBody} extends {@link TeaModel}
     *
     * <p>GetOSSStatisResponseBody</p>
     */
    public static class OssStatisList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OSSMetric")
        private java.util.List<OSSMetric> OSSMetric;

        private OssStatisList(Builder builder) {
            this.OSSMetric = builder.OSSMetric;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssStatisList create() {
            return builder().build();
        }

        /**
         * @return OSSMetric
         */
        public java.util.List<OSSMetric> getOSSMetric() {
            return this.OSSMetric;
        }

        public static final class Builder {
            private java.util.List<OSSMetric> OSSMetric; 

            private Builder() {
            } 

            private Builder(OssStatisList model) {
                this.OSSMetric = model.OSSMetric;
            } 

            /**
             * OSSMetric.
             */
            public Builder OSSMetric(java.util.List<OSSMetric> OSSMetric) {
                this.OSSMetric = OSSMetric;
                return this;
            }

            public OssStatisList build() {
                return new OssStatisList(this);
            } 

        } 

    }
}
