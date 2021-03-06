// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTrailResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTrailResponseBody</p>
 */
public class CreateTrailResponseBody extends TeaModel {
    @NameInMap("EventRW")
    private String eventRW;

    @NameInMap("HomeRegion")
    private String homeRegion;

    @NameInMap("Name")
    private String name;

    @NameInMap("OssBucketName")
    private String ossBucketName;

    @NameInMap("OssKeyPrefix")
    private String ossKeyPrefix;

    @NameInMap("OssWriteRoleArn")
    private String ossWriteRoleArn;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SlsProjectArn")
    private String slsProjectArn;

    @NameInMap("SlsWriteRoleArn")
    private String slsWriteRoleArn;

    @NameInMap("TrailRegion")
    private String trailRegion;

    private CreateTrailResponseBody(Builder builder) {
        this.eventRW = builder.eventRW;
        this.homeRegion = builder.homeRegion;
        this.name = builder.name;
        this.ossBucketName = builder.ossBucketName;
        this.ossKeyPrefix = builder.ossKeyPrefix;
        this.ossWriteRoleArn = builder.ossWriteRoleArn;
        this.requestId = builder.requestId;
        this.slsProjectArn = builder.slsProjectArn;
        this.slsWriteRoleArn = builder.slsWriteRoleArn;
        this.trailRegion = builder.trailRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTrailResponseBody create() {
        return builder().build();
    }

    /**
     * @return eventRW
     */
    public String getEventRW() {
        return this.eventRW;
    }

    /**
     * @return homeRegion
     */
    public String getHomeRegion() {
        return this.homeRegion;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    public static final class Builder {
        private String eventRW; 
        private String homeRegion; 
        private String name; 
        private String ossBucketName; 
        private String ossKeyPrefix; 
        private String ossWriteRoleArn; 
        private String requestId; 
        private String slsProjectArn; 
        private String slsWriteRoleArn; 
        private String trailRegion; 

        /**
         * EventRW.
         */
        public Builder eventRW(String eventRW) {
            this.eventRW = eventRW;
            return this;
        }

        /**
         * HomeRegion.
         */
        public Builder homeRegion(String homeRegion) {
            this.homeRegion = homeRegion;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * OssBucketName.
         */
        public Builder ossBucketName(String ossBucketName) {
            this.ossBucketName = ossBucketName;
            return this;
        }

        /**
         * OssKeyPrefix.
         */
        public Builder ossKeyPrefix(String ossKeyPrefix) {
            this.ossKeyPrefix = ossKeyPrefix;
            return this;
        }

        /**
         * OssWriteRoleArn.
         */
        public Builder ossWriteRoleArn(String ossWriteRoleArn) {
            this.ossWriteRoleArn = ossWriteRoleArn;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SlsProjectArn.
         */
        public Builder slsProjectArn(String slsProjectArn) {
            this.slsProjectArn = slsProjectArn;
            return this;
        }

        /**
         * SlsWriteRoleArn.
         */
        public Builder slsWriteRoleArn(String slsWriteRoleArn) {
            this.slsWriteRoleArn = slsWriteRoleArn;
            return this;
        }

        /**
         * TrailRegion.
         */
        public Builder trailRegion(String trailRegion) {
            this.trailRegion = trailRegion;
            return this;
        }

        public CreateTrailResponseBody build() {
            return new CreateTrailResponseBody(this);
        } 

    } 

}
