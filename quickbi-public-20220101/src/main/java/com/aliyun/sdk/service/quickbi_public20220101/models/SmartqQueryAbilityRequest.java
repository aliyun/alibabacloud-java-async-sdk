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
 * {@link SmartqQueryAbilityRequest} extends {@link RequestModel}
 *
 * <p>SmartqQueryAbilityRequest</p>
 */
public class SmartqQueryAbilityRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CubeId")
    private String cubeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MultipleCubeIds")
    private String multipleCubeIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserQuestion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userQuestion;

    private SmartqQueryAbilityRequest(Builder builder) {
        super(builder);
        this.cubeId = builder.cubeId;
        this.multipleCubeIds = builder.multipleCubeIds;
        this.userId = builder.userId;
        this.userQuestion = builder.userQuestion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SmartqQueryAbilityRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cubeId
     */
    public String getCubeId() {
        return this.cubeId;
    }

    /**
     * @return multipleCubeIds
     */
    public String getMultipleCubeIds() {
        return this.multipleCubeIds;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userQuestion
     */
    public String getUserQuestion() {
        return this.userQuestion;
    }

    public static final class Builder extends Request.Builder<SmartqQueryAbilityRequest, Builder> {
        private String cubeId; 
        private String multipleCubeIds; 
        private String userId; 
        private String userQuestion; 

        private Builder() {
            super();
        } 

        private Builder(SmartqQueryAbilityRequest request) {
            super(request);
            this.cubeId = request.cubeId;
            this.multipleCubeIds = request.multipleCubeIds;
            this.userId = request.userId;
            this.userQuestion = request.userQuestion;
        } 

        /**
         * <p>Dataset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7c7223ae-****-3c744528014b</p>
         */
        public Builder cubeId(String cubeId) {
            this.putQueryParameter("CubeId", cubeId);
            this.cubeId = cubeId;
            return this;
        }

        /**
         * MultipleCubeIds.
         */
        public Builder multipleCubeIds(String multipleCubeIds) {
            this.putQueryParameter("MultipleCubeIds", multipleCubeIds);
            this.multipleCubeIds = multipleCubeIds;
            return this;
        }

        /**
         * <p>User ID.</p>
         * <blockquote>
         * <p>Notice: If this field is not filled, the data will be queried by default as the organization owner.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>7c7223ae-****-3c744528014b</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * <p>Question text.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>This year&quot;s sales data</p>
         */
        public Builder userQuestion(String userQuestion) {
            this.putQueryParameter("UserQuestion", userQuestion);
            this.userQuestion = userQuestion;
            return this;
        }

        @Override
        public SmartqQueryAbilityRequest build() {
            return new SmartqQueryAbilityRequest(this);
        } 

    } 

}
