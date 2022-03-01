// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateVulsRequest} extends {@link RequestModel}
 *
 * <p>OperateVulsRequest</p>
 */
public class OperateVulsRequest extends Request {
    @Query
    @NameInMap("OperateType")
    @Validation(required = true)
    private String operateType;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    @Query
    @NameInMap("Uuids")
    @Validation(required = true)
    private java.util.List < String > uuids;

    @Query
    @NameInMap("VulNames")
    @Validation(required = true)
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

        private Builder(OperateVulsRequest response) {
            super(response);
            this.operateType = response.operateType;
            this.type = response.type;
            this.uuids = response.uuids;
            this.vulNames = response.vulNames;
        } 

        /**
         * OperateType.
         */
        public Builder operateType(String operateType) {
            this.putQueryParameter("OperateType", operateType);
            this.operateType = operateType;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * Uuids.
         */
        public Builder uuids(java.util.List < String > uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        /**
         * VulNames.
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
