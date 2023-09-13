// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMediaMarksRequest} extends {@link RequestModel}
 *
 * <p>AddMediaMarksRequest</p>
 */
public class AddMediaMarksRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("MediaId")
    @Validation(required = true)
    private String mediaId;

    @Query
    @NameInMap("MediaMarks")
    @Validation(required = true)
    private String mediaMarks;

    private AddMediaMarksRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.mediaId = builder.mediaId;
        this.mediaMarks = builder.mediaMarks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMediaMarksRequest create() {
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
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return mediaMarks
     */
    public String getMediaMarks() {
        return this.mediaMarks;
    }

    public static final class Builder extends Request.Builder<AddMediaMarksRequest, Builder> {
        private String regionId; 
        private String mediaId; 
        private String mediaMarks; 

        private Builder() {
            super();
        } 

        private Builder(AddMediaMarksRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.mediaId = request.mediaId;
            this.mediaMarks = request.mediaMarks;
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
         * MediaId.
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * MediaMarks.
         */
        public Builder mediaMarks(String mediaMarks) {
            this.putQueryParameter("MediaMarks", mediaMarks);
            this.mediaMarks = mediaMarks;
            return this;
        }

        @Override
        public AddMediaMarksRequest build() {
            return new AddMediaMarksRequest(this);
        } 

    } 

}
