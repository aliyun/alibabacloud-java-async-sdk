// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindAIPlanWithDevicesRequest} extends {@link RequestModel}
 *
 * <p>BindAIPlanWithDevicesRequest</p>
 */
public class BindAIPlanWithDevicesRequest extends Request {
    @Query
    @NameInMap("IotIdList")
    @Validation(required = true)
    private java.util.List < String > iotIdList;

    @Query
    @NameInMap("PlanId")
    @Validation(required = true)
    private String planId;

    private BindAIPlanWithDevicesRequest(Builder builder) {
        super(builder);
        this.iotIdList = builder.iotIdList;
        this.planId = builder.planId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindAIPlanWithDevicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotIdList
     */
    public java.util.List < String > getIotIdList() {
        return this.iotIdList;
    }

    /**
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    public static final class Builder extends Request.Builder<BindAIPlanWithDevicesRequest, Builder> {
        private java.util.List < String > iotIdList; 
        private String planId; 

        private Builder() {
            super();
        } 

        private Builder(BindAIPlanWithDevicesRequest response) {
            super(response);
            this.iotIdList = response.iotIdList;
            this.planId = response.planId;
        } 

        /**
         * IotIdList.
         */
        public Builder iotIdList(java.util.List < String > iotIdList) {
            this.putQueryParameter("IotIdList", iotIdList);
            this.iotIdList = iotIdList;
            return this;
        }

        /**
         * PlanId.
         */
        public Builder planId(String planId) {
            this.putQueryParameter("PlanId", planId);
            this.planId = planId;
            return this;
        }

        @Override
        public BindAIPlanWithDevicesRequest build() {
            return new BindAIPlanWithDevicesRequest(this);
        } 

    } 

}
