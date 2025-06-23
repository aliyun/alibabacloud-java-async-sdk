// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link ChangeDomainDkimRecordResponseBody} extends {@link TeaModel}
 *
 * <p>ChangeDomainDkimRecordResponseBody</p>
 */
public class ChangeDomainDkimRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Changed")
    private Boolean changed;

    @com.aliyun.core.annotation.NameInMap("DkimPublicKey")
    private String dkimPublicKey;

    @com.aliyun.core.annotation.NameInMap("DkimRsaLength")
    private Integer dkimRsaLength;

    @com.aliyun.core.annotation.NameInMap("Hostname")
    private String hostname;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ChangeDomainDkimRecordResponseBody(Builder builder) {
        this.changed = builder.changed;
        this.dkimPublicKey = builder.dkimPublicKey;
        this.dkimRsaLength = builder.dkimRsaLength;
        this.hostname = builder.hostname;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeDomainDkimRecordResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return changed
     */
    public Boolean getChanged() {
        return this.changed;
    }

    /**
     * @return dkimPublicKey
     */
    public String getDkimPublicKey() {
        return this.dkimPublicKey;
    }

    /**
     * @return dkimRsaLength
     */
    public Integer getDkimRsaLength() {
        return this.dkimRsaLength;
    }

    /**
     * @return hostname
     */
    public String getHostname() {
        return this.hostname;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean changed; 
        private String dkimPublicKey; 
        private Integer dkimRsaLength; 
        private String hostname; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ChangeDomainDkimRecordResponseBody model) {
            this.changed = model.changed;
            this.dkimPublicKey = model.dkimPublicKey;
            this.dkimRsaLength = model.dkimRsaLength;
            this.hostname = model.hostname;
            this.requestId = model.requestId;
        } 

        /**
         * Changed.
         */
        public Builder changed(Boolean changed) {
            this.changed = changed;
            return this;
        }

        /**
         * DkimPublicKey.
         */
        public Builder dkimPublicKey(String dkimPublicKey) {
            this.dkimPublicKey = dkimPublicKey;
            return this;
        }

        /**
         * DkimRsaLength.
         */
        public Builder dkimRsaLength(Integer dkimRsaLength) {
            this.dkimRsaLength = dkimRsaLength;
            return this;
        }

        /**
         * Hostname.
         */
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ChangeDomainDkimRecordResponseBody build() {
            return new ChangeDomainDkimRecordResponseBody(this);
        } 

    } 

}
