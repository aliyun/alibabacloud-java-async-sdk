// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDBExportTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateDBExportTaskRequest</p>
 */
public class CreateDBExportTaskRequest extends Request {
    @Body
    @NameInMap("Collection")
    @Validation(required = true)
    private String collection;

    @Body
    @NameInMap("Fields")
    private String fields;

    @Body
    @NameInMap("FileType")
    @Validation(required = true)
    private String fileType;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private CreateDBExportTaskRequest(Builder builder) {
        super(builder);
        this.collection = builder.collection;
        this.fields = builder.fields;
        this.fileType = builder.fileType;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBExportTaskRequest create() {
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
     * @return fields
     */
    public String getFields() {
        return this.fields;
    }

    /**
     * @return fileType
     */
    public String getFileType() {
        return this.fileType;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<CreateDBExportTaskRequest, Builder> {
        private String collection; 
        private String fields; 
        private String fileType; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBExportTaskRequest request) {
            super(request);
            this.collection = request.collection;
            this.fields = request.fields;
            this.fileType = request.fileType;
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
         * Fields.
         */
        public Builder fields(String fields) {
            this.putBodyParameter("Fields", fields);
            this.fields = fields;
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
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public CreateDBExportTaskRequest build() {
            return new CreateDBExportTaskRequest(this);
        } 

    } 

}
