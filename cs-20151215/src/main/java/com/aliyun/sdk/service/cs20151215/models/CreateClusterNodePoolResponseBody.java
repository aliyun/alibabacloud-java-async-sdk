// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClusterNodePoolResponseBody} extends {@link TeaModel}
 *
 * <p>CreateClusterNodePoolResponseBody</p>
 */
public class CreateClusterNodePoolResponseBody extends TeaModel {
    @NameInMap("nodepool_id")
    private String nodepoolId;

    private CreateClusterNodePoolResponseBody(Builder builder) {
        this.nodepoolId = builder.nodepoolId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClusterNodePoolResponseBody create() {
        return builder().build();
    }

    /**
     * @return nodepoolId
     */
    public String getNodepoolId() {
        return this.nodepoolId;
    }

    public static final class Builder {
        private String nodepoolId; 

        /**
         * 节点池ID
         */
        public Builder nodepoolId(String nodepoolId) {
            this.nodepoolId = nodepoolId;
            return this;
        }

        public CreateClusterNodePoolResponseBody build() {
            return new CreateClusterNodePoolResponseBody(this);
        } 

    } 

}
