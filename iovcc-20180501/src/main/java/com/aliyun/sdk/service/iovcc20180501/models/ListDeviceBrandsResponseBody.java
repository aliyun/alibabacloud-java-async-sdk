// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeviceBrandsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDeviceBrandsResponseBody</p>
 */
public class ListDeviceBrandsResponseBody extends TeaModel {
    @NameInMap("DeviceBrands")
    private java.util.List < DeviceBrands> deviceBrands;

    @NameInMap("RequestId")
    private String requestId;

    private ListDeviceBrandsResponseBody(Builder builder) {
        this.deviceBrands = builder.deviceBrands;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeviceBrandsResponseBody create() {
        return builder().build();
    }

    /**
     * @return deviceBrands
     */
    public java.util.List < DeviceBrands> getDeviceBrands() {
        return this.deviceBrands;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DeviceBrands> deviceBrands; 
        private String requestId; 

        /**
         * DeviceBrands.
         */
        public Builder deviceBrands(java.util.List < DeviceBrands> deviceBrands) {
            this.deviceBrands = deviceBrands;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDeviceBrandsResponseBody build() {
            return new ListDeviceBrandsResponseBody(this);
        } 

    } 

    public static class DeviceBrands extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("DeviceBrand")
        private String deviceBrand;

        @NameInMap("DeviceBrandId")
        private Long deviceBrandId;

        @NameInMap("Manufacture")
        private String manufacture;

        @NameInMap("ProjectId")
        private String projectId;

        private DeviceBrands(Builder builder) {
            this.description = builder.description;
            this.deviceBrand = builder.deviceBrand;
            this.deviceBrandId = builder.deviceBrandId;
            this.manufacture = builder.manufacture;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceBrands create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return deviceBrand
         */
        public String getDeviceBrand() {
            return this.deviceBrand;
        }

        /**
         * @return deviceBrandId
         */
        public Long getDeviceBrandId() {
            return this.deviceBrandId;
        }

        /**
         * @return manufacture
         */
        public String getManufacture() {
            return this.manufacture;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        public static final class Builder {
            private String description; 
            private String deviceBrand; 
            private Long deviceBrandId; 
            private String manufacture; 
            private String projectId; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DeviceBrand.
             */
            public Builder deviceBrand(String deviceBrand) {
                this.deviceBrand = deviceBrand;
                return this;
            }

            /**
             * DeviceBrandId.
             */
            public Builder deviceBrandId(Long deviceBrandId) {
                this.deviceBrandId = deviceBrandId;
                return this;
            }

            /**
             * Manufacture.
             */
            public Builder manufacture(String manufacture) {
                this.manufacture = manufacture;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            public DeviceBrands build() {
                return new DeviceBrands(this);
            } 

        } 

    }
}
