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
 * {@link DetachDestinationRequest} extends {@link RequestModel}
 *
 * <p>DetachDestinationRequest</p>
 */
public class DetachDestinationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationId")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 999999999999D)
    private Long destinationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParserId")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 9999999999D, minimum = 1)
    private Long parserId;

    private DetachDestinationRequest(Builder builder) {
        super(builder);
        this.destinationId = builder.destinationId;
        this.iotInstanceId = builder.iotInstanceId;
        this.parserId = builder.parserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachDestinationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destinationId
     */
    public Long getDestinationId() {
        return this.destinationId;
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

    public static final class Builder extends Request.Builder<DetachDestinationRequest, Builder> {
        private Long destinationId; 
        private String iotInstanceId; 
        private Long parserId; 

        private Builder() {
            super();
        } 

        private Builder(DetachDestinationRequest request) {
            super(request);
            this.destinationId = request.destinationId;
            this.iotInstanceId = request.iotInstanceId;
            this.parserId = request.parserId;
        } 

        /**
         * <p>The ID of the data destination. You can call the <a href="https://help.aliyun.com/document_detail/433025.html">ListDestination</a> operation to query data destinations and obtain the ID of the <strong>data destination</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1002</p>
         */
        public Builder destinationId(Long destinationId) {
            this.putQueryParameter("DestinationId", destinationId);
            this.destinationId = destinationId;
            return this;
        }

        /**
         * <p>The ID of the instance. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</li>
         * <li>If no <strong>Overview</strong> page or ID is generated for your instance, you do not need to configure this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-2w****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The ID of the parser. You can call the <a href="https://help.aliyun.com/document_detail/444814.html">ListParser</a> operation to query parsers and obtain the ID of the <strong>parser</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder parserId(Long parserId) {
            this.putQueryParameter("ParserId", parserId);
            this.parserId = parserId;
            return this;
        }

        @Override
        public DetachDestinationRequest build() {
            return new DetachDestinationRequest(this);
        } 

    } 

}
