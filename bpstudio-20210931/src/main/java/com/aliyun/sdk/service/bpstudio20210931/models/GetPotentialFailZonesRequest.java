// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetPotentialFailZonesRequest} extends {@link RequestModel}
 *
 * <p>GetPotentialFailZonesRequest</p>
 */
public class GetPotentialFailZonesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsPlanId")
    private Boolean isPlanId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ObjectId")
    private String objectId;

    private GetPotentialFailZonesRequest(Builder builder) {
        super(builder);
        this.isPlanId = builder.isPlanId;
        this.objectId = builder.objectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPotentialFailZonesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isPlanId
     */
    public Boolean getIsPlanId() {
        return this.isPlanId;
    }

    /**
     * @return objectId
     */
    public String getObjectId() {
        return this.objectId;
    }

    public static final class Builder extends Request.Builder<GetPotentialFailZonesRequest, Builder> {
        private Boolean isPlanId; 
        private String objectId; 

        private Builder() {
            super();
        } 

        private Builder(GetPotentialFailZonesRequest request) {
            super(request);
            this.isPlanId = request.isPlanId;
            this.objectId = request.objectId;
        } 

        /**
         * <p>Specifies whether the value of this parameter is the ID of a disaster recovery set.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isPlanId(Boolean isPlanId) {
            this.putBodyParameter("IsPlanId", isPlanId);
            this.isPlanId = isPlanId;
            return this;
        }

        /**
         * <p>If you set IsPlanId to false, specify the ID of a disaster recovery application. If you set IsPlanId to true, specify the ID of a disaster recovery set.</p>
         * 
         * <strong>example:</strong>
         * <p>FS3ATPTOSC4SE1GG</p>
         */
        public Builder objectId(String objectId) {
            this.putBodyParameter("ObjectId", objectId);
            this.objectId = objectId;
            return this;
        }

        @Override
        public GetPotentialFailZonesRequest build() {
            return new GetPotentialFailZonesRequest(this);
        } 

    } 

}
