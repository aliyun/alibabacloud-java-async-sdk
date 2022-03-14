// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyOperateVulRequest} extends {@link RequestModel}
 *
 * <p>ModifyOperateVulRequest</p>
 */
public class ModifyOperateVulRequest extends Request {
    @Query
    @NameInMap("Info")
    @Validation(required = true)
    private String info;

    @Query
    @NameInMap("OperateType")
    @Validation(required = true)
    private String operateType;

    @Query
    @NameInMap("Reason")
    private String reason;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private ModifyOperateVulRequest(Builder builder) {
        super(builder);
        this.info = builder.info;
        this.operateType = builder.operateType;
        this.reason = builder.reason;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyOperateVulRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return info
     */
    public String getInfo() {
        return this.info;
    }

    /**
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ModifyOperateVulRequest, Builder> {
        private String info; 
        private String operateType; 
        private String reason; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ModifyOperateVulRequest request) {
            super(request);
            this.info = request.info;
            this.operateType = request.operateType;
            this.reason = request.reason;
            this.type = request.type;
        } 

        /**
         * Info.
         */
        public Builder info(String info) {
            this.putQueryParameter("Info", info);
            this.info = info;
            return this;
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
         * Reason.
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
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

        @Override
        public ModifyOperateVulRequest build() {
            return new ModifyOperateVulRequest(this);
        } 

    } 

}
