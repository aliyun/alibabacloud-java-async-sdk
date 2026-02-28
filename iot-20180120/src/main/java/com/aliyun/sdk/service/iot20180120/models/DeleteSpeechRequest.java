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
 * {@link DeleteSpeechRequest} extends {@link RequestModel}
 *
 * <p>DeleteSpeechRequest</p>
 */
public class DeleteSpeechRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SpeechCodeList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> speechCodeList;

    private DeleteSpeechRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.speechCodeList = builder.speechCodeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSpeechRequest create() {
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
     * @return speechCodeList
     */
    public java.util.List<String> getSpeechCodeList() {
        return this.speechCodeList;
    }

    public static final class Builder extends Request.Builder<DeleteSpeechRequest, Builder> {
        private String iotInstanceId; 
        private java.util.List<String> speechCodeList; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSpeechRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.speechCodeList = request.speechCodeList;
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
         * <p>4de2c367**<strong>8c585e5992</strong></p>
         */
        public Builder speechCodeList(java.util.List<String> speechCodeList) {
            this.putBodyParameter("SpeechCodeList", speechCodeList);
            this.speechCodeList = speechCodeList;
            return this;
        }

        @Override
        public DeleteSpeechRequest build() {
            return new DeleteSpeechRequest(this);
        } 

    } 

}
