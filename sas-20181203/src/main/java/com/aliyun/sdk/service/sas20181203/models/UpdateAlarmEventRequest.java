// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAlarmEventRequest} extends {@link RequestModel}
 *
 * <p>UpdateAlarmEventRequest</p>
 */
public class UpdateAlarmEventRequest extends Request {
    @Body
    @NameInMap("AlarmEventIdList")
    private java.util.List < Long > alarmEventIdList;

    @Body
    @NameInMap("Lang")
    private String lang;

    @Body
    @NameInMap("OperationCode")
    private String operationCode;

    private UpdateAlarmEventRequest(Builder builder) {
        super(builder);
        this.alarmEventIdList = builder.alarmEventIdList;
        this.lang = builder.lang;
        this.operationCode = builder.operationCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAlarmEventRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmEventIdList
     */
    public java.util.List < Long > getAlarmEventIdList() {
        return this.alarmEventIdList;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return operationCode
     */
    public String getOperationCode() {
        return this.operationCode;
    }

    public static final class Builder extends Request.Builder<UpdateAlarmEventRequest, Builder> {
        private java.util.List < Long > alarmEventIdList; 
        private String lang; 
        private String operationCode; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAlarmEventRequest request) {
            super(request);
            this.alarmEventIdList = request.alarmEventIdList;
            this.lang = request.lang;
            this.operationCode = request.operationCode;
        } 

        /**
         * AlarmEventIdList.
         */
        public Builder alarmEventIdList(java.util.List < Long > alarmEventIdList) {
            this.putBodyParameter("AlarmEventIdList", alarmEventIdList);
            this.alarmEventIdList = alarmEventIdList;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * OperationCode.
         */
        public Builder operationCode(String operationCode) {
            this.putBodyParameter("OperationCode", operationCode);
            this.operationCode = operationCode;
            return this;
        }

        @Override
        public UpdateAlarmEventRequest build() {
            return new UpdateAlarmEventRequest(this);
        } 

    } 

}
