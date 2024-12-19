// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link ModifyDesktopOversoldGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyDesktopOversoldGroupRequest</p>
 */
public class ModifyDesktopOversoldGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConcurrenceCount")
    private Integer concurrenceCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdleDisconnectDuration")
    private Long idleDisconnectDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeepDuration")
    private Integer keepDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OversoldGroupId")
    private String oversoldGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OversoldUserCount")
    private Integer oversoldUserCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OversoldWarn")
    private Integer oversoldWarn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
    private String policyGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StopDuration")
    private Integer stopDuration;

    private ModifyDesktopOversoldGroupRequest(Builder builder) {
        super(builder);
        this.concurrenceCount = builder.concurrenceCount;
        this.description = builder.description;
        this.idleDisconnectDuration = builder.idleDisconnectDuration;
        this.imageId = builder.imageId;
        this.keepDuration = builder.keepDuration;
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
     * @return idleDisconnectDuration
     */
    public Long getIdleDisconnectDuration() {
        return this.idleDisconnectDuration;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return keepDuration
     */
    public Integer getKeepDuration() {
        return this.keepDuration;
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
        private Long idleDisconnectDuration; 
        private String imageId; 
        private Integer keepDuration; 
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
            this.idleDisconnectDuration = request.idleDisconnectDuration;
            this.imageId = request.imageId;
            this.keepDuration = request.keepDuration;
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
         * IdleDisconnectDuration.
         */
        public Builder idleDisconnectDuration(Long idleDisconnectDuration) {
            this.putQueryParameter("IdleDisconnectDuration", idleDisconnectDuration);
            this.idleDisconnectDuration = idleDisconnectDuration;
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
         * KeepDuration.
         */
        public Builder keepDuration(Integer keepDuration) {
            this.putQueryParameter("KeepDuration", keepDuration);
            this.keepDuration = keepDuration;
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
