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
    @com.aliyun.core.annotation.NameInMap("Criteria")
    private String criteria;

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
        this.criteria = builder.criteria;
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
     * @return criteria
     */
    public String getCriteria() {
        return this.criteria;
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
        private String criteria; 
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
            this.criteria = request.criteria;
            this.logicalExp = request.logicalExp;
            this.ntmVersion = request.ntmVersion;
            this.preBind = request.preBind;
            this.preBindOrderId = request.preBindOrderId;
            this.resourceDirectoryUid = request.resourceDirectoryUid;
            this.unBindAppList = request.unBindAppList;
            this.unBindUuidList = request.unBindUuidList;
        } 

        /**
         * <p>Application query condition.</p>
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
         * <p>Instance type. Values:</p>
         * <ul>
         * <li><strong>SERVERLESS</strong>: Serverless asset</li>
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
         * <p>Enable auto-binding. Values:</p>
         * <ul>
         * <li><strong>0</strong>: Off</li>
         * <li><strong>1</strong>: On</li>
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
         * <p>Whether to bind all. Default is <strong>false</strong>. Values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes</li>
         * <li><strong>false</strong>: No</li>
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
         * <p>List of application IDs to be bound.</p>
         * <blockquote>
         * <p>Obtained through the <a href="~~ListMachineApps~~">ListMachineApps</a> interface.</p>
         * </blockquote>
         */
        public Builder bindAppList(java.util.List<String> bindAppList) {
            this.putQueryParameter("BindAppList", bindAppList);
            this.bindAppList = bindAppList;
            return this;
        }

        /**
         * <p>Type of asset to operate on. Values:</p>
         * <ul>
         * <li><strong>INSTANCE</strong>: Instance</li>
         * <li><strong>APP</strong>: Application</li>
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
         * <p>List of asset UUIDs to be bound.</p>
         */
        public Builder bindUuidList(java.util.List<String> bindUuidList) {
            this.putQueryParameter("BindUuidList", bindUuidList);
            this.bindUuidList = bindUuidList;
            return this;
        }

        /**
         * <p>Set the conditions for searching assets. This parameter is in JSON format, and case sensitivity should be noted when entering parameters.</p>
         * <blockquote>
         * <p>Supports searching assets using instance ID, instance name, VPC ID, region, public IP address, etc. You can call the <a href="~~DescribeCriteria~~">DescribeCriteria</a> interface to query supported search conditions.</p>
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
         * <p>Set the logical relationship between multiple search conditions. Values:</p>
         * <ul>
         * <li><strong>OR</strong>: Indicates an <strong>or</strong> relationship between multiple conditions.</li>
         * <li><strong>AND</strong>: Indicates an <strong>and</strong> relationship between multiple conditions.</li>
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
         * <p>NTM version code, used for pre-binding.</p>
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
         * <p>Whether it is a pre-bind operation. Values:</p>
         * <ul>
         * <li><strong>0</strong>: No</li>
         * <li><strong>1</strong>: Yes</li>
         * </ul>
         * <blockquote>
         * <p>After enabling pre-binding, the specified server will automatically bind the corresponding version&quot;s authorization count after the purchase is completed.</p>
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
         * <p>Pre-bind order ID.</p>
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
         * <p>UID of the associated resource directory.</p>
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
         * <p>List of application IDs to be unbound.</p>
         * <blockquote>
         * <p>Obtained through the <a href="~~ListMachineApps~~">ListMachineApps</a> interface.</p>
         * </blockquote>
         */
        public Builder unBindAppList(java.util.List<String> unBindAppList) {
            this.putQueryParameter("UnBindAppList", unBindAppList);
            this.unBindAppList = unBindAppList;
            return this;
        }

        /**
         * <p>List of asset UUIDs to be unbound.</p>
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
