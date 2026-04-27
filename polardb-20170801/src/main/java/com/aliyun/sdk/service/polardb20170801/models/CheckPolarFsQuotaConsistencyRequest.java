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
 * {@link CheckPolarFsQuotaConsistencyRequest} extends {@link RequestModel}
 *
 * <p>CheckPolarFsQuotaConsistencyRequest</p>
 */
public class CheckPolarFsQuotaConsistencyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableRepair")
    private Boolean enableRepair;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableStrictCalculate")
    private Boolean enableStrictCalculate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolarFsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String polarFsInstanceId;

    private CheckPolarFsQuotaConsistencyRequest(Builder builder) {
        super(builder);
        this.enableRepair = builder.enableRepair;
        this.enableStrictCalculate = builder.enableStrictCalculate;
        this.path = builder.path;
        this.polarFsInstanceId = builder.polarFsInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckPolarFsQuotaConsistencyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enableRepair
     */
    public Boolean getEnableRepair() {
        return this.enableRepair;
    }

    /**
     * @return enableStrictCalculate
     */
    public Boolean getEnableStrictCalculate() {
        return this.enableStrictCalculate;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return polarFsInstanceId
     */
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public static final class Builder extends Request.Builder<CheckPolarFsQuotaConsistencyRequest, Builder> {
        private Boolean enableRepair; 
        private Boolean enableStrictCalculate; 
        private String path; 
        private String polarFsInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(CheckPolarFsQuotaConsistencyRequest request) {
            super(request);
            this.enableRepair = request.enableRepair;
            this.enableStrictCalculate = request.enableStrictCalculate;
            this.path = request.path;
            this.polarFsInstanceId = request.polarFsInstanceId;
        } 

        /**
         * EnableRepair.
         */
        public Builder enableRepair(Boolean enableRepair) {
            this.putQueryParameter("EnableRepair", enableRepair);
            this.enableRepair = enableRepair;
            return this;
        }

        /**
         * EnableStrictCalculate.
         */
        public Builder enableStrictCalculate(Boolean enableStrictCalculate) {
            this.putQueryParameter("EnableStrictCalculate", enableStrictCalculate);
            this.enableStrictCalculate = enableStrictCalculate;
            return this;
        }

        /**
         * Path.
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pfs-test****</p>
         */
        public Builder polarFsInstanceId(String polarFsInstanceId) {
            this.putQueryParameter("PolarFsInstanceId", polarFsInstanceId);
            this.polarFsInstanceId = polarFsInstanceId;
            return this;
        }

        @Override
        public CheckPolarFsQuotaConsistencyRequest build() {
            return new CheckPolarFsQuotaConsistencyRequest(this);
        } 

    } 

}
