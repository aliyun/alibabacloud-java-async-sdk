// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDIAlarmRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteDIAlarmRuleRequest</p>
 */
public class DeleteDIAlarmRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DIAlarmRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long DIAlarmRuleId;

    private DeleteDIAlarmRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.DIAlarmRuleId = builder.DIAlarmRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDIAlarmRuleRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteDIAlarmRuleRequest, Builder> {
        private String regionId; 
        private Long DIAlarmRuleId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDIAlarmRuleRequest request) {
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
         * The alert rule ID.
         */
        public Builder DIAlarmRuleId(Long DIAlarmRuleId) {
            this.putBodyParameter("DIAlarmRuleId", DIAlarmRuleId);
            this.DIAlarmRuleId = DIAlarmRuleId;
            return this;
        }

        @Override
        public DeleteDIAlarmRuleRequest build() {
            return new DeleteDIAlarmRuleRequest(this);
        } 

    } 

}
