// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link ApproveServiceUsageRequest} extends {@link RequestModel}
 *
 * <p>ApproveServiceUsageRequest</p>
 */
public class ApproveServiceUsageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comments")
    private String comments;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private Integer type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserAliUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long userAliUid;

    private ApproveServiceUsageRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.comments = builder.comments;
        this.regionId = builder.regionId;
        this.serviceId = builder.serviceId;
        this.type = builder.type;
        this.userAliUid = builder.userAliUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApproveServiceUsageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return comments
     */
    public String getComments() {
        return this.comments;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * @return userAliUid
     */
    public Long getUserAliUid() {
        return this.userAliUid;
    }

    public static final class Builder extends Request.Builder<ApproveServiceUsageRequest, Builder> {
        private String clientToken; 
        private String comments; 
        private String regionId; 
        private String serviceId; 
        private Integer type; 
        private Long userAliUid; 

        private Builder() {
            super();
        } 

        private Builder(ApproveServiceUsageRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.comments = request.comments;
            this.regionId = request.regionId;
            this.serviceId = request.serviceId;
            this.type = request.type;
            this.userAliUid = request.userAliUid;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>10CM943JP0EN9D51H</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Approval comments.</p>
         * 
         * <strong>example:</strong>
         * <p>Welcome to TuGraph. Your application has been approved. Should you have any questions, please feel free to email us at <a href="mailto:tugraph@service.alipay.com">tugraph@service.alipay.com</a> or call our contact number 400-903-0809. Contact person: Yuansu.</p>
         */
        public Builder comments(String comments) {
            this.putQueryParameter("Comments", comments);
            this.comments = comments;
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
         * <p>The service ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>service-39f4f251e94843xxxxxx</p>
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>ServiceSharedAccountType，</p>
         * 
         * <strong>example:</strong>
         * <p>SharedAccount</p>
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>User ali uid.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>127383705958xxxx</p>
         */
        public Builder userAliUid(Long userAliUid) {
            this.putQueryParameter("UserAliUid", userAliUid);
            this.userAliUid = userAliUid;
            return this;
        }

        @Override
        public ApproveServiceUsageRequest build() {
            return new ApproveServiceUsageRequest(this);
        } 

    } 

}
