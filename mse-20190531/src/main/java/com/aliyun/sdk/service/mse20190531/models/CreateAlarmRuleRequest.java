// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAlarmRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateAlarmRuleRequest</p>
 */
public class CreateAlarmRuleRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("Aggregates")
    @Validation(required = true)
    private String aggregates;

    @Query
    @NameInMap("AlarmAliasName")
    @Validation(required = true)
    private String alarmAliasName;

    @Query
    @NameInMap("AlarmItem")
    @Validation(required = true)
    private String alarmItem;

    @Query
    @NameInMap("AlertWay")
    @Validation(required = true)
    private java.util.Map < String, ? > alertWay;

    @Query
    @NameInMap("ContactGroupIds")
    @Validation(required = true)
    private java.util.Map < String, ? > contactGroupIds;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("NValue")
    @Validation(required = true)
    private Integer NValue;

    @Query
    @NameInMap("Operator")
    @Validation(required = true)
    private String operator;

    @Query
    @NameInMap("Value")
    @Validation(required = true)
    private Float value;

    private CreateAlarmRuleRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.aggregates = builder.aggregates;
        this.alarmAliasName = builder.alarmAliasName;
        this.alarmItem = builder.alarmItem;
        this.alertWay = builder.alertWay;
        this.contactGroupIds = builder.contactGroupIds;
        this.instanceId = builder.instanceId;
        this.NValue = builder.NValue;
        this.operator = builder.operator;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAlarmRuleRequest create() {
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
     * @return aggregates
     */
    public String getAggregates() {
        return this.aggregates;
    }

    /**
     * @return alarmAliasName
     */
    public String getAlarmAliasName() {
        return this.alarmAliasName;
    }

    /**
     * @return alarmItem
     */
    public String getAlarmItem() {
        return this.alarmItem;
    }

    /**
     * @return alertWay
     */
    public java.util.Map < String, ? > getAlertWay() {
        return this.alertWay;
    }

    /**
     * @return contactGroupIds
     */
    public java.util.Map < String, ? > getContactGroupIds() {
        return this.contactGroupIds;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return NValue
     */
    public Integer getNValue() {
        return this.NValue;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return value
     */
    public Float getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<CreateAlarmRuleRequest, Builder> {
        private String acceptLanguage; 
        private String aggregates; 
        private String alarmAliasName; 
        private String alarmItem; 
        private java.util.Map < String, ? > alertWay; 
        private java.util.Map < String, ? > contactGroupIds; 
        private String instanceId; 
        private Integer NValue; 
        private String operator; 
        private Float value; 

        private Builder() {
            super();
        } 

        private Builder(CreateAlarmRuleRequest response) {
            super(response);
            this.acceptLanguage = response.acceptLanguage;
            this.aggregates = response.aggregates;
            this.alarmAliasName = response.alarmAliasName;
            this.alarmItem = response.alarmItem;
            this.alertWay = response.alertWay;
            this.contactGroupIds = response.contactGroupIds;
            this.instanceId = response.instanceId;
            this.NValue = response.NValue;
            this.operator = response.operator;
            this.value = response.value;
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
         * Aggregates.
         */
        public Builder aggregates(String aggregates) {
            this.putQueryParameter("Aggregates", aggregates);
            this.aggregates = aggregates;
            return this;
        }

        /**
         * AlarmAliasName.
         */
        public Builder alarmAliasName(String alarmAliasName) {
            this.putQueryParameter("AlarmAliasName", alarmAliasName);
            this.alarmAliasName = alarmAliasName;
            return this;
        }

        /**
         * AlarmItem.
         */
        public Builder alarmItem(String alarmItem) {
            this.putQueryParameter("AlarmItem", alarmItem);
            this.alarmItem = alarmItem;
            return this;
        }

        /**
         * AlertWay.
         */
        public Builder alertWay(java.util.Map < String, ? > alertWay) {
            this.putQueryParameter("AlertWay", alertWay);
            this.alertWay = alertWay;
            return this;
        }

        /**
         * ContactGroupIds.
         */
        public Builder contactGroupIds(java.util.Map < String, ? > contactGroupIds) {
            this.putQueryParameter("ContactGroupIds", contactGroupIds);
            this.contactGroupIds = contactGroupIds;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NValue.
         */
        public Builder NValue(Integer NValue) {
            this.putQueryParameter("NValue", NValue);
            this.NValue = NValue;
            return this;
        }

        /**
         * Operator.
         */
        public Builder operator(String operator) {
            this.putQueryParameter("Operator", operator);
            this.operator = operator;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(Float value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public CreateAlarmRuleRequest build() {
            return new CreateAlarmRuleRequest(this);
        } 

    } 

}
