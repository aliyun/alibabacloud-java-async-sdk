// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link PreviewLogicalModelUpdateRequest} extends {@link RequestModel}
 *
 * <p>PreviewLogicalModelUpdateRequest</p>
 */
public class PreviewLogicalModelUpdateRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("logicalModelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logicalModelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("callStrategy")
    private String callStrategy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fallbackTargets")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<FallbackTargets> fallbackTargets;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("responseModel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String responseModel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("routingPolicy")
    @com.aliyun.core.annotation.Validation(required = true)
    private String routingPolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("slots")
    private Slots slots;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targets")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Targets> targets;

    private PreviewLogicalModelUpdateRequest(Builder builder) {
        super(builder);
        this.logicalModelId = builder.logicalModelId;
        this.callStrategy = builder.callStrategy;
        this.fallbackTargets = builder.fallbackTargets;
        this.name = builder.name;
        this.responseModel = builder.responseModel;
        this.routingPolicy = builder.routingPolicy;
        this.slots = builder.slots;
        this.targets = builder.targets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreviewLogicalModelUpdateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logicalModelId
     */
    public String getLogicalModelId() {
        return this.logicalModelId;
    }

    /**
     * @return callStrategy
     */
    public String getCallStrategy() {
        return this.callStrategy;
    }

    /**
     * @return fallbackTargets
     */
    public java.util.List<FallbackTargets> getFallbackTargets() {
        return this.fallbackTargets;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return responseModel
     */
    public String getResponseModel() {
        return this.responseModel;
    }

    /**
     * @return routingPolicy
     */
    public String getRoutingPolicy() {
        return this.routingPolicy;
    }

    /**
     * @return slots
     */
    public Slots getSlots() {
        return this.slots;
    }

    /**
     * @return targets
     */
    public java.util.List<Targets> getTargets() {
        return this.targets;
    }

    public static final class Builder extends Request.Builder<PreviewLogicalModelUpdateRequest, Builder> {
        private String logicalModelId; 
        private String callStrategy; 
        private java.util.List<FallbackTargets> fallbackTargets; 
        private String name; 
        private String responseModel; 
        private String routingPolicy; 
        private Slots slots; 
        private java.util.List<Targets> targets; 

        private Builder() {
            super();
        } 

        private Builder(PreviewLogicalModelUpdateRequest request) {
            super(request);
            this.logicalModelId = request.logicalModelId;
            this.callStrategy = request.callStrategy;
            this.fallbackTargets = request.fallbackTargets;
            this.name = request.name;
            this.responseModel = request.responseModel;
            this.routingPolicy = request.routingPolicy;
            this.slots = request.slots;
            this.targets = request.targets;
        } 

        /**
         * <p>The logical model ID. Use the vm- identifier returned by the API.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vm-d00000000000000000000</p>
         */
        public Builder logicalModelId(String logicalModelId) {
            this.putPathParameter("logicalModelId", logicalModelId);
            this.logicalModelId = logicalModelId;
            return this;
        }

        /**
         * <p>The call strategy, which is required for new Auto write requests. Valid values: balanced, cheap, fast, and quality. The new version uses only the basic call name. Do not submit this parameter for Mapping or Weighted. The server performs conditional validation.</p>
         * 
         * <strong>example:</strong>
         * <p>balanced</p>
         */
        public Builder callStrategy(String callStrategy) {
            this.putBodyParameter("callStrategy", callStrategy);
            this.callStrategy = callStrategy;
            return this;
        }

        /**
         * <p>An ordered list of up to 5 fallback targets. The targets are deduplicated by the actual card ID. This can be an empty array.</p>
         * <p>This parameter is required.</p>
         */
        public Builder fallbackTargets(java.util.List<FallbackTargets> fallbackTargets) {
            this.putBodyParameter("fallbackTargets", fallbackTargets);
            this.fallbackTargets = fallbackTargets;
            return this;
        }

        /**
         * <p>The client logical call name. The value can be up to 256 bytes in UTF-8 encoding, must not contain spaces or slashes, and must not start with auto.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>beta-chat</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The response model type. If set to Actual, the public name of the actual model is returned. If set to Logical, the entry name is returned, including SSE.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Actual</p>
         */
        public Builder responseModel(String responseModel) {
            this.putBodyParameter("responseModel", responseModel);
            this.responseModel = responseModel;
            return this;
        }

        /**
         * <p>The routing policy. Valid values: Mapping, Weighted, and Auto. If you set this parameter to Auto, targets must be an empty array and slots is required.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Weighted</p>
         */
        public Builder routingPolicy(String routingPolicy) {
            this.putBodyParameter("routingPolicy", routingPolicy);
            this.routingPolicy = routingPolicy;
            return this;
        }

        /**
         * <p>The slots configuration, which is submitted only for Auto. Each of the simple, standard, and complex slots requires 1 to 3 source cards. Cards across the three slots are globally deduplicated by modelCardId. Omit this parameter for Mapping or Weighted.</p>
         */
        public Builder slots(Slots slots) {
            this.putBodyParameter("slots", slots);
            this.slots = slots;
            return this;
        }

        /**
         * <p>The primary targets. For Mapping, exactly one item is required. For Weighted, the sum of the original relative weights must be greater than 0. For Auto, this must be an empty array.</p>
         * <p>This parameter is required.</p>
         */
        public Builder targets(java.util.List<Targets> targets) {
            this.putBodyParameter("targets", targets);
            this.targets = targets;
            return this;
        }

        @Override
        public PreviewLogicalModelUpdateRequest build() {
            return new PreviewLogicalModelUpdateRequest(this);
        } 

    } 

    /**
     * 
     * {@link PreviewLogicalModelUpdateRequest} extends {@link TeaModel}
     *
     * <p>PreviewLogicalModelUpdateRequest</p>
     */
    public static class FallbackTargets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("modelCardId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String modelCardId;

        private FallbackTargets(Builder builder) {
            this.modelCardId = builder.modelCardId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FallbackTargets create() {
            return builder().build();
        }

        /**
         * @return modelCardId
         */
        public String getModelCardId() {
            return this.modelCardId;
        }

        public static final class Builder {
            private String modelCardId; 

            private Builder() {
            } 

            private Builder(FallbackTargets model) {
                this.modelCardId = model.modelCardId;
            } 

            /**
             * <p>The actual source card ID within the same instance.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>msc-d00000000000000000000</p>
             */
            public Builder modelCardId(String modelCardId) {
                this.modelCardId = modelCardId;
                return this;
            }

            public FallbackTargets build() {
                return new FallbackTargets(this);
            } 

        } 

    }
    /**
     * 
     * {@link PreviewLogicalModelUpdateRequest} extends {@link TeaModel}
     *
     * <p>PreviewLogicalModelUpdateRequest</p>
     */
    public static class Complex extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("modelCardId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String modelCardId;

        private Complex(Builder builder) {
            this.modelCardId = builder.modelCardId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Complex create() {
            return builder().build();
        }

        /**
         * @return modelCardId
         */
        public String getModelCardId() {
            return this.modelCardId;
        }

        public static final class Builder {
            private String modelCardId; 

            private Builder() {
            } 

            private Builder(Complex model) {
                this.modelCardId = model.modelCardId;
            } 

            /**
             * <p>The actual source card ID within the same instance, which starts with msc-. VM or service overrides are not supported.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>msc-d00000000000000000000</p>
             */
            public Builder modelCardId(String modelCardId) {
                this.modelCardId = modelCardId;
                return this;
            }

            public Complex build() {
                return new Complex(this);
            } 

        } 

    }
    /**
     * 
     * {@link PreviewLogicalModelUpdateRequest} extends {@link TeaModel}
     *
     * <p>PreviewLogicalModelUpdateRequest</p>
     */
    public static class Simple extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("modelCardId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String modelCardId;

        private Simple(Builder builder) {
            this.modelCardId = builder.modelCardId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Simple create() {
            return builder().build();
        }

        /**
         * @return modelCardId
         */
        public String getModelCardId() {
            return this.modelCardId;
        }

        public static final class Builder {
            private String modelCardId; 

            private Builder() {
            } 

            private Builder(Simple model) {
                this.modelCardId = model.modelCardId;
            } 

            /**
             * <p>The actual source card ID within the same instance, which starts with msc-. VM or service overrides are not supported.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>msc-d00000000000000000000</p>
             */
            public Builder modelCardId(String modelCardId) {
                this.modelCardId = modelCardId;
                return this;
            }

            public Simple build() {
                return new Simple(this);
            } 

        } 

    }
    /**
     * 
     * {@link PreviewLogicalModelUpdateRequest} extends {@link TeaModel}
     *
     * <p>PreviewLogicalModelUpdateRequest</p>
     */
    public static class Standard extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("modelCardId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String modelCardId;

        private Standard(Builder builder) {
            this.modelCardId = builder.modelCardId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Standard create() {
            return builder().build();
        }

        /**
         * @return modelCardId
         */
        public String getModelCardId() {
            return this.modelCardId;
        }

        public static final class Builder {
            private String modelCardId; 

            private Builder() {
            } 

            private Builder(Standard model) {
                this.modelCardId = model.modelCardId;
            } 

            /**
             * <p>The actual source card ID within the same instance, which starts with msc-. VM or service overrides are not supported.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>msc-d00000000000000000000</p>
             */
            public Builder modelCardId(String modelCardId) {
                this.modelCardId = modelCardId;
                return this;
            }

            public Standard build() {
                return new Standard(this);
            } 

        } 

    }
    /**
     * 
     * {@link PreviewLogicalModelUpdateRequest} extends {@link TeaModel}
     *
     * <p>PreviewLogicalModelUpdateRequest</p>
     */
    public static class Slots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("complex")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Complex> complex;

        @com.aliyun.core.annotation.NameInMap("simple")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Simple> simple;

        @com.aliyun.core.annotation.NameInMap("standard")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Standard> standard;

        private Slots(Builder builder) {
            this.complex = builder.complex;
            this.simple = builder.simple;
            this.standard = builder.standard;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Slots create() {
            return builder().build();
        }

        /**
         * @return complex
         */
        public java.util.List<Complex> getComplex() {
            return this.complex;
        }

        /**
         * @return simple
         */
        public java.util.List<Simple> getSimple() {
            return this.simple;
        }

        /**
         * @return standard
         */
        public java.util.List<Standard> getStandard() {
            return this.standard;
        }

        public static final class Builder {
            private java.util.List<Complex> complex; 
            private java.util.List<Simple> simple; 
            private java.util.List<Standard> standard; 

            private Builder() {
            } 

            private Builder(Slots model) {
                this.complex = model.complex;
                this.simple = model.simple;
                this.standard = model.standard;
            } 

            /**
             * <p>The complex slot, which requires 1 to 3 source cards. Cards across the three slots are globally deduplicated by modelCardId.</p>
             * <p>This parameter is required.</p>
             */
            public Builder complex(java.util.List<Complex> complex) {
                this.complex = complex;
                return this;
            }

            /**
             * <p>The simple slot, which requires 1 to 3 source cards. Cards across the three slots are globally deduplicated by modelCardId.</p>
             * <p>This parameter is required.</p>
             */
            public Builder simple(java.util.List<Simple> simple) {
                this.simple = simple;
                return this;
            }

            /**
             * <p>The standard slot, which requires 1 to 3 source cards. Cards across the three slots are globally deduplicated by modelCardId.</p>
             * <p>This parameter is required.</p>
             */
            public Builder standard(java.util.List<Standard> standard) {
                this.standard = standard;
                return this;
            }

            public Slots build() {
                return new Slots(this);
            } 

        } 

    }
    /**
     * 
     * {@link PreviewLogicalModelUpdateRequest} extends {@link TeaModel}
     *
     * <p>PreviewLogicalModelUpdateRequest</p>
     */
    public static class Targets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("modelCardId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String modelCardId;

        @com.aliyun.core.annotation.NameInMap("weight")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer weight;

        private Targets(Builder builder) {
            this.modelCardId = builder.modelCardId;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Targets create() {
            return builder().build();
        }

        /**
         * @return modelCardId
         */
        public String getModelCardId() {
            return this.modelCardId;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String modelCardId; 
            private Integer weight; 

            private Builder() {
            } 

            private Builder(Targets model) {
                this.modelCardId = model.modelCardId;
                this.weight = model.weight;
            } 

            /**
             * <p>The actual source model card ID within the same instance, which starts with msc-. VM or service overrides are not supported.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>msc-d00000000000000000000</p>
             */
            public Builder modelCardId(String modelCardId) {
                this.modelCardId = modelCardId;
                return this;
            }

            /**
             * <p>The weight value. Valid values: integers from 0 to 10000. The original value is preserved. For Mapping, 0 is allowed.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public Targets build() {
                return new Targets(this);
            } 

        } 

    }
}
