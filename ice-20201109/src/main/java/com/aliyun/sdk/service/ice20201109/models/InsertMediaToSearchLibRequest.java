// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertMediaToSearchLibRequest} extends {@link RequestModel}
 *
 * <p>InsertMediaToSearchLibRequest</p>
 */
public class InsertMediaToSearchLibRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Input")
    @Validation(required = true)
    private String input;

    @Query
    @NameInMap("MediaId")
    private String mediaId;

    @Query
    @NameInMap("MediaType")
    private String mediaType;

    @Query
    @NameInMap("MsgBody")
    private String msgBody;

    @Query
    @NameInMap("SearchLibName")
    private String searchLibName;

    private InsertMediaToSearchLibRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.input = builder.input;
        this.mediaId = builder.mediaId;
        this.mediaType = builder.mediaType;
        this.msgBody = builder.msgBody;
        this.searchLibName = builder.searchLibName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertMediaToSearchLibRequest create() {
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
     * @return input
     */
    public String getInput() {
        return this.input;
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return mediaType
     */
    public String getMediaType() {
        return this.mediaType;
    }

    /**
     * @return msgBody
     */
    public String getMsgBody() {
        return this.msgBody;
    }

    /**
     * @return searchLibName
     */
    public String getSearchLibName() {
        return this.searchLibName;
    }

    public static final class Builder extends Request.Builder<InsertMediaToSearchLibRequest, Builder> {
        private String regionId; 
        private String input; 
        private String mediaId; 
        private String mediaType; 
        private String msgBody; 
        private String searchLibName; 

        private Builder() {
            super();
        } 

        private Builder(InsertMediaToSearchLibRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.input = request.input;
            this.mediaId = request.mediaId;
            this.mediaType = request.mediaType;
            this.msgBody = request.msgBody;
            this.searchLibName = request.searchLibName;
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
         * Input.
         */
        public Builder input(String input) {
            this.putQueryParameter("Input", input);
            this.input = input;
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
         * MediaType.
         */
        public Builder mediaType(String mediaType) {
            this.putQueryParameter("MediaType", mediaType);
            this.mediaType = mediaType;
            return this;
        }

        /**
         * MsgBody.
         */
        public Builder msgBody(String msgBody) {
            this.putQueryParameter("MsgBody", msgBody);
            this.msgBody = msgBody;
            return this;
        }

        /**
         * SearchLibName.
         */
        public Builder searchLibName(String searchLibName) {
            this.putQueryParameter("SearchLibName", searchLibName);
            this.searchLibName = searchLibName;
            return this;
        }

        @Override
        public InsertMediaToSearchLibRequest build() {
            return new InsertMediaToSearchLibRequest(this);
        } 

    } 

}
