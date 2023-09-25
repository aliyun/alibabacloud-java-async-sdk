// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDIAlarmRuleRequest} extends {@link RequestModel}
 *
 * <p>GetDIAlarmRuleRequest</p>
 */
public class GetDIAlarmRuleRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("DIAlarmRuleId")
    @Validation(required = true)
    private Long DIAlarmRuleId;

    private GetDIAlarmRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.DIAlarmRuleId = builder.DIAlarmRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDIAlarmRuleRequest create() {
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
     * @return DIAlarmRuleId
     */
    public Long getDIAlarmRuleId() {
        return this.DIAlarmRuleId;
    }

    public static final class Builder extends Request.Builder<GetDIAlarmRuleRequest, Builder> {
        private String regionId; 
        private Long DIAlarmRuleId; 

        private Builder() {
            super();
        } 

        private Builder(GetDIAlarmRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.DIAlarmRuleId = request.DIAlarmRuleId;
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
         * DIAlarmRuleId.
         */
        public Builder DIAlarmRuleId(Long DIAlarmRuleId) {
            this.putBodyParameter("DIAlarmRuleId", DIAlarmRuleId);
            this.DIAlarmRuleId = DIAlarmRuleId;
            return this;
        }

        @Override
        public GetDIAlarmRuleRequest build() {
            return new GetDIAlarmRuleRequest(this);
        } 

    } 

}
