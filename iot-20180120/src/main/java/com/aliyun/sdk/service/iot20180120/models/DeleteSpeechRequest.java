// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSpeechRequest} extends {@link RequestModel}
 *
 * <p>DeleteSpeechRequest</p>
 */
public class DeleteSpeechRequest extends Request {
    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Body
    @NameInMap("SpeechCodeList")
    @Validation(required = true)
    private java.util.List < String > speechCodeList;

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
    public java.util.List < String > getSpeechCodeList() {
        return this.speechCodeList;
    }

    public static final class Builder extends Request.Builder<DeleteSpeechRequest, Builder> {
        private String iotInstanceId; 
        private java.util.List < String > speechCodeList; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSpeechRequest response) {
            super(response);
            this.iotInstanceId = response.iotInstanceId;
            this.speechCodeList = response.speechCodeList;
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
         * SpeechCodeList.
         */
        public Builder speechCodeList(java.util.List < String > speechCodeList) {
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
