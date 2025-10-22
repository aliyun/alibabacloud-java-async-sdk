// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

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
 * {@link PushDomainsRequest} extends {@link RequestModel}
 *
 * <p>PushDomainsRequest</p>
 */
public class PushDomainsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> domainList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutBizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outBizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublishRemark")
    private String publishRemark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReceiverAccount")
    @com.aliyun.core.annotation.Validation(required = true)
    private String receiverAccount;

    private PushDomainsRequest(Builder builder) {
        super(builder);
        this.domainList = builder.domainList;
        this.outBizId = builder.outBizId;
        this.publishRemark = builder.publishRemark;
        this.receiverAccount = builder.receiverAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushDomainsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainList
     */
    public java.util.List<String> getDomainList() {
        return this.domainList;
    }

    /**
     * @return outBizId
     */
    public String getOutBizId() {
        return this.outBizId;
    }

    /**
     * @return publishRemark
     */
    public String getPublishRemark() {
        return this.publishRemark;
    }

    /**
     * @return receiverAccount
     */
    public String getReceiverAccount() {
        return this.receiverAccount;
    }

    public static final class Builder extends Request.Builder<PushDomainsRequest, Builder> {
        private java.util.List<String> domainList; 
        private String outBizId; 
        private String publishRemark; 
        private String receiverAccount; 

        private Builder() {
            super();
        } 

        private Builder(PushDomainsRequest request) {
            super(request);
            this.domainList = request.domainList;
            this.outBizId = request.outBizId;
            this.publishRemark = request.publishRemark;
            this.receiverAccount = request.receiverAccount;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;example1.cn&quot;, &quot;example2.cn&quot;]</p>
         */
        public Builder domainList(java.util.List<String> domainList) {
            String domainListShrink = shrink(domainList, "DomainList", "json");
            this.putQueryParameter("DomainList", domainListShrink);
            this.domainList = domainList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NL123456</p>
         */
        public Builder outBizId(String outBizId) {
            this.putQueryParameter("OutBizId", outBizId);
            this.outBizId = outBizId;
            return this;
        }

        /**
         * PublishRemark.
         */
        public Builder publishRemark(String publishRemark) {
            this.putQueryParameter("PublishRemark", publishRemark);
            this.publishRemark = publishRemark;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>破天荒的土豆</p>
         */
        public Builder receiverAccount(String receiverAccount) {
            this.putQueryParameter("ReceiverAccount", receiverAccount);
            this.receiverAccount = receiverAccount;
            return this;
        }

        @Override
        public PushDomainsRequest build() {
            return new PushDomainsRequest(this);
        } 

    } 

}
