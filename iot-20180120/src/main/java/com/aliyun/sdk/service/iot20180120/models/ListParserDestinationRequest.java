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
 * {@link ListParserDestinationRequest} extends {@link RequestModel}
 *
 * <p>ListParserDestinationRequest</p>
 */
public class ListParserDestinationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsFailover")
    private Boolean isFailover;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParserId")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 9999999999D)
    private Long parserId;

    private ListParserDestinationRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.isFailover = builder.isFailover;
        this.parserId = builder.parserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListParserDestinationRequest create() {
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
     * @return isFailover
     */
    public Boolean getIsFailover() {
        return this.isFailover;
    }

    /**
     * @return parserId
     */
    public Long getParserId() {
        return this.parserId;
    }

    public static final class Builder extends Request.Builder<ListParserDestinationRequest, Builder> {
        private String iotInstanceId; 
        private Boolean isFailover; 
        private Long parserId; 

        private Builder() {
            super();
        } 

        private Builder(ListParserDestinationRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.isFailover = request.isFailover;
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
         * IsFailover.
         */
        public Builder isFailover(Boolean isFailover) {
            this.putQueryParameter("IsFailover", isFailover);
            this.isFailover = isFailover;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1002</p>
         */
        public Builder parserId(Long parserId) {
            this.putQueryParameter("ParserId", parserId);
            this.parserId = parserId;
            return this;
        }

        @Override
        public ListParserDestinationRequest build() {
            return new ListParserDestinationRequest(this);
        } 

    } 

}
