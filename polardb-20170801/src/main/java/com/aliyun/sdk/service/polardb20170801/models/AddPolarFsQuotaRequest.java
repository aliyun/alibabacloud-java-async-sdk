// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link AddPolarFsQuotaRequest} extends {@link RequestModel}
 *
 * <p>AddPolarFsQuotaRequest</p>
 */
public class AddPolarFsQuotaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolarFsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String polarFsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Quotas")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Quotas> quotas;

    private AddPolarFsQuotaRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.polarFsInstanceId = builder.polarFsInstanceId;
        this.quotas = builder.quotas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddPolarFsQuotaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return polarFsInstanceId
     */
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    /**
     * @return quotas
     */
    public java.util.List<Quotas> getQuotas() {
        return this.quotas;
    }

    public static final class Builder extends Request.Builder<AddPolarFsQuotaRequest, Builder> {
        private String DBClusterId; 
        private String polarFsInstanceId; 
        private java.util.List<Quotas> quotas; 

        private Builder() {
            super();
        } 

        private Builder(AddPolarFsQuotaRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.polarFsInstanceId = request.polarFsInstanceId;
            this.quotas = request.quotas;
        } 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pfs-2ze0i74ka607*****</p>
         */
        public Builder polarFsInstanceId(String polarFsInstanceId) {
            this.putQueryParameter("PolarFsInstanceId", polarFsInstanceId);
            this.polarFsInstanceId = polarFsInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder quotas(java.util.List<Quotas> quotas) {
            this.putQueryParameter("Quotas", quotas);
            this.quotas = quotas;
            return this;
        }

        @Override
        public AddPolarFsQuotaRequest build() {
            return new AddPolarFsQuotaRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddPolarFsQuotaRequest} extends {@link TeaModel}
     *
     * <p>AddPolarFsQuotaRequest</p>
     */
    public static class Quotas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessTTL")
        private Long accessTTL;

        @com.aliyun.core.annotation.NameInMap("ChangeTTL")
        private Long changeTTL;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Exclude")
        private String exclude;

        @com.aliyun.core.annotation.NameInMap("FileCountLimit")
        private Long fileCountLimit;

        @com.aliyun.core.annotation.NameInMap("Include")
        @com.aliyun.core.annotation.Validation(required = true)
        private String include;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("SizeLimit")
        private Long sizeLimit;

        private Quotas(Builder builder) {
            this.accessTTL = builder.accessTTL;
            this.changeTTL = builder.changeTTL;
            this.description = builder.description;
            this.enabled = builder.enabled;
            this.exclude = builder.exclude;
            this.fileCountLimit = builder.fileCountLimit;
            this.include = builder.include;
            this.name = builder.name;
            this.priority = builder.priority;
            this.sizeLimit = builder.sizeLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Quotas create() {
            return builder().build();
        }

        /**
         * @return accessTTL
         */
        public Long getAccessTTL() {
            return this.accessTTL;
        }

        /**
         * @return changeTTL
         */
        public Long getChangeTTL() {
            return this.changeTTL;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return exclude
         */
        public String getExclude() {
            return this.exclude;
        }

        /**
         * @return fileCountLimit
         */
        public Long getFileCountLimit() {
            return this.fileCountLimit;
        }

        /**
         * @return include
         */
        public String getInclude() {
            return this.include;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return sizeLimit
         */
        public Long getSizeLimit() {
            return this.sizeLimit;
        }

        public static final class Builder {
            private Long accessTTL; 
            private Long changeTTL; 
            private String description; 
            private Boolean enabled; 
            private String exclude; 
            private Long fileCountLimit; 
            private String include; 
            private String name; 
            private Integer priority; 
            private Long sizeLimit; 

            private Builder() {
            } 

            private Builder(Quotas model) {
                this.accessTTL = model.accessTTL;
                this.changeTTL = model.changeTTL;
                this.description = model.description;
                this.enabled = model.enabled;
                this.exclude = model.exclude;
                this.fileCountLimit = model.fileCountLimit;
                this.include = model.include;
                this.name = model.name;
                this.priority = model.priority;
                this.sizeLimit = model.sizeLimit;
            } 

            /**
             * AccessTTL.
             */
            public Builder accessTTL(Long accessTTL) {
                this.accessTTL = accessTTL;
                return this;
            }

            /**
             * ChangeTTL.
             */
            public Builder changeTTL(Long changeTTL) {
                this.changeTTL = changeTTL;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * Exclude.
             */
            public Builder exclude(String exclude) {
                this.exclude = exclude;
                return this;
            }

            /**
             * FileCountLimit.
             */
            public Builder fileCountLimit(Long fileCountLimit) {
                this.fileCountLimit = fileCountLimit;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>/b/<em>project</em></p>
             */
            public Builder include(String include) {
                this.include = include;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>rule1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * SizeLimit.
             */
            public Builder sizeLimit(Long sizeLimit) {
                this.sizeLimit = sizeLimit;
                return this;
            }

            public Quotas build() {
                return new Quotas(this);
            } 

        } 

    }
}
