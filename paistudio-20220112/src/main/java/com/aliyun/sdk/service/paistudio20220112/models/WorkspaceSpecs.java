// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link WorkspaceSpecs} extends {@link TeaModel}
 *
 * <p>WorkspaceSpecs</p>
 */
public class WorkspaceSpecs extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Product")
    private String product;

    @com.aliyun.core.annotation.NameInMap("Specs")
    private java.util.List < WorkspaceSpec > specs;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private WorkspaceSpecs(Builder builder) {
        this.product = builder.product;
        this.specs = builder.specs;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WorkspaceSpecs create() {
        return builder().build();
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return specs
     */
    public java.util.List < WorkspaceSpec > getSpecs() {
        return this.specs;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String product; 
        private java.util.List < WorkspaceSpec > specs; 
        private String workspaceId; 

        /**
         * Product.
         */
        public Builder product(String product) {
            this.product = product;
            return this;
        }

        /**
         * Specs.
         */
        public Builder specs(java.util.List < WorkspaceSpec > specs) {
            this.specs = specs;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public WorkspaceSpecs build() {
            return new WorkspaceSpecs(this);
        } 

    } 

}
