// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddZoneRequest} extends {@link RequestModel}
 *
 * <p>AddZoneRequest</p>
 */
public class AddZoneRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("ProxyPattern")
    private String proxyPattern;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ZoneName")
    private String zoneName;

    @Query
    @NameInMap("ZoneTag")
    private String zoneTag;

    @Query
    @NameInMap("ZoneType")
    private String zoneType;

    private AddZoneRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.proxyPattern = builder.proxyPattern;
        this.resourceGroupId = builder.resourceGroupId;
        this.zoneName = builder.zoneName;
        this.zoneTag = builder.zoneTag;
        this.zoneType = builder.zoneType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddZoneRequest create() {
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
     * @return proxyPattern
     */
    public String getProxyPattern() {
        return this.proxyPattern;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return zoneName
     */
    public String getZoneName() {
        return this.zoneName;
    }

    /**
     * @return zoneTag
     */
    public String getZoneTag() {
        return this.zoneTag;
    }

    /**
     * @return zoneType
     */
    public String getZoneType() {
        return this.zoneType;
    }

    public static final class Builder extends Request.Builder<AddZoneRequest, Builder> {
        private String lang; 
        private String proxyPattern; 
        private String resourceGroupId; 
        private String zoneName; 
        private String zoneTag; 
        private String zoneType; 

        private Builder() {
            super();
        } 

        private Builder(AddZoneRequest request) {
            super(request);
            this.lang = request.lang;
            this.proxyPattern = request.proxyPattern;
            this.resourceGroupId = request.resourceGroupId;
            this.zoneName = request.zoneName;
            this.zoneTag = request.zoneTag;
            this.zoneType = request.zoneType;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * ProxyPattern.
         */
        public Builder proxyPattern(String proxyPattern) {
            this.putQueryParameter("ProxyPattern", proxyPattern);
            this.proxyPattern = proxyPattern;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ZoneName.
         */
        public Builder zoneName(String zoneName) {
            this.putQueryParameter("ZoneName", zoneName);
            this.zoneName = zoneName;
            return this;
        }

        /**
         * ZoneTag.
         */
        public Builder zoneTag(String zoneTag) {
            this.putQueryParameter("ZoneTag", zoneTag);
            this.zoneTag = zoneTag;
            return this;
        }

        /**
         * ZoneType.
         */
        public Builder zoneType(String zoneType) {
            this.putQueryParameter("ZoneType", zoneType);
            this.zoneType = zoneType;
            return this;
        }

        @Override
        public AddZoneRequest build() {
            return new AddZoneRequest(this);
        } 

    } 

}
