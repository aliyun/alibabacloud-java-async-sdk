// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryFailingReasonListForQualificationRequest} extends {@link RequestModel}
 *
 * <p>QueryFailingReasonListForQualificationRequest</p>
 */
public class QueryFailingReasonListForQualificationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QualificationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String qualificationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private QueryFailingReasonListForQualificationRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.limit = builder.limit;
        this.qualificationType = builder.qualificationType;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFailingReasonListForQualificationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return qualificationType
     */
    public String getQualificationType() {
        return this.qualificationType;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<QueryFailingReasonListForQualificationRequest, Builder> {
        private String instanceId; 
        private String lang; 
        private Integer limit; 
        private String qualificationType; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(QueryFailingReasonListForQualificationRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.limit = request.limit;
            this.qualificationType = request.qualificationType;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * Limit.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * QualificationType.
         */
        public Builder qualificationType(String qualificationType) {
            this.putQueryParameter("QualificationType", qualificationType);
            this.qualificationType = qualificationType;
            return this;
        }

        /**
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public QueryFailingReasonListForQualificationRequest build() {
            return new QueryFailingReasonListForQualificationRequest(this);
        } 

    } 

}
