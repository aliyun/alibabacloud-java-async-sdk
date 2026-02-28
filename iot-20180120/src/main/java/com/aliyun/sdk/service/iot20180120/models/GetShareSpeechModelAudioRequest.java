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
 * {@link GetShareSpeechModelAudioRequest} extends {@link RequestModel}
 *
 * <p>GetShareSpeechModelAudioRequest</p>
 */
public class GetShareSpeechModelAudioRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShareTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shareTaskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SpeechModelCodeList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> speechModelCodeList;

    private GetShareSpeechModelAudioRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.shareTaskId = builder.shareTaskId;
        this.speechModelCodeList = builder.speechModelCodeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetShareSpeechModelAudioRequest create() {
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
     * @return shareTaskId
     */
    public String getShareTaskId() {
        return this.shareTaskId;
    }

    /**
     * @return speechModelCodeList
     */
    public java.util.List<String> getSpeechModelCodeList() {
        return this.speechModelCodeList;
    }

    public static final class Builder extends Request.Builder<GetShareSpeechModelAudioRequest, Builder> {
        private String iotInstanceId; 
        private String shareTaskId; 
        private java.util.List<String> speechModelCodeList; 

        private Builder() {
            super();
        } 

        private Builder(GetShareSpeechModelAudioRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.shareTaskId = request.shareTaskId;
            this.speechModelCodeList = request.speechModelCodeList;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Md3ZiTL888K9llXDy7890***********</p>
         */
        public Builder shareTaskId(String shareTaskId) {
            this.putBodyParameter("ShareTaskId", shareTaskId);
            this.shareTaskId = shareTaskId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WSD****</p>
         */
        public Builder speechModelCodeList(java.util.List<String> speechModelCodeList) {
            this.putBodyParameter("SpeechModelCodeList", speechModelCodeList);
            this.speechModelCodeList = speechModelCodeList;
            return this;
        }

        @Override
        public GetShareSpeechModelAudioRequest build() {
            return new GetShareSpeechModelAudioRequest(this);
        } 

    } 

}
