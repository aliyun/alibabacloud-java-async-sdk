// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20150801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReportVuserRequest} extends {@link RequestModel}
 *
 * <p>ReportVuserRequest</p>
 */
public class ReportVuserRequest extends Request {
    @Query
    @NameInMap("GmtCreated")
    @Validation(required = true)
    private Long gmtCreated;

    @Query
    @NameInMap("ScenarioId")
    @Validation(required = true)
    private Integer scenarioId;

    @Query
    @NameInMap("Vuser")
    @Validation(required = true)
    private Integer vuser;

    @Query
    @NameInMap("Wskey")
    @Validation(required = true)
    private String wskey;

    private ReportVuserRequest(Builder builder) {
        super(builder);
        this.gmtCreated = builder.gmtCreated;
        this.scenarioId = builder.scenarioId;
        this.vuser = builder.vuser;
        this.wskey = builder.wskey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportVuserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gmtCreated
     */
    public Long getGmtCreated() {
        return this.gmtCreated;
    }

    /**
     * @return scenarioId
     */
    public Integer getScenarioId() {
        return this.scenarioId;
    }

    /**
     * @return vuser
     */
    public Integer getVuser() {
        return this.vuser;
    }

    /**
     * @return wskey
     */
    public String getWskey() {
        return this.wskey;
    }

    public static final class Builder extends Request.Builder<ReportVuserRequest, Builder> {
        private Long gmtCreated; 
        private Integer scenarioId; 
        private Integer vuser; 
        private String wskey; 

        private Builder() {
            super();
        } 

        private Builder(ReportVuserRequest request) {
            super(request);
            this.gmtCreated = request.gmtCreated;
            this.scenarioId = request.scenarioId;
            this.vuser = request.vuser;
            this.wskey = request.wskey;
        } 

        /**
         * GmtCreated.
         */
        public Builder gmtCreated(Long gmtCreated) {
            this.putQueryParameter("GmtCreated", gmtCreated);
            this.gmtCreated = gmtCreated;
            return this;
        }

        /**
         * ScenarioId.
         */
        public Builder scenarioId(Integer scenarioId) {
            this.putQueryParameter("ScenarioId", scenarioId);
            this.scenarioId = scenarioId;
            return this;
        }

        /**
         * Vuser.
         */
        public Builder vuser(Integer vuser) {
            this.putQueryParameter("Vuser", vuser);
            this.vuser = vuser;
            return this;
        }

        /**
         * Wskey.
         */
        public Builder wskey(String wskey) {
            this.putQueryParameter("Wskey", wskey);
            this.wskey = wskey;
            return this;
        }

        @Override
        public ReportVuserRequest build() {
            return new ReportVuserRequest(this);
        } 

    } 

}
