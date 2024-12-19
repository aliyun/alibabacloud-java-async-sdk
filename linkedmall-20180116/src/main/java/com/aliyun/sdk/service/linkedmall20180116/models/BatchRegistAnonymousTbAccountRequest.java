// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link BatchRegistAnonymousTbAccountRequest} extends {@link RequestModel}
 *
 * <p>BatchRegistAnonymousTbAccountRequest</p>
 */
public class BatchRegistAnonymousTbAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdJsonList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String idJsonList;

    private BatchRegistAnonymousTbAccountRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.idJsonList = builder.idJsonList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchRegistAnonymousTbAccountRequest create() {
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
     * @return idJsonList
     */
    public String getIdJsonList() {
        return this.idJsonList;
    }

    public static final class Builder extends Request.Builder<BatchRegistAnonymousTbAccountRequest, Builder> {
        private String bizId; 
        private String idJsonList; 

        private Builder() {
            super();
        } 

        private Builder(BatchRegistAnonymousTbAccountRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.idJsonList = request.idJsonList;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LMALL20210802****</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idJsonList&quot;: &quot;[&quot;id1&quot;, &quot;id2&quot;]</p>
         */
        public Builder idJsonList(String idJsonList) {
            this.putQueryParameter("IdJsonList", idJsonList);
            this.idJsonList = idJsonList;
            return this;
        }

        @Override
        public BatchRegistAnonymousTbAccountRequest build() {
            return new BatchRegistAnonymousTbAccountRequest(this);
        } 

    } 

}
