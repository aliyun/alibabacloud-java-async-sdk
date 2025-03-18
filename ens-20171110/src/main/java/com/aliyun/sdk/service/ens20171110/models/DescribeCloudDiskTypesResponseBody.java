// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeCloudDiskTypesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudDiskTypesResponseBody</p>
 */
public class DescribeCloudDiskTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SupportResources")
    private SupportResources supportResources;

    private DescribeCloudDiskTypesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.supportResources = builder.supportResources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudDiskTypesResponseBody create() {
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
     * @return supportResources
     */
    public SupportResources getSupportResources() {
        return this.supportResources;
    }

    public static final class Builder {
        private String requestId; 
        private SupportResources supportResources; 

        private Builder() {
        } 

        private Builder(DescribeCloudDiskTypesResponseBody model) {
            this.requestId = model.requestId;
            this.supportResources = model.supportResources;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>77990CEE-B714-5702-BDE6-943F702277DD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The specifications of resources that you can purchase.</p>
         */
        public Builder supportResources(SupportResources supportResources) {
            this.supportResources = supportResources;
            return this;
        }

        public DescribeCloudDiskTypesResponseBody build() {
            return new DescribeCloudDiskTypesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCloudDiskTypesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudDiskTypesResponseBody</p>
     */
    public static class SupportResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        private SupportResource(Builder builder) {
            this.category = builder.category;
            this.ensRegionId = builder.ensRegionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportResource create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public static final class Builder {
            private String category; 
            private String ensRegionId; 

            private Builder() {
            } 

            private Builder(SupportResource model) {
                this.category = model.category;
                this.ensRegionId = model.ensRegionId;
            } 

            /**
             * <p>The category of the disk.</p>
             * <ul>
             * <li>cloud_efficiency: ultra disk.</li>
             * <li>cloud_ssd: all-flash disk.</li>
             * <li>local_hdd: local HDD.</li>
             * <li>local_ssd: local SSD.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cloud_efficiency</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The ID of the edge node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-guangzhou-10</p>
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            public SupportResource build() {
                return new SupportResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCloudDiskTypesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudDiskTypesResponseBody</p>
     */
    public static class SupportResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportResource")
        private java.util.List<SupportResource> supportResource;

        private SupportResources(Builder builder) {
            this.supportResource = builder.supportResource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportResources create() {
            return builder().build();
        }

        /**
         * @return supportResource
         */
        public java.util.List<SupportResource> getSupportResource() {
            return this.supportResource;
        }

        public static final class Builder {
            private java.util.List<SupportResource> supportResource; 

            private Builder() {
            } 

            private Builder(SupportResources model) {
                this.supportResource = model.supportResource;
            } 

            /**
             * SupportResource.
             */
            public Builder supportResource(java.util.List<SupportResource> supportResource) {
                this.supportResource = supportResource;
                return this;
            }

            public SupportResources build() {
                return new SupportResources(this);
            } 

        } 

    }
}
