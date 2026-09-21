// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link RebootAndroidInstancesInGroupRequest} extends {@link RequestModel}
 *
 * <p>RebootAndroidInstancesInGroupRequest</p>
 */
public class RebootAndroidInstancesInGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidInstanceIds")
    private java.util.List<String> androidInstanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceStop")
    private Boolean forceStop;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IgnoreParamValidation")
    private Boolean ignoreParamValidation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaleMode")
    private String saleMode;

    private RebootAndroidInstancesInGroupRequest(Builder builder) {
        super(builder);
        this.androidInstanceIds = builder.androidInstanceIds;
        this.forceStop = builder.forceStop;
        this.ignoreParamValidation = builder.ignoreParamValidation;
        this.saleMode = builder.saleMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RebootAndroidInstancesInGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return androidInstanceIds
     */
    public java.util.List<String> getAndroidInstanceIds() {
        return this.androidInstanceIds;
    }

    /**
     * @return forceStop
     */
    public Boolean getForceStop() {
        return this.forceStop;
    }

    /**
     * @return ignoreParamValidation
     */
    public Boolean getIgnoreParamValidation() {
        return this.ignoreParamValidation;
    }

    /**
     * @return saleMode
     */
    public String getSaleMode() {
        return this.saleMode;
    }

    public static final class Builder extends Request.Builder<RebootAndroidInstancesInGroupRequest, Builder> {
        private java.util.List<String> androidInstanceIds; 
        private Boolean forceStop; 
        private Boolean ignoreParamValidation; 
        private String saleMode; 

        private Builder() {
            super();
        } 

        private Builder(RebootAndroidInstancesInGroupRequest request) {
            super(request);
            this.androidInstanceIds = request.androidInstanceIds;
            this.forceStop = request.forceStop;
            this.ignoreParamValidation = request.ignoreParamValidation;
            this.saleMode = request.saleMode;
        } 

        /**
         * <p>A list of instance IDs.</p>
         */
        public Builder androidInstanceIds(java.util.List<String> androidInstanceIds) {
            this.putQueryParameter("AndroidInstanceIds", androidInstanceIds);
            this.androidInstanceIds = androidInstanceIds;
            return this;
        }

        /**
         * <p>Specifies whether to forcefully reboot the instances. If a Cloud Phone instance cannot be shut down because of system or network errors, you can force a reboot. This operation may cause data loss.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder forceStop(Boolean forceStop) {
            this.putQueryParameter("ForceStop", forceStop);
            this.forceStop = forceStop;
            return this;
        }

        /**
         * IgnoreParamValidation.
         */
        public Builder ignoreParamValidation(Boolean ignoreParamValidation) {
            this.putQueryParameter("IgnoreParamValidation", ignoreParamValidation);
            this.ignoreParamValidation = ignoreParamValidation;
            return this;
        }

        /**
         * <p>The sales mode. This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance</p>
         */
        public Builder saleMode(String saleMode) {
            this.putQueryParameter("SaleMode", saleMode);
            this.saleMode = saleMode;
            return this;
        }

        @Override
        public RebootAndroidInstancesInGroupRequest build() {
            return new RebootAndroidInstancesInGroupRequest(this);
        } 

    } 

}
