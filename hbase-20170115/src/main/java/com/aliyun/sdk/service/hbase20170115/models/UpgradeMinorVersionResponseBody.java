// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20170115.models;

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
 * {@link UpgradeMinorVersionResponseBody} extends {@link TeaModel}
 *
 * <p>UpgradeMinorVersionResponseBody</p>
 */
public class UpgradeMinorVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NewVersion")
    private String newVersion;

    @com.aliyun.core.annotation.NameInMap("OldVersion")
    private String oldVersion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpgradeMinorVersionResponseBody(Builder builder) {
        this.newVersion = builder.newVersion;
        this.oldVersion = builder.oldVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeMinorVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return newVersion
     */
    public String getNewVersion() {
        return this.newVersion;
    }

    /**
     * @return oldVersion
     */
    public String getOldVersion() {
        return this.oldVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String newVersion; 
        private String oldVersion; 
        private String requestId; 

        /**
         * NewVersion.
         */
        public Builder newVersion(String newVersion) {
            this.newVersion = newVersion;
            return this;
        }

        /**
         * OldVersion.
         */
        public Builder oldVersion(String oldVersion) {
            this.oldVersion = oldVersion;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpgradeMinorVersionResponseBody build() {
            return new UpgradeMinorVersionResponseBody(this);
        } 

    } 

}
