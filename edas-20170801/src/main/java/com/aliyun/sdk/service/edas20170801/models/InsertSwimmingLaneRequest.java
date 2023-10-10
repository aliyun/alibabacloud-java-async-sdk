// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertSwimmingLaneRequest} extends {@link RequestModel}
 *
 * <p>InsertSwimmingLaneRequest</p>
 */
public class InsertSwimmingLaneRequest extends Request {
    @Query
    @NameInMap("AppInfos")
    private String appInfos;

    @Query
    @NameInMap("EnableRules")
    private Boolean enableRules;

    @Query
    @NameInMap("EntryRules")
    @Validation(required = true)
    private String entryRules;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private Long groupId;

    @Query
    @NameInMap("LogicalRegionId")
    @Validation(required = true)
    private String logicalRegionId;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("Tag")
    @Validation(required = true)
    private String tag;

    private InsertSwimmingLaneRequest(Builder builder) {
        super(builder);
        this.appInfos = builder.appInfos;
        this.enableRules = builder.enableRules;
        this.entryRules = builder.entryRules;
        this.groupId = builder.groupId;
        this.logicalRegionId = builder.logicalRegionId;
        this.name = builder.name;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertSwimmingLaneRequest create() {
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
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return logicalRegionId
     */
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<InsertSwimmingLaneRequest, Builder> {
        private String appInfos; 
        private Boolean enableRules; 
        private String entryRules; 
        private Long groupId; 
        private String logicalRegionId; 
        private String name; 
        private String tag; 

        private Builder() {
            super();
        } 

        private Builder(InsertSwimmingLaneRequest request) {
            super(request);
            this.appInfos = request.appInfos;
            this.enableRules = request.enableRules;
            this.entryRules = request.entryRules;
            this.groupId = request.groupId;
            this.logicalRegionId = request.logicalRegionId;
            this.name = request.name;
            this.tag = request.tag;
        } 

        /**
         * The information about applications related to the lane.
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
         * The throttling conditions.
         */
        public Builder entryRules(String entryRules) {
            this.putQueryParameter("EntryRules", entryRules);
            this.entryRules = entryRules;
            return this;
        }

        /**
         * The ID of the lane group.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The ID of the custom namespace. The ID is in the `physical region ID:custom namespace identifier` format. Example: `cn-hangzhou:test`.
         */
        public Builder logicalRegionId(String logicalRegionId) {
            this.putQueryParameter("LogicalRegionId", logicalRegionId);
            this.logicalRegionId = logicalRegionId;
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

        /**
         * The tag.
         */
        public Builder tag(String tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public InsertSwimmingLaneRequest build() {
            return new InsertSwimmingLaneRequest(this);
        } 

    } 

}
