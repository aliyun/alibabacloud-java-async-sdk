// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateJobMonitorRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateJobMonitorRuleRequest</p>
 */
public class CreateJobMonitorRuleRequest extends Request {
    @Query
    @NameInMap("DelayRuleTime")
    private Long delayRuleTime;

    @Query
    @NameInMap("DtsJobId")
    @Validation(required = true)
    private String dtsJobId;

    @Query
    @NameInMap("Phone")
    private String phone;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("State")
    private String state;

    @Query
    @NameInMap("Type")
    private String type;

    private CreateJobMonitorRuleRequest(Builder builder) {
        super(builder);
        this.delayRuleTime = builder.delayRuleTime;
        this.dtsJobId = builder.dtsJobId;
        this.phone = builder.phone;
        this.regionId = builder.regionId;
        this.state = builder.state;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateJobMonitorRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return delayRuleTime
     */
    public Long getDelayRuleTime() {
        return this.delayRuleTime;
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateJobMonitorRuleRequest, Builder> {
        private Long delayRuleTime; 
        private String dtsJobId; 
        private String phone; 
        private String regionId; 
        private String state; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateJobMonitorRuleRequest response) {
            super(response);
            this.delayRuleTime = response.delayRuleTime;
            this.dtsJobId = response.dtsJobId;
            this.phone = response.phone;
            this.regionId = response.regionId;
            this.state = response.state;
            this.type = response.type;
        } 

        /**
         * DelayRuleTime.
         */
        public Builder delayRuleTime(Long delayRuleTime) {
            this.putQueryParameter("DelayRuleTime", delayRuleTime);
            this.delayRuleTime = delayRuleTime;
            return this;
        }

        /**
         * DtsJobId.
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * Phone.
         */
        public Builder phone(String phone) {
            this.putQueryParameter("Phone", phone);
            this.phone = phone;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * State.
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateJobMonitorRuleRequest build() {
            return new CreateJobMonitorRuleRequest(this);
        } 

    } 

}
