// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDesktopOversoldGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyDesktopOversoldGroupRequest</p>
 */
public class ModifyDesktopOversoldGroupRequest extends Request {
    @Query
    @NameInMap("ConcurrenceCount")
    private Integer concurrenceCount;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("OversoldGroupId")
    private String oversoldGroupId;

    @Query
    @NameInMap("OversoldUserCount")
    private Integer oversoldUserCount;

    @Query
    @NameInMap("OversoldWarn")
    private Integer oversoldWarn;

    @Query
    @NameInMap("PolicyGroupId")
    private String policyGroupId;

    @Query
    @NameInMap("StopDuration")
    private Integer stopDuration;

    private ModifyDesktopOversoldGroupRequest(Builder builder) {
        super(builder);
        this.concurrenceCount = builder.concurrenceCount;
        this.description = builder.description;
        this.imageId = builder.imageId;
        this.name = builder.name;
        this.oversoldGroupId = builder.oversoldGroupId;
        this.oversoldUserCount = builder.oversoldUserCount;
        this.oversoldWarn = builder.oversoldWarn;
        this.policyGroupId = builder.policyGroupId;
        this.stopDuration = builder.stopDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDesktopOversoldGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return concurrenceCount
     */
    public Integer getConcurrenceCount() {
        return this.concurrenceCount;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return oversoldGroupId
     */
    public String getOversoldGroupId() {
        return this.oversoldGroupId;
    }

    /**
     * @return oversoldUserCount
     */
    public Integer getOversoldUserCount() {
        return this.oversoldUserCount;
    }

    /**
     * @return oversoldWarn
     */
    public Integer getOversoldWarn() {
        return this.oversoldWarn;
    }

    /**
     * @return policyGroupId
     */
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    /**
     * @return stopDuration
     */
    public Integer getStopDuration() {
        return this.stopDuration;
    }

    public static final class Builder extends Request.Builder<ModifyDesktopOversoldGroupRequest, Builder> {
        private Integer concurrenceCount; 
        private String description; 
        private String imageId; 
        private String name; 
        private String oversoldGroupId; 
        private Integer oversoldUserCount; 
        private Integer oversoldWarn; 
        private String policyGroupId; 
        private Integer stopDuration; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDesktopOversoldGroupRequest request) {
            super(request);
            this.concurrenceCount = request.concurrenceCount;
            this.description = request.description;
            this.imageId = request.imageId;
            this.name = request.name;
            this.oversoldGroupId = request.oversoldGroupId;
            this.oversoldUserCount = request.oversoldUserCount;
            this.oversoldWarn = request.oversoldWarn;
            this.policyGroupId = request.policyGroupId;
            this.stopDuration = request.stopDuration;
        } 

        /**
         * ConcurrenceCount.
         */
        public Builder concurrenceCount(Integer concurrenceCount) {
            this.putQueryParameter("ConcurrenceCount", concurrenceCount);
            this.concurrenceCount = concurrenceCount;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
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
         * OversoldGroupId.
         */
        public Builder oversoldGroupId(String oversoldGroupId) {
            this.putQueryParameter("OversoldGroupId", oversoldGroupId);
            this.oversoldGroupId = oversoldGroupId;
            return this;
        }

        /**
         * OversoldUserCount.
         */
        public Builder oversoldUserCount(Integer oversoldUserCount) {
            this.putQueryParameter("OversoldUserCount", oversoldUserCount);
            this.oversoldUserCount = oversoldUserCount;
            return this;
        }

        /**
         * OversoldWarn.
         */
        public Builder oversoldWarn(Integer oversoldWarn) {
            this.putQueryParameter("OversoldWarn", oversoldWarn);
            this.oversoldWarn = oversoldWarn;
            return this;
        }

        /**
         * PolicyGroupId.
         */
        public Builder policyGroupId(String policyGroupId) {
            this.putQueryParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
            return this;
        }

        /**
         * StopDuration.
         */
        public Builder stopDuration(Integer stopDuration) {
            this.putQueryParameter("StopDuration", stopDuration);
            this.stopDuration = stopDuration;
            return this;
        }

        @Override
        public ModifyDesktopOversoldGroupRequest build() {
            return new ModifyDesktopOversoldGroupRequest(this);
        } 

    } 

}
