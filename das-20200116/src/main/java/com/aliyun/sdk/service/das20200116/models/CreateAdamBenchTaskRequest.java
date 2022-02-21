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

        private Builder(CreateAdamBenchTaskRequest response) {
            super(response);
            this.description = response.description;
            this.dstInstanceId = response.dstInstanceId;
            this.dstSuperAccount = response.dstSuperAccount;
            this.dstSuperPassword = response.dstSuperPassword;
            this.rate = response.rate;
            this.requestDuration = response.requestDuration;
            this.requestStartTime = response.requestStartTime;
            this.srcEngine = response.srcEngine;
            this.srcEngineVersion = response.srcEngineVersion;
            this.srcMaxQps = response.srcMaxQps;
            this.srcMeanQps = response.srcMeanQps;
            this.srcSqlOssAddr = response.srcSqlOssAddr;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DstInstanceId.
         */
        public Builder dstInstanceId(String dstInstanceId) {
            this.putQueryParameter("DstInstanceId", dstInstanceId);
            this.dstInstanceId = dstInstanceId;
            return this;
        }

        /**
         * DstSuperAccount.
         */
        public Builder dstSuperAccount(String dstSuperAccount) {
            this.putQueryParameter("DstSuperAccount", dstSuperAccount);
            this.dstSuperAccount = dstSuperAccount;
            return this;
        }

        /**
         * DstSuperPassword.
         */
        public Builder dstSuperPassword(String dstSuperPassword) {
            this.putQueryParameter("DstSuperPassword", dstSuperPassword);
            this.dstSuperPassword = dstSuperPassword;
            return this;
        }

        /**
         * Rate.
         */
        public Builder rate(Integer rate) {
            this.putQueryParameter("Rate", rate);
            this.rate = rate;
            return this;
        }

        /**
         * RequestDuration.
         */
        public Builder requestDuration(Long requestDuration) {
            this.putQueryParameter("RequestDuration", requestDuration);
            this.requestDuration = requestDuration;
            return this;
        }

        /**
         * RequestStartTime.
         */
        public Builder requestStartTime(Long requestStartTime) {
            this.putQueryParameter("RequestStartTime", requestStartTime);
            this.requestStartTime = requestStartTime;
            return this;
        }

        /**
         * SrcEngine.
         */
        public Builder srcEngine(String srcEngine) {
            this.putQueryParameter("SrcEngine", srcEngine);
            this.srcEngine = srcEngine;
            return this;
        }

        /**
         * SrcEngineVersion.
         */
        public Builder srcEngineVersion(String srcEngineVersion) {
            this.putQueryParameter("SrcEngineVersion", srcEngineVersion);
            this.srcEngineVersion = srcEngineVersion;
            return this;
        }

        /**
         * SrcMaxQps.
         */
        public Builder srcMaxQps(Double srcMaxQps) {
            this.putQueryParameter("SrcMaxQps", srcMaxQps);
            this.srcMaxQps = srcMaxQps;
            return this;
        }

        /**
         * SrcMeanQps.
         */
        public Builder srcMeanQps(Double srcMeanQps) {
            this.putQueryParameter("SrcMeanQps", srcMeanQps);
            this.srcMeanQps = srcMeanQps;
            return this;
        }

        /**
         * SrcSqlOssAddr.
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
