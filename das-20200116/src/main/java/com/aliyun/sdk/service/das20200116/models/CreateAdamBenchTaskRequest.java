// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAdamBenchTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateAdamBenchTaskRequest</p>
 */
public class CreateAdamBenchTaskRequest extends Request {
    @Query
    @NameInMap("Description")
    @Validation(required = true)
    private String description;

    @Query
    @NameInMap("DstInstanceId")
    @Validation(required = true)
    private String dstInstanceId;

    @Query
    @NameInMap("DstSuperAccount")
    @Validation(required = true)
    private String dstSuperAccount;

    @Query
    @NameInMap("DstSuperPassword")
    @Validation(required = true)
    private String dstSuperPassword;

    @Query
    @NameInMap("Rate")
    private Integer rate;

    @Query
    @NameInMap("RequestDuration")
    @Validation(required = true)
    private Long requestDuration;

    @Query
    @NameInMap("RequestStartTime")
    @Validation(required = true)
    private Long requestStartTime;

    @Query
    @NameInMap("SrcEngine")
    private String srcEngine;

    @Query
    @NameInMap("SrcEngineVersion")
    private String srcEngineVersion;

    @Query
    @NameInMap("SrcMaxQps")
    @Validation(required = true)
    private Double srcMaxQps;

    @Query
    @NameInMap("SrcMeanQps")
    @Validation(required = true)
    private Double srcMeanQps;

    @Query
    @NameInMap("SrcSqlOssAddr")
    @Validation(required = true)
    private String srcSqlOssAddr;

    private CreateAdamBenchTaskRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.dstInstanceId = builder.dstInstanceId;
        this.dstSuperAccount = builder.dstSuperAccount;
        this.dstSuperPassword = builder.dstSuperPassword;
        this.rate = builder.rate;
        this.requestDuration = builder.requestDuration;
        this.requestStartTime = builder.requestStartTime;
        this.srcEngine = builder.srcEngine;
        this.srcEngineVersion = builder.srcEngineVersion;
        this.srcMaxQps = builder.srcMaxQps;
        this.srcMeanQps = builder.srcMeanQps;
        this.srcSqlOssAddr = builder.srcSqlOssAddr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAdamBenchTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dstInstanceId
     */
    public String getDstInstanceId() {
        return this.dstInstanceId;
    }

    /**
     * @return dstSuperAccount
     */
    public String getDstSuperAccount() {
        return this.dstSuperAccount;
    }

    /**
     * @return dstSuperPassword
     */
    public String getDstSuperPassword() {
        return this.dstSuperPassword;
    }

    /**
     * @return rate
     */
    public Integer getRate() {
        return this.rate;
    }

    /**
     * @return requestDuration
     */
    public Long getRequestDuration() {
        return this.requestDuration;
    }

    /**
     * @return requestStartTime
     */
    public Long getRequestStartTime() {
        return this.requestStartTime;
    }

    /**
     * @return srcEngine
     */
    public String getSrcEngine() {
        return this.srcEngine;
    }

    /**
     * @return srcEngineVersion
     */
    public String getSrcEngineVersion() {
        return this.srcEngineVersion;
    }

    /**
     * @return srcMaxQps
     */
    public Double getSrcMaxQps() {
        return this.srcMaxQps;
    }

    /**
     * @return srcMeanQps
     */
    public Double getSrcMeanQps() {
        return this.srcMeanQps;
    }

    /**
     * @return srcSqlOssAddr
     */
    public String getSrcSqlOssAddr() {
        return this.srcSqlOssAddr;
    }

    public static final class Builder extends Request.Builder<CreateAdamBenchTaskRequest, Builder> {
        private String description; 
        private String dstInstanceId; 
        private String dstSuperAccount; 
        private String dstSuperPassword; 
        private Integer rate; 
        private Long requestDuration; 
        private Long requestStartTime; 
        private String srcEngine; 
        private String srcEngineVersion; 
        private Double srcMaxQps; 
        private Double srcMeanQps; 
        private String srcSqlOssAddr; 

        private Builder() {
            super();
        } 

