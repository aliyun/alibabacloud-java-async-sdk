// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSceneDefensePolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateSceneDefensePolicyRequest</p>
 */
public class CreateSceneDefensePolicyRequest extends Request {
    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    @Query
    @NameInMap("Template")
    @Validation(required = true)
    private String template;

    private CreateSceneDefensePolicyRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
        this.template = builder.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSceneDefensePolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
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
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return template
     */
    public String getTemplate() {
        return this.template;
    }

    public static final class Builder extends Request.Builder<CreateSceneDefensePolicyRequest, Builder> {
        private Long endTime; 
        private String name; 
        private String regionId; 
        private Long startTime; 
        private String template; 

        private Builder() {
            super();
        } 

        private Builder(CreateSceneDefensePolicyRequest response) {
            super(response);
            this.endTime = response.endTime;
            this.name = response.name;
            this.regionId = response.regionId;
            this.startTime = response.startTime;
            this.template = response.template;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Template.
         */
        public Builder template(String template) {
            this.putQueryParameter("Template", template);
            this.template = template;
            return this;
        }

        @Override
        public CreateSceneDefensePolicyRequest build() {
            return new CreateSceneDefensePolicyRequest(this);
        } 

    } 

}
