// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ImportEnterpriseAccelerateTargetsRequest} extends {@link RequestModel}
 *
 * <p>ImportEnterpriseAccelerateTargetsRequest</p>
 */
public class ImportEnterpriseAccelerateTargetsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EapId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eapId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileUrl;

    private ImportEnterpriseAccelerateTargetsRequest(Builder builder) {
        super(builder);
        this.eapId = builder.eapId;
        this.fileUrl = builder.fileUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportEnterpriseAccelerateTargetsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eapId
     */
    public String getEapId() {
        return this.eapId;
    }

    /**
     * @return fileUrl
     */
    public String getFileUrl() {
        return this.fileUrl;
    }

    public static final class Builder extends Request.Builder<ImportEnterpriseAccelerateTargetsRequest, Builder> {
        private String eapId; 
        private String fileUrl; 

        private Builder() {
            super();
        } 

        private Builder(ImportEnterpriseAccelerateTargetsRequest request) {
            super(request);
            this.eapId = request.eapId;
            this.fileUrl = request.fileUrl;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eap-6457339b546c4cfb</p>
         */
        public Builder eapId(String eapId) {
            this.putBodyParameter("EapId", eapId);
            this.eapId = eapId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://filename.xlsx">https://filename.xlsx</a></p>
         */
        public Builder fileUrl(String fileUrl) {
            this.putBodyParameter("FileUrl", fileUrl);
            this.fileUrl = fileUrl;
            return this;
        }

        @Override
        public ImportEnterpriseAccelerateTargetsRequest build() {
            return new ImportEnterpriseAccelerateTargetsRequest(this);
        } 

    } 

}
