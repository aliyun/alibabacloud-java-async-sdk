// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetPlayInfoRequest} extends {@link RequestModel}
 *
 * <p>GetPlayInfoRequest</p>
 */
public class GetPlayInfoRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputURL")
    private String inputURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaId")
    private String mediaId;

    private GetPlayInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.inputURL = builder.inputURL;
        this.mediaId = builder.mediaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPlayInfoRequest create() {
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

    public static final class Builder extends Request.Builder<GetPlayInfoRequest, Builder> {
        private String regionId; 
        private String inputURL; 
        private String mediaId; 

        private Builder() {
            super();
        } 

        private Builder(GetPlayInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.inputURL = request.inputURL;
            this.mediaId = request.mediaId;
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
         * <p>The input URL that you specified for the media asset when you registered the media asset. For more information, see <a href="https://help.aliyun.com/document_detail/441152.html">RegisterMediaInfo</a>.</p>
         * <blockquote>
         * <p> You must specify at least one of the MediaId and InputURL parameters.</p>
         * </blockquote>
         */
        public Builder inputURL(String inputURL) {
            this.putQueryParameter("InputURL", inputURL);
            this.inputURL = inputURL;
            return this;
        }

        /**
         * <p>The ID of the media asset.</p>
         * <blockquote>
         * <p> You must specify at least one of the MediaId and InputURL parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>86434e152b7d4f20be480574439fe***</p>
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        @Override
        public GetPlayInfoRequest build() {
            return new GetPlayInfoRequest(this);
        } 

    } 

}
