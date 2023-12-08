// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BillingApplicationRequest} extends {@link RequestModel}
 *
 * <p>BillingApplicationRequest</p>
 */
public class BillingApplicationRequest extends Request {
    @Body
    @NameInMap("Month")
    private Integer month;

    @Body
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Body
    @NameInMap("Year")
    private Integer year;

    private BillingApplicationRequest(Builder builder) {
        super(builder);
        this.month = builder.month;
        this.resourceGroupId = builder.resourceGroupId;
        this.year = builder.year;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BillingApplicationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return month
     */
    public Integer getMonth() {
        return this.month;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return year
     */
    public Integer getYear() {
        return this.year;
    }

    public static final class Builder extends Request.Builder<BillingApplicationRequest, Builder> {
        private Integer month; 
        private String resourceGroupId; 
        private Integer year; 

        private Builder() {
            super();
        } 

        private Builder(BillingApplicationRequest request) {
            super(request);
            this.month = request.month;
            this.resourceGroupId = request.resourceGroupId;
            this.year = request.year;
        } 

        /**
         * Month.
         */
        public Builder month(Integer month) {
            this.putBodyParameter("Month", month);
            this.month = month;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Year.
         */
        public Builder year(Integer year) {
            this.putBodyParameter("Year", year);
            this.year = year;
            return this;
        }

        @Override
        public BillingApplicationRequest build() {
            return new BillingApplicationRequest(this);
        } 

    } 

}
