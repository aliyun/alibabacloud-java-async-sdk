// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link IncidentPlanCorporationStruct} extends {@link TeaModel}
 *
 * <p>IncidentPlanCorporationStruct</p>
 */
public class IncidentPlanCorporationStruct extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("channel")
    private String channel;

    @com.aliyun.core.annotation.NameInMap("robotId")
    private String robotId;

    private IncidentPlanCorporationStruct(Builder builder) {
        this.channel = builder.channel;
        this.robotId = builder.robotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IncidentPlanCorporationStruct create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return robotId
     */
    public String getRobotId() {
        return this.robotId;
    }

    public static final class Builder {
        private String channel; 
        private String robotId; 

        private Builder() {
        } 

        private Builder(IncidentPlanCorporationStruct model) {
            this.channel = model.channel;
            this.robotId = model.robotId;
        } 

        /**
         * channel.
         */
        public Builder channel(String channel) {
            this.channel = channel;
            return this;
        }

        /**
         * robotId.
         */
        public Builder robotId(String robotId) {
            this.robotId = robotId;
            return this;
        }

        public IncidentPlanCorporationStruct build() {
            return new IncidentPlanCorporationStruct(this);
        } 

    } 

}
