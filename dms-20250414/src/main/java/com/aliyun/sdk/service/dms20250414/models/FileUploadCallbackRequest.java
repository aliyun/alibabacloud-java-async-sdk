// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link FileUploadCallbackRequest} extends {@link RequestModel}
 *
 * <p>FileUploadCallbackRequest</p>
 */
public class FileUploadCallbackRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallFrom")
    private String callFrom;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DmsUnit")
    private String dmsUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSize")
    private Long fileSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filename")
    @com.aliyun.core.annotation.Validation(required = true)
    private String filename;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadLocation")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uploadLocation;

    private FileUploadCallbackRequest(Builder builder) {
        super(builder);
        this.callFrom = builder.callFrom;
        this.dmsUnit = builder.dmsUnit;
        this.fileSize = builder.fileSize;
        this.filename = builder.filename;
        this.uploadLocation = builder.uploadLocation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FileUploadCallbackRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callFrom
     */
    public String getCallFrom() {
        return this.callFrom;
    }

    /**
     * @return dmsUnit
     */
    public String getDmsUnit() {
        return this.dmsUnit;
    }

    /**
     * @return fileSize
     */
    public Long getFileSize() {
        return this.fileSize;
    }

    /**
     * @return filename
     */
    public String getFilename() {
        return this.filename;
    }

    /**
     * @return uploadLocation
     */
    public String getUploadLocation() {
        return this.uploadLocation;
    }

    public static final class Builder extends Request.Builder<FileUploadCallbackRequest, Builder> {
        private String callFrom; 
        private String dmsUnit; 
        private Long fileSize; 
        private String filename; 
        private String uploadLocation; 

        private Builder() {
            super();
        } 

        private Builder(FileUploadCallbackRequest request) {
            super(request);
            this.callFrom = request.callFrom;
            this.dmsUnit = request.dmsUnit;
            this.fileSize = request.fileSize;
            this.filename = request.filename;
            this.uploadLocation = request.uploadLocation;
        } 

        /**
         * CallFrom.
         */
        public Builder callFrom(String callFrom) {
            this.putQueryParameter("CallFrom", callFrom);
            this.callFrom = callFrom;
            return this;
        }

        /**
         * DmsUnit.
         */
        public Builder dmsUnit(String dmsUnit) {
            this.putQueryParameter("DmsUnit", dmsUnit);
            this.dmsUnit = dmsUnit;
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

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>conversion_metrics.csv</p>
         */
        public Builder filename(String filename) {
            this.putQueryParameter("Filename", filename);
            this.filename = filename;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder uploadLocation(String uploadLocation) {
            this.putQueryParameter("UploadLocation", uploadLocation);
            this.uploadLocation = uploadLocation;
            return this;
        }

        @Override
        public FileUploadCallbackRequest build() {
            return new FileUploadCallbackRequest(this);
        } 

    } 

}
