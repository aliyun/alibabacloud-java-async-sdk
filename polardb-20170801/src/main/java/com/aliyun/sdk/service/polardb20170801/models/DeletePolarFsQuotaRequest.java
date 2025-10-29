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
 * {@link DeletePolarFsQuotaRequest} extends {@link RequestModel}
 *
 * <p>DeletePolarFsQuotaRequest</p>
 */
public class DeletePolarFsQuotaRequest extends Request {
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

    private DeletePolarFsQuotaRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.polarFsInstanceId = builder.polarFsInstanceId;
        this.quotas = builder.quotas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePolarFsQuotaRequest create() {
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

    public static final class Builder extends Request.Builder<DeletePolarFsQuotaRequest, Builder> {
        private String DBClusterId; 
        private String polarFsInstanceId; 
        private java.util.List<Quotas> quotas; 

        private Builder() {
            super();
        } 

        private Builder(DeletePolarFsQuotaRequest request) {
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
        public DeletePolarFsQuotaRequest build() {
            return new DeletePolarFsQuotaRequest(this);
        } 

    } 

    /**
     * 
     * {@link DeletePolarFsQuotaRequest} extends {@link TeaModel}
     *
     * <p>DeletePolarFsQuotaRequest</p>
     */
    public static class Quotas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        private Quotas(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Quotas create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(Quotas model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>73</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>sftest</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Quotas build() {
                return new Quotas(this);
            } 

        } 

    }
}
