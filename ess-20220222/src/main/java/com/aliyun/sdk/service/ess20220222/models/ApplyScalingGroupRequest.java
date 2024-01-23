// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyScalingGroupRequest} extends {@link RequestModel}
 *
 * <p>ApplyScalingGroupRequest</p>
 */
public class ApplyScalingGroupRequest extends Request {
    @Query
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    @Query
    @NameInMap("Format")
    private String format;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private ApplyScalingGroupRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.format = builder.format;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyScalingGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return format
     */
    public String getFormat() {
        return this.format;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ApplyScalingGroupRequest, Builder> {
        private String content; 
        private String format; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ApplyScalingGroupRequest request) {
            super(request);
            this.content = request.content;
            this.format = request.format;
            this.regionId = request.regionId;
        } 

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * Format.
         */
        public Builder format(String format) {
            this.putQueryParameter("Format", format);
            this.format = format;
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

        @Override
        public ApplyScalingGroupRequest build() {
            return new ApplyScalingGroupRequest(this);
        } 

    } 

}
