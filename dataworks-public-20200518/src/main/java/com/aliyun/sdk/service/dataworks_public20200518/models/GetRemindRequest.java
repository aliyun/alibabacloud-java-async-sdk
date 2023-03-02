// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRemindRequest} extends {@link RequestModel}
 *
 * <p>GetRemindRequest</p>
 */
public class GetRemindRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("RemindId")
    @Validation(required = true)
    private Long remindId;

    private GetRemindRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.remindId = builder.remindId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRemindRequest create() {
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
     * @return remindId
     */
    public Long getRemindId() {
        return this.remindId;
    }

    public static final class Builder extends Request.Builder<GetRemindRequest, Builder> {
        private String regionId; 
        private Long remindId; 

        private Builder() {
            super();
        } 

        private Builder(GetRemindRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.remindId = request.remindId;
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
         * The ID of the custom alert rule.
         */
        public Builder remindId(Long remindId) {
            this.putBodyParameter("RemindId", remindId);
            this.remindId = remindId;
            return this;
        }

        @Override
        public GetRemindRequest build() {
            return new GetRemindRequest(this);
        } 

    } 

}
