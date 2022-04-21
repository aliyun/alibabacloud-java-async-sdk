// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchDeleteWebHostingFilesRequest} extends {@link RequestModel}
 *
 * <p>BatchDeleteWebHostingFilesRequest</p>
 */
public class BatchDeleteWebHostingFilesRequest extends Request {
    @Body
    @NameInMap("FilePaths")
    @Validation(required = true)
    private java.util.List < String > filePaths;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private BatchDeleteWebHostingFilesRequest(Builder builder) {
        super(builder);
        this.filePaths = builder.filePaths;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteWebHostingFilesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filePaths
     */
    public java.util.List < String > getFilePaths() {
        return this.filePaths;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<BatchDeleteWebHostingFilesRequest, Builder> {
        private java.util.List < String > filePaths; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(BatchDeleteWebHostingFilesRequest request) {
            super(request);
            this.filePaths = request.filePaths;
            this.spaceId = request.spaceId;
        } 

        /**
         * FilePaths.
         */
        public Builder filePaths(java.util.List < String > filePaths) {
            this.putBodyParameter("FilePaths", filePaths);
            this.filePaths = filePaths;
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
        public BatchDeleteWebHostingFilesRequest build() {
            return new BatchDeleteWebHostingFilesRequest(this);
        } 

    } 

}
