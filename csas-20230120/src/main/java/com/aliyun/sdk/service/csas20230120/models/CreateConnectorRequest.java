// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link CreateConnectorRequest} extends {@link RequestModel}
 *
 * <p>CreateConnectorRequest</p>
 */
public class CreateConnectorRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Integer bandwidth;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SwitchStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String switchStatus;

    private CreateConnectorRequest(Builder builder) {
        super(builder);
        this.bandwidth = builder.bandwidth;
        this.name = builder.name;
        this.region = builder.region;
        this.switchStatus = builder.switchStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConnectorRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return switchStatus
     */
    public String getSwitchStatus() {
        return this.switchStatus;
    }

    public static final class Builder extends Request.Builder<CreateConnectorRequest, Builder> {
        private Integer bandwidth; 
        private String name; 
        private String region; 
        private String switchStatus; 

        private Builder() {
            super();
        } 

        private Builder(CreateConnectorRequest request) {
            super(request);
            this.bandwidth = request.bandwidth;
            this.name = request.name;
            this.region = request.region;
            this.switchStatus = request.switchStatus;
        } 

        /**
         * Bandwidth.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putBodyParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>auto-dr-connector-cq-dl3e4j</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.putBodyParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder switchStatus(String switchStatus) {
            this.putBodyParameter("SwitchStatus", switchStatus);
            this.switchStatus = switchStatus;
            return this;
        }

        @Override
        public CreateConnectorRequest build() {
            return new CreateConnectorRequest(this);
        } 

    } 

}
