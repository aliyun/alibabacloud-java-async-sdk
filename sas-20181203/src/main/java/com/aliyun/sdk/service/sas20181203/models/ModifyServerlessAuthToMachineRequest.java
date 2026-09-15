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
 * {@link ModifyServerlessAuthToMachineRequest} extends {@link RequestModel}
 *
 * <p>ModifyServerlessAuthToMachineRequest</p>
 */
public class ModifyServerlessAuthToMachineRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCriteria")
    private String appCriteria;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthItem")
    private String authItem;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoBind")
    private Integer autoBind;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindAll")
    private Boolean bindAll;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindAppList")
    private java.util.List<String> bindAppList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindAssetType")
    private String bindAssetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindUuidList")
    private java.util.List<String> bindUuidList;

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
    @com.aliyun.core.annotation.NameInMap("LogicalExp")
    private String logicalExp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NtmVersion")
    private String ntmVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreBind")
    private Integer preBind;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreBindOrderId")
    private Long preBindOrderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryUid")
    private Long resourceDirectoryUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnBindAppList")
    private java.util.List<String> unBindAppList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnBindUuidList")
    private java.util.List<String> unBindUuidList;

    private ModifyServerlessAuthToMachineRequest(Builder builder) {
        super(builder);
        this.appCriteria = builder.appCriteria;
        this.authItem = builder.authItem;
        this.autoBind = builder.autoBind;
        this.bindAll = builder.bindAll;
        this.bindAppList = builder.bindAppList;
        this.bindAssetType = builder.bindAssetType;
        this.bindUuidList = builder.bindUuidList;
        this.clientToken = builder.clientToken;
        this.criteria = builder.criteria;
        this.dryRun = builder.dryRun;
        this.logicalExp = builder.logicalExp;
        this.ntmVersion = builder.ntmVersion;
        this.preBind = builder.preBind;
        this.preBindOrderId = builder.preBindOrderId;
        this.resourceDirectoryUid = builder.resourceDirectoryUid;
        this.unBindAppList = builder.unBindAppList;
        this.unBindUuidList = builder.unBindUuidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyServerlessAuthToMachineRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appCriteria
     */
    public String getAppCriteria() {
        return this.appCriteria;
    }

    /**
     * @return authItem
     */
    public String getAuthItem() {
        return this.authItem;
    }

    /**
     * @return autoBind
     */
    public Integer getAutoBind() {
        return this.autoBind;
    }

    /**
     * @return bindAll
     */
    public Boolean getBindAll() {
        return this.bindAll;
    }

    /**
     * @return bindAppList
     */
    public java.util.List<String> getBindAppList() {
        return this.bindAppList;
    }

    /**
     * @return bindAssetType
     */
    public String getBindAssetType() {
        return this.bindAssetType;
    }

    /**
     * @return bindUuidList
     */
    public java.util.List<String> getBindUuidList() {
        return this.bindUuidList;
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
     * @return preBind
     */
    public Integer getPreBind() {
        return this.preBind;
    }

    /**
     * @return preBindOrderId
     */
    public Long getPreBindOrderId() {
        return this.preBindOrderId;
    }

    /**
     * @return resourceDirectoryUid
     */
    public Long getResourceDirectoryUid() {
        return this.resourceDirectoryUid;
    }

    /**
     * @return unBindAppList
     */
    public java.util.List<String> getUnBindAppList() {
        return this.unBindAppList;
    }

    /**
     * @return unBindUuidList
     */
    public java.util.List<String> getUnBindUuidList() {
        return this.unBindUuidList;
    }

    public static final class Builder extends Request.Builder<ModifyServerlessAuthToMachineRequest, Builder> {
        private String appCriteria; 
        private String authItem; 
        private Integer autoBind; 
        private Boolean bindAll; 
        private java.util.List<String> bindAppList; 
        private String bindAssetType; 
        private java.util.List<String> bindUuidList; 
        private String clientToken; 
        private String criteria; 
        private Boolean dryRun; 
        private String logicalExp; 
        private String ntmVersion; 
        private Integer preBind; 
        private Long preBindOrderId; 
        private Long resourceDirectoryUid; 
        private java.util.List<String> unBindAppList; 
        private java.util.List<String> unBindUuidList; 

        private Builder() {
            super();
        } 

        private Builder(ModifyServerlessAuthToMachineRequest request) {
            super(request);
            this.appCriteria = request.appCriteria;
            this.authItem = request.authItem;
            this.autoBind = request.autoBind;
            this.bindAll = request.bindAll;
            this.bindAppList = request.bindAppList;
            this.bindAssetType = request.bindAssetType;
            this.bindUuidList = request.bindUuidList;
            this.clientToken = request.clientToken;
            this.criteria = request.criteria;
            this.dryRun = request.dryRun;
            this.logicalExp = request.logicalExp;
            this.ntmVersion = request.ntmVersion;
            this.preBind = request.preBind;
            this.preBindOrderId = request.preBindOrderId;
            this.resourceDirectoryUid = request.resourceDirectoryUid;
            this.unBindAppList = request.unBindAppList;
            this.unBindUuidList = request.unBindUuidList;
        } 

        /**
         * <p>The application query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>**7ad7e3a</p>
         */
        public Builder appCriteria(String appCriteria) {
            this.putQueryParameter("AppCriteria", appCriteria);
            this.appCriteria = appCriteria;
            return this;
        }

        /**
         * <p>The instance type. Valid values:</p>
         * <ul>
         * <li><strong>SERVERLESS</strong>: Serverless asset.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SERVERLESS</p>
         */
        public Builder authItem(String authItem) {
            this.putQueryParameter("AuthItem", authItem);
            this.authItem = authItem;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic binding. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Disable automatic binding.</li>
         * <li><strong>1</strong>: Enable automatic binding.</li>
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
         * <p>Specifies whether to bind all assets. Default value: <strong>false</strong>. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Bind all assets.</li>
         * <li><strong>false</strong>: Do not bind all assets.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder bindAll(Boolean bindAll) {
            this.putQueryParameter("BindAll", bindAll);
            this.bindAll = bindAll;
            return this;
        }

        /**
         * <p>The list of application IDs to bind.</p>
         * <blockquote>
         * <p>Obtain the IDs by calling the <a href="~~ListMachineApps~~">ListMachineApps</a> operation.</p>
         * </blockquote>
         */
        public Builder bindAppList(java.util.List<String> bindAppList) {
            this.putQueryParameter("BindAppList", bindAppList);
            this.bindAppList = bindAppList;
            return this;
        }

        /**
         * <p>The Asset Type for the operation. Valid values:</p>
         * <ul>
         * <li><strong>INSTANCE</strong>: Instance.</li>
         * <li><strong>APP</strong>: Application.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>APP</p>
         */
        public Builder bindAssetType(String bindAssetType) {
            this.putQueryParameter("BindAssetType", bindAssetType);
            this.bindAssetType = bindAssetType;
            return this;
        }

        /**
         * <p>The list of asset UUIDs to bind.</p>
         */
        public Builder bindUuidList(java.util.List<String> bindUuidList) {
            this.putQueryParameter("BindUuidList", bindUuidList);
            this.bindUuidList = bindUuidList;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. Use a different token for each request. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The search conditions for assets. This parameter is in JSON format. Pay attention to letter case when you specify this parameter.</p>
         * <blockquote>
         * <p>You can search for assets by instance ID, instance name, VPC ID, region, public IP address, and other conditions. Call the <a href="~~DescribeCriteria~~">DescribeCriteria</a> operation to query the supported search conditions.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;vulStatus&quot;,&quot;value&quot;:&quot;YES&quot;,&quot;logicalExp&quot;:&quot;AND&quot;}]</p>
         */
        public Builder criteria(String criteria) {
            this.putQueryParameter("Criteria", criteria);
            this.criteria = criteria;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. true: performs only a check without executing the actual operation. false: performs the actual operation. Default value: false.</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The logical relationship among multiple search conditions. Valid values:</p>
         * <ul>
         * <li><strong>OR</strong>: Multiple conditions are evaluated using a logical OR.</li>
         * <li><strong>AND</strong>: Multiple conditions are evaluated using a logical AND.</li>
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
         * <p>The NTM version code for pre-binding.</p>
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
         * <p>Specifies whether to perform a pre-binding operation. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: No.</li>
         * <li><strong>1</strong>: Yes.</li>
         * </ul>
         * <blockquote>
         * <p>After pre-binding is enabled, the corresponding number of authorization licenses are automatically bound to the specified servers after the purchase is completed.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder preBind(Integer preBind) {
            this.putQueryParameter("PreBind", preBind);
            this.preBind = preBind;
            return this;
        }

        /**
         * <p>The pre-binding order ID.</p>
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
         * <p>The UID of the resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder resourceDirectoryUid(Long resourceDirectoryUid) {
            this.putQueryParameter("ResourceDirectoryUid", resourceDirectoryUid);
            this.resourceDirectoryUid = resourceDirectoryUid;
            return this;
        }

        /**
         * <p>The list of application IDs to unbind.</p>
         * <blockquote>
         * <p>Obtain the IDs by calling the <a href="~~ListMachineApps~~">ListMachineApps</a> operation.</p>
         * </blockquote>
         */
        public Builder unBindAppList(java.util.List<String> unBindAppList) {
            this.putQueryParameter("UnBindAppList", unBindAppList);
            this.unBindAppList = unBindAppList;
            return this;
        }

        /**
         * <p>The list of asset UUIDs to unbind.</p>
         */
        public Builder unBindUuidList(java.util.List<String> unBindUuidList) {
            this.putQueryParameter("UnBindUuidList", unBindUuidList);
            this.unBindUuidList = unBindUuidList;
            return this;
        }

        @Override
        public ModifyServerlessAuthToMachineRequest build() {
            return new ModifyServerlessAuthToMachineRequest(this);
        } 

    } 

}
