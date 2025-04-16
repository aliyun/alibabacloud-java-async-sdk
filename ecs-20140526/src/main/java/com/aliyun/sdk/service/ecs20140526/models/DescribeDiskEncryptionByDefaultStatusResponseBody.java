// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeDiskEncryptionByDefaultStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiskEncryptionByDefaultStatusResponseBody</p>
 */
public class DescribeDiskEncryptionByDefaultStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Encrypted")
    private Boolean encrypted;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDiskEncryptionByDefaultStatusResponseBody(Builder builder) {
        this.encrypted = builder.encrypted;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiskEncryptionByDefaultStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return encrypted
     */
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean encrypted; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDiskEncryptionByDefaultStatusResponseBody model) {
            this.encrypted = model.encrypted;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether account-level default encryption of EBS resources is enabled in the region. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder encrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDiskEncryptionByDefaultStatusResponseBody build() {
            return new DescribeDiskEncryptionByDefaultStatusResponseBody(this);
        } 

    } 

}
