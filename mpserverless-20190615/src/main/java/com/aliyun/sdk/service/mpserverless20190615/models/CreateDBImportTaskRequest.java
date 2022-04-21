// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDBImportTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateDBImportTaskRequest</p>
 */
public class CreateDBImportTaskRequest extends Request {
    @Body
    @NameInMap("Collection")
    @Validation(required = true)
    private String collection;

    @Body
    @NameInMap("FileType")
    @Validation(required = true)
    private String fileType;

    @Body
    @NameInMap("Mode")
    private String mode;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private CreateDBImportTaskRequest(Builder builder) {
        super(builder);
        this.collection = builder.collection;
        this.fileType = builder.fileType;
        this.mode = builder.mode;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBImportTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return collection
     */
    public String getCollection() {
        return this.collection;
    }

    /**
     * @return fileType
     */
    public String getFileType() {
        return this.fileType;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<CreateDBImportTaskRequest, Builder> {
        private String collection; 
        private String fileType; 
        private String mode; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBImportTaskRequest request) {
            super(request);
            this.collection = request.collection;
            this.fileType = request.fileType;
            this.mode = request.mode;
            this.spaceId = request.spaceId;
        } 

        /**
         * Collection.
         */
        public Builder collection(String collection) {
            this.putBodyParameter("Collection", collection);
            this.collection = collection;
            return this;
        }

        /**
         * FileType.
         */
        public Builder fileType(String fileType) {
            this.putBodyParameter("FileType", fileType);
            this.fileType = fileType;
            return this;
        }

        /**
         * Mode.
         */
        public Builder mode(String mode) {
            this.putBodyParameter("Mode", mode);
            this.mode = mode;
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
        public CreateDBImportTaskRequest build() {
            return new CreateDBImportTaskRequest(this);
        } 

    } 

}
