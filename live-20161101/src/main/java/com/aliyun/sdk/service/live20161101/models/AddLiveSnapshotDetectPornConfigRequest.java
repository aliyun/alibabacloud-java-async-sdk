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
 * {@link AddLiveSnapshotDetectPornConfigRequest} extends {@link RequestModel}
 *
 * <p>AddLiveSnapshotDetectPornConfigRequest</p>
 */
public class AddLiveSnapshotDetectPornConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    @com.aliyun.core.annotation.Validation(maximum = 3600, minimum = 5)
    private Integer interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssBucket")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ossBucket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssEndpoint")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ossEndpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssObject")
    private String ossObject;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scene")
    private java.util.List<String> scene;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
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
    public java.util.List<String> getScene() {
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
        private java.util.List<String> scene; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(AddLiveSnapshotDetectPornConfigRequest request) {
            super(request);
            this.appName = request.appName;
            this.domainName = request.domainName;
            this.interval = request.interval;
            this.ossBucket = request.ossBucket;
            this.ossEndpoint = request.ossEndpoint;
            this.ossObject = request.ossObject;
            this.ownerId = request.ownerId;
            this.scene = request.scene;
            this.securityToken = request.securityToken;
        } 

        /**
         * <p>The name of the application to which the live stream belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testApp</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
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
         * <p>The interval at which snapshots are captured from the live stream. Valid values: <strong>5 to 3600</strong>. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder interval(Integer interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>The name of the OSS bucket.</p>
         * <p>After the review is complete, you can search for specific violations in the OSS console based on the callback information. You must create the OSS bucket in advance. For more information, see <a href="https://help.aliyun.com/document_detail/199449.html">Configure content moderation</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>livebucket</p>
         */
        public Builder ossBucket(String ossBucket) {
            this.putQueryParameter("OssBucket", ossBucket);
            this.ossBucket = ossBucket;
            return this;
        }

        /**
         * <p>The endpoint of the Object Storage Service (OSS) bucket.</p>
         * <p>After the review is complete, you can search for specific violations in the OSS console based on the callback information. You must configure the OSS endpoint in advance. For more information, see <a href="https://help.aliyun.com/document_detail/199449.html">Configure content moderation</a>.</p>
         * <p>This parameter is required.</p>
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
         * <p>The name of the snapshot that stores violations such as pornographic content and politically sensitive content.</p>
         * 
         * <strong>example:</strong>
         * <p>record/{AppName}/{StreamName}/{Sequence}.jpg</p>
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
         * <p>Scene list detection.</p>
         * 
         * <strong>example:</strong>
         * <p>live</p>
         */
        public Builder scene(java.util.List<String> scene) {
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
