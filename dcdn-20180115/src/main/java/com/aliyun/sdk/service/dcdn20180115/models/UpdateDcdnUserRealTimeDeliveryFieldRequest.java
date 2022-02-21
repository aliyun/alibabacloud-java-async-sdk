// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDcdnUserRealTimeDeliveryFieldRequest} extends {@link RequestModel}
 *
 * <p>UpdateDcdnUserRealTimeDeliveryFieldRequest</p>
 */
public class UpdateDcdnUserRealTimeDeliveryFieldRequest extends Request {
    @Query
    @NameInMap("BusinessType")
    private String businessType;

    @Query
    @NameInMap("Fields")
    @Validation(required = true)
    private String fields;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private UpdateDcdnUserRealTimeDeliveryFieldRequest(Builder builder) {
        super(builder);
        this.businessType = builder.businessType;
        this.fields = builder.fields;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDcdnUserRealTimeDeliveryFieldRequest create() {
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
     * @return fields
     */
    public String getFields() {
        return this.fields;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<UpdateDcdnUserRealTimeDeliveryFieldRequest, Builder> {
        private String businessType; 
        private String fields; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDcdnUserRealTimeDeliveryFieldRequest response) {
            super(response);
            this.businessType = response.businessType;
            this.fields = response.fields;
            this.ownerId = response.ownerId;
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
         * Fields.
         */
        public Builder fields(String fields) {
            this.putQueryParameter("Fields", fields);
            this.fields = fields;
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

        @Override
        public UpdateDcdnUserRealTimeDeliveryFieldRequest build() {
            return new UpdateDcdnUserRealTimeDeliveryFieldRequest(this);
        } 

    } 

}
