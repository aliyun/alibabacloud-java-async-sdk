// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDIJobRequest} extends {@link RequestModel}
 *
 * <p>DeleteDIJobRequest</p>
 */
public class DeleteDIJobRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("DIJobId")
    @Validation(required = true)
    private Long DIJobId;

    private DeleteDIJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.DIJobId = builder.DIJobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDIJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return DIJobId
     */
    public Long getDIJobId() {
        return this.DIJobId;
    }

    public static final class Builder extends Request.Builder<DeleteDIJobRequest, Builder> {
        private String regionId; 
        private Long DIJobId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDIJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.DIJobId = request.DIJobId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * DIJobId.
         */
        public Builder DIJobId(Long DIJobId) {
            this.putBodyParameter("DIJobId", DIJobId);
            this.DIJobId = DIJobId;
            return this;
        }

        @Override
        public DeleteDIJobRequest build() {
            return new DeleteDIJobRequest(this);
        } 

    } 

}
