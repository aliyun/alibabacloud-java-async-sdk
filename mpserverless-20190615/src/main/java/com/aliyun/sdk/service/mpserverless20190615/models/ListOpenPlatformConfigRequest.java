// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOpenPlatformConfigRequest} extends {@link RequestModel}
 *
 * <p>ListOpenPlatformConfigRequest</p>
 */
public class ListOpenPlatformConfigRequest extends Request {
    @Body
    @NameInMap("Platform")
    @Validation(required = true)
    private String platform;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private ListOpenPlatformConfigRequest(Builder builder) {
        super(builder);
        this.platform = builder.platform;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOpenPlatformConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<ListOpenPlatformConfigRequest, Builder> {
        private String platform; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListOpenPlatformConfigRequest request) {
            super(request);
            this.platform = request.platform;
            this.spaceId = request.spaceId;
        } 

        /**
         * Platform.
         */
        public Builder platform(String platform) {
            this.putBodyParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public ListOpenPlatformConfigRequest build() {
            return new ListOpenPlatformConfigRequest(this);
        } 

    } 

}
