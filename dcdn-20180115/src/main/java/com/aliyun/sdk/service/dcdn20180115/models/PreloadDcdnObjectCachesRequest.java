// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PreloadDcdnObjectCachesRequest} extends {@link RequestModel}
 *
 * <p>PreloadDcdnObjectCachesRequest</p>
 */
public class PreloadDcdnObjectCachesRequest extends Request {
    @Query
    @NameInMap("Area")
    private String area;

    @Query
    @NameInMap("L2Preload")
    private Boolean l2Preload;

    @Query
    @NameInMap("ObjectPath")
    @Validation(required = true)
    private String objectPath;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private PreloadDcdnObjectCachesRequest(Builder builder) {
        super(builder);
        this.area = builder.area;
        this.l2Preload = builder.l2Preload;
        this.objectPath = builder.objectPath;
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreloadDcdnObjectCachesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return area
     */
    public String getArea() {
        return this.area;
    }

    /**
     * @return l2Preload
     */
    public Boolean getL2Preload() {
        return this.l2Preload;
    }

    /**
     * @return objectPath
     */
    public String getObjectPath() {
        return this.objectPath;
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

    public static final class Builder extends Request.Builder<PreloadDcdnObjectCachesRequest, Builder> {
        private String area; 
        private Boolean l2Preload; 
        private String objectPath; 
        private Long ownerId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(PreloadDcdnObjectCachesRequest request) {
            super(request);
            this.area = request.area;
            this.l2Preload = request.l2Preload;
            this.objectPath = request.objectPath;
            this.ownerId = request.ownerId;
            this.securityToken = request.securityToken;
        } 

        /**
         * Area.
         */
        public Builder area(String area) {
            this.putQueryParameter("Area", area);
            this.area = area;
            return this;
        }

        /**
         * L2Preload.
         */
        public Builder l2Preload(Boolean l2Preload) {
            this.putQueryParameter("L2Preload", l2Preload);
            this.l2Preload = l2Preload;
            return this;
        }

        /**
         * ObjectPath.
         */
        public Builder objectPath(String objectPath) {
            this.putQueryParameter("ObjectPath", objectPath);
            this.objectPath = objectPath;
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
        public PreloadDcdnObjectCachesRequest build() {
            return new PreloadDcdnObjectCachesRequest(this);
        } 

    } 

}
