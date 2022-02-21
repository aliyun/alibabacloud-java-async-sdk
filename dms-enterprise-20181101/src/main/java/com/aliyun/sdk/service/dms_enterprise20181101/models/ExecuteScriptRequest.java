// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteScriptRequest} extends {@link RequestModel}
 *
 * <p>ExecuteScriptRequest</p>
 */
public class ExecuteScriptRequest extends Request {
    @Query
    @NameInMap("DbId")
    @Validation(required = true, minimum = 1)
    private Integer dbId;

    @Query
    @NameInMap("Logic")
    @Validation(required = true)
    private Boolean logic;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Script")
    @Validation(required = true)
    private String script;

    @Query
    @NameInMap("Tid")
    private Long tid;

    private ExecuteScriptRequest(Builder builder) {
        super(builder);
        this.dbId = builder.dbId;
        this.logic = builder.logic;
        this.regionId = builder.regionId;
        this.script = builder.script;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteScriptRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbId
     */
    public Integer getDbId() {
        return this.dbId;
    }

    /**
     * @return logic
     */
    public Boolean getLogic() {
        return this.logic;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return script
     */
    public String getScript() {
        return this.script;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<ExecuteScriptRequest, Builder> {
        private Integer dbId; 
        private Boolean logic; 
        private String regionId; 
        private String script; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteScriptRequest response) {
            super(response);
            this.dbId = response.dbId;
            this.logic = response.logic;
            this.regionId = response.regionId;
            this.script = response.script;
            this.tid = response.tid;
        } 

        /**
         * DbId.
         */
        public Builder dbId(Integer dbId) {
            this.putQueryParameter("DbId", dbId);
            this.dbId = dbId;
            return this;
        }

        /**
         * Logic.
         */
        public Builder logic(Boolean logic) {
            this.putQueryParameter("Logic", logic);
            this.logic = logic;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Script.
         */
        public Builder script(String script) {
            this.putQueryParameter("Script", script);
            this.script = script;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public ExecuteScriptRequest build() {
            return new ExecuteScriptRequest(this);
        } 

    } 

}
