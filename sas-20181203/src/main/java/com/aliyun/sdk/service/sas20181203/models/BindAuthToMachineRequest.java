// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link BindAuthToMachineRequest} extends {@link RequestModel}
 *
 * <p>BindAuthToMachineRequest</p>
 */
public class BindAuthToMachineRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthVersion")
    private Integer authVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoBind")
    private Integer autoBind;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bind")
    private java.util.List<String> bind;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindAll")
    private Boolean bindAll;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Criteria")
    private String criteria;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsPreBind")
    private Integer isPreBind;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogicalExp")
    private String logicalExp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NtmVersion")
    private String ntmVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreBindOrderId")
    private Long preBindOrderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnBind")
    private java.util.List<String> unBind;

    private BindAuthToMachineRequest(Builder builder) {
        super(builder);
        this.authVersion = builder.authVersion;
        this.autoBind = builder.autoBind;
        this.bind = builder.bind;
        this.bindAll = builder.bindAll;
        this.clientToken = builder.clientToken;
        this.criteria = builder.criteria;
        this.dryRun = builder.dryRun;
        this.isPreBind = builder.isPreBind;
        this.logicalExp = builder.logicalExp;
        this.ntmVersion = builder.ntmVersion;
        this.preBindOrderId = builder.preBindOrderId;
        this.productCode = builder.productCode;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.unBind = builder.unBind;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindAuthToMachineRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authVersion
     */
    public Integer getAuthVersion() {
        return this.authVersion;
    }

    /**
     * @return autoBind
     */
    public Integer getAutoBind() {
        return this.autoBind;
    }

    /**
     * @return bind
     */
    public java.util.List<String> getBind() {
        return this.bind;
    }

    /**
     * @return bindAll
     */
    public Boolean getBindAll() {
        return this.bindAll;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return criteria
     */
    public String getCriteria() {
        return this.criteria;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return isPreBind
     */
    public Integer getIsPreBind() {
        return this.isPreBind;
    }

    /**
     * @return logicalExp
     */
    public String getLogicalExp() {
        return this.logicalExp;
    }

    /**
     * @return ntmVersion
     */
    public String getNtmVersion() {
        return this.ntmVersion;
    }

    /**
     * @return preBindOrderId
     */
    public Long getPreBindOrderId() {
        return this.preBindOrderId;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return unBind
     */
    public java.util.List<String> getUnBind() {
        return this.unBind;
    }

    public static final class Builder extends Request.Builder<BindAuthToMachineRequest, Builder> {
        private Integer authVersion; 
        private Integer autoBind; 
        private java.util.List<String> bind; 
        private Boolean bindAll; 
        private String clientToken; 
        private String criteria; 
        private Boolean dryRun; 
        private Integer isPreBind; 
        private String logicalExp; 
        private String ntmVersion; 
        private Long preBindOrderId; 
        private String productCode; 
        private Long resourceDirectoryAccountId; 
        private java.util.List<String> unBind; 

        private Builder() {
            super();
        } 

        private Builder(BindAuthToMachineRequest request) {
            super(request);
            this.authVersion = request.authVersion;
            this.autoBind = request.autoBind;
            this.bind = request.bind;
            this.bindAll = request.bindAll;
            this.clientToken = request.clientToken;
            this.criteria = request.criteria;
            this.dryRun = request.dryRun;
            this.isPreBind = request.isPreBind;
            this.logicalExp = request.logicalExp;
            this.ntmVersion = request.ntmVersion;
            this.preBindOrderId = request.preBindOrderId;
            this.productCode = request.productCode;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.unBind = request.unBind;
        } 

        /**
         * <p>The authorization version of the asset. Valid values:</p>
         * <ul>
         * <li><strong>6</strong>: Anti-virus Edition</li>
         * <li><strong>5</strong>: Advanced Edition</li>
         * <li><strong>3</strong>: Enterprise Edition</li>
         * <li><strong>7</strong>: Ultimate Edition</li>
         * <li><strong>10</strong>: Value-added Service Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder authVersion(Integer authVersion) {
            this.putQueryParameter("AuthVersion", authVersion);
            this.authVersion = authVersion;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic binding. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Disabled</li>
         * <li><strong>1</strong>: Enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder autoBind(Integer autoBind) {
            this.putQueryParameter("AutoBind", autoBind);
            this.autoBind = autoBind;
            return this;
        }

        /**
         * <p>The set of UUIDs to be bound.</p>
         * <blockquote>
         * <p><strong>Bind</strong> and <strong>UnBind</strong> cannot be empty at the same time.</p>
         * </blockquote>
         */
        public Builder bind(java.util.List<String> bind) {
            this.putQueryParameter("Bind", bind);
            this.bind = bind;
            return this;
        }

        /**
         * <p>Specifies whether to bind all assets. Default value: <strong>false</strong>. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes</li>
         * <li><strong>false</strong>: No</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder bindAll(Boolean bindAll) {
            this.putQueryParameter("BindAll", bindAll);
            this.bindAll = bindAll;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You must use different tokens for different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Sets the conditions for searching assets. This parameter is in JSON format. Pay attention to the case sensitivity when you specify this parameter.</p>
         * <blockquote>
         * <p>You can search for assets by using conditions such as the instance ID, instance name, VPC ID, region, and public IP address of the asset. You can call the <a href="~~DescribeCriteria~~">DescribeCriteria</a> operation to query the supported search conditions.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;riskStatus&quot;,&quot;value&quot;:&quot;YES&quot;},{&quot;name&quot;:&quot;internetIp&quot;,&quot;value&quot;:&quot;1.2.XX.XX&quot;}]</p>
         */
        public Builder criteria(String criteria) {
            this.putQueryParameter("Criteria", criteria);
            this.criteria = criteria;
            return this;
        }

        /**
         * <p>Specifies whether to only precheck the request. true: only prechecks the request and does not perform the actual operation. false: performs the request normally. Default value: false.</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>Specifies whether the operation is a pre-binding operation. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: No</li>
         * <li><strong>1</strong>: Yes</li>
         * </ul>
         * <blockquote>
         * <p>After pre-binding is enabled, the system automatically binds the corresponding number of licenses of the specified version to the specified servers after the purchase is completed.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isPreBind(Integer isPreBind) {
            this.putQueryParameter("IsPreBind", isPreBind);
            this.isPreBind = isPreBind;
            return this;
        }

        /**
         * <p>Specifies the logical relationship among multiple search conditions. Default value: <strong>OR</strong>. Valid values:</p>
         * <ul>
         * <li><strong>OR</strong>: Specifies the <strong>OR</strong> logical relationship among multiple conditions.</li>
         * <li><strong>AND</strong>: Specifies the <strong>AND</strong> logical relationship among multiple conditions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OR</p>
         */
        public Builder logicalExp(String logicalExp) {
            this.putQueryParameter("LogicalExp", logicalExp);
            this.logicalExp = logicalExp;
            return this;
        }

        /**
         * <p>The version of the order associated with the pre-binding operation. Valid values:</p>
         * <ul>
         * <li><strong>level7</strong>: Anti-virus Edition</li>
         * <li><strong>level3</strong>: Advanced Edition</li>
         * <li><strong>level2</strong>: Enterprise Edition</li>
         * <li><strong>level8</strong>: Ultimate Edition</li>
         * <li><strong>level10</strong>: Value-added services only</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>level2</p>
         */
        public Builder ntmVersion(String ntmVersion) {
            this.putQueryParameter("NtmVersion", ntmVersion);
            this.ntmVersion = ntmVersion;
            return this;
        }

        /**
         * <p>The ID of the order associated with the pre-binding operation.</p>
         * 
         * <strong>example:</strong>
         * <p>233016**0482</p>
         */
        public Builder preBindOrderId(Long preBindOrderId) {
            this.putQueryParameter("PreBindOrderId", preBindOrderId);
            this.preBindOrderId = preBindOrderId;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The ID of the member accounts in the resource folder. The ID is an Alibaba Cloud account ID.</p>
         * <blockquote>
         * <p>You can invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>16670360956*****</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>The set of UUIDs to be unbound.</p>
         * <blockquote>
         * <p><strong>Bind</strong> and <strong>UnBind</strong> cannot be empty at the same time.</p>
         * </blockquote>
         */
        public Builder unBind(java.util.List<String> unBind) {
            this.putQueryParameter("UnBind", unBind);
            this.unBind = unBind;
            return this;
        }

        @Override
        public BindAuthToMachineRequest build() {
            return new BindAuthToMachineRequest(this);
        } 

    } 

}
