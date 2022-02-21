// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddLiveSnapshotDetectPornConfigRequest} extends {@link RequestModel}
 *
 * <p>AddLiveSnapshotDetectPornConfigRequest</p>
 */
public class AddLiveSnapshotDetectPornConfigRequest extends Request {
    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("Interval")
    @Validation(maximum = 3600, minimum = 5)
    private Integer interval;

    @Query
    @NameInMap("OssBucket")
    @Validation(required = true)
    private String ossBucket;

    @Query
    @NameInMap("OssEndpoint")
    @Validation(required = true)
    private String ossEndpoint;

    @Query
    @NameInMap("OssObject")
    private String ossObject;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Scene")
    private java.util.List < String > scene;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private AddLiveSnapshotDetectPornConfigRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.domainName = builder.domainName;
        this.interval = builder.interval;
        this.ossBucket = builder.ossBucket;
        this.ossEndpoint = builder.ossEndpoint;
        this.ossObject = builder.ossObject;
        this.ownerId = builder.ownerId;
        this.scene = builder.scene;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddLiveSnapshotDetectPornConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return interval
     */
    public Integer getInterval() {
        return this.interval;
    }

    /**
     * @return ossBucket
     */
    public String getOssBucket() {
        return this.ossBucket;
    }

    /**
     * @return ossEndpoint
     */
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    /**
     * @return ossObject
     */
    public String getOssObject() {
        return this.ossObject;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return scene
     */
    public java.util.List < String > getScene() {
        return this.scene;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<AddLiveSnapshotDetectPornConfigRequest, Builder> {
        private String appName; 
        private String domainName; 
        private Integer interval; 
        private String ossBucket; 
        private String ossEndpoint; 
        private String ossObject; 
        private Long ownerId; 
        private java.util.List < String > scene; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(AddLiveSnapshotDetectPornConfigRequest response) {
            super(response);
            this.appName = response.appName;
            this.domainName = response.domainName;
            this.interval = response.interval;
            this.ossBucket = response.ossBucket;
            this.ossEndpoint = response.ossEndpoint;
            this.ossObject = response.ossObject;
            this.ownerId = response.ownerId;
            this.scene = response.scene;
            this.securityToken = response.securityToken;
        } 

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * Interval.
         */
        public Builder interval(Integer interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * OssBucket.
         */
        public Builder ossBucket(String ossBucket) {
            this.putQueryParameter("OssBucket", ossBucket);
            this.ossBucket = ossBucket;
            return this;
        }

        /**
         * OssEndpoint.
         */
        public Builder ossEndpoint(String ossEndpoint) {
            this.putQueryParameter("OssEndpoint", ossEndpoint);
            this.ossEndpoint = ossEndpoint;
            return this;
        }

        /**
         * OssObject.
         */
        public Builder ossObject(String ossObject) {
            this.putQueryParameter("OssObject", ossObject);
            this.ossObject = ossObject;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Scene.
         */
        public Builder scene(java.util.List < String > scene) {
            this.putQueryParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public AddLiveSnapshotDetectPornConfigRequest build() {
            return new AddLiveSnapshotDetectPornConfigRequest(this);
        } 

    } 

}
