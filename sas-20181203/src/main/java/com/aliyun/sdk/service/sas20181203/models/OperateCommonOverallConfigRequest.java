// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateCommonOverallConfigRequest} extends {@link RequestModel}
 *
 * <p>OperateCommonOverallConfigRequest</p>
 */
public class OperateCommonOverallConfigRequest extends Request {
    @Query
    @NameInMap("Config")
    @Validation(required = true)
    private String config;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private OperateCommonOverallConfigRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.sourceIp = builder.sourceIp;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateCommonOverallConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<OperateCommonOverallConfigRequest, Builder> {
        private String config; 
        private String sourceIp; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(OperateCommonOverallConfigRequest request) {
            super(request);
            this.config = request.config;
            this.sourceIp = request.sourceIp;
            this.type = request.type;
        } 

        /**
         * Config.
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
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
        public OperateCommonOverallConfigRequest build() {
            return new OperateCommonOverallConfigRequest(this);
        } 

    } 

}
