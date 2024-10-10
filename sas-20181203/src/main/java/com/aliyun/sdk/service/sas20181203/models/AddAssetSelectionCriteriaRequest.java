// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddAssetSelectionCriteriaRequest} extends {@link RequestModel}
 *
 * <p>AddAssetSelectionCriteriaRequest</p>
 */
public class AddAssetSelectionCriteriaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Criteria")
    private String criteria;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CriteriaOperation")
    private String criteriaOperation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SelectionKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String selectionKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetOperationList")
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
         * <p>The search conditions that are used to query assets. The value of this parameter is in the JSON format and is case-sensitive.</p>
         * <blockquote>
         * <p>A search condition can be an instance ID, instance name, virtual private cloud (VPC) ID, region, or public IP address. You can call the <a href="~~DescribeCriteria~~">DescribeCriteria</a> operation to query the supported search conditions.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;LogicalExp&quot;:&quot;AND&quot;,&quot;Criteria&quot;:&quot;[{&quot;name&quot;:&quot;osType&quot;,&quot;value&quot;:&quot;linux&quot;,&quot;logicalExp&quot;:&quot;AND&quot;},{&quot;name&quot;:&quot;alarmStatus&quot;,&quot;value&quot;:&quot;YES&quot;,&quot;logicalExp&quot;:&quot;AND&quot;}]&quot;}</p>
         */
        public Builder criteria(String criteria) {
            this.putQueryParameter("Criteria", criteria);
            this.criteria = criteria;
            return this;
        }

        /**
         * <p>The type of the operation on search conditions. Valid values:</p>
         * <ul>
         * <li><strong>add</strong>: adds assets.</li>
         * <li><strong>del</strong>: deletes assets.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        public Builder criteriaOperation(String criteriaOperation) {
            this.putQueryParameter("CriteriaOperation", criteriaOperation);
            this.criteriaOperation = criteriaOperation;
            return this;
        }

        /**
         * <p>The unique ID of the asset.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5196d280-5bfa-496a-ba70-8a3935e3****</p>
         */
        public Builder selectionKey(String selectionKey) {
            this.putQueryParameter("SelectionKey", selectionKey);
            this.selectionKey = selectionKey;
            return this;
        }

        /**
         * <p>The list of assets.</p>
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

    /**
     * 
     * {@link AddAssetSelectionCriteriaRequest} extends {@link TeaModel}
     *
     * <p>AddAssetSelectionCriteriaRequest</p>
     */
    public static class TargetOperationList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Operation")
        private String operation;

        @com.aliyun.core.annotation.NameInMap("Target")
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
             * <p>The type of the operation. Valid values:</p>
             * <ul>
             * <li><strong>add</strong></li>
             * <li><strong>del</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>del</p>
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * <p>The ID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>1188****</p>
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
