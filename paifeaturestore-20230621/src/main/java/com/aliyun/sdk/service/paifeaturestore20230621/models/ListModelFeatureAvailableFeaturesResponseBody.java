// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListModelFeatureAvailableFeaturesResponseBody} extends {@link TeaModel}
 *
 * <p>ListModelFeatureAvailableFeaturesResponseBody</p>
 */
public class ListModelFeatureAvailableFeaturesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvaliableFeatures")
    private java.util.List < AvaliableFeatures> avaliableFeatures;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListModelFeatureAvailableFeaturesResponseBody(Builder builder) {
        this.avaliableFeatures = builder.avaliableFeatures;
        this.totalCount = builder.totalCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelFeatureAvailableFeaturesResponseBody create() {
        return builder().build();
    }

    /**
     * @return avaliableFeatures
     */
    public java.util.List < AvaliableFeatures> getAvaliableFeatures() {
        return this.avaliableFeatures;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AvaliableFeatures> avaliableFeatures; 
        private Long totalCount; 
        private String requestId; 

        /**
         * AvaliableFeatures.
         */
        public Builder avaliableFeatures(java.util.List < AvaliableFeatures> avaliableFeatures) {
            this.avaliableFeatures = avaliableFeatures;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListModelFeatureAvailableFeaturesResponseBody build() {
            return new ListModelFeatureAvailableFeaturesResponseBody(this);
        } 

    } 

    public static class AvaliableFeatures extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SourceName")
        private String sourceName;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private AvaliableFeatures(Builder builder) {
            this.name = builder.name;
            this.sourceName = builder.sourceName;
            this.sourceType = builder.sourceType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvaliableFeatures create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sourceName
         */
        public String getSourceName() {
            return this.sourceName;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private String sourceName; 
            private String sourceType; 
            private String type; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SourceName.
             */
            public Builder sourceName(String sourceName) {
                this.sourceName = sourceName;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AvaliableFeatures build() {
                return new AvaliableFeatures(this);
            } 

        } 

    }
}
