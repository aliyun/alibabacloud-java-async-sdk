// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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
 * {@link GetStorageResponseBody} extends {@link TeaModel}
 *
 * <p>GetStorageResponseBody</p>
 */
public class GetStorageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetStorageResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStorageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetStorageResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the storage.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>97A31C3A-3F9F-5866-8979-5159E3DC****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetStorageResponseBody build() {
            return new GetStorageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStorageResponseBody} extends {@link TeaModel}
     *
     * <p>GetStorageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanOperate")
        private Boolean canOperate;

        @com.aliyun.core.annotation.NameInMap("DisplayRegion")
        private Boolean displayRegion;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Ttl")
        private Integer ttl;

        private Data(Builder builder) {
            this.canOperate = builder.canOperate;
            this.displayRegion = builder.displayRegion;
            this.region = builder.region;
            this.ttl = builder.ttl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return canOperate
         */
        public Boolean getCanOperate() {
            return this.canOperate;
        }

        /**
         * @return displayRegion
         */
        public Boolean getDisplayRegion() {
            return this.displayRegion;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return ttl
         */
        public Integer getTtl() {
            return this.ttl;
        }

        public static final class Builder {
            private Boolean canOperate; 
            private Boolean displayRegion; 
            private String region; 
            private Integer ttl; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.canOperate = model.canOperate;
                this.displayRegion = model.displayRegion;
                this.region = model.region;
                this.ttl = model.ttl;
            } 

            /**
             * <p>Indicates whether the storage region can be changed for once. Default value: false Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder canOperate(Boolean canOperate) {
                this.canOperate = canOperate;
                return this;
            }

            /**
             * <p>Indicates whether the storage region can be changed. Default value: false Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder displayRegion(Boolean displayRegion) {
                this.displayRegion = displayRegion;
                return this;
            }

            /**
             * <p>The region where the data is stored.</p>
             * <p>If the data management center is <strong>cn-hangzhou</strong>, the default value of <strong>Region</strong> is cn-shanghai, which specifies the China (Shanghai) region. If the data management center is <strong>ap-southeast-1</strong>, the default value of <strong>Region</strong> is ap-southeast-1, which specifies the Singapore region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The storage period of logs. Unit: day. Default value: 180. Valid values: 30 to 3000.</p>
             * 
             * <strong>example:</strong>
             * <p>180</p>
             */
            public Builder ttl(Integer ttl) {
                this.ttl = ttl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
