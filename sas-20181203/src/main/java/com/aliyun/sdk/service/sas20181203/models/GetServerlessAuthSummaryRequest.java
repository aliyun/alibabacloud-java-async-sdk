// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetServerlessAuthSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetServerlessAuthSummaryRequest</p>
 */
public class GetServerlessAuthSummaryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppRegionId")
    private String appRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MachineType")
    private String machineType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VendorType")
    private String vendorType;

    private GetServerlessAuthSummaryRequest(Builder builder) {
        super(builder);
        this.appRegionId = builder.appRegionId;
        this.machineType = builder.machineType;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServerlessAuthSummaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appRegionId
     */
    public String getAppRegionId() {
        return this.appRegionId;
    }

    /**
     * @return machineType
     */
    public String getMachineType() {
        return this.machineType;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder extends Request.Builder<GetServerlessAuthSummaryRequest, Builder> {
        private String appRegionId; 
        private String machineType; 
        private String vendorType; 

        private Builder() {
            super();
        } 

        private Builder(GetServerlessAuthSummaryRequest request) {
            super(request);
            this.appRegionId = request.appRegionId;
            this.machineType = request.machineType;
            this.vendorType = request.vendorType;
        } 

        /**
         * <p>Application region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder appRegionId(String appRegionId) {
            this.putQueryParameter("AppRegionId", appRegionId);
            this.appRegionId = appRegionId;
            return this;
        }

        /**
         * <p>Server type: </p>
         * <ul>
         * <li><strong>RunD</strong></li>
         * <li><strong>ECI</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RunD</p>
         */
        public Builder machineType(String machineType) {
            this.putQueryParameter("MachineType", machineType);
            this.machineType = machineType;
            return this;
        }

        /**
         * <p>Cloud product: </p>
         * <ul>
         * <li><strong>ASK</strong></li>
         * <li><strong>SAE</strong></li>
         * <li><strong>ACS</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SAE</p>
         */
        public Builder vendorType(String vendorType) {
            this.putQueryParameter("VendorType", vendorType);
            this.vendorType = vendorType;
            return this;
        }

        @Override
        public GetServerlessAuthSummaryRequest build() {
            return new GetServerlessAuthSummaryRequest(this);
        } 

    } 

}
