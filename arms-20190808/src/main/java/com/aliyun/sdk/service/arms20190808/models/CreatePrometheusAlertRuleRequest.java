// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePrometheusAlertRuleRequest} extends {@link RequestModel}
 *
 * <p>CreatePrometheusAlertRuleRequest</p>
 */
public class CreatePrometheusAlertRuleRequest extends Request {
    @Query
    @NameInMap("AlertName")
    @Validation(required = true)
    private String alertName;

    @Query
    @NameInMap("Annotations")
    private String annotations;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("DispatchRuleId")
    private Long dispatchRuleId;

    @Query
    @NameInMap("Duration")
    @Validation(required = true)
    private String duration;

    @Query
    @NameInMap("Expression")
    @Validation(required = true)
    private String expression;

    @Query
    @NameInMap("Labels")
    private String labels;

    @Query
    @NameInMap("Message")
    @Validation(required = true)
    private String message;

    @Query
    @NameInMap("NotifyType")
    private String notifyType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Type")
    private String type;

    private CreatePrometheusAlertRuleRequest(Builder builder) {
        super(builder);
        this.alertName = builder.alertName;
        this.annotations = builder.annotations;
        this.clusterId = builder.clusterId;
        this.dispatchRuleId = builder.dispatchRuleId;
        this.duration = builder.duration;
        this.expression = builder.expression;
        this.labels = builder.labels;
        this.message = builder.message;
        this.notifyType = builder.notifyType;
        this.regionId = builder.regionId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePrometheusAlertRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertName
     */
    public String getAlertName() {
        return this.alertName;
    }

    /**
     * @return annotations
     */
    public String getAnnotations() {
        return this.annotations;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return dispatchRuleId
     */
    public Long getDispatchRuleId() {
        return this.dispatchRuleId;
    }

    /**
     * @return duration
     */
    public String getDuration() {
        return this.duration;
    }

    /**
     * @return expression
     */
    public String getExpression() {
        return this.expression;
    }

    /**
     * @return labels
     */
    public String getLabels() {
        return this.labels;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return notifyType
     */
    public String getNotifyType() {
        return this.notifyType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreatePrometheusAlertRuleRequest, Builder> {
        private String alertName; 
        private String annotations; 
        private String clusterId; 
        private Long dispatchRuleId; 
        private String duration; 
        private String expression; 
        private String labels; 
        private String message; 
        private String notifyType; 
        private String regionId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreatePrometheusAlertRuleRequest response) {
            super(response);
            this.alertName = response.alertName;
            this.annotations = response.annotations;
            this.clusterId = response.clusterId;
            this.dispatchRuleId = response.dispatchRuleId;
            this.duration = response.duration;
            this.expression = response.expression;
            this.labels = response.labels;
            this.message = response.message;
            this.notifyType = response.notifyType;
            this.regionId = response.regionId;
            this.type = response.type;
        } 

        /**
         * AlertName.
         */
        public Builder alertName(String alertName) {
            this.putQueryParameter("AlertName", alertName);
            this.alertName = alertName;
            return this;
        }

        /**
         * Annotations.
         */
        public Builder annotations(String annotations) {
            this.putQueryParameter("Annotations", annotations);
            this.annotations = annotations;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * DispatchRuleId.
         */
        public Builder dispatchRuleId(Long dispatchRuleId) {
            this.putQueryParameter("DispatchRuleId", dispatchRuleId);
            this.dispatchRuleId = dispatchRuleId;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(String duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * Expression.
         */
        public Builder expression(String expression) {
            this.putQueryParameter("Expression", expression);
            this.expression = expression;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(String labels) {
            this.putQueryParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.putQueryParameter("Message", message);
            this.message = message;
            return this;
        }

        /**
         * NotifyType.
         */
        public Builder notifyType(String notifyType) {
            this.putQueryParameter("NotifyType", notifyType);
            this.notifyType = notifyType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreatePrometheusAlertRuleRequest build() {
            return new CreatePrometheusAlertRuleRequest(this);
        } 

    } 

}
