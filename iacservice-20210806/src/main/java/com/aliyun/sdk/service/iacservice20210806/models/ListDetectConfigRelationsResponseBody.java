// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link ListDetectConfigRelationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDetectConfigRelationsResponseBody</p>
 */
public class ListDetectConfigRelationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("detectConfigRelations")
    private java.util.List<DetectConfigRelations> detectConfigRelations;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListDetectConfigRelationsResponseBody(Builder builder) {
        this.detectConfigRelations = builder.detectConfigRelations;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDetectConfigRelationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return detectConfigRelations
     */
    public java.util.List<DetectConfigRelations> getDetectConfigRelations() {
        return this.detectConfigRelations;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<DetectConfigRelations> detectConfigRelations; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListDetectConfigRelationsResponseBody model) {
            this.detectConfigRelations = model.detectConfigRelations;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * detectConfigRelations.
         */
        public Builder detectConfigRelations(java.util.List<DetectConfigRelations> detectConfigRelations) {
            this.detectConfigRelations = detectConfigRelations;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0D797DC3-FF04-5C21-81EB-XXXXXXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDetectConfigRelationsResponseBody build() {
            return new ListDetectConfigRelationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDetectConfigRelationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDetectConfigRelationsResponseBody</p>
     */
    public static class DetectConfigRelations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("attachDate")
        private String attachDate;

        @com.aliyun.core.annotation.NameInMap("detectConfigId")
        private String detectConfigId;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private String enabled;

        @com.aliyun.core.annotation.NameInMap("targetId")
        private String targetId;

        @com.aliyun.core.annotation.NameInMap("targetName")
        private String targetName;

        @com.aliyun.core.annotation.NameInMap("targetType")
        private String targetType;

        private DetectConfigRelations(Builder builder) {
            this.attachDate = builder.attachDate;
            this.detectConfigId = builder.detectConfigId;
            this.enabled = builder.enabled;
            this.targetId = builder.targetId;
            this.targetName = builder.targetName;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetectConfigRelations create() {
            return builder().build();
        }

        /**
         * @return attachDate
         */
        public String getAttachDate() {
            return this.attachDate;
        }

        /**
         * @return detectConfigId
         */
        public String getDetectConfigId() {
            return this.detectConfigId;
        }

        /**
         * @return enabled
         */
        public String getEnabled() {
            return this.enabled;
        }

        /**
         * @return targetId
         */
        public String getTargetId() {
            return this.targetId;
        }

        /**
         * @return targetName
         */
        public String getTargetName() {
            return this.targetName;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private String attachDate; 
            private String detectConfigId; 
            private String enabled; 
            private String targetId; 
            private String targetName; 
            private String targetType; 

            private Builder() {
            } 

            private Builder(DetectConfigRelations model) {
                this.attachDate = model.attachDate;
                this.detectConfigId = model.detectConfigId;
                this.enabled = model.enabled;
                this.targetId = model.targetId;
                this.targetName = model.targetName;
                this.targetType = model.targetType;
            } 

            /**
             * attachDate.
             */
            public Builder attachDate(String attachDate) {
                this.attachDate = attachDate;
                return this;
            }

            /**
             * detectConfigId.
             */
            public Builder detectConfigId(String detectConfigId) {
                this.detectConfigId = detectConfigId;
                return this;
            }

            /**
             * enabled.
             */
            public Builder enabled(String enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * targetId.
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * targetName.
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * targetType.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public DetectConfigRelations build() {
                return new DetectConfigRelations(this);
            } 

        } 

    }
}
