// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushSpeechRequest} extends {@link RequestModel}
 *
 * <p>PushSpeechRequest</p>
 */
public class PushSpeechRequest extends Request {
    @Body
    @NameInMap("DeviceName")
    private String deviceName;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Body
    @NameInMap("IotId")
    private String iotId;

    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Body
    @NameInMap("ProductKey")
    private String productKey;

    @Body
    @NameInMap("ProjectCode")
    @Validation(required = true)
    private String projectCode;

    @Body
    @NameInMap("PushMode")
    @Validation(required = true)
    private String pushMode;

    @Body
    @NameInMap("SpeechCodeList")
    @Validation(required = true)
    private java.util.List < String > speechCodeList;

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
    public java.util.List < String > getSpeechCodeList() {
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
        private java.util.List < String > speechCodeList; 

        private Builder() {
            super();
        } 

        private Builder(PushSpeechRequest response) {
            super(response);
            this.deviceName = response.deviceName;
            this.groupId = response.groupId;
            this.iotId = response.iotId;
            this.iotInstanceId = response.iotInstanceId;
            this.productKey = response.productKey;
            this.projectCode = response.projectCode;
            this.pushMode = response.pushMode;
            this.speechCodeList = response.speechCodeList;
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
         * ProjectCode.
         */
        public Builder projectCode(String projectCode) {
            this.putBodyParameter("ProjectCode", projectCode);
            this.projectCode = projectCode;
            return this;
        }

        /**
         * PushMode.
         */
        public Builder pushMode(String pushMode) {
            this.putBodyParameter("PushMode", pushMode);
            this.pushMode = pushMode;
            return this;
        }

        /**
         * SpeechCodeList.
         */
        public Builder speechCodeList(java.util.List < String > speechCodeList) {
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
