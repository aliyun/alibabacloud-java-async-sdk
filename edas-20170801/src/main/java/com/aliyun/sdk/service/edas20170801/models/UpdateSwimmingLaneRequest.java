// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSwimmingLaneRequest} extends {@link RequestModel}
 *
 * <p>UpdateSwimmingLaneRequest</p>
 */
public class UpdateSwimmingLaneRequest extends Request {
    @Query
    @NameInMap("AppInfos")
    private String appInfos;

    @Query
    @NameInMap("EnableRules")
    @Validation(required = true)
    private Boolean enableRules;

    @Query
    @NameInMap("EntryRules")
    private String entryRules;

    @Query
    @NameInMap("LaneId")
    @Validation(required = true)
    private Long laneId;

    @Query
    @NameInMap("Name")
    private String name;

    private UpdateSwimmingLaneRequest(Builder builder) {
        super(builder);
        this.appInfos = builder.appInfos;
        this.enableRules = builder.enableRules;
        this.entryRules = builder.entryRules;
        this.laneId = builder.laneId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSwimmingLaneRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInfos
     */
    public String getAppInfos() {
        return this.appInfos;
    }

    /**
     * @return enableRules
     */
    public Boolean getEnableRules() {
        return this.enableRules;
    }

    /**
     * @return entryRules
     */
    public String getEntryRules() {
        return this.entryRules;
    }

    /**
     * @return laneId
     */
    public Long getLaneId() {
        return this.laneId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateSwimmingLaneRequest, Builder> {
        private String appInfos; 
        private Boolean enableRules; 
        private String entryRules; 
        private Long laneId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSwimmingLaneRequest request) {
            super(request);
            this.appInfos = request.appInfos;
            this.enableRules = request.enableRules;
            this.entryRules = request.entryRules;
            this.laneId = request.laneId;
            this.name = request.name;
        } 

        /**
         * The list of applications that are related to the lane.
         */
        public Builder appInfos(String appInfos) {
            this.putQueryParameter("AppInfos", appInfos);
            this.appInfos = appInfos;
            return this;
        }

        /**
         * Specifies whether to enable the throttling rule.
         */
        public Builder enableRules(Boolean enableRules) {
            this.putQueryParameter("EnableRules", enableRules);
            this.enableRules = enableRules;
            return this;
        }

        /**
         * The configuration of the throttling rule.
         */
        public Builder entryRules(String entryRules) {
            this.putQueryParameter("EntryRules", entryRules);
            this.entryRules = entryRules;
            return this;
        }

        /**
         * The ID of the lane.
         */
        public Builder laneId(Long laneId) {
            this.putQueryParameter("LaneId", laneId);
            this.laneId = laneId;
            return this;
        }

        /**
         * The name of the lane.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateSwimmingLaneRequest build() {
            return new UpdateSwimmingLaneRequest(this);
        } 

    } 

}
