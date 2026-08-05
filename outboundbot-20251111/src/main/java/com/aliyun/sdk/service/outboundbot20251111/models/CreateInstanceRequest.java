// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20251111.models;

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
 * {@link CreateInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceRequest</p>
 */
public class CreateInstanceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Concurrency")
    private Integer concurrency;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceMode")
    private String serviceMode;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.concurrency = builder.concurrency;
        this.description = builder.description;
        this.name = builder.name;
        this.serviceMode = builder.serviceMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return concurrency
     */
    public Integer getConcurrency() {
        return this.concurrency;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return serviceMode
     */
    public String getServiceMode() {
        return this.serviceMode;
    }

    public static final class Builder extends Request.Builder<CreateInstanceRequest, Builder> {
        private Integer concurrency; 
        private String description; 
        private String name; 
        private String serviceMode; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceRequest request) {
            super(request);
            this.concurrency = request.concurrency;
            this.description = request.description;
            this.name = request.name;
            this.serviceMode = request.serviceMode;
        } 

        /**
         * <p>实例并发数，最小值0。与该租户下已有实例并发数之和不得超过已购买的并发配额</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder concurrency(Integer concurrency) {
            this.putBodyParameter("Concurrency", concurrency);
            this.concurrency = concurrency;
            return this;
        }

        /**
         * <p>实例描述，最大长度255个字符</p>
         * 
         * <strong>example:</strong>
         * <p>用于电销场景的智能外呼实例</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>实例名称，最大长度32个字符</p>
         * 
         * <strong>example:</strong>
         * <p>智能外呼实例</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>服务模式，最大长度32个字符。INTEGRATED：集成模式，创建实例时同步创建晓蜜业务空间；STANDARD：标准模式</p>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        public Builder serviceMode(String serviceMode) {
            this.putBodyParameter("ServiceMode", serviceMode);
            this.serviceMode = serviceMode;
            return this;
        }

        @Override
        public CreateInstanceRequest build() {
            return new CreateInstanceRequest(this);
        } 

    } 

}
