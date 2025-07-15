// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link UpdateLiveAppSnapshotConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateLiveAppSnapshotConfigRequest</p>
 */
public class UpdateLiveAppSnapshotConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Callback")
    private String callback;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssBucket")
    private String ossBucket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssEndpoint")
    private String ossEndpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OverwriteOssObject")
    private String overwriteOssObject;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SequenceOssObject")
    private String sequenceOssObject;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeInterval")
    @com.aliyun.core.annotation.Validation(maximum = 3600, minimum = 5)
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

        private Builder(UpdateLiveAppSnapshotConfigRequest request) {
            super(request);
            this.appName = request.appName;
            this.callback = request.callback;
            this.domainName = request.domainName;
            this.ossBucket = request.ossBucket;
            this.ossEndpoint = request.ossEndpoint;
            this.overwriteOssObject = request.overwriteOssObject;
            this.ownerId = request.ownerId;
            this.securityToken = request.securityToken;
            this.sequenceOssObject = request.sequenceOssObject;
            this.timeInterval = request.timeInterval;
        } 

        /**
         * <p>The name of the application to which the live stream belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>liveApp****</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The callback URL that is used to receive notifications about snapshot capture.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://learn.aliyundoc.com">https://learn.aliyundoc.com</a></p>
         */
        public Builder callback(String callback) {
            this.putQueryParameter("Callback", callback);
            this.callback = callback;
            return this;
        }

        /**
         * <p>The main streaming domain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The name of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>liveBucket****</p>
         */
        public Builder ossBucket(String ossBucket) {
            this.putQueryParameter("OssBucket", ossBucket);
            this.ossBucket = ossBucket;
            return this;
        }

        /**
         * <p>The endpoint of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-oss-****.aliyuncs.com</p>
         */
        public Builder ossEndpoint(String ossEndpoint) {
            this.putQueryParameter("OssEndpoint", ossEndpoint);
            this.ossEndpoint = ossEndpoint;
            return this;
        }

        /**
         * <p>The naming format of snapshots that are stored in the overwrite mode, which means that a new snapshot overwrites the previous snapshot.</p>
         * <ul>
         * <li>The name must be less than 256 bytes in length.</li>
         * <li>Only JPG images are supported.</li>
         * <li>The name can contain variables such as {AppName} and {StreamName}.</li>
         * <li>A value of hyphen (-) indicates that this parameter is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{liveApp****}/{liveStream****}.jpg</p>
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
         * <p>The naming format of snapshots that are stored in sequence, which means that a new snapshot does not overwrite the previous snapshot. You can call the <a href="https://help.aliyun.com/document_detail/2847902.html">DescribeLiveStreamSnapshotInfo</a> operation to query the snapshots that were captured within a specific time period.</p>
         * <ul>
         * <li>The name must be less than 256 bytes in length.</li>
         * <li>Only JPG images are supported.</li>
         * <li>The name can contain variables such as {AppName}, {StreamName}, {UnixTimestamp}, and {Sequence}. The name must contain at least one of the {UnixTimestamp} and {Sequence} variables.</li>
         * <li>A value of hyphen (-) indicates that this parameter is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>snapshot/{liveApp****}/{liveStream****}/{UnixTimestamp****}.jpg</p>
         */
        public Builder sequenceOssObject(String sequenceOssObject) {
            this.putQueryParameter("SequenceOssObject", sequenceOssObject);
            this.sequenceOssObject = sequenceOssObject;
            return this;
        }

        /**
         * <p>The interval at which snapshots are captured. Valid values: <strong>5 to 3600</strong>. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
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
