// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link UpdateRecursionRecordEnableStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateRecursionRecordEnableStatusRequest</p>
 */
public class UpdateRecursionRecordEnableStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableStatus")
    private String enableStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordId")
    private String recordId;

    private UpdateRecursionRecordEnableStatusRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.enableStatus = builder.enableStatus;
        this.recordId = builder.recordId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRecursionRecordEnableStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return enableStatus
     */
    public String getEnableStatus() {
        return this.enableStatus;
    }

    /**
     * @return recordId
     */
    public String getRecordId() {
        return this.recordId;
    }

    public static final class Builder extends Request.Builder<UpdateRecursionRecordEnableStatusRequest, Builder> {
        private String clientToken; 
        private String enableStatus; 
        private String recordId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRecursionRecordEnableStatusRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.enableStatus = request.enableStatus;
            this.recordId = request.recordId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * EnableStatus.
         */
        public Builder enableStatus(String enableStatus) {
            this.putQueryParameter("EnableStatus", enableStatus);
            this.enableStatus = enableStatus;
            return this;
        }

        /**
         * RecordId.
         */
        public Builder recordId(String recordId) {
            this.putQueryParameter("RecordId", recordId);
            this.recordId = recordId;
            return this;
        }

        @Override
        public UpdateRecursionRecordEnableStatusRequest build() {
            return new UpdateRecursionRecordEnableStatusRequest(this);
        } 

    } 

}
