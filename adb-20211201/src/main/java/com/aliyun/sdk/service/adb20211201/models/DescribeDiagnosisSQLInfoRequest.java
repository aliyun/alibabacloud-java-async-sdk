// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeDiagnosisSQLInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeDiagnosisSQLInfoRequest</p>
 */
public class DescribeDiagnosisSQLInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessId")
    private String processId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessRcHost")
    private String processRcHost;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessStartTime")
    private Long processStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessState")
    private String processState;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters within a region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp1r053byu48p</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The language of file titles and error messages. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: simplified Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * <li><strong>ja</strong>: Japanese.</li>
         * <li><strong>zh-tw</strong>: traditional Chinese.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The query ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/308207.html">DescribeDiagnosisRecords</a> operation to query the diagnostic information about SQL statements for an AnalyticDB for MySQL cluster, including the query ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2021070216432217201616806503453</p>
         */
        public Builder processId(String processId) {
            this.putQueryParameter("ProcessId", processId);
            this.processId = processId;
            return this;
        }

        /**
         * <p>The IP address and port number of the AnalyticDB for MySQL frontend node on which the SQL statement is executed.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/308207.html">DescribeDiagnosisRecords</a> operation to query the diagnostic information about SQL statements for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster, including the IP address and port number of the frontend node.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>192.45.<em><strong>.</strong></em>:3145</p>
         */
        public Builder processRcHost(String processRcHost) {
            this.putQueryParameter("ProcessRcHost", processRcHost);
            this.processRcHost = processRcHost;
            return this;
        }

        /**
         * <p>The execution start time of the SQL statement. Set the time to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/308207.html">DescribeDiagnosisRecords</a> operation to query the diagnostic information about SQL statements for an AnalyticDB for MySQL cluster, including the execution start time of the SQL statement.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1625215402000</p>
         */
        public Builder processStartTime(Long processStartTime) {
            this.putQueryParameter("ProcessStartTime", processStartTime);
            this.processStartTime = processStartTime;
            return this;
        }

        /**
         * <p>The status of the SQL statement. Valid values:</p>
         * <ul>
         * <li><strong>running</strong></li>
         * <li><strong>finished</strong></li>
         * <li><strong>failed</strong></li>
         * </ul>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/308207.html">DescribeDiagnosisRecords</a> operation to query the diagnostic information about SQL statements for an AnalyticDB for MySQL cluster, including the status of the SQL statement.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        public Builder processState(String processState) {
            this.putQueryParameter("ProcessState", processState);
            this.processState = processState;
            return this;
        }

        /**
         * <p>The region ID of the cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