        private Builder(CreateAdamBenchTaskRequest request) {
            super(request);
            this.description = request.description;
            this.dstInstanceId = request.dstInstanceId;
            this.dstSuperAccount = request.dstSuperAccount;
            this.dstSuperPassword = request.dstSuperPassword;
            this.rate = request.rate;
            this.requestDuration = request.requestDuration;
            this.requestStartTime = request.requestStartTime;
            this.srcEngine = request.srcEngine;
            this.srcEngineVersion = request.srcEngineVersion;
            this.srcMaxQps = request.srcMaxQps;
            this.srcMeanQps = request.srcMeanQps;
            this.srcSqlOssAddr = request.srcSqlOssAddr;
        } 

        /**
         * The description of the stress testing task.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the destination instance. The instance must be an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL instance. You can call the [GetInstanceInspections](~~202857~~) operation to query the ID.
         */
        public Builder dstInstanceId(String dstInstanceId) {
            this.putQueryParameter("DstInstanceId", dstInstanceId);
            this.dstInstanceId = dstInstanceId;
            return this;
        }

        /**
         * The name of the privileged account for the destination instance.
         */
        public Builder dstSuperAccount(String dstSuperAccount) {
            this.putQueryParameter("DstSuperAccount", dstSuperAccount);
            this.dstSuperAccount = dstSuperAccount;
            return this;
        }

        /**
         * The password of the privileged account for the destination instance.
         */
        public Builder dstSuperPassword(String dstSuperPassword) {
            this.putQueryParameter("DstSuperPassword", dstSuperPassword);
            this.dstSuperPassword = dstSuperPassword;
            return this;
        }

        /**
         * The rate at which the traffic captured from the source database instance is replayed on the destination database instance. Valid values: 1 to 30. Default value: 1.
         */
        public Builder rate(Integer rate) {
            this.putQueryParameter("Rate", rate);
            this.rate = rate;
            return this;
        }

        /**
         * The duration of the stress testing task for which the traffic is captured from the source instance. Unit: milliseconds.
         */
        public Builder requestDuration(Long requestDuration) {
            this.putQueryParameter("RequestDuration", requestDuration);
            this.requestDuration = requestDuration;
            return this;
        }

        /**
         * The start time of the stress testing task. Specify the time in the UNIX timestamp format. Unit: milliseconds.
         */
        public Builder requestStartTime(Long requestStartTime) {
            this.putQueryParameter("RequestStartTime", requestStartTime);
            this.requestStartTime = requestStartTime;
            return this;
        }

        /**
         * The database engine that the source database instance runs.
         */
        public Builder srcEngine(String srcEngine) {
            this.putQueryParameter("SrcEngine", srcEngine);
            this.srcEngine = srcEngine;
            return this;
        }

        /**
         * The version of the database engine that the source database instance runs.
         */
        public Builder srcEngineVersion(String srcEngineVersion) {
            this.putQueryParameter("SrcEngineVersion", srcEngineVersion);
            this.srcEngineVersion = srcEngineVersion;
            return this;
        }

        /**
         * The maximum number of queries per second (QPS) within the time period during which traffic on the source database instance is captured. The value must be accurate to two decimal places.
         */
        public Builder srcMaxQps(Double srcMaxQps) {
            this.putQueryParameter("SrcMaxQps", srcMaxQps);
            this.srcMaxQps = srcMaxQps;
            return this;
        }

        /**
         * The average QPS within the time period in which traffic on the source database instance is captured. The value must be accurate to two decimal places.
         */
        public Builder srcMeanQps(Double srcMeanQps) {
            this.putQueryParameter("SrcMeanQps", srcMeanQps);
            this.srcMeanQps = srcMeanQps;
            return this;
        }

        /**
         * The URL of the Object Storage Service (OSS) folder in which the archived objects for SQL statements that run on the source database instance are stored. You can obtain the URL after you upload the archived files to OSS.
         */
        public Builder srcSqlOssAddr(String srcSqlOssAddr) {
            this.putQueryParameter("SrcSqlOssAddr", srcSqlOssAddr);
            this.srcSqlOssAddr = srcSqlOssAddr;
            return this;
        }

        @Override
        public CreateAdamBenchTaskRequest build() {
            return new CreateAdamBenchTaskRequest(this);
        } 

    } 

}
