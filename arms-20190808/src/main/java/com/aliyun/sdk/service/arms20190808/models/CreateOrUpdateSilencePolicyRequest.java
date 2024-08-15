// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateSilencePolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateOrUpdateSilencePolicyRequest</p>
 */
public class CreateOrUpdateSilencePolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveTimeType")
    private String effectiveTimeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MatchingRules")
    private String matchingRules;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimePeriod")
    private String timePeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeSlots")
    private String timeSlots;

    private CreateOrUpdateSilencePolicyRequest(Builder builder) {
        super(builder);
        this.effectiveTimeType = builder.effectiveTimeType;
        this.id = builder.id;
        this.matchingRules = builder.matchingRules;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.state = builder.state;
        this.timePeriod = builder.timePeriod;
        this.timeSlots = builder.timeSlots;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrUpdateSilencePolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return effectiveTimeType
     */
    public String getEffectiveTimeType() {
        return this.effectiveTimeType;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return matchingRules
     */
    public String getMatchingRules() {
        return this.matchingRules;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return timePeriod
     */
    public String getTimePeriod() {
        return this.timePeriod;
    }

    /**
     * @return timeSlots
     */
    public String getTimeSlots() {
        return this.timeSlots;
    }

    public static final class Builder extends Request.Builder<CreateOrUpdateSilencePolicyRequest, Builder> {
        private String effectiveTimeType; 
        private Long id; 
        private String matchingRules; 
        private String name; 
        private String regionId; 
        private String state; 
        private String timePeriod; 
        private String timeSlots; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrUpdateSilencePolicyRequest request) {
            super(request);
            this.effectiveTimeType = request.effectiveTimeType;
            this.id = request.id;
            this.matchingRules = request.matchingRules;
            this.name = request.name;
            this.regionId = request.regionId;
            this.state = request.state;
            this.timePeriod = request.timePeriod;
            this.timeSlots = request.timeSlots;
        } 

        /**
         * EffectiveTimeType.
         */
        public Builder effectiveTimeType(String effectiveTimeType) {
            this.putQueryParameter("EffectiveTimeType", effectiveTimeType);
            this.effectiveTimeType = effectiveTimeType;
            return this;
        }

        /**
         * The ID of the silence policy.
         * <p>
         * 
         * *   If you do not configure this parameter, a new silence policy is created.
         * *   If you configure this parameter, the specified silence policy is modified.
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The matching rules. The following code shows the format of matching rules:
         * <p>
         * 
         *     [
         *          {
         *     	 "matchingConditions": [
         *     	 {
         *     	 "value": "test", // The value of the matching condition. 
         *     	 "key": "altertname", // The key of the matching condition. 
         *     	 "operator": "eq" // The logical operator of the matching condition, including eq (equal to), neq (not equal to), in (contains), nin (does not contain), re (regular expression match), and nre (regular expression mismatch).   
         *     	 }
         *     	 ]
         *          }
         *     	 ]
         */
        public Builder matchingRules(String matchingRules) {
            this.putBodyParameter("MatchingRules", matchingRules);
            this.matchingRules = matchingRules;
            return this;
        }

        /**
         * The name of the silence policy.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies whether to enable the silence policy. Valid values: enable and disable.
         */
        public Builder state(String state) {
            this.putBodyParameter("State", state);
            this.state = state;
            return this;
        }

        /**
         * TimePeriod.
         */
        public Builder timePeriod(String timePeriod) {
            this.putQueryParameter("TimePeriod", timePeriod);
            this.timePeriod = timePeriod;
            return this;
        }

        /**
         * TimeSlots.
         */
        public Builder timeSlots(String timeSlots) {
            this.putQueryParameter("TimeSlots", timeSlots);
            this.timeSlots = timeSlots;
            return this;
        }

        @Override
        public CreateOrUpdateSilencePolicyRequest build() {
            return new CreateOrUpdateSilencePolicyRequest(this);
        } 

    } 

}
