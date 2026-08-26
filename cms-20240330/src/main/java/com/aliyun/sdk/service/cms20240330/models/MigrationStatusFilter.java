// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link MigrationStatusFilter} extends {@link TeaModel}
 *
 * <p>MigrationStatusFilter</p>
 */
public class MigrationStatusFilter extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("isMigrated")
    private Boolean isMigrated;

    private MigrationStatusFilter(Builder builder) {
        this.isMigrated = builder.isMigrated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MigrationStatusFilter create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isMigrated
     */
    public Boolean getIsMigrated() {
        return this.isMigrated;
    }

    public static final class Builder {
        private Boolean isMigrated; 

        private Builder() {
        } 

        private Builder(MigrationStatusFilter model) {
            this.isMigrated = model.isMigrated;
        } 

        /**
         * isMigrated.
         */
        public Builder isMigrated(Boolean isMigrated) {
            this.isMigrated = isMigrated;
            return this;
        }

        public MigrationStatusFilter build() {
            return new MigrationStatusFilter(this);
        } 

    } 

}
