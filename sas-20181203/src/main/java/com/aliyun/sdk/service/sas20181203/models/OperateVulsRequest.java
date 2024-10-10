// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OperateVulsRequest} extends {@link RequestModel}
 *
 * <p>OperateVulsRequest</p>
 */
public class OperateVulsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperateType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > uuids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VulNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > vulNames;

    private OperateVulsRequest(Builder builder) {
        super(builder);
        this.operateType = builder.operateType;
        this.type = builder.type;
        this.uuids = builder.uuids;
        this.vulNames = builder.vulNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateVulsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return uuids
     */
    public java.util.List < String > getUuids() {
        return this.uuids;
    }

    /**
     * @return vulNames
     */
    public java.util.List < String > getVulNames() {
        return this.vulNames;
    }

    public static final class Builder extends Request.Builder<OperateVulsRequest, Builder> {
        private String operateType; 
        private String type; 
        private java.util.List < String > uuids; 
        private java.util.List < String > vulNames; 

        private Builder() {
            super();
        } 

        private Builder(OperateVulsRequest request) {
            super(request);
            this.operateType = request.operateType;
            this.type = request.type;
            this.uuids = request.uuids;
            this.vulNames = request.vulNames;
        } 

        /**
         * <p>The operation on the vulnerabilities. Set the value to <strong>vul_fix</strong>, which indicates vulnerability fixing.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vul_fix</p>
         */
        public Builder operateType(String operateType) {
            this.putQueryParameter("OperateType", operateType);
            this.operateType = operateType;
            return this;
        }

        /**
         * <p>The type of the vulnerabilities that you want to fix. Set the value to <strong>cve</strong>, which indicates Linux software vulnerabilities.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cve</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The UUIDs of servers for which you want to fix vulnerabilities.</p>
         * <p>This parameter is required.</p>
         */
        public Builder uuids(java.util.List < String > uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        /**
         * <p>The names of the vulnerabilities that you want to fix.</p>
         * <p>This parameter is required.</p>
         */
        public Builder vulNames(java.util.List < String > vulNames) {
            this.putQueryParameter("VulNames", vulNames);
            this.vulNames = vulNames;
            return this;
        }

        @Override
        public OperateVulsRequest build() {
            return new OperateVulsRequest(this);
        } 

    } 

}
