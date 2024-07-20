// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIspTypesRequest} extends {@link RequestModel}
 *
 * <p>ListIspTypesRequest</p>
 */
public class ListIspTypesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    private String acceleratorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceleratorType")
    private String acceleratorType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String businessRegionId;

    private ListIspTypesRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.acceleratorType = builder.acceleratorType;
        this.businessRegionId = builder.businessRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIspTypesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return acceleratorType
     */
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    /**
     * @return businessRegionId
     */
    public String getBusinessRegionId() {
        return this.businessRegionId;
    }

    public static final class Builder extends Request.Builder<ListIspTypesRequest, Builder> {
        private String acceleratorId; 
        private String acceleratorType; 
        private String businessRegionId; 

        private Builder() {
            super();
        } 

        private Builder(ListIspTypesRequest request) {
            super(request);
            this.acceleratorId = request.acceleratorId;
            this.acceleratorType = request.acceleratorType;
            this.businessRegionId = request.businessRegionId;
        } 

        /**
         * The ID of the GA instance that you want to query.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * The type of the Global Accelerator (GA) instance to be queried. Valid values:
         * <p>
         * 
         * *   **basic**: basic GA instance
         * *   **standard**: standard GA instance
         */
        public Builder acceleratorType(String acceleratorType) {
            this.putQueryParameter("AcceleratorType", acceleratorType);
            this.acceleratorType = acceleratorType;
            return this;
        }

        /**
         * The ID of the acceleration region to be queried.
         */
        public Builder businessRegionId(String businessRegionId) {
            this.putQueryParameter("BusinessRegionId", businessRegionId);
            this.businessRegionId = businessRegionId;
            return this;
        }

        @Override
        public ListIspTypesRequest build() {
            return new ListIspTypesRequest(this);
        } 

    } 

}
