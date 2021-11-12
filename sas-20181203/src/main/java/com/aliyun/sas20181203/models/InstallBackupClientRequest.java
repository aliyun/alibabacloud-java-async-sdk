// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link InstallBackupClientRequest} extends {@link RequestModel}
 *
 * <p>InstallBackupClientRequest</p>
 */
public class InstallBackupClientRequest extends Request {
    @Query
    @NameInMap("PolicyVersion")
    private String policyVersion;

    @Query
    @NameInMap("Uuid")
    private String uuid;

    @Query
    @NameInMap("UuidList")
    private java.util.List < String > uuidList;


    private InstallBackupClientRequest(Builder builder) {
        super(builder);
        this.policyVersion = builder.policyVersion;
        this.uuid = builder.uuid;
        this.uuidList = builder.uuidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallBackupClientRequest create() {
        return builder().build();
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

    public static final class Builder extends Request.Builder {
        private String policyVersion; 
        private String uuid; 
        private java.util.List < String > uuidList; 

        /**
         * <p>PolicyVersion.</p>
         */
        public Builder policyVersion(String policyVersion) {
            this.putQueryParameter("PolicyVersion", policyVersion);
            this.policyVersion = policyVersion;
            return this;
        }

        /**
         * <p>Uuid.</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        /**
         * <p>UuidList.</p>
         */
        public Builder uuidList(java.util.List < String > uuidList) {
            this.putQueryParameter("UuidList", uuidList);
            this.uuidList = uuidList;
            return this;
        }

        public InstallBackupClientRequest build() {
            return new InstallBackupClientRequest(this);
        } 

    } 

}
