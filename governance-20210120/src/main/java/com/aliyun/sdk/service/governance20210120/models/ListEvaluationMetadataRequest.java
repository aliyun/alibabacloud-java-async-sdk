// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

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
 * {@link ListEvaluationMetadataRequest} extends {@link RequestModel}
 *
 * <p>ListEvaluationMetadataRequest</p>
 */
public class ListEvaluationMetadataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EvaluationDomain")
    private String evaluationDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LensCode")
    private String lensCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopicCode")
    private String topicCode;

    private ListEvaluationMetadataRequest(Builder builder) {
        super(builder);
        this.evaluationDomain = builder.evaluationDomain;
        this.language = builder.language;
        this.lensCode = builder.lensCode;
        this.regionId = builder.regionId;
        this.topicCode = builder.topicCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEvaluationMetadataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return evaluationDomain
     */
    public String getEvaluationDomain() {
        return this.evaluationDomain;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return lensCode
     */
    public String getLensCode() {
        return this.lensCode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return topicCode
     */
    public String getTopicCode() {
        return this.topicCode;
    }

    public static final class Builder extends Request.Builder<ListEvaluationMetadataRequest, Builder> {
        private String evaluationDomain; 
        private String language; 
        private String lensCode; 
        private String regionId; 
        private String topicCode; 

        private Builder() {
            super();
        } 

        private Builder(ListEvaluationMetadataRequest request) {
            super(request);
            this.evaluationDomain = request.evaluationDomain;
            this.language = request.language;
            this.lensCode = request.lensCode;
            this.regionId = request.regionId;
            this.topicCode = request.topicCode;
        } 

        /**
         * EvaluationDomain.
         */
        public Builder evaluationDomain(String evaluationDomain) {
            this.putQueryParameter("EvaluationDomain", evaluationDomain);
            this.evaluationDomain = evaluationDomain;
            return this;
        }

        /**
         * <p>The language type. Governance evaluation definitions are returned in this language. Valid values:</p>
         * <ul>
         * <li>en: English.</li>
         * <li>zh: Chinese.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The specialized evaluation code. Valid values:</p>
         * <ul>
         * <li>basic (default): foundation model (governance maturity) evaluation.</li>
         * <li>ack: container building specialized evaluation.</li>
         * <li>ai: machine learning specialized evaluation.</li>
         * <li>nis: network service specialized evaluation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ack</p>
         */
        public Builder lensCode(String lensCode) {
            this.putQueryParameter("LensCode", lensCode);
            this.lensCode = lensCode;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The governance topic code.</p>
         * 
         * <strong>example:</strong>
         * <p>ResourceUtilization</p>
         */
        public Builder topicCode(String topicCode) {
            this.putQueryParameter("TopicCode", topicCode);
            this.topicCode = topicCode;
            return this;
        }

        @Override
        public ListEvaluationMetadataRequest build() {
            return new ListEvaluationMetadataRequest(this);
        } 

    } 

}
