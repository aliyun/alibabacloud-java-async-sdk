// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateSyncEcsHostTaskRequest} extends {@link RequestModel}
 *
 * <p>UpdateSyncEcsHostTaskRequest</p>
 */
public class UpdateSyncEcsHostTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Region> region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    private UpdateSyncEcsHostTaskRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.region = builder.region;
        this.status = builder.status;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSyncEcsHostTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return region
     */
    public java.util.List < Region> getRegion() {
        return this.region;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<UpdateSyncEcsHostTaskRequest, Builder> {
        private String lang; 
        private java.util.List < Region> region; 
        private String status; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSyncEcsHostTaskRequest request) {
            super(request);
            this.lang = request.lang;
            this.region = request.region;
            this.status = request.status;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * <p>Default value: en.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The regions to be synchronized.</p>
         * <p>This parameter is required.</p>
         */
        public Builder region(java.util.List < Region> region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The state of the hostname synchronization task. Valid values:</p>
         * <ul>
         * <li>ON: The task is started.</li>
         * <li>OFF: The task is ended.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The zone ID. This ID uniquely identifies the zone.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>df2d03865266bd9842306db586d3****</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public UpdateSyncEcsHostTaskRequest build() {
            return new UpdateSyncEcsHostTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateSyncEcsHostTaskRequest} extends {@link TeaModel}
     *
     * <p>UpdateSyncEcsHostTaskRequest</p>
     */
    public static class Region extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        private Region(Builder builder) {
            this.regionId = builder.regionId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Region create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String regionId; 
            private Long userId; 

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The user ID to which the region belongs. This parameter is used in cross-account synchronization scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>141339776561****</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public Region build() {
                return new Region(this);
            } 

        } 

    }
}
