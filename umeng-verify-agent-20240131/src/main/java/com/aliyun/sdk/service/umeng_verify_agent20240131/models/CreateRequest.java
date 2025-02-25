// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_verify_agent20240131.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRequest} extends {@link RequestModel}
 *
 * <p>CreateRequest</p>
 */
public class CreateRequest extends Request {
    @Body
    @NameInMap("appName")
    private String appName;

    @Body
    @NameInMap("bundleId")
    private String bundleId;

    @Body
    @NameInMap("packName")
    private String packName;

    @Body
    @NameInMap("platform")
    private String platform;

    @Body
    @NameInMap("schemeName")
    private String schemeName;

    @Body
    @NameInMap("signName")
    private String signName;

    private CreateRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.bundleId = builder.bundleId;
        this.packName = builder.packName;
        this.platform = builder.platform;
        this.schemeName = builder.schemeName;
        this.signName = builder.signName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRequest create() {
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
     * @return bundleId
     */
    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * @return packName
     */
    public String getPackName() {
        return this.packName;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return schemeName
     */
    public String getSchemeName() {
        return this.schemeName;
    }

    /**
     * @return signName
     */
    public String getSignName() {
        return this.signName;
    }

    public static final class Builder extends Request.Builder<CreateRequest, Builder> {
        private String appName; 
        private String bundleId; 
        private String packName; 
        private String platform; 
        private String schemeName; 
        private String signName; 

        private Builder() {
            super();
        } 

        private Builder(CreateRequest request) {
            super(request);
            this.appName = request.appName;
            this.bundleId = request.bundleId;
            this.packName = request.packName;
            this.platform = request.platform;
            this.schemeName = request.schemeName;
            this.signName = request.signName;
        } 

        /**
         * appName.
         */
        public Builder appName(String appName) {
            this.putBodyParameter("appName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * bundleId.
         */
        public Builder bundleId(String bundleId) {
            this.putBodyParameter("bundleId", bundleId);
            this.bundleId = bundleId;
            return this;
        }

        /**
         * packName.
         */
        public Builder packName(String packName) {
            this.putBodyParameter("packName", packName);
            this.packName = packName;
            return this;
        }

        /**
         * platform.
         */
        public Builder platform(String platform) {
            this.putBodyParameter("platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * schemeName.
         */
        public Builder schemeName(String schemeName) {
            this.putBodyParameter("schemeName", schemeName);
            this.schemeName = schemeName;
            return this;
        }

        /**
         * signName.
         */
        public Builder signName(String signName) {
            this.putBodyParameter("signName", signName);
            this.signName = signName;
            return this;
        }

        @Override
        public CreateRequest build() {
            return new CreateRequest(this);
        } 

    } 

}
