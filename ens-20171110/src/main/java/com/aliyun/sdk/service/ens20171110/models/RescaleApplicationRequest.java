// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RescaleApplicationRequest} extends {@link RequestModel}
 *
 * <p>RescaleApplicationRequest</p>
 */
public class RescaleApplicationRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("RescaleLevel")
    private String rescaleLevel;

    @Query
    @NameInMap("RescaleType")
    @Validation(required = true)
    private String rescaleType;

    @Query
    @NameInMap("ResourceSelector")
    @Validation(required = true)
    private String resourceSelector;

    @Query
    @NameInMap("Timeout")
    private Integer timeout;

    @Query
    @NameInMap("ToAppVersion")
    private String toAppVersion;

    private RescaleApplicationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.rescaleLevel = builder.rescaleLevel;
        this.rescaleType = builder.rescaleType;
        this.resourceSelector = builder.resourceSelector;
        this.timeout = builder.timeout;
        this.toAppVersion = builder.toAppVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RescaleApplicationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return rescaleLevel
     */
    public String getRescaleLevel() {
        return this.rescaleLevel;
    }

    /**
     * @return rescaleType
     */
    public String getRescaleType() {
        return this.rescaleType;
    }

    /**
     * @return resourceSelector
     */
    public String getResourceSelector() {
        return this.resourceSelector;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * @return toAppVersion
     */
    public String getToAppVersion() {
        return this.toAppVersion;
    }

    public static final class Builder extends Request.Builder<RescaleApplicationRequest, Builder> {
        private String appId; 
        private String rescaleLevel; 
        private String rescaleType; 
        private String resourceSelector; 
        private Integer timeout; 
        private String toAppVersion; 

        private Builder() {
            super();
        } 

        private Builder(RescaleApplicationRequest response) {
            super(response);
            this.appId = response.appId;
            this.rescaleLevel = response.rescaleLevel;
            this.rescaleType = response.rescaleType;
            this.resourceSelector = response.resourceSelector;
            this.timeout = response.timeout;
            this.toAppVersion = response.toAppVersion;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * RescaleLevel.
         */
        public Builder rescaleLevel(String rescaleLevel) {
            this.putQueryParameter("RescaleLevel", rescaleLevel);
            this.rescaleLevel = rescaleLevel;
            return this;
        }

        /**
         * RescaleType.
         */
        public Builder rescaleType(String rescaleType) {
            this.putQueryParameter("RescaleType", rescaleType);
            this.rescaleType = rescaleType;
            return this;
        }

        /**
         * ResourceSelector.
         */
        public Builder resourceSelector(String resourceSelector) {
            this.putQueryParameter("ResourceSelector", resourceSelector);
            this.resourceSelector = resourceSelector;
            return this;
        }

        /**
         * Timeout.
         */
        public Builder timeout(Integer timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * ToAppVersion.
         */
        public Builder toAppVersion(String toAppVersion) {
            this.putQueryParameter("ToAppVersion", toAppVersion);
            this.toAppVersion = toAppVersion;
            return this;
        }

        @Override
        public RescaleApplicationRequest build() {
            return new RescaleApplicationRequest(this);
        } 

    } 

}
