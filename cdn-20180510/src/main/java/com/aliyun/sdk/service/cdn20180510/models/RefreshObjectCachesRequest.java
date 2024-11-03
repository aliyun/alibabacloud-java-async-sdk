// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RefreshObjectCachesRequest} extends {@link RequestModel}
 *
 * <p>RefreshObjectCachesRequest</p>
 */
public class RefreshObjectCachesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Force")
    private Boolean force;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectPath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String objectPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectType")
    private String objectType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private RefreshObjectCachesRequest(Builder builder) {
        super(builder);
        this.force = builder.force;
        this.objectPath = builder.objectPath;
        this.objectType = builder.objectType;
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshObjectCachesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return objectPath
     */
    public String getObjectPath() {
        return this.objectPath;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
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

    public static final class Builder extends Request.Builder<RefreshObjectCachesRequest, Builder> {
        private Boolean force; 
        private String objectPath; 
        private String objectType; 
        private Long ownerId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(RefreshObjectCachesRequest request) {
            super(request);
            this.force = request.force;
            this.objectPath = request.objectPath;
            this.objectType = request.objectType;
            this.ownerId = request.ownerId;
            this.securityToken = request.securityToken;
        } 

        /**
         * <p>When the comparison between the source content and the source site resources is consistent, should the resources within the corresponding range be forcibly refreshed. The default is false.</p>
         * <ul>
         * <li><strong>true</strong>: purges all resources in the range that corresponds to the type of the purge task. If you set this parameter to true, when the requested resource matches the resource in the range that corresponds to the type of the purge task, the POP retrieves the resource from the origin server, returns the resource to the client, and caches the resource.</li>
         * <li><strong>false</strong>: purges the changed resources in the range that corresponds to the type of the purge task. If you set this parameter to false, when the requested resource matches the resource in the range that corresponds to the type of the purge task, the POP obtains the Last-Modified parameter of the resource from the origin server. If the obtained value of the Last-Modified parameter is the same as that of the cached resource, the cached resource is returned. Otherwise, the POP retrieves the resource from the origin server, returns the resource to the client, and caches the resource.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter takes effect only when the ObjectType parameter is not set to File.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * <ul>
         * <li>If you submit multiple URLs or directories at a time, separate them with line breaks (\n) or (\r\n).</li>
         * <li>The total number of domain names contained all URLs in a submitted task cannot exceed 10.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com/image/1.png%5Cnhttp://aliyundoc.com/image/2.png">http://example.com/image/1.png\nhttp://aliyundoc.com/image/2.png</a></p>
         */
        public Builder objectPath(String objectPath) {
            this.putQueryParameter("ObjectPath", objectPath);
            this.objectPath = objectPath;
            return this;
        }

        /**
         * <p>The type of the object that you want to refresh. Valid values:</p>
         * <ul>
         * <li><strong>File</strong> (default): refreshes one or more files.</li>
         * <li><strong>Directory</strong>: refreshes the files in one or more directories.</li>
         * <li><strong>Regex</strong>: refreshes content based on regular expressions.</li>
         * <li><strong>ExQuery</strong>: omits parameters after the question mark in the URL and refreshes content.</li>
         * </ul>
         * <p>If you set the ObjectType parameter to File or Directory, you can view <a href="https://help.aliyun.com/document_detail/27140.html">Refresh and prefetch resources</a> to obtain more information. If you set the ObjectType parameter to Regex, you can view <a href="https://help.aliyun.com/document_detail/146195.html">Configure URL refresh rules that contain regular expressions</a> to obtain more information.</p>
         * <p>If you set the ObjectType parameter to Directory, the resources in the directory that you want to refresh are marked as expired. You cannot delete the directory. If clients request resources on POPs that are marked as expired, Alibaba Cloud CDN checks whether the resources on your origin server are updated. If resources are updated, Alibaba Cloud CDN retrieves the latest version of the resources and returns the resources to the clients. Otherwise, the origin server returns the 304 status code.</p>
         * 
         * <strong>example:</strong>
         * <p>File</p>
         */
        public Builder objectType(String objectType) {
            this.putQueryParameter("ObjectType", objectType);
            this.objectType = objectType;
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

        @Override
        public RefreshObjectCachesRequest build() {
            return new RefreshObjectCachesRequest(this);
        } 

    } 

}
