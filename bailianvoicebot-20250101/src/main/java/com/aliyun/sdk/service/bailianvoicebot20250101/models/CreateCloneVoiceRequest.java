// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianvoicebot20250101.models;

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
 * {@link CreateCloneVoiceRequest} extends {@link RequestModel}
 *
 * <p>CreateCloneVoiceRequest</p>
 */
public class CreateCloneVoiceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BusinessUnitId")
    private String businessUnitId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileKey")
    private String fileKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    private CreateCloneVoiceRequest(Builder builder) {
        super(builder);
        this.businessUnitId = builder.businessUnitId;
        this.fileKey = builder.fileKey;
        this.model = builder.model;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloneVoiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessUnitId
     */
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    /**
     * @return fileKey
     */
    public String getFileKey() {
        return this.fileKey;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    public static final class Builder extends Request.Builder<CreateCloneVoiceRequest, Builder> {
        private String businessUnitId; 
        private String fileKey; 
        private String model; 

        private Builder() {
            super();
        } 

        private Builder(CreateCloneVoiceRequest request) {
            super(request);
            this.businessUnitId = request.businessUnitId;
            this.fileKey = request.fileKey;
            this.model = request.model;
        } 

        /**
         * BusinessUnitId.
         */
        public Builder businessUnitId(String businessUnitId) {
            this.putBodyParameter("BusinessUnitId", businessUnitId);
            this.businessUnitId = businessUnitId;
            return this;
        }

        /**
         * FileKey.
         */
        public Builder fileKey(String fileKey) {
            this.putBodyParameter("FileKey", fileKey);
            this.fileKey = fileKey;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.putBodyParameter("Model", model);
            this.model = model;
            return this;
        }

        @Override
        public CreateCloneVoiceRequest build() {
            return new CreateCloneVoiceRequest(this);
        } 

    } 

}
