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
 * {@link ShareSpeechByCombinationRequest} extends {@link RequestModel}
 *
 * <p>ShareSpeechByCombinationRequest</p>
 */
public class ShareSpeechByCombinationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AudioFormat")
    private String audioFormat;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CombinationList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> combinationList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    private String deviceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotId")
    private String iotId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    private String productKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SpeechId")
    private String speechId;

    private ShareSpeechByCombinationRequest(Builder builder) {
        super(builder);
        this.audioFormat = builder.audioFormat;
        this.combinationList = builder.combinationList;
        this.deviceName = builder.deviceName;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
        this.speechId = builder.speechId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ShareSpeechByCombinationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return audioFormat
     */
    public String getAudioFormat() {
        return this.audioFormat;
    }

    /**
     * @return combinationList
     */
    public java.util.List<String> getCombinationList() {
        return this.combinationList;
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return iotId
     */
    public String getIotId() {
        return this.iotId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return speechId
     */
    public String getSpeechId() {
        return this.speechId;
    }

    public static final class Builder extends Request.Builder<ShareSpeechByCombinationRequest, Builder> {
        private String audioFormat; 
        private java.util.List<String> combinationList; 
        private String deviceName; 
        private String iotId; 
        private String iotInstanceId; 
        private String productKey; 
        private String speechId; 

        private Builder() {
            super();
        } 

        private Builder(ShareSpeechByCombinationRequest request) {
            super(request);
            this.audioFormat = request.audioFormat;
            this.combinationList = request.combinationList;
            this.deviceName = request.deviceName;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
            this.speechId = request.speechId;
        } 

        /**
         * <p>The audio format. Valid values: <strong>wav</strong>, <strong>mp3</strong>, and <strong>amr</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>wav</p>
         */
        public Builder audioFormat(String audioFormat) {
            this.putBodyParameter("AudioFormat", audioFormat);
            this.audioFormat = audioFormat;
            return this;
        }

        /**
         * <p>The combined content that you want to broadcast. The following types of content can be broadcasted:</p>
         * <ul>
         * <li><p>The speeches that are pushed to the device. You must specify the identifiers of the speeches.</p>
         * </li>
         * <li><p>The custom content that you specify based on the supported format of the device.</p>
         * <p>For example, you can create a custom speech about the amount of money in the format of <code>{$xxx}</code>. xxx is the specific amount. If you specify <code>{$1000}</code>, the device broadcasts <strong>CNY 1000</strong>.</p>
         * </li>
         * </ul>
         * <p>The device broadcasts the audio files in the sequence of the values that you specify in CombinationList.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ZFBDZ</p>
         */
        public Builder combinationList(java.util.List<String> combinationList) {
            this.putBodyParameter("CombinationList", combinationList);
            this.combinationList = combinationList;
            return this;
        }

        /**
         * <p>The <strong>DeviceName</strong> of the device. If you specify this parameter, you must also specify the <strong>ProductKey</strong> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder deviceName(String deviceName) {
            this.putBodyParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * <p>The ID of the device. You can call the <a href="https://help.aliyun.com/document_detail/280408.html">QuerySpeechDevice</a> operation to obtain the ID.</p>
         * <blockquote>
         * <p>If you specify this parameter, you do not need to specify the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters. <strong>IotId</strong> specifies a globally unique identifier (GUID) of the device, which corresponds to a combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>. If you specify the <strong>IotId</strong>, <strong>ProductKey</strong>, and <strong>DeviceName</strong> parameters, the value of the <strong>IotId</strong> parameter takes precedence.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Q7uOhVRdZRRlDnTLv****00100</p>
         */
        public Builder iotId(String iotId) {
            this.putBodyParameter("IotId", iotId);
            this.iotId = iotId;
            return this;
        }

        /**
         * <p>The instance ID. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <p> If your instance has an ID, you must specify this parameter. Otherwise, the request fails. If no Overview page exists or no instance ID is displayed, you do not need to specify this parameter.</p>
         * </blockquote>
         * <p>For more information, see the <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a> topic of IoT instances.</p>
         * 
         * <strong>example:</strong>
         * <p>iot_instc_pu****_c*-v64********</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putBodyParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The <strong>ProductKey</strong> of the product to which the device belongs. If you specify this parameter, you must also specify the <strong>DeviceName</strong> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>a1BwAGV****</p>
         */
        public Builder productKey(String productKey) {
            this.putBodyParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * <p>The unique ID of the combined speech that you want to broadcast. This ID is issued by IoT Platform to the device.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, IoT Platform automatically generates an ID. If you need to retry broadcasting the speech, you must specify the ID to prevent repeated broadcasting.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>42000011392021112380********</p>
         */
        public Builder speechId(String speechId) {
            this.putBodyParameter("SpeechId", speechId);
            this.speechId = speechId;
            return this;
        }

        @Override
        public ShareSpeechByCombinationRequest build() {
            return new ShareSpeechByCombinationRequest(this);
        } 

    } 

}
