// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
         * The ID of the cluster.
         * <p>
         * 
         * >  You can call the [DescribeDBClusters](~~129857~~) operation to query the cluster IDs of all AnalyticDB for MySQL Data Warehouse Edition clusters within a specific region.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The language of file titles and error messages. Valid values:
         * <p>
         * 
         * *   **zh**: simplified Chinese
         * *   **en**: English
         * *   **ja**: Japanese
         * *   **zh-tw**: traditional Chinese
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The ID of the query.
         * <p>
         * 
         * >  You can call the [DescribeDiagnosisRecords](~~308207~~) operation to query the SQL summary information of a specified AnalyticDB for MySQL cluster, including the query ID.
         */
        public Builder processId(String processId) {
            this.putQueryParameter("ProcessId", processId);
            this.processId = processId;
            return this;
        }

        /**
         * The IP address and port number of the AnalyticDB for MySQL frontend node on which the SQL statement is executed.
         * <p>
         * 
         * >  You can call the [DescribeDiagnosisRecords](~~308207~~) operation to query the SQL summary information of a specified AnalyticDB for MySQL cluster, including the IP address and port number of the frontend node.
         */
        public Builder processRcHost(String processRcHost) {
            this.putQueryParameter("ProcessRcHost", processRcHost);
            this.processRcHost = processRcHost;
            return this;
        }

        /**
         * The execution start time of the SQL statement. Specify the time in the UNIX timestamp format. Unit: milliseconds.
         * <p>
         * 
         * >  You can call the [DescribeDiagnosisRecords](~~308207~~) operation to query the SQL summary information of a specified AnalyticDB for MySQL cluster, including the execution start time of the SQL statement.
         */
        public Builder processStartTime(Long processStartTime) {
            this.putQueryParameter("ProcessStartTime", processStartTime);
            this.processStartTime = processStartTime;
            return this;
        }

        /**
         * The state of the SQL statement. Valid values:
         * <p>
         * 
         * *   **running**
         * 
         * *   **finished**
         * 
         * *   **failed**
         * 
         * > You can call the [DescribeDiagnosisRecords](~~308207~~) operation to query the SQL summary information of a specified AnalyticDB for MySQL cluster, including the state of the SQL statement.
         */
        public Builder processState(String processState) {
            this.putQueryParameter("ProcessState", processState);
            this.processState = processState;
            return this;
        }

        /**
         * The region ID of the cluster.
         * <p>
         * 
         * >  You can call the [DescribeRegions](~~143074~~) operation to query the most recent region list.
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
