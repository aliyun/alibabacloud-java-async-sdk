// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
         * <p>The ID of the GA instance that you want to query.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp1odcab8tmno0hdq****</p>
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * <p>The type of the Global Accelerator (GA) instance to be queried. Valid values:</p>
         * <ul>
         * <li><strong>basic</strong>: basic GA instance</li>
         * <li><strong>standard</strong>: standard GA instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>basic</p>
         */
        public Builder acceleratorType(String acceleratorType) {
            this.putQueryParameter("AcceleratorType", acceleratorType);
            this.acceleratorType = acceleratorType;
            return this;
        }

        /**
         * <p>The ID of the acceleration region to be queried.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
