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
    @com.aliyun.core.annotation.NameInMap("CubeIds")
    private String cubeIds;

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
    @com.aliyun.core.annotation.Validation(required = true, maximum = 1)
    private Integer operationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userIds;

    private SmartqAuthorizeRequest(Builder builder) {
        super(builder);
        this.cubeIds = builder.cubeIds;
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
     * @return cubeIds
     */
    public String getCubeIds() {
        return this.cubeIds;
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
        private String cubeIds; 
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
            this.cubeIds = request.cubeIds;
            this.expireDay = request.expireDay;
            this.llmCubeThemes = request.llmCubeThemes;
            this.llmCubes = request.llmCubes;
            this.operationType = request.operationType;
            this.userIds = request.userIds;
        } 

        /**
         * <p>An array of dataset IDs. Separate multiple IDs with commas.</p>
         * <blockquote>
         * <p>Notice: This parameter is converted to the corresponding Q\&amp;A resource ID for authorization. If a \<code>cubeId\\</code> does not correspond to an existing Q\&amp;A resource, an error is reported that the Q\&amp;A resource does not exist. Ensure that the \<code>cubeId\\</code> is correct.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>wasdasd<em><strong><strong><strong>1235235sd,ASDAS</strong></strong></strong></em>**ASDAW123</p>
         */
        public Builder cubeIds(String cubeIds) {
            this.putQueryParameter("CubeIds", cubeIds);
            this.cubeIds = cubeIds;
            return this;
        }

        /**
         * <p>The expiration time. The default is seven days.
         * Format: 2099-12-31</p>
         * 
         * <strong>example:</strong>
         * <p>2099-12-31</p>
         */
        public Builder expireDay(String expireDay) {
            this.putQueryParameter("ExpireDay", expireDay);
            this.expireDay = expireDay;
            return this;
        }

        /**
         * <p>An array of analysis subject IDs. Separate multiple IDs with commas.</p>
         * 
         * <strong>example:</strong>
         * <p>wasdasd<em><strong><strong><strong>1235235sd,ASDAS</strong></strong></strong></em>**ASDAW123</p>
         */
        public Builder llmCubeThemes(String llmCubeThemes) {
            this.putQueryParameter("LlmCubeThemes", llmCubeThemes);
            this.llmCubeThemes = llmCubeThemes;
            return this;
        }

        /**
         * <p>An array of Q\&amp;A resource IDs. Separate multiple IDs with commas.</p>
         * 
         * <strong>example:</strong>
         * <p>wasdasd<em><strong><strong><strong>1235235sd,ASDAS</strong></strong></strong></em>**ASDAW123</p>
         */
        public Builder llmCubes(String llmCubes) {
            this.putQueryParameter("LlmCubes", llmCubes);
            this.llmCubes = llmCubes;
            return this;
        }

        /**
         * <p>The operation type. Valid values:</p>
         * <ul>
         * <li><p>0: Grant authorization</p>
         * </li>
         * <li><p>1: Delete authorization</p>
         * </li>
         * </ul>
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
         * <p>An array of user IDs. Separate multiple IDs with commas.</p>
         * <blockquote>
         * <p>Notice: The number of user IDs × (the number of Q\&amp;A resources + the number of analysis subjects) in a single request cannot exceed 100.</p>
         * </blockquote>
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
