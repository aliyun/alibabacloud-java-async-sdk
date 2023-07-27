// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiagnosisSQLInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeDiagnosisSQLInfoRequest</p>
 */
public class DescribeDiagnosisSQLInfoRequest extends Request {
    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("Lang")
    @Validation(required = true)
    private String lang;

    @Query
    @NameInMap("ProcessId")
    @Validation(required = true)
    private String processId;

    @Query
    @NameInMap("ProcessRcHost")
    private String processRcHost;

    @Query
    @NameInMap("ProcessStartTime")
    private Long processStartTime;

    @Query
    @NameInMap("ProcessState")
    private String processState;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DescribeDiagnosisSQLInfoRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.lang = builder.lang;
        this.processId = builder.processId;
        this.processRcHost = builder.processRcHost;
        this.processStartTime = builder.processStartTime;
        this.processState = builder.processState;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnosisSQLInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return processId
     */
    public String getProcessId() {
        return this.processId;
    }

    /**
     * @return processRcHost
     */
    public String getProcessRcHost() {
        return this.processRcHost;
    }

    /**
     * @return processStartTime
     */
    public Long getProcessStartTime() {
        return this.processStartTime;
    }

    /**
     * @return processState
     */
    public String getProcessState() {
        return this.processState;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeDiagnosisSQLInfoRequest, Builder> {
        private String DBClusterId; 
        private String lang; 
        private String processId; 
        private String processRcHost; 
        private Long processStartTime; 
        private String processState; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDiagnosisSQLInfoRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.lang = request.lang;
            this.processId = request.processId;
            this.processRcHost = request.processRcHost;
            this.processStartTime = request.processStartTime;
            this.processState = request.processState;
            this.regionId = request.regionId;
        } 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * ProcessId.
         */
        public Builder processId(String processId) {
            this.putQueryParameter("ProcessId", processId);
            this.processId = processId;
            return this;
        }

        /**
         * ProcessRcHost.
         */
        public Builder processRcHost(String processRcHost) {
            this.putQueryParameter("ProcessRcHost", processRcHost);
            this.processRcHost = processRcHost;
            return this;
        }

        /**
         * ProcessStartTime.
         */
        public Builder processStartTime(Long processStartTime) {
            this.putQueryParameter("ProcessStartTime", processStartTime);
            this.processStartTime = processStartTime;
            return this;
        }

        /**
         * ProcessState.
         */
        public Builder processState(String processState) {
            this.putQueryParameter("ProcessState", processState);
            this.processState = processState;
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

        @Override
        public DescribeDiagnosisSQLInfoRequest build() {
            return new DescribeDiagnosisSQLInfoRequest(this);
        } 

    } 

}
