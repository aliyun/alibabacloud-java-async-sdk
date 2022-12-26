// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateImageVulRequest} extends {@link RequestModel}
 *
 * <p>OperateImageVulRequest</p>
 */
public class OperateImageVulRequest extends Request {
    @Query
    @NameInMap("Info")
    private String info;

    @Query
    @NameInMap("OperateType")
    private String operateType;

    @Query
    @NameInMap("Type")
    private String type;

    private OperateImageVulRequest(Builder builder) {
        super(builder);
        this.info = builder.info;
        this.operateType = builder.operateType;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateImageVulRequest create() {
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<OperateImageVulRequest, Builder> {
        private String info; 
        private String operateType; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(OperateImageVulRequest request) {
            super(request);
            this.info = request.info;
            this.operateType = request.operateType;
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
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public OperateImageVulRequest build() {
            return new OperateImageVulRequest(this);
        } 

    } 

}
