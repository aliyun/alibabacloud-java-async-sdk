// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetOncallScheduleRequest} extends {@link RequestModel}
 *
 * <p>GetOncallScheduleRequest</p>
 */
public class GetOncallScheduleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("oncallScheduleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String oncallScheduleId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetOncallScheduleRequest(Builder builder) {
        super(builder);
        this.oncallScheduleId = builder.oncallScheduleId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOncallScheduleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return oncallScheduleId
     */
    public String getOncallScheduleId() {
        return this.oncallScheduleId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetOncallScheduleRequest, Builder> {
        private String oncallScheduleId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetOncallScheduleRequest request) {
            super(request);
            this.oncallScheduleId = request.oncallScheduleId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The unique identifier of the on-call schedule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testId</p>
         */
        public Builder oncallScheduleId(String oncallScheduleId) {
            this.putPathParameter("oncallScheduleId", oncallScheduleId);
            this.oncallScheduleId = oncallScheduleId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetOncallScheduleRequest build() {
            return new GetOncallScheduleRequest(this);
        } 

    } 

}
