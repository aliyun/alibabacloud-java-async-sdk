// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceTrailResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceTrailResponseBody</p>
 */
public class GetServiceTrailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceTrail")
    private ServiceTrail serviceTrail;

    private GetServiceTrailResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.serviceTrail = builder.serviceTrail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceTrailResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceTrail
     */
    public ServiceTrail getServiceTrail() {
        return this.serviceTrail;
    }

    public static final class Builder {
        private String requestId; 
        private ServiceTrail serviceTrail; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The configurations of the service trail.
         */
        public Builder serviceTrail(ServiceTrail serviceTrail) {
            this.serviceTrail = serviceTrail;
            return this;
        }

        public GetServiceTrailResponseBody build() {
            return new GetServiceTrailResponseBody(this);
        } 

    } 

    public static class ServiceTrail extends TeaModel {
        @NameInMap("Config")
        private String config;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private ServiceTrail(Builder builder) {
            this.config = builder.config;
            this.createTime = builder.createTime;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceTrail create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String config; 
            private Long createTime; 
            private Long updateTime; 

            /**
             * The status of the service trail. Valid values:
             * <p>
             * 
             * *   **on:**
             * *   **off:**
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * The timestamp generated when the service trail was created. Unit: milliseconds.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The timestamp generated when the service trail was last updated. Unit: milliseconds.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public ServiceTrail build() {
                return new ServiceTrail(this);
            } 

        } 

    }
}
