// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DownloadCpsBillFileRequest} extends {@link RequestModel}
 *
 * <p>DownloadCpsBillFileRequest</p>
 */
public class DownloadCpsBillFileRequest extends Request {
    @Body
    @NameInMap("BillId")
    private String billId;

    @Body
    @NameInMap("BizId")
    private String bizId;

    private DownloadCpsBillFileRequest(Builder builder) {
        super(builder);
        this.billId = builder.billId;
        this.bizId = builder.bizId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadCpsBillFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billId
     */
    public String getBillId() {
        return this.billId;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    public static final class Builder extends Request.Builder<DownloadCpsBillFileRequest, Builder> {
        private String billId; 
        private String bizId; 

        private Builder() {
            super();
        } 

        private Builder(DownloadCpsBillFileRequest request) {
            super(request);
            this.billId = request.billId;
            this.bizId = request.bizId;
        } 

        /**
         * BillId.
         */
        public Builder billId(String billId) {
            this.putBodyParameter("BillId", billId);
            this.billId = billId;
            return this;
        }

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putBodyParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        @Override
        public DownloadCpsBillFileRequest build() {
            return new DownloadCpsBillFileRequest(this);
        } 

    } 

}
