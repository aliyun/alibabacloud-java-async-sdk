// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateMediaMarksRequest} extends {@link RequestModel}
 *
 * <p>UpdateMediaMarksRequest</p>
 */
public class UpdateMediaMarksRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mediaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaMarks")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mediaMarks;

    private UpdateMediaMarksRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.mediaId = builder.mediaId;
        this.mediaMarks = builder.mediaMarks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMediaMarksRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateMediaMarksRequest, Builder> {
        private String regionId; 
        private String mediaId; 
        private String mediaMarks; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMediaMarksRequest request) {
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
         * <p>The ID of the media asset.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>53afdf003a******6a16b5feac6402</p>
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * <p>The marks of the media asset.</p>
         * <p>This parameter is required.</p>
         */
        public Builder mediaMarks(String mediaMarks) {
            this.putQueryParameter("MediaMarks", mediaMarks);
            this.mediaMarks = mediaMarks;
            return this;
        }

        @Override
        public UpdateMediaMarksRequest build() {
            return new UpdateMediaMarksRequest(this);
        } 

    } 

}
