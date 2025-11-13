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
 * {@link UpdateRecursionRecordWeightEnableStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateRecursionRecordWeightEnableStatusRequest</p>
 */
public class UpdateRecursionRecordWeightEnableStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableStatus")
    private String enableStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestSource")
    private String requestSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rr")
    private String rr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private UpdateRecursionRecordWeightEnableStatusRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.enableStatus = builder.enableStatus;
        this.requestSource = builder.requestSource;
        this.rr = builder.rr;
        this.type = builder.type;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRecursionRecordWeightEnableStatusRequest create() {
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
     * @return requestSource
     */
    public String getRequestSource() {
        return this.requestSource;
    }

    /**
     * @return rr
     */
    public String getRr() {
        return this.rr;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<UpdateRecursionRecordWeightEnableStatusRequest, Builder> {
        private String clientToken; 
        private String enableStatus; 
        private String requestSource; 
        private String rr; 
        private String type; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRecursionRecordWeightEnableStatusRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.enableStatus = request.enableStatus;
            this.requestSource = request.requestSource;
            this.rr = request.rr;
            this.type = request.type;
            this.zoneId = request.zoneId;
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
         * RequestSource.
         */
        public Builder requestSource(String requestSource) {
            this.putQueryParameter("RequestSource", requestSource);
            this.requestSource = requestSource;
            return this;
        }

        /**
         * Rr.
         */
        public Builder rr(String rr) {
            this.putQueryParameter("Rr", rr);
            this.rr = rr;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public UpdateRecursionRecordWeightEnableStatusRequest build() {
            return new UpdateRecursionRecordWeightEnableStatusRequest(this);
        } 

    } 

}
