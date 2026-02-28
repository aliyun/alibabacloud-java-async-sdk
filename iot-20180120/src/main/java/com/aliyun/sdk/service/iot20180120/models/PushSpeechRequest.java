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
 * {@link PushSpeechRequest} extends {@link RequestModel}
 *
 * <p>PushSpeechRequest</p>
 */
public class PushSpeechRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    private String deviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

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
    @com.aliyun.core.annotation.NameInMap("ProjectCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PushMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pushMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SpeechCodeList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> speechCodeList;

    private PushSpeechRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.groupId = builder.groupId;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
        this.projectCode = builder.projectCode;
        this.pushMode = builder.pushMode;
        this.speechCodeList = builder.speechCodeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushSpeechRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
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
     * @return projectCode
     */
    public String getProjectCode() {
        return this.projectCode;
    }

    /**
     * @return pushMode
     */
    public String getPushMode() {
        return this.pushMode;
    }

    /**
     * @return speechCodeList
     */
    public java.util.List<String> getSpeechCodeList() {
        return this.speechCodeList;
    }

    public static final class Builder extends Request.Builder<PushSpeechRequest, Builder> {
        private String deviceName; 
        private String groupId; 
        private String iotId; 
        private String iotInstanceId; 
        private String productKey; 
        private String projectCode; 
        private String pushMode; 
        private java.util.List<String> speechCodeList; 

        private Builder() {
            super();
        } 

        private Builder(PushSpeechRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.groupId = request.groupId;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
            this.projectCode = request.projectCode;
            this.pushMode = request.pushMode;
            this.speechCodeList = request.speechCodeList;
        } 

        /**
         * DeviceName.
         */
        public Builder deviceName(String deviceName) {
            this.putBodyParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * IotId.
         */
        public Builder iotId(String iotId) {
            this.putBodyParameter("IotId", iotId);
            this.iotId = iotId;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putBodyParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putBodyParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4de2c367**<strong>8c585e5992</strong></p>
         */
        public Builder projectCode(String projectCode) {
            this.putBodyParameter("ProjectCode", projectCode);
            this.projectCode = projectCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SINGLE_DEVICE</p>
         */
        public Builder pushMode(String pushMode) {
            this.putBodyParameter("PushMode", pushMode);
            this.pushMode = pushMode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4de2c367**<strong>8c585e5992</strong></p>
         */
        public Builder speechCodeList(java.util.List<String> speechCodeList) {
            this.putBodyParameter("SpeechCodeList", speechCodeList);
            this.speechCodeList = speechCodeList;
            return this;
        }

        @Override
        public PushSpeechRequest build() {
            return new PushSpeechRequest(this);
        } 

    } 

}
