// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyProcessWhiteListRequest} extends {@link RequestModel}
 *
 * <p>ModifyProcessWhiteListRequest</p>
 */
public class ModifyProcessWhiteListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Md5s")
    @com.aliyun.core.annotation.Validation(required = true)
    private String md5s;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long strategyId;

    private ModifyProcessWhiteListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.md5s = builder.md5s;
        this.sourceIp = builder.sourceIp;
        this.status = builder.status;
        this.strategyId = builder.strategyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyProcessWhiteListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return md5s
     */
    public String getMd5s() {
        return this.md5s;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return strategyId
     */
    public Long getStrategyId() {
        return this.strategyId;
    }

    public static final class Builder extends Request.Builder<ModifyProcessWhiteListRequest, Builder> {
        private String lang; 
        private String md5s; 
        private String sourceIp; 
        private Integer status; 
        private Long strategyId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyProcessWhiteListRequest request) {
            super(request);
            this.lang = request.lang;
            this.md5s = request.md5s;
            this.sourceIp = request.sourceIp;
            this.status = request.status;
            this.strategyId = request.strategyId;
        } 

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The MD5 hash value of the process startup file.
         * <p>
         * 
         * >  You can call the [DescribeWhiteListProcess](~~DescribeWhiteListProcess~~) operation to obtain the MD5 hash value.
         */
        public Builder md5s(String md5s) {
            this.putQueryParameter("Md5s", md5s);
            this.md5s = md5s;
            return this;
        }

        /**
         * The source IP address of the request. You do not need to specify this parameter. It is automatically obtained by the system.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The whitelist status of the process. Valid values:
         * <p>
         * 
         * *   **1**: removes a process from the whitelist.
         * *   **2**: adds a process to the whitelist.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The ID of the policy.
         * <p>
         * 
         * >  You can call the [DescribeWhiteListStrategyList](~~DescribeWhiteListStrategyList~~) operation to obtain the ID.
         */
        public Builder strategyId(Long strategyId) {
            this.putQueryParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        @Override
        public ModifyProcessWhiteListRequest build() {
            return new ModifyProcessWhiteListRequest(this);
        } 

    } 

}
