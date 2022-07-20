// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTrailRequest} extends {@link RequestModel}
 *
 * <p>CreateTrailRequest</p>
 */
public class CreateTrailRequest extends Request {
    @Query
    @NameInMap("EventRW")
    private String eventRW;

    @Query
    @NameInMap("IsOrganizationTrail")
    private Boolean isOrganizationTrail;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("OssBucketName")
    private String ossBucketName;

    @Query
    @NameInMap("OssKeyPrefix")
    private String ossKeyPrefix;

    @Query
    @NameInMap("OssWriteRoleArn")
    private String ossWriteRoleArn;

    @Query
    @NameInMap("SlsProjectArn")
    private String slsProjectArn;

    @Query
    @NameInMap("SlsWriteRoleArn")
    private String slsWriteRoleArn;

    @Query
    @NameInMap("TrailRegion")
    private String trailRegion;

    private CreateTrailRequest(Builder builder) {
        super(builder);
        this.eventRW = builder.eventRW;
        this.isOrganizationTrail = builder.isOrganizationTrail;
        this.name = builder.name;
        this.ossBucketName = builder.ossBucketName;
        this.ossKeyPrefix = builder.ossKeyPrefix;
        this.ossWriteRoleArn = builder.ossWriteRoleArn;
        this.slsProjectArn = builder.slsProjectArn;
        this.slsWriteRoleArn = builder.slsWriteRoleArn;
        this.trailRegion = builder.trailRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTrailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventRW
     */
    public String getEventRW() {
        return this.eventRW;
    }

    /**
     * @return isOrganizationTrail
     */
    public Boolean getIsOrganizationTrail() {
        return this.isOrganizationTrail;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ossBucketName
     */
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    /**
     * @return ossKeyPrefix
     */
    public String getOssKeyPrefix() {
        return this.ossKeyPrefix;
    }

    /**
     * @return ossWriteRoleArn
     */
    public String getOssWriteRoleArn() {
        return this.ossWriteRoleArn;
    }

    /**
     * @return slsProjectArn
     */
    public String getSlsProjectArn() {
        return this.slsProjectArn;
    }

    /**
     * @return slsWriteRoleArn
     */
    public String getSlsWriteRoleArn() {
        return this.slsWriteRoleArn;
    }

    /**
     * @return trailRegion
     */
    public String getTrailRegion() {
        return this.trailRegion;
    }

    public static final class Builder extends Request.Builder<CreateTrailRequest, Builder> {
        private String eventRW; 
        private Boolean isOrganizationTrail; 
        private String name; 
        private String ossBucketName; 
        private String ossKeyPrefix; 
        private String ossWriteRoleArn; 
        private String slsProjectArn; 
        private String slsWriteRoleArn; 
        private String trailRegion; 

        private Builder() {
            super();
        } 

        private Builder(CreateTrailRequest request) {
            super(request);
            this.eventRW = request.eventRW;
            this.isOrganizationTrail = request.isOrganizationTrail;
            this.name = request.name;
            this.ossBucketName = request.ossBucketName;
            this.ossKeyPrefix = request.ossKeyPrefix;
            this.ossWriteRoleArn = request.ossWriteRoleArn;
            this.slsProjectArn = request.slsProjectArn;
            this.slsWriteRoleArn = request.slsWriteRoleArn;
            this.trailRegion = request.trailRegion;
        } 

        /**
         * EventRW.
         */
        public Builder eventRW(String eventRW) {
            this.putQueryParameter("EventRW", eventRW);
            this.eventRW = eventRW;
            return this;
        }

        /**
         * IsOrganizationTrail.
         */
        public Builder isOrganizationTrail(Boolean isOrganizationTrail) {
            this.putQueryParameter("IsOrganizationTrail", isOrganizationTrail);
            this.isOrganizationTrail = isOrganizationTrail;
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
         * OssBucketName.
         */
        public Builder ossBucketName(String ossBucketName) {
            this.putQueryParameter("OssBucketName", ossBucketName);
            this.ossBucketName = ossBucketName;
            return this;
        }

        /**
         * OssKeyPrefix.
         */
        public Builder ossKeyPrefix(String ossKeyPrefix) {
            this.putQueryParameter("OssKeyPrefix", ossKeyPrefix);
            this.ossKeyPrefix = ossKeyPrefix;
            return this;
        }

        /**
         * OssWriteRoleArn.
         */
        public Builder ossWriteRoleArn(String ossWriteRoleArn) {
            this.putQueryParameter("OssWriteRoleArn", ossWriteRoleArn);
            this.ossWriteRoleArn = ossWriteRoleArn;
            return this;
        }

        /**
         * SlsProjectArn.
         */
        public Builder slsProjectArn(String slsProjectArn) {
            this.putQueryParameter("SlsProjectArn", slsProjectArn);
            this.slsProjectArn = slsProjectArn;
            return this;
        }

        /**
         * SlsWriteRoleArn.
         */
        public Builder slsWriteRoleArn(String slsWriteRoleArn) {
            this.putQueryParameter("SlsWriteRoleArn", slsWriteRoleArn);
            this.slsWriteRoleArn = slsWriteRoleArn;
            return this;
        }

        /**
         * TrailRegion.
         */
        public Builder trailRegion(String trailRegion) {
            this.putQueryParameter("TrailRegion", trailRegion);
            this.trailRegion = trailRegion;
            return this;
        }

        @Override
        public CreateTrailRequest build() {
            return new CreateTrailRequest(this);
        } 

    } 

}
