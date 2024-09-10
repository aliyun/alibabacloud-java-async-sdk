// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveWhiteListStrategyRequest} extends {@link RequestModel}
 *
 * <p>SaveWhiteListStrategyRequest</p>
 */
public class SaveWhiteListStrategyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyId")
    private Long strategyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String strategyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StudyTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer studyTime;

    private SaveWhiteListStrategyRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
        this.strategyId = builder.strategyId;
        this.strategyName = builder.strategyName;
        this.studyTime = builder.studyTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveWhiteListStrategyRequest create() {
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
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return strategyId
     */
    public Long getStrategyId() {
        return this.strategyId;
    }

    /**
     * @return strategyName
     */
    public String getStrategyName() {
        return this.strategyName;
    }

    /**
     * @return studyTime
     */
    public Integer getStudyTime() {
        return this.studyTime;
    }

    public static final class Builder extends Request.Builder<SaveWhiteListStrategyRequest, Builder> {
        private String lang; 
        private String sourceIp; 
        private Long strategyId; 
        private String strategyName; 
        private Integer studyTime; 

        private Builder() {
            super();
        } 

        private Builder(SaveWhiteListStrategyRequest request) {
            super(request);
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
            this.strategyId = request.strategyId;
            this.strategyName = request.strategyName;
            this.studyTime = request.studyTime;
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
         * The source IP address of the request. You do not need to specify this parameter. It is automatically obtained by the system.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The ID of the application whitelist policy.
         * <p>
         * 
         * >  You can call the [DescribeWhiteListStrategyList](~~DescribeWhiteListStrategyList~~) operation to query the ID.
         */
        public Builder strategyId(Long strategyId) {
            this.putQueryParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        /**
         * The name of the application whitelist policy.
         */
        public Builder strategyName(String strategyName) {
            this.putQueryParameter("StrategyName", strategyName);
            this.strategyName = strategyName;
            return this;
        }

        /**
         * The duration of intelligent learning. Unit: hours.
         */
        public Builder studyTime(Integer studyTime) {
            this.putQueryParameter("StudyTime", studyTime);
            this.studyTime = studyTime;
            return this;
        }

        @Override
        public SaveWhiteListStrategyRequest build() {
            return new SaveWhiteListStrategyRequest(this);
        } 

    } 

}
