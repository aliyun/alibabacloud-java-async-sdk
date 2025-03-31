// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

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
 * {@link ListDeviceCertificateByCaSnRequest} extends {@link RequestModel}
 *
 * <p>ListDeviceCertificateByCaSnRequest</p>
 */
public class ListDeviceCertificateByCaSnRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CaSn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String caSn;

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

    private ListDeviceCertificateByCaSnRequest(Builder builder) {
        super(builder);
        this.caSn = builder.caSn;
        this.mqttInstanceId = builder.mqttInstanceId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeviceCertificateByCaSnRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return caSn
     */
    public String getCaSn() {
        return this.caSn;
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

    public static final class Builder extends Request.Builder<ListDeviceCertificateByCaSnRequest, Builder> {
        private String caSn; 
        private String mqttInstanceId; 
        private String pageNo; 
        private String pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListDeviceCertificateByCaSnRequest request) {
            super(request);
            this.caSn = request.caSn;
            this.mqttInstanceId = request.mqttInstanceId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The SN serial number of the CA certificate to be queried, indicating which CA certificate&quot;s registered device certificates are to be retrieved.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>007269004887******</p>
         */
        public Builder caSn(String caSn) {
            this.putQueryParameter("CaSn", caSn);
            this.caSn = caSn;
            return this;
        }

        /**
         * <p>The instance ID bound to the CA certificate, which is the instance ID of the MQTT version of the cloud message queue.</p>
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
         * <p>Indicates the page number of the returned results. The starting page is counted from 1.</p>
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
        public ListDeviceCertificateByCaSnRequest build() {
            return new ListDeviceCertificateByCaSnRequest(this);
        } 

    } 

}
