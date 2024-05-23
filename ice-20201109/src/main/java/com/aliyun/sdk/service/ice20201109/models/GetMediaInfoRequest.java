// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMediaInfoRequest} extends {@link RequestModel}
 *
 * <p>GetMediaInfoRequest</p>
 */
public class GetMediaInfoRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("OutputType")
    private String outputType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReturnDetailedInfo")
    private String returnDetailedInfo;

    private GetMediaInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.inputURL = builder.inputURL;
        this.mediaId = builder.mediaId;
        this.outputType = builder.outputType;
        this.returnDetailedInfo = builder.returnDetailedInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMediaInfoRequest create() {
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
     * @return outputType
     */
    public String getOutputType() {
        return this.outputType;
    }

    /**
     * @return returnDetailedInfo
     */
    public String getReturnDetailedInfo() {
        return this.returnDetailedInfo;
    }

    public static final class Builder extends Request.Builder<GetMediaInfoRequest, Builder> {
        private String regionId; 
        private String inputURL; 
        private String mediaId; 
        private String outputType; 
        private String returnDetailedInfo; 

        private Builder() {
            super();
        } 

        private Builder(GetMediaInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.inputURL = request.inputURL;
            this.mediaId = request.mediaId;
            this.outputType = request.outputType;
            this.returnDetailedInfo = request.returnDetailedInfo;
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
         * OutputType.
         */
        public Builder outputType(String outputType) {
            this.putQueryParameter("OutputType", outputType);
            this.outputType = outputType;
            return this;
        }

        /**
         * ReturnDetailedInfo.
         */
        public Builder returnDetailedInfo(String returnDetailedInfo) {
            this.putQueryParameter("ReturnDetailedInfo", returnDetailedInfo);
            this.returnDetailedInfo = returnDetailedInfo;
            return this;
        }

        @Override
        public GetMediaInfoRequest build() {
            return new GetMediaInfoRequest(this);
        } 

    } 

}
