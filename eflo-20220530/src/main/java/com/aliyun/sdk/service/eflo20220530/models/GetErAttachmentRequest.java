// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link GetErAttachmentRequest} extends {@link RequestModel}
 *
 * <p>GetErAttachmentRequest</p>
 */
public class GetErAttachmentRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ErAttachmentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String erAttachmentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ErId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String erId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private GetErAttachmentRequest(Builder builder) {
        super(builder);
        this.erAttachmentId = builder.erAttachmentId;
        this.erId = builder.erId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetErAttachmentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return erAttachmentId
     */
    public String getErAttachmentId() {
        return this.erAttachmentId;
    }

    /**
     * @return erId
     */
    public String getErId() {
        return this.erId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetErAttachmentRequest, Builder> {
        private String erAttachmentId; 
        private String erId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetErAttachmentRequest request) {
            super(request);
            this.erAttachmentId = request.erAttachmentId;
            this.erId = request.erId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the Lingjun HUB network connection instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>er-attachment-i1ioibyf</p>
         */
        public Builder erAttachmentId(String erAttachmentId) {
            this.putBodyParameter("ErAttachmentId", erAttachmentId);
            this.erAttachmentId = erAttachmentId;
            return this;
        }

        /**
         * <p>Lingjun HUB ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>er-kkopgtne</p>
         */
        public Builder erId(String erId) {
            this.putBodyParameter("ErId", erId);
            this.erId = erId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetErAttachmentRequest build() {
            return new GetErAttachmentRequest(this);
        } 

    } 

}
