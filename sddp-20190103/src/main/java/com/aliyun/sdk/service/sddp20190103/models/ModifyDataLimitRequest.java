// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDataLimitRequest} extends {@link RequestModel}
 *
 * <p>ModifyDataLimitRequest</p>
 */
public class ModifyDataLimitRequest extends Request {
    @Query
    @NameInMap("AuditStatus")
    private Integer auditStatus;

    @Query
    @NameInMap("AutoScan")
    private Integer autoScan;

    @Query
    @NameInMap("EngineType")
    private String engineType;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("LogStoreDay")
    private Integer logStoreDay;

    @Query
    @NameInMap("ModifyPassword")
    private Boolean modifyPassword;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("Port")
    private Integer port;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private Integer resourceType;

    @Query
    @NameInMap("ServiceRegionId")
    private String serviceRegionId;

    @Query
    @NameInMap("UserName")
    private String userName;

    private ModifyDataLimitRequest(Builder builder) {
        super(builder);
        this.auditStatus = builder.auditStatus;
        this.autoScan = builder.autoScan;
        this.engineType = builder.engineType;
        this.id = builder.id;
        this.lang = builder.lang;
        this.logStoreDay = builder.logStoreDay;
        this.modifyPassword = builder.modifyPassword;
        this.password = builder.password;
        this.port = builder.port;
        this.resourceType = builder.resourceType;
        this.serviceRegionId = builder.serviceRegionId;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDataLimitRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auditStatus
     */
    public Integer getAuditStatus() {
        return this.auditStatus;
    }

    /**
     * @return autoScan
     */
    public Integer getAutoScan() {
        return this.autoScan;
    }

    /**
     * @return engineType
     */
    public String getEngineType() {
        return this.engineType;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return logStoreDay
     */
    public Integer getLogStoreDay() {
        return this.logStoreDay;
    }

    /**
     * @return modifyPassword
     */
    public Boolean getModifyPassword() {
        return this.modifyPassword;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return resourceType
     */
    public Integer getResourceType() {
        return this.resourceType;
    }

    /**
     * @return serviceRegionId
     */
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<ModifyDataLimitRequest, Builder> {
        private Integer auditStatus; 
        private Integer autoScan; 
        private String engineType; 
        private Long id; 
        private String lang; 
        private Integer logStoreDay; 
        private Boolean modifyPassword; 
        private String password; 
        private Integer port; 
        private Integer resourceType; 
        private String serviceRegionId; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDataLimitRequest request) {
            super(request);
            this.auditStatus = request.auditStatus;
            this.autoScan = request.autoScan;
            this.engineType = request.engineType;
            this.id = request.id;
            this.lang = request.lang;
            this.logStoreDay = request.logStoreDay;
            this.modifyPassword = request.modifyPassword;
            this.password = request.password;
            this.port = request.port;
            this.resourceType = request.resourceType;
            this.serviceRegionId = request.serviceRegionId;
            this.userName = request.userName;
        } 

        /**
         * AuditStatus.
         */
        public Builder auditStatus(Integer auditStatus) {
            this.putQueryParameter("AuditStatus", auditStatus);
            this.auditStatus = auditStatus;
            return this;
        }

        /**
         * AutoScan.
         */
        public Builder autoScan(Integer autoScan) {
            this.putQueryParameter("AutoScan", autoScan);
            this.autoScan = autoScan;
            return this;
        }

        /**
         * EngineType.
         */
        public Builder engineType(String engineType) {
            this.putQueryParameter("EngineType", engineType);
            this.engineType = engineType;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * LogStoreDay.
         */
        public Builder logStoreDay(Integer logStoreDay) {
            this.putQueryParameter("LogStoreDay", logStoreDay);
            this.logStoreDay = logStoreDay;
            return this;
        }

        /**
         * ModifyPassword.
         */
        public Builder modifyPassword(Boolean modifyPassword) {
            this.putQueryParameter("ModifyPassword", modifyPassword);
            this.modifyPassword = modifyPassword;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(Integer port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(Integer resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * ServiceRegionId.
         */
        public Builder serviceRegionId(String serviceRegionId) {
            this.putQueryParameter("ServiceRegionId", serviceRegionId);
            this.serviceRegionId = serviceRegionId;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public ModifyDataLimitRequest build() {
            return new ModifyDataLimitRequest(this);
        } 

    } 

}
