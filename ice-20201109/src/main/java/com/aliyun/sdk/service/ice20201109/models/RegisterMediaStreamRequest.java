// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterMediaStreamRequest} extends {@link RequestModel}
 *
 * <p>RegisterMediaStreamRequest</p>
 */
public class RegisterMediaStreamRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InputURL")
    private String inputURL;

    @Query
    @NameInMap("MediaId")
    private String mediaId;

    @Query
    @NameInMap("UserData")
    private String userData;

    private RegisterMediaStreamRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.inputURL = builder.inputURL;
        this.mediaId = builder.mediaId;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterMediaStreamRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return inputURL
     */
    public String getInputURL() {
        return this.inputURL;
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<RegisterMediaStreamRequest, Builder> {
        private String regionId; 
        private String inputURL; 
        private String mediaId; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(RegisterMediaStreamRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.inputURL = request.inputURL;
            this.mediaId = request.mediaId;
            this.userData = request.userData;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * InputURL.
         */
        public Builder inputURL(String inputURL) {
            this.putQueryParameter("InputURL", inputURL);
            this.inputURL = inputURL;
            return this;
        }

        /**
         * MediaId.
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public RegisterMediaStreamRequest build() {
            return new RegisterMediaStreamRequest(this);
        } 

    } 

}
