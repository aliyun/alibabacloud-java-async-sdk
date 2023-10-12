// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInspectionTaskReportsRequest} extends {@link RequestModel}
 *
 * <p>ListInspectionTaskReportsRequest</p>
 */
public class ListInspectionTaskReportsRequest extends Request {
    @Query
    @NameInMap("InspectionItemId")
    private String inspectionItemId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Vendor")
    private String vendor;

    private ListInspectionTaskReportsRequest(Builder builder) {
        super(builder);
        this.inspectionItemId = builder.inspectionItemId;
        this.instanceId = builder.instanceId;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInspectionTaskReportsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return inspectionItemId
     */
    public String getInspectionItemId() {
        return this.inspectionItemId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder extends Request.Builder<ListInspectionTaskReportsRequest, Builder> {
        private String inspectionItemId; 
        private String instanceId; 
        private String vendor; 

        private Builder() {
            super();
        } 

        private Builder(ListInspectionTaskReportsRequest request) {
            super(request);
            this.inspectionItemId = request.inspectionItemId;
            this.instanceId = request.instanceId;
            this.vendor = request.vendor;
        } 

        /**
         * InspectionItemId.
         */
        public Builder inspectionItemId(String inspectionItemId) {
            this.putQueryParameter("InspectionItemId", inspectionItemId);
            this.inspectionItemId = inspectionItemId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Vendor.
         */
        public Builder vendor(String vendor) {
            this.putQueryParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        @Override
        public ListInspectionTaskReportsRequest build() {
            return new ListInspectionTaskReportsRequest(this);
        } 

    } 

}
