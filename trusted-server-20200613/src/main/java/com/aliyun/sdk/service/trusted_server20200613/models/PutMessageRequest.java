// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trusted_server20200613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutMessageRequest} extends {@link RequestModel}
 *
 * <p>PutMessageRequest</p>
 */
public class PutMessageRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("FileData")
    @Validation(required = true)
    private String fileData;

    @Query
    @NameInMap("PropertyUuid")
    private String propertyUuid;

    private PutMessageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.fileData = builder.fileData;
        this.propertyUuid = builder.propertyUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutMessageRequest create() {
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
     * @return fileData
     */
    public String getFileData() {
        return this.fileData;
    }

    /**
     * @return propertyUuid
     */
    public String getPropertyUuid() {
        return this.propertyUuid;
    }

    public static final class Builder extends Request.Builder<PutMessageRequest, Builder> {
        private String regionId; 
        private String fileData; 
        private String propertyUuid; 

        private Builder() {
            super();
        } 

        private Builder(PutMessageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.fileData = request.fileData;
            this.propertyUuid = request.propertyUuid;
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
         * FileData.
         */
        public Builder fileData(String fileData) {
            this.putQueryParameter("FileData", fileData);
            this.fileData = fileData;
            return this;
        }

        /**
         * PropertyUuid.
         */
        public Builder propertyUuid(String propertyUuid) {
            this.putQueryParameter("PropertyUuid", propertyUuid);
            this.propertyUuid = propertyUuid;
            return this;
        }

        @Override
        public PutMessageRequest build() {
            return new PutMessageRequest(this);
        } 

    } 

}
