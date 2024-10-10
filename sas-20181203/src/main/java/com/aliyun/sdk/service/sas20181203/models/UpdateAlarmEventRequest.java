// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateAlarmEventRequest} extends {@link RequestModel}
 *
 * <p>UpdateAlarmEventRequest</p>
 */
public class UpdateAlarmEventRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlarmEventIdList")
    private java.util.List < Long > alarmEventIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OperationCode")
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
         * <p>The IDs of the alert events.</p>
         */
        public Builder alarmEventIdList(java.util.List < Long > alarmEventIdList) {
            this.putBodyParameter("AlarmEventIdList", alarmEventIdList);
            this.alarmEventIdList = alarmEventIdList;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The operation that you want to perform on the alert events. Valid values:</p>
         * <ul>
         * <li><strong>manual_handled</strong>: handle the alert events.</li>
         * <li><strong>ignore</strong>: igore the alert events.</li>
         * <li><strong>cancel_ignore</strong>: remove the alert events from the whitelist.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ignore</p>
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
