// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RegisterMediaStreamRequest} extends {@link RequestModel}
 *
 * <p>RegisterMediaStreamRequest</p>
 */
public class RegisterMediaStreamRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputURL")
    private String inputURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaId")
    private String mediaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
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
         * <p>The URL of the media asset in another service. The URL is associated with the ID of the media asset in IMS. The URL cannot be modified once registered.</p>
         * <p>Set this parameter to the OSS URL of the media asset. The following formats are supported:</p>
         * <p>http(s)://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4</p>
         * <p>oss://example-bucket/example.mp4: In this format, it is considered by default that the region of the OSS bucket in which the media asset resides is the same as the region in which IMS is activated.</p>
         */
        public Builder inputURL(String inputURL) {
            this.putQueryParameter("InputURL", inputURL);
            this.inputURL = inputURL;
            return this;
        }

        /**
         * <p>The ID of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>5e778ec0027b71ed80a8909598506***</p>
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * <p>The user data.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;MessageCallback&quot;:{&quot;CallbackURL&quot;:&quot;<a href="http://test.test.com%22%7D">http://test.test.com&quot;}</a>, &quot;Extend&quot;:{&quot;localId&quot;:&quot;xxx&quot;,&quot;test&quot;:&quot;www&quot;}}</p>
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
