// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FreeResourceDetail} extends {@link TeaModel}
 *
 * <p>FreeResourceDetail</p>
 */
public class FreeResourceDetail extends TeaModel {
    @NameInMap("Amount")
    private Integer amount;

    @NameInMap("ResourceType")
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
         * 资源数量
         */
        public Builder amount(Integer amount) {
            this.amount = amount;
            return this;
        }

        /**
         * 资源类型
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
