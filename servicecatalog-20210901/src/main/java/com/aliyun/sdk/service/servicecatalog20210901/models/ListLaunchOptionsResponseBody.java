// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLaunchOptionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListLaunchOptionsResponseBody</p>
 */
public class ListLaunchOptionsResponseBody extends TeaModel {
    @NameInMap("LaunchOptionSummaries")
    private java.util.List < LaunchOptionSummaries> launchOptionSummaries;

    @NameInMap("RequestId")
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

    /**
     * @return launchOptionSummaries
     */
    public java.util.List < LaunchOptionSummaries> getLaunchOptionSummaries() {
        return this.launchOptionSummaries;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < LaunchOptionSummaries> launchOptionSummaries; 
        private String requestId; 

        /**
         * The launch options.
         */
        public Builder launchOptionSummaries(java.util.List < LaunchOptionSummaries> launchOptionSummaries) {
            this.launchOptionSummaries = launchOptionSummaries;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListLaunchOptionsResponseBody build() {
            return new ListLaunchOptionsResponseBody(this);
        } 

    } 

    public static class ConstraintSummaries extends TeaModel {
        @NameInMap("ConstraintType")
        private String constraintType;

        @NameInMap("Description")
        private String description;

        @NameInMap("OperationTypes")
        private java.util.List < String > operationTypes;

        @NameInMap("StackRegions")
        private java.util.List < String > stackRegions;

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
        public java.util.List < String > getOperationTypes() {
            return this.operationTypes;
        }

        /**
         * @return stackRegions
         */
        public java.util.List < String > getStackRegions() {
            return this.stackRegions;
        }

        public static final class Builder {
            private String constraintType; 
            private String description; 
            private java.util.List < String > operationTypes; 
            private java.util.List < String > stackRegions; 

            /**
             * The type of the constraint. Valid values:
             * <p>
             * 
             * 1.  Launch
             * 2.  Template
             * 3.  Approval
             * 4.  StackRegion
             */
            public Builder constraintType(String constraintType) {
                this.constraintType = constraintType;
                return this;
            }

            /**
             * The description of the constraint.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The types of operations that require approval. If the type of the constraint is Approval, this parameter is not empty.
             */
            public Builder operationTypes(java.util.List < String > operationTypes) {
                this.operationTypes = operationTypes;
                return this;
            }

            /**
             * The regions in which users can launch the service. If the type of the constraint is StackRegion, this parameter is not empty.
             */
            public Builder stackRegions(java.util.List < String > stackRegions) {
                this.stackRegions = stackRegions;
                return this;
            }

            public ConstraintSummaries build() {
                return new ConstraintSummaries(this);
            } 

        } 

    }
    public static class LaunchOptionSummaries extends TeaModel {
        @NameInMap("ConstraintSummaries")
        private java.util.List < ConstraintSummaries> constraintSummaries;

        @NameInMap("PortfolioId")
        private String portfolioId;

        @NameInMap("PortfolioName")
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
        public java.util.List < ConstraintSummaries> getConstraintSummaries() {
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
            private java.util.List < ConstraintSummaries> constraintSummaries; 
            private String portfolioId; 
            private String portfolioName; 

            /**
             * The constraints.
             */
            public Builder constraintSummaries(java.util.List < ConstraintSummaries> constraintSummaries) {
                this.constraintSummaries = constraintSummaries;
                return this;
            }

            /**
             * The ID of the product portfolio.
             */
            public Builder portfolioId(String portfolioId) {
                this.portfolioId = portfolioId;
                return this;
            }

            /**
             * The name of the product portfolio.
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
