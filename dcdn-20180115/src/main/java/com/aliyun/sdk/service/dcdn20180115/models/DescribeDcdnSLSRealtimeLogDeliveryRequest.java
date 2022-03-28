// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnSLSRealtimeLogDeliveryRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnSLSRealtimeLogDeliveryRequest</p>
 */
public class DescribeDcdnSLSRealtimeLogDeliveryRequest extends Request {
    @Query
    @NameInMap("BusinessType")
    private String businessType;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ProjectName")
    @Validation(required = true)
    private String projectName;

    private DescribeDcdnSLSRealtimeLogDeliveryRequest(Builder builder) {
        super(builder);
        this.businessType = builder.businessType;
        this.ownerId = builder.ownerId;
        this.projectName = builder.projectName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnSLSRealtimeLogDeliveryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    public static final class Builder extends Request.Builder<DescribeDcdnSLSRealtimeLogDeliveryRequest, Builder> {
        private String businessType; 
        private Long ownerId; 
        private String projectName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnSLSRealtimeLogDeliveryRequest request) {
            super(request);
            this.businessType = request.businessType;
            this.ownerId = request.ownerId;
            this.projectName = request.projectName;
        } 

        /**
         * BusinessType.
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        @Override
        public DescribeDcdnSLSRealtimeLogDeliveryRequest build() {
            return new DescribeDcdnSLSRealtimeLogDeliveryRequest(this);
        } 

    } 

}
