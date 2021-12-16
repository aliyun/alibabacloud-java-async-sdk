// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ServerSideEncryptionRule} extends {@link TeaModel}
 *
 * <p>ServerSideEncryptionRule</p>
 */
public class ServerSideEncryptionRule extends TeaModel {
    @NameInMap("ApplyServerSideEncryptionByDefault")
    private ApplyServerSideEncryptionByDefault applyServerSideEncryptionByDefault;


    private ServerSideEncryptionRule(Builder builder) {
        this.applyServerSideEncryptionByDefault = builder.applyServerSideEncryptionByDefault;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ServerSideEncryptionRule create() {
        return builder().build();
    }

    /**
     * @return applyServerSideEncryptionByDefault
     */
    public ApplyServerSideEncryptionByDefault getApplyServerSideEncryptionByDefault() {
        return this.applyServerSideEncryptionByDefault;
    }

    public static final class Builder {
        private ApplyServerSideEncryptionByDefault applyServerSideEncryptionByDefault; 

        /**
         * <p>ApplyServerSideEncryptionByDefault.</p>
         */
        public Builder applyServerSideEncryptionByDefault(ApplyServerSideEncryptionByDefault applyServerSideEncryptionByDefault) {
            this.applyServerSideEncryptionByDefault = applyServerSideEncryptionByDefault;
            return this;
        }

        public ServerSideEncryptionRule build() {
            return new ServerSideEncryptionRule(this);
        } 

    } 

}
