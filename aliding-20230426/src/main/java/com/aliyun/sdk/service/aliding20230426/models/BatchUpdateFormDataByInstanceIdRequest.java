// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link BatchUpdateFormDataByInstanceIdRequest} extends {@link RequestModel}
 *
 * <p>BatchUpdateFormDataByInstanceIdRequest</p>
 */
public class BatchUpdateFormDataByInstanceIdRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppType")
    private String appType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AsynchronousExecution")
    private Boolean asynchronousExecution;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FormInstanceIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> formInstanceIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FormUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String formUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IgnoreEmpty")
    private Boolean ignoreEmpty;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NoExecuteExpression")
    private Boolean noExecuteExpression;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SystemToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String systemToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpdateFormDataJson")
    @com.aliyun.core.annotation.Validation(required = true)
    private String updateFormDataJson;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UseLatestFormSchemaVersion")
    private Boolean useLatestFormSchemaVersion;

    private BatchUpdateFormDataByInstanceIdRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.appType = builder.appType;
        this.asynchronousExecution = builder.asynchronousExecution;
        this.formInstanceIdList = builder.formInstanceIdList;
        this.formUuid = builder.formUuid;
        this.ignoreEmpty = builder.ignoreEmpty;
        this.noExecuteExpression = builder.noExecuteExpression;
        this.systemToken = builder.systemToken;
        this.updateFormDataJson = builder.updateFormDataJson;
        this.useLatestFormSchemaVersion = builder.useLatestFormSchemaVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchUpdateFormDataByInstanceIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountContext
     */
    public AccountContext getAccountContext() {
        return this.accountContext;
    }

    /**
     * @return appType
     */
    public String getAppType() {
        return this.appType;
    }

    /**
     * @return asynchronousExecution
     */
    public Boolean getAsynchronousExecution() {
        return this.asynchronousExecution;
    }

    /**
     * @return formInstanceIdList
     */
    public java.util.List<String> getFormInstanceIdList() {
        return this.formInstanceIdList;
    }

    /**
     * @return formUuid
     */
    public String getFormUuid() {
        return this.formUuid;
    }

    /**
     * @return ignoreEmpty
     */
    public Boolean getIgnoreEmpty() {
        return this.ignoreEmpty;
    }

    /**
     * @return noExecuteExpression
     */
    public Boolean getNoExecuteExpression() {
        return this.noExecuteExpression;
    }

    /**
     * @return systemToken
     */
    public String getSystemToken() {
        return this.systemToken;
    }

    /**
     * @return updateFormDataJson
     */
    public String getUpdateFormDataJson() {
        return this.updateFormDataJson;
    }

    /**
     * @return useLatestFormSchemaVersion
     */
    public Boolean getUseLatestFormSchemaVersion() {
        return this.useLatestFormSchemaVersion;
    }

    public static final class Builder extends Request.Builder<BatchUpdateFormDataByInstanceIdRequest, Builder> {
        private AccountContext accountContext; 
        private String appType; 
        private Boolean asynchronousExecution; 
        private java.util.List<String> formInstanceIdList; 
        private String formUuid; 
        private Boolean ignoreEmpty; 
        private Boolean noExecuteExpression; 
        private String systemToken; 
        private String updateFormDataJson; 
        private Boolean useLatestFormSchemaVersion; 

        private Builder() {
            super();
        } 

        private Builder(BatchUpdateFormDataByInstanceIdRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.appType = request.appType;
            this.asynchronousExecution = request.asynchronousExecution;
            this.formInstanceIdList = request.formInstanceIdList;
            this.formUuid = request.formUuid;
            this.ignoreEmpty = request.ignoreEmpty;
            this.noExecuteExpression = request.noExecuteExpression;
            this.systemToken = request.systemToken;
            this.updateFormDataJson = request.updateFormDataJson;
            this.useLatestFormSchemaVersion = request.useLatestFormSchemaVersion;
        } 

        /**
         * AccountContext.
         */
        public Builder accountContext(AccountContext accountContext) {
            String accountContextShrink = shrink(accountContext, "AccountContext", "json");
            this.putHeaderParameter("AccountContext", accountContextShrink);
            this.accountContext = accountContext;
            return this;
        }

        /**
         * AppType.
         */
        public Builder appType(String appType) {
            this.putBodyParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        /**
         * AsynchronousExecution.
         */
        public Builder asynchronousExecution(Boolean asynchronousExecution) {
            this.putBodyParameter("AsynchronousExecution", asynchronousExecution);
            this.asynchronousExecution = asynchronousExecution;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[ &quot;FINST-J8766S91O2UYN87ZX3XOF1MY8MBA2912BSV0L24&quot; ]</p>
         */
        public Builder formInstanceIdList(java.util.List<String> formInstanceIdList) {
            String formInstanceIdListShrink = shrink(formInstanceIdList, "FormInstanceIdList", "json");
            this.putBodyParameter("FormInstanceIdList", formInstanceIdListShrink);
            this.formInstanceIdList = formInstanceIdList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FORM-GX866MC1NC1VOFF6WVQW33FD16E23L3CPMKVKA</p>
         */
        public Builder formUuid(String formUuid) {
            this.putBodyParameter("FormUuid", formUuid);
            this.formUuid = formUuid;
            return this;
        }

        /**
         * IgnoreEmpty.
         */
        public Builder ignoreEmpty(Boolean ignoreEmpty) {
            this.putBodyParameter("IgnoreEmpty", ignoreEmpty);
            this.ignoreEmpty = ignoreEmpty;
            return this;
        }

        /**
         * NoExecuteExpression.
         */
        public Builder noExecuteExpression(Boolean noExecuteExpression) {
            this.putBodyParameter("NoExecuteExpression", noExecuteExpression);
            this.noExecuteExpression = noExecuteExpression;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>09866181UTZVVD4R3DC955FNKIM52HVPU5WWK7</p>
         */
        public Builder systemToken(String systemToken) {
            this.putBodyParameter("SystemToken", systemToken);
            this.systemToken = systemToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;countrySelectField_l0c1cwiu&quot;:[{&quot;value&quot;:&quot;US&quot;}],&quot;addressField_l0c1cwiy&quot;:{&quot;address&quot;:&quot;111&quot;,&quot;regionIds&quot;:[460000,469027,469023401],&quot;regionText&quot;:[{&quot;en_US&quot;:&quot;hai+nan+sheng&quot;,&quot;zh_CN&quot;:&quot;海南省&quot;},{&quot;en_US&quot;:&quot;cheng+mai+xian&quot;,&quot;zh_CN&quot;:&quot;澄迈县&quot;},{&quot;en_US&quot;:&quot;guo+ying+hong+gang+nong+chang&quot;,&quot;zh_CN&quot;:&quot;国营红岗农场&quot;}]}}</p>
         */
        public Builder updateFormDataJson(String updateFormDataJson) {
            this.putBodyParameter("UpdateFormDataJson", updateFormDataJson);
            this.updateFormDataJson = updateFormDataJson;
            return this;
        }

        /**
         * UseLatestFormSchemaVersion.
         */
        public Builder useLatestFormSchemaVersion(Boolean useLatestFormSchemaVersion) {
            this.putBodyParameter("UseLatestFormSchemaVersion", useLatestFormSchemaVersion);
            this.useLatestFormSchemaVersion = useLatestFormSchemaVersion;
            return this;
        }

        @Override
        public BatchUpdateFormDataByInstanceIdRequest build() {
            return new BatchUpdateFormDataByInstanceIdRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchUpdateFormDataByInstanceIdRequest} extends {@link TeaModel}
     *
     * <p>BatchUpdateFormDataByInstanceIdRequest</p>
     */
    public static class AccountContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String accountId;

        private AccountContext(Builder builder) {
            this.accountId = builder.accountId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountContext create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        public static final class Builder {
            private String accountId; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>012345</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            public AccountContext build() {
                return new AccountContext(this);
            } 

        } 

    }
}
