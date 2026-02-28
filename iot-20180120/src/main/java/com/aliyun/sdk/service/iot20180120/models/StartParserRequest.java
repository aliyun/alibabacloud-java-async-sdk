// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link StartParserRequest} extends {@link RequestModel}
 *
 * <p>StartParserRequest</p>
 */
public class StartParserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParserId")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 99999999999D)
    private Long parserId;

    private StartParserRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.parserId = builder.parserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartParserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return parserId
     */
    public Long getParserId() {
        return this.parserId;
    }

    public static final class Builder extends Request.Builder<StartParserRequest, Builder> {
        private String iotInstanceId; 
        private Long parserId; 

        private Builder() {
            super();
        } 

        private Builder(StartParserRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.parserId = request.parserId;
        } 

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        public Builder parserId(Long parserId) {
            this.putQueryParameter("ParserId", parserId);
            this.parserId = parserId;
            return this;
        }

        @Override
        public StartParserRequest build() {
            return new StartParserRequest(this);
        } 

    } 

}
