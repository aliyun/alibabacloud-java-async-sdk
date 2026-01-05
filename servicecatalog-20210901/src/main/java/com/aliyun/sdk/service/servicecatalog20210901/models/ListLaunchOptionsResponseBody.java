// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

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
 * {@link ListLaunchOptionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListLaunchOptionsResponseBody</p>
 */
public class ListLaunchOptionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LaunchOptionSummaries")
    private java.util.List<LaunchOptionSummaries> launchOptionSummaries;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListLaunchOptionsResponseBody(Builder builder) {
        this.launchOptionSummaries = builder.launchOptionSummaries;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLaunchOptionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return launchOptionSummaries
     */
    public java.util.List<LaunchOptionSummaries> getLaunchOptionSummaries() {
        return this.launchOptionSummaries;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<LaunchOptionSummaries> launchOptionSummaries; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListLaunchOptionsResponseBody model) {
            this.launchOptionSummaries = model.launchOptionSummaries;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The launch options.</p>
         */
        public Builder launchOptionSummaries(java.util.List<LaunchOptionSummaries> launchOptionSummaries) {
            this.launchOptionSummaries = launchOptionSummaries;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0FEEF92D-4052-5202-87D0-3D8EC16F81BF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListLaunchOptionsResponseBody build() {
            return new ListLaunchOptionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLaunchOptionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListLaunchOptionsResponseBody</p>
     */
    public static class ConstraintSummaries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConstraintType")
        private String constraintType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("OperationTypes")
        private java.util.List<String> operationTypes;

        @com.aliyun.core.annotation.NameInMap("StackRegions")
        private java.util.List<String> stackRegions;

        private ConstraintSummaries(Builder builder) {
            this.constraintType = builder.constraintType;
            this.description = builder.description;
            this.operationTypes = builder.operationTypes;
            this.stackRegions = builder.stackRegions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConstraintSummaries create() {
            return builder().build();
        }

        /**
         * @return constraintType
         */
        public String getConstraintType() {
            return this.constraintType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return operationTypes
         */
        public java.util.List<String> getOperationTypes() {
            return this.operationTypes;
        }

        /**
         * @return stackRegions
         */
        public java.util.List<String> getStackRegions() {
            return this.stackRegions;
        }

        public static final class Builder {
            private String constraintType; 
            private String description; 
            private java.util.List<String> operationTypes; 
            private java.util.List<String> stackRegions; 

            private Builder() {
            } 

            private Builder(ConstraintSummaries model) {
                this.constraintType = model.constraintType;
                this.description = model.description;
                this.operationTypes = model.operationTypes;
                this.stackRegions = model.stackRegions;
            } 

            /**
             * <p>The type of the constraint. Valid values:</p>
             * <ol>
             * <li>Launch</li>
             * <li>Template</li>
             * <li>Approval</li>
             * <li>StackRegion</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>Launch</p>
             */
            public Builder constraintType(String constraintType) {
                this.constraintType = constraintType;
                return this;
            }

            /**
             * <p>The description of the constraint.</p>
             * 
             * <strong>example:</strong>
             * <p>Launch as local role TestRole</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The types of operations that require approval. If the type of the constraint is Approval, this parameter is not empty.</p>
             */
            public Builder operationTypes(java.util.List<String> operationTypes) {
                this.operationTypes = operationTypes;
                return this;
            }

            /**
             * <p>The regions in which users can launch the service. If the type of the constraint is StackRegion, this parameter is not empty.</p>
             */
            public Builder stackRegions(java.util.List<String> stackRegions) {
                this.stackRegions = stackRegions;
                return this;
            }

            public ConstraintSummaries build() {
                return new ConstraintSummaries(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListLaunchOptionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListLaunchOptionsResponseBody</p>
     */
    public static class LaunchOptionSummaries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConstraintSummaries")
        private java.util.List<ConstraintSummaries> constraintSummaries;

        @com.aliyun.core.annotation.NameInMap("PortfolioId")
        private String portfolioId;

        @com.aliyun.core.annotation.NameInMap("PortfolioName")
        private String portfolioName;

        private LaunchOptionSummaries(Builder builder) {
            this.constraintSummaries = builder.constraintSummaries;
            this.portfolioId = builder.portfolioId;
            this.portfolioName = builder.portfolioName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchOptionSummaries create() {
            return builder().build();
        }

        /**
         * @return constraintSummaries
         */
        public java.util.List<ConstraintSummaries> getConstraintSummaries() {
            return this.constraintSummaries;
        }

        /**
         * @return portfolioId
         */
        public String getPortfolioId() {
            return this.portfolioId;
        }

        /**
         * @return portfolioName
         */
        public String getPortfolioName() {
            return this.portfolioName;
        }

        public static final class Builder {
            private java.util.List<ConstraintSummaries> constraintSummaries; 
            private String portfolioId; 
            private String portfolioName; 

            private Builder() {
            } 

            private Builder(LaunchOptionSummaries model) {
                this.constraintSummaries = model.constraintSummaries;
                this.portfolioId = model.portfolioId;
                this.portfolioName = model.portfolioName;
            } 

            /**
             * <p>The constraints.</p>
             */
            public Builder constraintSummaries(java.util.List<ConstraintSummaries> constraintSummaries) {
                this.constraintSummaries = constraintSummaries;
                return this;
            }

            /**
             * <p>The ID of the product portfolio.</p>
             * 
             * <strong>example:</strong>
             * <p>port-bp1yt7582g****</p>
             */
            public Builder portfolioId(String portfolioId) {
                this.portfolioId = portfolioId;
                return this;
            }

            /**
             * <p>The name of the product portfolio.</p>
             * 
             * <strong>example:</strong>
             * <p>DEMO-IT services</p>
             */
            public Builder portfolioName(String portfolioName) {
                this.portfolioName = portfolioName;
                return this;
            }

            public LaunchOptionSummaries build() {
                return new LaunchOptionSummaries(this);
            } 

        } 

    }
}
