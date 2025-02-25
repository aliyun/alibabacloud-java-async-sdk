// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddScenarioRequest} extends {@link RequestModel}
 *
 * <p>AddScenarioRequest</p>
 */
public class AddScenarioRequest extends Request {
    @Query
    @NameInMap("AlertSettingId")
    private Long alertSettingId;

    @Query
    @NameInMap("Level")
    private Long level;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private AddScenarioRequest(Builder builder) {
        super(builder);
        this.alertSettingId = builder.alertSettingId;
        this.level = builder.level;
        this.name = builder.name;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddScenarioRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertSettingId
     */
    public Long getAlertSettingId() {
        return this.alertSettingId;
    }

    /**
     * @return level
     */
    public Long getLevel() {
        return this.level;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<AddScenarioRequest, Builder> {
        private Long alertSettingId; 
        private Long level; 
        private String name; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(AddScenarioRequest request) {
            super(request);
            this.alertSettingId = request.alertSettingId;
            this.level = request.level;
            this.name = request.name;
            this.operaUid = request.operaUid;
        } 

        /**
         * AlertSettingId.
         */
        public Builder alertSettingId(Long alertSettingId) {
            this.putQueryParameter("AlertSettingId", alertSettingId);
            this.alertSettingId = alertSettingId;
            return this;
        }

        /**
         * Level.
         */
        public Builder level(Long level) {
            this.putQueryParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        @Override
        public AddScenarioRequest build() {
            return new AddScenarioRequest(this);
        } 

    } 

}
