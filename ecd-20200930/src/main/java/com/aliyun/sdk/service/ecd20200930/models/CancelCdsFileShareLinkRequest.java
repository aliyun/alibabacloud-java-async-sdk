// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelCdsFileShareLinkRequest} extends {@link RequestModel}
 *
 * <p>CancelCdsFileShareLinkRequest</p>
 */
public class CancelCdsFileShareLinkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CdsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cdsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShareId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shareId;

    private CancelCdsFileShareLinkRequest(Builder builder) {
        super(builder);
        this.cdsId = builder.cdsId;
        this.shareId = builder.shareId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelCdsFileShareLinkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cdsId
     */
    public String getCdsId() {
        return this.cdsId;
    }

    /**
     * @return shareId
     */
    public String getShareId() {
        return this.shareId;
    }

    public static final class Builder extends Request.Builder<CancelCdsFileShareLinkRequest, Builder> {
        private String cdsId; 
        private String shareId; 

        private Builder() {
            super();
        } 

        private Builder(CancelCdsFileShareLinkRequest request) {
            super(request);
            this.cdsId = request.cdsId;
            this.shareId = request.shareId;
        } 

        /**
         * The ID of the cloud disk.
         */
        public Builder cdsId(String cdsId) {
            this.putQueryParameter("CdsId", cdsId);
            this.cdsId = cdsId;
            return this;
        }

        /**
         * The ID of the file sharing task.
         */
        public Builder shareId(String shareId) {
            this.putQueryParameter("ShareId", shareId);
            this.shareId = shareId;
            return this;
        }

        @Override
        public CancelCdsFileShareLinkRequest build() {
            return new CancelCdsFileShareLinkRequest(this);
        } 

    } 

}
