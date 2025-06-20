// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

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
 * {@link CreateMultiAccountDeliveryChannelRequest} extends {@link RequestModel}
 *
 * <p>CreateMultiAccountDeliveryChannelRequest</p>
 */
public class CreateMultiAccountDeliveryChannelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliveryChannelDescription")
    private String deliveryChannelDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliveryChannelFilter")
    @com.aliyun.core.annotation.Validation(required = true)
    private DeliveryChannelFilter deliveryChannelFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliveryChannelName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deliveryChannelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceChangeDelivery")
    private ResourceChangeDelivery resourceChangeDelivery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceSnapshotDelivery")
    private ResourceSnapshotDelivery resourceSnapshotDelivery;

    private CreateMultiAccountDeliveryChannelRequest(Builder builder) {
        super(builder);
        this.deliveryChannelDescription = builder.deliveryChannelDescription;
        this.deliveryChannelFilter = builder.deliveryChannelFilter;
        this.deliveryChannelName = builder.deliveryChannelName;
        this.resourceChangeDelivery = builder.resourceChangeDelivery;
        this.resourceSnapshotDelivery = builder.resourceSnapshotDelivery;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMultiAccountDeliveryChannelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deliveryChannelDescription
     */
    public String getDeliveryChannelDescription() {
        return this.deliveryChannelDescription;
    }

    /**
     * @return deliveryChannelFilter
     */
    public DeliveryChannelFilter getDeliveryChannelFilter() {
        return this.deliveryChannelFilter;
    }

    /**
     * @return deliveryChannelName
     */
    public String getDeliveryChannelName() {
        return this.deliveryChannelName;
    }

    /**
     * @return resourceChangeDelivery
     */
    public ResourceChangeDelivery getResourceChangeDelivery() {
        return this.resourceChangeDelivery;
    }

    /**
     * @return resourceSnapshotDelivery
     */
    public ResourceSnapshotDelivery getResourceSnapshotDelivery() {
        return this.resourceSnapshotDelivery;
    }

    public static final class Builder extends Request.Builder<CreateMultiAccountDeliveryChannelRequest, Builder> {
        private String deliveryChannelDescription; 
        private DeliveryChannelFilter deliveryChannelFilter; 
        private String deliveryChannelName; 
        private ResourceChangeDelivery resourceChangeDelivery; 
        private ResourceSnapshotDelivery resourceSnapshotDelivery; 

        private Builder() {
            super();
        } 

        private Builder(CreateMultiAccountDeliveryChannelRequest request) {
            super(request);
            this.deliveryChannelDescription = request.deliveryChannelDescription;
            this.deliveryChannelFilter = request.deliveryChannelFilter;
            this.deliveryChannelName = request.deliveryChannelName;
            this.resourceChangeDelivery = request.resourceChangeDelivery;
            this.resourceSnapshotDelivery = request.resourceSnapshotDelivery;
        } 

        /**
         * DeliveryChannelDescription.
         */
        public Builder deliveryChannelDescription(String deliveryChannelDescription) {
            this.putQueryParameter("DeliveryChannelDescription", deliveryChannelDescription);
            this.deliveryChannelDescription = deliveryChannelDescription;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder deliveryChannelFilter(DeliveryChannelFilter deliveryChannelFilter) {
            this.putQueryParameter("DeliveryChannelFilter", deliveryChannelFilter);
            this.deliveryChannelFilter = deliveryChannelFilter;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-multi-account-delivery</p>
         */
        public Builder deliveryChannelName(String deliveryChannelName) {
            this.putQueryParameter("DeliveryChannelName", deliveryChannelName);
            this.deliveryChannelName = deliveryChannelName;
            return this;
        }

        /**
         * ResourceChangeDelivery.
         */
        public Builder resourceChangeDelivery(ResourceChangeDelivery resourceChangeDelivery) {
            this.putQueryParameter("ResourceChangeDelivery", resourceChangeDelivery);
            this.resourceChangeDelivery = resourceChangeDelivery;
            return this;
        }

        /**
         * ResourceSnapshotDelivery.
         */
        public Builder resourceSnapshotDelivery(ResourceSnapshotDelivery resourceSnapshotDelivery) {
            this.putQueryParameter("ResourceSnapshotDelivery", resourceSnapshotDelivery);
            this.resourceSnapshotDelivery = resourceSnapshotDelivery;
            return this;
        }

        @Override
        public CreateMultiAccountDeliveryChannelRequest build() {
            return new CreateMultiAccountDeliveryChannelRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateMultiAccountDeliveryChannelRequest} extends {@link TeaModel}
     *
     * <p>CreateMultiAccountDeliveryChannelRequest</p>
     */
    public static class DeliveryChannelFilter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountScopes")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> accountScopes;

        @com.aliyun.core.annotation.NameInMap("ResourceTypes")
        private java.util.List<String> resourceTypes;

        private DeliveryChannelFilter(Builder builder) {
            this.accountScopes = builder.accountScopes;
            this.resourceTypes = builder.resourceTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeliveryChannelFilter create() {
            return builder().build();
        }

        /**
         * @return accountScopes
         */
        public java.util.List<String> getAccountScopes() {
            return this.accountScopes;
        }

        /**
         * @return resourceTypes
         */
        public java.util.List<String> getResourceTypes() {
            return this.resourceTypes;
        }

        public static final class Builder {
            private java.util.List<String> accountScopes; 
            private java.util.List<String> resourceTypes; 

            private Builder() {
            } 

            private Builder(DeliveryChannelFilter model) {
                this.accountScopes = model.accountScopes;
                this.resourceTypes = model.resourceTypes;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder accountScopes(java.util.List<String> accountScopes) {
                this.accountScopes = accountScopes;
                return this;
            }

            /**
             * ResourceTypes.
             */
            public Builder resourceTypes(java.util.List<String> resourceTypes) {
                this.resourceTypes = resourceTypes;
                return this;
            }

            public DeliveryChannelFilter build() {
                return new DeliveryChannelFilter(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMultiAccountDeliveryChannelRequest} extends {@link TeaModel}
     *
     * <p>CreateMultiAccountDeliveryChannelRequest</p>
     */
    public static class SlsProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OversizedDataOssTargetArn")
        private String oversizedDataOssTargetArn;

        private SlsProperties(Builder builder) {
            this.oversizedDataOssTargetArn = builder.oversizedDataOssTargetArn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlsProperties create() {
            return builder().build();
        }

        /**
         * @return oversizedDataOssTargetArn
         */
        public String getOversizedDataOssTargetArn() {
            return this.oversizedDataOssTargetArn;
        }

        public static final class Builder {
            private String oversizedDataOssTargetArn; 

            private Builder() {
            } 

            private Builder(SlsProperties model) {
                this.oversizedDataOssTargetArn = model.oversizedDataOssTargetArn;
            } 

            /**
             * OversizedDataOssTargetArn.
             */
            public Builder oversizedDataOssTargetArn(String oversizedDataOssTargetArn) {
                this.oversizedDataOssTargetArn = oversizedDataOssTargetArn;
                return this;
            }

            public SlsProperties build() {
                return new SlsProperties(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMultiAccountDeliveryChannelRequest} extends {@link TeaModel}
     *
     * <p>CreateMultiAccountDeliveryChannelRequest</p>
     */
    public static class ResourceChangeDelivery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SlsProperties")
        private SlsProperties slsProperties;

        @com.aliyun.core.annotation.NameInMap("TargetArn")
        private String targetArn;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        private ResourceChangeDelivery(Builder builder) {
            this.slsProperties = builder.slsProperties;
            this.targetArn = builder.targetArn;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceChangeDelivery create() {
            return builder().build();
        }

        /**
         * @return slsProperties
         */
        public SlsProperties getSlsProperties() {
            return this.slsProperties;
        }

        /**
         * @return targetArn
         */
        public String getTargetArn() {
            return this.targetArn;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private SlsProperties slsProperties; 
            private String targetArn; 
            private String targetType; 

            private Builder() {
            } 

            private Builder(ResourceChangeDelivery model) {
                this.slsProperties = model.slsProperties;
                this.targetArn = model.targetArn;
                this.targetType = model.targetType;
            } 

            /**
             * SlsProperties.
             */
            public Builder slsProperties(SlsProperties slsProperties) {
                this.slsProperties = slsProperties;
                return this;
            }

            /**
             * TargetArn.
             */
            public Builder targetArn(String targetArn) {
                this.targetArn = targetArn;
                return this;
            }

            /**
             * TargetType.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public ResourceChangeDelivery build() {
                return new ResourceChangeDelivery(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMultiAccountDeliveryChannelRequest} extends {@link TeaModel}
     *
     * <p>CreateMultiAccountDeliveryChannelRequest</p>
     */
    public static class ResourceSnapshotDeliverySlsProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OversizedDataOssTargetArn")
        private String oversizedDataOssTargetArn;

        private ResourceSnapshotDeliverySlsProperties(Builder builder) {
            this.oversizedDataOssTargetArn = builder.oversizedDataOssTargetArn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceSnapshotDeliverySlsProperties create() {
            return builder().build();
        }

        /**
         * @return oversizedDataOssTargetArn
         */
        public String getOversizedDataOssTargetArn() {
            return this.oversizedDataOssTargetArn;
        }

        public static final class Builder {
            private String oversizedDataOssTargetArn; 

            private Builder() {
            } 

            private Builder(ResourceSnapshotDeliverySlsProperties model) {
                this.oversizedDataOssTargetArn = model.oversizedDataOssTargetArn;
            } 

            /**
             * OversizedDataOssTargetArn.
             */
            public Builder oversizedDataOssTargetArn(String oversizedDataOssTargetArn) {
                this.oversizedDataOssTargetArn = oversizedDataOssTargetArn;
                return this;
            }

            public ResourceSnapshotDeliverySlsProperties build() {
                return new ResourceSnapshotDeliverySlsProperties(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMultiAccountDeliveryChannelRequest} extends {@link TeaModel}
     *
     * <p>CreateMultiAccountDeliveryChannelRequest</p>
     */
    public static class ResourceSnapshotDelivery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomExpression")
        private String customExpression;

        @com.aliyun.core.annotation.NameInMap("DeliveryTime")
        private String deliveryTime;

        @com.aliyun.core.annotation.NameInMap("SlsProperties")
        private ResourceSnapshotDeliverySlsProperties slsProperties;

        @com.aliyun.core.annotation.NameInMap("TargetArn")
        private String targetArn;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        private ResourceSnapshotDelivery(Builder builder) {
            this.customExpression = builder.customExpression;
            this.deliveryTime = builder.deliveryTime;
            this.slsProperties = builder.slsProperties;
            this.targetArn = builder.targetArn;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceSnapshotDelivery create() {
            return builder().build();
        }

        /**
         * @return customExpression
         */
        public String getCustomExpression() {
            return this.customExpression;
        }

        /**
         * @return deliveryTime
         */
        public String getDeliveryTime() {
            return this.deliveryTime;
        }

        /**
         * @return slsProperties
         */
        public ResourceSnapshotDeliverySlsProperties getSlsProperties() {
            return this.slsProperties;
        }

        /**
         * @return targetArn
         */
        public String getTargetArn() {
            return this.targetArn;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private String customExpression; 
            private String deliveryTime; 
            private ResourceSnapshotDeliverySlsProperties slsProperties; 
            private String targetArn; 
            private String targetType; 

            private Builder() {
            } 

            private Builder(ResourceSnapshotDelivery model) {
                this.customExpression = model.customExpression;
                this.deliveryTime = model.deliveryTime;
                this.slsProperties = model.slsProperties;
                this.targetArn = model.targetArn;
                this.targetType = model.targetType;
            } 

            /**
             * CustomExpression.
             */
            public Builder customExpression(String customExpression) {
                this.customExpression = customExpression;
                return this;
            }

            /**
             * DeliveryTime.
             */
            public Builder deliveryTime(String deliveryTime) {
                this.deliveryTime = deliveryTime;
                return this;
            }

            /**
             * SlsProperties.
             */
            public Builder slsProperties(ResourceSnapshotDeliverySlsProperties slsProperties) {
                this.slsProperties = slsProperties;
                return this;
            }

            /**
             * TargetArn.
             */
            public Builder targetArn(String targetArn) {
                this.targetArn = targetArn;
                return this;
            }

            /**
             * TargetType.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public ResourceSnapshotDelivery build() {
                return new ResourceSnapshotDelivery(this);
            } 

        } 

    }
}
