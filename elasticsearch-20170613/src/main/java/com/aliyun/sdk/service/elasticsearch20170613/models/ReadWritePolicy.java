// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link ReadWritePolicy} extends {@link TeaModel}
 *
 * <p>ReadWritePolicy</p>
 */
public class ReadWritePolicy extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("autoGeneratePk")
    private Boolean autoGeneratePk;

    @com.aliyun.core.annotation.NameInMap("writeHa")
    private Boolean writeHa;

    @com.aliyun.core.annotation.NameInMap("writePolicy")
    private String writePolicy;

    private ReadWritePolicy(Builder builder) {
        this.autoGeneratePk = builder.autoGeneratePk;
        this.writeHa = builder.writeHa;
        this.writePolicy = builder.writePolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReadWritePolicy create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoGeneratePk
     */
    public Boolean getAutoGeneratePk() {
        return this.autoGeneratePk;
    }

    /**
     * @return writeHa
     */
    public Boolean getWriteHa() {
        return this.writeHa;
    }

    /**
     * @return writePolicy
     */
    public String getWritePolicy() {
        return this.writePolicy;
    }

    public static final class Builder {
        private Boolean autoGeneratePk; 
        private Boolean writeHa; 
        private String writePolicy; 

        private Builder() {
        } 

        private Builder(ReadWritePolicy model) {
            this.autoGeneratePk = model.autoGeneratePk;
            this.writeHa = model.writeHa;
            this.writePolicy = model.writePolicy;
        } 

        /**
         * <p>Specifies whether to automatically generate a document hash primary key when no primary key exists. Valid values:</p>
         * <ul>
         * <li>true (default): automatically generates a primary key.</li>
         * <li>false: does not automatically generate a primary key.</li>
         * </ul>
         * <blockquote>
         * <p>Notice:  autoGeneratePk cannot be modified independently. The autoGeneratePk setting takes effect only when writeHa is changed from false to true.
         * .</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoGeneratePk(Boolean autoGeneratePk) {
            this.autoGeneratePk = autoGeneratePk;
            return this;
        }

        /**
         * <p>Specifies whether to enable the write high-availability feature. Valid values:</p>
         * <ul>
         * <li>true: enabled.</li>
         * <li>false: not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder writeHa(Boolean writeHa) {
            this.writeHa = writeHa;
            return this;
        }

        /**
         * <p>Temporarily switches between synchronous and asynchronous high availability. Valid values:</p>
         * <ul>
         * <li>sync: temporarily switches from asynchronous write high availability to synchronous write.</li>
         * <li>async: restores asynchronous write high availability after synchronous write is temporarily enabled.</li>
         * </ul>
         * <blockquote>
         * <p>This field takes effect only when high availability is enabled, that is, writeHa is set to true. You do not need to pass in the writeHa field when setting this field.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sync</p>
         */
        public Builder writePolicy(String writePolicy) {
            this.writePolicy = writePolicy;
            return this;
        }

        public ReadWritePolicy build() {
            return new ReadWritePolicy(this);
        } 

    } 

}
