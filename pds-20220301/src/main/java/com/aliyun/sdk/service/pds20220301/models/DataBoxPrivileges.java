// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link DataBoxPrivileges} extends {@link TeaModel}
 *
 * <p>DataBoxPrivileges</p>
 */
public class DataBoxPrivileges extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("feature_attr_id")
    private String featureAttrId;

    @com.aliyun.core.annotation.NameInMap("feature_id")
    private String featureId;

    @com.aliyun.core.annotation.NameInMap("quota")
    private Long quota;

    private DataBoxPrivileges(Builder builder) {
        this.featureAttrId = builder.featureAttrId;
        this.featureId = builder.featureId;
        this.quota = builder.quota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataBoxPrivileges create() {
        return builder().build();
    }

    /**
     * @return featureAttrId
     */
    public String getFeatureAttrId() {
        return this.featureAttrId;
    }

    /**
     * @return featureId
     */
    public String getFeatureId() {
        return this.featureId;
    }

    /**
     * @return quota
     */
    public Long getQuota() {
        return this.quota;
    }

    public static final class Builder {
        private String featureAttrId; 
        private String featureId; 
        private Long quota; 

        /**
         * feature_attr_id.
         */
        public Builder featureAttrId(String featureAttrId) {
            this.featureAttrId = featureAttrId;
            return this;
        }

        /**
         * feature_id.
         */
        public Builder featureId(String featureId) {
            this.featureId = featureId;
            return this;
        }

        /**
         * quota.
         */
        public Builder quota(Long quota) {
            this.quota = quota;
            return this;
        }

        public DataBoxPrivileges build() {
            return new DataBoxPrivileges(this);
        } 

    } 

}
