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
 * {@link DatasourceConfigUnified} extends {@link TeaModel}
 *
 * <p>DatasourceConfigUnified</p>
 */
public class DatasourceConfigUnified extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private DatasourceConfigUnified(Builder builder) {
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DatasourceConfigUnified create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String instanceId; 
        private String regionId; 
        private String type; 

        private Builder() {
        } 

        private Builder(DatasourceConfigUnified model) {
            this.instanceId = model.instanceId;
            this.regionId = model.regionId;
            this.type = model.type;
        } 

        /**
         * <p>Prometheus 实例 ID（type=PROMETHEUS 时使用）</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>地域 ID（各类型可选，缺省与规则/网关一致）</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>数据源类型</p>
         * <p>This parameter is required.</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DatasourceConfigUnified build() {
            return new DatasourceConfigUnified(this);
        } 

    } 

}
