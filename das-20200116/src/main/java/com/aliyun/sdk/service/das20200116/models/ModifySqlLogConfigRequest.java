// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link ModifySqlLogConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifySqlLogConfigRequest</p>
 */
public class ModifySqlLogConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableAudit")
    private Boolean enableAudit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filters")
    private java.util.List<Filters> filters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotRetention")
    private Integer hotRetention;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RequestEnable")
    private Boolean requestEnable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Retention")
    private Integer retention;

    private ModifySqlLogConfigRequest(Builder builder) {
        super(builder);
        this.enable = builder.enable;
        this.enableAudit = builder.enableAudit;
        this.filters = builder.filters;
        this.hotRetention = builder.hotRetention;
        this.instanceId = builder.instanceId;
        this.requestEnable = builder.requestEnable;
        this.retention = builder.retention;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySqlLogConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return enableAudit
     */
    public Boolean getEnableAudit() {
        return this.enableAudit;
    }

    /**
     * @return filters
     */
    public java.util.List<Filters> getFilters() {
        return this.filters;
    }

    /**
     * @return hotRetention
     */
    public Integer getHotRetention() {
        return this.hotRetention;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return requestEnable
     */
    public Boolean getRequestEnable() {
        return this.requestEnable;
    }

    /**
     * @return retention
     */
    public Integer getRetention() {
        return this.retention;
    }

    public static final class Builder extends Request.Builder<ModifySqlLogConfigRequest, Builder> {
        private Boolean enable; 
        private Boolean enableAudit; 
        private java.util.List<Filters> filters; 
        private Integer hotRetention; 
        private String instanceId; 
        private Boolean requestEnable; 
        private Integer retention; 

        private Builder() {
            super();
        } 

        private Builder(ModifySqlLogConfigRequest request) {
            super(request);
            this.enable = request.enable;
            this.enableAudit = request.enableAudit;
            this.filters = request.filters;
            this.hotRetention = request.hotRetention;
            this.instanceId = request.instanceId;
            this.requestEnable = request.requestEnable;
            this.retention = request.retention;
        } 

        /**
         * <p>Specifies whether to enable DAS Enterprise Edition. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p> This parameter is required if you want to enable DAS Enterprise Edition. By default, the latest version of DAS Enterprise Edition that supports the database instance is enabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(Boolean enable) {
            this.putBodyParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * EnableAudit.
         */
        public Builder enableAudit(Boolean enableAudit) {
            this.putQueryParameter("EnableAudit", enableAudit);
            this.enableAudit = enableAudit;
            return this;
        }

        /**
         * <p>A reserved parameter.</p>
         */
        public Builder filters(java.util.List<Filters> filters) {
            this.putQueryParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * <p>The number of days for which the SQL Explorer and Audit data is stored in hot storage. Valid values: 1 to 7.</p>
         * <blockquote>
         * <p> This parameter is required if only DAS Enterprise Edition V3 can be enabled for the database instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder hotRetention(Integer hotRetention) {
            this.putBodyParameter("HotRetention", hotRetention);
            this.hotRetention = hotRetention;
            return this;
        }

        /**
         * <p>The ID of the database instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rr-2ze770smbq3tpr2o9</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the SQL Explorer feature. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p> This parameter is required if only DAS Enterprise Edition V3 can be enabled for the database instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder requestEnable(Boolean requestEnable) {
            this.putBodyParameter("RequestEnable", requestEnable);
            this.requestEnable = requestEnable;
            return this;
        }

        /**
         * <p>The total storage duration of the SQL Explorer and Audit data. Unit: day. Valid values:</p>
         * <ul>
         * <li>7</li>
         * <li>30</li>
         * <li>180</li>
         * <li>365</li>
         * </ul>
         * <blockquote>
         * <p> If you want to enable DAS Enterprise Edition V3, the value of this parameter must be greater than or equal to 30.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder retention(Integer retention) {
            this.putBodyParameter("Retention", retention);
            this.retention = retention;
            return this;
        }

        @Override
        public ModifySqlLogConfigRequest build() {
            return new ModifySqlLogConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifySqlLogConfigRequest} extends {@link TeaModel}
     *
     * <p>ModifySqlLogConfigRequest</p>
     */
    public static class Filters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Filters(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filters create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Filters model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Filters build() {
                return new Filters(this);
            } 

        } 

    }
}
