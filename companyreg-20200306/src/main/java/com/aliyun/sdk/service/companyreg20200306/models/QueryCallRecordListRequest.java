// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

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
 * {@link QueryCallRecordListRequest} extends {@link RequestModel}
 *
 * <p>QueryCallRecordListRequest</p>
 */
public class QueryCallRecordListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long skillType;

    private QueryCallRecordListRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.bizType = builder.bizType;
        this.skillType = builder.skillType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCallRecordListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return skillType
     */
    public Long getSkillType() {
        return this.skillType;
    }

    public static final class Builder extends Request.Builder<QueryCallRecordListRequest, Builder> {
        private String bizId; 
        private String bizType; 
        private Long skillType; 

        private Builder() {
            super();
        } 

        private Builder(QueryCallRecordListRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.bizType = request.bizType;
            this.skillType = request.skillType;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder skillType(Long skillType) {
            this.putQueryParameter("SkillType", skillType);
            this.skillType = skillType;
            return this;
        }

        @Override
        public QueryCallRecordListRequest build() {
            return new QueryCallRecordListRequest(this);
        } 

    } 

}
