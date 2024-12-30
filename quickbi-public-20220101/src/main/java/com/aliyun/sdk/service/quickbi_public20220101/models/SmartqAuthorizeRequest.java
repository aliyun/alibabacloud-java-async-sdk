// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link SmartqAuthorizeRequest} extends {@link RequestModel}
 *
 * <p>SmartqAuthorizeRequest</p>
 */
public class SmartqAuthorizeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireDay")
    private String expireDay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LlmCubeThemes")
    private String llmCubeThemes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LlmCubes")
    private String llmCubes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer operationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userIds;

    private SmartqAuthorizeRequest(Builder builder) {
        super(builder);
        this.expireDay = builder.expireDay;
        this.llmCubeThemes = builder.llmCubeThemes;
        this.llmCubes = builder.llmCubes;
        this.operationType = builder.operationType;
        this.userIds = builder.userIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SmartqAuthorizeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expireDay
     */
    public String getExpireDay() {
        return this.expireDay;
    }

    /**
     * @return llmCubeThemes
     */
    public String getLlmCubeThemes() {
        return this.llmCubeThemes;
    }

    /**
     * @return llmCubes
     */
    public String getLlmCubes() {
        return this.llmCubes;
    }

    /**
     * @return operationType
     */
    public Integer getOperationType() {
        return this.operationType;
    }

    /**
     * @return userIds
     */
    public String getUserIds() {
        return this.userIds;
    }

    public static final class Builder extends Request.Builder<SmartqAuthorizeRequest, Builder> {
        private String expireDay; 
        private String llmCubeThemes; 
        private String llmCubes; 
        private Integer operationType; 
        private String userIds; 

        private Builder() {
            super();
        } 

        private Builder(SmartqAuthorizeRequest request) {
            super(request);
            this.expireDay = request.expireDay;
            this.llmCubeThemes = request.llmCubeThemes;
            this.llmCubes = request.llmCubes;
            this.operationType = request.operationType;
            this.userIds = request.userIds;
        } 

        /**
         * ExpireDay.
         */
        public Builder expireDay(String expireDay) {
            this.putQueryParameter("ExpireDay", expireDay);
            this.expireDay = expireDay;
            return this;
        }

        /**
         * LlmCubeThemes.
         */
        public Builder llmCubeThemes(String llmCubeThemes) {
            this.putQueryParameter("LlmCubeThemes", llmCubeThemes);
            this.llmCubeThemes = llmCubeThemes;
            return this;
        }

        /**
         * LlmCubes.
         */
        public Builder llmCubes(String llmCubes) {
            this.putQueryParameter("LlmCubes", llmCubes);
            this.llmCubes = llmCubes;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder operationType(Integer operationType) {
            this.putQueryParameter("OperationType", operationType);
            this.operationType = operationType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>wasdasd<em><strong><strong><strong>1235235sd,ASDAS</strong></strong></strong></em>**ASDAW123</p>
         */
        public Builder userIds(String userIds) {
            this.putQueryParameter("UserIds", userIds);
            this.userIds = userIds;
            return this;
        }

        @Override
        public SmartqAuthorizeRequest build() {
            return new SmartqAuthorizeRequest(this);
        } 

    } 

}
