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
         * <p>The list of instance IDs.</p>
         */
        public Builder androidInstanceIds(java.util.List<String> androidInstanceIds) {
            this.putQueryParameter("AndroidInstanceIds", androidInstanceIds);
            this.androidInstanceIds = androidInstanceIds;
            return this;
        }

        /**
         * <p>Specifies whether to force a restart. You can force a restart if a cloud phone cannot be shut down due to system or network exceptions. Unsaved data may be lost.</p>
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
         * <p>Specifies whether to skip parameter validation. A value of true indicates that validation is skipped. If the value is false or not specified, validation is performed.</p>
         */
        public Builder ignoreParamValidation(Boolean ignoreParamValidation) {
            this.putQueryParameter("IgnoreParamValidation", ignoreParamValidation);
            this.ignoreParamValidation = ignoreParamValidation;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> The sales mode.</p>
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
