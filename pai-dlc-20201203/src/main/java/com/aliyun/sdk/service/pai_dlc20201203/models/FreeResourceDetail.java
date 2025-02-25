// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link FreeResourceDetail} extends {@link TeaModel}
 *
 * <p>FreeResourceDetail</p>
 */
public class FreeResourceDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Amount")
    private Integer amount;

    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    private FreeResourceDetail(Builder builder) {
        this.amount = builder.amount;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FreeResourceDetail create() {
        return builder().build();
    }

    /**
     * @return amount
     */
    public Integer getAmount() {
        return this.amount;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder {
        private Integer amount; 
        private String resourceType; 

        /**
         * Amount.
         */
        public Builder amount(Integer amount) {
            this.amount = amount;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public FreeResourceDetail build() {
            return new FreeResourceDetail(this);
        } 

    } 

}
