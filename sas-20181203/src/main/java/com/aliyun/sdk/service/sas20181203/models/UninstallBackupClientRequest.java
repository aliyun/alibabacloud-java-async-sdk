// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UninstallBackupClientRequest} extends {@link RequestModel}
 *
 * <p>UninstallBackupClientRequest</p>
 */
public class UninstallBackupClientRequest extends Request {
    @Query
    @NameInMap("PolicyVersion")
    @Validation(required = true)
    private String policyVersion;

    @Query
    @NameInMap("Uuid")
    private String uuid;

    @Query
    @NameInMap("UuidList")
    private java.util.List < String > uuidList;

    private UninstallBackupClientRequest(Builder builder) {
        super(builder);
        this.policyVersion = builder.policyVersion;
        this.uuid = builder.uuid;
        this.uuidList = builder.uuidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UninstallBackupClientRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyVersion
     */
    public String getPolicyVersion() {
        return this.policyVersion;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    /**
     * @return uuidList
     */
    public java.util.List < String > getUuidList() {
        return this.uuidList;
    }

    public static final class Builder extends Request.Builder<UninstallBackupClientRequest, Builder> {
        private String policyVersion; 
        private String uuid; 
        private java.util.List < String > uuidList; 

        private Builder() {
            super();
        } 

        private Builder(UninstallBackupClientRequest response) {
            super(response);
            this.policyVersion = response.policyVersion;
            this.uuid = response.uuid;
            this.uuidList = response.uuidList;
        } 

        /**
         * PolicyVersion.
         */
        public Builder policyVersion(String policyVersion) {
            this.putQueryParameter("PolicyVersion", policyVersion);
            this.policyVersion = policyVersion;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        /**
         * UuidList.
         */
        public Builder uuidList(java.util.List < String > uuidList) {
            this.putQueryParameter("UuidList", uuidList);
            this.uuidList = uuidList;
            return this;
        }

        @Override
        public UninstallBackupClientRequest build() {
            return new UninstallBackupClientRequest(this);
        } 

    } 

}
