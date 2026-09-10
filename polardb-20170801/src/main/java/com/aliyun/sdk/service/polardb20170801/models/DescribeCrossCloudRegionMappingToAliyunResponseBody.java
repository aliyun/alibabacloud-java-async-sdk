// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeCrossCloudRegionMappingToAliyunResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCrossCloudRegionMappingToAliyunResponseBody</p>
 */
public class DescribeCrossCloudRegionMappingToAliyunResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CrossCloudRegionMappingList")
    private java.util.List<CrossCloudRegionMappingList> crossCloudRegionMappingList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCrossCloudRegionMappingToAliyunResponseBody(Builder builder) {
        this.crossCloudRegionMappingList = builder.crossCloudRegionMappingList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCrossCloudRegionMappingToAliyunResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return crossCloudRegionMappingList
     */
    public java.util.List<CrossCloudRegionMappingList> getCrossCloudRegionMappingList() {
        return this.crossCloudRegionMappingList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<CrossCloudRegionMappingList> crossCloudRegionMappingList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeCrossCloudRegionMappingToAliyunResponseBody model) {
            this.crossCloudRegionMappingList = model.crossCloudRegionMappingList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of cross-cloud region mappings.</p>
         */
        public Builder crossCloudRegionMappingList(java.util.List<CrossCloudRegionMappingList> crossCloudRegionMappingList) {
            this.crossCloudRegionMappingList = crossCloudRegionMappingList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E56531A4-E552-40BA-9C58-137B80******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCrossCloudRegionMappingToAliyunResponseBody build() {
            return new DescribeCrossCloudRegionMappingToAliyunResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCrossCloudRegionMappingToAliyunResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCrossCloudRegionMappingToAliyunResponseBody</p>
     */
    public static class CrossCloudRegionMappingList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunRegionId")
        private String aliyunRegionId;

        @com.aliyun.core.annotation.NameInMap("CloudProvider")
        private String cloudProvider;

        @com.aliyun.core.annotation.NameInMap("CrossCloudRegionId")
        private String crossCloudRegionId;

        private CrossCloudRegionMappingList(Builder builder) {
            this.aliyunRegionId = builder.aliyunRegionId;
            this.cloudProvider = builder.cloudProvider;
            this.crossCloudRegionId = builder.crossCloudRegionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CrossCloudRegionMappingList create() {
            return builder().build();
        }

        /**
         * @return aliyunRegionId
         */
        public String getAliyunRegionId() {
            return this.aliyunRegionId;
        }

        /**
         * @return cloudProvider
         */
        public String getCloudProvider() {
            return this.cloudProvider;
        }

        /**
         * @return crossCloudRegionId
         */
        public String getCrossCloudRegionId() {
            return this.crossCloudRegionId;
        }

        public static final class Builder {
            private String aliyunRegionId; 
            private String cloudProvider; 
            private String crossCloudRegionId; 

            private Builder() {
            } 

            private Builder(CrossCloudRegionMappingList model) {
                this.aliyunRegionId = model.aliyunRegionId;
                this.cloudProvider = model.cloudProvider;
                this.crossCloudRegionId = model.crossCloudRegionId;
            } 

            /**
             * <p>The region ID of Alibaba Cloud.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder aliyunRegionId(String aliyunRegionId) {
                this.aliyunRegionId = aliyunRegionId;
                return this;
            }

            /**
             * <p>The cloud provider.</p>
             * 
             * <strong>example:</strong>
             * <p>HuaweiCloud</p>
             */
            public Builder cloudProvider(String cloudProvider) {
                this.cloudProvider = cloudProvider;
                return this;
            }

            /**
             * <p>The region ID of the third-party cloud.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-east-3</p>
             */
            public Builder crossCloudRegionId(String crossCloudRegionId) {
                this.crossCloudRegionId = crossCloudRegionId;
                return this;
            }

            public CrossCloudRegionMappingList build() {
                return new CrossCloudRegionMappingList(this);
            } 

        } 

    }
}
