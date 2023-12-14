// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWhiteRuleListRequest} extends {@link RequestModel}
 *
 * <p>UpdateWhiteRuleListRequest</p>
 */
public class UpdateWhiteRuleListRequest extends Request {
    @Body
    @NameInMap("Expression")
    @Validation(required = true)
    private String expression;

    @Body
    @NameInMap("IncidentUuid")
    private String incidentUuid;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("WhiteRuleId")
    @Validation(required = true)
    private Long whiteRuleId;

    private UpdateWhiteRuleListRequest(Builder builder) {
        super(builder);
        this.expression = builder.expression;
        this.incidentUuid = builder.incidentUuid;
        this.regionId = builder.regionId;
        this.whiteRuleId = builder.whiteRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWhiteRuleListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expression
     */
    public String getExpression() {
        return this.expression;
    }

    /**
     * @return incidentUuid
     */
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return whiteRuleId
     */
    public Long getWhiteRuleId() {
        return this.whiteRuleId;
    }

    public static final class Builder extends Request.Builder<UpdateWhiteRuleListRequest, Builder> {
        private String expression; 
        private String incidentUuid; 
        private String regionId; 
        private Long whiteRuleId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWhiteRuleListRequest request) {
            super(request);
            this.expression = request.expression;
            this.incidentUuid = request.incidentUuid;
            this.regionId = request.regionId;
            this.whiteRuleId = request.whiteRuleId;
        } 

        /**
         * The alert whitelist rule. The value is a JSON object.
         */
        public Builder expression(String expression) {
            this.putBodyParameter("Expression", expression);
            this.expression = expression;
            return this;
        }

        /**
         * The UUID of the event.
         */
        public Builder incidentUuid(String incidentUuid) {
            this.putBodyParameter("IncidentUuid", incidentUuid);
            this.incidentUuid = incidentUuid;
            return this;
        }

        /**
         * The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:
         * <p>
         * 
         * *   cn-hangzhou: Your assets reside in regions in China.
         * *   ap-southeast-1: Your assets reside in regions outside China.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The unique ID of the whitelist rule.
         */
        public Builder whiteRuleId(Long whiteRuleId) {
            this.putBodyParameter("WhiteRuleId", whiteRuleId);
            this.whiteRuleId = whiteRuleId;
            return this;
        }

        @Override
        public UpdateWhiteRuleListRequest build() {
            return new UpdateWhiteRuleListRequest(this);
        } 

    } 

}
