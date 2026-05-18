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
 * {@link UpdateDocumentRequest} extends {@link RequestModel}
 *
 * <p>UpdateDocumentRequest</p>
 */
public class UpdateDocumentRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocumentName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String documentName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KbUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String kbUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NewDescription")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newDescription;

    private UpdateDocumentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.documentName = builder.documentName;
        this.kbUuid = builder.kbUuid;
        this.newDescription = builder.newDescription;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDocumentRequest create() {
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
     * @return documentName
     */
    public String getDocumentName() {
        return this.documentName;
    }

    /**
     * @return kbUuid
     */
    public String getKbUuid() {
        return this.kbUuid;
    }

    /**
     * @return newDescription
     */
    public String getNewDescription() {
        return this.newDescription;
    }

    public static final class Builder extends Request.Builder<UpdateDocumentRequest, Builder> {
        private String regionId; 
        private String documentName; 
        private String kbUuid; 
        private String newDescription; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDocumentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.documentName = request.documentName;
            this.kbUuid = request.kbUuid;
            this.newDescription = request.newDescription;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test.md</p>
         */
        public Builder documentName(String documentName) {
            this.putBodyParameter("DocumentName", documentName);
            this.documentName = documentName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kb-***</p>
         */
        public Builder kbUuid(String kbUuid) {
            this.putBodyParameter("KbUuid", kbUuid);
            this.kbUuid = kbUuid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test123</p>
         */
        public Builder newDescription(String newDescription) {
            this.putBodyParameter("NewDescription", newDescription);
            this.newDescription = newDescription;
            return this;
        }

        @Override
        public UpdateDocumentRequest build() {
            return new UpdateDocumentRequest(this);
        } 

    } 

}
