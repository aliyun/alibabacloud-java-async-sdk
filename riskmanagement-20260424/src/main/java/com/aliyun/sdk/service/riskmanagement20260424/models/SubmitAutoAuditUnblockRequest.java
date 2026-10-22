// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link SubmitAutoAuditUnblockRequest} extends {@link RequestModel}
 *
 * <p>SubmitAutoAuditUnblockRequest</p>
 */
public class SubmitAutoAuditUnblockRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetList")
    private String assetList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Auditor")
    private String auditor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerUid")
    private String customerUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EmailType")
    private String emailType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HasUnsubscribe")
    private Boolean hasUnsubscribe;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SendCount")
    private String sendCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseDesc")
    private String useDesc;

    private SubmitAutoAuditUnblockRequest(Builder builder) {
        super(builder);
        this.assetList = builder.assetList;
        this.auditor = builder.auditor;
        this.customerUid = builder.customerUid;
        this.emailType = builder.emailType;
        this.hasUnsubscribe = builder.hasUnsubscribe;
        this.sendCount = builder.sendCount;
        this.useDesc = builder.useDesc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitAutoAuditUnblockRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetList
     */
    public String getAssetList() {
        return this.assetList;
    }

    /**
     * @return auditor
     */
    public String getAuditor() {
        return this.auditor;
    }

    /**
     * @return customerUid
     */
    public String getCustomerUid() {
        return this.customerUid;
    }

    /**
     * @return emailType
     */
    public String getEmailType() {
        return this.emailType;
    }

    /**
     * @return hasUnsubscribe
     */
    public Boolean getHasUnsubscribe() {
        return this.hasUnsubscribe;
    }

    /**
     * @return sendCount
     */
    public String getSendCount() {
        return this.sendCount;
    }

    /**
     * @return useDesc
     */
    public String getUseDesc() {
        return this.useDesc;
    }

    public static final class Builder extends Request.Builder<SubmitAutoAuditUnblockRequest, Builder> {
        private String assetList; 
        private String auditor; 
        private String customerUid; 
        private String emailType; 
        private Boolean hasUnsubscribe; 
        private String sendCount; 
        private String useDesc; 

        private Builder() {
            super();
        } 

        private Builder(SubmitAutoAuditUnblockRequest request) {
            super(request);
            this.assetList = request.assetList;
            this.auditor = request.auditor;
            this.customerUid = request.customerUid;
            this.emailType = request.emailType;
            this.hasUnsubscribe = request.hasUnsubscribe;
            this.sendCount = request.sendCount;
            this.useDesc = request.useDesc;
        } 

        /**
         * <p>The list of assets.</p>
         * <blockquote>
         * <p>The array supports up to 50 IP addresses.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;domain&quot;:&quot;&quot;,&quot;ip&quot;:&quot;120.26.29.16&quot;,&quot;assetType&quot;:&quot;EIP&quot;}]</p>
         */
        public Builder assetList(String assetList) {
            this.putQueryParameter("AssetList", assetList);
            this.assetList = assetList;
            return this;
        }

        /**
         * <p>The auditor.</p>
         * <blockquote>
         * <p>You do not need to specify this parameter. It does not take effect.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        public Builder auditor(String auditor) {
            this.putQueryParameter("Auditor", auditor);
            this.auditor = auditor;
            return this;
        }

        /**
         * <p>The customer UID.</p>
         * 
         * <strong>example:</strong>
         * <p>1317334647812936</p>
         */
        public Builder customerUid(String customerUid) {
            this.putQueryParameter("CustomerUid", customerUid);
            this.customerUid = customerUid;
            return this;
        }

        /**
         * <p>The type of the email to send.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder emailType(String emailType) {
            this.putQueryParameter("EmailType", emailType);
            this.emailType = emailType;
            return this;
        }

        /**
         * <p>Specifies whether the email includes an unsubscribe option.</p>
         * <ul>
         * <li><strong>true</strong>: Included.</li>
         * <li><strong>false</strong>: Not included.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasUnsubscribe(Boolean hasUnsubscribe) {
            this.putQueryParameter("HasUnsubscribe", hasUnsubscribe);
            this.hasUnsubscribe = hasUnsubscribe;
            return this;
        }

        /**
         * <p>The description of the number of emails to send.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder sendCount(String sendCount) {
            this.putQueryParameter("SendCount", sendCount);
            this.sendCount = sendCount;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Usage instructions</p>
         */
        public Builder useDesc(String useDesc) {
            this.putQueryParameter("UseDesc", useDesc);
            this.useDesc = useDesc;
            return this;
        }

        @Override
        public SubmitAutoAuditUnblockRequest build() {
            return new SubmitAutoAuditUnblockRequest(this);
        } 

    } 

}
