// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link DataInstancesValue} extends {@link TeaModel}
 *
 * <p>DataInstancesValue</p>
 */
public class DataInstancesValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DnsName")
    private String dnsName;

    @com.aliyun.core.annotation.NameInMap("Listeners")
    private java.util.Map<String, DataInstancesValueListenersValue> listeners;

    @com.aliyun.core.annotation.NameInMap("CreatedBySae")
    private Boolean createdBySae;

    private DataInstancesValue(Builder builder) {
        this.dnsName = builder.dnsName;
        this.listeners = builder.listeners;
        this.createdBySae = builder.createdBySae;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataInstancesValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dnsName
     */
    public String getDnsName() {
        return this.dnsName;
    }

    /**
     * @return listeners
     */
    public java.util.Map<String, DataInstancesValueListenersValue> getListeners() {
        return this.listeners;
    }

    /**
     * @return createdBySae
     */
    public Boolean getCreatedBySae() {
        return this.createdBySae;
    }

    public static final class Builder {
        private String dnsName; 
        private java.util.Map<String, DataInstancesValueListenersValue> listeners; 
        private Boolean createdBySae; 

        private Builder() {
        } 

        private Builder(DataInstancesValue model) {
            this.dnsName = model.dnsName;
            this.listeners = model.listeners;
            this.createdBySae = model.createdBySae;
        } 

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>nlb-wb7r6dlwetvt5j****.cn-hangzhou.nlb.aliyuncs.com</p>
         */
        public Builder dnsName(String dnsName) {
            this.dnsName = dnsName;
            return this;
        }

        /**
         * <p>The listeners.</p>
         */
        public Builder listeners(java.util.Map<String, DataInstancesValueListenersValue> listeners) {
            this.listeners = listeners;
            return this;
        }

        /**
         * <p>Indicates whether the instance is created by SAE.</p>
         * <ul>
         * <li><strong>true</strong>: The instance is created by SAE.</li>
         * <li><strong>false</strong>: The existing instance is reused.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder createdBySae(Boolean createdBySae) {
            this.createdBySae = createdBySae;
            return this;
        }

        public DataInstancesValue build() {
            return new DataInstancesValue(this);
        } 

    } 

}
