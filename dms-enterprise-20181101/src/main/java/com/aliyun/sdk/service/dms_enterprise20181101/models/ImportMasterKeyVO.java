// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ImportMasterKeyVO} extends {@link TeaModel}
 *
 * <p>ImportMasterKeyVO</p>
 */
public class ImportMasterKeyVO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EncryptMekDataBase64")
    private String encryptMekDataBase64;

    @com.aliyun.core.annotation.NameInMap("MekId")
    private Long mekId;

    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private java.util.List<Long> projectId;

    private ImportMasterKeyVO(Builder builder) {
        this.encryptMekDataBase64 = builder.encryptMekDataBase64;
        this.mekId = builder.mekId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportMasterKeyVO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return encryptMekDataBase64
     */
    public String getEncryptMekDataBase64() {
        return this.encryptMekDataBase64;
    }

    /**
     * @return mekId
     */
    public Long getMekId() {
        return this.mekId;
    }

    /**
     * @return projectId
     */
    public java.util.List<Long> getProjectId() {
        return this.projectId;
    }

    public static final class Builder {
        private String encryptMekDataBase64; 
        private Long mekId; 
        private java.util.List<Long> projectId; 

        private Builder() {
        } 

        private Builder(ImportMasterKeyVO model) {
            this.encryptMekDataBase64 = model.encryptMekDataBase64;
            this.mekId = model.mekId;
            this.projectId = model.projectId;
        } 

        /**
         * EncryptMekDataBase64.
         */
        public Builder encryptMekDataBase64(String encryptMekDataBase64) {
            this.encryptMekDataBase64 = encryptMekDataBase64;
            return this;
        }

        /**
         * MekId.
         */
        public Builder mekId(Long mekId) {
            this.mekId = mekId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(java.util.List<Long> projectId) {
            this.projectId = projectId;
            return this;
        }

        public ImportMasterKeyVO build() {
            return new ImportMasterKeyVO(this);
        } 

    } 

}
