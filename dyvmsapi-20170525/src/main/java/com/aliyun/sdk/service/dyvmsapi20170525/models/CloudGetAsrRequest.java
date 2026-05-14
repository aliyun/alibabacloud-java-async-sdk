// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link CloudGetAsrRequest} extends {@link RequestModel}
 *
 * <p>CloudGetAsrRequest</p>
 */
public class CloudGetAsrRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("All")
    private String all;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long callType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MainUniqueId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mainUniqueId;

    private CloudGetAsrRequest(Builder builder) {
        super(builder);
        this.all = builder.all;
        this.callType = builder.callType;
        this.enterpriseId = builder.enterpriseId;
        this.mainUniqueId = builder.mainUniqueId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudGetAsrRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return all
     */
    public String getAll() {
        return this.all;
    }

    /**
     * @return callType
     */
    public Long getCallType() {
        return this.callType;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return mainUniqueId
     */
    public String getMainUniqueId() {
        return this.mainUniqueId;
    }

    public static final class Builder extends Request.Builder<CloudGetAsrRequest, Builder> {
        private String all; 
        private Long callType; 
        private Long enterpriseId; 
        private String mainUniqueId; 

        private Builder() {
            super();
        } 

        private Builder(CloudGetAsrRequest request) {
            super(request);
            this.all = request.all;
            this.callType = request.callType;
            this.enterpriseId = request.enterpriseId;
            this.mainUniqueId = request.mainUniqueId;
        } 

        /**
         * <p>当all=true时按照beignTime的顺序返回两侧对话文本</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder all(String all) {
            this.putQueryParameter("All", all);
            this.all = all;
            return this;
        }

        /**
         * <p>通话类型；1:呼入,2:webcall,4:预览外呼,5:预测外呼,6:主叫外呼,9:内部呼叫</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder callType(Long callType) {
            this.putQueryParameter("CallType", callType);
            this.callType = callType;
            return this;
        }

        /**
         * <p>呼叫中心 id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7000002</p>
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("EnterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * <p>主通道的唯一标识</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sip-2-1490862368.123</p>
         */
        public Builder mainUniqueId(String mainUniqueId) {
            this.putQueryParameter("MainUniqueId", mainUniqueId);
            this.mainUniqueId = mainUniqueId;
            return this;
        }

        @Override
        public CloudGetAsrRequest build() {
            return new CloudGetAsrRequest(this);
        } 

    } 

}
