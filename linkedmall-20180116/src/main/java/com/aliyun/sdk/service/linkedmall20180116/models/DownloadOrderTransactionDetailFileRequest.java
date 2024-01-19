// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DownloadOrderTransactionDetailFileRequest} extends {@link RequestModel}
 *
 * <p>DownloadOrderTransactionDetailFileRequest</p>
 */
public class DownloadOrderTransactionDetailFileRequest extends Request {
    @Body
    @NameInMap("BizId")
    private String bizId;

    @Body
    @NameInMap("RecordId")
    private String recordId;

    private DownloadOrderTransactionDetailFileRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.recordId = builder.recordId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadOrderTransactionDetailFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return recordId
     */
    public String getRecordId() {
        return this.recordId;
    }

    public static final class Builder extends Request.Builder<DownloadOrderTransactionDetailFileRequest, Builder> {
        private String bizId; 
        private String recordId; 

        private Builder() {
            super();
        } 

        private Builder(DownloadOrderTransactionDetailFileRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.recordId = request.recordId;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putBodyParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * RecordId.
         */
        public Builder recordId(String recordId) {
            this.putBodyParameter("RecordId", recordId);
            this.recordId = recordId;
            return this;
        }

        @Override
        public DownloadOrderTransactionDetailFileRequest build() {
            return new DownloadOrderTransactionDetailFileRequest(this);
        } 

    } 

}
