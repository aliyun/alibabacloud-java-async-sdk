// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20230522.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAccountAuthorityRequest} extends {@link RequestModel}
 *
 * <p>ModifyAccountAuthorityRequest</p>
 */
public class ModifyAccountAuthorityRequest extends Request {
    @Query
    @NameInMap("Account")
    private String account;

    @Query
    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @Query
    @NameInMap("DmlAuthSetting")
    private DmlAuthSetting dmlAuthSetting;

    @Query
    @NameInMap("RegionId")
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
         * Account.
         */
        public Builder account(String account) {
            this.putQueryParameter("Account", account);
            this.account = account;
            return this;
        }

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * DmlAuthSetting.
         */
        public Builder dmlAuthSetting(DmlAuthSetting dmlAuthSetting) {
            String dmlAuthSettingShrink = shrink(dmlAuthSetting, "DmlAuthSetting", "json");
            this.putQueryParameter("DmlAuthSetting", dmlAuthSettingShrink);
            this.dmlAuthSetting = dmlAuthSetting;
            return this;
        }

        /**
         * RegionId.
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

    public static class DmlAuthSetting extends TeaModel {
        @NameInMap("AllowDatabases")
        private java.util.List < String > allowDatabases;

        @NameInMap("AllowDictionaries")
        private java.util.List < String > allowDictionaries;

        @NameInMap("DdlAuthority")
        private Boolean ddlAuthority;

        @NameInMap("DmlAuthority")
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
             * DdlAuthority.
             */
            public Builder ddlAuthority(Boolean ddlAuthority) {
                this.ddlAuthority = ddlAuthority;
                return this;
            }

            /**
             * DmlAuthority.
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
