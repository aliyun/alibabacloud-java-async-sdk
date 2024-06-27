// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRecommendTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateRecommendTaskRequest</p>
 */
public class CreateRecommendTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sampleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sampleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("variablesStr")
    @com.aliyun.core.annotation.Validation(required = true)
    private String variablesStr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("velocitiesStr")
    @com.aliyun.core.annotation.Validation(required = true)
    private String velocitiesStr;

    private CreateRecommendTaskRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.name = builder.name;
        this.regId = builder.regId;
        this.sampleId = builder.sampleId;
        this.variablesStr = builder.variablesStr;
        this.velocitiesStr = builder.velocitiesStr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRecommendTaskRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return sampleId
     */
    public Long getSampleId() {
        return this.sampleId;
    }

    /**
     * @return variablesStr
     */
    public String getVariablesStr() {
        return this.variablesStr;
    }

    /**
     * @return velocitiesStr
     */
    public String getVelocitiesStr() {
        return this.velocitiesStr;
    }

    public static final class Builder extends Request.Builder<CreateRecommendTaskRequest, Builder> {
        private String lang; 
        private String name; 
        private String regId; 
        private Long sampleId; 
        private String variablesStr; 
        private String velocitiesStr; 

        private Builder() {
            super();
        } 

        private Builder(CreateRecommendTaskRequest request) {
            super(request);
            this.lang = request.lang;
            this.name = request.name;
            this.regId = request.regId;
            this.sampleId = request.sampleId;
            this.variablesStr = request.variablesStr;
            this.velocitiesStr = request.velocitiesStr;
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
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * sampleId.
         */
        public Builder sampleId(Long sampleId) {
            this.putQueryParameter("sampleId", sampleId);
            this.sampleId = sampleId;
            return this;
        }

        /**
         * variablesStr.
         */
        public Builder variablesStr(String variablesStr) {
            this.putQueryParameter("variablesStr", variablesStr);
            this.variablesStr = variablesStr;
            return this;
        }

        /**
         * velocitiesStr.
         */
        public Builder velocitiesStr(String velocitiesStr) {
            this.putQueryParameter("velocitiesStr", velocitiesStr);
            this.velocitiesStr = velocitiesStr;
            return this;
        }

        @Override
        public CreateRecommendTaskRequest build() {
            return new CreateRecommendTaskRequest(this);
        } 

    } 

}
