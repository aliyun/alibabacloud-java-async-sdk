// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddAssetSelectionCriteriaRequest} extends {@link RequestModel}
 *
 * <p>AddAssetSelectionCriteriaRequest</p>
 */
public class AddAssetSelectionCriteriaRequest extends Request {
    @Query
    @NameInMap("Criteria")
    private String criteria;

    @Query
    @NameInMap("CriteriaOperation")
    private String criteriaOperation;

    @Query
    @NameInMap("SelectionKey")
    @Validation(required = true)
    private String selectionKey;

    @Query
    @NameInMap("TargetOperationList")
    private java.util.List < TargetOperationList> targetOperationList;

    private AddAssetSelectionCriteriaRequest(Builder builder) {
        super(builder);
        this.criteria = builder.criteria;
        this.criteriaOperation = builder.criteriaOperation;
        this.selectionKey = builder.selectionKey;
        this.targetOperationList = builder.targetOperationList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAssetSelectionCriteriaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return criteria
     */
    public String getCriteria() {
        return this.criteria;
    }

    /**
     * @return criteriaOperation
     */
    public String getCriteriaOperation() {
        return this.criteriaOperation;
    }

    /**
     * @return selectionKey
     */
    public String getSelectionKey() {
        return this.selectionKey;
    }

    /**
     * @return targetOperationList
     */
    public java.util.List < TargetOperationList> getTargetOperationList() {
        return this.targetOperationList;
    }

    public static final class Builder extends Request.Builder<AddAssetSelectionCriteriaRequest, Builder> {
        private String criteria; 
        private String criteriaOperation; 
        private String selectionKey; 
        private java.util.List < TargetOperationList> targetOperationList; 

        private Builder() {
            super();
        } 

        private Builder(AddAssetSelectionCriteriaRequest request) {
            super(request);
            this.criteria = request.criteria;
            this.criteriaOperation = request.criteriaOperation;
            this.selectionKey = request.selectionKey;
            this.targetOperationList = request.targetOperationList;
        } 

        /**
         * The search conditions that are used to query assets. The value of this parameter is in the JSON format and is case-sensitive.
         * <p>
         * 
         * > A search condition can be an instance ID, instance name, virtual private cloud (VPC) ID, region, or public IP address. You can call the [DescribeCriteria](~~DescribeCriteria~~) operation to query the supported search conditions.
         */
        public Builder criteria(String criteria) {
            this.putQueryParameter("Criteria", criteria);
            this.criteria = criteria;
            return this;
        }

        /**
         * The type of the operation on search conditions. Valid values:
         * <p>
         * 
         * *   **add**: adds assets.
         * *   **del**: deletes assets.
         */
        public Builder criteriaOperation(String criteriaOperation) {
            this.putQueryParameter("CriteriaOperation", criteriaOperation);
            this.criteriaOperation = criteriaOperation;
            return this;
        }

        /**
         * The unique ID of the asset.
         */
        public Builder selectionKey(String selectionKey) {
            this.putQueryParameter("SelectionKey", selectionKey);
            this.selectionKey = selectionKey;
            return this;
        }

        /**
         * The list of assets.
         */
        public Builder targetOperationList(java.util.List < TargetOperationList> targetOperationList) {
            this.putQueryParameter("TargetOperationList", targetOperationList);
            this.targetOperationList = targetOperationList;
            return this;
        }

        @Override
        public AddAssetSelectionCriteriaRequest build() {
            return new AddAssetSelectionCriteriaRequest(this);
        } 

    } 

    public static class TargetOperationList extends TeaModel {
        @NameInMap("Operation")
        private String operation;

        @NameInMap("Target")
        private String target;

        private TargetOperationList(Builder builder) {
            this.operation = builder.operation;
            this.target = builder.target;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetOperationList create() {
            return builder().build();
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        public static final class Builder {
            private String operation; 
            private String target; 

            /**
             * The type of the operation. Valid values:
             * <p>
             * 
             * *   **add**
             * *   **del**
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * The ID of the asset.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            public TargetOperationList build() {
                return new TargetOperationList(this);
            } 

        } 

    }
}
