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
 * {@link BatchAddThingTopoRequest} extends {@link RequestModel}
 *
 * <p>BatchAddThingTopoRequest</p>
 */
public class BatchAddThingTopoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GwDeviceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gwDeviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GwProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gwProductKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopoAddItem")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<TopoAddItem> topoAddItem;

    private BatchAddThingTopoRequest(Builder builder) {
        super(builder);
        this.gwDeviceName = builder.gwDeviceName;
        this.gwProductKey = builder.gwProductKey;
        this.iotInstanceId = builder.iotInstanceId;
        this.topoAddItem = builder.topoAddItem;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchAddThingTopoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gwDeviceName
     */
    public String getGwDeviceName() {
        return this.gwDeviceName;
    }

    /**
     * @return gwProductKey
     */
    public String getGwProductKey() {
        return this.gwProductKey;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return topoAddItem
     */
    public java.util.List<TopoAddItem> getTopoAddItem() {
        return this.topoAddItem;
    }

    public static final class Builder extends Request.Builder<BatchAddThingTopoRequest, Builder> {
        private String gwDeviceName; 
        private String gwProductKey; 
        private String iotInstanceId; 
        private java.util.List<TopoAddItem> topoAddItem; 

        private Builder() {
            super();
        } 

        private Builder(BatchAddThingTopoRequest request) {
            super(request);
            this.gwDeviceName = request.gwDeviceName;
            this.gwProductKey = request.gwProductKey;
            this.iotInstanceId = request.iotInstanceId;
            this.topoAddItem = request.topoAddItem;
        } 

        /**
         * <p>The name of the gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gateway</p>
         */
        public Builder gwDeviceName(String gwDeviceName) {
            this.putQueryParameter("GwDeviceName", gwDeviceName);
            this.gwDeviceName = gwDeviceName;
            return this;
        }

        /**
         * <p>The key of the product to which the gateway belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a1vL7cp****</p>
         */
        public Builder gwProductKey(String gwProductKey) {
            this.putQueryParameter("GwProductKey", gwProductKey);
            this.gwProductKey = gwProductKey;
            return this;
        }

        /**
         * <p>The ID of the instance. On the <strong>Overview</strong> page in the IoT Platform console, you can view the ID of the instance.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must specify this parameter. Otherwise, the call fails.</li>
         * <li>If no <strong>Overview</strong> page or instance ID appears in the IoT Platform console, ignore this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot_instc_pu****_c*-v64********</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder topoAddItem(java.util.List<TopoAddItem> topoAddItem) {
            this.putQueryParameter("TopoAddItem", topoAddItem);
            this.topoAddItem = topoAddItem;
            return this;
        }

        @Override
        public BatchAddThingTopoRequest build() {
            return new BatchAddThingTopoRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchAddThingTopoRequest} extends {@link TeaModel}
     *
     * <p>BatchAddThingTopoRequest</p>
     */
    public static class TopoAddItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("DeviceName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("Sign")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sign;

        @com.aliyun.core.annotation.NameInMap("SignMethod")
        @com.aliyun.core.annotation.Validation(required = true)
        private String signMethod;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        private TopoAddItem(Builder builder) {
            this.clientId = builder.clientId;
            this.deviceName = builder.deviceName;
            this.productKey = builder.productKey;
            this.sign = builder.sign;
            this.signMethod = builder.signMethod;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopoAddItem create() {
            return builder().build();
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return sign
         */
        public String getSign() {
            return this.sign;
        }

        /**
         * @return signMethod
         */
        public String getSignMethod() {
            return this.signMethod;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String clientId; 
            private String deviceName; 
            private String productKey; 
            private String sign; 
            private String signMethod; 
            private String timestamp; 

            private Builder() {
            } 

            private Builder(TopoAddItem model) {
                this.clientId = model.clientId;
                this.deviceName = model.deviceName;
                this.productKey = model.productKey;
                this.sign = model.sign;
                this.signMethod = model.signMethod;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>The client ID of the sub-device. The ID can be the serial number (SN) or media access control (MAC) address of the device. This parameter is optional.</p>
             * <blockquote>
             * <p>If this parameter is included in the value of the <strong>TopoAddItem.N.Sign</strong> parameter, you must specify this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>a1BwAGV****device1</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The name of each sub-device.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>light</p>
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * <p>The key of the product to which the sub-device belongs.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>a1BwAGV****</p>
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * <p>The signature of the sub-device.</p>
             * <p>Set the Sign parameter to the result of the <strong>SignMethod(deviceSecret,content)</strong> function.</p>
             * <p>To obtain the <strong>content</strong> parameter, sort all sub-device parameters that are submitted to the server, except the Sign and SignMethod parameters, in alphabetical order. Then, concatenate the parameters and values in sequence. No concatenation symbol is required to separate these parameters and values.</p>
             * <p>For example, you want to specify the following parameters for a sub-device: <strong>ClientId=868575026974305, DeviceName=868575026974305, ProductKey=a1PB5fp1234, SignMethod=hmacmd5, timestamp=1646277090411, and deviceSecret=1234</strong>. In this case, the signature function is <code>hmacmd5(1234, clientId868575026974305deviceName868575026974305productKeya1PB5fp1234timestamp1646277090411)</code>, and the calculation result is <code>3BA0DFA4C477B40C007D84D30D6466CC</code>.</p>
             * <blockquote>
             * <p> In the preceding example, <strong>ClientId</strong> indicates the client ID of the sub-device. You can specify a custom client ID.</p>
             * </blockquote>
             * <p>For more information about how to calculate the signature value, see <a href="https://help.aliyun.com/document_detail/292635.html">How do I obtain MQTT parameters for authentication?</a>. The signature value is the calculated value of the passwd parameter.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>C1C1606D61884C5F16C9EA6622E5****</p>
             */
            public Builder sign(String sign) {
                this.sign = sign;
                return this;
            }

            /**
             * <p>The signature algorithm. Valid values: <strong>hmacSha1</strong>, <strong>hmacSha256</strong>, <strong>hmacMd5</strong>, and <strong>Sha256</strong>. The value is not case-sensitive.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>hmacMd5</p>
             */
            public Builder signMethod(String signMethod) {
                this.signMethod = signMethod;
                return this;
            }

            /**
             * <p>The timestamp in UTC. This parameter is optional.</p>
             * <blockquote>
             * <p>If this parameter is included in the value of the <strong>TopoAddItem.N.Sign</strong> parameter, you must specify this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1579335899000</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public TopoAddItem build() {
                return new TopoAddItem(this);
            } 

        } 

    }
}
