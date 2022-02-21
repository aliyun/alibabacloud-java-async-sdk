// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAlarmRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteAlarmRuleRequest</p>
 */
public class DeleteAlarmRuleRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("AlarmRuleId")
    @Validation(required = true)
    private String alarmRuleId;

    @Query
    @NameInMap("RequestPars")
    private String requestPars;

    private DeleteAlarmRuleRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.alarmRuleId = builder.alarmRuleId;
        this.requestPars = builder.requestPars;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAlarmRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return alarmRuleId
     */
    public String getAlarmRuleId() {
        return this.alarmRuleId;
    }

    /**
     * @return requestPars
     */
    public String getRequestPars() {
        return this.requestPars;
    }

    public static final class Builder extends Request.Builder<DeleteAlarmRuleRequest, Builder> {
        private String acceptLanguage; 
        private String alarmRuleId; 
        private String requestPars; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAlarmRuleRequest response) {
            super(response);
            this.acceptLanguage = response.acceptLanguage;
            this.alarmRuleId = response.alarmRuleId;
            this.requestPars = response.requestPars;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * AlarmRuleId.
         */
        public Builder alarmRuleId(String alarmRuleId) {
            this.putQueryParameter("AlarmRuleId", alarmRuleId);
            this.alarmRuleId = alarmRuleId;
            return this;
        }

        /**
         * RequestPars.
         */
        public Builder requestPars(String requestPars) {
            this.putQueryParameter("RequestPars", requestPars);
            this.requestPars = requestPars;
            return this;
        }

        @Override
        public DeleteAlarmRuleRequest build() {
            return new DeleteAlarmRuleRequest(this);
        } 

    } 

}
