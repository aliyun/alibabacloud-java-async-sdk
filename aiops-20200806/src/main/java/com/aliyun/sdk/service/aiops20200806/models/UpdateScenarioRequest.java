// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateScenarioRequest} extends {@link RequestModel}
 *
 * <p>UpdateScenarioRequest</p>
 */
public class UpdateScenarioRequest extends Request {
    @Query
    @NameInMap("AlertSettingId")
    private Long alertSettingId;

    @Query
    @NameInMap("Id")
    private String id;

    @Query
    @NameInMap("Level")
    private Long level;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private UpdateScenarioRequest(Builder builder) {
        super(builder);
        this.alertSettingId = builder.alertSettingId;
        this.id = builder.id;
        this.level = builder.level;
        this.name = builder.name;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateScenarioRequest create() {
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
     * @return id
     */
    public String getId() {
        return this.id;
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

    public static final class Builder extends Request.Builder<UpdateScenarioRequest, Builder> {
        private Long alertSettingId; 
        private String id; 
        private Long level; 
        private String name; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(UpdateScenarioRequest request) {
            super(request);
            this.alertSettingId = request.alertSettingId;
            this.id = request.id;
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
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
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
        public UpdateScenarioRequest build() {
            return new UpdateScenarioRequest(this);
        } 

    } 

}
