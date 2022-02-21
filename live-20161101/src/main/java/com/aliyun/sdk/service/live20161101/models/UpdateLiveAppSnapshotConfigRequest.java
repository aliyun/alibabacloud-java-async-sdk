// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLiveAppSnapshotConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateLiveAppSnapshotConfigRequest</p>
 */
public class UpdateLiveAppSnapshotConfigRequest extends Request {
    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("Callback")
    private String callback;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("OssBucket")
    private String ossBucket;

    @Query
    @NameInMap("OssEndpoint")
    private String ossEndpoint;

    @Query
    @NameInMap("OverwriteOssObject")
    private String overwriteOssObject;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("SequenceOssObject")
    private String sequenceOssObject;

    @Query
    @NameInMap("TimeInterval")
    @Validation(maximum = 3600, minimum = 5)
    private Integer timeInterval;

    private UpdateLiveAppSnapshotConfigRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.callback = builder.callback;
        this.domainName = builder.domainName;
        this.ossBucket = builder.ossBucket;
        this.ossEndpoint = builder.ossEndpoint;
        this.overwriteOssObject = builder.overwriteOssObject;
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
        this.sequenceOssObject = builder.sequenceOssObject;
        this.timeInterval = builder.timeInterval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLiveAppSnapshotConfigRequest create() {
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
     * @return callback
     */
    public String getCallback() {
        return this.callback;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
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
     * @return overwriteOssObject
     */
    public String getOverwriteOssObject() {
        return this.overwriteOssObject;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return sequenceOssObject
     */
    public String getSequenceOssObject() {
        return this.sequenceOssObject;
    }

    /**
     * @return timeInterval
     */
    public Integer getTimeInterval() {
        return this.timeInterval;
    }

    public static final class Builder extends Request.Builder<UpdateLiveAppSnapshotConfigRequest, Builder> {
        private String appName; 
        private String callback; 
        private String domainName; 
        private String ossBucket; 
        private String ossEndpoint; 
        private String overwriteOssObject; 
        private Long ownerId; 
        private String securityToken; 
        private String sequenceOssObject; 
        private Integer timeInterval; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLiveAppSnapshotConfigRequest response) {
            super(response);
            this.appName = response.appName;
            this.callback = response.callback;
            this.domainName = response.domainName;
            this.ossBucket = response.ossBucket;
            this.ossEndpoint = response.ossEndpoint;
            this.overwriteOssObject = response.overwriteOssObject;
            this.ownerId = response.ownerId;
            this.securityToken = response.securityToken;
            this.sequenceOssObject = response.sequenceOssObject;
            this.timeInterval = response.timeInterval;
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
         * Callback.
         */
        public Builder callback(String callback) {
            this.putQueryParameter("Callback", callback);
            this.callback = callback;
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
         * OverwriteOssObject.
         */
        public Builder overwriteOssObject(String overwriteOssObject) {
            this.putQueryParameter("OverwriteOssObject", overwriteOssObject);
            this.overwriteOssObject = overwriteOssObject;
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * SequenceOssObject.
         */
        public Builder sequenceOssObject(String sequenceOssObject) {
            this.putQueryParameter("SequenceOssObject", sequenceOssObject);
            this.sequenceOssObject = sequenceOssObject;
            return this;
        }

        /**
         * TimeInterval.
         */
        public Builder timeInterval(Integer timeInterval) {
            this.putQueryParameter("TimeInterval", timeInterval);
            this.timeInterval = timeInterval;
            return this;
        }

        @Override
        public UpdateLiveAppSnapshotConfigRequest build() {
            return new UpdateLiveAppSnapshotConfigRequest(this);
        } 

    } 

}
