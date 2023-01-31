// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNumberDistrictInfoParsingTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateNumberDistrictInfoParsingTaskRequest</p>
 */
public class CreateNumberDistrictInfoParsingTaskRequest extends Request {
    @Query
    @NameInMap("FilePath")
    private String filePath;

    @Query
    @NameInMap("FileSize")
    private Long fileSize;

    private CreateNumberDistrictInfoParsingTaskRequest(Builder builder) {
        super(builder);
        this.filePath = builder.filePath;
        this.fileSize = builder.fileSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNumberDistrictInfoParsingTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * @return fileSize
     */
    public Long getFileSize() {
        return this.fileSize;
    }

    public static final class Builder extends Request.Builder<CreateNumberDistrictInfoParsingTaskRequest, Builder> {
        private String filePath; 
        private Long fileSize; 

        private Builder() {
            super();
        } 

        private Builder(CreateNumberDistrictInfoParsingTaskRequest request) {
            super(request);
            this.filePath = request.filePath;
            this.fileSize = request.fileSize;
        } 

        /**
         * FilePath.
         */
        public Builder filePath(String filePath) {
            this.putQueryParameter("FilePath", filePath);
            this.filePath = filePath;
            return this;
        }

        /**
         * FileSize.
         */
        public Builder fileSize(Long fileSize) {
            this.putQueryParameter("FileSize", fileSize);
            this.fileSize = fileSize;
            return this;
        }

        @Override
        public CreateNumberDistrictInfoParsingTaskRequest build() {
            return new CreateNumberDistrictInfoParsingTaskRequest(this);
        } 

    } 

}
