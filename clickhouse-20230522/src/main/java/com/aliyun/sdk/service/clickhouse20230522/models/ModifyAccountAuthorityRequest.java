// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20230522.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyAccountAuthorityRequest} extends {@link RequestModel}
 *
 * <p>ModifyAccountAuthorityRequest</p>
 */
public class ModifyAccountAuthorityRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Account")
    @com.aliyun.core.annotation.Validation(required = true)
    private String account;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DmlAuthSetting")
    @com.aliyun.core.annotation.Validation(required = true)
    private DmlAuthSetting dmlAuthSetting;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ModifyAccountAuthorityRequest(Builder builder) {
        super(builder);
        this.account = builder.account;
        this.DBInstanceId = builder.DBInstanceId;
        this.dmlAuthSetting = builder.dmlAuthSetting;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAccountAuthorityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return account
     */
    public String getAccount() {
        return this.account;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return dmlAuthSetting
     */
    public DmlAuthSetting getDmlAuthSetting() {
        return this.dmlAuthSetting;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyAccountAuthorityRequest, Builder> {
        private String account; 
        private String DBInstanceId; 
        private DmlAuthSetting dmlAuthSetting; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAccountAuthorityRequest request) {
            super(request);
            this.account = request.account;
            this.DBInstanceId = request.DBInstanceId;
            this.dmlAuthSetting = request.dmlAuthSetting;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        public Builder account(String account) {
            this.putQueryParameter("Account", account);
            this.account = account;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp100p4q1g9z3****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder dmlAuthSetting(DmlAuthSetting dmlAuthSetting) {
            String dmlAuthSettingShrink = shrink(dmlAuthSetting, "DmlAuthSetting", "json");
            this.putQueryParameter("DmlAuthSetting", dmlAuthSettingShrink);
            this.dmlAuthSetting = dmlAuthSetting;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyAccountAuthorityRequest build() {
            return new ModifyAccountAuthorityRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyAccountAuthorityRequest} extends {@link TeaModel}
     *
     * <p>ModifyAccountAuthorityRequest</p>
     */
    public static class DmlAuthSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowDatabases")
        private java.util.List < String > allowDatabases;

        @com.aliyun.core.annotation.NameInMap("AllowDictionaries")
        private java.util.List < String > allowDictionaries;

        @com.aliyun.core.annotation.NameInMap("DdlAuthority")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean ddlAuthority;

        @com.aliyun.core.annotation.NameInMap("DmlAuthority")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer dmlAuthority;

        private DmlAuthSetting(Builder builder) {
            this.allowDatabases = builder.allowDatabases;
            this.allowDictionaries = builder.allowDictionaries;
            this.ddlAuthority = builder.ddlAuthority;
            this.dmlAuthority = builder.dmlAuthority;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DmlAuthSetting create() {
            return builder().build();
        }

        /**
         * @return allowDatabases
         */
        public java.util.List < String > getAllowDatabases() {
            return this.allowDatabases;
        }

        /**
         * @return allowDictionaries
         */
        public java.util.List < String > getAllowDictionaries() {
            return this.allowDictionaries;
        }

        /**
         * @return ddlAuthority
         */
        public Boolean getDdlAuthority() {
            return this.ddlAuthority;
        }

        /**
         * @return dmlAuthority
         */
        public Integer getDmlAuthority() {
            return this.dmlAuthority;
        }

        public static final class Builder {
            private java.util.List < String > allowDatabases; 
            private java.util.List < String > allowDictionaries; 
            private Boolean ddlAuthority; 
            private Integer dmlAuthority; 

            /**
             * AllowDatabases.
             */
            public Builder allowDatabases(java.util.List < String > allowDatabases) {
                this.allowDatabases = allowDatabases;
                return this;
            }

            /**
             * AllowDictionaries.
             */
            public Builder allowDictionaries(java.util.List < String > allowDictionaries) {
                this.allowDictionaries = allowDictionaries;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ddlAuthority(Boolean ddlAuthority) {
                this.ddlAuthority = ddlAuthority;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dmlAuthority(Integer dmlAuthority) {
                this.dmlAuthority = dmlAuthority;
                return this;
            }

            public DmlAuthSetting build() {
                return new DmlAuthSetting(this);
            } 

        } 

    }
}
