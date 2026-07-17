// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

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
 * {@link CreateElasticPlanRequest} extends {@link RequestModel}
 *
 * <p>CreateElasticPlanRequest</p>
 */
public class CreateElasticPlanRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appGroupIdentity")
    private String appGroupIdentity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("customDates")
    private java.util.List<String> customDates;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("elasticLcu")
    private Integer elasticLcu;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("endHour")
    private Integer endHour;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scheduleType")
    private String scheduleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("startHour")
    private Integer startHour;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private Boolean dryRun;

    private CreateElasticPlanRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.customDates = builder.customDates;
        this.description = builder.description;
        this.elasticLcu = builder.elasticLcu;
        this.endHour = builder.endHour;
        this.name = builder.name;
        this.scheduleType = builder.scheduleType;
        this.startHour = builder.startHour;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateElasticPlanRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

    /**
     * @return customDates
     */
    public java.util.List<String> getCustomDates() {
        return this.customDates;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return elasticLcu
     */
    public Integer getElasticLcu() {
        return this.elasticLcu;
    }

    /**
     * @return endHour
     */
    public Integer getEndHour() {
        return this.endHour;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return scheduleType
     */
    public String getScheduleType() {
        return this.scheduleType;
    }

    /**
     * @return startHour
     */
    public Integer getStartHour() {
        return this.startHour;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static final class Builder extends Request.Builder<CreateElasticPlanRequest, Builder> {
        private String appGroupIdentity; 
        private java.util.List<String> customDates; 
        private String description; 
        private Integer elasticLcu; 
        private Integer endHour; 
        private String name; 
        private String scheduleType; 
        private Integer startHour; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(CreateElasticPlanRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.customDates = request.customDates;
            this.description = request.description;
            this.elasticLcu = request.elasticLcu;
            this.endHour = request.endHour;
            this.name = request.name;
            this.scheduleType = request.scheduleType;
            this.startHour = request.startHour;
            this.dryRun = request.dryRun;
        } 

        /**
         * appGroupIdentity.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * customDates.
         */
        public Builder customDates(java.util.List<String> customDates) {
            this.putBodyParameter("customDates", customDates);
            this.customDates = customDates;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * elasticLcu.
         */
        public Builder elasticLcu(Integer elasticLcu) {
            this.putBodyParameter("elasticLcu", elasticLcu);
            this.elasticLcu = elasticLcu;
            return this;
        }

        /**
         * endHour.
         */
        public Builder endHour(Integer endHour) {
            this.putBodyParameter("endHour", endHour);
            this.endHour = endHour;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * scheduleType.
         */
        public Builder scheduleType(String scheduleType) {
            this.putBodyParameter("scheduleType", scheduleType);
            this.scheduleType = scheduleType;
            return this;
        }

        /**
         * startHour.
         */
        public Builder startHour(Integer startHour) {
            this.putBodyParameter("startHour", startHour);
            this.startHour = startHour;
            return this;
        }

        /**
         * dryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        @Override
        public CreateElasticPlanRequest build() {
            return new CreateElasticPlanRequest(this);
        } 

    } 

}
