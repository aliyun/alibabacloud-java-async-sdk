// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDeviceCertificateRequest} extends {@link RequestModel}
 *
 * <p>ListDeviceCertificateRequest</p>
 */
public class ListDeviceCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MqttInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mqttInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pageSize;

    private ListDeviceCertificateRequest(Builder builder) {
        super(builder);
        this.mqttInstanceId = builder.mqttInstanceId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeviceCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mqttInstanceId
     */
    public String getMqttInstanceId() {
        return this.mqttInstanceId;
    }

    /**
     * @return pageNo
     */
    public String getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListDeviceCertificateRequest, Builder> {
        private String mqttInstanceId; 
        private String pageNo; 
        private String pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListDeviceCertificateRequest request) {
            super(request);
            this.mqttInstanceId = request.mqttInstanceId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The instance ID of the Cloud Message Queue MQTT version, indicating which instance&quot;s device certificates need to be viewed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>post-cn-7mz2d******</p>
         */
        public Builder mqttInstanceId(String mqttInstanceId) {
            this.putQueryParameter("MqttInstanceId", mqttInstanceId);
            this.mqttInstanceId = mqttInstanceId;
            return this;
        }

        /**
         * <p>Indicates which page of the results to return. The starting page is counted from 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageNo(String pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The maximum number of query records to display per page. Value range: 1 to 100.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListDeviceCertificateRequest build() {
            return new ListDeviceCertificateRequest(this);
        } 

    } 

}
