// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
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
         * <p>The source IP address of the request. You do not need to specify this parameter. It is automatically obtained by the system.</p>
         * 
         * <strong>example:</strong>
         * <p>124.89.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The ID of the application whitelist policy.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeWhiteListStrategyList~~">DescribeWhiteListStrategyList</a> operation to query the ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8494</p>
         */
        public Builder strategyId(Long strategyId) {
            this.putQueryParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        /**
         * <p>The name of the application whitelist policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder strategyName(String strategyName) {
            this.putQueryParameter("StrategyName", strategyName);
            this.strategyName = strategyName;
            return this;
        }

        /**
         * <p>The duration of intelligent learning. Unit: hours.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
