// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateVpcPrefixListResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVpcPrefixListResponseBody</p>
 */
public class CreateVpcPrefixListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PrefixListId")
    private String prefixListId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private CreateVpcPrefixListResponseBody(Builder builder) {
        this.prefixListId = builder.prefixListId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpcPrefixListResponseBody create() {
        return builder().build();
    }

    /**
     * @return prefixListId
     */
    public String getPrefixListId() {
        return this.prefixListId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder {
        private String prefixListId; 
        private String requestId; 
        private String resourceGroupId; 

        /**
         * <p>The ID of the prefix list.</p>
         * 
         * <strong>example:</strong>
         * <p>pl-0b700s2ee3***</p>
         */
        public Builder prefixListId(String prefixListId) {
            this.prefixListId = prefixListId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>54B48E3D-DF70-471B-AA93-08E683A1B45</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the prefix list belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4ph****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        public CreateVpcPrefixListResponseBody build() {
            return new CreateVpcPrefixListResponseBody(this);
        } 

    } 

}
