// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.advisor20180120.models;

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
 * {@link DescribeCostOptimizationOverviewRequest} extends {@link RequestModel}
 *
 * <p>DescribeCostOptimizationOverviewRequest</p>
 */
public class DescribeCostOptimizationOverviewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssumeAliyunId")
    private Long assumeAliyunId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssumeAliyunIdList")
    private java.util.List<Long> assumeAliyunIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckPlanId")
    private Long checkPlanId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    private DescribeCostOptimizationOverviewRequest(Builder builder) {
        super(builder);
        this.assumeAliyunId = builder.assumeAliyunId;
        this.assumeAliyunIdList = builder.assumeAliyunIdList;
        this.checkPlanId = builder.checkPlanId;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCostOptimizationOverviewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assumeAliyunId
     */
    public Long getAssumeAliyunId() {
        return this.assumeAliyunId;
    }

    /**
     * @return assumeAliyunIdList
     */
    public java.util.List<Long> getAssumeAliyunIdList() {
        return this.assumeAliyunIdList;
    }

    /**
     * @return checkPlanId
     */
    public Long getCheckPlanId() {
        return this.checkPlanId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<DescribeCostOptimizationOverviewRequest, Builder> {
        private Long assumeAliyunId; 
        private java.util.List<Long> assumeAliyunIdList; 
        private Long checkPlanId; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCostOptimizationOverviewRequest request) {
            super(request);
            this.assumeAliyunId = request.assumeAliyunId;
            this.assumeAliyunIdList = request.assumeAliyunIdList;
            this.checkPlanId = request.checkPlanId;
            this.token = request.token;
        } 

        /**
         * AssumeAliyunId.
         */
        public Builder assumeAliyunId(Long assumeAliyunId) {
            this.putQueryParameter("AssumeAliyunId", assumeAliyunId);
            this.assumeAliyunId = assumeAliyunId;
            return this;
        }

        /**
         * AssumeAliyunIdList.
         */
        public Builder assumeAliyunIdList(java.util.List<Long> assumeAliyunIdList) {
            String assumeAliyunIdListShrink = shrink(assumeAliyunIdList, "AssumeAliyunIdList", "json");
            this.putQueryParameter("AssumeAliyunIdList", assumeAliyunIdListShrink);
            this.assumeAliyunIdList = assumeAliyunIdList;
            return this;
        }

        /**
         * CheckPlanId.
         */
        public Builder checkPlanId(Long checkPlanId) {
            this.putQueryParameter("CheckPlanId", checkPlanId);
            this.checkPlanId = checkPlanId;
            return this;
        }

        /**
         * Token.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public DescribeCostOptimizationOverviewRequest build() {
            return new DescribeCostOptimizationOverviewRequest(this);
        } 

    } 

}
