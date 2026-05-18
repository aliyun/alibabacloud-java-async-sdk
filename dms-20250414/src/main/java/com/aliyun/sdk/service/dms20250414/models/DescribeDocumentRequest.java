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
 * {@link DescribeDocumentRequest} extends {@link RequestModel}
 *
 * <p>DescribeDocumentRequest</p>
 */
public class DescribeDocumentRequest extends Request {
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

    private DescribeDocumentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.documentName = builder.documentName;
        this.kbUuid = builder.kbUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDocumentRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDocumentRequest, Builder> {
        private String regionId; 
        private String documentName; 
        private String kbUuid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDocumentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.documentName = request.documentName;
            this.kbUuid = request.kbUuid;
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

        @Override
        public DescribeDocumentRequest build() {
            return new DescribeDocumentRequest(this);
        } 

    } 

}
